package com.example.assignment.ui.details

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.assignment.databinding.ActivityRepoDetailsBinding

class RepoDetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRepoDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRepoDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Fetch repository details and display them
    }
}
