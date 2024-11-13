package com.mav.software.excellentiaprototype.ui.statisticsList

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun StatisticListScreen(
    students: List<String>,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Text("Listado estudiantes", fontSize = 32.sp)

        for(name in students) {
            Row(modifier = Modifier
                .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp),
                verticalAlignment = Alignment.CenterVertically)
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview
fun StatisticListScreenPreview(){
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Resolvieron actividad 1") },
                navigationIcon = { IconButton(onClick = {}){
                    Icon(
                        Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "")
                } }
            )
        },
        content = { padding ->
            StatisticListScreen(
                students = listOf(
                   "Bolsano, Nicolas", "Ñino, Matias", "Zapato, Ezequiel"
                ),
                modifier = Modifier.padding(padding)
            )
        }
    )
}