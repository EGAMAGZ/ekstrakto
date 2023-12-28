import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPlacement
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import ui.EkstraktoApp
import ui.theme.EkstraktoTheme


fun main() = application {
    val windowState = rememberWindowState(
        placement = WindowPlacement.Floating
    )
    Window(
        onCloseRequest = ::exitApplication,
        title = "Ekstrakto",
        state = windowState
    ) {
        EkstraktoTheme {
            EkstraktoApp()
        }
    }
}
