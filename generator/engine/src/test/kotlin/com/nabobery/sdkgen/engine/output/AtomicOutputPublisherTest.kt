package com.nabobery.sdkgen.engine.output

import com.nabobery.sdkgen.engine.declarations.GenerationDiagnostic
import com.nabobery.sdkgen.engine.declarations.GenerationDiagnosticCode
import com.nabobery.sdkgen.engine.declarations.KotlinDeclarationModel
import com.nabobery.sdkgen.engine.declarations.KotlinFileDeclaration
import com.nabobery.sdkgen.engine.declarations.SupportDeclaration
import com.nabobery.sdkgen.engine.declarations.SupportKind
import com.nabobery.sdkgen.engine.emit.RenderedKotlinFile
import com.nabobery.sdkgen.model.SourceLocation
import com.nabobery.sdkgen.model.SourcePointer
import java.nio.file.AtomicMoveNotSupportedException
import java.nio.file.DirectoryNotEmptyException
import java.nio.file.FileAlreadyExistsException
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardCopyOption.ATOMIC_MOVE
import java.nio.file.StandardCopyOption.REPLACE_EXISTING
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicInteger
import java.util.concurrent.atomic.AtomicReference
import kotlin.io.path.createDirectories
import kotlin.io.path.createSymbolicLinkPointingTo
import kotlin.io.path.exists
import kotlin.io.path.isSymbolicLink
import kotlin.io.path.listDirectoryEntries
import kotlin.io.path.readBytes
import kotlin.io.path.readSymbolicLink
import kotlin.io.path.readText
import kotlin.io.path.writeText
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class AtomicOutputPublisherTest {
    @Test
    fun `publish rejects unsafe rendered paths before writing outside staging`() {
        val root = Files.createTempDirectory("sdkgen-publisher-path-test-")
        val destination = root.resolve("generated/current")
        val identity =
            GenerationManifestIdentity(
                configDigest = "a".repeat(64),
                source = ManifestInput("sdkgen://source", "b".repeat(64), 1),
                references = emptyList(),
                overlays = emptyList(),
                generatorVersion = "test",
                edition = "community",
                kotlinPoetVersion = "test",
                targets = emptyList(),
                compatibilityProfiles = emptyList(),
                plugins = emptyList(),
                warningsAsErrors = false,
                warningAllowlist = emptyList(),
            )

        assertFailsWith<IllegalArgumentException> {
            AtomicOutputPublisher().publish(
                destination = destination,
                declarationModel = KotlinDeclarationModel(emptyList()),
                files = listOf(RenderedKotlinFile("../escape.kt", "package test".encodeToByteArray())),
                identity = identity,
                diagnostics = emptyList(),
                exclusions = emptyList(),
            )
        }

        assertFalse(root.resolve("escape.kt").exists())
    }

    @Test
    fun `manifest uses the diagnostic wire code override`() {
        val root = Files.createTempDirectory("sdkgen-publisher-manifest-test-")
        val model =
            KotlinDeclarationModel(
                listOf(
                    KotlinFileDeclaration(
                        packageName = "test",
                        fileName = "Generated",
                        declarations =
                            listOf(
                                SupportDeclaration(
                                    symbolId = "support:test",
                                    order = 0,
                                    packageName = "test",
                                    fileName = "Generated",
                                    resolvedName = "Generated",
                                    kdoc = "",
                                    kind = SupportKind.FieldPresence,
                                ),
                            ),
                    ),
                ),
            )
        val diagnostic =
            GenerationDiagnostic(
                code = GenerationDiagnosticCode.SEMANTIC,
                message = "semantic warning",
                source = SourcePointer("sdkgen://source/openapi.yaml", "", SourceLocation(1, 1, 0)),
                symbolId = "semantic:test",
                sourceCode = "SDKGEN-SEMANTIC-WARNING",
            )
        val identity =
            GenerationManifestIdentity(
                configDigest = "a".repeat(64),
                source = ManifestInput("sdkgen://source/openapi.yaml", "b".repeat(64), 1),
                references = emptyList(),
                overlays = emptyList(),
                generatorVersion = "test",
                edition = "community",
                kotlinPoetVersion = "test",
                targets = emptyList(),
                compatibilityProfiles = emptyList(),
                plugins = emptyList(),
                warningsAsErrors = false,
                warningAllowlist = emptyList(),
            )

        val publication =
            AtomicOutputPublisher().publish(
                destination = root.resolve("current"),
                declarationModel = model,
                files = listOf(RenderedKotlinFile("test/Generated.kt", "package test\n".encodeToByteArray())),
                identity = identity,
                diagnostics = listOf(diagnostic),
                exclusions = emptyList(),
            )
        val manifest = publication.snapshot.resolve("manifest.json").readText()

        assertTrue(manifest.contains("\"code\": \"SDKGEN-SEMANTIC-WARNING\""))
        assertFalse(manifest.contains("SDKGEN-SEMANTIC-DIAGNOSTIC"))
    }

    @Test
    fun `lock failure restores replacement output and prior lock`() {
        val fixture = fixture(existingOutput = true, existingLock = true)

        assertFailsWith<IllegalStateException> {
            AtomicOutputPublisher().commit(
                fixture.prepared,
                LockPublication(fixture.lock, "new-lock\n".encodeToByteArray()),
                beforeLockCommit = { error("injected lock failure") },
            )
        }

        assertEquals(Path.of(".snapshots", "old"), fixture.destination.readSymbolicLink())
        assertEquals("old-lock\n", fixture.lock.readText())
        assertTrue(fixture.temporaryLockFiles().isEmpty())
    }

    @Test
    fun `lock failure restores absent first publication state`() {
        val fixture = fixture(existingOutput = false, existingLock = false)

        assertFailsWith<IllegalStateException> {
            AtomicOutputPublisher().commit(
                fixture.prepared,
                LockPublication(fixture.lock, "new-lock\n".encodeToByteArray()),
                beforeLockCommit = { error("injected lock failure") },
            )
        }

        assertFalse(fixture.destination.exists())
        assertFalse(fixture.lock.exists())
        assertTrue(fixture.temporaryLockFiles().isEmpty())
    }

    @Test
    fun `lock staging uses unique files in the destination directory`() {
        val fixture = fixture(existingOutput = false, existingLock = false)
        val staged = mutableListOf<Path>()

        repeat(2) {
            assertFailsWith<IllegalStateException> {
                AtomicOutputPublisher().commit(
                    fixture.prepared,
                    LockPublication(fixture.lock, "new-lock\n".encodeToByteArray()),
                    beforeLockCommit = { path ->
                        staged.add(path)
                        error("injected lock failure")
                    },
                )
            }
        }

        assertEquals(fixture.lock.parent, staged[0].parent)
        assertEquals(fixture.lock.parent, staged[1].parent)
        assertNotEquals(staged[0], staged[1])
        assertTrue(staged.none(Path::exists))
    }

    @Test
    fun `concurrent lock failure cannot restore a newer successful publication`() {
        val fixture = fixture(existingOutput = true, existingLock = true)
        val secondPrepared = prepared(fixture, "second")
        val firstEnteredLockWrite = CountDownLatch(1)
        val releaseFirstLockFailure = CountDownLatch(1)
        val secondEnteredLockWrite = CountDownLatch(1)
        val firstFailure = AtomicReference<Throwable?>()
        val secondFailure = AtomicReference<Throwable?>()
        val publisher = AtomicOutputPublisher()

        val first =
            Thread {
                try {
                    publisher.commit(
                        fixture.prepared,
                        LockPublication(fixture.lock, "first-lock\n".encodeToByteArray()),
                        beforeLockCommit = {
                            firstEnteredLockWrite.countDown()
                            check(releaseFirstLockFailure.await(5, TimeUnit.SECONDS))
                            error("injected first lock failure")
                        },
                    )
                } catch (failure: Throwable) {
                    firstFailure.set(failure)
                }
            }
        val second =
            Thread {
                try {
                    publisher.commit(
                        secondPrepared,
                        LockPublication(fixture.lock, "second-lock\n".encodeToByteArray()),
                        beforeLockCommit = { secondEnteredLockWrite.countDown() },
                    )
                } catch (failure: Throwable) {
                    secondFailure.set(failure)
                }
            }

        first.start()
        assertTrue(firstEnteredLockWrite.await(5, TimeUnit.SECONDS))
        second.start()
        assertFalse(secondEnteredLockWrite.await(200, TimeUnit.MILLISECONDS))
        releaseFirstLockFailure.countDown()
        first.join(5_000)
        second.join(5_000)

        assertTrue(firstFailure.get() is IllegalStateException)
        assertEquals(null, secondFailure.get())
        assertEquals(Path.of(".snapshots", "second"), fixture.destination.readSymbolicLink())
        assertEquals("second-lock\n", fixture.lock.readText())
    }

    @Test
    fun `same destination commits wait for the active publication lock`() {
        val fixture = fixture(existingOutput = false, existingLock = false)
        val secondPrepared = prepared(fixture, "second")
        val firstEnteredLockWrite = CountDownLatch(1)
        val releaseFirstLockWrite = CountDownLatch(1)
        val secondEnteredLockWrite = CountDownLatch(1)
        val publisher = AtomicOutputPublisher()

        val first =
            Thread {
                publisher.commit(
                    fixture.prepared,
                    LockPublication(fixture.lock, "first-lock\n".encodeToByteArray()),
                    beforeLockCommit = {
                        firstEnteredLockWrite.countDown()
                        check(releaseFirstLockWrite.await(5, TimeUnit.SECONDS))
                    },
                )
            }
        val second =
            Thread {
                publisher.commit(
                    secondPrepared,
                    LockPublication(fixture.lock, "second-lock\n".encodeToByteArray()),
                    beforeLockCommit = { secondEnteredLockWrite.countDown() },
                )
            }

        first.start()
        assertTrue(firstEnteredLockWrite.await(5, TimeUnit.SECONDS))
        second.start()
        assertFalse(secondEnteredLockWrite.await(200, TimeUnit.MILLISECONDS))
        releaseFirstLockWrite.countDown()
        first.join(5_000)
        second.join(5_000)

        assertEquals(Path.of(".snapshots", "second"), fixture.destination.readSymbolicLink())
        assertEquals("second-lock\n", fixture.lock.readText())
    }

    @Test
    fun `commits sharing a lock destination wait across output parents`() {
        val firstFixture = fixture(existingOutput = false, existingLock = false)
        val secondRoot = Files.createTempDirectory("sdkgen-publication-test-")
        val secondDestination = secondRoot.resolve("current")
        val secondPrepared = prepared(secondDestination, "second")
        val firstEnteredLockWrite = CountDownLatch(1)
        val releaseFirstLockWrite = CountDownLatch(1)
        val secondEnteredLockWrite = CountDownLatch(1)
        val firstFailure = AtomicReference<Throwable?>()
        val secondFailure = AtomicReference<Throwable?>()
        val publisher = AtomicOutputPublisher()

        val first =
            Thread {
                try {
                    publisher.commit(
                        firstFixture.prepared,
                        LockPublication(firstFixture.lock, "first-lock\n".encodeToByteArray()),
                        beforeLockCommit = {
                            firstEnteredLockWrite.countDown()
                            check(releaseFirstLockWrite.await(5, TimeUnit.SECONDS))
                        },
                    )
                } catch (failure: Throwable) {
                    firstFailure.set(failure)
                }
            }
        val second =
            Thread {
                try {
                    publisher.commit(
                        secondPrepared,
                        LockPublication(firstFixture.lock, "second-lock\n".encodeToByteArray()),
                        beforeLockCommit = { secondEnteredLockWrite.countDown() },
                    )
                } catch (failure: Throwable) {
                    secondFailure.set(failure)
                }
            }

        first.start()
        assertTrue(firstEnteredLockWrite.await(5, TimeUnit.SECONDS))
        second.start()
        try {
            assertFalse(secondEnteredLockWrite.await(200, TimeUnit.MILLISECONDS))
        } finally {
            releaseFirstLockWrite.countDown()
            first.join(5_000)
            second.join(5_000)
        }

        assertEquals(null, firstFailure.get())
        assertEquals(null, secondFailure.get())
        assertEquals(Path.of(".snapshots", "second"), secondDestination.readSymbolicLink())
        assertEquals("second-lock\n", firstFixture.lock.readText())
    }

    @Test
    fun `unsupported atomic move fails without fallback`() {
        val fixture = fixture(existingOutput = false, existingLock = false)
        val publisher =
            AtomicOutputPublisher { source, target, _ ->
                throw AtomicMoveNotSupportedException(source.toString(), target.toString(), "unsupported")
            }

        val failure = assertFailsWith<IllegalStateException> { publisher.commit(fixture.prepared) }

        assertTrue(failure.message!!.contains("Atomic rename is required"))
        assertFalse(fixture.destination.exists())
    }

    @Test
    fun `symlink failure publishes a materialized directory and rolls it back`() {
        val fixture = publishFixture()
        val fallbackPublisher =
            AtomicOutputPublisher(
                symbolicLinkOperation = { _, _ ->
                    throw UnsupportedOperationException("symbolic links unavailable")
                },
            )

        val materialized =
            fallbackPublisher.publish(
                fixture.destination,
                fixture.model,
                fixture.files,
                fixture.identity,
                emptyList(),
                emptyList(),
            )

        assertFalse(fixture.destination.isSymbolicLink())
        assertEquals("package com.example\nclass Api\n", fixture.destination.resolve("com/example/Api.kt").readText())
        val previousBytes = fixture.destination.resolve("com/example/Api.kt").readBytes()
        val next = prepared(fixture.destination, "next")
        assertFailsWith<IllegalStateException> {
            fallbackPublisher.commit(
                next,
                LockPublication(fixture.root.resolve("sdkgen.lock"), "new-lock\n".encodeToByteArray()),
                beforeLockCommit = { error("injected lock failure") },
            )
        }

        assertFalse(fixture.destination.isSymbolicLink())
        assertTrue(previousBytes.contentEquals(fixture.destination.resolve("com/example/Api.kt").readBytes()))
        assertEquals(materialized.digest, fixture.result.digest)
    }

    @Test
    fun `concurrent identical publications reuse the snapshot after FileAlreadyExistsException`() {
        publishConcurrentIdenticalPublications { target -> FileAlreadyExistsException(target.toString()) }
    }

    @Test
    fun `concurrent identical publications reuse the snapshot after DirectoryNotEmptyException`() {
        publishConcurrentIdenticalPublications { target -> DirectoryNotEmptyException(target.toString()) }
    }

    private fun publishConcurrentIdenticalPublications(snapshotMoveFailure: (Path) -> Throwable) {
        val fixture = publishFixture()
        Files.deleteIfExists(fixture.destination)
        deleteRecursively(fixture.result.snapshot)
        val snapshotMoveReady = CountDownLatch(2)
        val firstSnapshotMoveCompleted = CountDownLatch(1)
        val snapshotMoves = AtomicInteger()
        val publisher =
            AtomicOutputPublisher { source, target, replace ->
                if (target.parent?.fileName?.toString() == ".snapshots") {
                    val moveNumber = snapshotMoves.incrementAndGet()
                    snapshotMoveReady.countDown()
                    check(snapshotMoveReady.await(5, TimeUnit.SECONDS))
                    if (moveNumber == 1) {
                        Files.move(source, target, ATOMIC_MOVE)
                        firstSnapshotMoveCompleted.countDown()
                    } else {
                        check(firstSnapshotMoveCompleted.await(5, TimeUnit.SECONDS))
                        throw snapshotMoveFailure(target)
                    }
                } else if (replace) {
                    Files.move(source, target, ATOMIC_MOVE, REPLACE_EXISTING)
                } else {
                    Files.move(source, target, ATOMIC_MOVE)
                }
            }
        val failures = arrayOfNulls<Throwable>(2)
        val results = arrayOfNulls<PublicationResult>(2)
        val threads =
            (0..1).map { index ->
                Thread {
                    try {
                        results[index] =
                            publisher.publish(
                                fixture.destination,
                                fixture.model,
                                fixture.files,
                                fixture.identity,
                                emptyList(),
                                emptyList(),
                            )
                    } catch (failure: Throwable) {
                        failures[index] = failure
                    }
                }
            }

        threads.forEach(Thread::start)
        threads.forEach { thread -> thread.join(5_000) }

        assertTrue(threads.all { thread -> !thread.isAlive })
        assertTrue(failures.all { failure -> failure == null }, failures.contentToString())
        assertEquals(results[0]?.digest, results[1]?.digest)
        assertEquals(results[0]?.snapshot, results[1]?.snapshot)
        assertEquals(Path.of(".snapshots", results[0]!!.digest), fixture.destination.readSymbolicLink())
        assertTrue(results[0]!!.snapshot.resolve("manifest.json").exists())
    }

    @Test
    fun `valid existing digest snapshot is reused only after content verification`() {
        val fixture = publishFixture()

        val second =
            fixture.publisher.publish(
                fixture.destination,
                fixture.model,
                fixture.files,
                fixture.identity,
                emptyList(),
                emptyList(),
            )

        assertEquals(fixture.result.digest, second.digest)
        assertEquals(fixture.result.snapshot, second.snapshot)
    }

    @Test
    fun `digest child symlink is rejected without following its target`() {
        val fixture = publishFixture()
        val external = fixture.root.resolve("external").also(Path::createDirectories)
        external.resolve("sentinel").writeText("untouched")
        Files.deleteIfExists(fixture.destination)
        deleteRecursively(fixture.result.snapshot)
        Files.createSymbolicLink(fixture.result.snapshot, external)

        assertFailsWith<IllegalStateException> {
            fixture.publisher.publish(
                fixture.destination,
                fixture.model,
                fixture.files,
                fixture.identity,
                emptyList(),
                emptyList(),
            )
        }

        assertEquals("untouched", external.resolve("sentinel").readText())
        assertTrue(Files.isSymbolicLink(fixture.result.snapshot))
    }

    @Test
    fun `corrupted existing digest snapshot is not reused`() {
        val fixture = publishFixture()
        Files.deleteIfExists(fixture.destination)
        fixture.result.snapshot
            .resolve("manifest.json")
            .writeText("corrupted")

        assertFailsWith<IllegalStateException> {
            fixture.publisher.publish(
                fixture.destination,
                fixture.model,
                fixture.files,
                fixture.identity,
                emptyList(),
                emptyList(),
            )
        }

        assertEquals(
            "corrupted",
            fixture.result.snapshot
                .resolve("manifest.json")
                .readText(),
        )
        assertFalse(Files.exists(fixture.destination))
    }

    private fun publishFixture(): PublishedFixture {
        val root = Files.createTempDirectory("sdkgen-publication-publish-test-")
        val destination = root.resolve("current")
        val model =
            KotlinDeclarationModel(
                listOf(KotlinFileDeclaration("com.example", "Api", emptyList())),
            )
        val files =
            listOf(
                RenderedKotlinFile(
                    "com/example/Api.kt",
                    "package com.example\nclass Api\n".encodeToByteArray(),
                ),
            )
        val identity =
            GenerationManifestIdentity(
                configDigest = "config",
                source = ManifestInput("sdkgen://source", "source", 6),
                references = emptyList(),
                overlays = emptyList(),
                generatorVersion = "test",
                edition = "community",
                kotlinPoetVersion = "2.3.0",
                targets = listOf("jvm"),
                compatibilityProfiles = emptyList(),
                plugins = emptyList(),
                warningsAsErrors = false,
                warningAllowlist = emptyList(),
            )
        val publisher = AtomicOutputPublisher()
        val result = publisher.publish(destination, model, files, identity, emptyList(), emptyList())
        return PublishedFixture(root, destination, model, files, identity, publisher, result)
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

    private data class PublishedFixture(
        val root: Path,
        val destination: Path,
        val model: KotlinDeclarationModel,
        val files: List<RenderedKotlinFile>,
        val identity: GenerationManifestIdentity,
        val publisher: AtomicOutputPublisher,
        val result: PublicationResult,
    )

    private fun fixture(
        existingOutput: Boolean,
        existingLock: Boolean,
    ): PublicationFixture {
        val root = Files.createTempDirectory("sdkgen-publication-test-")
        val snapshots = root.resolve(".snapshots").also(Path::createDirectories)
        val oldSnapshot = snapshots.resolve("old").also(Path::createDirectories)
        val newSnapshot = snapshots.resolve("new").also(Path::createDirectories)
        oldSnapshot.resolve("marker").writeText("old")
        newSnapshot.resolve("marker").writeText("new")
        val destination = root.resolve("current")
        if (existingOutput) destination.createSymbolicLinkPointingTo(Path.of(".snapshots", "old"))
        val lock = root.resolve("sdkgen.lock")
        if (existingLock) lock.writeText("old-lock\n")
        return PublicationFixture(
            prepared = PreparedPublication("new", newSnapshot, destination, 12),
            destination = destination,
            lock = lock,
        )
    }

    private fun prepared(
        fixture: PublicationFixture,
        digest: String,
    ): PreparedPublication = prepared(fixture.destination, digest)

    private fun prepared(
        destination: Path,
        digest: String,
    ): PreparedPublication {
        val snapshot =
            destination.parent
                .resolve(".snapshots")
                .resolve(digest)
                .also(Path::createDirectories)
        snapshot.resolve("marker").writeText(digest)
        return PreparedPublication(digest, snapshot, destination, 12)
    }

    private data class PublicationFixture(
        val prepared: PreparedPublication,
        val destination: Path,
        val lock: Path,
    ) {
        fun temporaryLockFiles(): List<Path> =
            lock.parent.listDirectoryEntries(".sdkgen-lock-*.tmp").filter { it.exists() || it.isSymbolicLink() }
    }
}
