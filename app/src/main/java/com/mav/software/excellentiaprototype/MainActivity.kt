package com.mav.software.excellentiaprototype

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.mav.software.excellentiaprototype.model.Statistic
import com.mav.software.excellentiaprototype.ui.homeScreen.HomeScreen
import com.mav.software.excellentiaprototype.ui.shared.components.ScaffoldExample
import com.mav.software.excellentiaprototype.ui.statistics.StatisticsScreen
import com.mav.software.excellentiaprototype.ui.statistics.StatisticsViewModel
import com.mav.software.excellentiaprototype.ui.theme.ExcellentiaPrototypeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            val currentBackStackEntry = navController.currentBackStackEntryAsState()
            val currentRoute = currentBackStackEntry.value?.destination?.route

            ExcellentiaPrototypeTheme {
                ScaffoldExample(
                    title = when(currentRoute) {
                        "HomeScreen" -> "Bienvenido Juan Carlos Otero!"
                        "StatisticsScreen" -> "Estadisticas comision"
                        else -> ""
                    },
                    showBack = when(currentRoute) {
                        "HomeScreen" -> false
                        else -> true
                    },
                    navController = navController
                ) {
                    NavHost(navController = navController, startDestination = "HomeScreen") {
                        composable("HomeScreen") {
                            HomeScreen(
                                navController = navController
                            )
                        }

                        composable("StatisticsScreen") {
                            StatisticsScreen(
                                viewModel = StatisticsViewModel(
                                    title = "Actividad 1",
                                    statistics = listOf(
                                        Statistic("No resolvieron", 25f, MaterialTheme.colorScheme.primary),
                                        Statistic("Resolvieron", 75f, MaterialTheme.colorScheme.primaryContainer),
                                    )
                                )
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ExcellentiaPrototypeTheme {
        Greeting("Android")
    }
}