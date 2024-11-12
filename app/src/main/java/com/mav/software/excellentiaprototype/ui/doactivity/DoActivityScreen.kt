package com.mav.software.excellentiaprototype.ui.doactivity

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mav.software.excellentiaprototype.ui.doactivity.components.SubjectList
import com.mav.software.excellentiaprototype.ui.doactivity.components.defaultFinishedList
import com.mav.software.excellentiaprototype.ui.shared.components.ScaffoldExample
import com.mav.software.excellentiaprototype.ui.shared.components.TitleWithArrow

@Preview(showBackground = true)
@Composable
fun DoActivityConfigurationScreen(
    modifier: Modifier = Modifier
) {
    ScaffoldExample(
        modifier = modifier,
        title = "Configuración de actividades"
    ) {
        Column(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            TitleWithArrow(
                modifier = Modifier
                    .padding(top = 10.dp)
                    .fillMaxWidth(),
                title = "Aparecerán las actividades de las siguientes materias"
            )
            Text(
                modifier = Modifier.padding(top = 10.dp, start = 10.dp, end = 10.dp),
                text = "Materias activas",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            SubjectList()
            Text(
                modifier = Modifier.padding(top = 20.dp, start = 10.dp, end = 10.dp),
                text = "Materias pasadas",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            SubjectList(
                list = defaultFinishedList
            )
            TitleWithArrow(
                modifier = Modifier
                    .padding(top = 10.dp)
                    .fillMaxWidth(),
                title = "Seleccionar tipo de actividad",
                minLines = 1
            )
            SubjectList(
                list = listOf("Multiple choice", "Verdadero o falso", "Etc.")
            )
        }
    }
}
