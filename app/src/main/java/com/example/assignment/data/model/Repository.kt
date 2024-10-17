package com.example.assignment.data.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "repositories",
    foreignKeys = [ForeignKey(
        entity = Owner::class,
        parentColumns = ["id"],
        childColumns = ["ownerId"],
        onDelete = ForeignKey.CASCADE
    )]
)
data class Repository(
    @PrimaryKey val id: Int,
    val name: String,
    val description: String?,
    val html_url: String,
    val ownerId: Int
)
