package com.example.lab_week_11_a

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class PreferenceViewModel(private val preferenceWrapper: PreferenceWrapper) : ViewModel() {

    // Save the text to the shared preferences [cite: 140]
    fun saveText(text: String) {
        preferenceWrapper.saveText(text)
    }

    // Get the text from the shared preferences [cite: 144]
    fun getText(): LiveData<String> {
        return preferenceWrapper.getText()
    }
}