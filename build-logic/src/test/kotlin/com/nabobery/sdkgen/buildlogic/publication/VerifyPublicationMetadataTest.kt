package com.nabobery.sdkgen.buildlogic.publication

import org.gradle.testfixtures.ProjectBuilder
import org.gradle.testkit.runner.BuildResult
import org.gradle.testkit.runner.GradleRunner
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.io.TempDir
import java.nio.file.Files
import java.nio.file.Path
import java.util.zip.ZipEntry
import java.util.zip.ZipOutputStream
import kotlin.io.path.createDirectories
import kotlin.io.path.exists
import kotlin.io.path.writeText

internal class VerifyPublicationMetadataTest {
    @TempDir
    lateinit var temporaryDirectory: Path

    @Test
    fun verifiesRootMetadataEngineContentsAndHardenedConsumerFixtures() {
        val repository = temporaryDirectory.resolve("repository")
        val consumers = temporaryDirectory.resolve("consumers")
        writeRepository(repository)
        writeConsumerFixtures(consumers)
        val marker = temporaryDirectory.resolve("verification/metadata.txt")
        val task = createTask(repository, consumers, marker)

        task.verify()

        assertTrue(marker.exists())
    }

    @Test
    fun rejectsInternalProjectCoordinatesInPublishedMetadata() {
        val repository = temporaryDirectory.resolve("repository")
        val consumers = temporaryDirectory.resolve("consumers")
        writeRepository(repository, leakingArtifact = "kotlin-sdkgen-engine")
        writeConsumerFixtures(consumers)
        val task = createTask(repository, consumers, temporaryDirectory.resolve("metadata.txt"))

        val exception = assertThrows(IllegalStateException::class.java) { task.verify() }

        assertTrue(exception.message.orEmpty().contains("kotlin-sdkgen.generator:model"))
    }

    @Test
    fun rejectsMissingRepositoryDirectory() {
        val consumers = temporaryDirectory.resolve("consumers")
        writeConsumerFixtures(consumers)
        val task =
            createTask(
                temporaryDirectory.resolve("missing"),
                consumers,
                temporaryDirectory.resolve("metadata.txt"),
            )

        val exception = assertThrows(IllegalStateException::class.java) { task.verify() }

        assertTrue(exception.message.orEmpty().contains("non-empty repository directory"))
    }

    @Test
    fun rejectsEmptyRepositoryDirectory() {
        val repository = temporaryDirectory.resolve("repository").also(Path::createDirectories)
        val consumers = temporaryDirectory.resolve("consumers")
        writeConsumerFixtures(consumers)
        val task = createTask(repository, consumers, temporaryDirectory.resolve("metadata.txt"))

        val exception = assertThrows(IllegalStateException::class.java) { task.verify() }

        assertTrue(exception.message.orEmpty().contains("non-empty repository directory"))
    }

    @Test
    fun reusesConfigurationCacheWhenAppliedAsConventionPlugin() {
        val repository = temporaryDirectory.resolve("repository")
        writeRepository(repository)
        writeConsumerFixtures(temporaryDirectory.resolve("consumers"))
        writeTestKitBuild(repository)

        run("verifyPublicationMetadata", "--configuration-cache")
        val second = run("verifyPublicationMetadata", "--configuration-cache")

        assertTrue(second.output.contains("Reusing configuration cache."))
    }

    private fun createTask(
        repository: Path,
        consumers: Path,
        marker: Path,
    ): VerifyPublicationMetadata {
        val project = ProjectBuilder.builder().withProjectDir(temporaryDirectory.toFile()).build()
        return project.tasks
            .register("verifyPublicationMetadata", VerifyPublicationMetadata::class.java)
            .get()
            .apply {
                repositoryDirectory.set(repository.toFile())
                consumerFixturesDirectory.set(consumers.toFile())
                sdkgenVersion.set(VERSION)
                verificationMarker.set(marker.toFile())
            }
    }

    private fun writeTestKitBuild(repository: Path) {
        temporaryDirectory
            .resolve("settings.gradle.kts")
            .writeText("rootProject.name = \"publication-verification-test\"\n")
        temporaryDirectory.resolve("build.gradle.kts").writeText(
            """
            plugins {
                id("sdkgen.verify-publication-metadata")
            }
            """.trimIndent(),
        )
        temporaryDirectory.resolve("gradle.properties").writeText(
            """
            sdkgenVersion=$VERSION
            publicationRepository=${repository.toAbsolutePath()}
            """.trimIndent(),
        )
    }

