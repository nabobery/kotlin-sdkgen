package com.nabobery.sdkgen.buildlogic.publication

import com.nabobery.sdkgen.buildlogic.publication.inventory.SdkgenProductStagedArtifactInventoryJson
import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.io.TempDir
import java.nio.file.Path
import java.security.MessageDigest
import kotlin.io.path.createDirectories
import kotlin.io.path.readText
import kotlin.io.path.writeBytes

internal class GenerateStagedArtifactInventoryTest {
    @TempDir
    lateinit var temporaryDirectory: Path

    @Test
    fun writesDeterministicInventorySortedByCoordinateThenClassifier() {
        val repository = temporaryDirectory.resolve("repository")
        val jvmBytes = "jvm-jar-bytes".toByteArray()
        val klibBytes = "klib-bytes".toByteArray()
        val sourcesBytes = "sources-jar-bytes".toByteArray()

        // Root (KMP metadata) publication: no classifier, jar extension only exists for the target
        // variant `kotlin-sdkgen-runtime-jvm`, per real Kotlin/Multiplatform Maven publication layout.
        writeArtifact(
            repository,
            "com/nabobery/kotlin-sdkgen-runtime-jvm/1.2.3",
            "kotlin-sdkgen-runtime-jvm-1.2.3.jar",
            jvmBytes,
        )
        writeArtifact(
            repository,
            "com/nabobery/kotlin-sdkgen-runtime-jvm/1.2.3",
            "kotlin-sdkgen-runtime-jvm-1.2.3-sources.jar",
            sourcesBytes,
        )
        writeArtifact(
            repository,
            "com/nabobery/kotlin-sdkgen-runtime-iosarm64/1.2.3",
            "kotlin-sdkgen-runtime-iosarm64-1.2.3.klib",
            klibBytes,
        )
        // Repository housekeeping files must never become inventory entries.
        writeArtifact(
            repository,
            "com/nabobery/kotlin-sdkgen-runtime-jvm/1.2.3",
            "maven-metadata.xml",
            "ignored".toByteArray(),
        )
        writeArtifact(
            repository,
            "com/nabobery/kotlin-sdkgen-runtime-jvm/1.2.3",
            "kotlin-sdkgen-runtime-jvm-1.2.3.jar.sha256",
            "ignored".toByteArray(),
        )

        val task = createTask(repository, temporaryDirectory.resolve("inventory.json"))

        task.generate()

        val written = temporaryDirectory.resolve("inventory.json").readText()
        val inventory = SdkgenProductStagedArtifactInventoryJson.decode(written)

        assertEquals(3, inventory.artifacts.size)
        assertEquals(2, inventory.jvmJars().size)
        assertEquals(1, inventory.klibs().size)
        assertEquals(3, inventory.byRootArtifactId("kotlin-sdkgen-runtime").size)

        val jvmJar = inventory.jvmJars().single { it.classifier == null }
        assertEquals("com.nabobery", jvmJar.coordinate.group)
        assertEquals("kotlin-sdkgen-runtime-jvm", jvmJar.coordinate.artifactId)
        assertEquals("1.2.3", jvmJar.coordinate.version)
        assertNull(jvmJar.classifier)
        assertEquals(
            "com/nabobery/kotlin-sdkgen-runtime-jvm/1.2.3/kotlin-sdkgen-runtime-jvm-1.2.3.jar",
            jvmJar.relativePath,
        )
        assertEquals(sha256Hex(jvmBytes), jvmJar.sha256)

        val sourcesJar = inventory.byExtension("jar").single { it.classifier == "sources" }
        assertEquals(sha256Hex(sourcesBytes), sourcesJar.sha256)

        // Deterministic ordering: coordinate, then classifier. The unclassified jar sorts before its
        // "sources" classifier, and the "iosarm64" artifact id sorts before "jvm" alphabetically.
        val artifactIdOrder = inventory.artifacts.map { it.coordinate.artifactId to it.classifier }
        assertEquals(
            listOf(
                "kotlin-sdkgen-runtime-iosarm64" to null,
                "kotlin-sdkgen-runtime-jvm" to null,
                "kotlin-sdkgen-runtime-jvm" to "sources",
            ),
            artifactIdOrder,
        )

        // Re-encoding a decoded inventory reproduces byte-identical JSON: no timestamps, no host paths.
        assertEquals(written, SdkgenProductStagedArtifactInventoryJson.encode(inventory))
        assertTrue(!written.contains(temporaryDirectory.toAbsolutePath().toString()))
    }

