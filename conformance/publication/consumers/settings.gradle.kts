dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        val isolatedRepository =
            providers.gradleProperty("isolatedRepository").orNull
                ?: error("The isolatedRepository Gradle property is required.")
        exclusiveContent {
            forRepository {
                maven {
                    name = "isolated"
                    url = uri(isolatedRepository)
                }
            }
            filter {
                includeGroup("com.nabobery")
            }
        }
        mavenCentral()
    }
}

rootProject.name = "sdkgen-isolated-publication-consumers"

include(
    ":engine",
    ":cli",
    ":gradle-plugin",
    ":runtime",
    ":transport-ktor",
    ":transport-okhttp",
    ":transport-java-http",
    ":testing",
)
