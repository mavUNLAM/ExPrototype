package com.mav.software.excellentiaprototype.ui.statisticsList

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mav.software.excellentiaprototype.ui.shared.components.ScaffoldExample

@Composable
fun StatisticListScreen(
    students: List<String>,
    modifier: Modifier = Modifier
) {
    ScaffoldExample(modifier = modifier,
        title = "Resolvieron actividad 1"
    ) {
        Column(
            modifier = modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Text("Listado estudiantes", fontSize = 32.sp,
                modifier = Modifier
                    .padding(horizontal = 10.dp)
            )

            for (name in students) {
                Row(
                    modifier = Modifier
                        .padding(horizontal = 16.dp),
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    verticalAlignment = Alignment.CenterVertically
                )
                {
                    Box(
                        modifier = Modifier
                            .size(5.dp)
                            .clip(CircleShape)
                            .background(Color.Black)
                    )
                    Text(name, fontSize = 16.sp)
                }
            }
        }
    }
}

@Composable
@Preview
fun StatisticListScreenPreview(){
    StatisticListScreen(
        students = listOf(
            "Bolsano, Nicolas", "Ñino, Matias", "Zapato, Ezequiel"
        )
    )
}