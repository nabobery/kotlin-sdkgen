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
import kotlinx.serialization.json.Json
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
 * rties/package_version.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-registry-package-published/properties/registry_package/prope
 * rties/package_version
 */
@Serializable(with = InlineWebhookRegistryPackagePublishedRegistryPackagePackageVersionXf3820ae7.Serializer::class)
public class InlineWebhookRegistryPackagePublishedRegistryPackagePackageVersionXf3820ae7(
  public val description: String,
  public val htmlUrl: String,
  public val id: Int,
  public val installationCommand: String,
  metadata: List<JsonObject>,
  public val name: String,
  packageFiles: List<InlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemXdf6f91e8>,
  public val packageUrl: String,
  public val summary: String,
  public val version: String,
  public val author:
      InlineWebhookRegistryPackae13fRegistryPackagePackageVersionAuthorXe4d0e77b? = null,
  public val body:
      InlineWebhookRegistryPackagePublishedRegistryPackagePackageVersionBodyXa8cf66ac? = null,
  public val bodyHtml: String? = null,
  public val containerMetadata:
      InlineWebhookRegistryPackae13fRegistryPackageContainerMetadataXfd3b6a1c? = null,
  public val createdAt: String? = null,
  dockerMetadata: List<InlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemX7a7cbe99>? = null,
  public val draft: Boolean? = null,
  public val manifest: String? = null,
  public val npmMetadata:
      InlineWebhookRegistryPackae13fRegistryPackagePackageVersionNpmMetadataXe29b0c80? = null,
  nugetMetadata: List<InlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemXbb545c97>? = null,
  public val prerelease: Boolean? = null,
  public val release:
      InlineWebhookRegistryPackae13fRegistryPackagePackageVersionReleaseX30c88b57? = null,
  rubygemsMetadata: List<WebhookRubygemsMetadata>? = null,
  public val tagName: String? = null,
  public val targetCommitish: String? = null,
  public val targetOid: String? = null,
  public val updatedAt: String? = null,
) {
  public val metadata: List<JsonObject> = metadata.toList()

  public val packageFiles:
      List<InlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemXdf6f91e8> =
      packageFiles.toList()

  public val dockerMetadata:
      List<InlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemX7a7cbe99>? =
      dockerMetadata?.let { collection0 -> collection0.toList() }

  public val nugetMetadata:
      List<InlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemXbb545c97>? =
      nugetMetadata?.let { collection0 -> collection0.toList() }

  public val rubygemsMetadata: List<WebhookRubygemsMetadata>? =
      rubygemsMetadata?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var descriptionValue: String? = null

    public var description: String
      get() = requireNotNull(descriptionValue) { "description is required" }
      set(`value`) {
        descriptionValue = value
      }

    private var htmlUrlValue: String? = null

    public var htmlUrl: String
      get() = requireNotNull(htmlUrlValue) { "htmlUrl is required" }
      set(`value`) {
        htmlUrlValue = value
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var installationCommandValue: String? = null

    public var installationCommand: String
      get() = requireNotNull(installationCommandValue) { "installationCommand is required" }
      set(`value`) {
        installationCommandValue = value
      }

    private var metadataValue: List<JsonObject>? = null

    public var metadata: List<JsonObject>
      get() = requireNotNull(metadataValue) { "metadata is required" }.toList()
      set(`value`) {
        metadataValue = value.toList()
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var packageFilesValue:
        List<InlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemXdf6f91e8>? = null

    public var packageFiles:
        List<InlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemXdf6f91e8>
      get() = requireNotNull(packageFilesValue) { "packageFiles is required" }.toList()
      set(`value`) {
        packageFilesValue = value.toList()
      }

    private var packageUrlValue: String? = null

    public var packageUrl: String
      get() = requireNotNull(packageUrlValue) { "packageUrl is required" }
      set(`value`) {
        packageUrlValue = value
      }

    private var summaryValue: String? = null

    public var summary: String
      get() = requireNotNull(summaryValue) { "summary is required" }
      set(`value`) {
        summaryValue = value
      }

    private var versionValue: String? = null

    public var version: String
      get() = requireNotNull(versionValue) { "version is required" }
      set(`value`) {
        versionValue = value
      }

    public var author: InlineWebhookRegistryPackae13fRegistryPackagePackageVersionAuthorXe4d0e77b? =
        null

    public var body:
        InlineWebhookRegistryPackagePublishedRegistryPackagePackageVersionBodyXa8cf66ac? = null

    public var bodyHtml: String? = null

    public var containerMetadata:
        InlineWebhookRegistryPackae13fRegistryPackageContainerMetadataXfd3b6a1c? = null

    public var createdAt: String? = null

    private var dockerMetadataValue:
        List<InlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemX7a7cbe99>? = null

    public var dockerMetadata:
        List<InlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemX7a7cbe99>?
      get() = dockerMetadataValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        dockerMetadataValue = value?.let { collection0 -> collection0.toList() }
      }

    public var draft: Boolean? = null

    public var manifest: String? = null

    public var npmMetadata:
        InlineWebhookRegistryPackae13fRegistryPackagePackageVersionNpmMetadataXe29b0c80? = null

    private var nugetMetadataValue:
        List<InlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemXbb545c97>? = null

    public var nugetMetadata:
        List<InlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemXbb545c97>?
      get() = nugetMetadataValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        nugetMetadataValue = value?.let { collection0 -> collection0.toList() }
      }

    public var prerelease: Boolean? = null

    public var release: InlineWebhookRegistryPackae13fRegistryPackagePackageVersionReleaseX30c88b57?
        = null

    private var rubygemsMetadataValue: List<WebhookRubygemsMetadata>? = null

    public var rubygemsMetadata: List<WebhookRubygemsMetadata>?
      get() = rubygemsMetadataValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        rubygemsMetadataValue = value?.let { collection0 -> collection0.toList() }
      }

    public var tagName: String? = null

    public var targetCommitish: String? = null

    public var targetOid: String? = null

    public var updatedAt: String? = null

    public fun build(): InlineWebhookRegistryPackagePublishedRegistryPackagePackageVersionXf3820ae7 {
      check(descriptionValue != null) { "description is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(installationCommandValue != null) { "installationCommand is required" }
      check(metadataValue != null) { "metadata is required" }
      check(nameValue != null) { "name is required" }
      check(packageFilesValue != null) { "packageFiles is required" }
      check(packageUrlValue != null) { "packageUrl is required" }
      check(summaryValue != null) { "summary is required" }
      check(versionValue != null) { "version is required" }
      return InlineWebhookRegistryPackagePublishedRegistryPackagePackageVersionXf3820ae7(
        description = description,
        htmlUrl = htmlUrl,
        id = id,
        installationCommand = installationCommand,
        metadata = metadata,
        name = name,
        packageFiles = packageFiles,
        packageUrl = packageUrl,
        summary = summary,
        version = version,
        author = author,
        body = body,
        bodyHtml = bodyHtml,
        containerMetadata = containerMetadata,
        createdAt = createdAt,
        dockerMetadata = dockerMetadata,
        draft = draft,
        manifest = manifest,
        npmMetadata = npmMetadata,
        nugetMetadata = nugetMetadata,
        prerelease = prerelease,
        release = release,
        rubygemsMetadata = rubygemsMetadata,
        tagName = tagName,
        targetCommitish = targetCommitish,
        targetOid = targetOid,
        updatedAt = updatedAt,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookRegistryPackagePublishedRegistryPackagePackageVersionXf3820ae7 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookRegistryPackagePublishedRegistryPackagePackageVersionXf3820ae7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookRegistryPackagePublishedRegistryPackagePackageVersionXf3820ae7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookRegistryPackagePublishedRegistryPackagePackageVersionXf3820ae7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookRegistryPackagePublishedRegistryPackagePackageVersionXf3820ae7 must be a JSON object")
      val description = json.decodeRequired<String>(rawObject, "description")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val installationCommand = json.decodeRequired<String>(rawObject, "installation_command")
      val metadata = json.decodeRequired<List<JsonObject>>(rawObject, "metadata")
      val name = json.decodeRequired<String>(rawObject, "name")
      val packageFiles = json.decodeRequired<List<InlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemXdf6f91e8>>(rawObject, "package_files")
      val packageUrl = json.decodeRequired<String>(rawObject, "package_url")
      val summary = json.decodeRequired<String>(rawObject, "summary")
      val version = json.decodeRequired<String>(rawObject, "version")
      return InlineWebhookRegistryPackagePublishedRegistryPackagePackageVersionXf3820ae7(
        description = description,
        htmlUrl = htmlUrl,
        id = id,
        installationCommand = installationCommand,
        metadata = metadata,
        name = name,
        packageFiles = packageFiles,
        packageUrl = packageUrl,
        summary = summary,
        version = version,
        author = rawObject["author"]?.let { json.decodeFromJsonElement<InlineWebhookRegistryPackae13fRegistryPackagePackageVersionAuthorXe4d0e77b>(it) },
        body = rawObject["body"]?.let { json.decodeFromJsonElement<InlineWebhookRegistryPackagePublishedRegistryPackagePackageVersionBodyXa8cf66ac>(it) },
        bodyHtml = rawObject["body_html"]?.let { json.decodeFromJsonElement<String>(it) },
        containerMetadata = rawObject["container_metadata"]?.let { json.decodeFromJsonElement<InlineWebhookRegistryPackae13fRegistryPackageContainerMetadataXfd3b6a1c>(it) },
        createdAt = rawObject["created_at"]?.let { json.decodeFromJsonElement<String>(it) },
        dockerMetadata = rawObject["docker_metadata"]?.let { json.decodeFromJsonElement<List<InlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemX7a7cbe99>>(it) },
        draft = rawObject["draft"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        manifest = rawObject["manifest"]?.let { json.decodeFromJsonElement<String>(it) },
        npmMetadata = rawObject["npm_metadata"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookRegistryPackae13fRegistryPackagePackageVersionNpmMetadataXe29b0c80?>(element) },
        nugetMetadata = rawObject["nuget_metadata"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemXbb545c97>?>(element) },
        prerelease = rawObject["prerelease"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        release = rawObject["release"]?.let { json.decodeFromJsonElement<InlineWebhookRegistryPackae13fRegistryPackagePackageVersionReleaseX30c88b57>(it) },
        rubygemsMetadata = rawObject["rubygems_metadata"]?.let { json.decodeFromJsonElement<List<WebhookRubygemsMetadata>>(it) },
        tagName = rawObject["tag_name"]?.let { json.decodeFromJsonElement<String>(it) },
        targetCommitish = rawObject["target_commitish"]?.let { json.decodeFromJsonElement<String>(it) },
        targetOid = rawObject["target_oid"]?.let { json.decodeFromJsonElement<String>(it) },
        updatedAt = rawObject["updated_at"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRegistryPackagePublishedRegistryPackagePackageVersionXf3820ae7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookRegistryPackagePublishedRegistryPackagePackageVersionXf3820ae7")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("description", value.description)
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("installation_command", value.installationCommand)
        put("metadata", json.encodeToJsonElement(value.metadata))
        put("name", value.name)
        put("package_files", json.encodeToJsonElement(value.packageFiles))
        put("package_url", value.packageUrl)
        put("summary", value.summary)
        put("version", value.version)
        value.author?.let { put("author", json.encodeToJsonElement(it)) }
        value.body?.let { put("body", json.encodeToJsonElement(it)) }
        value.bodyHtml?.let { put("body_html", it) }
        value.containerMetadata?.let { put("container_metadata", json.encodeToJsonElement(it)) }
        value.createdAt?.let { put("created_at", it) }
        value.dockerMetadata?.let { put("docker_metadata", json.encodeToJsonElement(it)) }
        value.draft?.let { put("draft", json.encodeToJsonElement(it)) }
        value.manifest?.let { put("manifest", it) }
        value.npmMetadata?.let { put("npm_metadata", json.encodeToJsonElement(it)) }
        value.nugetMetadata?.let { put("nuget_metadata", json.encodeToJsonElement(it)) }
        value.prerelease?.let { put("prerelease", json.encodeToJsonElement(it)) }
        value.release?.let { put("release", json.encodeToJsonElement(it)) }
        value.rubygemsMetadata?.let { put("rubygems_metadata", json.encodeToJsonElement(it)) }
        value.tagName?.let { put("tag_name", it) }
        value.targetCommitish?.let { put("target_commitish", it) }
        value.targetOid?.let { put("target_oid", it) }
        value.updatedAt?.let { put("updated_at", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookRegistryPackagePublishedRegistryPackagePackageVersionXf3820ae7(block: InlineWebhookRegistryPackagePublishedRegistryPackagePackageVersionXf3820ae7.Builder.() -> Unit): InlineWebhookRegistryPackagePublishedRegistryPackagePackageVersionXf3820ae7 = InlineWebhookRegistryPackagePublishedRegistryPackagePackageVersionXf3820ae7.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookRegistryPackagePublishedRegistryPackagePackageVersionXf3820ae7 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
