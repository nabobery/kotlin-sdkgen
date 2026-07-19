plugins {
    id("sdkgen.kotlin-kmp")
    id("sdkgen.kotlin-kmp-android")
    id("sdkgen.publishing")
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
