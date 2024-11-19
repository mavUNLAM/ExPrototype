package com.mav.software.excellentiaprototype.ui.activityresolution

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.mav.software.excellentiaprototype.R
import com.mav.software.excellentiaprototype.ui.shared.components.ScaffoldExample
import com.mav.software.excellentiaprototype.ui.theme.ExcellentiaPrototypeTheme

@Composable
fun ActivityResolutionScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.verticalScroll(
            state = rememberScrollState()
        )
    ) {
        Text(
            modifier = Modifier
                .padding(start = 20.dp, top = 30.dp, end = 20.dp, bottom = 10.dp),
            text = "¿Qué es la curva del olvido?",
            style = MaterialTheme.typography.headlineMedium
        )
        Text(
            modifier = Modifier.padding(20.dp),
            text = CURVA_OLVIDO_TEXT,
            textAlign = TextAlign.Justify,
            style = MaterialTheme.typography.bodyMedium
        )
        Text(
            modifier = Modifier.padding(horizontal = 50.dp, vertical = 10.dp),
            text = EBBIN_TEXT,
            textAlign = TextAlign.Justify,
            fontStyle = FontStyle.Italic,
            style = MaterialTheme.typography.bodyMedium
        )
        Image(
            modifier = Modifier
                .padding(20.dp)
                .fillMaxWidth(),
            painter = painterResource(R.drawable.curva_olvido),
            contentDescription = "Image",
            contentScale = ContentScale.FillWidth
        )
    }
}

@PreviewLightDark
@Composable
private fun ActivityResolutionScreenPreview() {
    ExcellentiaPrototypeTheme {
        ScaffoldExample(
            title = "Resolucion de actividad"
        ) {
            ActivityResolutionScreen()
        }
    }
}

private const val CURVA_OLVIDO_TEXT = "La curva del olvido es un parámetro que muestra cómo " +
        "la información se pierde con el tiempo cuando no se intenta retenerla.\n" +
        "A finales del siglo XIX, el psicólogo alemán Hermann Ebbinghaus puso a prueba su memoria " +
        "midiendo el aprendizaje y el olvido durante varios períodos de tiempo, lo que le llevó a " +
        "descubrir la pérdida de memoria a lo largo del tiempo."

private const val EBBIN_TEXT = "Cuando se aprende algo por primera vez la información " +
        "desaparece a un ritmo exponencial, es decir, que la mayor parte de la información se " +
        "pierde en los primeros días tras lo cual el ritmo de pérdida disminuye. Esto visualmente " +
        "se refleja en la pronunciada caída al principio de la curva del olvido."
