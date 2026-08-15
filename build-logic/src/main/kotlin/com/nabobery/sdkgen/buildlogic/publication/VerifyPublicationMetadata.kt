package com.nabobery.sdkgen.buildlogic.publication

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import org.gradle.api.DefaultTask
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputDirectory
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction
import org.gradle.work.DisableCachingByDefault
import org.w3c.dom.Element
import java.io.File
import java.util.zip.ZipFile
import javax.xml.XMLConstants
import javax.xml.parsers.DocumentBuilderFactory

/** Verifies that the isolated repository preserves ADR-0008's publication topology. */
@DisableCachingByDefault(because = "The task records a successful verification marker for a local repository.")
public abstract class VerifyPublicationMetadata : DefaultTask() {
    @get:InputDirectory
    @get:PathSensitive(PathSensitivity.RELATIVE)
    public abstract val repositoryDirectory: DirectoryProperty

    @get:InputDirectory
    @get:PathSensitive(PathSensitivity.RELATIVE)
    public abstract val consumerFixturesDirectory: DirectoryProperty

    @get:Input
    public abstract val sdkgenVersion: Property<String>

    @get:OutputFile
    public abstract val verificationMarker: RegularFileProperty

    @TaskAction
    public fun verify() {
        val repository = repositoryDirectory.get().asFile
        check(repository.isDirectory && repository.listFiles()?.isNotEmpty() == true) {
            "Publication metadata verification requires a non-empty repository directory: ${repository.path}"
        }

        val version = sdkgenVersion.get()
        val failures =
            PublicationMetadataTopology.verify(
                repository = repository,
                version = version,
                consumerFixturesDirectory = consumerFixturesDirectory.get().asFile,
            )

        check(failures.isEmpty()) {
            "Publication metadata topology verification failed:\n${failures.joinToString("\n")}"
        }

        verificationMarker.get().asFile.apply {
            parentFile.mkdirs()
            writeText("Publication metadata topology verified for $version.\n")
        }
    }
}

internal object PublicationMetadataTopology {
    // Sourced from Adr0008ProductArtifactIds, not re-listed. This was a fourth independent literal copy of
    // the eight roots, which is exactly the drift that type exists to prevent.
    private val rootArtifacts = Adr0008ProductArtifactIds.projectPathToArtifactId.values.distinct()

    private val forbiddenCoordinates =
        setOf(
            Coordinate("kotlin-sdkgen.generator", "model"),
            Coordinate("kotlin-sdkgen.generator", "openapi"),
        )

    private val consumerFixtures =
        mapOf(
            "engine" to "kotlin-sdkgen-engine",
            "cli" to "kotlin-sdkgen-cli",
            "gradle-plugin" to "kotlin-sdkgen-gradle-plugin",
            "runtime" to "kotlin-sdkgen-runtime",
            "transport-ktor" to "kotlin-sdkgen-transport-ktor",
            "transport-okhttp" to "kotlin-sdkgen-transport-okhttp",
            "transport-java-http" to "kotlin-sdkgen-transport-java-http",
            "testing" to "kotlin-sdkgen-testing",
        )

    private val engineClasses =
        setOf(
            "com/nabobery/sdkgen/model/SemanticDocument.class",
            "com/nabobery/sdkgen/openapi/SemanticAdapter.class",
        )

    private val engineResources =
        setOf(
            "schemas/x-sdkgen-idempotency.schema.json",
            "schemas/x-sdkgen-pagination.schema.json",
            "schemas/x-sdkgen-streaming.schema.json",
        )

    private val engineSources =
        setOf(
            "com/nabobery/sdkgen/model/SemanticModel.kt",
            "com/nabobery/sdkgen/model/SnapshotRenderer.kt",
            "com/nabobery/sdkgen/openapi/SemanticAdapter.kt",
        )

    private val json = Json

    internal fun verify(
        repository: File,
        version: String,
        consumerFixturesDirectory: File,
    ): List<String> =
        buildList {
            rootArtifacts.forEach { artifact ->
                verifyMetadata(repository, artifact, version).forEach(::add)
            }
            verifyEngineContents(repository, version).forEach(::add)
            verifyConsumerFixtures(consumerFixturesDirectory).forEach(::add)
        }

