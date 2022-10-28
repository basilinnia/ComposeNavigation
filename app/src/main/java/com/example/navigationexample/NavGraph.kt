package com.example.navigationexample

import androidx.compose.runtime.Composable
import androidx.navigation.NavArgument
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.navigationexample.screens.DetailsScreen
import com.example.navigationexample.screens.WelcomeScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screens.WelcomeScreen.route) {
        composable(route = Screens.WelcomeScreen.route) {
            WelcomeScreen(navController = navController)
        }
        composable(
            route = Screens.DetailsScreen.route + "/{name}",
            arguments = listOf(
            navArgument("name"){
                    type = NavType.StringType
                     nullable = true
                }
            )
        ) { entry ->
            DetailsScreen(name = entry.arguments?.getString("name"))
        }
    }
}