package com.example.quizme.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.quizme.data.allWords
import com.example.quizme.network.QuizApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import java.io.IOException

class QuizViewModel: ViewModel(){
    var quizUiState: QuizUiState by mutableStateOf(QuizUiState.Loading)
        private set
    private fun getQuestions(){
        viewModelScope.launch {

            try {
                val listResult = QuizApi.retrofitService.getQuestions()
                QuizUiState.Success(
                    "Success: ${listResult} retrived"
                )
            }catch (e: IOException){

            }
        }
    }
}