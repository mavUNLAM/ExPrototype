package com.mav.software.excellentiaprototype.ui.doactivity.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Checkbox
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun SubjectList(
    modifier: Modifier = Modifier,
    list: List<String> = defaultActiveList
) {
    LazyColumn(
        modifier = modifier
    ) {
        items(list) { subject ->
            SubjectItem(
                modifier = Modifier.fillMaxWidth(),
                text = subject
            )
            HorizontalDivider()
        }
    }
}

val defaultActiveList = listOf(
    "Desarrollo de interfaces", "Taller de programación"
)

val defaultFinishedList = listOf(
    "Programación móvil 1", "Programación móvil 2", "Programación móvil 3"
)

@Preview(showBackground = true)
@Composable
fun SubjectItem(
    modifier: Modifier = Modifier,
    text: String = "Subject"
) {
    var isChecked by remember { mutableStateOf(false) }
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            modifier = Modifier.padding(start = 10.dp),
            text = text
        )
        Checkbox(
            checked = isChecked,
            onCheckedChange = {
                isChecked = it
            }
        )
    }
}
