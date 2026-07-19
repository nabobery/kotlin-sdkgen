package com.nabobery.sdkgen.gradleplugin

import com.nabobery.sdkgen.engine.SdkGenDependencyVersions
import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import java.nio.file.Path

internal class SdkGenPluginTest {
    @Test
    fun exposesStableImplementationClass() {
        assertEquals("SdkGenPlugin", SdkGenPlugin::class.simpleName)
    }

    @Test
    fun registersOneTaskPerNamedConfigurationWithoutExecutingIt() {
        val project = ProjectBuilder.builder().build()

        project.plugins.apply(SdkGenPlugin::class.java)
        project.extensions
            .getByType(SdkGenExtension::class.java)
            .configurations
            .register("api")

        val task = project.tasks.findByName("generateApiSdk")

        assertNotNull(task)
        assertTrue(task is GenerateSdkTask)
        if (task is GenerateSdkTask) {
            assertEquals("api", task.configurationName.get())
        }
    }

    @Test
    fun kotlinPoetVersionDefaultsToTheEngineDependencyVersion() {
        val extension = applyAndGetExtension(ProjectBuilder.builder().build())

        assertEquals(
            SdkGenDependencyVersions.kotlinPoet,
            extension.configurations
                .create("api")
                .kotlinPoetVersion
                .get(),
        )
    }

    @Test
    fun generatorVersionDoesNotUseConsumerProjectVersion() {
        val project = ProjectBuilder.builder().build()
        project.version = "consumer-version"
        val extension = applyAndGetExtension(project)

        extension.configurations.register("api")
        val task = project.tasks.named("generateApiSdk", GenerateSdkTask::class.java).get()

        assertNotEquals(project.version.toString(), task.generatorVersion.get())
        assertEquals(SdkGenPluginVersion.current(), task.generatorVersion.get())
    }

    @Test
    fun logicalDiagnosticUriUsesFallbackFileWithoutPathParsing() {
        val fallback = Path.of("build/sdkgen.yaml")

        assertEquals(
            fallback.toString(),
            SdkGenProblems.fileLocation("sdkgen://source/openapi.yaml", fallback),
        )
    }

    @Test
    fun usesIsolatedDefaultOutputDirectoryForEachConfiguration() {
        val project = ProjectBuilder.builder().build()
        val extension = applyAndGetExtension(project)

        extension.configurations.create("publicApi")
        extension.configurations.create("adminApi")

        val publicOutput =
            extension.configurations
                .getByName("publicApi")
                .outputDirectory
                .get()
                .asFile
        val adminOutput =
            extension.configurations
                .getByName("adminApi")
                .outputDirectory
                .get()
                .asFile

        assertEquals(
            project.layout.buildDirectory
                .dir("generated/sdkgen/publicApi")
                .get()
                .asFile,
            publicOutput,
        )
        assertEquals(
            project.layout.buildDirectory
                .dir("generated/sdkgen/adminApi")
                .get()
                .asFile,
            adminOutput,
        )
    }

    private fun applyAndGetExtension(project: Project): SdkGenExtension {
        project.plugins.apply(SdkGenPlugin::class.java)
        return project.extensions.getByType(SdkGenExtension::class.java)
    }
}
