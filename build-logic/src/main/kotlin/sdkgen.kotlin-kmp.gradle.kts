import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.internal.os.OperatingSystem
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsEnvSpec
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsPlugin
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootPlugin

plugins {
    id("org.jetbrains.kotlin.multiplatform")
    id("sdkgen.ktlint")
}

val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")

plugins.withType<NodeJsPlugin> {
    extensions.configure<NodeJsEnvSpec> {
        download.set(false)
    }
}

rootProject.plugins.withType<NodeJsRootPlugin> {
    rootProject.extensions.configure<NodeJsEnvSpec> {
        download.set(false)
    }
}

kotlin {
    explicitApi()
    jvm {
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_17)
        }
    }
    js {
        nodejs()
    }
    iosArm64()
    iosSimulatorArm64()
    macosArm64()
    linuxX64()
    jvmToolchain(17)

    sourceSets {
        commonTest.dependencies {
            implementation(libs.findLibrary("kotlin-test").get())
        }
    }
}

// The iOS simulator test executable can only run on a macOS host with the simulator toolchain
// installed. Disable it only when that host precondition isn't met, so macOS CI/dev machines
// with Xcode still execute the iOS Simulator Arm64 test suite instead of silently
// compile-only gating it. A missing simulator SDK is reported loudly rather than skipped.
val iosSimulatorSdkAvailable: Provider<Boolean> =
    if (OperatingSystem.current().isMacOsX) {
        providers
            .exec {
                commandLine("xcrun", "simctl", "list", "devices", "available")
                isIgnoreExitValue = true
            }.standardOutput.asText
            .map { it.contains("iPhone") }
    } else {
        providers.provider { false }
    }
if (!iosSimulatorSdkAvailable.get()) {
    logger.warn(
        "iosSimulatorArm64Test disabled for ${project.path}: host lacks the iOS Simulator SDK " +
            "(non-macOS host or Xcode simulator runtime not installed).",
    )
    tasks.matching { it.name == "iosSimulatorArm64Test" }.configureEach {
        enabled = false
    }
}
