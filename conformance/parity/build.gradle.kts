plugins {
    id("sdkgen.kotlin-jvm")
    id("sdkgen.kotlin-serialization")
}

dependencies {
    implementation(libs.kotlinx.serialization.json)
    testImplementation(libs.kotlin.test)
}

val evidenceFiles =
    layout.projectDirectory
        .dir("evidence")
        .asFileTree
        .matching { include("*.json") }
val evidenceSidecars =
    layout.projectDirectory
        .dir("evidence")
        .asFileTree
        .matching { include("*.json.sha256") }
val registryFiles =
    files(
        layout.projectDirectory.file("registry/parity-rows.json"),
        layout.projectDirectory.file("registry/parity-rows.json.sha256"),
    )
val corpusInputs =
    files(
        rootProject.layout.projectDirectory.file("conformance/github/openapi.yaml"),
        rootProject.layout.projectDirectory.file("conformance/github/sdkgen.lock"),
        rootProject.layout.projectDirectory.file("conformance/stripe/openapi.json"),
        rootProject.layout.projectDirectory.file("conformance/stripe/sdkgen.lock"),
        rootProject.layout.projectDirectory.file("conformance/openrouter/openapi.yaml"),
        rootProject.layout.projectDirectory.file("conformance/openrouter/overlays/full-spec-compat.yaml"),
    )
val currentCommitSha =
    providers
        .exec {
            workingDir(rootProject.layout.projectDirectory)
            commandLine("git", "rev-parse", "HEAD")
        }.standardOutput.asText
        .map(String::trim)
val validParityRunId = Regex("[A-Za-z0-9][A-Za-z0-9._:-]{0,127}")
val parityRunId =
    providers
        .gradleProperty("parityRunId")
        .orElse("local-unbound")
        .map { runId ->
            require(validParityRunId.matches(runId)) { "parityRunId is missing or invalid" }
            runId
        }
val githubParityRunId = parityRunId
val githubConsumerBuild = rootProject.layout.projectDirectory.dir("conformance/github/consumer/build")
val githubRunMarker =
    githubParityRunId.map { runId ->
        githubConsumerBuild.file("parity/github/runs/$runId.properties")
    }
val githubTaskOutcome =
    githubParityRunId.map { runId ->
        githubConsumerBuild.file("parity/github/outcomes/$runId.txt")
    }
val githubJUnitXml = githubConsumerBuild.dir("test-results/test")
val githubGenerated = rootProject.layout.projectDirectory.dir("conformance/github/generated")
val githubEvidence =
    githubParityRunId.flatMap { runId ->
        layout.buildDirectory.file("evidence/github/$runId/github-corpus.json")
    }
val transportParityRunId = parityRunId
val stripeParityRunId = parityRunId
val stripeConsumerBuild = rootProject.layout.projectDirectory.dir("conformance/stripe/consumer/build")
val stripeRunMarker =
    stripeParityRunId.map { runId ->
        stripeConsumerBuild.file("parity/stripe/runs/$runId.properties")
    }
val stripeTaskOutcome =
    stripeParityRunId.map { runId ->
        stripeConsumerBuild.file("parity/stripe/outcomes/$runId.txt")
    }
val stripeJUnitXml = stripeConsumerBuild.dir("test-results/jvmTest")
val stripeGenerated = rootProject.layout.projectDirectory.dir("conformance/stripe/generated")
val stripeEvidence =
    stripeParityRunId.flatMap { runId ->
        layout.buildDirectory.file("evidence/stripe/$runId/stripe-corpus.json")
    }
val openRouterParityRunId = parityRunId
val openRouterConsumerBuild = rootProject.layout.projectDirectory.dir("conformance/openrouter/consumer/build")
val openRouterRunMarker =
    openRouterParityRunId.map { runId ->
        openRouterConsumerBuild.file("parity/openrouter/runs/$runId.properties")
    }
val openRouterTaskOutcome =
    openRouterParityRunId.map { runId ->
        openRouterConsumerBuild.file("parity/openrouter/outcomes/$runId.txt")
    }
val openRouterJUnitXml = openRouterConsumerBuild.dir("test-results/jvmTest")
val openRouterGenerated = rootProject.layout.projectDirectory.dir("conformance/openrouter/generated")
val openRouterCompileJvmEvent =
    openRouterParityRunId.map { runId ->
        openRouterConsumerBuild.file("parity/openrouter/events/$runId/compile-jvm.txt")
    }
