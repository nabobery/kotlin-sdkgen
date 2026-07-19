plugins {
    id("sdkgen.kotlin-kmp")
    id("sdkgen.kotlin-kmp-android")
    id("sdkgen.publishing")
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            api(libs.kotlinx.serialization.json)
            api(libs.kotlinx.coroutines.core)
        }
    }
}
