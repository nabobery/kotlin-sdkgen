package com.nabobery.sdkgen.gradleplugin

import org.gradle.testkit.runner.BuildResult
import org.gradle.testkit.runner.GradleRunner
import org.gradle.testkit.runner.TaskOutcome
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assumptions.assumeTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.io.TempDir
import java.nio.file.Files
import java.nio.file.Path
import java.util.Comparator
import kotlin.io.path.createDirectories
import kotlin.io.path.exists
import kotlin.io.path.readText
import kotlin.io.path.writeText

internal class SdkGenPluginTestKitTest {
    @TempDir
    lateinit var temporaryDirectory: Path

    @Test
    fun jvmConsumerReceivesLazyGenerationTask() {
        val project = createProject("jvm")
        enableRuntimeComposite(project)
        writeKotlinJvmBuild(project, "api")

        val result = run(project, "verifySdkgenJvmWiring")

        assertEquals(TaskOutcome.SUCCESS, result.task(":generateApiSdk")?.outcome)
        assertEquals(TaskOutcome.SUCCESS, result.task(":sourcesJar")?.outcome)
        assertTrue(project.resolve("build/generated/sdkgen/api/sources").exists())
        assertTrue(project.resolve("build/classes/kotlin/main").exists())
        assertTrue(project.resolve("build/libs/jvm-sources.jar").exists())
    }

    @Test
    fun kmpConsumerReceivesCommonMainGenerationTask() {
        val project = createProject("kmp")
        enableRuntimeComposite(project)
        writeKmpBuild(project, "api")

        val result = run(project, "verifySdkgenKmpWiring")

        assertEquals(TaskOutcome.SUCCESS, result.task(":generateApiSdk")?.outcome)
        assertEquals(TaskOutcome.SUCCESS, result.task(":compileKotlinJvm")?.outcome)
        assertTrue(project.resolve("build/generated/sdkgen/api/sources").exists())
        assertTrue(project.resolve("build/classes/kotlin/jvm/main").exists())
    }

    @Test
    fun configurationOnlyHelpDoesNotExecuteGeneration() {
        val project = createProject("configuration-only")
        writeSdkgenBuild(project, "api")

        val result = run(project, "help", "--configuration-cache")

        assertNull(result.task(":generateApiSdk"))
        assertFalse(project.resolve("build/generated/sdkgen/api").exists())
    }

    @Test
    fun outputRootsOutsideBuildAreRejectedBeforeGeneration() {
        val project = createProject("invalid-output-root")
        writeInvalidOutputBuild(project)

        val result = runAndFail(project, "generateApiSdk")

        assertTrue(result.output.contains("SDKGEN-GRADLE-OUTPUT-ROOT"))
        assertFalse(project.parent.resolve("sdkgen-out/sources").exists())
    }

    @Test
    fun sourceOutputRootsAreRejectedBeforeGeneration() {
        val project = createProject("source-output-root")
        writeInvalidOutputBuild(project, "src/generated")

        val result = runAndFail(project, "generateApiSdk")

        assertTrue(result.output.contains("SDKGEN-GRADLE-OUTPUT-ROOT"))
        assertFalse(project.resolve("src/generated/sources").exists())
    }

    @Test
    fun symlinkedOutputRootsAreRejectedBeforeGeneration() {
        val project = createProject("symlink-output-root")
        writeInvalidOutputBuild(project, "build/generated/sdkgen/api")
        val outside = temporaryDirectory.resolve("symlink-output-target").also(Path::createDirectories)
        outside.resolve("sentinel.txt").writeText("untouched")
        val outputRoot = project.resolve("build/generated/sdkgen/api")
        outputRoot.parent.createDirectories()
        val created = runCatching { Files.createSymbolicLink(outputRoot, outside) }.isSuccess
        assumeTrue(created, "symbolic links are unavailable on this host")

        val result = runAndFail(project, "generateApiSdk")

        assertTrue(result.output.contains("SDKGEN-GRADLE-OUTPUT-ROOT"))
        assertEquals("untouched", outside.resolve("sentinel.txt").toFile().readText())
        assertFalse(outside.resolve("sources").exists())
    }

