import org.gradle.api.tasks.testing.logging.TestExceptionFormat
import org.jlleitschuh.gradle.ktlint.KtlintExtension

plugins {
    id("sdkgen.kotlin-kmp")
    id("sdkgen.kotlin-kmp-android")
    id("sdkgen.kotlin-serialization")
}

// The generated SDK is checked in under src/commonMain (this module does not use the sdkgen Gradle
// plugin, whose ktlint auto-exclusion only covers its own output directories), so exclude it here.
configure<KtlintExtension> {
    filter {
        exclude { element -> element.file.path.contains("/com/nabobery/sdkgen/generated/") }
    }
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(project(":runtime:core"))
            implementation(libs.kotlinx.serialization.json)
        }
        commonTest.dependencies {
            implementation(project(":runtime:testing"))
            implementation(libs.kotlinx.coroutines.test)
        }
        jvmTest.dependencies {
            implementation(project(":runtime:transport-java-http"))
            implementation(project(":runtime:transport-ktor"))
            implementation(project(":runtime:transport-okhttp"))
            implementation(libs.ktor.client.java)
            implementation(libs.okhttp)
            runtimeOnly(libs.junit.jupiter)
        }
    }

    jvm {
        testRuns["test"].executionTask.configure {
            useJUnitPlatform()
            testLogging {
                events("failed", "skipped")
                exceptionFormat = TestExceptionFormat.FULL
            }
        }
    }
}
