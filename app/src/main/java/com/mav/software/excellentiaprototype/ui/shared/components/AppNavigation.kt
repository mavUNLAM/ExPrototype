package com.mav.software.excellentiaprototype.ui.shared.components

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.mav.software.excellentiaprototype.model.Statistic
import com.mav.software.excellentiaprototype.ui.createactivity.CreateActivityScreen
import com.mav.software.excellentiaprototype.ui.createactivity.CreateActivityScreen2
import com.mav.software.excellentiaprototype.ui.createactivity.CreateActivityScreen3
import com.mav.software.excellentiaprototype.ui.homeScreen.HomeScreen
import com.mav.software.excellentiaprototype.ui.statistics.StatisticsScreen
import com.mav.software.excellentiaprototype.ui.statistics.StatisticsViewModel

@Composable
fun AppNavigation(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        enterTransition = {  slideIntoContainer(AnimatedContentTransitionScope.SlideDirection.Start, tween(200)) },
        exitTransition = { slideOutOfContainer(AnimatedContentTransitionScope.SlideDirection.Start, tween(200)) },
        popEnterTransition = { slideIntoContainer(AnimatedContentTransitionScope.SlideDirection.End, tween(200)) },
        popExitTransition = { slideOutOfContainer(AnimatedContentTransitionScope.SlideDirection.End, tween(200)) },
        startDestination = "HomeScreen"
    ) {
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

        composable("CreateActivityScreen") {
            CreateActivityScreen(
                navController = navController
            )
        }

        composable("CreateActivityScreen2") {
            CreateActivityScreen2(
                navController = navController
            )
        }

        composable("CreateActivityScreen3") {
            CreateActivityScreen3(
                navController = navController
            )
        }
    }
}