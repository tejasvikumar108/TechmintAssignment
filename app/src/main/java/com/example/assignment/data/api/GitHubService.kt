package com.example.assignment.data.api

import com.example.assignment.data.model.RepoSearchResponse
import retrofit2.http.GET
import retrofit2.http.Query
import com.example.assignment.data.model.Repository
import retrofit2.Call

interface GitHubService {
    @GET("search/repositories")
    fun searchRepositories(
        @Query("q") query: String,
        @Query("per_page") perPage: Int = 10,
        @Query("page") page: Int = 1
    ): Call<RepoSearchResponse>
}
