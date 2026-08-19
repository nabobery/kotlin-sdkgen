package com.nabobery.sdkgen.buildlogic.publication

import com.nabobery.sdkgen.buildlogic.publication.inventory.SdkgenProductStagedArtifactInventoryJson
import org.gradle.testfixtures.ProjectBuilder
import org.gradle.testkit.runner.BuildResult
import org.gradle.testkit.runner.GradleRunner
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.io.TempDir
import java.nio.file.Path
import kotlin.io.path.createDirectories
import kotlin.io.path.exists
import kotlin.io.path.writeBytes
import kotlin.io.path.writeText

internal class VerifyStagedArtifactInventoryTest {
    @TempDir
    lateinit var temporaryDirectory: Path

    @Test
    fun releaseInventoryIncludesAllPublishedIntelAppleVariants() {
        assertTrue(
            Adr0008ProductArtifactIds.releaseProductArtifactIds.containsAll(
                setOf(
                    "kotlin-sdkgen-runtime-iosx64",
                    "kotlin-sdkgen-runtime-macosx64",
                    "kotlin-sdkgen-testing-iosx64",
                    "kotlin-sdkgen-testing-macosx64",
                    "kotlin-sdkgen-transport-ktor-iosx64",
                    "kotlin-sdkgen-transport-ktor-macosx64",
                ),
            ),
            "release inventory must include all six Intel Apple product variants",
        )
    }

    @Test
    fun verifiesAConsistentInventoryAgainstItsRepository() {
        val repository = temporaryDirectory.resolve("repository")
        writeFullRepository(repository)
        val inventoryFile = temporaryDirectory.resolve("inventory.json")
        generate(repository, inventoryFile)
        val marker = temporaryDirectory.resolve("verified.txt")
        val task = createVerifyTask(repository, inventoryFile, marker)

        task.verify()

        assertTrue(marker.exists())
    }

    @Test
    fun rejectsAChecksumMismatchBetweenTheInventoryAndTheStagedFile() {
        val repository = temporaryDirectory.resolve("repository")
        writeFullRepository(repository)
        val inventoryFile = temporaryDirectory.resolve("inventory.json")
        generate(repository, inventoryFile)
        // Tamper with a staged artifact after the inventory was generated over the original bytes.
        val stagedJar = "io/github/nabobery/kotlin-sdkgen-engine/1.2.3/kotlin-sdkgen-engine-1.2.3.jar"
        repository.resolve(stagedJar).writeBytes("tampered".toByteArray())
        val task = createVerifyTask(repository, inventoryFile, temporaryDirectory.resolve("verified.txt"))

        val exception = assertThrows(IllegalStateException::class.java) { task.verify() }

        assertTrue(exception.message.orEmpty().contains("checksum mismatch"))
    }

    @Test
    fun rejectsAStagedFileTheInventoryNamesThatNoLongerExists() {
        val repository = temporaryDirectory.resolve("repository")
        writeFullRepository(repository)
        val inventoryFile = temporaryDirectory.resolve("inventory.json")
        generate(repository, inventoryFile)
        repository
            .resolve("io/github/nabobery/kotlin-sdkgen-engine/1.2.3/kotlin-sdkgen-engine-1.2.3.jar")
            .toFile()
            .delete()
        val task = createVerifyTask(repository, inventoryFile, temporaryDirectory.resolve("verified.txt"))

        val exception = assertThrows(IllegalStateException::class.java) { task.verify() }

        assertTrue(exception.message.orEmpty().contains("staged file no longer exists"))
    }

    @Test
    fun rejectsAnInventoryMissingOneOfTheEightAdr0008Coordinates() {
        val repository = temporaryDirectory.resolve("repository")
        // Deliberately omit the testing coordinate's binary artifact.
        writeFullRepository(repository, omitArtifactId = "kotlin-sdkgen-testing")
        val inventoryFile = temporaryDirectory.resolve("inventory.json")
        generate(repository, inventoryFile)
        val task = createVerifyTask(repository, inventoryFile, temporaryDirectory.resolve("verified.txt"))

        val exception = assertThrows(IllegalStateException::class.java) { task.verify() }

        assertTrue(exception.message.orEmpty().contains("missing expected coordinate"))
        assertTrue(exception.message.orEmpty().contains("kotlin-sdkgen-testing"))
    }

