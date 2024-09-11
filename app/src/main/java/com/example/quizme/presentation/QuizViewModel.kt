package com.example.quizme.presentation

import androidx.lifecycle.ViewModel
import com.example.quizme.data.allWords
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class QuizViewModel: ViewModel(){
    private val _uiState = MutableStateFlow(QuizUiState())
    val uiState: StateFlow<QuizUiState> = _uiState.asStateFlow()

    private lateinit var currentWord: String


    private fun pickRandomWord(): String{
        currentWord = allWords.random()
        return currentWord
    }
}