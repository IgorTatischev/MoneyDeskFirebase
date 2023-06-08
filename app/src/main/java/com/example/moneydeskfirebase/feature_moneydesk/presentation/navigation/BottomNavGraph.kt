package com.example.moneydeskfirebase.feature_moneydesk.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.moneydeskfirebase.feature_moneydesk.presentation.screens.BottomBarScreens
import com.example.moneydeskfirebase.feature_moneydesk.presentation.screens.category.CategoryIncomeScreen
import com.example.moneydeskfirebase.feature_moneydesk.presentation.screens.main.MainChartScreen
import com.example.moneydeskfirebase.feature_moneydesk.presentation.screens.main.NewOperationScreen
import com.example.moneydeskfirebase.feature_moneydesk.presentation.screens.main.OperationsScreen
import com.example.moneydeskfirebase.feature_moneydesk.presentation.screens.menu.MenuScreen
import com.example.moneydeskfirebase.feature_moneydesk.presentation.screens.wallet.WalletsScreen

@Composable
fun BottomNavGraph(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        route = Graph.BOTTOM,
        startDestination = BottomBarScreens.Main.route
    ){
        composable(route = BottomBarScreens.Main.route){
            MainChartScreen(navHostController)
        }
        composable(route = BottomBarScreens.Wallet.route){
            WalletsScreen()
        }
        composable(route = BottomBarScreens.Category.route){
            CategoryIncomeScreen()
        }
        composable(route = BottomBarScreens.Menu.route){
            MenuScreen()
        }
        mainNavGraph(navHostController)
    }
}

fun NavGraphBuilder.mainNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.MAIN,
        startDestination = MainScreens.Operations.route
    ) {
        composable(route = MainScreens.Operations.route) { OperationsScreen() }
        composable(route = MainScreens.NewOperation.route) { NewOperationScreen() }
    }
}

sealed class MainScreens(val route: String) {
    object Operations: MainScreens("OPERATIONS")
    object NewOperation: MainScreens("NEW_OPERATION")
}