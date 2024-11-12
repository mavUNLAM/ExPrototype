package com.mav.software.excellentiaprototype.ui.createactivity

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.mav.software.excellentiaprototype.R
import com.mav.software.excellentiaprototype.ui.createactivity.components.HorizontalActivityPagerExample
import com.mav.software.excellentiaprototype.ui.shared.components.ScaffoldExample

@Preview(showBackground = true)
@Composable
fun CreateActivityScreen(
    modifier: Modifier = Modifier
) {
    ScaffoldExample(
        modifier = modifier,
        title = "Seleccionar actividad"
    ) {
        HorizontalActivityPagerExample()
        FilledTonalButton(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            onClick = {}
        ) {
            Text(text = "Seleccionar")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CreateActivityScreen2(
    modifier: Modifier = Modifier
) {
    var questionText by remember { mutableStateOf("") }
    var option1Text by remember { mutableStateOf("") }
    var option2Text by remember { mutableStateOf("") }
    var option3Text by remember { mutableStateOf("") }
    var option4Text by remember { mutableStateOf("") }

    ScaffoldExample(
        modifier = modifier,
        title = "Crear actividad"
    ) {
        Column {
            Box(
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(R.drawable.image_example),
                    contentDescription = "ImageMultipleChoice"
                )
                FilledTonalButton(
                    onClick = {}
                ) {
                    Text(text = "Galería")
                }
            }
            OutlinedTextField(
                value = questionText,
                onValueChange = { questionText = it },
                label = { Text(text = "Pregunta") }
            )
            OutlinedTextField(
                value = option1Text,
                onValueChange = { option1Text = it },
                label = { Text(text = "Opción 1") }
            )
            OutlinedTextField(
                value = option2Text,
                onValueChange = { option2Text = it },
                label = { Text(text = "Opción 2") }
            )
            OutlinedTextField(
                value = option3Text,
                onValueChange = { option3Text = it },
                label = { Text(text = "Opción 3") }
            )
            OutlinedTextField(
                value = option4Text,
                onValueChange = { option4Text = it },
                label = { Text(text = "Opción 4") }
            )
            FilledTonalButton(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                onClick = {}
            ) {
                Text(text = "Preview")
            }
        }
    }
}
