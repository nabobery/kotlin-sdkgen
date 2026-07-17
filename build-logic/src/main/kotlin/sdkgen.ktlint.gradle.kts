import org.gradle.api.artifacts.VersionCatalogsExtension
import org.jlleitschuh.gradle.ktlint.KtlintExtension

plugins {
    id("org.jlleitschuh.gradle.ktlint")
}

val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")
val ktlintVersion = libs.findVersion("ktlint").get().requiredVersion

configure<KtlintExtension> {
    version.set(ktlintVersion)
    outputToConsole.set(true)
}

tasks.named("check") {
    dependsOn("ktlintCheck")
}
