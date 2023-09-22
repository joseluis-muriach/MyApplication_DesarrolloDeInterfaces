package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.ui.theme.Home
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.ui.theme.menuPlay
import com.example.myapplication.ui.theme.menuNewPlayer
import com.example.myapplication.ui.theme.menuPreferences

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize())
                {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "Portada") {
                        composable("Portada"){Home(navController)}
                        composable("Play"){ menuPlay()}
                        composable("New Player"){ menuNewPlayer()}
                        composable("Preferences"){ menuPreferences() }
                    }
                }
            }
        }
    }
}






