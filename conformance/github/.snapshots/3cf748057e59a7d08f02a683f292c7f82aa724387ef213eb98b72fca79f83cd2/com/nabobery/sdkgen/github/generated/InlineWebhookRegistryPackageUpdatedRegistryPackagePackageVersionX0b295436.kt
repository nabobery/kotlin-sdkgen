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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-registry-package-updated/properties/registry_package/propert
 * ies/package_version.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-registry-package-updated/properties/registry_package/propert
 * ies/package_version
 */
@Serializable(with = InlineWebhookRegistryPackageUpdatedRegistryPackagePackageVersionX0b295436.Serializer::class)
public class InlineWebhookRegistryPackageUpdatedRegistryPackagePackageVersionX0b295436(
  public val author:
      InlineWebhookRegistryPackageUpdatedRegistryPackagePackageVersionAuthorX0d4067da,
  public val body: String,
  public val bodyHtml: String,
  public val createdAt: String,
  public val description: String,
  public val htmlUrl: String,
  public val id: Int,
  public val installationCommand: String,
  metadata: List<JsonObject>,
  public val name: String,
  packageFiles: List<InlineWebhookRegistryPacka3525RegistryPackagePackageVersionItemXc3992072>,
  public val packageUrl: String,
  public val summary: String,
  public val targetCommitish: String,
  public val targetOid: String,
  public val updatedAt: String,
  public val version: String,
  public val dockerMetadata:
      List<InlineWebhookRegistryPacka3525RegistryPackagePackageVersionItemX5af8e11e?>? = null,
  public val draft: Boolean? = null,
  public val manifest: String? = null,
  public val prerelease: Boolean? = null,
  public val release:
      InlineWebhookRegistryPackageUpdatedRegistryPackagePackageVersionReleaseX3ea72aba? = null,
  public val rubygemsMetadata: List<WebhookRubygemsMetadata>? = null,
  public val tagName: String? = null,
) {
  public val metadata: List<JsonObject> = metadata.toList()

  public val packageFiles:
      List<InlineWebhookRegistryPacka3525RegistryPackagePackageVersionItemXc3992072> =
      packageFiles.toList()

  public class Builder {
    private var authorValue:
        InlineWebhookRegistryPackageUpdatedRegistryPackagePackageVersionAuthorX0d4067da? = null

    public var author:
        InlineWebhookRegistryPackageUpdatedRegistryPackagePackageVersionAuthorX0d4067da
      get() = requireNotNull(authorValue) { "author is required" }
      set(`value`) {
        authorValue = value
      }

    private var bodyValue: String? = null

    public var body: String
      get() = requireNotNull(bodyValue) { "body is required" }
      set(`value`) {
        bodyValue = value
      }

    private var bodyHtmlValue: String? = null

    public var bodyHtml: String
      get() = requireNotNull(bodyHtmlValue) { "bodyHtml is required" }
      set(`value`) {
        bodyHtmlValue = value
      }

    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

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
      get() = requireNotNull(metadataValue) { "metadata is required" }
      set(`value`) {
        metadataValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var packageFilesValue:
        List<InlineWebhookRegistryPacka3525RegistryPackagePackageVersionItemXc3992072>? = null

    public var packageFiles:
        List<InlineWebhookRegistryPacka3525RegistryPackagePackageVersionItemXc3992072>
      get() = requireNotNull(packageFilesValue) { "packageFiles is required" }
      set(`value`) {
        packageFilesValue = value
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

    private var targetCommitishValue: String? = null

    public var targetCommitish: String
      get() = requireNotNull(targetCommitishValue) { "targetCommitish is required" }
      set(`value`) {
        targetCommitishValue = value
      }

    private var targetOidValue: String? = null

    public var targetOid: String
      get() = requireNotNull(targetOidValue) { "targetOid is required" }
      set(`value`) {
        targetOidValue = value
      }

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
      }

    private var versionValue: String? = null

    public var version: String
      get() = requireNotNull(versionValue) { "version is required" }
      set(`value`) {
        versionValue = value
      }

    public var dockerMetadata:
        List<InlineWebhookRegistryPacka3525RegistryPackagePackageVersionItemX5af8e11e?>? = null

    public var draft: Boolean? = null

    public var manifest: String? = null

    public var prerelease: Boolean? = null

    public var release:
        InlineWebhookRegistryPackageUpdatedRegistryPackagePackageVersionReleaseX3ea72aba? = null

    public var rubygemsMetadata: List<WebhookRubygemsMetadata>? = null

    public var tagName: String? = null

    public fun build(): InlineWebhookRegistryPackageUpdatedRegistryPackagePackageVersionX0b295436 {
      check(authorValue != null) { "author is required" }
      check(bodyValue != null) { "body is required" }
      check(bodyHtmlValue != null) { "bodyHtml is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(descriptionValue != null) { "description is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(installationCommandValue != null) { "installationCommand is required" }
      check(metadataValue != null) { "metadata is required" }
      check(nameValue != null) { "name is required" }
      check(packageFilesValue != null) { "packageFiles is required" }
      check(packageUrlValue != null) { "packageUrl is required" }
      check(summaryValue != null) { "summary is required" }
      check(targetCommitishValue != null) { "targetCommitish is required" }
      check(targetOidValue != null) { "targetOid is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(versionValue != null) { "version is required" }
      return InlineWebhookRegistryPackageUpdatedRegistryPackagePackageVersionX0b295436(
        author = author,
        body = body,
        bodyHtml = bodyHtml,
        createdAt = createdAt,
        description = description,
        htmlUrl = htmlUrl,
        id = id,
        installationCommand = installationCommand,
        metadata = metadata,
        name = name,
        packageFiles = packageFiles,
        packageUrl = packageUrl,
        summary = summary,
        targetCommitish = targetCommitish,
        targetOid = targetOid,
        updatedAt = updatedAt,
        version = version,
        dockerMetadata = dockerMetadata,
        draft = draft,
        manifest = manifest,
        prerelease = prerelease,
        release = release,
        rubygemsMetadata = rubygemsMetadata,
        tagName = tagName,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookRegistryPackageUpdatedRegistryPackagePackageVersionX0b295436 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookRegistryPackageUpdatedRegistryPackagePackageVersionX0b295436> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookRegistryPackageUpdatedRegistryPackagePackageVersionX0b295436 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookRegistryPackageUpdatedRegistryPackagePackageVersionX0b295436")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookRegistryPackageUpdatedRegistryPackagePackageVersionX0b295436 must be a JSON object")
      val author = json.decodeRequired<InlineWebhookRegistryPackageUpdatedRegistryPackagePackageVersionAuthorX0d4067da>(rawObject, "author")
      val body = json.decodeRequired<String>(rawObject, "body")
      val bodyHtml = json.decodeRequired<String>(rawObject, "body_html")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val description = json.decodeRequired<String>(rawObject, "description")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val installationCommand = json.decodeRequired<String>(rawObject, "installation_command")
      val metadata = json.decodeRequired<List<JsonObject>>(rawObject, "metadata")
      val name = json.decodeRequired<String>(rawObject, "name")
      val packageFiles = json.decodeRequired<List<InlineWebhookRegistryPacka3525RegistryPackagePackageVersionItemXc3992072>>(rawObject, "package_files")
      val packageUrl = json.decodeRequired<String>(rawObject, "package_url")
      val summary = json.decodeRequired<String>(rawObject, "summary")
      val targetCommitish = json.decodeRequired<String>(rawObject, "target_commitish")
      val targetOid = json.decodeRequired<String>(rawObject, "target_oid")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val version = json.decodeRequired<String>(rawObject, "version")
      return InlineWebhookRegistryPackageUpdatedRegistryPackagePackageVersionX0b295436(
        author = author,
        body = body,
        bodyHtml = bodyHtml,
        createdAt = createdAt,
        description = description,
        htmlUrl = htmlUrl,
        id = id,
        installationCommand = installationCommand,
        metadata = metadata,
        name = name,
        packageFiles = packageFiles,
        packageUrl = packageUrl,
        summary = summary,
        targetCommitish = targetCommitish,
        targetOid = targetOid,
        updatedAt = updatedAt,
        version = version,
        dockerMetadata = rawObject["docker_metadata"]?.let { json.decodeFromJsonElement<List<InlineWebhookRegistryPacka3525RegistryPackagePackageVersionItemX5af8e11e?>>(it) },
        draft = rawObject["draft"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        manifest = rawObject["manifest"]?.let { json.decodeFromJsonElement<String>(it) },
        prerelease = rawObject["prerelease"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        release = rawObject["release"]?.let { json.decodeFromJsonElement<InlineWebhookRegistryPackageUpdatedRegistryPackagePackageVersionReleaseX3ea72aba>(it) },
        rubygemsMetadata = rawObject["rubygems_metadata"]?.let { json.decodeFromJsonElement<List<WebhookRubygemsMetadata>>(it) },
        tagName = rawObject["tag_name"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRegistryPackageUpdatedRegistryPackagePackageVersionX0b295436) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookRegistryPackageUpdatedRegistryPackagePackageVersionX0b295436")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("author", json.encodeToJsonElement(value.author))
        put("body", value.body)
        put("body_html", value.bodyHtml)
        put("created_at", value.createdAt)
        put("description", value.description)
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("installation_command", value.installationCommand)
        put("metadata", json.encodeToJsonElement(value.metadata))
        put("name", value.name)
        put("package_files", json.encodeToJsonElement(value.packageFiles))
        put("package_url", value.packageUrl)
        put("summary", value.summary)
        put("target_commitish", value.targetCommitish)
        put("target_oid", value.targetOid)
        put("updated_at", value.updatedAt)
        put("version", value.version)
        value.dockerMetadata?.let { put("docker_metadata", json.encodeToJsonElement(it)) }
        value.draft?.let { put("draft", json.encodeToJsonElement(it)) }
        value.manifest?.let { put("manifest", it) }
        value.prerelease?.let { put("prerelease", json.encodeToJsonElement(it)) }
        value.release?.let { put("release", json.encodeToJsonElement(it)) }
        value.rubygemsMetadata?.let { put("rubygems_metadata", json.encodeToJsonElement(it)) }
        value.tagName?.let { put("tag_name", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookRegistryPackageUpdatedRegistryPackagePackageVersionX0b295436(block: InlineWebhookRegistryPackageUpdatedRegistryPackagePackageVersionX0b295436.Builder.() -> Unit): InlineWebhookRegistryPackageUpdatedRegistryPackagePackageVersionX0b295436 = InlineWebhookRegistryPackageUpdatedRegistryPackagePackageVersionX0b295436.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookRegistryPackageUpdatedRegistryPackagePackageVersionX0b295436 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
