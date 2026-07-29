package com.nabobery.sdkgen.buildlogic.publication

import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.io.TempDir
import java.nio.file.Path
import java.util.jar.JarOutputStream
import kotlin.io.path.createDirectories
import kotlin.io.path.exists
import kotlin.io.path.outputStream
import kotlin.io.path.writeText

/**
 * [ExecuteIsolatedConsumerBuildTest] proves the isolated-consumption check actually *resolves and compiles*
 * against the staged repository rather than reading the consumer build files as text.
 *
 * [PublicationMetadataTopology.verifyConsumerFixtures] greps: it asserts substrings are present, counts
 * `maven {` blocks with a regex, and checks `"com.nabobery:$artifact:" in buildText`. Every one of those is
 * satisfied by a fixture whose declared dependency does not exist, whose Gradle Module Metadata does not
 * resolve, or whose public types are not visible — which is the entire question a consumer fixture exists to
 * answer. `unresolvableDependencyFailsEvenThoughTheBuildFilesLookCorrect` is that exact case: the fixture
 * passes every textual check and must still fail.
 */
internal class ExecuteIsolatedConsumerBuildTest {
    @TempDir
    lateinit var temporaryDirectory: Path

    @Test
    fun resolvesAndCompilesAConsumerAgainstTheStagedRepository() {
        val repository = temporaryDirectory.resolve("repository")
        stageResolvableLibrary(repository)
        val consumers = temporaryDirectory.resolve("consumers")
        writeConsumerBuild(consumers, dependencyVersion = STAGED_VERSION)
        val marker = temporaryDirectory.resolve("consumers-built.txt")

        createTask(repository, consumers, marker).execute()

        assertTrue(marker.exists())
    }

    @Test
    fun unresolvableDependencyFailsEvenThoughTheBuildFilesLookCorrect() {
        val repository = temporaryDirectory.resolve("repository")
        stageResolvableLibrary(repository)
        val consumers = temporaryDirectory.resolve("consumers")
        // Textually indistinguishable from the passing case: same repository wiring, same coordinate shape,
        // same includeGroup filter. Only the version does not exist in the staged repository.
        writeConsumerBuild(consumers, dependencyVersion = "9.9.9")
        val marker = temporaryDirectory.resolve("consumers-built.txt")

        val failure =
            assertThrows(IllegalStateException::class.java) {
                createTask(repository, consumers, marker).execute()
            }

        assertTrue(failure.message.orEmpty().contains("Isolated consumer build failed"), failure.message.orEmpty())
        assertTrue(!marker.exists(), "no marker may be written for a failed consumer build")
    }

    private fun createTask(
        repository: Path,
        consumers: Path,
        marker: Path,
    ): ExecuteIsolatedConsumerBuild {
        val project = ProjectBuilder.builder().withProjectDir(temporaryDirectory.toFile()).build()
        return project.tasks
            .register("executeIsolatedConsumerBuild", ExecuteIsolatedConsumerBuild::class.java)
            .get()
            .apply {
                repositoryDirectory.set(repository.toFile())
                consumerFixturesDirectory.set(consumers.toFile())
                gradleWrapperScript.set(repositoryWrapperScript().toFile())
                sdkgenVersion.set(STAGED_VERSION)
                // Shared across both cases in this class so Maven Central downloads happen at most once.
                isolatedGradleUserHome.set(sharedGradleUserHome().toFile())
                verificationMarker.set(marker.toFile())
            }
    }

    /**
     * The wrapper of the repository this suite is running in. `build-logic` has no project directory of its
     * own at test time, so the wrapper is located by walking up from the working directory until `gradlew`
     * appears — the same script a real external consumer would invoke.
     */
    private fun repositoryWrapperScript(): Path {
        var candidate: Path? = Path.of("").toAbsolutePath()
        while (candidate != null) {
            val wrapper = candidate.resolve("gradlew")
            if (wrapper.exists()) return wrapper
            candidate = candidate.parent
        }
        error("could not locate a gradlew wrapper above ${Path.of("").toAbsolutePath()}")
    }

    private fun sharedGradleUserHome(): Path =
        repositoryWrapperScript()
            .parent
            .resolve("build/isolated-consumer-test-gradle-home")
            .also(Path::createDirectories)

    /**
     * A minimal but genuinely resolvable Maven layout: one jar plus the POM Gradle needs to resolve it.
     * Deliberately not a real SDKGen artifact — this test is about the mechanism, and using a real one would
     * make it depend on a staging run having happened.
     */
    private fun stageResolvableLibrary(repository: Path) {
        val directory =
            repository
                .resolve("com/nabobery/kotlin-sdkgen-runtime/$STAGED_VERSION")
                .also(Path::createDirectories)
        // A real (empty but well-formed) jar. An empty *file* is not a jar: javac reports
        // "zip END header not found" and the build fails for the wrong reason.
        JarOutputStream(
            directory.resolve("kotlin-sdkgen-runtime-$STAGED_VERSION.jar").outputStream(),
        ).close()
        directory.resolve("kotlin-sdkgen-runtime-$STAGED_VERSION.pom").writeText(
            """
            <?xml version="1.0" encoding="UTF-8"?>
            <project xmlns="http://maven.apache.org/POM/4.0.0">
              <modelVersion>4.0.0</modelVersion>
              <groupId>com.nabobery</groupId>
              <artifactId>kotlin-sdkgen-runtime</artifactId>
              <version>$STAGED_VERSION</version>
              <packaging>jar</packaging>
            </project>
            """.trimIndent(),
        )
    }

    private fun writeConsumerBuild(
        consumers: Path,
        dependencyVersion: String,
    ) {
        consumers.createDirectories()
        consumers.resolve("settings.gradle.kts").writeText(
            """
            dependencyResolutionManagement {
                repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
                repositories {
                    val isolatedRepository =
                        providers.gradleProperty("isolatedRepository").orNull
                            ?: error("The isolatedRepository Gradle property is required.")
                    exclusiveContent {
                        forRepository {
                            maven {
                                name = "isolated"
                                url = uri(isolatedRepository)
                            }
                        }
                        filter {
                            includeGroup("com.nabobery")
                        }
                    }
                }
            }

            rootProject.name = "isolated-consumer-mechanism-test"
            include(":runtime")
            """.trimIndent(),
        )
        val runtime = consumers.resolve("runtime").also(Path::createDirectories)
        runtime.resolve("build.gradle.kts").writeText(
            """
            plugins {
                java
            }

            dependencies {
                implementation("com.nabobery:kotlin-sdkgen-runtime:$dependencyVersion")
            }
            """.trimIndent(),
        )
        runtime
            .resolve("src/main/java/consumer")
            .also(Path::createDirectories)
            .resolve("Consumer.java")
            .writeText("package consumer;\n\npublic final class Consumer {\n}\n")
    }

    private companion object {
        const val STAGED_VERSION: String = "1.2.3"
    }
}
