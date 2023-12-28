package ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable


private val LightColorPalette = lightColors(
    primary = lightPrimary,
    onPrimary = lightOnPrimary,
    secondary = lightSecondary,
    onSecondary = lightOnSecondary,
    background = lightBackground,
    onBackground = lightOnBackground,
    surface = lightSurface,
    onSurface = lightOnSurface
)

@Composable
fun EkstraktoTheme(
    content: @Composable () -> Unit
) {

    MaterialTheme(
        shapes = Shapes,
        colors = LightColorPalette,
        content = content
    )
}