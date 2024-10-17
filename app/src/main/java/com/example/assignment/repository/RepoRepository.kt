package com.example.assignment.repository

import com.example.assignment.data.api.GitHubService
import com.example.assignment.data.db.RepoDao
import com.example.assignment.data.model.Repository

class RepoRepository(
    private val api: GitHubService,
    private val repoDao: RepoDao
) {

    suspend fun searchRepositories(query: String, page: Int): List<Repository> {
        return api.searchRepositories(query, perPage = 10, page = page).items
    }

    suspend fun saveRepositories(repositories: List<Repository>) {
        repoDao.insertAll(repositories)
    }

    suspend fun getSavedRepositories(): List<Repository> {
        return repoDao.getAllRepositories()
    }
}