val openRouterCompileKmpEvent =
    openRouterParityRunId.map { runId ->
        openRouterConsumerBuild.file("parity/openrouter/events/$runId/compile-representative-kmp.txt")
    }
val openRouterSourcePortableEvent =
    openRouterParityRunId.map { runId ->
        openRouterConsumerBuild.file("parity/openrouter/events/$runId/source-portable.txt")
    }
val openRouterCombinedEvents =
    openRouterParityRunId.map { runId ->
        openRouterConsumerBuild.file("parity/openrouter/events/$runId/combined.txt")
    }
val openRouterEvidence =
    openRouterParityRunId.flatMap { runId ->
        layout.buildDirectory.file("evidence/openrouter/$runId/openrouter-corpus.json")
    }
val openRouterEvidenceSidecar = openRouterEvidence.map { file -> File("${file.asFile.path}.sha256") }

val streamingStressRunId = parityRunId
val streamingStressConsumerBuild =
    rootProject.layout.projectDirectory.dir("conformance/streaming-fixture/consumer/build")
val streamingStressRunMarker =
    streamingStressRunId.map { runId ->
        streamingStressConsumerBuild.file("parity/streaming-stress/runs/$runId.properties")
    }
val streamingStressTaskOutcome =
    streamingStressRunId.map { runId ->
        streamingStressConsumerBuild.file("parity/streaming-stress/outcomes/$runId.txt")
    }
val streamingStressJUnitXml = streamingStressConsumerBuild.dir("test-results/test")
val streamingStressGenerated = rootProject.layout.projectDirectory.dir("conformance/streaming-fixture/generated")
val streamingStressEvidence =
    streamingStressRunId.flatMap { runId ->
        layout.buildDirectory.file("evidence/streaming-stress/$runId/streaming-stress.json")
    }
// Every producer's evidence file for the current run, named rather than globbed.
//
// Each path is already deterministic from the run id, and every producer in this file resolves its own
// output path at configuration time the same way. Requiring the caller to pass the set back in via
// -PparityEvidenceFiles was what made the gate depend on an operator getting a `find | paste` incantation
// right, and made it enforce over an empty list when they did not.
val transportEvidenceProducers = listOf("transport-ktor", "okhttp-transport", "java-http-transport")
val runScopedEvidenceFiles =
    listOf(githubEvidence, stripeEvidence, openRouterEvidence, streamingStressEvidence)
        .map { provider -> provider.get().asFile.absolutePath } +
        transportEvidenceProducers.map { producer ->
            parityRunId
                .flatMap { runId -> layout.buildDirectory.file("evidence/transport/$runId/$producer.json") }
                .get()
                .asFile
                .absolutePath
        }

/**
 * Every task that writes run-scoped parity evidence. Named once so the live gate cannot silently omit one.
 *
 * Adding a corpus means adding it here; a producer absent from this list is a producer the gate does not
 * wait for, which is the class of defect this list exists to make visible.
 */
val parityProducerTaskNames =
    listOf(
        "produceGitHubParityEvidence",
        "produceStripeParityEvidence",
        "produceOpenRouterParityEvidence",
        "produceStreamingStressParityEvidence",
        "produceKtorTransportParityEvidence",
        "produceOkHttpTransportParityEvidence",
        "produceJavaHttpTransportParityEvidence",
    )

/**
 * Deletes the current run's evidence before any producer writes it.
 *
 * Stale evidence from an earlier invocation of the same run id causes "Duplicate evidence row id", which the
 * previous runbook worked around with a manual `rm -rf conformance/parity/build/evidence`. Every producer
 * depends on this, so the clearing is part of the graph rather than a step an operator has to remember.
 */
val clearLiveParityEvidence =
    tasks.register<Delete>("clearLiveParityEvidence") {
        doNotTrackState("Stale producer evidence must be cleared before every invocation.")
        outputs.upToDateWhen { false }
        delete(
            parityRunId.map { runId ->
                layout.buildDirectory
                    .dir("evidence")
                    .get()
                    .asFile
                    .resolve(runId)
            },
        )
        delete(
            parityRunId.map { runId ->
                val runScopedTree = "**" + "/" + runId + "/" + "**"
                layout.buildDirectory
                    .dir("evidence")
                    .get()
                    .asFileTree
                    .matching { include(runScopedTree) }
            },
        )
    }

