package com.mav.software.excellentiaprototype.ui.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.mav.software.excellentiaprototype.ui.login.components.LoginFields
import com.mav.software.excellentiaprototype.ui.shared.components.ScaffoldExample
import com.mav.software.excellentiaprototype.ui.shared.components.createFakeNavController
import com.mav.software.excellentiaprototype.ui.theme.ExcellentiaPrototypeTheme

@Composable
fun LoginScreen() {

    ScaffoldExample(
        title = "Login",
        modifier = Modifier
            .background(
                color = MaterialTheme.colorScheme.background
            )
            .padding(10.dp),
        navController = createFakeNavController()
    ) {
        // tal vez poner el logo aquí
        LoginFields()
    }
}

@PreviewLightDark
@Composable
private fun LoginScreenPreview() {
    ExcellentiaPrototypeTheme {
        LoginScreen()
    }
}
