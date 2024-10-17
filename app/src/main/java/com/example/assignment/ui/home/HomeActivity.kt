package com.example.assignment.ui.home

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.assignment.GithubSearchApp
import com.example.assignment.data.model.RepositoryWithOwner
import com.example.assignment.databinding.ActivityHomeBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Access the Room database via the application context
        val database = (application as GithubSearchApp).database

        // Fetch repositories and update the UI
        lifecycleScope.launch(Dispatchers.IO) {
            val reposWithOwners: List<RepositoryWithOwner> = database.repoDao().getRepositoriesWithOwners()

            launch(Dispatchers.Main) {
                // Handle the UI update here
            }
        }

    }
}