    @Test
    fun releaseModeRejectsUnsignedCoordinatesWithoutJavadocOrPom() {
        val repository = temporaryDirectory.resolve("repository")
        writeFullRepository(repository)
        val inventoryFile = temporaryDirectory.resolve("inventory.json")
        generate(repository, inventoryFile)
        val task = createVerifyTask(repository, inventoryFile, temporaryDirectory.resolve("verified.txt"))
        task.requireReleaseArtifacts.set(true)

        val exception = assertThrows(IllegalStateException::class.java) { task.verify() }

        assertTrue(exception.message.orEmpty().contains("missing release POM"), exception.message.orEmpty())
        assertTrue(exception.message.orEmpty().contains("missing release javadoc jar"), exception.message.orEmpty())
        assertTrue(exception.message.orEmpty().contains("missing release signature"), exception.message.orEmpty())
    }

    @Test
    fun releaseModeRequiresEveryPhysicalPublicationWithPomAndJavadoc() {
        val repository = temporaryDirectory.resolve("repository")
        writeFullRepository(repository)
        val targetArtifactId = "kotlin-sdkgen-runtime-jvm"
        val targetDirectory =
            repository.resolve("io/github/nabobery/$targetArtifactId/$VERSION").also(Path::createDirectories)
        targetDirectory.resolve("$targetArtifactId-$VERSION.jar").writeBytes("target-bytes".toByteArray())
        writeReleaseSidecars(repository)
        targetDirectory.resolve("$targetArtifactId-$VERSION.pom").toFile().delete()
        targetDirectory.resolve("$targetArtifactId-$VERSION-javadoc.jar").toFile().delete()
        val inventoryFile = temporaryDirectory.resolve("inventory.json")
        generate(repository, inventoryFile)
        val task = createVerifyTask(repository, inventoryFile, temporaryDirectory.resolve("verified.txt"))
        task.requireReleaseArtifacts.set(true)

        val exception = assertThrows(IllegalStateException::class.java) { task.verify() }

        assertTrue(
            exception.message
                .orEmpty()
                .contains("missing release POM for io.github.nabobery:$targetArtifactId:$VERSION"),
            exception.message.orEmpty(),
        )
        assertTrue(
            exception.message.orEmpty().contains(
                "missing release javadoc jar for io.github.nabobery:$targetArtifactId:$VERSION",
            ),
            exception.message.orEmpty(),
        )
        assertTrue(
            exception.message
                .orEmpty()
                .contains("missing release publication coordinate io.github.nabobery:kotlin-sdkgen-runtime-js"),
            exception.message.orEmpty(),
        )
    }

    @Test
    fun rejectsAnEmptyInventoryEvenAgainstANonEmptyRepository() {
        val repository = temporaryDirectory.resolve("repository")
        writeFullRepository(repository)
        val inventoryFile = temporaryDirectory.resolve("inventory.json")
        val emptyInventory = SdkgenProductStagedArtifactInventoryJson.decode(EMPTY_INVENTORY_JSON)
        inventoryFile.writeText(SdkgenProductStagedArtifactInventoryJson.encode(emptyInventory))
        val task = createVerifyTask(repository, inventoryFile, temporaryDirectory.resolve("verified.txt"))

        val exception = assertThrows(IllegalStateException::class.java) { task.verify() }

        assertTrue(exception.message.orEmpty().contains("inventory is empty"))
    }

    @Test
    fun rejectsMissingRepositoryDirectory() {
        val repository = temporaryDirectory.resolve("repository")
        writeFullRepository(repository)
        val inventoryFile = temporaryDirectory.resolve("inventory.json")
        generate(repository, inventoryFile)
        val task =
            createVerifyTask(
                temporaryDirectory.resolve("missing"),
                inventoryFile,
                temporaryDirectory.resolve("verified.txt"),
            )

        val exception = assertThrows(IllegalStateException::class.java) { task.verify() }

        assertTrue(exception.message.orEmpty().contains("non-empty repository directory"))
    }

    @Test
    fun reusesConfigurationCacheWhenAppliedAsConventionPlugin() {
        val repository = temporaryDirectory.resolve("repository")
        writeFullRepository(repository)
        writeTestKitBuild(repository)

        run("verifyStagedArtifactInventory", "--configuration-cache")
        val second = run("verifyStagedArtifactInventory", "--configuration-cache")

        assertTrue(second.output.contains("Reusing configuration cache."))
    }

