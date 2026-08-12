import org.gradle.api.tasks.PathSensitivity

plugins {
    application
    id("sdkgen.publishing")
    id("sdkgen.kotlin-jvm")
    id("sdkgen.kotlin-serialization")
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

    // The committed GitHub-scale emitted-API evidence (137 MiB decompressed, 36k declarations; stored
    // gzip-compressed under GitHub's 100 MiB file limit) plus the manifest it is bound to:
    // `KotlinApiProjectionReaderTest` proves the projection reader handles production-corpus scale
    // against the artifact the compat gate actually consumes, not a synthetic copy.
    val githubPostProjection =
        rootProject.layout.projectDirectory
            .file("conformance/github/adr-0020-post-projection.json.gz")
    val githubGeneratedManifest =
        rootProject.layout.projectDirectory
            .file("conformance/github/generated/manifest.json")

    inputs.file(openRouterFile).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.file(committedParityMatrix).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.file(githubPostProjection).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.file(githubGeneratedManifest).withPathSensitivity(PathSensitivity.RELATIVE)

    systemProperty("cli.openRouterFile", openRouterFile.asFile.absolutePath)
    systemProperty("cli.committedParityMatrix", committedParityMatrix.asFile.absolutePath)
    systemProperty("cli.githubPostProjection", githubPostProjection.asFile.absolutePath)
    systemProperty("cli.githubGeneratedManifest", githubGeneratedManifest.asFile.absolutePath)
}
