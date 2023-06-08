package com.example.moneydeskfirebase.feature_moneydesk.presentation.screens.main

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.moneydeskfirebase.feature_moneydesk.presentation.navigation.Graph

@Composable
fun MainChartScreen(navController: NavHostController) {
    Text("Main Chart", Modifier.clickable { navController.navigate(Graph.MAIN) })
}
