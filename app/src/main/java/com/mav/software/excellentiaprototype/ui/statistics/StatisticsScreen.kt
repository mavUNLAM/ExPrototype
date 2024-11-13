package com.mav.software.excellentiaprototype.ui.statistics

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mav.software.excellentiaprototype.model.Statistic
import com.mav.software.excellentiaprototype.ui.statistics.components.ChartListItem
import com.mav.software.excellentiaprototype.ui.statistics.components.PieChart
import com.mav.software.excellentiaprototype.ui.theme.GrassGreen
import com.mav.software.excellentiaprototype.ui.theme.PurpleGrey40

@Composable
fun StatisticsScreen(
    viewModel: StatisticsViewModel,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .padding(horizontal = 10.dp),
        verticalArrangement = Arrangement.spacedBy(30.dp)
    ) {
        Text(
            text = viewModel.title,
            fontSize = 32.sp
        )

        PieChart(
            data = viewModel.statistics,
            modifier = Modifier
                .padding(horizontal = 12.dp)
                .fillMaxWidth()
                .aspectRatio(1f)
        )

        Column(
            modifier = Modifier
                .padding(horizontal = 24.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            for(statistic in viewModel.statistics) {
                ChartListItem(statistic.title, statistic.percent, statistic.color)
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun StatisticsPreview() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Estadisticas comision") },
                navigationIcon = { IconButton(onClick = {}){
                    Icon(
                        Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "")
                } }
            )
        },
        content = { padding ->
            StatisticsScreen(
                viewModel = StatisticsViewModel(
                    title = "Actividad 1",
                    statistics = listOf(
                        Statistic("No resolvieron", 25f, PurpleGrey40),
                        Statistic("Resolvieron", 75f, GrassGreen),
                    )
                ),
                modifier = Modifier.padding(padding)
            )
        }
    )
}