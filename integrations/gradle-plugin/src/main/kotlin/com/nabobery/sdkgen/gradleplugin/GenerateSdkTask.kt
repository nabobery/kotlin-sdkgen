package com.nabobery.sdkgen.gradleplugin

import com.nabobery.sdkgen.engine.GenerationBlockedException
import com.nabobery.sdkgen.engine.GenerationPipeline
import com.nabobery.sdkgen.engine.config.AcquisitionException
import com.nabobery.sdkgen.engine.config.AcquisitionMode
import com.nabobery.sdkgen.engine.config.ConfigContractException
import com.nabobery.sdkgen.engine.config.ConfigLoader
import com.nabobery.sdkgen.engine.config.SdkgenConfigV1Alpha1
import com.nabobery.sdkgen.engine.input.LocalInputResolver
import com.nabobery.sdkgen.model.DiagnosticSeverity
import org.gradle.api.DefaultTask
import org.gradle.api.GradleException
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.problems.Problems
import org.gradle.api.provider.ListProperty
import org.gradle.api.provider.MapProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.CacheableTask
import org.gradle.api.tasks.Classpath
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.InputFiles
import org.gradle.api.tasks.Internal
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction
import org.gradle.work.NormalizeLineEndings
import java.nio.charset.StandardCharsets
import java.nio.file.AtomicMoveNotSupportedException
import java.nio.file.Files
import java.nio.file.LinkOption.NOFOLLOW_LINKS
import java.nio.file.Path
import java.nio.file.StandardCopyOption.ATOMIC_MOVE
import java.util.Comparator
import javax.inject.Inject

/** Generates one SDK from verified local inputs without accessing the owning project. */
@CacheableTask
public abstract class GenerateSdkTask : DefaultTask() {
    @get:Input
    public abstract val configurationName: Property<String>

    @get:InputFile
    @get:NormalizeLineEndings
    @get:PathSensitive(PathSensitivity.RELATIVE)
    public abstract val configFile: RegularFileProperty

    @get:InputFiles
    @get:NormalizeLineEndings
    @get:PathSensitive(PathSensitivity.RELATIVE)
    public abstract val specFiles: ConfigurableFileCollection

    @get:InputFiles
    @get:NormalizeLineEndings
    @get:PathSensitive(PathSensitivity.RELATIVE)
    public abstract val overlayFiles: ConfigurableFileCollection

    @get:Classpath
    public abstract val pluginClasspath: ConfigurableFileCollection

    @get:Input
    public abstract val pluginMetadata: MapProperty<String, String>

    @get:Input
    public abstract val generatorVersion: Property<String>

    @get:Input
    public abstract val edition: Property<String>

    @get:Input
    public abstract val kotlinPoetVersion: Property<String>

    @get:OutputDirectory
    public abstract val outputDirectory: DirectoryProperty

    /** The configured output path used for validation without depending on this task's output. */
    @get:Input
    internal abstract val outputRootPath: Property<String>

    @get:Internal
    internal abstract val allOutputRoots: ListProperty<String>

    @get:Internal
    internal abstract val buildDirectory: DirectoryProperty

    @get:Internal
    internal abstract val projectDirectory: DirectoryProperty

    @get:Inject
    internal abstract val problems: Problems

    init {
        onlyIf("Validate SDKGen output roots before Gradle manages task outputs") {
            validateOutputRoots()
            true
        }
    }