    /**
     * ADR-0008 fixes the published surface at eight coordinates, but verification only asked, for each of the
     * eight, "is it present?". There was no converse pass, so a ninth staged coordinate — an accidentally
     * published `generator:model` or `generator:openapi`, an internal fixture, anything injected into the
     * staging directory — existed, matched its own checksum, produced zero failures, and was counted in the
     * marker's artifact total as verified.
     *
     * `forbiddenCoordinates` in `VerifyPublicationMetadata` names those two modules, but it is only ever
     * applied to POM and `.module` *dependency* lists, never to the staged inventory itself.
     */
    @Test
    fun rejectsANinthStagedCoordinateOutsideTheAdr0008Set() {
        val repository = temporaryDirectory.resolve("repository")
        writeFullRepository(repository)
        val intruder =
            repository
                .resolve("io/github/nabobery/kotlin-sdkgen-model/$VERSION")
                .also(Path::createDirectories)
        intruder.resolve("kotlin-sdkgen-model-$VERSION.jar").writeBytes("kotlin-sdkgen-model-bytes".toByteArray())
        val inventoryFile = temporaryDirectory.resolve("inventory.json")
        generate(repository, inventoryFile)
        val task = createVerifyTask(repository, inventoryFile, temporaryDirectory.resolve("verified.txt"))

        val exception = assertThrows(IllegalStateException::class.java) { task.verify() }

        assertTrue(
            exception.message.orEmpty().contains("kotlin-sdkgen-model"),
            exception.message.orEmpty(),
        )
        assertTrue(exception.message.orEmpty().contains("outside the ADR-0008"), exception.message.orEmpty())
    }

    /**
     * A per-target variant is legitimate, but only for a target the build actually publishes. A suffix that is
     * not a recognized target means the artifactId was not understood, and an unrecognized artifactId must not
     * be admitted as though it were a plain root publication.
     */
    @Test
    fun rejectsAVariantSuffixThatIsNotARecognizedTarget() {
        val repository = temporaryDirectory.resolve("repository")
        writeFullRepository(repository)
        val bogus =
            repository
                .resolve("io/github/nabobery/kotlin-sdkgen-runtime-solaris/$VERSION")
                .also(Path::createDirectories)
        bogus.resolve("kotlin-sdkgen-runtime-solaris-$VERSION.jar").writeBytes("bogus".toByteArray())
        val inventoryFile = temporaryDirectory.resolve("inventory.json")
        generate(repository, inventoryFile)
        val task = createVerifyTask(repository, inventoryFile, temporaryDirectory.resolve("verified.txt"))

        val exception = assertThrows(IllegalStateException::class.java) { task.verify() }

        assertTrue(exception.message.orEmpty().contains("solaris"), exception.message.orEmpty())
    }

    /** Real staging publishes per-target variants and the Gradle plugin marker; none may be rejected. */
    @Test
    fun acceptsPerTargetVariantsAndTheGradlePluginMarker() {
        val repository = temporaryDirectory.resolve("repository")
        writeFullRepository(repository)
        listOf(
            "jvm",
            "iosarm64",
            "iosx64",
            "js",
            "linuxx64",
            "android",
            "mingwx64",
            "macosarm64",
            "macosx64",
        ).forEach { target ->
            val artifactId = "kotlin-sdkgen-runtime-$target"
            repository
                .resolve("io/github/nabobery/$artifactId/$VERSION")
                .also(Path::createDirectories)
                .resolve("$artifactId-$VERSION.klib")
                .writeBytes("$artifactId-bytes".toByteArray())
        }
        val markerId = "io.github.nabobery.kotlin-sdkgen.gradle.plugin"
        repository
            .resolve("io/github/nabobery/kotlin-sdkgen/$markerId/$VERSION")
            .also(Path::createDirectories)
            .resolve("$markerId-$VERSION.pom")
            .writeBytes("<project/>".toByteArray())
        val inventoryFile = temporaryDirectory.resolve("inventory.json")
        generate(repository, inventoryFile)
        val marker = temporaryDirectory.resolve("verified.txt")
        val task = createVerifyTask(repository, inventoryFile, marker)

        task.verify()

        assertTrue(marker.exists())
    }

    @Test
    fun rejectsArtifactsFromAnotherVersionInAReusedRepository() {
        val repository = temporaryDirectory.resolve("repository")
        writeFullRepository(repository)
        val oldVersion = "1.2.2"
        repository
            .resolve("io/github/nabobery/kotlin-sdkgen-engine/$oldVersion")
            .also(Path::createDirectories)
            .resolve("kotlin-sdkgen-engine-$oldVersion.jar")
            .writeBytes("old".toByteArray())
        val inventoryFile = temporaryDirectory.resolve("inventory.json")
        generate(repository, inventoryFile)
        val task = createVerifyTask(repository, inventoryFile, temporaryDirectory.resolve("verified.txt"))

        val exception = assertThrows(IllegalStateException::class.java) { task.verify() }

        assertTrue(exception.message.orEmpty().contains("unexpected staged version"), exception.message.orEmpty())
    }

