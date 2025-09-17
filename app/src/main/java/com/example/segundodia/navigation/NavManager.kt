package com.example.segundodia.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import androidx.navigation.compose.rememberNavController
import com.example.segundodia.views.DetailView
import com.example.segundodia.views.HomeView

@Composable
fun NavManager(){
    val navController: NavHostController = rememberNavController()

    NavHost(navController = navController, startDestination = "Home",) {
        composable (route ="Home"){
            HomeView(navController)
        }
        composable(route = "Detail") {
            DetailView(navController)
        }

    }
}