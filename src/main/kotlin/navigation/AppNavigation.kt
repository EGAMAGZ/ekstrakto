package navigation

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.rememberNavigator
import moe.tlaster.precompose.navigation.transition.NavTransition
import navigation.routes.AppRoutes
import ui.screens.splash.SplashScreen

@Composable
fun AppNavigation() {
    val navigator = rememberNavigator()
    NavHost(
        navigator = navigator,
        initialRoute = AppRoutes.SplashScreen.route,
        navTransition = NavTransition()
    ) {
        scene(route = AppRoutes.SplashScreen.route) {
            SplashScreen(navigator = navigator)
        }
        scene(route = AppRoutes.HomeScreen.route) {
            Text("Home screen")
        }
    }
}