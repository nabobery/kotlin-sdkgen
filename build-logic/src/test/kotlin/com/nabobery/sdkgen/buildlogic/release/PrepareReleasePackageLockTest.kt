package com.nabobery.sdkgen.buildlogic.release

import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.io.TempDir
import java.nio.file.Path
import kotlin.io.path.readText
import kotlin.io.path.writeText

internal class PrepareReleasePackageLockTest {
    @TempDir
    lateinit var temporaryDirectory: Path

    @Test
    fun rewritesOnlyRootAndInternalWorkspaceVersions() {
        val source = temporaryDirectory.resolve("development-package-lock.json")
        val target = temporaryDirectory.resolve("release-package-lock.json")
        source.writeText(packageLock())
        val task = createTask(source, target, "1.2.3-rc.1+build.7")

        task.prepare()

        assertEquals(
            packageLock(rootVersion = "1.2.3-rc.1+build.7", workspaceVersion = "1.2.3-rc.1+build.7"),
            target.readText(),
        )
        assertEquals(packageLock(), source.readText())
    }

    @Test
    fun rejectsAnUnexpectedDevelopmentVersionEntry() {
        val source = temporaryDirectory.resolve("development-package-lock.json")
        val target = temporaryDirectory.resolve("release-package-lock.json")
        source.writeText(
            packageLock().replace(
                "\"version\": \"9.9.9\"",
                "\"version\": \"0.1.0-SNAPSHOT\"",
            ),
        )
        val task = createTask(source, target, "1.2.3")

        val exception = assertThrows(IllegalArgumentException::class.java) { task.prepare() }

        assertTrue(exception.message.orEmpty().contains("Refusing to rewrite unexpected package metadata"))
        assertTrue(!target.toFile().exists())
    }

    @Test
    fun rejectsANonReleaseVersion() {
        val source = temporaryDirectory.resolve("development-package-lock.json")
        source.writeText(packageLock())
        listOf("01.2.3", "1.2.3-01", "1.2.3-rc.", "1.2.3-SNAPSHOT").forEachIndexed { index, version ->
            val target = temporaryDirectory.resolve("release-package-lock-$index.json")
            val task = createTask(source, target, version, "prepareReleasePackageLock$index")

            val exception = assertThrows(IllegalArgumentException::class.java) { task.prepare() }

            assertTrue(exception.message.orEmpty().contains("Release package-lock version"))
            assertTrue(!target.toFile().exists())
        }
    }

    private fun createTask(
        source: Path,
        target: Path,
        version: String,
        taskName: String = "prepareReleasePackageLock",
    ): PrepareReleasePackageLock {
        val project = ProjectBuilder.builder().withProjectDir(temporaryDirectory.toFile()).build()
        return project.tasks
            .register(taskName, PrepareReleasePackageLock::class.java)
            .get()
            .apply {
                developmentLockFile.set(source.toFile())
                releaseVersion.set(version)
                releaseLockFile.set(target.toFile())
            }
    }

    private fun packageLock(
        rootVersion: String = "0.1.0-SNAPSHOT",
        workspaceVersion: String = "0.1.0-SNAPSHOT",
    ): String =
        """
        {
          "name": "kotlin-sdkgen",
          "version": "$rootVersion",
          "lockfileVersion": 3,
          "packages": {
            "": {
              "version": "$rootVersion",
              "workspaces": [
                "packages/runtime-core",
                "packages_imported/ktor-core/9.9.9"
              ]
            },
            "node_modules/example": {
              "version": "9.9.9"
            },
            "packages/runtime-core": {
              "version": "$workspaceVersion"
            },
            "packages_imported/ktor-core/9.9.9": {}
          }
        }
        """.trimIndent() + "\n"
}
