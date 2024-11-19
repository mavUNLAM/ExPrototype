package com.mav.software.excellentiaprototype.ui.doactivity.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun AnswerResultCard(
    modifier: Modifier = Modifier,
    option: Int = 2,
    percentage: Double = 0.5,
    isCorrectAnswer: Boolean = true,
    onDismissRequest: () -> Unit = {}
) {
    val title = if (isCorrectAnswer) "Respuesta correcta" else "Respuesta incorrecta"
    var body = if (isCorrectAnswer) "Has acertado con la opción $option." else "La opción $option es incorrecta."
    body += if(isCorrectAnswer) " Formas parte del $percentage% de estudiantes que ha acertado." else ""
    ElevatedCard(
        modifier = modifier,
    ) {
        Text(
            text = title,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
        )
        Text(
            modifier = Modifier
                .padding(20.dp)
                .fillMaxWidth(),
            fontSize = 15.sp,
            textAlign = TextAlign.Justify,
            text = body
        )
        Row(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            FilledTonalButton(
                onClick = {
                    onDismissRequest()
                }
            ) {
                Text(text = "Descansar")
            }
            FilledTonalButton(
                onClick = {
                    onDismissRequest()
                }
            ) {
                Text(text = "Seguir estudiando")
            }
        }
        OutlinedButton(
            modifier = Modifier
                .padding(10.dp)
                .align(Alignment.CenterHorizontally),
            onClick = {
                onDismissRequest()
            }
        ) {
            Text(text = "Ver resolución")
        }
    }
}
