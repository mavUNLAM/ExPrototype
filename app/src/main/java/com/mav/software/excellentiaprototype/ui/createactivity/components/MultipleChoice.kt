package com.mav.software.excellentiaprototype.ui.createactivity.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.mav.software.excellentiaprototype.R
import com.mav.software.excellentiaprototype.ui.model.MultipleChoiceUi
import com.mav.software.excellentiaprototype.ui.theme.ExcellentiaPrototypeTheme

@Composable
fun MultipleChoiceExample(
    modifier: Modifier = Modifier,
    multipleChoice: MultipleChoiceUi = multipleChoiceUiExample,
    elevation: Dp = 5.dp,
    paddingSpacer: Dp = 5.dp
) {
    ElevatedCard(
        modifier = modifier,
        elevation = CardDefaults.elevatedCardElevation(
            defaultElevation = elevation
        ),
        colors = CardDefaults.elevatedCardColors(
            containerColor = MaterialTheme.colorScheme.secondaryContainer
        )
    ) {
        Column(
            modifier = Modifier.padding(10.dp),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            if(multipleChoice.thumbnail != null) {
                Spacer(
                    modifier = Modifier.padding(paddingSpacer)
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(4.dp),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        modifier = Modifier,
                        painter = painterResource(id = multipleChoice.thumbnail),
                        contentDescription = "Imagen multiplechoice",
                        colorFilter = ColorFilter.tint(
                            color = MaterialTheme.colorScheme.onSecondaryContainer
                        )
                    )
                }
            }
            Spacer(
                modifier = Modifier.padding(paddingSpacer)
            )
            Text(
                modifier = Modifier
                    .padding(horizontal = 6.dp),
                text = multipleChoice.question,
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.SemiBold
            )
            HorizontalDivider(
                modifier = Modifier.padding(paddingSpacer),
                thickness = 2.dp
            )
            OutlinedCard(
                modifier = Modifier.padding(start = 3.dp, top = 3.dp, end = 3.dp),
                colors = CardDefaults.outlinedCardColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer
                )
            ) {
                Text(
                    modifier = Modifier.padding(8.dp),
                    text = multipleChoice.choices[0],
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.ExtraBold
                )
            }
            Spacer(
                modifier = Modifier.padding(paddingSpacer)
            )
            OutlinedCard(
                modifier = Modifier.padding(horizontal = 3.dp)
            ){
                Text(
                    modifier = Modifier.padding(8.dp),
                    text = multipleChoice.choices[1],
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(
                modifier = Modifier.padding(paddingSpacer)
            )
            OutlinedCard(
                modifier = Modifier.padding(horizontal = 3.dp)
            ){
                Text(
                    modifier = Modifier.padding(8.dp),
                    text = multipleChoice.choices[2],
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(
                modifier = Modifier.padding(paddingSpacer)
            )
            OutlinedCard(
                modifier = Modifier.padding(horizontal = 3.dp)
            ){
                Text(
                    modifier = Modifier.padding(8.dp),
                    text = multipleChoice.choices[3],
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(
                modifier = Modifier.padding(paddingSpacer)
            )
        }
    }

}

private const val loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
private val multipleChoiceUiExample = MultipleChoiceUi(
    question = "Pregunta multiplechoice: $loremIpsum",
    choices = listOf(
        "Opción 1: $loremIpsum",
        "Opción 2: $loremIpsum",
        "Opción 3: $loremIpsum",
        "Opción 4: $loremIpsum"
    ),
    correctAnswer = "Opción 3: $loremIpsum",
    thumbnail = R.drawable.image_example
)

@PreviewLightDark
@Composable
private fun MultipleChoiceExamplePreview() {
    ExcellentiaPrototypeTheme {
        MultipleChoiceExample()
    }
}