    @Test
    fun symlinkedOutputPathComponentsAreRejectedBeforeGeneration() {
        val project = createProject("symlink-output-component")
        writeInvalidOutputBuild(project, "build/generated/sdkgen/api")
        val outside = temporaryDirectory.resolve("symlink-output-component-target").also(Path::createDirectories)
        outside.resolve("sentinel.txt").writeText("untouched")
        val generated = project.resolve("build/generated")
        generated.parent.createDirectories()
        val created = runCatching { Files.createSymbolicLink(generated, outside) }.isSuccess
        assumeTrue(created, "symbolic links are unavailable on this host")

        val result = runAndFail(project, "generateApiSdk")

        assertTrue(result.output.contains("SDKGEN-GRADLE-OUTPUT-ROOT"))
        assertEquals("untouched", outside.resolve("sentinel.txt").toFile().readText())
        assertFalse(outside.resolve("sdkgen").exists())
    }

    @Test
    fun absoluteInputRootsAreRejectedBeforeGeneration() {
        val project = createProject("absolute-input-root")
        writeSdkgenBuild(project, "api")
        val absoluteSpec = project.resolve("openapi.yaml").toAbsolutePath()
        project.resolve("sdkgen.yaml").writeText(config.replace("uri: openapi.yaml", "uri: $absoluteSpec"))

        val result = runAndFail(project, "generateApiSdk")

        assertTrue(result.output.contains("SDKGEN-GRADLE-ABSOLUTE-INPUT"))
        assertFalse(project.resolve("build/generated/sdkgen/api/sources").exists())
    }

    @Test
    fun overlappingNamedOutputRootsAreRejectedBeforeGeneration() {
        val project = createProject("overlapping-output-roots")
        writeOverlappingOutputBuild(project)

        val result = runAndFail(project, "generateApiSdk")

        assertTrue(result.output.contains("SDKGEN-GRADLE-OUTPUT-ROOT"))
        assertFalse(project.resolve("build/generated/sdkgen/shared/sources").exists())
    }

    @Test
    fun twoNamedConfigurationsHaveIndependentOutputs() {
        val project = createProject("two-configurations")
        writeSdkgenBuild(project, "api", "admin")

        val result = run(project, "generateApiSdk", "generateAdminSdk")

        assertEquals(TaskOutcome.SUCCESS, result.task(":generateApiSdk")?.outcome)
        assertEquals(TaskOutcome.SUCCESS, result.task(":generateAdminSdk")?.outcome)
        assertTrue(project.resolve("build/generated/sdkgen/api").exists())
        assertTrue(project.resolve("build/generated/sdkgen/admin").exists())
    }

    @Test
    fun unchangedInputsAreUpToDate() {
        val project = createProject("up-to-date")
        writeSdkgenBuild(project, "api")

        run(project, "generateApiSdk")
        val second = run(project, "generateApiSdk")

        assertEquals(TaskOutcome.UP_TO_DATE, second.task(":generateApiSdk")?.outcome)
    }

    @Test
    fun changingSpecLineEndingsDoesNotInvalidateNormalizedInputs() {
        val project = createProject("line-endings")
        writeSdkgenBuild(project, "api")

        run(project, "generateApiSdk")
        val lfTree = tree(project.resolve("build/generated/sdkgen/api/sources"))
        project.resolve("openapi.yaml").writeText(openApi.replace("\n", "\r\n"))
        val crlf = run(project, "generateApiSdk")

        assertTrue(
            crlf.task(":generateApiSdk")?.outcome in setOf(TaskOutcome.UP_TO_DATE, TaskOutcome.FROM_CACHE),
        )
        assertTreeEquals(lfTree, tree(project.resolve("build/generated/sdkgen/api/sources")))
    }

    @Test
    fun nestedReferenceChangesInvalidateGeneration() {
        val project = createProject("nested-reference")
        writeSdkgenBuild(project, "api")

        run(project, "generateApiSdk")
        project.resolve("nested/Health.yaml").writeText(nestedSchema.replace("status", "state"))
        val rerun = run(project, "generateApiSdk")

        assertTrue(rerun.task(":generateApiSdk")?.outcome != TaskOutcome.UP_TO_DATE)
    }

