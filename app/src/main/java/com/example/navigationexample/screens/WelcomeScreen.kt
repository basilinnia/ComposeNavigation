package com.example.navigationexample.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.navigationexample.Screens

@Composable
fun WelcomeScreen(navController: NavController) {
    var text by remember {
        mutableStateOf(" ")
    }
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "WELCOME!", fontSize = 36.sp, color = Color.Red )
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Write your name: ", fontSize = 16.sp, color = Color.Gray )
        Spacer(modifier = Modifier.height(10.dp))

        TextField(value = text, onValueChange = {
            text = it
        }, modifier = Modifier.padding(16.dp))

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = { navController.navigate(Screens.DetailsScreen.withArgs(text)) },
            modifier = Modifier.align(Alignment.End).padding(36.dp)
        ) {
            Text(text = "Go To My Details")
        }
    }
}
