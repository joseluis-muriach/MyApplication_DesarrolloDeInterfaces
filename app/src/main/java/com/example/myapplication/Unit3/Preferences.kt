package com.example.myapplication.Unit3

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

var selectionSlider = 0f

@Preview(showBackground = true)
@Composable
fun menuPreferences() {
    Column(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Elige una opción",
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
                modifier = Modifier.padding(10.dp)
            )
        }
        var selectButtom by remember { mutableStateOf("") }
        MyRadioButton(selectButtom) { selectButtom = it }
        MySlider()
        MyFloatingRadioButton(selectButtom)
    }
}

@Composable
fun MyRadioButton(name: String, onItemSelected: (String) -> Unit) {
    Column {
        Row {
            RadioButton(selected = name == "Angry Birds",
                onClick = {
                    onItemSelected("Angry Birds")
                })
            Text(
                text = "Angry Birds",
                Modifier.padding(top = 12.dp)
            )
        }

        Row {
            RadioButton(selected = name == "Dragon Fly",
                onClick = {
                    onItemSelected("Dragon Fly")
                })
            Text(
                text = "Dragon Fly",
                Modifier.padding(top = 12.dp)
            )
        }
        Row {
            RadioButton(selected = name == "Hill Climbing Racing",
                onClick = {
                    onItemSelected("Hill Climbing Racing")
                })
            Text(
                text = "Hill Climbing Racing",
                Modifier.padding(top = 12.dp)
            )
        }
        Row {
            RadioButton(selected = name == "Pocket Soccer",
                onClick = {
                    onItemSelected("Pocket Soccer")
                })
            Text(
                text = "Pocket Soccer",
                Modifier.padding(top = 12.dp)
            )
        }
        Row {
            RadioButton(selected = name == "Radiant Defense",
                onClick = {
                    onItemSelected("Radiant Defense")
                })
            Text(
                text = "Radiant Defense",
                Modifier.padding(top = 12.dp)
            )
        }
        Row {
            RadioButton(selected = name == "Ninja Jump",
                onClick = {
                    onItemSelected("Ninja Jump")
                })
            Text(
                text = "Ninja Jump",
                Modifier.padding(top = 12.dp)
            )
        }
        Row {
            RadioButton(selected = name == "Air Control",
                onClick = {
                    onItemSelected("Air Control")
                })
            Text(
                text = "Air Control",
                Modifier.padding(top = 12.dp)
            )
        }
    }
}

@Composable
fun MySlider() {
    val range = 0.0f..100.0f
    val steps = 11
    var selection by remember { mutableStateOf(50f) }

    Slider(
        value = selection,
        valueRange = range,
        steps = steps,
        onValueChange = {
            selection = it
            selectionSlider = selection
        }
    )
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MyFloatingRadioButton(selectButtom: String) {
    MyPlatforms()

    //Creamos el FAB
    var whenPushTheFab = LocalContext.current
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomEnd
    ) {

        FloatingActionButton(
            onClick = {
                if (selectButtom == "") {
                    Toast.makeText(
                        whenPushTheFab, "No has pulsado ninguna opción ",
                        Toast.LENGTH_LONG
                    ).show()
                } else {
                    Toast.makeText(
                        whenPushTheFab, "Has seleccionado $selectButtom con una " +
                                "puntuación de $selectionSlider", Toast.LENGTH_LONG
                    ).show()
                }
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyPlatforms() {
    Text(
        text = "Plataformas",
        fontSize = 20.sp,
        modifier = Modifier.padding(10.dp)
    )

    var whenPushTheFab = LocalContext.current
    var chipPs4 by remember { mutableStateOf(false) }
    var chipXbox by remember { mutableStateOf(false) }
    var chipWii by remember { mutableStateOf(false) }
    var chipWiiu by remember { mutableStateOf(false) }

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        var textPs4 = "PS4"
        FilterChip(
            modifier = Modifier.padding(10.dp),
            onClick = {
                chipPs4 = !chipPs4
                chipXbox = false
                chipWii = false
                chipWiiu = false
                Toast.makeText(
                    whenPushTheFab, "Has seleccionado $textPs4",
                    Toast.LENGTH_LONG
                ).show()
            },
            label = {
                Text(textPs4)
            },
            selected = chipPs4,
            leadingIcon = if (chipPs4) {
                {
                    Icon(
                        imageVector = Icons.Filled.Done,
                        contentDescription = "Done icon",
                        modifier = Modifier.size(FilterChipDefaults.IconSize)
                    )
                }
            } else {
                null
            },
        )

        var textXbox = "XBOX"
        FilterChip(
            modifier = Modifier.padding(10.dp),
            onClick = {
                chipXbox = !chipXbox
                chipPs4 = false
                chipWii = false
                chipWiiu = false
                Toast.makeText(
                    whenPushTheFab, "Has seleccionado $textXbox",
                    Toast.LENGTH_LONG
                ).show()
            },
            label = {
                Text(textXbox)
            },
            selected = chipXbox,
            leadingIcon = if (chipXbox) {
                {
                    Icon(
                        imageVector = Icons.Filled.Done,
                        contentDescription = "Done icon",
                        modifier = Modifier.size(FilterChipDefaults.IconSize)
                    )
                }
            } else {
                null
            },
        )

        var textWii = "WII"
        FilterChip(
            modifier = Modifier.padding(10.dp),
            onClick = {
                chipWii = !chipWii
                chipPs4 = false
                chipXbox = false
                chipWiiu = false
                Toast.makeText(
                    whenPushTheFab, "Has seleccionado $textWii",
                    Toast.LENGTH_LONG
                ).show()
            },
            label = {
                Text(textWii)
            },
            selected = chipWii,
            leadingIcon = if (chipWii) {
                {
                    Icon(
                        imageVector = Icons.Filled.Done,
                        contentDescription = "Done icon",
                        modifier = Modifier.size(FilterChipDefaults.IconSize)
                    )
                }
            } else {
                null
            },
        )

        var textWiiu = "WIIU"
        FilterChip(
            modifier = Modifier.padding(10.dp),
            onClick = {
                chipWiiu = !chipWiiu
                chipPs4 = false
                chipXbox = false
                chipWii = false
                Toast.makeText(
                    whenPushTheFab, "Has seleccionado $textWiiu",
                    Toast.LENGTH_LONG
                ).show()
            },
            label = {
                Text(textWiiu)
            },
            selected = chipWiiu,
            leadingIcon = if (chipWiiu) {
                {
                    Icon(
                        imageVector = Icons.Filled.Done,
                        contentDescription = "Done icon",
                        modifier = Modifier.size(FilterChipDefaults.IconSize)
                    )
                }
            } else {
                null
            },
        )
    }
}

