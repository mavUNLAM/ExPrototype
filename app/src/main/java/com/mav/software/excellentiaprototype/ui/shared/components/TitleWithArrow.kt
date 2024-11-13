package com.mav.software.excellentiaprototype.ui.shared.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TitleWithArrow(
    modifier: Modifier = Modifier,
    title: String = "Title",
    fontSize: TextUnit = 22.sp,
    minLines: Int = 2
) {
    Row(
        modifier = modifier
            .padding(top = 10.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            modifier = Modifier
                .weight(0.75f)
                .padding(start = 10.dp, end = 10.dp),
            text = title,
            fontSize = fontSize,
            fontWeight = FontWeight.Bold,
            minLines = minLines
        )
        Icon(
            Icons.Default.KeyboardArrowDown,
            contentDescription = "Flechita abajo",
            modifier = Modifier.padding(end = 10.dp)
        )
    }
}
