package com.mav.software.excellentiaprototype.ui.createactivity.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.lerp
import com.mav.software.excellentiaprototype.ui.theme.ExcellentiaPrototypeTheme
import kotlin.math.absoluteValue

@Composable
fun HorizontalActivityPagerExample(
    modifier: Modifier = Modifier
) {
    val pagerState = rememberPagerState { 3 }
    val itemSpacing = 8.dp
    val coroutineScope = rememberCoroutineScope()


    Box(modifier = modifier) {
        HorizontalPager(
            modifier = Modifier,
            state = pagerState,
            contentPadding = PaddingValues(horizontal = 32.dp),
            pageSpacing = itemSpacing
        ) { page ->
            MultipleChoiceExample(
                modifier = Modifier
                    .padding(5.dp)
                    .graphicsLayer {
                        val pageOffset = ((pagerState.currentPage - page) + pagerState
                            .currentPageOffsetFraction).absoluteValue
                        alpha = lerp(
                            start = 0.5f,
                            stop = 1f,
                            fraction = 1f - pageOffset.coerceIn(0f, 1f)
                        )
                    }
            )
        }
        Row(
            Modifier
                .wrapContentHeight()
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .padding(bottom = 8.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            repeat(pagerState.pageCount) { iteration ->
                val color = if (pagerState.currentPage == iteration) Color.DarkGray else Color.LightGray
                Box(
                    modifier = Modifier
                        .padding(2.dp)
                        .clip(CircleShape)
                        .background(color)
                        .size(16.dp)
                )
            }
        }

    }

}

@Preview(showBackground = true)
@Composable
private fun HorizontalActivityPagerExamplePreview() {
    ExcellentiaPrototypeTheme {
        HorizontalActivityPagerExample()
    }
}
