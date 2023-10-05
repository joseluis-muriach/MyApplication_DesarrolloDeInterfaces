package com.example.myapplication.Unit3

import android.widget.Toast
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R

data class Picture(
    var pictureName: String,
    var realPicture: String,
    @DrawableRes var photo: Int
)


@Composable
fun MenuAbout() {
    val context = LocalContext.current
    LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        items(getPicture()) { superHero ->
            ItemPicture(picture = superHero) {
                Toast.makeText(
                    context, it.pictureName, Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}

@Composable
fun ItemPicture(picture: Picture, onItemSelected: (Picture) -> Unit) {
    Row(verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.clickable { onItemSelected(picture) }) {
        Image(
            painter = painterResource(id = picture.photo),
            contentDescription = "SuperHero avatar",
            contentScale = ContentScale.Inside,
        )
        Column(
            Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = picture.pictureName,
            )
            Text(
                text = picture.realPicture,
                fontSize = 12.sp
            )
        }
    }
}


fun getPicture(): List<Picture> {
    return listOf(
        Picture(
            "Maria Mata",
            "Puntos: 2014",
            R.drawable.image1
        ),
        Picture(
            "Antonio Sanz",
            "Puntos 2056",
            R.drawable.image2
        ),
        Picture(
            "Carlos Pérez",
            "Puntos 5231",
            R.drawable.image3
        ),
        Picture(
            "Juan Ramon",
            "Puntos 6218",
            R.drawable.image4
        ),
        Picture(
            "Beatriz Martos",
            "Puntos 1892",
            R.drawable.image5
        ),
        Picture(
            "Sebastian Ruiz",
            "Puntos 2231",
            R.drawable.image6
        ),
        Picture(
            "Sergio Navarro",
            "Puntos 1954",
            R.drawable.image7
        ),
        Picture(
            "Santiago Camacho",
            "Puntos 3691",
            R.drawable.image8
        ),
    )
}
