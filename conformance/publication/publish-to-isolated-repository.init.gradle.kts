import org.gradle.api.publish.PublishingExtension

val publicationRepositoryPath =
    providers
        .gradleProperty("publicationRepository")
        .orElse("build/publication-repository")

gradle.allprojects {
    pluginManager.withPlugin("maven-publish") {
        extensions.configure<PublishingExtension> {
            repositories {
                maven {
                    name = "isolated"
                    url = gradle.rootProject.file(publicationRepositoryPath.get()).toURI()
                }
            }
        }
    }
}