    @TaskAction
    public fun generate() {
        validateOutputRoots()
        validatePluginInputs()
        validateEdition()
        val file =
            configFile
                .get()
                .asFile
                .toPath()
                .toAbsolutePath()
                .normalize()
        try {
            val config = loadConfig(file)
            validateRelocatableInputs(config, file)
            LocalInputResolver().resolve(file, config).use { resolved ->
                val outputRoot = outputDirectory.get().asFile.toPath()
                val preservedSource = preserveMaterializedSourceOutput(outputRoot)
                var generationPublished = false
                try {
                    val result =
                        GenerationPipeline(
                            generatorVersion = generatorVersion.get(),
                            edition = edition.get(),
                            kotlinPoetVersion = kotlinPoetVersion.get(),
                        ).generate(
                            config = config,
                            source = resolved.source,
                            overlays = resolved.overlays,
                            destination = outputRoot.resolve("sources").toAbsolutePath().normalize(),
                        )
                    // GenerationPipeline publishes the destination atomically. Once it returns,
                    // retaining a materialized cache backup would only leave stale output behind.
                    generationPublished = true
                    pruneSnapshots(outputRoot, result.snapshotSha256)
                    result.diagnostics
                        .filter { diagnostic -> diagnostic.severity == DiagnosticSeverity.WARNING }
                        .forEach { diagnostic ->
                            reportProblem(
                                code = diagnostic.code,
                                message = diagnostic.message,
                                location = diagnostic.documentUri,
                                fallbackPath = file,
                            )
                        }
                    logger.info(
                        "SDKGen configuration '{}' generated {} file(s) with snapshot {}",
                        configurationName.get(),
                        result.generatedFiles,
                        result.snapshotSha256,
                    )
                } catch (failure: Throwable) {
                    if (!generationPublished && preservedSource != null) {
                        runCatching {
                            restoreMaterializedSourceOutput(outputRoot, preservedSource)
                        }.onFailure { rollbackFailure ->
                            failure.addSuppressed(rollbackFailure)
                        }
                    }
                    throw failure
                } finally {
                    if (generationPublished && preservedSource != null) {
                        deleteRecursively(preservedSource)
                    }
                }
            }
        } catch (failure: AcquisitionException) {
            reportProblem(
                code = failure.diagnostic.code,
                message = failure.diagnostic.message,
                location = failure.diagnostic.path.file,
                fallbackPath = file,
            )
            throw failure
        } catch (failure: ConfigContractException) {
            reportProblem(
                code = failure.diagnostic.code,
                message = failure.diagnostic.message,
                location = failure.diagnostic.path.file,
                fallbackPath = file,
            )
            throw failure
        } catch (failure: GenerationBlockedException) {
            failure.validation.diagnostics.forEach { diagnostic ->
                reportProblem(
                    code = diagnostic.code,
                    message = diagnostic.message,
                    location = diagnostic.documentUri,
                    fallbackPath = file,
                )
            }
            failure.validation.exclusions.forEach { exclusion ->
                reportProblem(
                    code = "SDKGEN-GRADLE-GENERATION-EXCLUSION",
                    message = "Generation excluded '${exclusion.symbolId}': ${exclusion.reason}",
                    location = exclusion.documentUri,
                    fallbackPath = file,
                )
            }
            throw failure
        }
    }

    private fun validateEdition() {
        val configuredEdition = edition.get().trim()
        if (configuredEdition in SdkGenEditions.known) return

        SdkGenProblems.fail(
            problems = problems,
            code = "SDKGEN-GRADLE-EDITION-UNSUPPORTED",
            message =
                "Edition '$configuredEdition' is not supported by this SDKGen Gradle plugin; " +
                    "known editions are ${SdkGenEditions.known.sorted().joinToString() }.",
            location = configurationName.get(),
            solution =
                "Set edition to one of ${SdkGenEditions.known.sorted().joinToString()} in the SDKGen " +
                    "configuration and rerun generation.",
            fallbackPath = configFile.get().asFile.toPath(),
        )
    }

    private fun validatePluginInputs() {
        val classpathEntries = pluginClasspath.files
        val metadataEntries = pluginMetadata.get()
        if (classpathEntries.isEmpty() && metadataEntries.isEmpty()) return

        val configuredInputs =
            buildList {
                if (classpathEntries.isNotEmpty()) add("pluginClasspath")
                if (metadataEntries.isNotEmpty()) add("pluginMetadata")
            }.joinToString()
        SdkGenProblems.fail(
            problems = problems,
            code = "SDKGEN-GRADLE-PLUGIN-INPUTS-UNSUPPORTED",
            message =
                "Non-empty $configuredInputs cannot be used yet: third-party SPI discovery and execution " +
                    "are not wired in the Gradle preview.",
            location = configurationName.get(),
            solution =
                "Remove $configuredInputs or leave them empty until Gradle plugin SPI execution is supported; " +
                    "use the built-in engine plugins in sdkgen.yaml instead.",
            fallbackPath = configFile.get().asFile.toPath(),
        )
    }

    private fun validateRelocatableInputs(
        config: SdkgenConfigV1Alpha1,
        configFile: Path,
    ) {
        if (config.source.acquisition.mode != AcquisitionMode.LOCAL) return
        val absoluteInputs =
            buildList {
                if (isAbsoluteInput(config.source.uri)) add("source.uri=${config.source.uri}")
                config.overlays.forEach { overlay ->
                    if (isAbsoluteInput(overlay.uri)) add("overlays[${overlay.id}].uri=${overlay.uri}")
                }
                config.source.acquisition.allowedLocalRoots.forEach { root ->
                    if (isAbsoluteInput(root)) add("source.acquisition.allowedLocalRoots=$root")
                }
            }
        if (absoluteInputs.isEmpty()) return
        val message = "Relocatable Gradle generation requires relative local inputs: ${absoluteInputs.joinToString()}"
        reportProblem(
            code = "SDKGEN-GRADLE-ABSOLUTE-INPUT",
            message = message,
            path = configFile,
        )
        throw GradleException("SDKGEN-GRADLE-ABSOLUTE-INPUT: $message")
    }

