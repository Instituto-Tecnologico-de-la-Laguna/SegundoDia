package com.example.segundodia.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.segundodia.view.HomeView
import com.example.segundodia.view.DetailsView

@Composable
fun NavManager() {
    val navController: NavHostController = rememberNavController()

    NavHost(
        navController = navController, startDestination = "HomeView"
    ) {
        composable("HomeView") {
            HomeView(navController)
        }
        composable("DetailView") {
            DetailsView(navController)
        }
    }
}
