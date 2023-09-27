package com.example.myapplication.Unit3

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.myapplication.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun menuNewPlayer() {

    var name by remember { mutableStateOf("") }
    var surname by remember { mutableStateOf("") }
    var nickname by remember { mutableStateOf("") }
    var number by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var pushButName by remember { mutableStateOf(false) }
    var pushButNickname by remember { mutableStateOf(false) }

    Column(modifier = Modifier.fillMaxSize()) {
        //Ponemos la imagen del perfinl y TEXTFILE
        Row(
            modifier =
            Modifier
                .padding(10.dp),
        ) {

            Image(
                painter = painterResource(R.drawable.account),
                contentDescription = "",
                Modifier
                    .size(60.dp)
                    .weight(1f)
            )
            TextField(
                label = { Text(text = "Nombre") },
                value = name, onValueChange = { name = it },
                modifier = Modifier.weight(2f),
                shape = RoundedCornerShape(15.dp),
                colors = TextFieldDefaults.textFieldColors(focusedIndicatorColor = Color.Red)
            )
        }

        //Lo de obligatorio
        if (pushButName) {
            Text(
                text = "Error: Obligatorio",
                textAlign = TextAlign.Center,
                color = Color.Red, modifier = Modifier.align(Alignment.CenterHorizontally)
            )
        } else {
            Text(text = "*Obligatorio", modifier = Modifier.align(Alignment.CenterHorizontally))
        }

        //Ponemos un SPACER y el TEXTFILE
        Row(
            modifier =
            Modifier
                .padding(10.dp)
        ) {
            Spacer(modifier = Modifier.weight(1f))
            TextField(
                label = { Text(text = "Apellido") },
                value = surname, onValueChange = { surname = it },
                modifier = Modifier.weight(2f),
                shape = RoundedCornerShape(15.dp),
                colors = TextFieldDefaults.textFieldColors(focusedIndicatorColor = Color.Red)

            )
        }
        //Ponemos un SPACER y el TEXTFILE
        Row(
            modifier =
            Modifier
                .padding(10.dp)
        ) {
            Spacer(modifier = Modifier.weight(1f))
            TextField(
                label = { Text(text = "Nickname") },
                value = nickname, onValueChange = { nickname = it },
                modifier = Modifier.weight(2f),
                shape = RoundedCornerShape(15.dp),
                colors = TextFieldDefaults.textFieldColors(focusedIndicatorColor = Color.Red)
            )
        }

        //Lo de Obligatorio
        if (pushButNickname) {
            Text(
                text = "Error: Obligatorio",
                textAlign = TextAlign.Center,
                color = Color.Red, modifier = Modifier.align(Alignment.CenterHorizontally)
            )
        } else {
            Text(text = "*Obligatorio", modifier = Modifier.align(Alignment.CenterHorizontally))
        }


        //Ponemos un SPACER, la imagen del Android y el BUTTOM
        Row(
            modifier =
            Modifier
                .padding(10.dp)
                .align(Alignment.CenterHorizontally)
        ) {
            Spacer(modifier = Modifier.weight(1f))
            Image(
                painter = painterResource(R.drawable.android),
                contentDescription = "",
                Modifier
                    .size(90.dp)
                    .weight(1f)
            )
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(15.dp),
                shape = RoundedCornerShape(15.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Red)

            ) {
                Text(text = "change")
            }
        }
        //Ponemos la imagen y el TEXTFILE (3)
        Row(
            modifier =
            Modifier
                .padding(10.dp),
        ) {

            Image(
                painter = painterResource(R.drawable.camera),
                contentDescription = "",
                Modifier
                    .size(60.dp)
                    .weight(1f)
            )
            TextField(
                value = number, onValueChange = { number = it },
                modifier = Modifier.weight(2f),
                shape = RoundedCornerShape(15.dp),
                colors = TextFieldDefaults.textFieldColors(focusedIndicatorColor = Color.Red)
            )
        }
        //Ponemos la imagen y el TEXTFILE (4)
        Row(
            modifier =
            Modifier
                .padding(10.dp),
        ) {

            Image(
                painter = painterResource(R.drawable.email),
                contentDescription = "",
                Modifier
                    .size(60.dp)
                    .weight(1f)
            )
            TextField(
                label = { Text(text = "Email") },
                value = email, onValueChange = { email = it },
                modifier = Modifier.weight(2f),
                shape = RoundedCornerShape(15.dp),
                colors = TextFieldDefaults.textFieldColors(focusedIndicatorColor = Color.Red)
            )
        }
        //Añadimos el boton de ADD NEW PLAYER
        Row(modifier = Modifier.align(Alignment.CenterHorizontally)) {
            Button(
                onClick = {
                    pushButName = name.isBlank()
                    pushButNickname = nickname.isBlank()

                },
                modifier = Modifier.padding(10.dp),
                shape = RoundedCornerShape(18.dp),
            ) {
                Text(text = "Add new player")
            }
        }
    }
}

