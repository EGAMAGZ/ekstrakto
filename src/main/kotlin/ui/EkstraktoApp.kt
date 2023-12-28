package ui

import androidx.compose.runtime.Composable
import moe.tlaster.precompose.PreComposeApp
import navigation.AppNavigation

@Composable
fun EkstraktoApp() {
    PreComposeApp {
        AppNavigation()
    }
}