    @Test
    fun changedInputDoesNotRetainSnapshotHistory() {
        val project = createProject("snapshot-history")
        writeSdkgenBuild(project, "api")

        run(project, "generateApiSdk", "--build-cache")
        project.resolve("sdkgen.yaml").writeText(config.replace("com.example.generated", "com.example.generatedb"))
        run(project, "generateApiSdk", "--build-cache")
        val outputRoot = project.resolve("build/generated/sdkgen/api")
        val expectedSources = tree(outputRoot.resolve("sources"))

        run(project, "clean")
        val restored = run(project, "generateApiSdk", "--build-cache")

        assertEquals(TaskOutcome.FROM_CACHE, restored.task(":generateApiSdk")?.outcome)
        assertTreeEquals(expectedSources, tree(outputRoot.resolve("sources")))
        assertEquals(1, snapshotDirectories(outputRoot).size)
    }

    @Test
    fun cleanBuildCanRestoreFromBuildCache() {
        val project = createProject("from-cache")
        writeSdkgenBuild(project, "api")

        run(project, "generateApiSdk", "--build-cache")
        run(project, "clean")
        val restored = run(project, "generateApiSdk", "--build-cache")

        assertEquals(TaskOutcome.FROM_CACHE, restored.task(":generateApiSdk")?.outcome)
    }

    @Test
    fun relocatedProjectCanRestoreFromBuildCache() {
        val first = createProject("relocation-one")
        writeSdkgenBuild(first, "api")
        run(first, "generateApiSdk", "--build-cache")

        val second = temporaryDirectory.resolve("relocation-two").also(Path::createDirectories)
        copyProject(first, second)
        val restored = run(second, "generateApiSdk", "--build-cache")

        assertEquals(TaskOutcome.FROM_CACHE, restored.task(":generateApiSdk")?.outcome)
        assertRecursiveBytesEqual(
            first.resolve("build/generated/sdkgen/api/sources"),
            second.resolve("build/generated/sdkgen/api/sources"),
        )
    }

    @Test
    fun configurationCacheIsReused() {
        val project = createProject("configuration-cache")
        writeSdkgenBuild(project, "api")

        run(project, "generateApiSdk", "--configuration-cache")
        val second = run(project, "generateApiSdk", "--configuration-cache")

        assertTrue(second.output.contains("Reusing configuration cache."))
    }

    @Test
    fun nonEmptyPluginInputsAreRejectedUntilSpiExecutionIsWired() {
        val project = createProject("plugin-inputs")
        writePluginInputBuild(project)

        val result = runAndFail(project, "generateApiSdk")

        assertTrue(result.output.contains("SDKGEN-GRADLE-PLUGIN-INPUTS-UNSUPPORTED"))
        assertTrue(result.output.contains("pluginClasspath"))
        assertTrue(result.output.contains("pluginMetadata"))
        assertTrue(result.output.contains("SPI discovery and execution are not wired"))
        assertTrue(result.output.contains("Remove pluginClasspath, pluginMetadata"))
    }

    @Test
    fun unsupportedEditionIsRejectedWithAProblemsDiagnostic() {
        val project = createProject("unsupported-edition")
        writeSdkgenBuild(project, "api")
        project.resolve("build.gradle.kts").writeText(
            project.resolve("build.gradle.kts").readText().replace(
                "configFile.set(layout.projectDirectory.file(\"sdkgen.yaml\"))",
                "configFile.set(layout.projectDirectory.file(\"sdkgen.yaml\"))\n                    edition.set(\"future\")",
            ),
        )

        val result = runAndFail(project, "generateApiSdk")

        assertTrue(result.output.contains("SDKGEN-GRADLE-EDITION-UNSUPPORTED"))
        assertTrue(result.output.contains("known editions are community"))
        assertTrue(result.output.contains("Set edition to one of community"))
    }

    @Test
    fun failedGenerationRestoresMaterializedPriorOutput() {
        val project = createProject("materialized-rollback")
        writeSdkgenBuild(project, "api")

        run(project, "generateApiSdk")
        val outputRoot = project.resolve("build/generated/sdkgen/api")
        val before = tree(materializeSources(outputRoot))
        project.resolve("openapi.yaml").writeText("openapi: [not valid")

        runAndFail(project, "generateApiSdk")

        val after = tree(outputRoot.resolve("sources"))
        assertEquals(before.keys, after.keys)
        before.forEach { (path, bytes) ->
            assertTrue(bytes.contentEquals(after.getValue(path)), "Generated output differs at $path")
        }
    }

