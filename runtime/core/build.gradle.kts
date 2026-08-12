plugins {
    id("sdkgen.publishing")
    id("sdkgen.kotlin-kmp")
    id("sdkgen.kotlin-kmp-android")
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            api(libs.kotlinx.serialization.json)
            api(libs.kotlinx.coroutines.core)
        }
    }
}
