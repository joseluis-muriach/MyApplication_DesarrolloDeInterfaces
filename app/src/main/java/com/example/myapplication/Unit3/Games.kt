package com.example.myapplication.Unit3

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Checkbox
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R


@Preview(showBackground = true)
@Composable
fun menuGames() {
    //Variables
    var angryBirdsChecked by remember { mutableStateOf(false) }
    var dragonFlyChecked by remember { mutableStateOf(false) }
    var hillClimbingChecked by remember { mutableStateOf(false) }
    var radiantChecked by remember { mutableStateOf(false) }
    var pocketChecked by remember { mutableStateOf(false) }
    var ninjaChecked by remember { mutableStateOf(false) }
    var airControlChecked by remember { mutableStateOf(false) }

    Column(modifier = Modifier.fillMaxSize()) {
        //Here create the rows with images, checkbox and text
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.games_angrybirds),
                contentDescription = "",
                Modifier
                    .size(80.dp)
            )

            Row(Modifier.padding(8.dp)) {
                Checkbox(checked = angryBirdsChecked,
                    onCheckedChange = { isCheked -> angryBirdsChecked = isCheked }
                )
                Text(
                    text = "Angry Birds",
                    modifier = Modifier.padding(top = 10.dp),
                    fontSize = 15.sp
                )
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.games_dragonfly),
                contentDescription = "",
                Modifier
                    .size(80.dp)
            )

            Row(Modifier.padding(8.dp)) {
                Checkbox(checked = dragonFlyChecked,
                    onCheckedChange = { isCheked -> dragonFlyChecked = isCheked }
                )
                Text(
                    text = "Dragon Fly",
                    modifier = Modifier.padding(top = 10.dp),
                    fontSize = 15.sp
                )
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.games_hillclimbingracing),
                contentDescription = "",
                Modifier
                    .size(80.dp)
            )

            Row(Modifier.padding(8.dp)) {
                Checkbox(checked = hillClimbingChecked,
                    onCheckedChange = { isCheked -> hillClimbingChecked = isCheked }
                )
                Text(
                    text = "Hill Climbing Racing",
                    modifier = Modifier.padding(top = 10.dp),
                    fontSize = 15.sp
                )
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.games_dragonfly),
                contentDescription = "",
                Modifier
                    .size(80.dp)
            )

            Row(Modifier.padding(8.dp)) {
                Checkbox(checked = radiantChecked,
                    onCheckedChange = { isCheked -> radiantChecked = isCheked }
                )
                Text(
                    text = "Radiant Defense",
                    modifier = Modifier.padding(top = 10.dp),
                    fontSize = 15.sp
                )
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.games_pocketsoccer),
                contentDescription = "",
                Modifier
                    .size(80.dp)
            )

            Row(Modifier.padding(8.dp)) {
                Checkbox(checked = pocketChecked,
                    onCheckedChange = { isCheked -> pocketChecked = isCheked }
                )
                Text(
                    text = "Pocket Soccer",
                    modifier = Modifier.padding(top = 10.dp),
                    fontSize = 15.sp
                )
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.games_ninjump),
                contentDescription = "",
                Modifier
                    .size(80.dp)
            )

            Row(Modifier.padding(8.dp)) {
                Checkbox(checked = ninjaChecked,
                    onCheckedChange = { isCheked -> ninjaChecked = isCheked }
                )
                Text(
                    text = "Ninja Jump",
                    modifier = Modifier.padding(top = 10.dp),
                    fontSize = 15.sp
                )
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.games_aircontrol),
                contentDescription = "",
                Modifier
                    .size(80.dp)
            )

            Row(Modifier.padding(8.dp)) {
                Checkbox(checked = airControlChecked,
                    onCheckedChange = { isCheked -> airControlChecked = isCheked }
                )
                Text(
                    text = "Air Control",
                    modifier = Modifier.padding(top = 10.dp),
                    fontSize = 15.sp
                )
            }
        }

        var whenPushTheFab = LocalContext.current
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.BottomEnd
        ) {

            var resultGames by remember { mutableStateOf("") }
            FloatingActionButton(
                onClick = {
                    resultGames = ""
                    if (angryBirdsChecked) {
                        resultGames = "Angry Birds "
                    }
                    if (dragonFlyChecked) {
                        resultGames += "Dragon fly "
                    }
                    if (hillClimbingChecked) {
                        resultGames += "Hill Climbing Racing "
                    }
                    if (radiantChecked) {
                        resultGames += "Radiant Defense "
                    }
                    if (pocketChecked) {
                        resultGames += "Pocket Soccer "
                    }
                    if (ninjaChecked) {
                        resultGames += "Ninja Jump "
                    }
                    if (airControlChecked) {
                        resultGames += "Air Control "
                    }

                    Toast.makeText(
                        whenPushTheFab, "Has seleccionado " + resultGames,
                        Toast.LENGTH_LONG
                    ).show()
                },
                modifier = Modifier
                    .wrapContentSize(Alignment.BottomEnd)
                    .padding(16.dp),
                shape = RoundedCornerShape(30.dp)

            ) {
                val iconModifier = Modifier
                    .wrapContentSize(Alignment.BottomEnd)
                    .padding(16.dp)

                Icon(
                    imageVector = Icons.Filled.Check,
                    contentDescription = "Check",
                    tint = Color.Red,
                    modifier = iconModifier
                )
            }
        }
    }
}
