package com.example.quizme.presentation

import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ButtonCommons(Text: String){
    Button(onClick = { /*TODO*/ }) {
       // Text = "Click Me"
    }
}
@Preview(showBackground = true)
@Composable
fun ButtonCommonsPreview(){
    ButtonCommons(Text = "Click Me")
}