    private fun verifyMetadata(
        repository: File,
        artifact: String,
        version: String,
    ): List<String> =
        buildList {
            listOf(
                "POM" to "pom",
                "module" to "module",
            ).forEach { (metadataType, extension) ->
                val metadata = publishedFile(repository, artifact, version, extension)
                if (metadata == null) {
                    add("$artifact $metadataType: missing published metadata")
                    return@forEach
                }

                val dependencies =
                    runCatching {
                        if (extension == "pom") {
                            pomCoordinates(metadata)
                        } else {
                            moduleCoordinates(metadata)
                        }
                    }.getOrElse { exception ->
                        add("$artifact $metadataType: unreadable metadata (${exception.message})")
                        return@forEach
                    }
                val leaks = dependencies.intersect(forbiddenCoordinates)
                if (leaks.isNotEmpty()) {
                    add("$artifact $metadataType: internal coordinates ${describe(leaks)}")
                }
            }
        }

    private fun verifyEngineContents(
        repository: File,
        version: String,
    ): List<String> =
        buildList {
            listOf(
                EngineArchiveExpectation(
                    label = "classes/resources",
                    archive = publishedFile(repository, "kotlin-sdkgen-engine", version, "jar"),
                    expectedEntries = engineClasses + engineResources,
                ),
                EngineArchiveExpectation(
                    label = "sources",
                    archive = publishedFile(repository, "kotlin-sdkgen-engine", version, "jar", "sources"),
                    expectedEntries = engineSources,
                ),
            ).forEach { expectation ->
                if (expectation.archive == null) {
                    add("kotlin-sdkgen-engine ${expectation.label}: missing published archive")
                    return@forEach
                }

                val entries =
                    runCatching {
                        ZipFile(expectation.archive).use { archive ->
                            archive
                                .entries()
                                .asSequence()
                                .map { it.name }
                                .toSet()
                        }
                    }.getOrElse { exception ->
                        add("kotlin-sdkgen-engine ${expectation.label}: unreadable archive (${exception.message})")
                        return@forEach
                    }
                val missing = expectation.expectedEntries - entries
                if (missing.isNotEmpty()) {
                    add("kotlin-sdkgen-engine ${expectation.label}: missing ${missing.sorted().joinToString(", ")}")
                }
            }
        }

    private fun verifyConsumerFixtures(fixturesDirectory: File): List<String> =
        buildList {
            val settings = fixturesDirectory.resolve("settings.gradle.kts")
            if (!settings.isFile) {
                add("consumer fixtures: missing ${settings.path}")
                return@buildList
            }

            val settingsText = settings.readText()
            listOf(
                "RepositoriesMode.FAIL_ON_PROJECT_REPOS",
                "exclusiveContent",
                "includeGroup(\"io.github.nabobery\")",
                "mavenCentral()",
                "name = \"isolated\"",
                "isolatedRepository",
            ).forEach { required ->
                if (required !in settingsText) {
                    add("consumer fixtures: settings must contain $required")
                }
            }
            if (Regex("\\bmaven\\s*\\{").findAll(settingsText).count() != 1) {
                add("consumer fixtures: settings must declare exactly one Maven repository")
            }
            if (Regex("\\bmaven\\s*\\(").containsMatchIn(settingsText)) {
                add("consumer fixtures: settings must not declare Maven repositories by URL")
            }
            forbiddenRepositoryOrSubstitution(settingsText).forEach { forbidden ->
                add("consumer fixtures: settings must not contain $forbidden")
            }

            val projects =
                fixturesDirectory
                    .listFiles()
                    .orEmpty()
                    .filter { it.isDirectory && it.resolve("build.gradle.kts").isFile }
                    .map(File::getName)
                    .toSet()
            if (projects != consumerFixtures.keys) {
                add(
                    "consumer fixtures: projects must be exactly " +
                        "${consumerFixtures.keys.sorted().joinToString(", ")}; " +
                        "found ${projects.sorted().joinToString(", ")}",
                )
            }

            consumerFixtures.forEach { (project, artifact) ->
                val buildFile = fixturesDirectory.resolve("$project/build.gradle.kts")
                if (!buildFile.isFile) {
                    add("consumer fixtures: missing ${buildFile.path}")
                    return@forEach
                }

                val buildText = buildFile.readText()
                val coordinate = "io.github.nabobery:$artifact:"
                if (coordinate !in buildText) {
                    add("consumer fixtures: $project must consume $coordinate")
                }
                if (Regex("\\brepositories\\s*\\{").containsMatchIn(buildText)) {
                    add("consumer fixtures: $project must not declare repositories")
                }
                forbiddenRepositoryOrSubstitution(buildText).forEach { forbidden ->
                    add("consumer fixtures: $project must not contain $forbidden")
                }
            }
        }

