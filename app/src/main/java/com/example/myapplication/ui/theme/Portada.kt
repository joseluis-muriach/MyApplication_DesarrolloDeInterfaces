package com.example.myapplication.ui.theme

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapplication.R
import com.google.android.engage.common.datamodel.Image

@Composable
fun Home(navController: NavController) {
    val configuration = LocalConfiguration.current
    
    when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {

                Image(
                    painter = painterResource(R.drawable.google),
                    contentDescription = "",
                    modifier = Modifier.size(100.dp)
                )

                Text(
                    text = "Play Juegos",
                    fontSize = 40.sp,
                    fontFamily = FontTittle,
                    modifier = Modifier.padding(bottom = 15.dp)
                )

                Row(
                    modifier = Modifier,
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {

                    Button(
                        onClick = { navController.navigate("Play") },
                        modifier = Modifier
                            .width(250.dp)
                            .padding(horizontal = 20.dp)
                    ) {
                        Text(text = "Play")
                    }
                    Button(
                        onClick = { navController.navigate("New Player") },
                        modifier = Modifier.width(250.dp)
                    ) {
                        Text(text = "New player")
                    }
                }

                Row(
                    modifier = Modifier,
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {

                    Button(
                        onClick = {},
                        modifier = Modifier
                            .width(250.dp)
                            .padding(horizontal = 20.dp)
                    ) {
                        Text(text = "Preference")
                    }
                    Button(
                        onClick = {},
                        modifier = Modifier.width(250.dp)
                    ) {
                        Text(text = "About")
                    }
                }
            }

        }

        else -> {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {

                Image(
                    painter = painterResource(R.drawable.google),
                    contentDescription = "",
                    modifier = Modifier.size(200.dp)
                )

                Text(
                    text = "Play Juegos",
                    fontSize = 40.sp,
                    fontFamily = FontTittle
                )
                Spacer(modifier = Modifier.size(30.dp))
                Button(
                    onClick = { navController.navigate("Play") },
                    modifier = Modifier.width(250.dp)
                ) {
                    Text(text = "Play")
                }

                Button(
                    onClick = { navController.navigate("New Player") },
                    modifier = Modifier.width(250.dp)
                ) {
                    Text(text = "New Player")
                }

                Button(
                    onClick = {},
                    modifier = Modifier.width(250.dp),
                ) {
                    Text(text = "Preferences")
                }

                Button(
                    onClick = {},
                    modifier = Modifier.width(250.dp)
                ) {
                    Text(text = "about")
                }
            }
        }
    }
}