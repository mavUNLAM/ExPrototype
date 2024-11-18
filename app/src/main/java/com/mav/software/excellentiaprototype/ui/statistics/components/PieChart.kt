package com.mav.software.excellentiaprototype.ui.statistics.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mav.software.excellentiaprototype.model.Statistic

@Composable
fun PieChart(
    data: List<Statistic>,
    modifier: Modifier = Modifier)
{
    Canvas(modifier = modifier) {
        var startAngle = -90f
        val percentages = mutableListOf<Float>()
        for(stat in data) {
            percentages.add(stat.percent)
        }

        data.forEachIndexed { index, value ->
            val sweepAngle = (value.percent / percentages.sum()) * 360f
            drawArc(
                color = data[index].color,
                startAngle = startAngle,
                sweepAngle = sweepAngle,
                useCenter = true
            )
            startAngle += sweepAngle
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PieChartPreview() {
    val data = listOf(
        Statistic("Resolvieron", 75f, MaterialTheme.colorScheme.primary),
        Statistic("No resolvieron", 25f, MaterialTheme.colorScheme.secondary)
    )
    PieChart(data = data, modifier = Modifier.size(200.dp))
}
