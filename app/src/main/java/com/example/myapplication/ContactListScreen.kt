package com.example.myapplication

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun ContactListScreen(
    navController: NavHostController,
    contacts: List<Pair<String,String>>
) {
    LazyColumn {
        items(contacts) { contact ->
            Text("${contact.first}: ${contact.second}")
        }
    }
}