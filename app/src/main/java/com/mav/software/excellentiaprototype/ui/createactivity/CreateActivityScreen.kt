package com.mav.software.excellentiaprototype.ui.createactivity

import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mav.software.excellentiaprototype.ui.createactivity.components.HorizontalActivityPagerExample
import com.mav.software.excellentiaprototype.ui.shared.components.ScaffoldExample

@Preview(showBackground = true)
@Composable
fun CreateActivityScreen(
    modifier: Modifier = Modifier
) {
    ScaffoldExample(
        modifier = modifier,
        title = "Create Activity"
    ) {
        HorizontalActivityPagerExample()
        FilledTonalButton(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            onClick = {}
        ) {
            Text(text = "Seleccionar")
        }
    }
}
