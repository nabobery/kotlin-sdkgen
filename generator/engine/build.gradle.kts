import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.testing.Test
import org.jlleitschuh.gradle.ktlint.KtlintExtension

plugins {
    id("sdkgen.kotlin-jvm")
    id("sdkgen.kotlin-serialization")
    id("sdkgen.publishing")
}

tasks.processResources {
    // Template only the version-metadata file: expand() on the whole resource tree would run the
    // Groovy template engine over sdkgen-v1alpha1.schema.json, whose regex escapes it cannot parse.
    // The version is captured as a task-local value so the action stays configuration-cache safe.
    val kotlinPoetDependencyVersion = libs.versions.kotlinpoet.get()
    inputs.property("kotlinPoetVersion", kotlinPoetDependencyVersion)
    filesMatching("com/nabobery/sdkgen/engine/kotlinpoet-version.properties") {
        expand(mapOf("kotlinPoetVersion" to kotlinPoetDependencyVersion))
    }
}

tasks.test {
    maxHeapSize = "2g"

    val openRouterFile =
        rootProject.layout.projectDirectory
            .file("conformance/openrouter/openapi.yaml")
    val githubFile =
        rootProject.layout.projectDirectory
            .file("conformance/github/openapi.yaml")
    val stripeFile =
        rootProject.layout.projectDirectory
            .file("conformance/stripe/openapi.json")
    val consumerSourceRoot =
        rootProject.layout.projectDirectory
            .dir("conformance/openrouter/consumer/src/commonMain/kotlin")
    val basicOpenApiFile =
        rootProject.layout.projectDirectory
            .file("generator/openapi/src/test/resources/fixtures/basic-openapi.yaml")
    val wave1GoldenRoot = layout.projectDirectory.dir("src/test/resources/goldens/wave1")
    val standardProjectionGolden =
        layout.projectDirectory
            .file("src/test/resources/goldens/standard-openrouter-projection.txt")
    val compositionProjectionGolden =
        layout.projectDirectory
            .file("src/test/resources/goldens/standard-composition-projection.txt")
    val emitterSource =
        layout.projectDirectory
            .file("src/main/kotlin/com/nabobery/sdkgen/engine/emit/KotlinPoetEmitter.kt")
    val emissionContextSource =
        layout.projectDirectory
            .file("src/main/kotlin/com/nabobery/sdkgen/engine/emit/EmissionContext.kt")
    val paginationFixtureSource =
        rootProject.layout.projectDirectory.file("conformance/pagination-fixture/openapi.yaml")
    val paginationFixtureCommitted =
        rootProject.layout.projectDirectory.dir("conformance/pagination-fixture/consumer/src/main/kotlin")
    val streamingFixtureSource =
        rootProject.layout.projectDirectory.file("conformance/streaming-fixture/openapi.yaml")
    val streamingFixtureCommitted =
        rootProject.layout.projectDirectory.dir("conformance/streaming-fixture/consumer/src/main/kotlin")
    val fixtureOutputRoot = layout.buildDirectory.dir("tmp/fixture-reproducibility")
    val openRouterGeneratedOutput = layout.buildDirectory.dir("tmp/openrouter-baseline")
    val t8RenameInventory = rootProject.layout.projectDirectory.file("docs/phase3/results/t8-openrouter-renames.tsv")
    val t11StripeBlockerInventory =
        rootProject.layout.projectDirectory.file("docs/phase3/results/t11-stripe-blockers.tsv")
    val t11StripeWaiverInventory =
        rootProject.layout.projectDirectory.file("docs/phase3/results/t11-stripe-waivers.tsv")
    val t11StripeConfig = rootProject.layout.projectDirectory.file("conformance/stripe/sdkgen.yaml")
    val stripeGeneratedOutput = layout.buildDirectory.dir("tmp/stripe-conformance")
    val t10GitHubBlockerInventory =
        rootProject.layout.projectDirectory.file("docs/phase3/results/t10-github-blockers.tsv")
    val t10GitHubConfig = rootProject.layout.projectDirectory.file("conformance/github/sdkgen.yaml")
    val t10GitHubCodeSearchOverlay =
        rootProject.layout.projectDirectory.file("conformance/github/overlays/code-search-runtime-semantics.yaml")

    // These fixtures/goldens are read at test execution time via the system properties below;
    // declare them explicitly so Gradle tracks their contents (not just the path string baked
    // into the system property) as UP-TO-DATE/build-cache inputs.
    inputs.file(openRouterFile).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.file(githubFile).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.file(stripeFile).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.file(basicOpenApiFile).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.dir(consumerSourceRoot).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.dir(wave1GoldenRoot).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.file(standardProjectionGolden).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.file(compositionProjectionGolden).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.file(emitterSource).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.file(emissionContextSource).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.file(paginationFixtureSource).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.dir(paginationFixtureCommitted).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.file(streamingFixtureSource).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.dir(streamingFixtureCommitted).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.file(t11StripeBlockerInventory).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.file(t11StripeWaiverInventory).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.file(t11StripeConfig).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.file(t10GitHubBlockerInventory).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.file(t10GitHubConfig).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.file(t10GitHubCodeSearchOverlay).withPathSensitivity(PathSensitivity.RELATIVE)
    outputs.dir(fixtureOutputRoot)
    outputs.dir(stripeGeneratedOutput)

    systemProperty("engine.openRouterFile", openRouterFile.asFile.absolutePath)
    systemProperty("engine.githubFile", githubFile.asFile.absolutePath)
    systemProperty("engine.stripeFile", stripeFile.asFile.absolutePath)
    systemProperty("engine.basicOpenApiFile", basicOpenApiFile.asFile.absolutePath)
    systemProperty("engine.goldenRoot", consumerSourceRoot.asFile.absolutePath)
    systemProperty("engine.wave1GoldenRoot", wave1GoldenRoot.asFile.absolutePath)
    systemProperty("engine.standardProjectionGolden", standardProjectionGolden.asFile.absolutePath)
    systemProperty("engine.compositionProjectionGolden", compositionProjectionGolden.asFile.absolutePath)
    systemProperty("engine.consumerSourceRoot", consumerSourceRoot.asFile.absolutePath)
    systemProperty("engine.openRouterGeneratedOutput", openRouterGeneratedOutput.get().asFile.absolutePath)
    systemProperty("engine.t8RenameInventory", t8RenameInventory.asFile.absolutePath)
    systemProperty("engine.t11StripeBlockerInventory", t11StripeBlockerInventory.asFile.absolutePath)
    systemProperty("engine.t11StripeWaiverInventory", t11StripeWaiverInventory.asFile.absolutePath)
    systemProperty("engine.t11StripeConfig", t11StripeConfig.asFile.absolutePath)
    systemProperty("engine.stripeGeneratedOutput", stripeGeneratedOutput.get().asFile.absolutePath)
    systemProperty("engine.t10GitHubBlockerInventory", t10GitHubBlockerInventory.asFile.absolutePath)
    systemProperty("engine.t10GitHubConfig", t10GitHubConfig.asFile.absolutePath)
    systemProperty("engine.emitterSource", emitterSource.asFile.absolutePath)
    systemProperty("engine.emissionContextSource", emissionContextSource.asFile.absolutePath)
    systemProperty("engine.pagination.fixture.source", paginationFixtureSource.asFile.absolutePath)
    systemProperty("engine.pagination.fixture.committed", paginationFixtureCommitted.asFile.absolutePath)
    systemProperty(
        "engine.pagination.fixture.output",
        fixtureOutputRoot
            .map { it.dir("pagination") }
            .get()
            .asFile.absolutePath,
    )
    systemProperty("engine.streaming.fixture.source", streamingFixtureSource.asFile.absolutePath)
    systemProperty("engine.streaming.fixture.committed", streamingFixtureCommitted.asFile.absolutePath)
    systemProperty(
        "engine.streaming.fixture.output",
        fixtureOutputRoot
            .map { it.dir("streaming") }
            .get()
            .asFile.absolutePath,
    )
}

