package com.example.assignment.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.assignment.data.db.RepoDao
import com.example.assignment.data.api.GitHubService
import kotlinx.coroutines.Dispatchers
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RepoViewModel(private val repoDao: RepoDao) : ViewModel() {

    private val api = Retrofit.Builder()
        .baseUrl("https://api.github.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(GitHubService::class.java)

    fun searchRepositories(query: String) = liveData(Dispatchers.IO) {
        val response = api.searchRepositories(query).execute()
        if (response.isSuccessful) {
            val repos = response.body()?.items ?: emptyList()
            repoDao.insertRepositories(repos)
            emit(repoDao.getRepositoriesWithOwners())
        } else {
            emit(emptyList())
        }
    }
}
