plugins {
    id("sdkgen.kotlin-jvm")
}

dependencies {
    api(project(":generator:model"))

    implementation(libs.swagger.parser)
    implementation(libs.jackson.core)
    implementation(libs.jackson.databind)
    implementation(libs.jackson.dataformat.yaml)

    testImplementation(libs.kotlin.test)
}

tasks.test {
    maxHeapSize = "2g"

    val fixtureRoot = layout.projectDirectory.dir("src/test/resources/fixtures")
    val snapshotRoot = layout.projectDirectory.dir("src/test/resources/snapshots")
    val stressRoot = rootProject.layout.projectDirectory.dir("conformance/stress")
    val openRouterFile = rootProject.layout.projectDirectory.file("conformance/openrouter/openapi.yaml")
    val stripeFile = rootProject.layout.projectDirectory.file("conformance/stripe/openapi.json")
    val modelSource =
        rootProject.layout.projectDirectory
            .file("generator/model/src/main/kotlin/com/nabobery/sdkgen/model/SemanticModel.kt")
    val corpusRoot = rootProject.layout.projectDirectory.dir("conformance")

    // Declare every externally read fixture/corpus/snapshot input explicitly so its contents
    // (not just the absolute path string baked into the system property) participate in
    // UP-TO-DATE checks and build-cache keys.
    inputs.dir(fixtureRoot).withPathSensitivity(org.gradle.api.tasks.PathSensitivity.RELATIVE)
    inputs.dir(snapshotRoot).withPathSensitivity(org.gradle.api.tasks.PathSensitivity.RELATIVE)
    inputs.dir(stressRoot).withPathSensitivity(org.gradle.api.tasks.PathSensitivity.RELATIVE)
    inputs.file(openRouterFile).withPathSensitivity(org.gradle.api.tasks.PathSensitivity.RELATIVE)
    inputs.file(stripeFile).withPathSensitivity(org.gradle.api.tasks.PathSensitivity.RELATIVE)
    inputs.file(modelSource).withPathSensitivity(org.gradle.api.tasks.PathSensitivity.RELATIVE)
    // corpus.root itself is intentionally NOT declared as an input directory: the tests only read
    // conformance/openrouter/openapi.yaml, conformance/stripe/openapi.json, and conformance/stress/** (declared above), and declaring
    // the whole conformance/ tree would create an implicit dependency on the consumer module's
    // build outputs.

    systemProperty("intake.fixtureRoot", fixtureRoot.asFile.absolutePath)
    systemProperty("intake.snapshotRoot", snapshotRoot.asFile.absolutePath)
    systemProperty("intake.stressRoot", stressRoot.asFile.absolutePath)
    systemProperty("intake.openRouterFile", openRouterFile.asFile.absolutePath)
    systemProperty("intake.modelSource", modelSource.asFile.absolutePath)
    systemProperty(
        "intake.resultRoot",
        layout.buildDirectory
            .dir("intake-results")
            .get()
            .asFile.absolutePath,
    )
    systemProperty("corpus.root", corpusRoot.asFile.absolutePath)
    systemProperty(
        "overlay.resultRoot",
        layout.buildDirectory
            .dir("results")
            .get()
            .asFile.absolutePath,
    )
    testLogging {
        events("failed", "skipped")
        exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
    }
}
