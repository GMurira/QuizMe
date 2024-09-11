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

    private lateinit var listOfWords: String

    private val getReady: String =  "get ready for some questions"

     fun comingSoon(): String{
         listOfWords = allWords.random()
         return listOfWords
    }
}