    @Test
    fun consumerVersionChangesDoNotInvalidateGenerationInput() {
        val project = createProject("stable-version")
        writeSdkgenBuild(project, "api")
        val buildFile = project.resolve("build.gradle.kts")
        setConsumerVersion(buildFile, "one")

        run(project, "generateApiSdk")
        setConsumerVersion(buildFile, "two")

        val result = run(project, "generateApiSdk")

        assertEquals(TaskOutcome.UP_TO_DATE, result.task(":generateApiSdk")?.outcome)
    }

    private fun setConsumerVersion(
        buildFile: Path,
        version: String,
    ) {
        val versionLine = "version = " + '"' + version + '"'
        val contents =
            Files
                .readString(buildFile)
                .lineSequence()
                .filterNot { line -> line.startsWith("version = ") }
                .joinToString("\n")
        buildFile.writeText(contents.replaceFirst("}\nsdkgen {", "}\n$versionLine\nsdkgen {"))
    }

    private fun createProject(name: String): Path {
        val project = temporaryDirectory.resolve(name).also(Path::createDirectories)
        project.resolve("settings.gradle.kts").writeText(
            """
            pluginManagement {
                repositories {
                    gradlePluginPortal()
                    mavenCentral()
                }
            }
            rootProject.name = "$name"
            """.trimIndent(),
        )
        // One TestKit daemon serves every fixture build in this class; the composite build plus KGP/AGP class
        // loaders exceed Gradle's default 384 MB daemon metaspace cap by the time the Android fixtures run.
        project.resolve("gradle.properties").writeText(
            "org.gradle.configuration-cache.problems=fail\n" +
                "org.gradle.jvmargs=-Xmx2g -XX:MaxMetaspaceSize=1g -Dfile.encoding=UTF-8\n",
        )
        project.resolve("openapi.yaml").writeText(openApi)
        project.resolve("nested").createDirectories()
        project.resolve("nested/Health.yaml").writeText(nestedSchema)
        project.resolve("sdkgen.yaml").writeText(config)
        project.resolve("plugin.bin").writeText("test-plugin")
        return project
    }

    @Test
    fun androidKmpConsumerCompilesGeneratedSourcesWithoutEarlyProviderQueries() {
        val sdk = androidSdkDirectory()
        assumeTrue(sdk != null, "Android SDK not available (set ANDROID_HOME); release CI runs this lane")
        val project = createProject("kmp-android")
        enableRuntimeComposite(project)
        writeKmpAndroidBuild(project, "api", requireNotNull(sdk))

        val result = run(project, "verifySdkgenAndroidWiring", "--configuration-cache", environment = androidHome(sdk))

        assertEquals(TaskOutcome.SUCCESS, result.task(":generateApiSdk")?.outcome)
        // The consumer project's own Android compile tasks (the composite runtime's are not under test here).
        val androidCompile =
            result.tasks.filter { task ->
                task.path.startsWith(":compile") && task.path.contains("Android", ignoreCase = true)
            }
        assertTrue(androidCompile.isNotEmpty(), result.tasks.map { it.path }.toString())
        assertTrue(androidCompile.all { task -> task.outcome == TaskOutcome.SUCCESS }, androidCompile.toString())
        assertTrue(project.resolve("build/generated/sdkgen/api/sources").exists())
    }

    @Test
    fun androidKmpConsumerReusesConfigurationCacheAcrossCompiles() {
        val sdk = androidSdkDirectory()
        assumeTrue(sdk != null, "Android SDK not available (set ANDROID_HOME); release CI runs this lane")
        val project = createProject("kmp-android-cc")
        enableRuntimeComposite(project)
        writeKmpAndroidBuild(project, "api", requireNotNull(sdk))

        val arguments =
            arrayOf("verifySdkgenAndroidWiring", "--configuration-cache", "--configuration-cache-problems=fail")
        run(project, *arguments, environment = androidHome(sdk))
        val second = run(project, *arguments, environment = androidHome(sdk))

        assertTrue(second.output.contains("Reusing configuration cache."), second.output)
    }

    @Test
    fun jvmConsumerReusesConfigurationCacheAcrossCompiles() {
        val project = createProject("jvm-cc")
        enableRuntimeComposite(project)
        writeKotlinJvmBuild(project, "api")

        run(project, "compileKotlin", "--configuration-cache", "--configuration-cache-problems=fail")
        val second = run(project, "compileKotlin", "--configuration-cache", "--configuration-cache-problems=fail")

        assertTrue(second.output.contains("Reusing configuration cache."), second.output)
        assertEquals(TaskOutcome.UP_TO_DATE, second.task(":compileKotlin")?.outcome)
    }

