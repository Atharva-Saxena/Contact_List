package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController


class MainActivity : ComponentActivity() {
    private val contacts = mutableListOf<Pair<String, String>>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PhoneBook(contacts)
        }
    }
}





@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PhoneBookApp(navController= rememberNavController())
}


