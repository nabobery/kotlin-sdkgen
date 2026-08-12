plugins {
    id("sdkgen.publishing")
    id("sdkgen.kotlin-kmp")
    id("sdkgen.kotlin-kmp-android")
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            api(project(":runtime:core"))
            // Contract kit base classes expose kotlin.test assertions to adapter test consumers.
            api(kotlin("test"))
        }
        commonTest.dependencies {
            implementation(libs.kotlinx.coroutines.test)
        }
    }
}
