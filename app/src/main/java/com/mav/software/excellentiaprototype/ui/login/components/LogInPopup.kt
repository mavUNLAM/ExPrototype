package com.mav.software.excellentiaprototype.ui.login.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mav.software.excellentiaprototype.ui.theme.ExcellentiaPrototypeTheme

@Composable
fun LoginFields(
    modifier: Modifier = Modifier,
    onForgotPasswordClick: () -> Unit = {}
) {
    var user by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var isUserError by remember { mutableStateOf(false) }
    var isPasswordError by remember { mutableStateOf(false) }
    var userErrorText by remember { mutableStateOf("") }
    var passwordErrorText by remember { mutableStateOf("") }
    var rememberLogin by remember { mutableStateOf(false) }

    Column(modifier = modifier) {
        OutlinedTextField(
            modifier = Modifier
                .padding(start = 10.dp, end = 10.dp, top = 10.dp, bottom = 2.dp )
                .fillMaxWidth(),
            isError = isUserError,
            value = user,
            onValueChange = {
                user = it
                isUserError = false
                userErrorText = ""
            },
            label = {
                Text(text = "Usuario")
            },
            placeholder = {
                Text(text = "Introduzca su usuario")
            },
            visualTransformation = VisualTransformation.None,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Next
            ),
            leadingIcon = {
                Icon(Icons.Default.Person, contentDescription = "Usuario")
            }
        )

        Text(
            modifier = Modifier.padding(horizontal = 10.dp),
            text = userErrorText,
            color = MaterialTheme.colorScheme.error,
            fontSize = 12.sp
        )

        OutlinedTextField(
            modifier = Modifier
                .padding(start = 10.dp, end = 10.dp, top = 10.dp, bottom = 2.dp )
                .fillMaxWidth(),
            isError = isPasswordError,
            value = password,
            onValueChange = {
                password = it
                isPasswordError = false
                passwordErrorText = ""
            },
            label = {
                Text(text = "Contraseña")
            },
            placeholder = {
                Text(text = "Introduzca su contraseña")
            },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password,
                imeAction = ImeAction.Go
            ),
            leadingIcon = {
                Icon(Icons.Default.Lock, contentDescription = "Password")
            }
        )

        Text(
            modifier = Modifier.padding(horizontal = 10.dp),
            text = passwordErrorText,
            color = MaterialTheme.colorScheme.error,
            fontSize = 12.sp
        )

        Spacer(modifier = Modifier.height(10.dp))

        Row(
            modifier = Modifier.padding(start = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Mantener sesión")
            Checkbox(
                checked = rememberLogin,
                onCheckedChange = { rememberLogin = it }
            )
            Column(modifier = Modifier.fillMaxWidth()) {
                TextButton(onClick = onForgotPasswordClick, modifier = Modifier.align(Alignment.End)) {
                    Text(text = "¿Olvidaste tu contraseña?")
                }
            }
        }

        Spacer(
            modifier = Modifier.padding(20.dp)
        )

        LoginFooter(
            onSignInClick = {
                if (user.isEmpty() || user != "estudiante" && user != "profesor") {
                    isUserError = true
                    userErrorText = "* Usuario incorrecto"
                }
                if (password.isEmpty()) {
                    isPasswordError = true
                    passwordErrorText = "* Contraseña incorrecta"
                }
            }
        )
    }
}

@PreviewLightDark
@Preview(showBackground = true)
@Composable
private fun LoginFieldsPreview() {
    ExcellentiaPrototypeTheme {
        LoginFields()
    }
}

@Composable
fun LoginFooter(
    modifier: Modifier = Modifier,
    onSignInClick: () -> Unit = {},
    onSignUpClick: () -> Unit = {}
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = onSignInClick,
            modifier = Modifier
                .padding(horizontal = 10.dp)
                .fillMaxWidth()
        ) {
            Text(text = "Iniciar sesión")
        }
        TextButton(onClick = onSignUpClick) {
            Text(text = "¿No tienes una cuenta? Registrate aquí")
        }
    }
}

@PreviewLightDark
@Preview(showBackground = true)
@Composable
private fun LoginFooterPreview() {
    ExcellentiaPrototypeTheme {
        LoginFooter()
    }
}