    private fun writeRepository(
        repository: Path,
        leakingArtifact: String? = null,
    ) {
        rootArtifacts.forEach { artifact ->
            val directory = repository.resolve("com/nabobery/$artifact/$VERSION").also(Path::createDirectories)
            val dependency =
                if (artifact == leakingArtifact) {
                    """
                    <dependency>
                        <groupId>kotlin-sdkgen.generator</groupId>
                        <artifactId>model</artifactId>
                    </dependency>
                    """.trimIndent()
                } else {
                    """
                    <dependency>
                        <groupId>org.example</groupId>
                        <artifactId>external</artifactId>
                    </dependency>
                    """.trimIndent()
                }
            directory.resolve("$artifact-$VERSION.pom").writeText(
                """
                <project xmlns="http://maven.apache.org/POM/4.0.0">
                    <dependencies>
                        $dependency
                    </dependencies>
                </project>
                """.trimIndent(),
            )
            directory.resolve("$artifact-$VERSION.module").writeText(
                """
                {
                  "variants": [
                    {
                      "name": "apiElements",
                      "dependencies": [
                        { "group": "org.example", "module": "external" }
                      ]
                    }
                  ]
                }
                """.trimIndent(),
            )
        }

        val engineDirectory = repository.resolve("com/nabobery/kotlin-sdkgen-engine/$VERSION")
        writeArchive(
            engineDirectory.resolve("kotlin-sdkgen-engine-$VERSION.jar"),
            engineClasses + engineResources,
        )
        writeArchive(
            engineDirectory.resolve("kotlin-sdkgen-engine-$VERSION-sources.jar"),
            engineSources,
        )
    }

    private fun writeConsumerFixtures(consumers: Path) {
        consumers.createDirectories()
        consumers.resolve("settings.gradle.kts").writeText(
            """
            dependencyResolutionManagement {
                repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
                repositories {
                    val isolatedRepository = providers.gradleProperty("isolatedRepository")
                    exclusiveContent {
                        forRepository {
                            maven {
                                name = "isolated"
                                url = uri(isolatedRepository.get())
                            }
                        }
                        filter {
                            includeGroup("com.nabobery")
                        }
                    }
                    mavenCentral()
                }
            }
            """.trimIndent(),
        )
        consumerFixtures.forEach { (project, artifact) ->
            consumers.resolve(project).createDirectories().resolve("build.gradle.kts").writeText(
                """
                plugins {
                    java
                }

                dependencies {
                    implementation("com.nabobery:$artifact:$VERSION")
                }
                """.trimIndent(),
            )
        }
    }

    private fun writeArchive(
        archive: Path,
        entries: Set<String>,
    ) {
        ZipOutputStream(Files.newOutputStream(archive)).use { output ->
            entries.forEach { entry ->
                output.putNextEntry(ZipEntry(entry))
                output.closeEntry()
            }
        }
    }

    private fun run(vararg arguments: String): BuildResult =
        GradleRunner
            .create()
            .withGradleVersion("9.6.1")
            .withProjectDir(temporaryDirectory.toFile())
            .withArguments(*(arguments.toList() + listOf("--stacktrace", "--console=plain")).toTypedArray())
            .withPluginClasspath()
            .forwardOutput()
            .build()

    private companion object {
        const val VERSION: String = "0.1.0-SNAPSHOT"

        val rootArtifacts =
            listOf(
                "kotlin-sdkgen-engine",
                "kotlin-sdkgen-cli",
                "kotlin-sdkgen-gradle-plugin",
                "kotlin-sdkgen-runtime",
                "kotlin-sdkgen-transport-ktor",
                "kotlin-sdkgen-transport-okhttp",
                "kotlin-sdkgen-transport-java-http",
                "kotlin-sdkgen-testing",
            )

        val consumerFixtures =
            mapOf(
                "engine" to "kotlin-sdkgen-engine",
                "cli" to "kotlin-sdkgen-cli",
                "gradle-plugin" to "kotlin-sdkgen-gradle-plugin",
                "runtime" to "kotlin-sdkgen-runtime",
                "transport-ktor" to "kotlin-sdkgen-transport-ktor",
                "transport-okhttp" to "kotlin-sdkgen-transport-okhttp",
                "transport-java-http" to "kotlin-sdkgen-transport-java-http",
                "testing" to "kotlin-sdkgen-testing",
            )

        val engineClasses =
            setOf(
                "com/nabobery/sdkgen/model/SemanticDocument.class",
                "com/nabobery/sdkgen/openapi/SemanticAdapter.class",
            )

        val engineResources =
            setOf(
                "schemas/x-sdkgen-idempotency.schema.json",
                "schemas/x-sdkgen-pagination.schema.json",
                "schemas/x-sdkgen-streaming.schema.json",
            )

        val engineSources =
            setOf(
                "com/nabobery/sdkgen/model/SemanticModel.kt",
                "com/nabobery/sdkgen/model/SnapshotRenderer.kt",
                "com/nabobery/sdkgen/openapi/SemanticAdapter.kt",
            )
    }
}
