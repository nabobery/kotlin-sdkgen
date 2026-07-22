plugins {
    id("sdkgen.kotlin-jvm")
    id("sdkgen.kotlin-serialization")
}

// The generated SDK is checked in under src/main/kotlin (this module does not use the sdkgen Gradle plugin, whose
// ktlint auto-exclusion only covers its own output directories), so exclude it here — matching
// conformance/openrouter/consumer's precedent.
configure<org.jlleitschuh.gradle.ktlint.KtlintExtension> {
    filter {
        exclude { element -> element.file.path.contains("/com/nabobery/sdkgen/generated/") }
    }
}

tasks.test {
    dependsOn(":generator:engine:test")
}

dependencies {
    implementation(project(":runtime:core"))
    implementation(libs.kotlinx.serialization.json)
    testImplementation(project(":runtime:testing"))
    testImplementation(kotlin("test"))
    testImplementation(libs.kotlinx.coroutines.test)
}
