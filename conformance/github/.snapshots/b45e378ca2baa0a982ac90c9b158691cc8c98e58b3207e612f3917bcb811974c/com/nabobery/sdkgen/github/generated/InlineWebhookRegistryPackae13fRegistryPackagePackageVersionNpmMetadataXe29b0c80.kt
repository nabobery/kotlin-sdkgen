package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-registry-package-published/properties/registry_package/prope
 * rties/package_version/properties/npm_metadata.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-registry-package-published/properties/registry_package/prope
 * rties/package_version/properties/npm_metadata
 */
@Serializable(with = InlineWebhookRegistryPackae13fRegistryPackagePackageVersionNpmMetadataXe29b0c80.Serializer::class)
public class InlineWebhookRegistryPackae13fRegistryPackagePackageVersionNpmMetadataXe29b0c80(
  public val author:
      InlineWebhookRegistryPackae13fRegistryPackagePackageVersionAuthorX9b018d41? = null,
  public val bin: JsonObject? = null,
  public val bugs: InlineWebhookRegistryPackae13fRegistryPackagePackageVersionBugsXcf06aeec? = null,
  public val commitOid: String? = null,
  contributors: List<String>? = null,
  cpu: List<String>? = null,
  public val deletedById: Int? = null,
  public val dependencies: JsonObject? = null,
  public val description: String? = null,
  public val devDependencies: JsonObject? = null,
  public val directories:
      InlineWebhookRegistryPackae13fRegistryPackagePackageVersionDirectoriesX47c4ec65? = null,
  public val dist: InlineWebhookRegistryPackae13fRegistryPackagePackageVersionDistX1f8b42bf? = null,
  public val engines: JsonObject? = null,
  files: List<String>? = null,
  public val gitHead: String? = null,
  public val hasShrinkwrap: Boolean? = null,
  public val homepage: String? = null,
  public val id: String? = null,
  public val installationCommand: String? = null,
  keywords: List<String>? = null,
  public val license: String? = null,
  public val main: String? = null,
  maintainers: List<String>? = null,
  public val man: JsonObject? = null,
  public val name: String? = null,
  public val nodeVersion: String? = null,
  public val npmUser: String? = null,
  public val npmVersion: String? = null,
  public val optionalDependencies: JsonObject? = null,
  os: List<String>? = null,
  public val peerDependencies: JsonObject? = null,
  public val publishedViaActions: Boolean? = null,
  public val readme: String? = null,
  public val releaseId: Int? = null,
  public val repository:
      InlineWebhookRegistryPackae13fRegistryPackagePackageVersionRepositoryXc26154e4? = null,
  public val scripts: JsonObject? = null,
  public val version: String? = null,
) {
  public val contributors: List<String>? = contributors?.let { collection0 -> collection0.toList() }

  public val cpu: List<String>? = cpu?.let { collection0 -> collection0.toList() }

  public val files: List<String>? = files?.let { collection0 -> collection0.toList() }

  public val keywords: List<String>? = keywords?.let { collection0 -> collection0.toList() }

  public val maintainers: List<String>? = maintainers?.let { collection0 -> collection0.toList() }

  public val os: List<String>? = os?.let { collection0 -> collection0.toList() }

  public class Builder {
    public var author: InlineWebhookRegistryPackae13fRegistryPackagePackageVersionAuthorX9b018d41? =
        null

    public var bin: JsonObject? = null

    public var bugs: InlineWebhookRegistryPackae13fRegistryPackagePackageVersionBugsXcf06aeec? =
        null

    public var commitOid: String? = null

    private var contributorsValue: List<String>? = null

    public var contributors: List<String>?
      get() = contributorsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        contributorsValue = value?.let { collection0 -> collection0.toList() }
      }

    private var cpuValue: List<String>? = null

    public var cpu: List<String>?
      get() = cpuValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        cpuValue = value?.let { collection0 -> collection0.toList() }
      }

    public var deletedById: Int? = null

    public var dependencies: JsonObject? = null

    public var description: String? = null

    public var devDependencies: JsonObject? = null

    public var directories:
        InlineWebhookRegistryPackae13fRegistryPackagePackageVersionDirectoriesX47c4ec65? = null

    public var dist: InlineWebhookRegistryPackae13fRegistryPackagePackageVersionDistX1f8b42bf? =
        null

    public var engines: JsonObject? = null

    private var filesValue: List<String>? = null

    public var files: List<String>?
      get() = filesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        filesValue = value?.let { collection0 -> collection0.toList() }
      }

    public var gitHead: String? = null

    public var hasShrinkwrap: Boolean? = null

    public var homepage: String? = null

    public var id: String? = null

    public var installationCommand: String? = null

    private var keywordsValue: List<String>? = null

    public var keywords: List<String>?
      get() = keywordsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        keywordsValue = value?.let { collection0 -> collection0.toList() }
      }

    public var license: String? = null

    public var main: String? = null

    private var maintainersValue: List<String>? = null

    public var maintainers: List<String>?
      get() = maintainersValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        maintainersValue = value?.let { collection0 -> collection0.toList() }
      }

    public var man: JsonObject? = null

    public var name: String? = null

    public var nodeVersion: String? = null

    public var npmUser: String? = null

    public var npmVersion: String? = null

    public var optionalDependencies: JsonObject? = null

    private var osValue: List<String>? = null

    public var os: List<String>?
      get() = osValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        osValue = value?.let { collection0 -> collection0.toList() }
      }

    public var peerDependencies: JsonObject? = null

    public var publishedViaActions: Boolean? = null

    public var readme: String? = null

    public var releaseId: Int? = null

    public var repository:
        InlineWebhookRegistryPackae13fRegistryPackagePackageVersionRepositoryXc26154e4? = null

    public var scripts: JsonObject? = null

    public var version: String? = null

    public fun build(): InlineWebhookRegistryPackae13fRegistryPackagePackageVersionNpmMetadataXe29b0c80 = InlineWebhookRegistryPackae13fRegistryPackagePackageVersionNpmMetadataXe29b0c80(
      author = author,
      bin = bin,
      bugs = bugs,
      commitOid = commitOid,
      contributors = contributors,
      cpu = cpu,
      deletedById = deletedById,
      dependencies = dependencies,
      description = description,
      devDependencies = devDependencies,
      directories = directories,
      dist = dist,
      engines = engines,
      files = files,
      gitHead = gitHead,
      hasShrinkwrap = hasShrinkwrap,
      homepage = homepage,
      id = id,
      installationCommand = installationCommand,
      keywords = keywords,
      license = license,
      main = main,
      maintainers = maintainers,
      man = man,
      name = name,
      nodeVersion = nodeVersion,
      npmUser = npmUser,
      npmVersion = npmVersion,
      optionalDependencies = optionalDependencies,
      os = os,
      peerDependencies = peerDependencies,
      publishedViaActions = publishedViaActions,
      readme = readme,
      releaseId = releaseId,
      repository = repository,
      scripts = scripts,
      version = version,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookRegistryPackae13fRegistryPackagePackageVersionNpmMetadataXe29b0c80 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookRegistryPackae13fRegistryPackagePackageVersionNpmMetadataXe29b0c80> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookRegistryPackae13fRegistryPackagePackageVersionNpmMetadataXe29b0c80 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookRegistryPackae13fRegistryPackagePackageVersionNpmMetadataXe29b0c80")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookRegistryPackae13fRegistryPackagePackageVersionNpmMetadataXe29b0c80 must be a JSON object")
      return InlineWebhookRegistryPackae13fRegistryPackagePackageVersionNpmMetadataXe29b0c80(
        author = rawObject["author"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookRegistryPackae13fRegistryPackagePackageVersionAuthorX9b018d41?>(element) },
        bin = rawObject["bin"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        bugs = rawObject["bugs"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookRegistryPackae13fRegistryPackagePackageVersionBugsXcf06aeec?>(element) },
        commitOid = rawObject["commit_oid"]?.let { json.decodeFromJsonElement<String>(it) },
        contributors = rawObject["contributors"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        cpu = rawObject["cpu"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        deletedById = rawObject["deleted_by_id"]?.let { json.decodeFromJsonElement<Int>(it) },
        dependencies = rawObject["dependencies"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        devDependencies = rawObject["dev_dependencies"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        directories = rawObject["directories"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookRegistryPackae13fRegistryPackagePackageVersionDirectoriesX47c4ec65?>(element) },
        dist = rawObject["dist"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookRegistryPackae13fRegistryPackagePackageVersionDistX1f8b42bf?>(element) },
        engines = rawObject["engines"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        files = rawObject["files"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        gitHead = rawObject["git_head"]?.let { json.decodeFromJsonElement<String>(it) },
        hasShrinkwrap = rawObject["has_shrinkwrap"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        homepage = rawObject["homepage"]?.let { json.decodeFromJsonElement<String>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<String>(it) },
        installationCommand = rawObject["installation_command"]?.let { json.decodeFromJsonElement<String>(it) },
        keywords = rawObject["keywords"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        license = rawObject["license"]?.let { json.decodeFromJsonElement<String>(it) },
        main = rawObject["main"]?.let { json.decodeFromJsonElement<String>(it) },
        maintainers = rawObject["maintainers"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        man = rawObject["man"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        nodeVersion = rawObject["node_version"]?.let { json.decodeFromJsonElement<String>(it) },
        npmUser = rawObject["npm_user"]?.let { json.decodeFromJsonElement<String>(it) },
        npmVersion = rawObject["npm_version"]?.let { json.decodeFromJsonElement<String>(it) },
        optionalDependencies = rawObject["optional_dependencies"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        os = rawObject["os"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        peerDependencies = rawObject["peer_dependencies"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        publishedViaActions = rawObject["published_via_actions"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        readme = rawObject["readme"]?.let { json.decodeFromJsonElement<String>(it) },
        releaseId = rawObject["release_id"]?.let { json.decodeFromJsonElement<Int>(it) },
        repository = rawObject["repository"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookRegistryPackae13fRegistryPackagePackageVersionRepositoryXc26154e4?>(element) },
        scripts = rawObject["scripts"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        version = rawObject["version"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRegistryPackae13fRegistryPackagePackageVersionNpmMetadataXe29b0c80) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookRegistryPackae13fRegistryPackagePackageVersionNpmMetadataXe29b0c80")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.author?.let { put("author", json.encodeToJsonElement(it)) }
        value.bin?.let { put("bin", json.encodeToJsonElement(it)) }
        value.bugs?.let { put("bugs", json.encodeToJsonElement(it)) }
        value.commitOid?.let { put("commit_oid", it) }
        value.contributors?.let { put("contributors", json.encodeToJsonElement(it)) }
        value.cpu?.let { put("cpu", json.encodeToJsonElement(it)) }
        value.deletedById?.let { put("deleted_by_id", json.encodeToJsonElement(it)) }
        value.dependencies?.let { put("dependencies", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.devDependencies?.let { put("dev_dependencies", json.encodeToJsonElement(it)) }
        value.directories?.let { put("directories", json.encodeToJsonElement(it)) }
        value.dist?.let { put("dist", json.encodeToJsonElement(it)) }
        value.engines?.let { put("engines", json.encodeToJsonElement(it)) }
        value.files?.let { put("files", json.encodeToJsonElement(it)) }
        value.gitHead?.let { put("git_head", it) }
        value.hasShrinkwrap?.let { put("has_shrinkwrap", json.encodeToJsonElement(it)) }
        value.homepage?.let { put("homepage", it) }
        value.id?.let { put("id", it) }
        value.installationCommand?.let { put("installation_command", it) }
        value.keywords?.let { put("keywords", json.encodeToJsonElement(it)) }
        value.license?.let { put("license", it) }
        value.main?.let { put("main", it) }
        value.maintainers?.let { put("maintainers", json.encodeToJsonElement(it)) }
        value.man?.let { put("man", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", it) }
        value.nodeVersion?.let { put("node_version", it) }
        value.npmUser?.let { put("npm_user", it) }
        value.npmVersion?.let { put("npm_version", it) }
        value.optionalDependencies?.let { put("optional_dependencies", json.encodeToJsonElement(it)) }
        value.os?.let { put("os", json.encodeToJsonElement(it)) }
        value.peerDependencies?.let { put("peer_dependencies", json.encodeToJsonElement(it)) }
        value.publishedViaActions?.let { put("published_via_actions", json.encodeToJsonElement(it)) }
        value.readme?.let { put("readme", it) }
        value.releaseId?.let { put("release_id", json.encodeToJsonElement(it)) }
        value.repository?.let { put("repository", json.encodeToJsonElement(it)) }
        value.scripts?.let { put("scripts", json.encodeToJsonElement(it)) }
        value.version?.let { put("version", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookRegistryPackae13fRegistryPackagePackageVersionNpmMetadataXe29b0c80(block: InlineWebhookRegistryPackae13fRegistryPackagePackageVersionNpmMetadataXe29b0c80.Builder.() -> Unit): InlineWebhookRegistryPackae13fRegistryPackagePackageVersionNpmMetadataXe29b0c80 = InlineWebhookRegistryPackae13fRegistryPackagePackageVersionNpmMetadataXe29b0c80.build(block)
