package com.example.myapplication

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun PhoneBook(contacts: List<Pair<String, String>>) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "phone_book"
    ) {
        composable("phone_book") {
            PhoneBookApp(navController)
        }
        composable("contact_list") {
            ContactListScreen(navController, contacts)
        }
    }
}