    private fun isAbsoluteInput(value: String): Boolean =
        if (value.contains("://")) {
            runCatching { java.net.URI(value).isAbsolute }.getOrDefault(false)
        } else {
            runCatching { Path.of(value).isAbsolute }.getOrDefault(false)
        }

    private fun validateOutputRoots() {
        val currentRoot =
            projectDirectory
                .get()
                .asFile
                .toPath()
                .resolve(outputRootPath.get())
                .toAbsolutePath()
                .normalize()
        val buildRoot =
            buildDirectory
                .get()
                .asFile
                .toPath()
                .toAbsolutePath()
                .normalize()
        val realBuildRoot = realPathFromNearestExistingAncestor(buildRoot)
        val projectRoot =
            projectDirectory
                .get()
                .asFile
                .toPath()
                .toAbsolutePath()
                .normalize()
        val sourceRoot = projectRoot.resolve("src").normalize()
        val roots =
            allOutputRoots
                .get()
                .map { root -> Path.of(root).toAbsolutePath().normalize() }
                .sorted()
        val uniqueRoots = roots.distinct()
        val violations = linkedSetOf<String>()

        if (currentRoot !in uniqueRoots) {
            violations += "${configurationName.get()} is not registered as a named SDKGen output root."
        }
        if (roots.size != uniqueRoots.size) {
            violations += "Named SDKGen configurations share an output root."
        }
        uniqueRoots.forEach { root ->
            val realRoot = realPathFromNearestExistingAncestor(root)
            if (!isStrictlyUnderBuildRoot(root, buildRoot, realRoot, realBuildRoot)) {
                violations += "SDKGen output root must be strictly under the build directory: $root"
            }
            if (root.startsWith(sourceRoot)) {
                violations += "SDKGen output root must not be under the source directory: $root"
            }
            validatePhysicalOutputRoot(root, buildRoot, violations)
        }
        uniqueRoots.forEachIndexed { index, root ->
            uniqueRoots.drop(index + 1).forEach { other ->
                if (root.startsWith(other) || other.startsWith(root)) {
                    violations += "Named SDKGen output roots overlap: $root and $other"
                }
            }
        }

        if (violations.isEmpty()) return
        violations.forEach { violation ->
            reportProblem(
                code = "SDKGEN-GRADLE-OUTPUT-ROOT",
                message = violation,
                path = currentRoot,
            )
        }
        throw GradleException(
            "SDKGEN-GRADLE-OUTPUT-ROOT: ${violations.joinToString(" ")}",
        )
    }

    private fun isStrictlyUnderBuildRoot(
        root: Path,
        buildRoot: Path,
        realRoot: Path?,
        realBuildRoot: Path?,
    ): Boolean {
        if (root == buildRoot) return false
        if (root.startsWith(buildRoot)) return true
        return realRoot != null &&
            realBuildRoot != null &&
            realRoot != realBuildRoot &&
            realRoot.startsWith(realBuildRoot)
    }

    private fun validatePhysicalOutputRoot(
        root: Path,
        buildRoot: Path,
        violations: MutableSet<String>,
    ) {
        val realRoot = realPathFromNearestExistingAncestor(root)
        val realBuildRoot = realPathFromNearestExistingAncestor(buildRoot)
        existingPathComponents(root)
            .filter { component ->
                Files.isSymbolicLink(component) &&
                    !isAllowedMacOsVarAlias(component, realRoot, realBuildRoot)
            }.forEach { component ->
                violations += "SDKGen output root must not contain a symbolic-link path component: $component"
            }

        if (realRoot == null || realBuildRoot == null) {
            violations += "SDKGen output root could not be resolved safely: $root"
        } else if (!realRoot.startsWith(realBuildRoot)) {
            violations += "SDKGen output root resolves outside the build directory: $root"
        } else {
            val snapshots = root.resolve(".snapshots")
            val realSnapshots = realPathFromNearestExistingAncestor(snapshots)
            existingPathComponents(snapshots)
                .filter { component ->
                    Files.isSymbolicLink(component) &&
                        !isAllowedMacOsVarAlias(component, realSnapshots, realRoot)
                }.distinct()
                .forEach { component ->
                    violations += "SDKGen output path must not contain a symbolic-link path component: $component"
                }
            if (realSnapshots == null || !realSnapshots.startsWith(realRoot)) {
                violations += "SDKGen snapshot directory resolves outside the output root: $snapshots"
            }
        }
    }