    private fun forbiddenRepositoryOrSubstitution(text: String): List<String> =
        listOf(
            "mavenLocal" to Regex("\\bmavenLocal\\s*\\("),
            "includeBuild" to Regex("\\bincludeBuild\\s*\\("),
            "project" to Regex("\\bproject\\s*\\("),
            "flatDir" to Regex("\\bflatDir\\s*\\("),
            "ivy" to Regex("\\bivy\\s*\\("),
            "dependencySubstitution" to Regex("\\bdependencySubstitution\\b"),
        ).mapNotNull { (label, pattern) -> label.takeIf { pattern.containsMatchIn(text) } }

    private fun pomCoordinates(metadata: File): Set<Coordinate> {
        val factory = DocumentBuilderFactory.newInstance()
        factory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true)
        factory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true)
        factory.setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, "")
        factory.setAttribute(XMLConstants.ACCESS_EXTERNAL_SCHEMA, "")
        factory.isNamespaceAware = true

        val dependencies =
            factory
                .newDocumentBuilder()
                .parse(metadata)
                .getElementsByTagNameNS(MAVEN_NAMESPACE, "dependency")
        return buildSet {
            (0 until dependencies.length).forEach { index ->
                val dependency = dependencies.item(index) as Element
                val group = dependency.childText("groupId")
                val artifact = dependency.childText("artifactId")
                if (group != null && artifact != null) {
                    add(Coordinate(group, artifact))
                }
            }
        }
    }

    private fun moduleCoordinates(metadata: File): Set<Coordinate> =
        json
            .parseToJsonElement(metadata.readText())
            .jsonObject["variants"]
            ?.jsonArray
            .orEmpty()
            .flatMap { variant -> variant.jsonObject["dependencies"]?.jsonArray.orEmpty() }
            .mapNotNull { dependency ->
                val coordinates = dependency.jsonObject
                val group = coordinates.string("group")
                val artifact = coordinates.string("module")
                if (group == null || artifact == null) null else Coordinate(group, artifact)
            }.toSet()

    private fun publishedFile(
        repository: File,
        artifact: String,
        version: String,
        extension: String,
        classifier: String? = null,
    ): File? {
        val directory = repository.resolve("io/github/nabobery/$artifact/$version")
        val classifierSuffix = classifier?.let { "-$it" }.orEmpty()
        val exact = directory.resolve("$artifact-$version$classifierSuffix.$extension")
        if (exact.isFile) return exact
        if (!version.endsWith("-SNAPSHOT")) return null

        val timestampedVersionPattern =
            "${Regex.escape(version.removeSuffix("-SNAPSHOT"))}-\\d{8}\\.\\d{6}-\\d+"
        val timestampedFilePattern =
            Regex(
                "^${Regex.escape(artifact)}-$timestampedVersionPattern" +
                    "${classifier?.let { "-${Regex.escape(it)}" }.orEmpty()}\\.${Regex.escape(extension)}$",
            )
        return directory
            .listFiles()
            .orEmpty()
            .filter { candidate -> candidate.isFile && timestampedFilePattern.matches(candidate.name) }
            .singleOrNull()
    }

    private fun Element.childText(name: String): String? =
        getElementsByTagNameNS(MAVEN_NAMESPACE, name)
            .item(0)
            ?.textContent
            ?.trim()
            ?.takeIf(String::isNotEmpty)

    private fun JsonElement.string(name: String): String? = (jsonObject[name] as? JsonPrimitive)?.content

    private fun describe(coordinates: Set<Coordinate>): String =
        coordinates
            .sortedWith(compareBy(Coordinate::group, Coordinate::artifact))
            .joinToString(", ") { "${it.group}:${it.artifact}" }

    private data class Coordinate(
        val group: String,
        val artifact: String,
    )

    private data class EngineArchiveExpectation(
        val label: String,
        val archive: File?,
        val expectedEntries: Set<String>,
    )

    private const val MAVEN_NAMESPACE: String = "http://maven.apache.org/POM/4.0.0"
}
