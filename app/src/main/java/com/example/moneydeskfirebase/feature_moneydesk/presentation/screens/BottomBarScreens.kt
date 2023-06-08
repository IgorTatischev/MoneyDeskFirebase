package com.example.moneydeskfirebase.feature_moneydesk.presentation.screens

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Category
import androidx.compose.material.icons.filled.DonutLarge
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Payments
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreens(
    val route: String,
    val icon: ImageVector,
    val label: String
) {
    object Main : BottomBarScreens(
        route = "BOTTOM",
        icon = Icons.Default.DonutLarge,
        label = "Main"
    )

    object Wallet : BottomBarScreens(
        route = "WALLET",
        icon = Icons.Default.Payments,
        label = "Wallet"
    )

    object Category : BottomBarScreens(
        route = "CATEGORY",
        icon = Icons.Default.Category,
        label = "Category"
    )

    object Menu : BottomBarScreens(
        route = "MENU",
        icon = Icons.Default.Menu,
        label = "Menu"
    )
}