val generateParityMatrices =
    tasks.register<JavaExec>("generateParityMatrices") {
        group = "verification"
        description = "Aggregates cross-corpus parity evidence and generates parity matrices reports."
        classpath = sourceSets["main"].runtimeClasspath
        mainClass.set("com.nabobery.sdkgen.conformance.parity.ParityMainKt")

        val mdFile = rootProject.layout.projectDirectory.file("docs/conformance/evidence/parity-matrices.md")
        val jsonFile = rootProject.layout.projectDirectory.file("docs/conformance/evidence/parity-matrices.json")

        inputs.files(evidenceFiles, evidenceSidecars, registryFiles).withPathSensitivity(PathSensitivity.RELATIVE)
        inputs.files(corpusInputs).withPathSensitivity(PathSensitivity.RELATIVE)
        inputs.property("currentCommitSha", currentCommitSha)
        outputs.file(mdFile)
        outputs.file(jsonFile)

        args(
            rootProject.layout.projectDirectory.asFile.absolutePath,
            mdFile.asFile.absolutePath,
            jsonFile.asFile.absolutePath,
        )
        args(evidenceFiles)
    }

tasks.register<JavaExec>("parityGate") {
    group = "verification"
    description = "Enforces cross-corpus parity gate."
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("com.nabobery.sdkgen.conformance.parity.ParityMainKt")
    val markdown = layout.buildDirectory.file("reports/parity/gate.md")
    val json = layout.buildDirectory.file("reports/parity/gate.json")
    inputs.files(evidenceFiles, evidenceSidecars, registryFiles).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.files(corpusInputs).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.property("currentCommitSha", currentCommitSha)
    outputs.files(markdown, json)
    args(
        rootProject.layout.projectDirectory.asFile.absolutePath,
        markdown.get().asFile.absolutePath,
        json.get().asFile.absolutePath,
    )
    args(evidenceFiles)
    args("--enforce")
    dependsOn(tasks.test)
}

/**
 * Enforces parity over evidence produced by this same invocation.
 *
 * This task previously declared no `dependsOn` at all and enforced over a caller-supplied
 * `-PparityEvidenceFiles` list. Nothing linked it to the producers that create those files, so invoking it
 * scheduled no producer, `inputs.files` over non-existent paths was simply an empty input, and with
 * `org.gradle.parallel=true` it could even run alongside the producers writing its inputs. It now depends on
 * every producer and reads their run-scoped output, so "the gate passed" cannot mean "the gate enforced over
 * whatever happened to be on disk".
 */
val liveParityGate =
    tasks.register<JavaExec>("liveParityGate") {
        group = "verification"
        description = "Enforces parity over evidence this invocation produced, without checking it into source control."
        classpath = sourceSets["main"].runtimeClasspath
        mainClass.set("com.nabobery.sdkgen.conformance.parity.ParityMainKt")
        val markdown = layout.buildDirectory.file("reports/parity/live-gate.md")
        val json = layout.buildDirectory.file("reports/parity/live-gate.json")
        inputs.files(runScopedEvidenceFiles.map(::File)).withPathSensitivity(PathSensitivity.RELATIVE)
        inputs.files(registryFiles, corpusInputs).withPathSensitivity(PathSensitivity.RELATIVE)
        inputs.property("currentCommitSha", currentCommitSha)
        outputs.files(markdown, json)
        parityProducerTaskNames.forEach { producer -> dependsOn(producer) }

        args(
            rootProject.layout.projectDirectory.asFile.absolutePath,
            markdown.get().asFile.absolutePath,
            json.get().asFile.absolutePath,
        )
        args(runScopedEvidenceFiles)
        args("--enforce")
    }

// The single entry point for a live cross-corpus parity run.
//
// Running the gate used to require a three-command runbook: clear stale evidence by hand, remember to ask
// for each corpus consumer test in the same invocation as its producer, then collect the written files with
// `find | paste` and pass them back in. Every step was load-bearing and each one failed silently-red when
// missed. This task owns the whole sequence.
tasks.register("liveParity") {
    group = "verification"
    description = "Clears stale evidence, runs every corpus consumer and producer, and enforces the parity gate."
    dependsOn(liveParityGate)
}

