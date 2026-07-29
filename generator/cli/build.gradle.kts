import org.gradle.api.tasks.PathSensitivity

plugins {
    application
    id("sdkgen.kotlin-jvm")
    id("sdkgen.kotlin-serialization")
    id("sdkgen.publishing")
}

application {
    mainClass = "com.nabobery.sdkgen.cli.CliModuleKt"
}

dependencies {
    implementation(project(":generator:engine"))
    implementation(libs.jackson.databind)
    implementation(libs.clikt)
    implementation(libs.kotlinx.serialization.json)

    testImplementation(libs.kotlin.test)
}

tasks.test {
    val openRouterFile = rootProject.layout.projectDirectory.file("conformance/openrouter/openapi.yaml")

    // The real committed parity ledger, not a copy of it. `BehaviorEvidenceReaderTest` asserts that this exact
    // artifact cannot be read as usable behavior evidence while its gate status is `failed`; a copied fixture
    // would silently stop tracking the file the release gate actually consumes.
    val committedParityMatrix =
        rootProject.layout.projectDirectory
            .file("docs/conformance/evidence/parity-matrices.json")

    inputs.file(openRouterFile).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.file(committedParityMatrix).withPathSensitivity(PathSensitivity.RELATIVE)

    systemProperty("cli.openRouterFile", openRouterFile.asFile.absolutePath)
    systemProperty("cli.committedParityMatrix", committedParityMatrix.asFile.absolutePath)
}
