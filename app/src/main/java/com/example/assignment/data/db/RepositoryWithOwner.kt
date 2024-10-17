package com.example.assignment.data.model

import androidx.room.Embedded
import androidx.room.Relation

data class RepositoryWithOwner(
    @Embedded val repository: Repository,

    @Relation(
        parentColumn = "ownerId",
        entityColumn = "id"
    )
    val owner: Owner
)
