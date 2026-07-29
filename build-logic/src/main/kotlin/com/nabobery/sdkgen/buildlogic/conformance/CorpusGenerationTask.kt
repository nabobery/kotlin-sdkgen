package com.nabobery.sdkgen.buildlogic.conformance

import org.gradle.api.DefaultTask
import org.gradle.api.Project
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Classpath
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputDirectory
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction
import org.gradle.process.ExecOperations
import org.gradle.work.DisableCachingByDefault
import javax.inject.Inject

/** The sdkgen CLI command that a [CorpusGenerationTask] invokes. */
public enum class CorpusGenerationMode(
    internal val command: String,
) {
    /** Regenerates the corpus snapshot and repoints its generated-source symlink. */
    GENERATE("generate"),

    /** Regenerates in isolation and fails when the committed snapshot differs. */
    CHECK("check"),
}

/**
 * Invokes the published sdkgen CLI path to regenerate a corpus snapshot or detect snapshot drift.
 *
 * The CLI runtime classpath, corpus configuration, specification, overlays, and lock file are all declared as
 * lazy task inputs. Work happens in [run] without retaining a [Project], so the task remains
 * configuration-cache safe. A non-zero CLI exit is deliberately propagated: in particular, check mode cannot
 * turn generated-source drift into a successful Gradle task.
 *
 * No output is declared. Generate mode replaces a content-addressed snapshot and repoints `generated`, which
 * is a symlink; Gradle output tracking is not reliable for that mutation. The task therefore runs whenever
 * requested, leaving the CLI as the authoritative writer and drift comparator.
 */
@DisableCachingByDefault(
    because = "The CLI mutates a content-addressed snapshot through a generated-source symlink.",
)
public abstract class CorpusGenerationTask : DefaultTask() {
    @get:Input
    public abstract val mode: Property<CorpusGenerationMode>

    @get:Classpath
    public abstract val cliRuntimeClasspath: ConfigurableFileCollection

    @get:InputFile
    @get:PathSensitive(PathSensitivity.RELATIVE)
    public abstract val configFile: RegularFileProperty

    @get:InputFile
    @get:PathSensitive(PathSensitivity.RELATIVE)
    public abstract val specificationFile: RegularFileProperty

    @get:Optional
    @get:InputDirectory
    @get:PathSensitive(PathSensitivity.RELATIVE)
    public abstract val overlaysDirectory: DirectoryProperty

    @get:InputFile
    @get:PathSensitive(PathSensitivity.RELATIVE)
    public abstract val lockFile: RegularFileProperty

    @get:Inject
    protected abstract val execOperations: ExecOperations

    /** Returns the exact argument vector passed to the sdkgen CLI. */
    public fun cliArguments(): List<String> =
        listOf(
            mode.get().command,
            "--config",
            configFile.get().asFile.absolutePath,
        )

    @TaskAction
    public fun run() {
        execOperations.javaexec {
            classpath(cliRuntimeClasspath)
            mainClass.set(CLI_MAIN_CLASS)
            args(cliArguments())
            isIgnoreExitValue = false
        }
    }

    private companion object {
        const val CLI_MAIN_CLASS = "com.nabobery.sdkgen.cli.CliModuleKt"
    }
}
