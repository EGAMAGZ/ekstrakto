import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import ui.EkstraktoApp


fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Ekstrakto",
    ) {
        EkstraktoApp()
    }
}
