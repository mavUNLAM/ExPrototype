package com.mav.software.excellentiaprototype.ui.doactivity

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.navigation.NavController
import com.mav.software.excellentiaprototype.ui.createactivity.components.MultipleChoiceExample
import com.mav.software.excellentiaprototype.ui.doactivity.components.AnswerResultCard
import com.mav.software.excellentiaprototype.ui.doactivity.components.SubjectList
import com.mav.software.excellentiaprototype.ui.doactivity.components.defaultFinishedList
import com.mav.software.excellentiaprototype.ui.shared.components.ScaffoldExample
import com.mav.software.excellentiaprototype.ui.shared.components.TitleWithArrow
import com.mav.software.excellentiaprototype.ui.shared.components.createFakeNavController
import com.mav.software.excellentiaprototype.ui.theme.ExcellentiaPrototypeTheme

@Composable
fun DoActivityConfigurationScreen(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    Box(
        modifier = modifier,
    ) {
        Column(
            modifier =
                Modifier
                    .padding(5.dp)
                    .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            TitleWithArrow(
                modifier =
                    Modifier
                        .padding(top = 10.dp)
                        .fillMaxWidth(),
                title = "Aparecerán las actividades de las siguientes materias",
            )
            Text(
                modifier = Modifier.padding(top = 10.dp, start = 10.dp, end = 10.dp),
                text = "Materias activas",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
            )
            SubjectList()
            Text(
                modifier = Modifier.padding(top = 20.dp, start = 10.dp, end = 10.dp),
                text = "Materias pasadas",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
            )
            SubjectList(
                list = defaultFinishedList,
            )
            TitleWithArrow(
                modifier =
                    Modifier
                        .padding(top = 10.dp)
                        .fillMaxWidth(),
                title = "Seleccionar tipo de actividad",
                minLines = 1,
            )
            SubjectList(
                list = listOf("Multiple choice", "Verdadero o falso"),
            )

            Button(
                modifier = Modifier
                    .fillMaxWidth(0.75f)
                    .height(40.dp)
                    .align(Alignment.CenterHorizontally),
                onClick = {
                    navController.navigate("DoActivityScreen")
                },
                colors = ButtonDefaults.filledTonalButtonColors().copy(
                    contentColor = MaterialTheme.colorScheme.onPrimaryContainer,
                    containerColor = MaterialTheme.colorScheme.primaryContainer
                )
            ) {
                Text(text = "Siguiente")
            }
        }
    }
}

@PreviewLightDark
@Composable
private fun DoActivityConfigurationScreenPreview() {
    ExcellentiaPrototypeTheme {
        ScaffoldExample(
            title = "Configuracion de actividades",
        ) {
            DoActivityConfigurationScreen(navController = createFakeNavController())
        }
    }
}

@Composable
fun DoActivityScreen(
    navController: NavController = createFakeNavController(),
    modifier: Modifier = Modifier
) {
    var showPositive by remember { mutableStateOf(false) }
    var showNegative by remember { mutableStateOf(false) }

    Box {
        Column(
            modifier = modifier,
        ) {
            MultipleChoiceExample(
                modifier =
                Modifier
                    .fillMaxSize(),
                optionSelectedAction = { opcionSeleccionada ->
                    if(opcionSeleccionada == 1) {
                        showPositive = true
                    } else {
                        showNegative = true
                    }
                }
            )
        }

        if(showPositive) {
            DoActivityScreenPositiveResult(
                navController = navController,
                onDismissRequest = {
                    showPositive = false
                }
            )
        }

        if(showNegative) {
            DoActivityScreenNegativeResult(
                navController = navController,
                onDismissRequest = {
                    showNegative = false
                }
            )
        }
    }

}

@PreviewLightDark
@Composable
private fun DoActivityScreenPreview() {
    ExcellentiaPrototypeTheme {
        ScaffoldExample(
            title = "Estudiando",
        ) {
            DoActivityScreen()
        }
    }
}

@Composable
fun DoActivityScreenPositiveResult(
    modifier: Modifier = Modifier,
    navController: NavController = createFakeNavController(),
    onDismissRequest: () -> Unit = {}
) {
    Column(
        modifier = modifier,
    ) {
        Dialog(
            onDismissRequest = {
                onDismissRequest()
            },
        ) {
            AnswerResultCard(
                navController = navController,
                onDismissRequest = {
                    onDismissRequest()
                }
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun DoActivityScreenPositiveResultPreview() {
    ExcellentiaPrototypeTheme {
        ScaffoldExample(
            title = "Estudiando",
        ) {
            MultipleChoiceExample(
                modifier = Modifier.fillMaxSize(),
            )

            DoActivityScreenPositiveResult()
        }
    }
}

@Composable
fun DoActivityScreenNegativeResult(
    modifier: Modifier = Modifier,
    navController: NavController = createFakeNavController(),
    onDismissRequest: () -> Unit = {}
) {
    Column(
        modifier = modifier,
    ) {
        Dialog(
            onDismissRequest = {
                onDismissRequest()
            },
        ) {
            AnswerResultCard(
                navController = navController,
                isCorrectAnswer = false,
                onDismissRequest = {
                    onDismissRequest()
                }
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun DoActivityScreenNegativeResultPreview() {
    ExcellentiaPrototypeTheme {
        ScaffoldExample(
            title = "Estudiando",
        ) {
            MultipleChoiceExample(
                modifier = Modifier.fillMaxSize(),
            )

            DoActivityScreenNegativeResult()
        }
    }
}
