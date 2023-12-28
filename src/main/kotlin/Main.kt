import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import ui.EkstraktoApp
import ui.theme.EkstraktoTheme


fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Ekstrakto",
    ) {
        EkstraktoTheme {
            EkstraktoApp()
        }
    }
}
