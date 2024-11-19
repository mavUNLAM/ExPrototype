package com.mav.software.excellentiaprototype.ui.homeScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddChart
import androidx.compose.material.icons.filled.AddTask
import androidx.compose.material.icons.filled.AssignmentLate
import androidx.compose.material.icons.filled.BarChart
import androidx.compose.material.icons.filled.Checklist
import androidx.compose.material.icons.filled.FormatListNumbered
import androidx.compose.material.icons.filled.FormatListNumberedRtl
import androidx.compose.material.icons.filled.PieChart
import androidx.compose.material.icons.filled.PieChartOutline
import androidx.compose.material.icons.filled.SmartToy
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.mav.software.excellentiaprototype.ui.shared.components.ScaffoldExample
import com.mav.software.excellentiaprototype.ui.shared.components.createFakeNavController
import com.mav.software.excellentiaprototype.ui.theme.ExcellentiaPrototypeTheme

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
) {
    Box {
        Column(
            modifier = modifier
                .padding(16.dp)
                .fillMaxSize()
        ) {
            Text(
                "Excellentia Studies",
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.Bold,
                fontSize = 48.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 10.dp),
            )
            Text("El camino a la excelencia académica",
                fontWeight = FontWeight.Thin,
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 10.dp),
            )
        }

        Column(
            verticalArrangement = Arrangement
                .spacedBy(
                    20.dp,
                    alignment = Alignment.CenterVertically
                ),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier =
                Modifier
                    .fillMaxSize()
                    .padding(10.dp),
        ) {
            Text(
                "Seleccione una opcion",
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 10.dp),
            )

            Button(
                modifier = Modifier
                    .height(50.dp),
                shape = RoundedCornerShape(12.dp),
                onClick = {
                    navController.navigate("CreateActivityScreen")
                }
            ) {
                Row {
                    Icon(
                        Icons.Default.AddTask,
                        contentDescription = "Crear actividad",
                        tint = MaterialTheme.colorScheme.background
                    )

                    Text(
                        text = "Crear actividad",
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        modifier =
                        Modifier
                            .fillMaxWidth()
                    )
                }
            }

            Button(
                modifier = Modifier
                    .height(50.dp),
                shape = RoundedCornerShape(12.dp),
                onClick = {
                    navController.navigate("DoActivityConfigurationScreen")
                }
            ) {
                Row {
                    Icon(
                        Icons.Default.Checklist,
                        contentDescription = "Ver actividades",
                        tint = MaterialTheme.colorScheme.background
                    )

                    Text(
                        text = "Ver actividades",
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                }
            }

            Button(
                modifier = Modifier
                    .height(50.dp),
                shape = RoundedCornerShape(12.dp),
                onClick = {
                    navController.navigate("StatisticsScreen")
                }
            ) {
                Row {
                    Icon(
                        Icons.Default.BarChart,
                        contentDescription = "Estadisticas",
                        tint = MaterialTheme.colorScheme.background
                    )

                    Text(
                        text = "Estadisticas",
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier =
                        Modifier
                            .fillMaxWidth()
                    )
                }
            }
        }
    }
}

@Composable
@Preview
fun HomeScreenPreview() {
    ExcellentiaPrototypeTheme {
        ScaffoldExample(
            showBack = false,
            title = "Bienvenido Pepito!"
        ) {
            HomeScreen(
                navController = createFakeNavController(),
            )
        }
    }
}
