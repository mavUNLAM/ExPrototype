package com.mav.software.excellentiaprototype.ui.createactivity.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mav.software.excellentiaprototype.ui.theme.ExcellentiaPrototypeTheme

@Composable
fun HorizontalActivityPagerExample(
    modifier: Modifier = Modifier
) {
    val pageState = rememberPagerState { 3 }

    Column(modifier = modifier) {
        HorizontalPager(
            modifier = Modifier,
            state = pageState
        ) {
            MultipleChoiceExample()
        }

    }

}

@Preview(showBackground = true)
@Composable
fun HorizontalActivityPagerExamplePreview() {
    ExcellentiaPrototypeTheme {
        HorizontalActivityPagerExample()
    }
}