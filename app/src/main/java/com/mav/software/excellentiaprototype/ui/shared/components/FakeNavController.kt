package com.mav.software.excellentiaprototype.ui.shared.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import androidx.navigation.testing.TestNavHostController

@Composable
fun createFakeNavController() : NavController {
    return TestNavHostController(context = LocalContext.current)
}