tasks.register<Test>("githubScaleBenchmark") {
    description = "Measures the pinned GitHub REST corpus through production and downstream generation stages."
    group = "verification"
    testClassesDirs = tasks.test.get().testClassesDirs
    classpath = tasks.test.get().classpath
    useJUnitPlatform()
    filter {
        includeTestsMatching("com.nabobery.sdkgen.engine.GitHubScaleBenchmarkTest")
    }

    val githubFile = rootProject.layout.projectDirectory.file("conformance/github/openapi.yaml")
    val resultFile = layout.buildDirectory.file("reports/benchmarks/github-scale.properties")
    inputs.file(githubFile).withPathSensitivity(PathSensitivity.RELATIVE)
    outputs.file(resultFile)
    systemProperty("engine.runGitHubScaleBenchmark", "true")
    systemProperty("engine.githubFile", githubFile.asFile.absolutePath)
    systemProperty("engine.githubScaleResult", resultFile.get().asFile.absolutePath)
    maxHeapSize = "2g"
}

configure<KtlintExtension> {
    filter {
        exclude { element -> element.file.path.contains("/goldens/") }
    }
}

dependencies {
    implementation(project(":generator:model"))
    implementation(project(":generator:openapi"))
    implementation(libs.kotlinpoet)
    implementation(libs.kotlinx.serialization.json)
    implementation(libs.kaml)
    implementation(libs.jackson.databind)

    testImplementation(project(":runtime:core"))
    testImplementation("org.jetbrains.kotlin:kotlin-compiler-embeddable:2.3.20")
    testImplementation(libs.json.schema.validator)
    testImplementation(libs.swagger.parser)
    testImplementation(libs.kotlin.test)
}
