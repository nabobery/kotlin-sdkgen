plugins {
    id("sdkgen.kotlin-kmp")
    id("sdkgen.publishing")
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            api(project(":runtime:core"))
        }
    }
}
