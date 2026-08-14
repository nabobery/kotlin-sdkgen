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
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-package-updated/properties/package/properties/package_versio
 * n.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-package-updated/properties/package/properties/package_versio
 * n
 */
@Serializable(with = InlineWebhookPackageUpdatedPackageValuePackageVersionXcc1730e4.Serializer::class)
public class InlineWebhookPackageUpdatedPackageValuePackageVersionXcc1730e4 internal constructor(
  public val author: InlineWebhookPackageUpdatedPackageValuePackageVersionAuthorXc95b9766?,
  public val body: String,
  public val bodyHtml: String,
  public val createdAt: String,
  public val description: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  public val id: Int,
  public val installationCommand: String,
  metadata: List<JsonObject>,
  public val name: String,
  packageFiles: List<InlineWebhookPackageUpdatedPackageValuePackageVersionPackageFilesItemX40888bf4>,
  public val summary: String,
  public val targetCommitish: String,
  public val targetOid: String,
  public val updatedAt: String,
  public val version: String,
  dockerMetadataState: FieldState<List<InlineWebhookPackageUpdatedPackageValuePackageVersionDockerMetadataItemX87288dd4>>,
  private val draftState: FieldState<Boolean>,
  private val manifestState: FieldState<String>,
  private val packageUrlState: FieldState<String>,
  private val prereleaseState: FieldState<Boolean>,
  private val releaseState:
      FieldState<InlineWebhookPackageUpdatedPackageValuePackageVersionReleaseX29aadf22>,
  rubygemsMetadataState: FieldState<List<WebhookRubygemsMetadata>>,
  private val sourceUrlState: FieldState<String>,
  private val tagNameState: FieldState<String>,
) {
  public val metadata: List<JsonObject> = metadata.toList()

  public val packageFiles:
      List<InlineWebhookPackageUpdatedPackageValuePackageVersionPackageFilesItemX40888bf4> =
      packageFiles.toList()

  private val dockerMetadataState:
      FieldState<List<InlineWebhookPackageUpdatedPackageValuePackageVersionDockerMetadataItemX87288dd4>>
      = dockerMetadataState.copyValue { fieldValue -> fieldValue.toList() }

  private val rubygemsMetadataState: FieldState<List<WebhookRubygemsMetadata>> =
      rubygemsMetadataState.copyValue { fieldValue -> fieldValue.toList() }

  public val dockerMetadata:
      List<InlineWebhookPackageUpdatedPackageValuePackageVersionDockerMetadataItemX87288dd4>?
    get() = dockerMetadataState.valueOrNull()

  public val draft: Boolean?
    get() = draftState.valueOrNull()

  public val manifest: String?
    get() = manifestState.valueOrNull()

  public val packageUrl: String?
    get() = packageUrlState.valueOrNull()

  public val prerelease: Boolean?
    get() = prereleaseState.valueOrNull()

  public val release: InlineWebhookPackageUpdatedPackageValuePackageVersionReleaseX29aadf22?
    get() = releaseState.valueOrNull()

  public val rubygemsMetadata: List<WebhookRubygemsMetadata>?
    get() = rubygemsMetadataState.valueOrNull()

  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val sourceUrl: String?
    get() = sourceUrlState.valueOrNull()

  public val tagName: String?
    get() = tagNameState.valueOrNull()

  public constructor(
    author: InlineWebhookPackageUpdatedPackageValuePackageVersionAuthorXc95b9766?,
    body: String,
    bodyHtml: String,
    createdAt: String,
    description: String,
    htmlUrl: String,
    id: Int,
    installationCommand: String,
    metadata: List<JsonObject>,
    name: String,
    packageFiles: List<InlineWebhookPackageUpdatedPackageValuePackageVersionPackageFilesItemX40888bf4>,
    summary: String,
    targetCommitish: String,
    targetOid: String,
    updatedAt: String,
    version: String,
  ) : this(author = author,
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
  summary = summary,
  targetCommitish = targetCommitish,
  targetOid = targetOid,
  updatedAt = updatedAt,
  version = version,
  dockerMetadataState = FieldState.Absent,
  draftState = FieldState.Absent,
  manifestState = FieldState.Absent,
  packageUrlState = FieldState.Absent,
  prereleaseState = FieldState.Absent,
  releaseState = FieldState.Absent,
  rubygemsMetadataState = FieldState.Absent,
  sourceUrlState = FieldState.Absent,
  tagNameState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `docker_metadata`.
   */
  public fun dockerMetadataPresence(): FieldPresence = dockerMetadataState.presence

  /**
   * Returns the wire presence of `draft`.
   */
  public fun draftPresence(): FieldPresence = draftState.presence

  /**
   * Returns the wire presence of `manifest`.
   */
  public fun manifestPresence(): FieldPresence = manifestState.presence

  /**
   * Returns the wire presence of `package_url`.
   */
  public fun packageUrlPresence(): FieldPresence = packageUrlState.presence

  /**
   * Returns the wire presence of `prerelease`.
   */
  public fun prereleasePresence(): FieldPresence = prereleaseState.presence

  /**
   * Returns the wire presence of `release`.
   */
  public fun releasePresence(): FieldPresence = releaseState.presence

  /**
   * Returns the wire presence of `rubygems_metadata`.
   */
  public fun rubygemsMetadataPresence(): FieldPresence = rubygemsMetadataState.presence

  /**
   * Returns the wire presence of `source_url`.
   */
  public fun sourceUrlPresence(): FieldPresence = sourceUrlState.presence

  /**
   * Returns the wire presence of `tag_name`.
   */
  public fun tagNamePresence(): FieldPresence = tagNameState.presence

  public class Builder {
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
        List<InlineWebhookPackageUpdatedPackageValuePackageVersionPackageFilesItemX40888bf4>? = null

    public var packageFiles:
        List<InlineWebhookPackageUpdatedPackageValuePackageVersionPackageFilesItemX40888bf4>
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

    private var authorState:
        FieldState<InlineWebhookPackageUpdatedPackageValuePackageVersionAuthorXc95b9766?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var author: InlineWebhookPackageUpdatedPackageValuePackageVersionAuthorXc95b9766?
      get() = authorState.valueOrNull()
      set(`value`) {
        authorState = value.toNullableFieldState()
      }

    private var dockerMetadataState:
        FieldState<List<InlineWebhookPackageUpdatedPackageValuePackageVersionDockerMetadataItemX87288dd4>>
        = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var dockerMetadata:
        List<InlineWebhookPackageUpdatedPackageValuePackageVersionDockerMetadataItemX87288dd4>?
      get() = dockerMetadataState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "dockerMetadata is not nullable; call unsetDockerMetadata() to omit it" }
        dockerMetadataState = FieldState.Value(present.toList())
      }

    private var draftState: FieldState<Boolean> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var draft: Boolean?
      get() = draftState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "draft is not nullable; call unsetDraft() to omit it" }
        draftState = FieldState.Value(present)
      }

    private var manifestState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var manifest: String?
      get() = manifestState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "manifest is not nullable; call unsetManifest() to omit it" }
        manifestState = FieldState.Value(present)
      }

    private var packageUrlState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var packageUrl: String?
      get() = packageUrlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "packageUrl is not nullable; call unsetPackageUrl() to omit it" }
        packageUrlState = FieldState.Value(present)
      }

    private var prereleaseState: FieldState<Boolean> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var prerelease: Boolean?
      get() = prereleaseState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "prerelease is not nullable; call unsetPrerelease() to omit it" }
        prereleaseState = FieldState.Value(present)
      }

    private var releaseState:
        FieldState<InlineWebhookPackageUpdatedPackageValuePackageVersionReleaseX29aadf22> =
        FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var release: InlineWebhookPackageUpdatedPackageValuePackageVersionReleaseX29aadf22?
      get() = releaseState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "release is not nullable; call unsetRelease() to omit it" }
        releaseState = FieldState.Value(present)
      }

    private var rubygemsMetadataState: FieldState<List<WebhookRubygemsMetadata>> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var rubygemsMetadata: List<WebhookRubygemsMetadata>?
      get() = rubygemsMetadataState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "rubygemsMetadata is not nullable; call unsetRubygemsMetadata() to omit it" }
        rubygemsMetadataState = FieldState.Value(present.toList())
      }

    private var sourceUrlState: FieldState<String> = FieldState.Absent

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var sourceUrl: String?
      get() = sourceUrlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "sourceUrl is not nullable; call unsetSourceUrl() to omit it" }
        sourceUrlState = FieldState.Value(present)
      }

    private var tagNameState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var tagName: String?
      get() = tagNameState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "tagName is not nullable; call unsetTagName() to omit it" }
        tagNameState = FieldState.Value(present)
      }

    /**
     * Omits `docker_metadata` from serialized output.
     */
    public fun unsetDockerMetadata() {
      dockerMetadataState = FieldState.Absent
    }

    /**
     * Omits `draft` from serialized output.
     */
    public fun unsetDraft() {
      draftState = FieldState.Absent
    }

    /**
     * Omits `manifest` from serialized output.
     */
    public fun unsetManifest() {
      manifestState = FieldState.Absent
    }

    /**
     * Omits `package_url` from serialized output.
     */
    public fun unsetPackageUrl() {
      packageUrlState = FieldState.Absent
    }

    /**
     * Omits `prerelease` from serialized output.
     */
    public fun unsetPrerelease() {
      prereleaseState = FieldState.Absent
    }

    /**
     * Omits `release` from serialized output.
     */
    public fun unsetRelease() {
      releaseState = FieldState.Absent
    }

    /**
     * Omits `rubygems_metadata` from serialized output.
     */
    public fun unsetRubygemsMetadata() {
      rubygemsMetadataState = FieldState.Absent
    }

    /**
     * Omits `source_url` from serialized output.
     */
    public fun unsetSourceUrl() {
      sourceUrlState = FieldState.Absent
    }

    /**
     * Omits `tag_name` from serialized output.
     */
    public fun unsetTagName() {
      tagNameState = FieldState.Absent
    }

    public fun build(): InlineWebhookPackageUpdatedPackageValuePackageVersionXcc1730e4 {
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
      check(summaryValue != null) { "summary is required" }
      check(targetCommitishValue != null) { "targetCommitish is required" }
      check(targetOidValue != null) { "targetOid is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(versionValue != null) { "version is required" }
      check(authorState !== FieldState.Absent) { "author is required, even when null" }
      return InlineWebhookPackageUpdatedPackageValuePackageVersionXcc1730e4(
        author = authorState.valueOrNull(),
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
        summary = summary,
        targetCommitish = targetCommitish,
        targetOid = targetOid,
        updatedAt = updatedAt,
        version = version,
        dockerMetadataState = dockerMetadataState,
        draftState = draftState,
        manifestState = manifestState,
        packageUrlState = packageUrlState,
        prereleaseState = prereleaseState,
        releaseState = releaseState,
        rubygemsMetadataState = rubygemsMetadataState,
        sourceUrlState = sourceUrlState,
        tagNameState = tagNameState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPackageUpdatedPackageValuePackageVersionXcc1730e4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPackageUpdatedPackageValuePackageVersionXcc1730e4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPackageUpdatedPackageValuePackageVersionXcc1730e4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPackageUpdatedPackageValuePackageVersionXcc1730e4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPackageUpdatedPackageValuePackageVersionXcc1730e4 must be a JSON object")
      val body = json.decodeRequired<String>(rawObject, "body")
      val bodyHtml = json.decodeRequired<String>(rawObject, "body_html")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val description = json.decodeRequired<String>(rawObject, "description")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val installationCommand = json.decodeRequired<String>(rawObject, "installation_command")
      val metadata = json.decodeRequired<List<JsonObject>>(rawObject, "metadata")
      val name = json.decodeRequired<String>(rawObject, "name")
      val packageFiles = json.decodeRequired<List<InlineWebhookPackageUpdatedPackageValuePackageVersionPackageFilesItemX40888bf4>>(rawObject, "package_files")
      val summary = json.decodeRequired<String>(rawObject, "summary")
      val targetCommitish = json.decodeRequired<String>(rawObject, "target_commitish")
      val targetOid = json.decodeRequired<String>(rawObject, "target_oid")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val version = json.decodeRequired<String>(rawObject, "version")
      if (!rawObject.containsKey("author")) {
        throw SerializationException("InlineWebhookPackageUpdatedPackageValuePackageVersionXcc1730e4 is missing required property 'author'")
      }
      val author = rawObject["author"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookPackageUpdatedPackageValuePackageVersionAuthorXc95b9766?>(requireNotNull(element)) }
      return InlineWebhookPackageUpdatedPackageValuePackageVersionXcc1730e4(
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
        summary = summary,
        targetCommitish = targetCommitish,
        targetOid = targetOid,
        updatedAt = updatedAt,
        version = version,
        dockerMetadataState = json.decodeOptional(rawObject, "docker_metadata", nullable = false),
        draftState = json.decodeOptional(rawObject, "draft", nullable = false),
        manifestState = json.decodeOptional(rawObject, "manifest", nullable = false),
        packageUrlState = json.decodeOptional(rawObject, "package_url", nullable = false),
        prereleaseState = json.decodeOptional(rawObject, "prerelease", nullable = false),
        releaseState = json.decodeOptional(rawObject, "release", nullable = false),
        rubygemsMetadataState = json.decodeOptional(rawObject, "rubygems_metadata", nullable = false),
        sourceUrlState = json.decodeOptional(rawObject, "source_url", nullable = false),
        tagNameState = json.decodeOptional(rawObject, "tag_name", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPackageUpdatedPackageValuePackageVersionXcc1730e4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPackageUpdatedPackageValuePackageVersionXcc1730e4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("author", value.author?.let { json.encodeToJsonElement(it) } ?: JsonNull)
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
        put("summary", value.summary)
        put("target_commitish", value.targetCommitish)
        put("target_oid", value.targetOid)
        put("updated_at", value.updatedAt)
        put("version", value.version)
        putState("docker_metadata", value.dockerMetadataState, json::encodeToJsonElement)
        putState("draft", value.draftState, json::encodeToJsonElement)
        putState("manifest", value.manifestState, json::encodeToJsonElement)
        putState("package_url", value.packageUrlState, json::encodeToJsonElement)
        putState("prerelease", value.prereleaseState, json::encodeToJsonElement)
        putState("release", value.releaseState, json::encodeToJsonElement)
        putState("rubygems_metadata", value.rubygemsMetadataState, json::encodeToJsonElement)
        putState("source_url", value.sourceUrlState, json::encodeToJsonElement)
        putState("tag_name", value.tagNameState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPackageUpdatedPackageValuePackageVersionXcc1730e4(block: InlineWebhookPackageUpdatedPackageValuePackageVersionXcc1730e4.Builder.() -> Unit): InlineWebhookPackageUpdatedPackageValuePackageVersionXcc1730e4 = InlineWebhookPackageUpdatedPackageValuePackageVersionXcc1730e4.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPackageUpdatedPackageValuePackageVersionXcc1730e4 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <T> FieldState<T>.copyValue(copy: (T) -> T): FieldState<T> = when (this) {
  FieldState.Absent -> this
  FieldState.Null -> this
  is FieldState.Value -> FieldState.Value(copy(value))
}

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineWebhookPackageUpdatedPackageValuePackageVersionXcc1730e4 property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}
