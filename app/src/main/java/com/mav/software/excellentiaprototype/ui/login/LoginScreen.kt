package com.mav.software.excellentiaprototype.ui.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.mav.software.excellentiaprototype.R
import com.mav.software.excellentiaprototype.ui.login.components.LoginFields
import com.mav.software.excellentiaprototype.ui.shared.components.ScaffoldExample
import com.mav.software.excellentiaprototype.ui.shared.components.createFakeNavController
import com.mav.software.excellentiaprototype.ui.theme.ExcellentiaPrototypeTheme

@Composable
fun LoginScreen(
    navController: NavController = createFakeNavController()
) {

    Column(
        modifier = Modifier
            .background(
                color = MaterialTheme.colorScheme.background
            )
            .padding(10.dp),
    ) {
        Image(
            modifier = Modifier
                .padding(40.dp)
                .fillMaxWidth(),
            painter = painterResource(R.drawable.birrete),
            contentDescription = "Image",
            colorFilter = ColorFilter.tint(color = MaterialTheme.colorScheme.onBackground),
            contentScale = ContentScale.FillWidth
        )
        LoginFields(onLoginClick = {
            navController.navigate(route = "HomeScreen") {
                popUpTo("LoginScreen") {
                    inclusive = true
                }
            }
        })
    }
}

@PreviewLightDark
@Composable
private fun LoginScreenPreview() {
    ExcellentiaPrototypeTheme {
        ScaffoldExample(
            showBack = false,
            showBottomBar = false,
            title = "Login"
        ) {
            LoginScreen()
        }
    }
}
