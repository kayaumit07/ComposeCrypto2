package com.umit.cryptoappcompose.View

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun CryptoDetailScreen(
    id: String?,
    price: String?,
    navController: NavController
) {
    Text(text = "Detail Screen")
}