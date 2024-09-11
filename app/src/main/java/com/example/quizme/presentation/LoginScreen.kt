package com.example.quizme.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quizme.R

/**
 * This is a login screen for the quiz app
 */
@Composable
fun LoginScreen(modifier: Modifier = Modifier){
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(text = "Login Screen")
        LoginInput()
        LoginButton()
    }
}

/**
 * OutlinedTextField
 */
@Composable
fun LoginInput(modifier: Modifier = Modifier){
    var name by remember { mutableStateOf("")}
    Column {
        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            singleLine = true,
            modifier = modifier,
        )
    }
}

/**
 * Login Screen Button
 */
@Composable
fun LoginButton(modifier: Modifier = Modifier){
    Row (modifier = modifier.fillMaxWidth()){
        OutlinedButton(onClick = { /*TODO*/ }) {
            Text(text = stringResource(R.string.Login))
        }
    }
}
@Preview( showBackground = true)
@Composable
fun LoginScreenPreview(){
    LoginScreen()
}