val recordGitHubParityTestOutcome =
    tasks.register<JavaExec>("recordGitHubParityTestOutcome") {
        group = "verification"
        description = "Records a conservative GitHub consumer outcome from current JUnit XML."
        classpath = sourceSets["main"].runtimeClasspath
        mainClass.set("com.nabobery.sdkgen.conformance.parity.ParityTaskOutcomeCli")
        inputs.file(githubRunMarker)
        inputs.files(githubJUnitXml).withPathSensitivity(PathSensitivity.RELATIVE)
        outputs.file(githubTaskOutcome)
        args(githubJUnitXml.asFile.absolutePath, githubTaskOutcome.get().asFile.absolutePath)
        dependsOn(":conformance:github:consumer:prepareGitHubParityRun")
        dependsOn(":conformance:github:consumer:test")
    }

val recordStripeParityTestOutcome =
    tasks.register<JavaExec>("recordStripeParityTestOutcome") {
        group = "verification"
        description = "Records a conservative Stripe consumer outcome from current JUnit XML."
        classpath = sourceSets["main"].runtimeClasspath
        mainClass.set("com.nabobery.sdkgen.conformance.parity.ParityTaskOutcomeCli")
        inputs.file(stripeRunMarker)
        inputs.files(stripeJUnitXml).withPathSensitivity(PathSensitivity.RELATIVE)
        outputs.file(stripeTaskOutcome)
        args(stripeJUnitXml.asFile.absolutePath, stripeTaskOutcome.get().asFile.absolutePath)
        dependsOn(":conformance:stripe:consumer:prepareStripeParityRun")
        dependsOn(":conformance:stripe:consumer:jvmTest")
    }

tasks.register<JavaExec>("produceGitHubParityEvidence") {
    group = "verification"
    dependsOn(clearLiveParityEvidence)
    description = "Produces ephemeral current-run evidence for GitHub required behavior, JVM compile, and source rows."
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("com.nabobery.sdkgen.conformance.parity.GitHubParityProducerCli")

    inputs.property("parityRunId", githubParityRunId)
    inputs.property("currentCommitSha", currentCommitSha)
    inputs.file(githubRunMarker)
    inputs.file(githubTaskOutcome)
    inputs.files(githubJUnitXml).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.files(registryFiles).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs
        .files(
            rootProject.layout.projectDirectory.file("conformance/github/openapi.yaml"),
            rootProject.layout.projectDirectory.file("conformance/github/sdkgen.yaml"),
            rootProject.layout.projectDirectory.file("conformance/github/sdkgen.lock"),
            rootProject.layout.projectDirectory.file("conformance/github/overlays/code-search-runtime-semantics.yaml"),
            rootProject.layout.projectDirectory.file("gradle/libs.versions.toml"),
        ).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.dir(githubGenerated).withPathSensitivity(PathSensitivity.RELATIVE)
    outputs.files(githubEvidence, githubEvidence.map { file -> File("${file.asFile.path}.sha256") })

    args(
        rootProject.layout.projectDirectory.asFile.absolutePath,
        layout.projectDirectory
            .file("registry/parity-rows.json")
            .asFile.absolutePath,
        "github-corpus",
        "github",
        ":conformance:github:consumer:test",
        githubParityRunId.get(),
        "@${githubTaskOutcome.get().asFile.absolutePath}",
        githubJUnitXml.asFile.absolutePath,
        githubEvidence.get().asFile.absolutePath,
        rootProject.layout.projectDirectory
            .file("conformance/github/openapi.yaml")
            .asFile.absolutePath,
        rootProject.layout.projectDirectory
            .file("conformance/github/sdkgen.yaml")
            .asFile.absolutePath,
        rootProject.layout.projectDirectory
            .file("conformance/github/sdkgen.lock")
            .asFile.absolutePath,
        rootProject.layout.projectDirectory
            .file("conformance/github/overlays/code-search-runtime-semantics.yaml")
            .asFile.absolutePath,
        rootProject.layout.projectDirectory
            .file("gradle/libs.versions.toml")
            .asFile.absolutePath,
        githubGenerated.asFile.absolutePath,
        "",
        "github.compile-non-jvm",
    )
    dependsOn(recordGitHubParityTestOutcome)
    dependsOn(":conformance:github:consumer:test")
}

data class TransportParityLane(
    val taskName: String,
    val projectPath: String,
    val testTaskName: String,
    val testResultsDirectory: String,
    val producer: String,
    val subject: String,
    val testClass: String,
)

