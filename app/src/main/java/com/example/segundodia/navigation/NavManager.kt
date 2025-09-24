package com.example.segundodia.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.segundodia.views.DetailView
import com.example.segundodia.views.HomeView
import com.example.segundodia.views.SplashScreen

@Composable
fun NavManager(){
    val navController: NavHostController = rememberNavController()

    NavHost(navController = navController, startDestination = "Splash",) {
        composable (route ="Home"){
            HomeView(navController)
        }
        composable(route = "Detail/{id}", arguments =
        listOf(navArgument("id")
        {type= NavType.IntType})){
            val id =it.arguments?.getInt("id")?:0
            DetailView(navController,id)
        }
        composable("Splash"){
            SplashScreen(navController)
        }

    }
}