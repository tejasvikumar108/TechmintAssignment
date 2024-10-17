package com.example.assignment

import android.app.Application
import androidx.room.Room
import com.example.assignment.data.db.AppDatabase

class GithubSearchApp : Application() {
    lateinit var database: AppDatabase
        private set

    override fun onCreate() {
        super.onCreate()

        // Initialize the Room database
        database = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "github-search.db"
        ).build()
    }
}