    @Test
    fun parsesSnapshotTimestampedFileNamesWithoutLeakingTheTimestampIntoVersion() {
        val repository = temporaryDirectory.resolve("repository")
        val bytes = "engine-bytes".toByteArray()
        writeArtifact(
            repository,
            "com/nabobery/kotlin-sdkgen-engine/0.1.0-SNAPSHOT",
            "kotlin-sdkgen-engine-0.1.0-20260727.235959-1.jar",
            bytes,
        )
        writeArtifact(
            repository,
            "com/nabobery/kotlin-sdkgen-engine/0.1.0-SNAPSHOT",
            "kotlin-sdkgen-engine-0.1.0-20260727.235959-1-sources.jar",
            bytes,
        )

        val task = createTask(repository, temporaryDirectory.resolve("inventory.json"))
        task.generate()

        val written = temporaryDirectory.resolve("inventory.json").readText()
        val inventory = SdkgenProductStagedArtifactInventoryJson.decode(written)
        val mainJar = inventory.jvmJars().single { it.classifier == null }
        assertEquals("0.1.0-SNAPSHOT", mainJar.coordinate.version)
        val sourcesJar = inventory.jvmJars().single { it.classifier == "sources" }
        assertEquals("sources", sourcesJar.classifier)
        assertEquals("0.1.0-SNAPSHOT", sourcesJar.coordinate.version)
    }

    @Test
    fun derivesTargetForKnownRootAndTargetKlib() {
        val repository = temporaryDirectory.resolve("repository")
        writeArtifact(
            repository,
            "com/nabobery/kotlin-sdkgen-transport-ktor-iosarm64/1.2.3",
            "kotlin-sdkgen-transport-ktor-iosarm64-1.2.3.klib",
            "klib-bytes".toByteArray(),
        )
        val task = createTask(repository, temporaryDirectory.resolve("inventory.json"))
        task.generate()

        val inventory =
            SdkgenProductStagedArtifactInventoryJson.decode(temporaryDirectory.resolve("inventory.json").readText())
        assertEquals("iosarm64", inventory.klibs().single().target)
    }

    @Test
    fun resolvesTargetToNullForTheJvmOnlyTransportJavaHttpTrapCase() {
        // Regression for the naive "split on the last dash" trap: "transport-java-http" superficially looks
        // like root "transport-java" + target "http", but kotlin-sdkgen-transport-java-http is itself a
        // whole, JVM-only ADR-0008 root artifact id with no Kotlin/Multiplatform target at all.
        val repository = temporaryDirectory.resolve("repository")
        writeArtifact(
            repository,
            "com/nabobery/kotlin-sdkgen-transport-java-http/1.2.3",
            "kotlin-sdkgen-transport-java-http-1.2.3.jar",
            "jar-bytes".toByteArray(),
        )
        val task = createTask(repository, temporaryDirectory.resolve("inventory.json"))
        task.generate()

        val inventory =
            SdkgenProductStagedArtifactInventoryJson.decode(temporaryDirectory.resolve("inventory.json").readText())
        assertNull(inventory.jvmJars().single().target)
    }

    @Test
    fun resolvesTargetToNullForARootAggregatePublication() {
        // "kotlin-sdkgen-transport-okhttp" with no suffix is the root artifact id itself (e.g. the
        // gradle-plugin coordinate below), never a guessed target.
        val repository = temporaryDirectory.resolve("repository")
        writeArtifact(
            repository,
            "com/nabobery/kotlin-sdkgen-gradle-plugin/1.2.3",
            "kotlin-sdkgen-gradle-plugin-1.2.3.jar",
            "jar-bytes".toByteArray(),
        )
        val task = createTask(repository, temporaryDirectory.resolve("inventory.json"))
        task.generate()

        val inventory =
            SdkgenProductStagedArtifactInventoryJson.decode(temporaryDirectory.resolve("inventory.json").readText())
        assertNull(inventory.jvmJars().single().target)
    }

