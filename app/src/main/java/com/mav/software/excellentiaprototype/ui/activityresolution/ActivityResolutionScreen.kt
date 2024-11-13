package com.mav.software.excellentiaprototype.ui.activityresolution

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mav.software.excellentiaprototype.R
import com.mav.software.excellentiaprototype.ui.shared.components.ScaffoldExample

@Preview(showBackground = true)
@Composable
fun ActivityResolutionScreen(
    modifier: Modifier = Modifier
) {
    ScaffoldExample(
        modifier = modifier.verticalScroll(
            state = rememberScrollState()
        ),
        title = "Resolución de actividad"
    ) {
        Text(
            modifier = Modifier
                .padding(20.dp),
            text = "¿Qué es la curva del olvido?",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            modifier = Modifier.padding(20.dp),
            text = CURVA_OLVIDO_TEXT,
            textAlign = TextAlign.Justify,
            fontSize = 15.sp,
            lineHeight = 20.sp
        )
        Text(
            modifier = Modifier.padding(50.dp),
            text = EBBIN_TEXT,
            textAlign = TextAlign.Justify,
            fontSize = 15.sp,
            lineHeight = 18.sp,
            fontStyle = FontStyle.Italic
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

private const val CURVA_OLVIDO_TEXT = "La curva del olvido es un parámetro que muestra cómo " +
        "la información se pierde con el tiempo cuando no se intenta retenerla.\n" +
        "A finales del siglo XIX, el psicólogo alemán Hermann Ebbinghaus puso a prueba su memoria " +
        "midiendo el aprendizaje y el olvido durante varios períodos de tiempo, lo que le llevó a " +
        "descubrir la pérdida de memoria a lo largo del tiempo."

private const val EBBIN_TEXT = "Cuando se aprende algo por primera vez la información " +
        "desaparece a un ritmo exponencial, es decir, que la mayor parte de la información se " +
        "pierde en los primeros días tras lo cual el ritmo de pérdida disminuye. Esto visualmente " +
        "se refleja en la pronunciada caída al principio de la curva del olvido."