    @Test
    fun rejectsInventoryPathsThatEscapeTheRepository() {
        val repository = temporaryDirectory.resolve("repository")
        writeFullRepository(repository)
        val inventoryFile = temporaryDirectory.resolve("inventory.json")
        generate(repository, inventoryFile)
        inventoryFile.writeText(
            inventoryFile
                .toFile()
                .readText()
                .replaceFirst(
                    "io/github/nabobery/kotlin-sdkgen-engine/$VERSION/kotlin-sdkgen-engine-$VERSION.jar",
                    "../outside.jar",
                ),
        )
        val task = createVerifyTask(repository, inventoryFile, temporaryDirectory.resolve("verified.txt"))

        val exception = assertThrows(IllegalStateException::class.java) { task.verify() }

        assertTrue(exception.message.orEmpty().contains("escapes the repository"), exception.message.orEmpty())
    }

    private fun generate(
        repository: Path,
        inventoryFile: Path,
    ) {
        val project = ProjectBuilder.builder().withProjectDir(temporaryDirectory.toFile()).build()
        project.tasks
            .register("generateStagedArtifactInventory", GenerateStagedArtifactInventory::class.java)
            .get()
            .apply {
                repositoryDirectory.set(repository.toFile())
                this.inventoryFile.set(inventoryFile.toFile())
            }.generate()
    }

    private fun createVerifyTask(
        repository: Path,
        inventoryFile: Path,
        marker: Path,
    ): VerifyStagedArtifactInventory {
        val project = ProjectBuilder.builder().withProjectDir(temporaryDirectory.toFile()).build()
        return project.tasks
            .register("verifyStagedArtifactInventory", VerifyStagedArtifactInventory::class.java)
            .get()
            .apply {
                repositoryDirectory.set(repository.toFile())
                this.inventoryFile.set(inventoryFile.toFile())
                expectedVersion.set(VERSION)
                requireReleaseArtifacts.set(false)
                verificationMarker.set(marker.toFile())
            }
    }

    private fun writeTestKitBuild(repository: Path) {
        temporaryDirectory
            .resolve("settings.gradle.kts")
            .writeText("rootProject.name = \"staged-artifact-inventory-test\"\n")
        temporaryDirectory.resolve("build.gradle.kts").writeText(
            """
            plugins {
                id("sdkgen.stage-publication-inventory")
            }
            """.trimIndent(),
        )
        temporaryDirectory.resolve("gradle.properties").writeText(
            """
            publicationRepository=${repository.toAbsolutePath()}
            sdkgenVersion=$VERSION
            """.trimIndent(),
        )
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

    private fun writeFullRepository(
        repository: Path,
        omitArtifactId: String? = null,
    ) {
        rootArtifacts.forEach { artifactId ->
            if (artifactId == omitArtifactId) return@forEach
            val directory = repository.resolve("io/github/nabobery/$artifactId/$VERSION").also(Path::createDirectories)
            directory.resolve("$artifactId-$VERSION.jar").writeBytes("$artifactId-bytes".toByteArray())
        }
    }

    private fun writeReleaseSidecars(repository: Path) {
        repository.toFile().walkTopDown().filter { file -> file.isFile }.toList().forEach { file ->
            if (file.extension != "asc") {
                file.resolveSibling("${file.name}.asc").writeBytes("signature".toByteArray())
            }
        }
        rootArtifacts.forEach { artifactId ->
            val directory = repository.resolve("io/github/nabobery/$artifactId/$VERSION")
            directory.resolve("$artifactId-$VERSION.pom").writeBytes("<project/>".toByteArray())
            directory.resolve("$artifactId-$VERSION-javadoc.jar").writeBytes("docs".toByteArray())
            directory.resolve("$artifactId-$VERSION.pom.asc").writeBytes("signature".toByteArray())
            directory.resolve("$artifactId-$VERSION-javadoc.jar.asc").writeBytes("signature".toByteArray())
        }
        val targetArtifactId = "kotlin-sdkgen-runtime-jvm"
        val targetDirectory = repository.resolve("io/github/nabobery/$targetArtifactId/$VERSION")
        targetDirectory.resolve("$targetArtifactId-$VERSION.pom").writeBytes("<project/>".toByteArray())
        targetDirectory.resolve("$targetArtifactId-$VERSION-javadoc.jar").writeBytes("docs".toByteArray())
        targetDirectory.resolve("$targetArtifactId-$VERSION.pom.asc").writeBytes("signature".toByteArray())
        targetDirectory.resolve("$targetArtifactId-$VERSION-javadoc.jar.asc").writeBytes("signature".toByteArray())
    }

    private companion object {
        const val VERSION: String = "1.2.3"

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

        const val EMPTY_INVENTORY_JSON = """
            {
              "schemaVersion": "sdkgen-staged-artifact-inventory-v1",
              "artifacts": []
            }
        """
    }
}