    @Test
    fun resolvesJsTargetForATestingKlib() {
        // .klib is not native-only: kotlin-sdkgen-testing-js produces a .klib too, and "js" must resolve
        // as a valid target rather than being restricted to Kotlin/Native target names.
        val repository = temporaryDirectory.resolve("repository")
        writeArtifact(
            repository,
            "com/nabobery/kotlin-sdkgen-testing-js/1.2.3",
            "kotlin-sdkgen-testing-js-1.2.3.klib",
            "klib-bytes".toByteArray(),
        )
        val task = createTask(repository, temporaryDirectory.resolve("inventory.json"))
        task.generate()

        val inventory =
            SdkgenProductStagedArtifactInventoryJson.decode(temporaryDirectory.resolve("inventory.json").readText())
        assertEquals("js", inventory.klibs().single().target)
    }

    @Test
    fun resolvesTargetToNullForAnArtifactIdMatchingNoKnownRoot() {
        val repository = temporaryDirectory.resolve("repository")
        writeArtifact(
            repository,
            "com/nabobery/totally-unrelated-artifact/1.2.3",
            "totally-unrelated-artifact-1.2.3.klib",
            "klib-bytes".toByteArray(),
        )
        val task = createTask(repository, temporaryDirectory.resolve("inventory.json"))
        task.generate()

        val inventory =
            SdkgenProductStagedArtifactInventoryJson.decode(temporaryDirectory.resolve("inventory.json").readText())
        assertNull(inventory.klibs().single().target)
    }

    @Test
    fun rejectsEmptyRepositoryDirectory() {
        val repository = temporaryDirectory.resolve("repository").also(Path::createDirectories)
        val task = createTask(repository, temporaryDirectory.resolve("inventory.json"))

        val exception = assertThrows(IllegalStateException::class.java) { task.generate() }

        assertTrue(exception.message.orEmpty().contains("non-empty repository directory"))
    }

    @Test
    fun rejectsMissingRepositoryDirectory() {
        val task = createTask(temporaryDirectory.resolve("missing"), temporaryDirectory.resolve("inventory.json"))

        val exception = assertThrows(IllegalStateException::class.java) { task.generate() }

        assertTrue(exception.message.orEmpty().contains("non-empty repository directory"))
    }

    @Test
    fun rejectsRepositoryWithOnlyHousekeepingFiles() {
        val repository = temporaryDirectory.resolve("repository")
        writeArtifact(
            repository,
            "com/nabobery/kotlin-sdkgen-engine/1.2.3",
            "maven-metadata.xml",
            "ignored".toByteArray(),
        )
        val task = createTask(repository, temporaryDirectory.resolve("inventory.json"))

        val exception = assertThrows(IllegalStateException::class.java) { task.generate() }

        assertTrue(exception.message.orEmpty().contains("must not be empty"))
    }

    private fun createTask(
        repository: Path,
        inventoryFile: Path,
    ): GenerateStagedArtifactInventory {
        val project = ProjectBuilder.builder().withProjectDir(temporaryDirectory.toFile()).build()
        return project.tasks
            .register("generateStagedArtifactInventory", GenerateStagedArtifactInventory::class.java)
            .get()
            .apply {
                repositoryDirectory.set(repository.toFile())
                this.inventoryFile.set(inventoryFile.toFile())
            }
    }

    private fun writeArtifact(
        repository: Path,
        relativeDirectory: String,
        fileName: String,
        bytes: ByteArray,
    ) {
        val directory = repository.resolve(relativeDirectory).also(Path::createDirectories)
        directory.resolve(fileName).writeBytes(bytes)
    }

    private fun sha256Hex(bytes: ByteArray): String =
        MessageDigest.getInstance("SHA-256").digest(bytes).joinToString(separator = "") { "%02x".format(it) }
}
