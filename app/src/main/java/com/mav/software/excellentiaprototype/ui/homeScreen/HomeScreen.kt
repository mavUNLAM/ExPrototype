package com.mav.software.excellentiaprototype.ui.homeScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.mav.software.excellentiaprototype.ui.shared.components.createFakeNavController
import com.mav.software.excellentiaprototype.ui.theme.ExcellentiaPrototypeTheme

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(20.dp),
        modifier = modifier
            .padding(16.dp)
            .fillMaxSize()
    ) {
        Text("Actividades")

        Column(
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.primaryContainer)
                .padding(10.dp)
        ) {
            Text(
                color = MaterialTheme.colorScheme.background,
                text = "Crear actividad",
                modifier = Modifier
                    .clickable {
                        navController.navigate("CreateActivityScreen")
                    }
            )
            Text(
                color = MaterialTheme.colorScheme.background,
                text = "Ver actividades",
            )
        }

        Column(
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.primaryContainer)
                .padding(10.dp)
        ) {
            Text("Estadisticas",
                color = MaterialTheme.colorScheme.background,
                modifier = Modifier
                    .clickable {
                        navController.navigate("StatisticsScreen")
                    }
            )

        }
    }
}

@Composable
@Preview
fun HomeScreenPreview() {
    ExcellentiaPrototypeTheme {
        Scaffold() { padding ->
            HomeScreen(
                modifier = Modifier.padding(padding),
                navController = createFakeNavController()
            )
        }
    }
}