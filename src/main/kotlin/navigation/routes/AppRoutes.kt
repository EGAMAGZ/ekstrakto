package navigation.routes

sealed class AppRoutes(val route: String) {
    object HomeScreen : AppRoutes(route = "/")

    object SplashScreen : AppRoutes(route = "/splash")
}