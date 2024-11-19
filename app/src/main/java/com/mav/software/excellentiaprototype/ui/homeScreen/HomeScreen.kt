package com.mav.software.excellentiaprototype.ui.homeScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.mav.software.excellentiaprototype.ui.shared.components.ScaffoldExample
import com.mav.software.excellentiaprototype.ui.shared.components.createFakeNavController
import com.mav.software.excellentiaprototype.ui.theme.ExcellentiaPrototypeTheme

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(20.dp),
        modifier =
            modifier
                .padding(16.dp)
                .fillMaxSize(),
    ) {
        Text("Seleccione una opcion")

        Column(
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier =
                Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
        ) {

            Button(onClick = {
                navController.navigate("CreateActivityScreen")
            }) {
                Text(
                    text = "Crear actividad",
                    textAlign = TextAlign.Center,
                    modifier =
                        Modifier
                            .fillMaxWidth()
                )
            }

            Button(onClick = {
                navController.navigate("DoActivityConfigurationScreen")
            }) {
                Text(
                    text = "Ver actividades",
                    textAlign = TextAlign.Center,
                    modifier =
                        Modifier
                            .fillMaxWidth()
                )
            }

            Button(onClick = {
                navController.navigate("StatisticsScreen")
            }) {
                Text(
                    text = "Estadisticas",
                    textAlign = TextAlign.Center,
                    modifier =
                        Modifier
                            .fillMaxWidth()
                )
            }
        }
    }
}

@Composable
@Preview
fun HomeScreenPreview() {
    ExcellentiaPrototypeTheme {
        ScaffoldExample(
            title = "Bienvenido Pepito!"
        ) {
            HomeScreen(
                navController = createFakeNavController(),
            )
        }
    }
}
