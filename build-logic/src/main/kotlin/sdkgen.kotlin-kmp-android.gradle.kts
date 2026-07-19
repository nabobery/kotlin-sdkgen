import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    id("org.jetbrains.kotlin.multiplatform")
    id("com.android.kotlin.multiplatform.library")
}

kotlin {
    androidLibrary {
        namespace = "com.nabobery.sdkgen.${project.path.removePrefix(":").split(':', '-').joinToString(".")}"
        compileSdk = 36
        minSdk = 21
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_17)
        }
    }
}
