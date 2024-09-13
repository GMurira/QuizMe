package com.example.quizme.presentation

 interface QuizUiState{
    data class Success(val questions: String) :QuizUiState
    object Error : QuizUiState
    object Loading : QuizUiState
}