    @Test
    fun kmpConsumerReusesConfigurationCacheAcrossCompiles() {
        val project = createProject("kmp-cc")
        enableRuntimeComposite(project)
        writeKmpBuild(project, "api")

        run(project, "compileKotlinJvm", "--configuration-cache", "--configuration-cache-problems=fail")
        val second = run(project, "compileKotlinJvm", "--configuration-cache", "--configuration-cache-problems=fail")

        assertTrue(second.output.contains("Reusing configuration cache."), second.output)
    }

    @Test
    fun ktlintAppliedAfterSdkgenExcludesGeneratedSourcesAndStillLintsHandwrittenCode() {
        assertKtlintIntegration("ktlint-after", ktlintFirst = false)
    }

    @Test
    fun ktlintAppliedBeforeSdkgenExcludesGeneratedSourcesAndStillLintsHandwrittenCode() {
        assertKtlintIntegration("ktlint-before", ktlintFirst = true)
    }

    private fun assertKtlintIntegration(
        name: String,
        ktlintFirst: Boolean,
    ) {
        val project = createProject(name)
        enableRuntimeComposite(project)
        writeKotlinJvmKtlintBuild(project, "api", ktlintFirst)
        project.resolve("src/main/kotlin").createDirectories()
        project.resolve("src/main/kotlin/Handwritten.kt").writeText("fun  handwritten( ) =  1\n")

        // Plugin application and configuration must succeed in either order.
        run(project, "help")

        // The source-set task depends on generation through the generated-sources collection, not on an explicit
        // consumer-side `dependsOn`; `--continue` is not needed because only one lint task runs.
        val lint = runAndFail(project, "ktlintMainSourceSetCheck")

        assertEquals(TaskOutcome.SUCCESS, lint.task(":generateApiSdk")?.outcome)
        assertEquals(TaskOutcome.FAILED, lint.task(":ktlintMainSourceSetCheck")?.outcome)
        assertTrue(lint.output.contains("Handwritten.kt"), lint.output)
        assertFalse(lint.output.contains("build/generated/sdkgen"), lint.output)
    }

    /**
     * The composite build's own Android targets (for example `runtime:core`) locate the SDK through the nested
     * Gradle's environment; the consumer's `local.properties` only reaches the consumer build.
     */
    private fun androidHome(sdk: Path): Map<String, String> = mapOf("ANDROID_HOME" to sdk.toString())

    private fun androidSdkDirectory(): Path? =
        listOfNotNull(
            System.getenv("ANDROID_HOME"),
            System.getenv("ANDROID_SDK_ROOT"),
            System.getProperty("user.home")?.let { home -> "$home/Library/Android/sdk" },
        ).map(Path::of)
            .firstOrNull { candidate -> candidate.resolve("platforms/android-36").exists() }

    private fun writeKmpAndroidBuild(
        project: Path,
        name: String,
        sdk: Path,
    ) {
        project.resolve("local.properties").writeText("sdk.dir=${sdk.toString().replace('\\', '/')}\n")
        project.resolve("build.gradle.kts").writeText(
            """
            plugins {
                id("org.jetbrains.kotlin.multiplatform") version "2.3.20"
                id("org.jetbrains.kotlin.plugin.serialization") version "2.3.20"
                id("com.android.kotlin.multiplatform.library") version "9.2.1"
                id("io.github.nabobery.kotlin-sdkgen")
            }
            repositories {
                mavenCentral()
                google()
            }
            kotlin {
                jvm()
                jvmToolchain(17)
                androidLibrary {
                    namespace = "com.example.generated"
                    compileSdk = 36
                    minSdk = 24
                }
                sourceSets {
                    commonMain.dependencies {
                        implementation("io.github.nabobery:kotlin-sdkgen-runtime:0.1.0-SNAPSHOT")
                    }
                }
            }
            sdkgen {
                configurations {
                    register("$name") {
                        configFile.set(layout.projectDirectory.file("sdkgen.yaml"))
                    }
                }
            }
            tasks.register("verifySdkgenAndroidWiring") {
                dependsOn(tasks.matching { task -> task.name.startsWith("compile") && task.name.contains("Android") })
                // Enumerated at configuration time on purpose: the generated source root must be a stable path that
                // resolves without querying a task output, and this task must stay configuration-cache compatible.
                val sourceDirectories = kotlin.sourceSets.getByName("commonMain").kotlin.srcDirs.map { directory ->
                    directory.path.replace('\\', '/')
                }
                doLast {
                    check(sourceDirectories.any { directory -> directory.endsWith("build/generated/sdkgen/$name/sources") })
                }
            }
            """.trimIndent(),
        )
        // AGP and its dependencies resolve from Google's repository: add it beside every `mavenCentral()` entry in
        // both the plugin-management and dependency-resolution blocks, whatever their indentation.
        val settings = project.resolve("settings.gradle.kts")
        settings.writeText(
            settings.readText().replace(Regex("(?m)^(\\s*)mavenCentral\\(\\)$"), "$1mavenCentral()\n$1google()"),
        )
    }