    private fun isAllowedMacOsVarAlias(
        component: Path,
        realChild: Path?,
        realParent: Path?,
    ): Boolean {
        if (component != Path.of("/var")) return false
        val realComponent = runCatching { component.toRealPath() }.getOrNull() ?: return false
        return realChild != null &&
            realParent != null &&
            realChild != realParent &&
            realChild.startsWith(realParent) &&
            realParent.startsWith(realComponent)
    }

    private fun existingPathComponents(path: Path): List<Path> {
        val root = path.root ?: return emptyList()
        val components = mutableListOf<Path>()
        var current = root
        path.forEach { component ->
            current = current.resolve(component)
            if (Files.exists(current, NOFOLLOW_LINKS)) components.add(current)
        }
        return components
    }

    private fun realPathFromNearestExistingAncestor(path: Path): Path? {
        var ancestor = path
        while (!Files.exists(ancestor, NOFOLLOW_LINKS)) {
            ancestor = ancestor.parent ?: return null
        }
        val realAncestor = runCatching { ancestor.toRealPath() }.getOrNull() ?: return null
        return realAncestor.resolve(ancestor.relativize(path)).normalize()
    }

    /**
     * Move a materialized source tree aside only after input resolution succeeds, and restore it
     * if generation fails before the new publication commits. The publisher may use this form when
     * symbolic links are unavailable.
     */
    private fun preserveMaterializedSourceOutput(outputRoot: Path): Path? {
        val sourcePointer = outputRoot.resolve("sources")
        if (!Files.isDirectory(sourcePointer, NOFOLLOW_LINKS) || Files.isSymbolicLink(sourcePointer)) {
            return null
        }
        val backup = Files.createTempFile(outputRoot, ".sdkgen-preserved-", ".tmp")
        Files.deleteIfExists(backup)
        moveAtomically(sourcePointer, backup)
        return backup
    }

    private fun restoreMaterializedSourceOutput(
        outputRoot: Path,
        backup: Path,
    ) {
        val sourcePointer = outputRoot.resolve("sources")
        deleteRecursively(sourcePointer)
        moveAtomically(backup, sourcePointer)
    }

    private fun moveAtomically(
        source: Path,
        target: Path,
    ) {
        try {
            Files.move(source, target, ATOMIC_MOVE)
        } catch (failure: AtomicMoveNotSupportedException) {
            Files.move(source, target)
        }
    }

    private fun pruneSnapshots(
        outputRoot: Path,
        currentSnapshotDigest: String,
    ) {
        val snapshots = outputRoot.resolve(".snapshots")
        if (!Files.isDirectory(snapshots, NOFOLLOW_LINKS)) return
        val currentSnapshot = snapshots.resolve(currentSnapshotDigest).normalize()
        val staleSnapshots =
            Files.list(snapshots).use { entries ->
                entries.filter { snapshot -> snapshot.normalize() != currentSnapshot }.toList()
            }
        staleSnapshots.forEach(::deleteRecursively)
    }

    private fun deleteRecursively(path: Path) {
        if (Files.isSymbolicLink(path)) {
            Files.deleteIfExists(path)
            return
        }
        if (!Files.exists(path, NOFOLLOW_LINKS)) return
        Files.walk(path).use { paths ->
            paths.sorted(Comparator.reverseOrder()).forEach(Files::deleteIfExists)
        }
    }

    private fun loadConfig(file: Path) =
        Files.readString(file, StandardCharsets.UTF_8).let { text ->
            if (file.fileName.toString().endsWith(".json", ignoreCase = true)) {
                ConfigLoader.decodeJson(text, file.toString())
            } else {
                ConfigLoader.decodeYaml(text, file.toString())
            }
        }

    private fun reportProblem(
        code: String,
        message: String,
        path: Path,
    ) {
        reportProblem(code, message, path.toString(), path)
    }

    private fun reportProblem(
        code: String,
        message: String,
        location: String,
        fallbackPath: Path,
    ) {
        SdkGenProblems.report(
            problems = problems,
            code = code,
            message = message,
            location = location,
            fallbackPath = fallbackPath,
        )
    }
}