val transportParityLanes =
    listOf(
        TransportParityLane(
            taskName = "produceKtorTransportParityEvidence",
            projectPath = ":runtime:transport-ktor",
            testTaskName = "jvmTest",
            testResultsDirectory = "test-results/jvmTest",
            producer = "transport-ktor",
            subject = "transport-ktor",
            testClass = "com.nabobery.sdkgen.transport.ktor.KtorContractKitTest",
        ),
        TransportParityLane(
            taskName = "produceOkHttpTransportParityEvidence",
            projectPath = ":runtime:transport-okhttp",
            testTaskName = "jvmTest",
            testResultsDirectory = "test-results/jvmTest",
            producer = "okhttp-transport",
            subject = "transport-okhttp",
            testClass = "com.nabobery.sdkgen.transport.okhttp.OkHttpTransportContractKitTest",
        ),
        TransportParityLane(
            taskName = "produceJavaHttpTransportParityEvidence",
            projectPath = ":runtime:transport-java-http",
            testTaskName = "test",
            testResultsDirectory = "test-results/test",
            producer = "java-http-transport",
            subject = "transport-java-http",
            testClass = "com.nabobery.sdkgen.transport.javahttp.JavaHttpContractKitTest",
        ),
    )

transportParityLanes.forEach { lane ->
    val transportProject = project(lane.projectPath)
    val junitXml = transportProject.layout.buildDirectory.dir(lane.testResultsDirectory)
    val evidence =
        transportParityRunId.flatMap { runId ->
            require(validParityRunId.matches(runId)) { "parityRunId is missing or invalid" }
            layout.buildDirectory.file("evidence/transport/$runId/${lane.producer}.json")
        }

    transportProject.tasks.matching { task -> task.name == lane.testTaskName }.configureEach {
        inputs.property("parityRunId", transportParityRunId)
    }

    tasks.register<JavaExec>(lane.taskName) {
        group = "verification"
        description = "Produces run-scoped evidence for the exact ${lane.testClass} ContractKit inventory."
        classpath = sourceSets["main"].runtimeClasspath
        mainClass.set("com.nabobery.sdkgen.conformance.parity.TransportParityProducerCli")

        inputs.property("parityRunId", transportParityRunId)
        inputs.property("currentCommitSha", currentCommitSha)
        inputs.files(registryFiles).withPathSensitivity(PathSensitivity.RELATIVE)
        inputs.file(rootProject.layout.projectDirectory.file("gradle/libs.versions.toml"))
        inputs.dir(junitXml).withPathSensitivity(PathSensitivity.RELATIVE)
        outputs.files(evidence, evidence.map { file -> File("${file.asFile.path}.sha256") })

        args(
            rootProject.layout.projectDirectory.asFile.absolutePath,
            layout.projectDirectory
                .file("registry/parity-rows.json")
                .asFile.absolutePath,
            lane.producer,
            lane.subject,
            "${lane.projectPath}:${lane.testTaskName}",
            transportParityRunId.get(),
            lane.testClass,
            junitXml.get().asFile.absolutePath,
            evidence.get().asFile.absolutePath,
        )
        dependsOn("${lane.projectPath}:${lane.testTaskName}")
        dependsOn(clearLiveParityEvidence)
    }
}