    private fun writeKotlinJvmKtlintBuild(
        project: Path,
        name: String,
        ktlintFirst: Boolean,
    ) {
        val ktlint = "id(\"org.jlleitschuh.gradle.ktlint\") version \"14.2.0\""
        val sdkgen = "id(\"io.github.nabobery.kotlin-sdkgen\")"
        val ordered = if (ktlintFirst) listOf(ktlint, sdkgen) else listOf(sdkgen, ktlint)
        project.resolve("build.gradle.kts").writeText(
            """
            plugins {
                id("org.jetbrains.kotlin.jvm") version "2.3.20"
                id("org.jetbrains.kotlin.plugin.serialization") version "2.3.20"
                ${ordered[0]}
                ${ordered[1]}
            }
            repositories {
                mavenCentral()
            }
            dependencies {
                implementation("io.github.nabobery:kotlin-sdkgen-runtime:0.1.0-SNAPSHOT")
            }
            kotlin {
                jvmToolchain(17)
            }
            sdkgen {
                configurations {
                    register("$name") {
                        configFile.set(layout.projectDirectory.file("sdkgen.yaml"))
                    }
                }
            }
            """.trimIndent(),
        )
    }

    private fun enableRuntimeComposite(project: Path) {
        val sdkgenRoot =
            requireNotNull(System.getProperty("sdkgen.testRoot"))
                .replace('\\', '/')
        val name = project.fileName.toString()
        project.resolve("settings.gradle.kts").writeText(
            """
            pluginManagement {
                repositories {
                    gradlePluginPortal()
                    mavenCentral()
                }
            }
            dependencyResolutionManagement {
                repositories {
                    mavenCentral()
                }
            }
            includeBuild("$sdkgenRoot") {
                dependencySubstitution {
                    substitute(module("io.github.nabobery:kotlin-sdkgen-runtime"))
                        .using(project(":runtime:core"))
                }
            }
            rootProject.name = "$name"
            """.trimIndent(),
        )
    }

    private fun writeKotlinJvmBuild(
        project: Path,
        name: String,
    ) {
        project.resolve("build.gradle.kts").writeText(
            """
            plugins {
                id("org.jetbrains.kotlin.jvm") version "2.3.20"
                id("org.jetbrains.kotlin.plugin.serialization") version "2.3.20"
                id("io.github.nabobery.kotlin-sdkgen")
            }
            repositories {
                mavenCentral()
            }
            dependencies {
                implementation("io.github.nabobery:kotlin-sdkgen-runtime:0.1.0-SNAPSHOT")
            }
            kotlin {
                jvmToolchain(17)
            }
            java {
                withSourcesJar()
            }
            sdkgen {
                configurations {
                    register("$name") {
                        configFile.set(layout.projectDirectory.file("sdkgen.yaml"))
                    }
                }
            }
            tasks.register("verifySdkgenJvmWiring") {
                dependsOn("compileKotlin", "sourcesJar")
                doLast {
                    check(kotlin.sourceSets.getByName("main").kotlin.srcDirs.any { directory ->
                        directory.path.replace('\\', '/').endsWith("build/generated/sdkgen/$name/sources")
                    })
                }
            }
            """.trimIndent(),
        )
    }

