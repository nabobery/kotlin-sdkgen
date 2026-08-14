import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootPlugin
import org.jetbrains.kotlin.gradle.targets.js.npm.NpmExtension

plugins {
    base
    id("sdkgen.release-package-lock")
    alias(libs.plugins.kotlin.multiplatform) apply false
    alias(libs.plugins.cyclonedx)
}

group = "io.github.nabobery"

nmcpAggregation {
    // Several conformance subprojects intentionally share the leaf name `consumer`.
    // Nmcp aggregates by project path, so these names are safe for this build.
    allowDuplicateProjectNames.set(true)
}

allprojects {
    version = providers.gradleProperty("sdkgenVersion").get()
}

plugins.withType<NodeJsRootPlugin> {
    extensions.configure<NpmExtension> {
        override("diff", "8.0.3")
        override("fast-uri", "3.1.5")
        override("js-yaml", "4.3.1")
        override("serialize-javascript", "7.0.5")
        override("webpack", "5.104.1")
        override("ws", "8.21.1")
    }
}
