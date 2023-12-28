package ui.screens.splash

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.scaleIn
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.WifiFind
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import moe.tlaster.precompose.navigation.Navigator
import navigation.routes.AppRoutes

@Composable
fun SplashScreen(
    navigator: Navigator,
    modifier: Modifier = Modifier
) {
    var startAnimation by rememberSaveable { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        startAnimation = true
        delay(2000L)

        navigator.popBackStack()
        navigator.navigate(AppRoutes.HomeScreen.route)
    }
    SplashContent(
        visibility = startAnimation,
        modifier = modifier
    )
}

@Composable
private fun SplashContent(
    visibility: Boolean,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier
            .fillMaxSize(),
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = Modifier
                    .weight(1f),
                verticalArrangement = Arrangement.Center
            ) {
                AnimatedVisibility(
                    visible = visibility,
                    enter = scaleIn(
                        animationSpec = tween(
                            durationMillis = 1000,
                            easing = FastOutSlowInEasing
                        )
                    ) + fadeIn(
                        animationSpec = tween(
                            durationMillis = 1000,
                            easing = LinearEasing
                        )
                    )
                ) {
                    Icon(
                        Icons.Filled.WifiFind,
                        contentDescription = null,
                        modifier = Modifier
                            .size(96.dp)
                    )
                }
            }

            Column(
                modifier = Modifier
                    .padding(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    text = "Developed by",
                    fontWeight = FontWeight.Light
                )
                Image(
                    painter = painterResource("brand.png"),
                    contentDescription = null,
                    modifier = Modifier
                        .size(48.dp)
                )
            }
        }
    }
}

@Preview
@Composable
private fun SplashScreenPreview() {
    SplashContent(
        visibility = true
    )
}