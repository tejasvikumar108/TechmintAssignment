package com.example.assignment.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import com.example.assignment.data.model.Repository
import com.example.assignment.data.model.Owner
import com.example.assignment.data.model.RepositoryWithOwner

@Dao
interface RepoDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRepositories(repositories: List<Repository>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOwners(owners: List<Owner>)

    @Transaction
    @Query("SELECT * FROM repositories")
    suspend fun getRepositoriesWithOwners(): List<RepositoryWithOwner>
}
