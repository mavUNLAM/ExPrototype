package com.mav.software.excellentiaprototype

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.mav.software.excellentiaprototype.ui.shared.components.AppNavigation
import com.mav.software.excellentiaprototype.ui.shared.components.ScaffoldExample
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
                    title =
                        when (currentRoute) {
                            "HomeScreen" -> "Bienvenido Juan Carlos Otero!"
                            "StatisticsScreen" -> "Estadisticas comision"
                            "StatisticsListScreen" -> "Listado actividad 1"
                            "CreateActivityScreen" -> "Seleccionar actividad"
                            "CreateActivityScreen2" -> "Crear actividad"
                            "CreateActivityScreen3" -> "Preview"
                            "DoActivityScreen" -> "Estudiando"
                            "DoActivityConfigurationScreen" -> "Configuración de actividades"
                            "ActivityResolutionScreen" -> "Resolucion de actividades"
                            "LoginScreen" -> "Login"
                            else -> ""
                        },
                    showBack =
                        when (currentRoute) {
                            "HomeScreen" -> false
                            "LoginScreen" -> false
                            else -> true
                        },
                    showHamburger =
                        when (currentRoute) {
                            "HomeScreen" -> true
                            else -> false
                        },
                    navController = navController,
                ) {
                    AppNavigation(navController = navController)
                }
            }
        }
    }
}