tasks.register<JavaExec>("produceStripeParityEvidence") {
    group = "verification"
    dependsOn(clearLiveParityEvidence)
    description = "Produces ephemeral current-run evidence for registered Stripe behavior, compile, and source rows."
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("com.nabobery.sdkgen.conformance.parity.StripeParityProducerCli")

    inputs.property("parityRunId", stripeParityRunId)
    inputs.property("currentCommitSha", currentCommitSha)
    inputs.file(stripeRunMarker)
    inputs.file(stripeTaskOutcome)
    inputs.files(stripeJUnitXml).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.files(registryFiles).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs
        .files(
            rootProject.layout.projectDirectory.file("conformance/stripe/openapi.json"),
            rootProject.layout.projectDirectory.file("conformance/stripe/sdkgen.yaml"),
            rootProject.layout.projectDirectory.file("conformance/stripe/sdkgen.lock"),
            rootProject.layout.projectDirectory.file("gradle/libs.versions.toml"),
        ).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.dir(stripeGenerated).withPathSensitivity(PathSensitivity.RELATIVE)
    outputs.files(stripeEvidence, stripeEvidence.map { file -> File("${file.asFile.path}.sha256") })

    args(
        rootProject.layout.projectDirectory.asFile.absolutePath,
        layout.projectDirectory
            .file("registry/parity-rows.json")
            .asFile.absolutePath,
        "stripe-corpus",
        "stripe",
        ":conformance:stripe:consumer:jvmTest",
        stripeParityRunId.get(),
        "@${stripeTaskOutcome.get().asFile.absolutePath}",
        stripeJUnitXml.asFile.absolutePath,
        stripeEvidence.get().asFile.absolutePath,
        rootProject.layout.projectDirectory
            .file("conformance/stripe/openapi.json")
            .asFile.absolutePath,
        rootProject.layout.projectDirectory
            .file("conformance/stripe/sdkgen.yaml")
            .asFile.absolutePath,
        rootProject.layout.projectDirectory
            .file("conformance/stripe/sdkgen.lock")
            .asFile.absolutePath,
        "-",
        rootProject.layout.projectDirectory
            .file("gradle/libs.versions.toml")
            .asFile.absolutePath,
        stripeGenerated.asFile.absolutePath,
        // The JVM-only producer must record this optional registry fixture as deliberately unrun.
        "",
        "stripe.compile-non-jvm",
    )
    dependsOn(":conformance:stripe:consumer:jvmTest", recordStripeParityTestOutcome)
}

val recordOpenRouterParityTestOutcome =
    tasks.register<JavaExec>("recordOpenRouterParityTestOutcome") {
        group = "verification"
        description = "Records a conservative OpenRouter JVM consumer outcome from current JUnit XML."
        classpath = sourceSets["main"].runtimeClasspath
        mainClass.set("com.nabobery.sdkgen.conformance.parity.ParityTaskOutcomeCli")
        inputs.file(openRouterRunMarker)
        inputs.files(openRouterJUnitXml).withPathSensitivity(PathSensitivity.RELATIVE)
        outputs.file(openRouterTaskOutcome)
        args(openRouterJUnitXml.asFile.absolutePath, openRouterTaskOutcome.get().asFile.absolutePath)
        dependsOn(":conformance:openrouter:consumer:prepareOpenRouterParityRun")
        dependsOn(":conformance:openrouter:consumer:jvmTest")
    }

val recordOpenRouterCompileJvmFixture =
    tasks.register<JavaExec>("recordOpenRouterCompileJvmFixture") {
        group = "verification"
        description = "Records successful OpenRouter JVM source compilation as a parity fixture."
        classpath = sourceSets["main"].runtimeClasspath
        mainClass.set("com.nabobery.sdkgen.conformance.parity.ParityPassedFixtureCli")
        inputs.property("parityRunId", openRouterParityRunId)
        inputs.dir(openRouterGenerated).withPathSensitivity(PathSensitivity.RELATIVE)
        outputs.file(openRouterCompileJvmEvent)
        args(
            openRouterParityRunId.get(),
            "openrouter.compile-jvm",
            openRouterCompileJvmEvent.get().asFile.absolutePath,
        )
        dependsOn(
            ":conformance:openrouter:consumer:compileKotlinJvm",
            ":conformance:openrouter:consumer:prepareOpenRouterParityRun",
        )
    }

val recordOpenRouterRepresentativeKmpFixture =
    tasks.register<JavaExec>("recordOpenRouterRepresentativeKmpFixture") {
        group = "verification"
        description = "Records representative OpenRouter JS, Android, and native compilation as a parity fixture."
        classpath = sourceSets["main"].runtimeClasspath
        mainClass.set("com.nabobery.sdkgen.conformance.parity.ParityPassedFixtureCli")
        inputs.property("parityRunId", openRouterParityRunId)
        inputs.dir(openRouterGenerated).withPathSensitivity(PathSensitivity.RELATIVE)
        outputs.file(openRouterCompileKmpEvent)
        args(
            openRouterParityRunId.get(),
            "openrouter.compile-representative-kmp",
            openRouterCompileKmpEvent.get().asFile.absolutePath,
        )
        dependsOn(
            ":conformance:openrouter:consumer:compileAndroidMain",
            ":conformance:openrouter:consumer:compileKotlinJs",
            ":conformance:openrouter:consumer:compileKotlinMacosArm64",
            ":conformance:openrouter:consumer:prepareOpenRouterParityRun",
        )
    }

