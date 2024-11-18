package com.mav.software.excellentiaprototype.ui.createactivity

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.mav.software.excellentiaprototype.R
import com.mav.software.excellentiaprototype.ui.createactivity.components.HorizontalActivityPagerExample
import com.mav.software.excellentiaprototype.ui.createactivity.components.MultipleChoiceExample
import com.mav.software.excellentiaprototype.ui.shared.components.ScaffoldExample
import com.mav.software.excellentiaprototype.ui.shared.components.createFakeNavController
import com.mav.software.excellentiaprototype.ui.theme.ExcellentiaPrototypeTheme

@Composable
fun CreateActivityScreen(
    modifier: Modifier = Modifier
) {
    ScaffoldExample(
        modifier = modifier,
        title = "Seleccionar actividad",
        navController = createFakeNavController()
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

@PreviewLightDark
@Composable
private fun CreateActivityScreenPreview() {
    ExcellentiaPrototypeTheme {
        CreateActivityScreen()
    }
}

@Composable
fun CreateActivityScreen2(
    modifier: Modifier = Modifier.fillMaxSize()
) {
    var questionText by remember { mutableStateOf("") }
    var option1Text by remember { mutableStateOf("") }
    var option2Text by remember { mutableStateOf("") }
    var option3Text by remember { mutableStateOf("") }
    var option4Text by remember { mutableStateOf("") }

    ScaffoldExample(
        modifier = modifier,
        title = "Crear actividad",
        navController = createFakeNavController()
    ) {
        val commonModifier = Modifier
            .align(Alignment.CenterHorizontally)
            .padding(horizontal = 20.dp)
            .fillMaxWidth()

        Box(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(R.drawable.image_example),
                contentDescription = "ImageMultipleChoice",
                colorFilter = ColorFilter.tint(
                    color = MaterialTheme.colorScheme.onBackground
                )
            )
            FilledTonalButton(
                onClick = {}
            ) {
                Text(text = "Galería")
            }
        }
        OutlinedTextField(
            modifier = commonModifier,
            value = questionText,
            onValueChange = { questionText = it },
            label = { Text(text = "Pregunta") }
        )
        OutlinedTextField(
            modifier = commonModifier,
            value = option1Text,
            onValueChange = { option1Text = it },
            label = { Text(text = "Opción 1") },
            trailingIcon = { Checkbox(
                checked = true,
                onCheckedChange = {}
            ) }
        )
        OutlinedTextField(
            modifier = commonModifier,
            value = option2Text,
            onValueChange = { option2Text = it },
            label = { Text(text = "Opción 2") },
            trailingIcon = { Checkbox(
                checked = false,
                onCheckedChange = {}
            ) }
        )
        OutlinedTextField(
            modifier = commonModifier,
            value = option3Text,
            onValueChange = { option3Text = it },
            label = { Text(text = "Opción 3") },
            trailingIcon = { Checkbox(
                checked = false,
                onCheckedChange = {}
            ) }
        )
        OutlinedTextField(
            modifier = commonModifier,
            value = option4Text,
            onValueChange = { option4Text = it },
            label = { Text(text = "Opción 4") },
            trailingIcon = { Checkbox(
                checked = false,
                onCheckedChange = {}
            ) }
        )
        FilledTonalButton(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            onClick = {}
        ) {
            Text(text = "Preview")
        }
    }
}

@PreviewLightDark
@Composable
fun CreateActivityScreen2Preview() {
    ExcellentiaPrototypeTheme {
        CreateActivityScreen2()
    }
}

@Composable
fun CreateActivityScreen3(
    modifier: Modifier = Modifier
) {
    ScaffoldExample(
        modifier = modifier,
        title = "Preview",
        navController = createFakeNavController()
    ) {
        MultipleChoiceExample(
            modifier = Modifier
                .padding(horizontal = 20.dp)
        )
        FilledTonalButton(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            onClick = {},
            colors = ButtonDefaults.filledTonalButtonColors().copy(
                contentColor = MaterialTheme.colorScheme.onPrimaryContainer,
                containerColor = MaterialTheme.colorScheme.primaryContainer
            )
        ) {
            Text(text = "Guardar")
        }
    }
}

@PreviewLightDark
@Composable
fun CreateActivityScreen3Preview() {
    ExcellentiaPrototypeTheme {
        CreateActivityScreen3()
    }
}
