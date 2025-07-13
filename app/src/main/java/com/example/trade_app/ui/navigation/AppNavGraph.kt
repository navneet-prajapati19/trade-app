package com.example.trade_app.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.trade_app.ui.detail.DetailScreen
import com.example.trade_app.ui.home.HomeScreen

@Composable
fun AppNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") {
            HomeScreen (onNavigateToDetail = {
                navController.navigate("detail")
            })
        }
        composable("detail") {
            DetailScreen(onBack = {
                navController.popBackStack()
            })
        }
    }
}