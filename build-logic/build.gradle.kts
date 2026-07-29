import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.api.tasks.testing.Test
import org.jlleitschuh.gradle.ktlint.KtlintExtension
import org.jlleitschuh.gradle.ktlint.tasks.KtLintCheckTask
import org.jlleitschuh.gradle.ktlint.tasks.KtLintFormatTask

plugins {
    `kotlin-dsl`
    alias(libs.plugins.ktlint)
}

group = "com.nabobery.sdkgen.buildlogic"

dependencies {
    implementation(libs.kotlin.gradle.plugin)
    implementation(libs.kotlin.serialization.gradle.plugin)
    implementation(libs.android.gradle.plugin)
    implementation(libs.ktlint.gradle.plugin)
    implementation(libs.binary.compatibility.validator.gradle.plugin)
    implementation(libs.kotlinx.serialization.json)

    testImplementation(gradleTestKit())
    testImplementation(libs.junit.jupiter)
    testRuntimeOnly(libs.junit.platform.launcher)
}

val versionCatalog = extensions.getByType<VersionCatalogsExtension>().named("libs")

configure<KtlintExtension> {
    version.set(versionCatalog.findVersion("ktlint").get().requiredVersion)
    outputToConsole.set(true)
}

tasks.named<KtLintCheckTask>("runKtlintCheckOverMainSourceSet") {
    setSource(fileTree("src/main/kotlin"))
}

tasks.named<KtLintFormatTask>("runKtlintFormatOverMainSourceSet") {
    setSource(fileTree("src/main/kotlin"))
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}

tasks.named("check") {
    dependsOn("ktlintCheck")
}
