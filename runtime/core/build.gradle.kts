plugins {
    id("sdkgen.kotlin-kmp")
    id("sdkgen.publishing")
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            api(libs.kotlinx.serialization.json)
        }
    }
}
