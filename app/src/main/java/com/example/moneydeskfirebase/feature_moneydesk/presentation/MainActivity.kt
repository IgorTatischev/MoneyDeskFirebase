package com.example.moneydeskfirebase.feature_moneydesk.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.rememberNavController
import com.example.moneydeskfirebase.feature_moneydesk.presentation.navigation.RootNavGraph
import com.example.moneydeskfirebase.feature_moneydesk.presentation.ui.theme.MoneyDeskFirebaseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            MoneyDeskFirebaseTheme {
                RootNavGraph(navHostController = rememberNavController())
            }
        }
    }
}

