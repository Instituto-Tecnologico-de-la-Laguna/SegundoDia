package com.example.segundodia.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.segundodia.onBoardViews.MainOnBoarding
import com.example.segundodia.view.DetailsView
import com.example.segundodia.view.HomeView
import com.example.segundodia.view.SplashScreen


@Composable
fun NavManager(){
    val navController = rememberNavController()

    NavHost(navController = navController,
        startDestination = "OnBoarding"){
        composable("Home"){
            HomeView(navController)
        }
        composable("Detail/{id}",arguments =
            listOf(navArgument("id")
            {type= NavType.IntType })){
            val id=it.arguments?.getInt("id")?:0
            DetailsView(navController,id)
        }
        composable("Splash"){
            SplashScreen(navController)
        }
        composable("OnBoarding"){
            MainOnBoarding(navController)
        }

    }
}
