package com.nabobery.sdkgen.buildlogic.publication

import com.nabobery.sdkgen.buildlogic.publication.inventory.SdkgenProductStagedArtifactInventoryJson
import org.gradle.api.DefaultTask
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.tasks.InputDirectory
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction
import org.gradle.work.DisableCachingByDefault

/**
 * Scans an isolated local staging repository (see
 * `conformance/publication/publish-to-isolated-repository.init.gradle.kts`) and writes a deterministic
 * JSON [com.nabobery.sdkgen.buildlogic.publication.inventory.SdkgenProductStagedArtifactInventory].
 *
 * This task only reads what `maven-publish` already staged; it never publishes, signs, or uploads
 * anything, and never contacts the network. Per ADR-0008/ADR-0013, the emitted inventory describes SDKGen
 * *product* publications only, never generated-SDK output.
 */
@DisableCachingByDefault(because = "Writes an inventory of a local staging directory; not worth caching.")
public abstract class GenerateStagedArtifactInventory : DefaultTask() {
    @get:InputDirectory
    @get:PathSensitive(PathSensitivity.RELATIVE)
    public abstract val repositoryDirectory: DirectoryProperty

    @get:OutputFile
    public abstract val inventoryFile: RegularFileProperty

    @TaskAction
    public fun generate() {
        val repository = repositoryDirectory.get().asFile
        check(repository.isDirectory && repository.listFiles()?.isNotEmpty() == true) {
            "Staged artifact inventory generation requires a non-empty repository directory: ${repository.path}"
        }

        val inventory = StagedArtifactRepositoryScanner.scan(repository)
        // Fail closed: an inventory over zero artifacts must never be written as if it were a success.
        check(inventory.artifacts.isNotEmpty()) {
            "Staged artifact inventory must not be empty: no product artifacts discovered under ${repository.path}"
        }

        val target = inventoryFile.get().asFile
        target.parentFile.mkdirs()
        target.writeText(SdkgenProductStagedArtifactInventoryJson.encode(inventory))
    }
}