val recordOpenRouterPortableSourceFixture =
    tasks.register<JavaExec>("recordOpenRouterPortableSourceFixture") {
        group = "verification"
        description = "Scans OpenRouter generated common source for forbidden platform imports."
        classpath = sourceSets["main"].runtimeClasspath
        mainClass.set("com.nabobery.sdkgen.conformance.parity.ParityPortableSourceCli")
        inputs.property("parityRunId", openRouterParityRunId)
        inputs.dir(openRouterGenerated).withPathSensitivity(PathSensitivity.RELATIVE)
        outputs.file(openRouterSourcePortableEvent)
        args(
            openRouterGenerated.asFile.absolutePath,
            openRouterParityRunId.get(),
            "openrouter.source-portable",
            openRouterSourcePortableEvent.get().asFile.absolutePath,
            rootProject.layout.projectDirectory.asFile.absolutePath,
        )
        dependsOn(":conformance:openrouter:consumer:prepareOpenRouterParityRun")
    }

val joinOpenRouterParityFixtureEvents =
    tasks.register<JavaExec>("joinOpenRouterParityFixtureEvents") {
        group = "verification"
        description = "Combines OpenRouter JVM test and task-owned fixture events for one current run."
        classpath = sourceSets["main"].runtimeClasspath
        mainClass.set("com.nabobery.sdkgen.conformance.parity.ParityFixtureEventJoinCli")
        inputs.property("parityRunId", openRouterParityRunId)
        inputs
            .files(
                openRouterJUnitXml,
                openRouterCompileJvmEvent,
                openRouterCompileKmpEvent,
                openRouterSourcePortableEvent,
            ).withPathSensitivity(PathSensitivity.RELATIVE)
        outputs.file(openRouterCombinedEvents)
        args(
            openRouterCombinedEvents.get().asFile.absolutePath,
            openRouterJUnitXml.asFile.absolutePath,
            openRouterCompileJvmEvent.get().asFile.absolutePath,
            openRouterCompileKmpEvent.get().asFile.absolutePath,
            openRouterSourcePortableEvent.get().asFile.absolutePath,
        )
        dependsOn(
            ":conformance:openrouter:consumer:jvmTest",
            recordOpenRouterCompileJvmFixture,
            recordOpenRouterRepresentativeKmpFixture,
            recordOpenRouterPortableSourceFixture,
        )
    }

tasks.register<JavaExec>("produceOpenRouterParityEvidence") {
    group = "verification"
    dependsOn(clearLiveParityEvidence)
    description = "Produces ephemeral current-run evidence for required OpenRouter behavior, compile, and source rows."
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("com.nabobery.sdkgen.conformance.parity.OpenRouterParityProducerCli")
    inputs.property("parityRunId", openRouterParityRunId)
    inputs.property("currentCommitSha", currentCommitSha)
    inputs.file(openRouterRunMarker)
    inputs.file(openRouterTaskOutcome)
    inputs.file(openRouterCombinedEvents)
    inputs.files(registryFiles).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs
        .files(
            rootProject.layout.projectDirectory.file("conformance/openrouter/openapi.yaml"),
            rootProject.layout.projectDirectory.file("conformance/openrouter/sdkgen.yaml"),
            rootProject.layout.projectDirectory.file("conformance/openrouter/sdkgen.lock"),
            rootProject.layout.projectDirectory.file("conformance/openrouter/overlays/full-spec-compat.yaml"),
            rootProject.layout.projectDirectory.file("gradle/libs.versions.toml"),
        ).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.dir(openRouterGenerated).withPathSensitivity(PathSensitivity.RELATIVE)
    outputs.files(openRouterEvidence, openRouterEvidenceSidecar)

    args(
        rootProject.layout.projectDirectory.asFile.absolutePath,
        layout.projectDirectory
            .file("registry/parity-rows.json")
            .asFile.absolutePath,
        "openrouter-corpus",
        "openrouter",
        ":conformance:openrouter:consumer:jvmTest+representative-kmp",
        openRouterParityRunId.get(),
        "@${openRouterTaskOutcome.get().asFile.absolutePath}",
        openRouterCombinedEvents.get().asFile.absolutePath,
        openRouterEvidence.get().asFile.absolutePath,
        rootProject.layout.projectDirectory
            .file("conformance/openrouter/openapi.yaml")
            .asFile.absolutePath,
        rootProject.layout.projectDirectory
            .file("conformance/openrouter/sdkgen.yaml")
            .asFile.absolutePath,
        rootProject.layout.projectDirectory
            .file("conformance/openrouter/sdkgen.lock")
            .asFile.absolutePath,
        rootProject.layout.projectDirectory
            .file("conformance/openrouter/overlays/full-spec-compat.yaml")
            .asFile.absolutePath,
        rootProject.layout.projectDirectory
            .file("gradle/libs.versions.toml")
            .asFile.absolutePath,
        openRouterGenerated.asFile.absolutePath,
    )
    dependsOn(recordOpenRouterParityTestOutcome, joinOpenRouterParityFixtureEvents)
}

