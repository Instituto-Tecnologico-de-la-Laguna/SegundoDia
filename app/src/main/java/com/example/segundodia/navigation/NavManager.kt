package com.example.segundodia.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

@Composable
fun NavManager(){
    val navController: NavHostController = rememberNavController()

    NavHost(navController = navController, startDestination = "HomeView")
}
