package com.example.trade_app.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.trade_app.ui.auth.LoginScreen
import com.example.trade_app.ui.auth.SignupScreen
import com.example.trade_app.ui.home.HomeScreen

@Composable
fun AppNavGraph(navController: NavHostController) {
    NavHost(navController, startDestination = "home") {
        composable("home") { HomeScreen(navController) }
        composable("login") { LoginScreen() }
        composable("signup") { SignupScreen() }
    }
}