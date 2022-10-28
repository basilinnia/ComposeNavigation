package com.example.navigationexample.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.navigationexample.Screens

@Composable
fun DetailsScreen (name :String?) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "DETAILS", fontSize = 36.sp, color = Color.Blue, modifier = Modifier.padding(vertical = 30.dp) )
        Text("Your name is:  $name ")
    }
}