import com.nabobery.sdkgen.buildlogic.publication.ExecuteIsolatedConsumerBuild
import com.nabobery.sdkgen.buildlogic.publication.VerifyPublicationMetadata

val rootProjectDirectory = rootProject.layout.projectDirectory
val publicationRepository =
    providers
        .gradleProperty("publicationRepository")
        .map { rootProjectDirectory.dir(it) }
        .orElse(rootProject.layout.buildDirectory.dir("publication-repository"))

val verifyPublicationMetadata =
    tasks.register<VerifyPublicationMetadata>("verifyPublicationMetadata") {
        group = "verification"
        description = "Preflights the isolated publication repository and consumer fixture wiring."
        repositoryDirectory.set(publicationRepository)
        sdkgenVersion.set(providers.gradleProperty("sdkgenVersion"))
        consumerFixturesDirectory.set(layout.projectDirectory.dir("consumers"))
        verificationMarker.set(layout.buildDirectory.file("reports/publication/metadata.txt"))
    }

// The task above reads the consumer build files as text; this one builds them. Ordered after it so a
// fixture-wiring mistake is reported by the fast textual check before the slow nested build runs, but the
// nested build is what actually establishes that the staged artifacts are consumable.
tasks.register<ExecuteIsolatedConsumerBuild>("executeIsolatedConsumerBuild") {
    group = "verification"
    description = "Resolves and compiles the consumer fixtures against only the isolated staging repository."
    dependsOn(verifyPublicationMetadata)
    repositoryDirectory.set(publicationRepository)
    consumerFixturesDirectory.set(layout.projectDirectory.dir("consumers"))
    gradleWrapperScript.set(rootProjectDirectory.file("gradlew"))
    sdkgenVersion.set(providers.gradleProperty("sdkgenVersion"))
    isolatedGradleUserHome.set(rootProject.layout.buildDirectory.dir("isolated-consumer-gradle-home"))
    verificationMarker.set(layout.buildDirectory.file("reports/publication/isolated-consumers.txt"))
}
