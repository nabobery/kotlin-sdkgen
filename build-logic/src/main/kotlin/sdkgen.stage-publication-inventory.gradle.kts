import com.nabobery.sdkgen.buildlogic.publication.GenerateStagedArtifactInventory
import com.nabobery.sdkgen.buildlogic.publication.VerifyStagedArtifactInventory

// Mirrors sdkgen.verify-publication-metadata.gradle.kts: the same isolated local repository directory is
// the input to both the existing topology verifier and this inventory/verification pair. Nothing here
// stages, signs, or uploads anything; it only reads what `publish...ToIsolatedRepository` already wrote.
val rootProjectDirectory = rootProject.layout.projectDirectory
val publicationRepository =
    providers
        .gradleProperty("publicationRepository")
        .map { rootProjectDirectory.dir(it) }
        .orElse(rootProject.layout.buildDirectory.dir("publication-repository"))

val generateStagedArtifactInventory =
    tasks.register<GenerateStagedArtifactInventory>("generateStagedArtifactInventory") {
        group = "verification"
        description = "Generates a deterministic inventory of the isolated staging repository's artifacts."
        repositoryDirectory.set(publicationRepository)
        inventoryFile.set(layout.buildDirectory.file("reports/publication/staged-artifact-inventory.json"))
    }

tasks.register<VerifyStagedArtifactInventory>("verifyStagedArtifactInventory") {
    group = "verification"
    description = "Verifies the staged artifact inventory fail-closed against the isolated staging repository."
    dependsOn(generateStagedArtifactInventory)
    repositoryDirectory.set(publicationRepository)
    inventoryFile.set(generateStagedArtifactInventory.flatMap { it.inventoryFile })
    expectedVersion.set(providers.gradleProperty("sdkgenVersion"))
    verificationMarker.set(layout.buildDirectory.file("reports/publication/staged-artifact-inventory-verified.txt"))
}
