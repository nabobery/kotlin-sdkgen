package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-package-published/properties/package/properties/package_vers
 * ion.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-package-published/properties/package/properties/package_vers
 * ion
 */
@Serializable(with = InlineWebhookPackagePublishedPackageValuePackageVersionXc920f572.Serializer::class)
public class InlineWebhookPackagePublishedPackageValuePackageVersionXc920f572(
  public val description: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  public val id: Int,
  public val installationCommand: String,
  metadata: List<JsonObject>,
  public val name: String,
  packageFiles: List<InlineWebhookPackagePublishedPackageValuePackageVersionPackageFilesItemX3373b219>,
  public val summary: String,
  public val version: String,
  public val author: InlineWebhookPackagePublishedPackageValuePackageVersionAuthorX195921f4? = null,
  public val body: InlineWebhookPackagePublishedPackageValuePackageVersionBodyX818e1c51? = null,
  public val bodyHtml: String? = null,
  public val containerMetadata:
      InlineWebhookPackagePublishedPackageValueContainerMetadataXe4cb5d41? = null,
  public val createdAt: String? = null,
  dockerMetadata: List<InlineWebhookPackagePublishedPackageValuePackageVersionItemXc38789f8>? = null,
  public val draft: Boolean? = null,
  public val manifest: String? = null,
  public val npmMetadata:
      InlineWebhookPackagePublishedPackageValuePackageVersionNpmMetadataX632456a4? = null,
  nugetMetadata: List<InlineWebhookPackagePublishedPackageValuePackageVersionItemX9682c308>? = null,
  public val packageUrl: String? = null,
  public val prerelease: Boolean? = null,
  public val release:
      InlineWebhookPackagePublishedPackageValuePackageVersionReleaseX515b6b9b? = null,
  rubygemsMetadata: List<WebhookRubygemsMetadata>? = null,
  public val sourceUrl: String? = null,
  public val tagName: String? = null,
  public val targetCommitish: String? = null,
  public val targetOid: String? = null,
  public val updatedAt: String? = null,
) {
  public val metadata: List<JsonObject> = metadata.toList()

  public val packageFiles:
      List<InlineWebhookPackagePublishedPackageValuePackageVersionPackageFilesItemX3373b219> =
      packageFiles.toList()

  public val dockerMetadata:
      List<InlineWebhookPackagePublishedPackageValuePackageVersionItemXc38789f8>? =
      dockerMetadata?.let { collection0 -> collection0.toList() }

  public val nugetMetadata:
      List<InlineWebhookPackagePublishedPackageValuePackageVersionItemX9682c308>? =
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
        List<InlineWebhookPackagePublishedPackageValuePackageVersionPackageFilesItemX3373b219>? =
        null

    public var packageFiles:
        List<InlineWebhookPackagePublishedPackageValuePackageVersionPackageFilesItemX3373b219>
      get() = requireNotNull(packageFilesValue) { "packageFiles is required" }.toList()
      set(`value`) {
        packageFilesValue = value.toList()
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

    public var author: InlineWebhookPackagePublishedPackageValuePackageVersionAuthorX195921f4? =
        null

    public var body: InlineWebhookPackagePublishedPackageValuePackageVersionBodyX818e1c51? = null

    public var bodyHtml: String? = null

    public var containerMetadata:
        InlineWebhookPackagePublishedPackageValueContainerMetadataXe4cb5d41? = null

    public var createdAt: String? = null

    private var dockerMetadataValue:
        List<InlineWebhookPackagePublishedPackageValuePackageVersionItemXc38789f8>? = null

    public var dockerMetadata:
        List<InlineWebhookPackagePublishedPackageValuePackageVersionItemXc38789f8>?
      get() = dockerMetadataValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        dockerMetadataValue = value?.let { collection0 -> collection0.toList() }
      }

    public var draft: Boolean? = null

    public var manifest: String? = null

    public var npmMetadata:
        InlineWebhookPackagePublishedPackageValuePackageVersionNpmMetadataX632456a4? = null

    private var nugetMetadataValue:
        List<InlineWebhookPackagePublishedPackageValuePackageVersionItemX9682c308>? = null

    public var nugetMetadata:
        List<InlineWebhookPackagePublishedPackageValuePackageVersionItemX9682c308>?
      get() = nugetMetadataValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        nugetMetadataValue = value?.let { collection0 -> collection0.toList() }
      }

    public var packageUrl: String? = null

    public var prerelease: Boolean? = null

    public var release: InlineWebhookPackagePublishedPackageValuePackageVersionReleaseX515b6b9b? =
        null

    private var rubygemsMetadataValue: List<WebhookRubygemsMetadata>? = null

    public var rubygemsMetadata: List<WebhookRubygemsMetadata>?
      get() = rubygemsMetadataValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        rubygemsMetadataValue = value?.let { collection0 -> collection0.toList() }
      }

    public var sourceUrl: String? = null

    public var tagName: String? = null

    public var targetCommitish: String? = null

    public var targetOid: String? = null

    public var updatedAt: String? = null

    public fun build(): InlineWebhookPackagePublishedPackageValuePackageVersionXc920f572 {
      check(descriptionValue != null) { "description is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(installationCommandValue != null) { "installationCommand is required" }
      check(metadataValue != null) { "metadata is required" }
      check(nameValue != null) { "name is required" }
      check(packageFilesValue != null) { "packageFiles is required" }
      check(summaryValue != null) { "summary is required" }
      check(versionValue != null) { "version is required" }
      return InlineWebhookPackagePublishedPackageValuePackageVersionXc920f572(
        description = description,
        htmlUrl = htmlUrl,
        id = id,
        installationCommand = installationCommand,
        metadata = metadata,
        name = name,
        packageFiles = packageFiles,
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
        packageUrl = packageUrl,
        prerelease = prerelease,
        release = release,
        rubygemsMetadata = rubygemsMetadata,
        sourceUrl = sourceUrl,
        tagName = tagName,
        targetCommitish = targetCommitish,
        targetOid = targetOid,
        updatedAt = updatedAt,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPackagePublishedPackageValuePackageVersionXc920f572 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPackagePublishedPackageValuePackageVersionXc920f572> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPackagePublishedPackageValuePackageVersionXc920f572 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPackagePublishedPackageValuePackageVersionXc920f572")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPackagePublishedPackageValuePackageVersionXc920f572 must be a JSON object")
      val description = json.decodeRequired<String>(rawObject, "description")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val installationCommand = json.decodeRequired<String>(rawObject, "installation_command")
      val metadata = json.decodeRequired<List<JsonObject>>(rawObject, "metadata")
      val name = json.decodeRequired<String>(rawObject, "name")
      val packageFiles = json.decodeRequired<List<InlineWebhookPackagePublishedPackageValuePackageVersionPackageFilesItemX3373b219>>(rawObject, "package_files")
      val summary = json.decodeRequired<String>(rawObject, "summary")
      val version = json.decodeRequired<String>(rawObject, "version")
      return InlineWebhookPackagePublishedPackageValuePackageVersionXc920f572(
        description = description,
        htmlUrl = htmlUrl,
        id = id,
        installationCommand = installationCommand,
        metadata = metadata,
        name = name,
        packageFiles = packageFiles,
        summary = summary,
        version = version,
        author = rawObject["author"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookPackagePublishedPackageValuePackageVersionAuthorX195921f4?>(element) },
        body = rawObject["body"]?.let { json.decodeFromJsonElement<InlineWebhookPackagePublishedPackageValuePackageVersionBodyX818e1c51>(it) },
        bodyHtml = rawObject["body_html"]?.let { json.decodeFromJsonElement<String>(it) },
        containerMetadata = rawObject["container_metadata"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookPackagePublishedPackageValueContainerMetadataXe4cb5d41?>(element) },
        createdAt = rawObject["created_at"]?.let { json.decodeFromJsonElement<String>(it) },
        dockerMetadata = rawObject["docker_metadata"]?.let { json.decodeFromJsonElement<List<InlineWebhookPackagePublishedPackageValuePackageVersionItemXc38789f8>>(it) },
        draft = rawObject["draft"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        manifest = rawObject["manifest"]?.let { json.decodeFromJsonElement<String>(it) },
        npmMetadata = rawObject["npm_metadata"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookPackagePublishedPackageValuePackageVersionNpmMetadataX632456a4?>(element) },
        nugetMetadata = rawObject["nuget_metadata"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlineWebhookPackagePublishedPackageValuePackageVersionItemX9682c308>?>(element) },
        packageUrl = rawObject["package_url"]?.let { json.decodeFromJsonElement<String>(it) },
        prerelease = rawObject["prerelease"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        release = rawObject["release"]?.let { json.decodeFromJsonElement<InlineWebhookPackagePublishedPackageValuePackageVersionReleaseX515b6b9b>(it) },
        rubygemsMetadata = rawObject["rubygems_metadata"]?.let { json.decodeFromJsonElement<List<WebhookRubygemsMetadata>>(it) },
        sourceUrl = rawObject["source_url"]?.let { json.decodeFromJsonElement<String>(it) },
        tagName = rawObject["tag_name"]?.let { json.decodeFromJsonElement<String>(it) },
        targetCommitish = rawObject["target_commitish"]?.let { json.decodeFromJsonElement<String>(it) },
        targetOid = rawObject["target_oid"]?.let { json.decodeFromJsonElement<String>(it) },
        updatedAt = rawObject["updated_at"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPackagePublishedPackageValuePackageVersionXc920f572) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPackagePublishedPackageValuePackageVersionXc920f572")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("description", value.description)
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("installation_command", value.installationCommand)
        put("metadata", json.encodeToJsonElement(value.metadata))
        put("name", value.name)
        put("package_files", json.encodeToJsonElement(value.packageFiles))
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
        value.packageUrl?.let { put("package_url", it) }
        value.prerelease?.let { put("prerelease", json.encodeToJsonElement(it)) }
        value.release?.let { put("release", json.encodeToJsonElement(it)) }
        value.rubygemsMetadata?.let { put("rubygems_metadata", json.encodeToJsonElement(it)) }
        value.sourceUrl?.let { put("source_url", it) }
        value.tagName?.let { put("tag_name", it) }
        value.targetCommitish?.let { put("target_commitish", it) }
        value.targetOid?.let { put("target_oid", it) }
        value.updatedAt?.let { put("updated_at", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPackagePublishedPackageValuePackageVersionXc920f572(block: InlineWebhookPackagePublishedPackageValuePackageVersionXc920f572.Builder.() -> Unit): InlineWebhookPackagePublishedPackageValuePackageVersionXc920f572 = InlineWebhookPackagePublishedPackageValuePackageVersionXc920f572.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPackagePublishedPackageValuePackageVersionXc920f572 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
