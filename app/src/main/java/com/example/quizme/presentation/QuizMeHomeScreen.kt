package com.example.quizme.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel

@Composable
fun HomeScreenLayout(
    modifier: Modifier = Modifier,
    quizViewModel: QuizViewModel
){
    val quizUiState by quizViewModel.uiState.collectAsState()
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Welcome")
        Button(onClick = { quizUiState.listOfWords}) {
            Text(text = "Click Me To Start")
        }
    }
}
@Preview(showBackground = true)
@Composable
fun HomeScreenLayoutPreview(){
    HomeScreenLayout(quizViewModel = QuizViewModel())
}