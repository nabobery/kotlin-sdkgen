import org.gradle.api.tasks.testing.logging.TestExceptionFormat
import org.jlleitschuh.gradle.ktlint.KtlintExtension

plugins {
    id("sdkgen.kotlin-kmp")
    id("sdkgen.kotlin-serialization")
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(project(":runtime:core"))
            implementation(libs.kotlinx.serialization.json)
        }
        jvmTest.dependencies {
            implementation(project(":runtime:testing"))
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

configure<KtlintExtension> {
    filter {
        exclude { element -> element.file.path.contains("/generated/") }
    }
}
