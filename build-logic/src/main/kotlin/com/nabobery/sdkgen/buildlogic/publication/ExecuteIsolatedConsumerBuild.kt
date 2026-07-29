package com.nabobery.sdkgen.buildlogic.publication

import org.gradle.api.DefaultTask
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputDirectory
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.Internal
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction
import org.gradle.process.ExecOperations
import org.gradle.work.DisableCachingByDefault
import java.io.File
import java.io.FileOutputStream
import java.io.RandomAccessFile
import javax.inject.Inject

/**
 * Builds the isolated publication consumer fixtures against the staged repository, and only the staged
 * repository, so that resolution and compilation are actually exercised.
 *
 * **Why this exists.** [PublicationMetadataTopology.verifyConsumerFixtures] reads the consumer Gradle files
 * as *text*: it asserts required substrings are present, counts `maven {` blocks with a regex, and checks
 * `"com.nabobery:$artifact:" in buildText`. No consumer is ever built. Every one of those assertions is
 * satisfied by a fixture whose declared dependency does not exist, whose Gradle Module Metadata does not
 * resolve, whose KMP root coordinate selects no variant for the requested target, or whose public types are
 * not visible — which is precisely the set of questions a consumer fixture exists to answer. The textual
 * checks remain useful as a fast preflight against fixture drift; they are not the verification.
 *
 * **Isolation.** The consumer build runs under its own Gradle user home ([isolatedGradleUserHome], under
 * `build/`), never the developer's `~/.gradle`. Without that, a `com.nabobery` module already in the shared
 * module cache from an earlier local run would satisfy resolution and mask a staging defect entirely. The
 * home is reused between runs so third-party dependencies resolved from Maven Central download once. The nested
 * build uses `--refresh-dependencies`, which forces the fixed-version first-party modules to be checked against
 * the current staged repository instead of trusting an earlier rehearsal's cached resolution.
 *
 * The fixtures' own `settings.gradle.kts` already declares `RepositoriesMode.FAIL_ON_PROJECT_REPOS` and an
 * `exclusiveContent` filter pinning `com.nabobery` to the isolated repository, so a first-party artifact can
 * only ever come from the staged directory this task points at.
 *
 * The nested build is launched through the Gradle wrapper rather than an in-process runner, because that is
 * what an external consumer actually does and it keeps the consumer build's classpath, daemon, and
 * configuration entirely separate from this one.
 */
@DisableCachingByDefault(because = "Runs a nested Gradle build whose inputs include a staged repository.")
public abstract class ExecuteIsolatedConsumerBuild
    @Inject
    constructor(
        private val execOperations: ExecOperations,
    ) : DefaultTask() {
        @get:InputDirectory
        @get:PathSensitive(PathSensitivity.RELATIVE)
        public abstract val repositoryDirectory: DirectoryProperty

        @get:InputDirectory
        @get:PathSensitive(PathSensitivity.RELATIVE)
        public abstract val consumerFixturesDirectory: DirectoryProperty

        @get:InputFile
        @get:PathSensitive(PathSensitivity.RELATIVE)
        public abstract val gradleWrapperScript: RegularFileProperty

        @get:Input
        public abstract val sdkgenVersion: Property<String>

        /** Deliberately not an input: it is a cache location, and its contents must not affect up-to-dateness. */
        @get:Internal
        public abstract val isolatedGradleUserHome: DirectoryProperty

        @get:OutputFile
        public abstract val verificationMarker: RegularFileProperty

        @TaskAction
        public fun execute() {
            val repository = repositoryDirectory.get().asFile
            check(repository.isDirectory && repository.listFiles().orEmpty().isNotEmpty()) {
                "Isolated consumer build requires a non-empty staged repository at $repository."
            }

            val gradleUserHome = isolatedGradleUserHome.get().asFile.apply { mkdirs() }
            val consumers = consumerFixturesDirectory.get().asFile
            val output = temporaryDir.resolve("isolated-consumer-build.log")

            val result =
                FileOutputStream(output).use { log ->
                    execOperations.exec {
                        executable = gradleWrapperScript.get().asFile.absolutePath
                        workingDir = consumers
                        args(
                            "--project-dir",
                            consumers.absolutePath,
                            "--gradle-user-home",
                            gradleUserHome.absolutePath,
                            "-PisolatedRepository=${repository.toURI()}",
                            "-PsdkgenVersion=${sdkgenVersion.get()}",
                            "--refresh-dependencies",
                            "--no-daemon",
                            "--console=plain",
                            "--stacktrace",
                            "build",
                        )
                        standardOutput = log
                        errorOutput = log
                        isIgnoreExitValue = true
                    }
                }

            check(result.exitValue == 0) {
                "Isolated consumer build failed with exit ${result.exitValue}. The consumer fixtures could not " +
                    "resolve or compile against the staged repository at $repository.\n" +
                    output.tail()
            }

            verificationMarker.get().asFile.apply {
                parentFile.mkdirs()
                writeText(
                    "Isolated consumer fixtures resolved and compiled against $repository " +
                        "using Gradle user home $gradleUserHome.\n",
                )
            }
        }

        private fun File.tail(): String =
            RandomAccessFile(this, "r").use { input ->
                val length = input.length()
                val count = minOf(length, MAX_FAILURE_LOG_BYTES.toLong()).toInt()
                input.seek(length - count)
                ByteArray(count).also(input::readFully).decodeToString()
            }

        private companion object {
            const val MAX_FAILURE_LOG_BYTES = 256 * 1024
        }
    }
