package com.mav.software.excellentiaprototype.ui.createactivity.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.mav.software.excellentiaprototype.R
import com.mav.software.excellentiaprototype.ui.model.MultipleChoiceUi
import com.mav.software.excellentiaprototype.ui.theme.ExcellentiaPrototypeTheme

@Composable
fun MultipleChoiceExample(
    modifier: Modifier = Modifier,
    multipleChoice: MultipleChoiceUi
) {
    Column(
        modifier = modifier
            .scrollable(
                state = rememberScrollState(),
                enabled = true,
                orientation = Orientation.Vertical,
            )
    ) {
        if(multipleChoice.thumbnail != null) {
            Image(
                modifier = Modifier,
                painter = painterResource(id = multipleChoice.thumbnail),
                contentDescription = "Imagen multiplechoice"
            )
        }
        Text(
            modifier = Modifier,
            text = multipleChoice.question
        )
        multipleChoice.choices.forEach { choice ->
            Text(
                modifier = Modifier,
                text = choice
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun MultipleChoiceExamplePreview() {
    val loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. In commodo libero " +
            "non tellus finibus porta. Mauris id pretium purus. Nulla sagittis mi ut nibh tristique dapibus."
    val multipleChoice = MultipleChoiceUi(
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
    ExcellentiaPrototypeTheme {
        MultipleChoiceExample(
            modifier = Modifier,
            multipleChoice = multipleChoice
        )
    }
}