    private fun writeKmpBuild(
        project: Path,
        name: String,
    ) {
        project.resolve("build.gradle.kts").writeText(
            """
            plugins {
                id("org.jetbrains.kotlin.multiplatform") version "2.3.20"
                id("org.jetbrains.kotlin.plugin.serialization") version "2.3.20"
                id("io.github.nabobery.kotlin-sdkgen")
            }
            repositories {
                mavenCentral()
            }
            kotlin {
                jvm()
                jvmToolchain(17)
                sourceSets {
                    commonMain.dependencies {
                        implementation("io.github.nabobery:kotlin-sdkgen-runtime:0.1.0-SNAPSHOT")
                    }
                }
            }
            sdkgen {
                configurations {
                    register("$name") {
                        configFile.set(layout.projectDirectory.file("sdkgen.yaml"))
                    }
                }
            }
            tasks.register("verifySdkgenKmpWiring") {
                dependsOn(
                    "generate${name.replaceFirstChar { character -> character.titlecase() }}Sdk",
                    "compileKotlinJvm",
                )
                doLast {
                    check(kotlin.sourceSets.getByName("commonMain").kotlin.srcDirs.any { directory ->
                        directory.path.replace('\\', '/').endsWith("build/generated/sdkgen/$name/sources")
                    })
                }
            }
            """.trimIndent(),
        )
    }

    private fun writeSdkgenBuild(
        project: Path,
        vararg names: String,
    ) {
        val configurations =
            names.joinToString("\n") { name ->
                """
                register("$name") {
                    configFile.set(layout.projectDirectory.file("sdkgen.yaml"))
                }
                """.trimIndent()
            }
        project.resolve("build.gradle.kts").writeText(
            """
            plugins {
                id("base")
                id("io.github.nabobery.kotlin-sdkgen")
            }
            sdkgen {
                configurations {
                    $configurations
                }
            }
            """.trimIndent(),
        )
    }

    private fun writePluginInputBuild(project: Path) {
        project.resolve("build.gradle.kts").writeText(
            """
            plugins {
                id("base")
                id("io.github.nabobery.kotlin-sdkgen")
            }
            sdkgen {
                configurations {
                    create("api") {
                        configFile.set(layout.projectDirectory.file("sdkgen.yaml"))
                        pluginClasspath.from(layout.projectDirectory.file("plugin.bin"))
                        pluginMetadata.put("id", "example.plugin")
                    }
                }
            }
            """.trimIndent(),
        )
    }

    private fun writeInvalidOutputBuild(
        project: Path,
        outputPath: String = "../sdkgen-out",
    ) {
        project.resolve("build.gradle.kts").writeText(
            """
            plugins {
                id("base")
                id("io.github.nabobery.kotlin-sdkgen")
            }
            sdkgen {
                configurations {
                    create("api") {
                        configFile.set(layout.projectDirectory.file("sdkgen.yaml"))
                        outputDirectory.set(layout.projectDirectory.dir("$outputPath"))
                    }
                }
            }
            """.trimIndent(),
        )
    }

    private fun writeOverlappingOutputBuild(project: Path) {
        project.resolve("build.gradle.kts").writeText(
            """
            plugins {
                id("base")
                id("io.github.nabobery.kotlin-sdkgen")
            }
            sdkgen {
                configurations {
                    create("api") {
                        configFile.set(layout.projectDirectory.file("sdkgen.yaml"))
                        outputDirectory.set(layout.buildDirectory.dir("generated/sdkgen/shared"))
                    }
                    create("admin") {
                        configFile.set(layout.projectDirectory.file("sdkgen.yaml"))
                        outputDirectory.set(layout.buildDirectory.dir("generated/sdkgen/shared/child"))
                    }
                }
            }
            """.trimIndent(),
        )
    }

    private fun copyProject(
        source: Path,
        destination: Path,
    ) {
        val buildDirectory = source.resolve("build")
        val gradleDirectory = source.resolve(".gradle")
        Files.walk(source).use { paths ->
            paths
                .filter { path -> !path.startsWith(buildDirectory) && !path.startsWith(gradleDirectory) }
                .forEach { path ->
                    val target = destination.resolve(source.relativize(path).toString())
                    if (Files.isDirectory(path)) target.createDirectories() else Files.copy(path, target)
                }
        }
    }

    private fun assertRecursiveBytesEqual(
        expectedRoot: Path,
        actualRoot: Path,
    ) {
        assertTreeEquals(tree(expectedRoot), tree(actualRoot))
    }

    private fun assertTreeEquals(
        expected: Map<String, ByteArray>,
        actual: Map<String, ByteArray>,
    ) {
        assertEquals(expected.keys, actual.keys)
        expected.forEach { (relativePath, expectedBytes) ->
            assertTrue(
                expectedBytes.contentEquals(actual.getValue(relativePath)),
                "Generated output differs at $relativePath",
            )
        }
    }

