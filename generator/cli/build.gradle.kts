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

tasks.jar {
    manifest.attributes["Implementation-Version"] = project.version.toString()
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

    // `PackagedCliProvenanceTest` runs the packaged sdkgen CLI end to end so it exercises the JAR manifest's
    // stamped `Implementation-Version`, which a `java.class.path` (classes-directory) run cannot prove. The whole
    // installed distribution is registered as a lazy input (not just the launcher script) so that a JAR-only change
    // -- e.g. a manifest-stamping change at the same sdkgenVersion -- still invalidates this task and re-runs the
    // provenance proof; the input provider is derived from the `installDist` task provider, so its build dependency
    // is carried implicitly. The launcher path and the stamped version are passed through a
    // `CommandLineArgumentProvider` so nothing is read at configuration time (the repo fails the build on
    // configuration-cache problems).
    val installedCliDistribution = tasks.named<Sync>("installDist")
    val packagedLauncher = installedCliDistribution.map { it.destinationDir.resolve("bin/cli") }
    inputs
        .dir(installedCliDistribution.map { it.destinationDir })
        .withPropertyName("packagedCliDistribution")
        .withPathSensitivity(PathSensitivity.RELATIVE)
    val stampedVersion = providers.gradleProperty("sdkgenVersion")
    jvmArgumentProviders.add(
        CommandLineArgumentProvider {
            listOf(
                "-Dcli.packagedExecutable=${packagedLauncher.get().absolutePath}",
                "-Dcli.expectedPackagedVersion=${stampedVersion.get()}",
            )
        },
    )
}
