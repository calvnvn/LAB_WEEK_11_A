package com.example.lab_week_11_a

import android.app.Application
import android.content.Context

class PreferenceApplication : Application() {
    lateinit var preferenceWrapper: PreferenceWrapper

    override fun onCreate() {
        super.onCreate()
        // Initialize the preference wrapper [cite: 117]
        preferenceWrapper = PreferenceWrapper(
            // Get the shared preferences [cite: 120]
            getSharedPreferences(
                "prefs", // The name of the file [cite: 125, 127]
                Context.MODE_PRIVATE // MODE_PRIVATE means only this app can access the file [cite: 131, 133]
            )
        )
    }
}