    private fun assertTreeDiffers(
        expected: Map<String, ByteArray>,
        actual: Map<String, ByteArray>,
    ) {
        assertEquals(expected.keys, actual.keys)
        assertTrue(
            expected.any { (relativePath, expectedBytes) ->
                !expectedBytes.contentEquals(actual.getValue(relativePath))
            },
            "Expected generated output bytes to differ",
        )
    }

    private fun snapshotDirectories(root: Path): List<Path> {
        val snapshots = root.resolve(".snapshots")
        if (!Files.isDirectory(snapshots)) return emptyList()
        return Files.list(snapshots).use { entries ->
            entries.filter(Files::isDirectory).sorted().toList()
        }
    }

    private fun materializeSources(outputRoot: Path): Path {
        val pointer = outputRoot.resolve("sources")
        val resolved = resolveSymlink(pointer)
        val files =
            Files.walk(resolved).use { paths ->
                paths.filter { path -> Files.isRegularFile(path) }.toList()
            }
        deleteRecursively(pointer)
        pointer.createDirectories()
        files.forEach { source ->
            val target = pointer.resolve(resolved.relativize(source).toString())
            target.parent.createDirectories()
            Files.copy(source, target)
        }
        return pointer
    }

    private fun tree(root: Path): Map<String, ByteArray> {
        val resolvedRoot = resolveSymlink(root)
        if (!Files.exists(resolvedRoot)) return emptyMap()
        val files =
            Files.walk(resolvedRoot).use { paths ->
                paths.filter(Files::isRegularFile).sorted().toList()
            }
        return files.associate { path ->
            resolvedRoot.relativize(path).toString().replace('\\', '/') to Files.readAllBytes(path)
        }
    }

    private fun resolveSymlink(path: Path): Path {
        var current = path
        while (Files.isSymbolicLink(current)) {
            current = current.parent.resolve(Files.readSymbolicLink(current)).normalize()
        }
        return current
    }

    private fun deleteRecursively(path: Path) {
        if (Files.isSymbolicLink(path)) {
            Files.deleteIfExists(path)
            return
        }
        if (!Files.exists(path)) return
        Files.walk(path).use { paths ->
            paths.sorted(Comparator.reverseOrder()).forEach(Files::deleteIfExists)
        }
    }

    private fun run(
        project: Path,
        vararg arguments: String,
        environment: Map<String, String> = emptyMap(),
    ): BuildResult = runner(project, arguments, environment).build()

    private fun runAndFail(
        project: Path,
        vararg arguments: String,
    ): BuildResult = runner(project, arguments, emptyMap()).buildAndFail()

    private fun runner(
        project: Path,
        arguments: Array<out String>,
        environment: Map<String, String>,
    ): GradleRunner =
        GradleRunner
            .create()
            .withGradleVersion("9.6.1")
            .withProjectDir(project.toFile())
            .withArguments(
                *(arguments.toList() + listOf("--stacktrace", "--console=plain")).toTypedArray(),
            ).withPluginClasspath()
            .forwardOutput()
            .let { runner ->
                if (environment.isEmpty()) runner else runner.withEnvironment(System.getenv() + environment)
            }

    private val openApi =
        """
        openapi: 3.1.0
        info:
          title: Test API
          version: 1.0.0
        paths:
          /health:
            get:
              operationId: health
              responses:
                '200':
                  description: OK
                  content:
                    application/json:
                      schema:
                        ${'$'}ref: nested/Health.yaml#/components/schemas/Health
        """.trimIndent()

    private val nestedSchema =
        """
        components:
          schemas:
            Health:
              type: object
              required:
                - status
              properties:
                status:
                  type: string
        """.trimIndent()

    private val config =
        """
        version: v1alpha1
        source:
          uri: openapi.yaml
          acquisition:
            mode: local
            offline: true
        kotlin:
          packageName: com.example.generated
          coordinates:
            groupId: com.example
            artifactId: generated
          naming:
            clientName: TestClient
          targets:
            - jvm
        output:
          sources: build/generated/sdkgen/commonMain/kotlin
          resources: build/generated/sdkgen/commonMain/resources
          manifest: build/reports/sdkgen/manifest.json
        """.trimIndent()
}
