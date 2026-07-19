package com.nabobery.sdkgen.gradleplugin

import org.gradle.api.Action
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.specs.Spec
import org.gradle.api.tasks.TaskProvider
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

/**
 * Lazy, cacheable SDK generation backed by the shared engine. Applying the plugin alone does not
 * read configuration files or execute generation.
 */
public class SdkGenPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        val extension = target.sdkGenExtension(target.objects, target.layout)
        val tasks = mutableMapOf<String, TaskProvider<GenerateSdkTask>>()
        val allOutputRoots = target.objects.listProperty(String::class.java)

        // `all` is intentional: a configuration registered with `register("name")` is otherwise
        // never realized merely because its corresponding generation task was requested. The
        // configuration object is cheap; the task and all file resolution remain lazy.
        extension.configurations.all { configuration ->
            val task =
                tasks.getOrPut(configuration.name) {
                    registerGenerationTask(target, configuration)
                }
            allOutputRoots.add(
                configuration.outputDirectory.map { directory ->
                    directory.asFile.absolutePath
                },
            )
            task.configure { generated ->
                generated.allOutputRoots.set(allOutputRoots)
            }
            wireSourcesJar(target, task)
            target.pluginManager.withPlugin("org.jetbrains.kotlin.jvm") {
                wireJvmSourceSet(target, task)
            }
            target.pluginManager.withPlugin("org.jetbrains.kotlin.multiplatform") {
                wireKmpSourceSet(target, task)
            }
            target.pluginManager.withPlugin("org.jlleitschuh.gradle.ktlint") {
                excludeGeneratedOutputFromKtlint(target, configuration)
            }
        }
    }

    private fun excludeGeneratedOutputFromKtlint(
        project: Project,
        configuration: SdkGenConfiguration,
    ) {
        val ktlintExtension =
            requireNotNull(project.extensions.findByName("ktlint")) {
                "The ktlint plugin did not register its extension before SDKGen configured it."
            }
        val filterMethod =
            requireNotNull(
                ktlintExtension.javaClass.methods.firstOrNull { method ->
                    method.name == "filter" && method.parameterTypes.size == 1
                },
            ) {
                "The installed ktlint Gradle plugin does not expose filter(Action)."
            }
        filterMethod.invoke(
            ktlintExtension,
            Action<Any> { patternFilterable ->
                val excludeMethod =
                    requireNotNull(
                        patternFilterable.javaClass.methods.firstOrNull { method ->
                            method.name == "exclude" &&
                                method.parameterTypes.size == 1 &&
                                Spec::class.java.isAssignableFrom(method.parameterTypes[0])
                        },
                    ) {
                        "The installed ktlint Gradle plugin does not expose exclude(Spec)."
                    }
                excludeMethod.invoke(
                    patternFilterable,
                    Spec<Any> { element ->
                        val file =
                            requireNotNull(
                                element.javaClass.methods
                                    .firstOrNull { method ->
                                        method.name == "getFile" && method.parameterTypes.isEmpty()
                                    }?.invoke(element) as? java.io.File,
                            ) { "The installed ktlint Gradle plugin did not expose file metadata." }
                        val generatedRoot =
                            configuration.outputDirectory
                                .get()
                                .asFile
                                .toPath()
                                .toAbsolutePath()
                                .normalize()
                        file
                            .toPath()
                            .toAbsolutePath()
                            .normalize()
                            .startsWith(generatedRoot)
                    },
                )
            },
        )
    }

    private fun registerGenerationTask(
        project: Project,
        configuration: SdkGenConfiguration,
    ): TaskProvider<GenerateSdkTask> {
        val taskName = "generate${configuration.name.capitalizeAscii()}Sdk"
        return project.tasks.register(
            taskName,
            GenerateSdkTask::class.java,
            Action<GenerateSdkTask> { task ->
                task.configurationName.set(configuration.name)
                task.configFile.set(configuration.configFile)
                task.specFiles.from(
                    configuration.configFile.map { file -> ConfigInputFiles.source(file.asFile) },
                )
                task.specFiles.from(configuration.specFiles)
                task.overlayFiles.from(
                    configuration.configFile.map { file -> ConfigInputFiles.overlays(file.asFile) },
                )
                task.overlayFiles.from(configuration.overlayFiles)
                task.pluginClasspath.from(configuration.pluginClasspath)
                task.pluginMetadata.set(configuration.pluginMetadata)
                task.generatorVersion.set(configuration.generatorVersion)
                task.edition.set(configuration.edition)
                task.kotlinPoetVersion.set(configuration.kotlinPoetVersion)
                task.outputRootPath.set(
                    configuration.outputDirectory.map { directory ->
                        val projectRoot =
                            project.layout.projectDirectory.asFile
                                .toPath()
                                .toAbsolutePath()
                                .normalize()
                        val outputRoot =
                            directory.asFile
                                .toPath()
                                .toAbsolutePath()
                                .normalize()
                        runCatching { projectRoot.relativize(outputRoot).toString() }
                            .getOrElse { outputRoot.toString() }
                            .replace('\\', '/')
                    },
                )
                task.outputDirectory.set(configuration.outputDirectory)
                task.buildDirectory.set(project.layout.buildDirectory)
                task.projectDirectory.set(project.layout.projectDirectory)
            },
        )
    }

    private fun wireJvmSourceSet(
        project: Project,
        task: TaskProvider<GenerateSdkTask>,
    ) {
        val kotlin = project.extensions.findByType(KotlinJvmProjectExtension::class.java) ?: return
        kotlin.sourceSets.named("main") { sourceSet ->
            sourceSet.kotlin.srcDir(
                task.flatMap { generated -> generated.outputDirectory }.map { directory ->
                    directory.dir("sources")
                },
            )
        }
    }

    private fun wireKmpSourceSet(
        project: Project,
        task: TaskProvider<GenerateSdkTask>,
    ) {
        val kotlin = project.extensions.findByType(KotlinMultiplatformExtension::class.java) ?: return
        kotlin.sourceSets.named("commonMain") { sourceSet ->
            sourceSet.kotlin.srcDir(
                task.flatMap { generated -> generated.outputDirectory }.map { directory ->
                    directory.dir("sources")
                },
            )
        }
    }

    private fun wireSourcesJar(
        project: Project,
        task: TaskProvider<GenerateSdkTask>,
    ) {
        project.tasks.configureEach { candidate ->
            if (candidate.name.endsWith("sourcesJar", ignoreCase = true)) {
                candidate.dependsOn(task)
            }
        }
    }
}

private fun String.capitalizeAscii(): String =
    replaceFirstChar { character ->
        if (character.isLowerCase()) character.titlecase() else character.toString()
    }
