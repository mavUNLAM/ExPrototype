package com.mav.software.excellentiaprototype.ui.doactivity

import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mav.software.excellentiaprototype.ui.doactivity.components.SubjectList
import com.mav.software.excellentiaprototype.ui.doactivity.components.defaultFinishedList
import com.mav.software.excellentiaprototype.ui.shared.components.ScaffoldExample

@Preview(showBackground = true)
@Composable
fun DoActivityScreen(
    modifier: Modifier = Modifier
) {

    ScaffoldExample(
        modifier = modifier,
        title = "Seleccionar materias"
    ) {
        Text(text = "Materias activas")
        SubjectList()
        HorizontalDivider()
        Text(text = "Materias pasadas")
        SubjectList(
            list = defaultFinishedList
        )
    }
}

