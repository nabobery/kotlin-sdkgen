plugins {
    id("sdkgen.publishing")
    id("sdkgen.kotlin-kmp-jvm-android")
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            api(project(":runtime:core"))
            implementation(libs.okhttp)
            implementation(libs.okhttp.coroutines)
        }
        jvmTest.dependencies {
            implementation(project(":runtime:testing"))
            implementation(libs.kotlinx.coroutines.test)
            implementation(libs.mockwebserver3)
        }
    }
}
