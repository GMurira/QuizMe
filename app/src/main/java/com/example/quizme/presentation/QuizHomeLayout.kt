package com.example.quizme.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.quizme.R



/**
 * Quiz TopApp Bar
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun QuizTopAppBar(
    scrollBehavior: TopAppBarScrollBehavior,
    modifier: Modifier = Modifier
){
    CenterAlignedTopAppBar(
        scrollBehavior = scrollBehavior,
        title = { Text(
            text = stringResource(R.string.app_name),
            style = MaterialTheme.typography.bodyLarge
        ) },
        modifier = modifier
    )
}
@Composable
fun HomeScreenLayout(
    quizUiState: QuizUiState,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues,
){
    when(quizUiState){
        is QuizUiState.Loading -> LoadingScreen(modifier = Modifier.fillMaxSize())
        is QuizUiState.Error -> ErrorScreen(modifier = Modifier.fillMaxSize())
        is QuizUiState.Success -> Posts(questions = quizUiState.questions)
    }
}
/**?
 * Loading Screen
 */
@Composable
fun LoadingScreen(modifier: Modifier = Modifier){
    "Wait =ing"
}
@Composable
fun ErrorScreen(modifier: Modifier = Modifier){
    Text(text = "An Error Ocurred")
}
/**
 * Composale to display posts
 */
@Composable
fun Posts(questions: String, modifier: Modifier = Modifier){
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
    ){
        Text(text = questions)
    }
}
