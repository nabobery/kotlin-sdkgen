package com.nabobery.sdkgen.buildlogic.conformance

import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.io.TempDir
import java.nio.file.Path
import kotlin.io.path.writeText

internal class CorpusGenerationTaskTest {
    @TempDir
    lateinit var temporaryDirectory: Path

    @Test
    fun buildsTheCheckCommandArgumentList() {
        val configFile = temporaryDirectory.resolve("sdkgen.yaml")
        configFile.writeText("version: v1alpha1\n")
        val task = createTask(CorpusGenerationMode.CHECK, configFile)

        assertEquals(
            listOf("check", "--config", configFile.toString()),
            task.cliArguments(),
        )
    }

    @Test
    fun buildsTheGenerateCommandArgumentList() {
        val configFile = temporaryDirectory.resolve("sdkgen.yaml")
        configFile.writeText("version: v1alpha1\n")
        val task = createTask(CorpusGenerationMode.GENERATE, configFile)

        assertEquals(
            listOf("generate", "--config", configFile.toString()),
            task.cliArguments(),
        )
    }

    private fun createTask(
        mode: CorpusGenerationMode,
        configFile: Path,
    ): CorpusGenerationTask {
        val project = ProjectBuilder.builder().withProjectDir(temporaryDirectory.toFile()).build()
        return project.tasks
            .register("corpusGeneration", CorpusGenerationTask::class.java)
            .get()
            .apply {
                this.mode.set(mode)
                this.configFile.set(configFile.toFile())
            }
    }
}
