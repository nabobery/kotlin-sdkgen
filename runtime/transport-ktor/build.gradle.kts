plugins {
    id("sdkgen.kotlin-kmp")
    id("sdkgen.kotlin-kmp-android")
    id("sdkgen.publishing")
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            api(project(":runtime:core"))
            implementation(libs.ktor.client.core)
        }
        commonTest.dependencies {
            implementation(project(":runtime:testing"))
            implementation(libs.ktor.client.mock)
            implementation(libs.kotlinx.coroutines.test)
        }
    }
}
