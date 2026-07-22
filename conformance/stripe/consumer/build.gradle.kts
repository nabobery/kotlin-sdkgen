import org.gradle.api.tasks.bundling.Zip
import org.gradle.api.tasks.testing.logging.TestExceptionFormat
import org.jlleitschuh.gradle.ktlint.tasks.KtLintCheckTask

plugins {
    id("sdkgen.kotlin-kmp")
    id("sdkgen.kotlin-serialization")
}

tasks.withType<Zip>().configureEach {
    isZip64 = true
}

tasks.withType<KtLintCheckTask>().configureEach {
    exclude("**/generated/**")
}

kotlin {
    sourceSets {
        commonMain {
            kotlin.srcDir("../generated")
            dependencies {
                implementation(project(":runtime:core"))
                implementation(libs.kotlinx.serialization.json)
            }
        }
        commonTest.dependencies {
            implementation(project(":runtime:testing"))
            implementation(libs.kotlinx.coroutines.test)
        }
        jvmTest {
            resources.srcDir("../generated")
            resources.include("manifest.json")
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
