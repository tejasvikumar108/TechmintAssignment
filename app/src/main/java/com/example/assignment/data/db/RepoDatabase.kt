package com.example.assignment.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.assignment.data.model.Repository

@Database(entities = [Repository::class], version = 1)
abstract class RepoDatabase : RoomDatabase() {
    abstract fun repoDao(): RepoDao
}
