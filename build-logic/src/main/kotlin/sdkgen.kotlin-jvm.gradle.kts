import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.api.tasks.testing.Test
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    id("org.jetbrains.kotlin.jvm")
    `java-library`
    id("sdkgen.ktlint")
}

val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")

kotlin {
    explicitApi()
    jvmToolchain(17)
    compilerOptions {
        jvmTarget.set(JvmTarget.JVM_17)
    }
}

dependencies {
    testImplementation(libs.findLibrary("junit-jupiter").get())
    testRuntimeOnly(libs.findLibrary("junit-platform-launcher").get())
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}