val recordStreamingStressParityTestOutcome =
    tasks.register<JavaExec>("recordStreamingStressParityTestOutcome") {
        group = "verification"
        description = "Records a conservative generated-SSE consumer outcome from current JUnit XML."
        classpath = sourceSets["main"].runtimeClasspath
        mainClass.set("com.nabobery.sdkgen.conformance.parity.ParityTaskOutcomeCli")
        inputs.file(streamingStressRunMarker)
        inputs.files(streamingStressJUnitXml).withPathSensitivity(PathSensitivity.RELATIVE)
        outputs.file(streamingStressTaskOutcome)
        args(
            streamingStressJUnitXml.asFile.absolutePath,
            streamingStressTaskOutcome.get().asFile.absolutePath,
        )
        dependsOn(":conformance:streaming-fixture:consumer:prepareStreamingStressParityRun")
        dependsOn(":conformance:streaming-fixture:consumer:test")
    }

tasks.register<JavaExec>("produceStreamingStressParityEvidence") {
    group = "verification"
    dependsOn(clearLiveParityEvidence)
    description = "Produces run-scoped evidence for the generated stress-SSE behavior row."
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("com.nabobery.sdkgen.conformance.parity.ParityProducerCli")

    inputs.property("parityRunId", streamingStressRunId)
    inputs.property("currentCommitSha", currentCommitSha)
    inputs.file(streamingStressRunMarker)
    inputs.file(streamingStressTaskOutcome)
    inputs.files(streamingStressJUnitXml).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.files(registryFiles).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs
        .files(
            rootProject.layout.projectDirectory.file("conformance/streaming-fixture/openapi.yaml"),
            rootProject.layout.projectDirectory.file("conformance/streaming-fixture/sdkgen.yaml"),
            rootProject.layout.projectDirectory.file("conformance/streaming-fixture/sdkgen.lock"),
            rootProject.layout.projectDirectory.file("gradle/libs.versions.toml"),
        ).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.dir(streamingStressGenerated).withPathSensitivity(PathSensitivity.RELATIVE)
    outputs.files(
        streamingStressEvidence,
        streamingStressEvidence.map { file -> File("${file.asFile.path}.sha256") },
    )

    args(
        rootProject.layout.projectDirectory.asFile.absolutePath,
        layout.projectDirectory
            .file("registry/parity-rows.json")
            .asFile.absolutePath,
        "streaming-stress",
        "stress-streaming",
        ":conformance:streaming-fixture:consumer:test",
        streamingStressRunId.get(),
        "@${streamingStressTaskOutcome.get().asFile.absolutePath}",
        streamingStressJUnitXml.asFile.absolutePath,
        streamingStressEvidence.get().asFile.absolutePath,
        rootProject.layout.projectDirectory
            .file("conformance/streaming-fixture/openapi.yaml")
            .asFile.absolutePath,
        rootProject.layout.projectDirectory
            .file("conformance/streaming-fixture/sdkgen.yaml")
            .asFile.absolutePath,
        rootProject.layout.projectDirectory
            .file("conformance/streaming-fixture/sdkgen.lock")
            .asFile.absolutePath,
        "-",
        rootProject.layout.projectDirectory
            .file("gradle/libs.versions.toml")
            .asFile.absolutePath,
        streamingStressGenerated.asFile.absolutePath,
    )
    dependsOn(recordStreamingStressParityTestOutcome)
    dependsOn(":conformance:streaming-fixture:consumer:test")
}

tasks.test {
    systemProperty("parity.repositoryRoot", rootProject.layout.projectDirectory.asFile.absolutePath)
    systemProperty(
        "parity.evidenceDir",
        layout.projectDirectory
            .dir("evidence")
            .asFile.absolutePath,
    )
}
