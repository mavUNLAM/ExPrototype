package com.mav.software.excellentiaprototype.ui.shared.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.mav.software.excellentiaprototype.ui.theme.ExcellentiaPrototypeTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldExample(
    modifier: Modifier = Modifier,
    title: String = "Top app bar",
    content: @Composable ColumnScope.() -> Unit = {}
) {
    Scaffold(
        topBar = {
            TopAppBar(
                actions = {
                    Icon(
                        Icons.Default.Menu,
                        contentDescription = "Menu",
                        modifier = Modifier
                            .padding(horizontal = 5.dp),
                        tint = MaterialTheme.colorScheme.onPrimaryContainer
                    )
                },
                navigationIcon = {
                    Icon(
                        Icons.AutoMirrored.Default.ArrowBack,
                        contentDescription = "Back",
                        modifier = Modifier
                            .padding(horizontal = 5.dp),
                        tint = MaterialTheme.colorScheme.onPrimaryContainer
                    )
                },
                colors = topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Text(
                        text = title,
                        color = MaterialTheme.colorScheme.onPrimaryContainer
                    )
                }
            )
        },
        bottomBar = {
            BottomAppBar(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                contentColor = MaterialTheme.colorScheme.onPrimaryContainer,
            ) {
                BottomBar(modifier = Modifier.fillMaxWidth())
            }
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { }) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        }
    ) { innerPadding ->
        Column(
            modifier = modifier
                .padding(innerPadding)
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
        ) {
            content()
        }
    }
}

@PreviewLightDark
@Composable
private fun ScaffoldExamplePreview() {
    ExcellentiaPrototypeTheme {
        ScaffoldExample(
            title = "Ejemplo"
        )
    }

}

@Preview(showBackground = true)
@Composable
private fun BottomBar(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        val verticalDividerModifier = Modifier.height(20.dp)

        VerticalDivider(modifier = verticalDividerModifier)

        Icon(Icons.Default.AccountBox, contentDescription = "Account")

        VerticalDivider(modifier = verticalDividerModifier)

        Icon(Icons.Default.Home, contentDescription = "Home")

        VerticalDivider(modifier = verticalDividerModifier)

        Icon(Icons.Default.MailOutline, contentDescription = "Mail")

        VerticalDivider(modifier = verticalDividerModifier)
    }
}
