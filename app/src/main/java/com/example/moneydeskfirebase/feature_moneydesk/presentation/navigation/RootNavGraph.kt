package com.example.moneydeskfirebase.feature_moneydesk.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.moneydeskfirebase.feature_moneydesk.presentation.screens.MainScreen

@Composable
fun RootNavGraph(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        route = Graph.ROOT,
        startDestination = Graph.AUTH
    ){
        authNavGraph(navHostController)
        composable(route = Graph.BOTTOM){
            MainScreen()
        }
    }
}

object Graph{
    const val ROOT = "root_graph"
    const val AUTH = "auth_graph"
    const val BOTTOM = "bottom_graph"
    const val MAIN = "main_graph"
}