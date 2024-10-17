package com.example.assignment.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "owners")
data class Owner(
    @PrimaryKey val id: Int,
    val login: String,
    val avatar_url: String
)
