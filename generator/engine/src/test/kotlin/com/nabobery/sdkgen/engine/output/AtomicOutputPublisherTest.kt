package com.nabobery.sdkgen.engine.output

import java.nio.file.AtomicMoveNotSupportedException
import java.nio.file.Files
import java.nio.file.Path
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicReference
import kotlin.io.path.createDirectories
import kotlin.io.path.createSymbolicLinkPointingTo
import kotlin.io.path.exists
import kotlin.io.path.isSymbolicLink
import kotlin.io.path.listDirectoryEntries
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
