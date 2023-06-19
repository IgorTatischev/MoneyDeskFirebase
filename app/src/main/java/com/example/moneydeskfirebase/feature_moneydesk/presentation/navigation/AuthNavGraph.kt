package com.example.moneydeskfirebase.feature_moneydesk.presentation.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.moneydeskfirebase.feature_moneydesk.presentation.screens.auth.ForgotPasswordScreen
import com.example.moneydeskfirebase.feature_moneydesk.presentation.screens.auth.SignInScreen
import com.example.moneydeskfirebase.feature_moneydesk.presentation.screens.auth.SignUpScreen

fun NavGraphBuilder.authNavGraph(navHostController: NavHostController) {
    navigation(
        route = Graph.AUTH,
        startDestination = AuthScreen.SignIn.route
    ){
        composable(route = AuthScreen.SignIn.route) {
            SignInScreen(
                onSignInClick = {
                    navHostController.popBackStack()
                    navHostController.navigate(Graph.BOTTOM)
                },
                onSignUpClick = {
                    navHostController.navigate(AuthScreen.SignUp.route)
                },
                onForgotClick = {
                    navHostController.navigate(AuthScreen.Forgot.route)
                })
        }
        composable(route = AuthScreen.SignUp.route) {
            SignUpScreen()
        }
        composable(route = AuthScreen.Forgot.route) {
            ForgotPasswordScreen()
        }
    }
}

sealed class AuthScreen(val route: String) {
    object SignIn : AuthScreen(route = "SIGN_IN")
    object SignUp : AuthScreen(route = "SIGN_UP")
    object Forgot : AuthScreen(route = "FORGOT")
}