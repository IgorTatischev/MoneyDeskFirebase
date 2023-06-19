package com.example.moneydeskfirebase.feature_moneydesk.presentation.screens.main

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MainChartScreen(onOperationsClick: () -> Unit) {
    Text("Main Chart", Modifier.clickable { onOperationsClick() })
}
