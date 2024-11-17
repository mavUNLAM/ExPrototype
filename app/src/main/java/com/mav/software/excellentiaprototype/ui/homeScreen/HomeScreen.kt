package com.mav.software.excellentiaprototype.ui.homeScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mav.software.excellentiaprototype.ui.shared.components.ScaffoldExample
import com.mav.software.excellentiaprototype.ui.theme.GrassGreen

@Composable
fun HomeScreen(
    modifier: Modifier,
    name: String
) {
    ScaffoldExample(
        modifier = modifier,
        title = "Bienvenido $name!",
        content = {
            Column(
                verticalArrangement = Arrangement.spacedBy(20.dp),
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxSize()
            ) {
                Text("Actividades")

                Column(
                    verticalArrangement = Arrangement.spacedBy(20.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(GrassGreen)
                        .padding(10.dp)
                ) {
                    Text(
                        text = "Crear actividad",
                    )
                    Text(
                        text = "Ver actividades",
                    )
                }

                Column(
                    verticalArrangement = Arrangement.spacedBy(20.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(GrassGreen)
                        .padding(10.dp)
                ) {
                    Text("Estadisticas",
                        modifier = Modifier.clickable {
                            // ACA LA ACCION
                        }
                    )

                }
            }
        }
     )
}

@Composable
@Preview
fun HomeScreenPreview() {
    HomeScreen(
        modifier = Modifier,
        name = "Juan Carlos Otero"
    )
}