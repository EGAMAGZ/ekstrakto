import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    kotlin("jvm")
    id("org.jetbrains.compose")
}

group = "com.egamagz"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    google()
}

dependencies {
    // Note, if you develop a library, you should use compose.desktop.common.
    // compose.desktop.currentOs should be used in launcher-sourceSet
    // (in a separate module for demo project and in testMain).
    // With compose.desktop.common you will also lose @Preview functionality

    implementation(compose.desktop.currentOs)
    api(compose.foundation)
    api(compose.animation)
    api(compose.materialIconsExtended)
    api(compose.uiTooling)
    api(compose.animationGraphics)
    api("moe.tlaster:precompose:1.5.10")
    api("moe.tlaster:precompose-viewmodel:1.5.10")
    api("moe.tlaster:precompose-koin:1.5.10")
    implementation("com.github.pgreze:kotlin-process:1.4.1")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
}

compose.desktop {
    application {
        mainClass = "MainKt"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "ekstrakto"
            packageVersion = "1.0.0"
        }
    }
}
