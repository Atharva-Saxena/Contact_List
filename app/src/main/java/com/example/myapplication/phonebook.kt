package com.example.myapplication

import androidx.compose.foundation.layout.Column

import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.NavHostController

@Composable
fun PhoneBookApp(navController: NavHostController) {
    var name by remember { mutableStateOf("") }
    var contact by remember { mutableStateOf("") }
    var contacts by remember { mutableStateOf(listOf<Pair<String, String>>()) }

    Column {
        // Input fields for name and contact
        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Name") }
        )
        OutlinedTextField(
            value = contact,
            onValueChange = { contact = it },
            label = { Text("Contact") }
        )

        // Button to add a new contact
        Button(onClick = {
            contacts = contacts + Pair(name, contact)
            name = ""
            contact = ""
        }) {
            Text("Add Contact")
        }

        // Button to show all contacts
        Button(onClick = {  navController.navigate("contact_list") }) {
            Text("Show All Contacts")
        }
    }
}

