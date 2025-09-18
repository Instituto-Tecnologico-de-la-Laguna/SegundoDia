package com.example.segundodia.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.segundodia.view.HomeView
import com.example.segundodia.view.DetailsView
import com.example.segundodia.view.SegundaVista

@Composable
fun NavManager() {
    val navController: NavHostController = rememberNavController()

    NavHost(
        navController = navController, startDestination = "HomeView"
    ) {
        composable("HomeView") {
            HomeView(navController)
        }
        composable("DetailView/{id}", arguments =
        listOf(navArgument("id"){type= NavType.IntType})) {
            val id = it.arguments?.getInt("id")?:0
            DetailsView(navController,id)
        }
        composable("SegundaVista/{valor}", arguments =
            listOf(navArgument("valor"){type= NavType.IntType})) {
            val valor = it.arguments?.getInt("valor")?:0
            SegundaVista(navController,valor)
        }

    }
}
