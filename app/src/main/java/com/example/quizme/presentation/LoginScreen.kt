package com.example.quizme.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

/**
 * This is a login screen for the quiz app
 */
@Composable
fun LoginScreen(modifier: Modifier = Modifier){
    Column(modifier = modifier.fillMaxSize()) {
        Text(text = "Login Screen")
    }
}

/**
 * F
 */
@Preview( showBackground = true)
@Composable
fun LoginScreenPreview(){
    LoginScreen()
}