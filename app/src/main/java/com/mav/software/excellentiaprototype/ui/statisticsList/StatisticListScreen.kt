package com.mav.software.excellentiaprototype.ui.statisticsList

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mav.software.excellentiaprototype.ui.shared.components.ScaffoldExample
import com.mav.software.excellentiaprototype.ui.shared.components.createFakeNavController
import com.mav.software.excellentiaprototype.ui.theme.ExcellentiaPrototypeTheme

@Composable
fun StatisticListScreen(
    students: List<String>,
    modifier: Modifier = Modifier
) {
    ScaffoldExample(modifier = modifier,
        title = "Resolvieron actividad 1",
        navController = createFakeNavController()
    ) {
        Column(
            modifier = Modifier
                .verticalScroll(state = rememberScrollState())
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Text(
                text ="Listado estudiantes",
                modifier = Modifier
                    .padding(10.dp),
                style = MaterialTheme.typography.headlineMedium
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
                    Text(
                        text = name,
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
            }
        }
    }
}

private val students = listOf(
    "Smith, John William",
    "Jones, Emily Grace",
    "Brown, Michael David",
    "Davis, Jessica Ann",
    "Wilson, Christopher James",
    "Anderson, Ashley Marie",
    "Taylor, Matthew Robert",
    "Thomas, Sarah Elizabeth",
    "Moore, Daniel Joseph",
    "Martin, Brittany Nicole",
    "Jackson, Andrew Thomas",
    "Thompson, Madison Alexis",
    "White, Joshua Ryan",
    "Harris, Lauren Michelle",
    "Sanchez, Kevin Anthony",
    "Clark, Amber Lynn",
    "Lewis, Justin Patrick",
    "Robinson, Kayla Victoria",
    "Walker, Brian Christopher",
    "Hall, Megan Elizabeth"
).sorted()

@Composable
@Preview
fun StatisticListScreenPreview(){
    ExcellentiaPrototypeTheme {
        StatisticListScreen(
            students = students
        )
    }
}
