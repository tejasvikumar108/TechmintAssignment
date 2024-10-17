package com.example.assignment.data.model

import com.google.gson.annotations.SerializedName

data class RepoSearchResponse(
    @SerializedName("items")
    val items: List<Repository> // This maps to the repositories list
)
