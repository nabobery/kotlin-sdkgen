plugins {
    id("sdkgen.kotlin-jvm")
    id("sdkgen.kotlin-serialization")
}

// Consume the checked-in GitHub generation through its canonical pointer; this module never regenerates or copies it.
kotlin {
    sourceSets {
        main {
            kotlin.srcDir(file("../generated"))
            resources.srcDir(file("../generated"))
            resources.include("manifest.json")
        }
    }
}

configure<org.jlleitschuh.gradle.ktlint.KtlintExtension> {
    filter {
        exclude { element -> element.file.path.contains("/com/nabobery/sdkgen/github/generated/") }
    }
}

dependencies {
    implementation(project(":runtime:core"))
    implementation(libs.kotlinx.serialization.json)
    testImplementation(project(":runtime:testing"))
    testImplementation(kotlin("test"))
    testImplementation(libs.kotlinx.coroutines.test)
}
