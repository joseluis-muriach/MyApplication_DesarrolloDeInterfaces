package com.example.myapplication.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun menuPlayer(){
    var name = "Nombre"
    Column {
        Row(modifier =
        Modifier
            .fillMaxSize()
            .padding(10.dp),
            ){

            Image(
                painter = painterResource(R.drawable.account),
                contentDescription = "",
                Modifier
                    .size(60.dp)
                    .weight(1f))

            TextField(value = name, onValueChange = {name = it},
                modifier = Modifier.weight(2f))
        }
    }
}
