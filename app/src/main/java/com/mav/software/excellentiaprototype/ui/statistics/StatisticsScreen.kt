package com.mav.software.excellentiaprototype.ui.statistics

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mav.software.excellentiaprototype.model.Statistic
import com.mav.software.excellentiaprototype.ui.shared.components.ScaffoldExample
import com.mav.software.excellentiaprototype.ui.statistics.components.ChartListItem
import com.mav.software.excellentiaprototype.ui.statistics.components.PieChart

@Composable
fun StatisticsScreen(
    viewModel: StatisticsViewModel,
    modifier: Modifier = Modifier
) {
    ScaffoldExample(
        modifier = modifier,
        title = "Estadisticas comision"
    ) {
        Column(
            modifier = modifier
                .fillMaxSize()
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
                for (statistic in viewModel.statistics) {
                    ChartListItem(statistic.title, statistic.percent, statistic.color)
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun StatisticsPreview() {
    StatisticsScreen(
        viewModel = StatisticsViewModel(
            title = "Actividad 1",
            statistics = listOf(
                Statistic("No resolvieron", 25f, MaterialTheme.colorScheme.secondary),
                Statistic("Resolvieron", 75f, MaterialTheme.colorScheme.primary),
            )
        )
    )
}
