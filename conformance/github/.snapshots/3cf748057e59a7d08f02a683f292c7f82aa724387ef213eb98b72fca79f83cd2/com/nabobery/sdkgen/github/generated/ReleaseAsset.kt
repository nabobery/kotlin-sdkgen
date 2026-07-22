package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
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
 * Data related to a release.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/release-asset
 */
@Serializable(with = ReleaseAsset.Serializer::class)
public class ReleaseAsset(
  public val browserDownloadUrl: String,
  public val contentType: String,
  public val createdAt: String,
  public val digest: String?,
  public val downloadCount: Int,
  public val id: Int,
  public val label: String?,
  /**
   * The file name of the asset.
   */
  public val name: String,
  public val nodeId: String,
  public val size: Int,
  /**
   * State of the release asset.
   */
  public val state: InlineReleaseAssetStateXa6acf425,
  public val updatedAt: String,
  public val uploader: NullableSimpleUser?,
  public val url: String,
) {
  public class Builder {
    private var browserDownloadUrlValue: String? = null

    public var browserDownloadUrl: String
      get() = requireNotNull(browserDownloadUrlValue) { "browserDownloadUrl is required" }
      set(`value`) {
        browserDownloadUrlValue = value
      }

    private var contentTypeValue: String? = null

    public var contentType: String
      get() = requireNotNull(contentTypeValue) { "contentType is required" }
      set(`value`) {
        contentTypeValue = value
      }

    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var downloadCountValue: Int? = null

    public var downloadCount: Int
      get() = requireNotNull(downloadCountValue) { "downloadCount is required" }
      set(`value`) {
        downloadCountValue = value
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var sizeValue: Int? = null

    public var size: Int
      get() = requireNotNull(sizeValue) { "size is required" }
      set(`value`) {
        sizeValue = value
      }

    private var stateValue: InlineReleaseAssetStateXa6acf425? = null

    public var state: InlineReleaseAssetStateXa6acf425
      get() = requireNotNull(stateValue) { "state is required" }
      set(`value`) {
        stateValue = value
      }

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var digestState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var digest: String?
      get() = digestState.valueOrNull()
      set(`value`) {
        digestState = value.toNullableFieldState()
      }

    private var labelState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var label: String?
      get() = labelState.valueOrNull()
      set(`value`) {
        labelState = value.toNullableFieldState()
      }

    private var uploaderState: FieldState<NullableSimpleUser?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var uploader: NullableSimpleUser?
      get() = uploaderState.valueOrNull()
      set(`value`) {
        uploaderState = value.toNullableFieldState()
      }

    public fun build(): ReleaseAsset {
      check(browserDownloadUrlValue != null) { "browserDownloadUrl is required" }
      check(contentTypeValue != null) { "contentType is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(downloadCountValue != null) { "downloadCount is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(sizeValue != null) { "size is required" }
      check(stateValue != null) { "state is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      check(digestState !== FieldState.Absent) { "digest is required, even when null" }
      check(labelState !== FieldState.Absent) { "label is required, even when null" }
      check(uploaderState !== FieldState.Absent) { "uploader is required, even when null" }
      return ReleaseAsset(
        browserDownloadUrl = browserDownloadUrl,
        contentType = contentType,
        createdAt = createdAt,
        digest = digestState.valueOrNull(),
        downloadCount = downloadCount,
        id = id,
        label = labelState.valueOrNull(),
        name = name,
        nodeId = nodeId,
        size = size,
        state = state,
        updatedAt = updatedAt,
        uploader = uploaderState.valueOrNull(),
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ReleaseAsset = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ReleaseAsset> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ReleaseAsset {
      val jsonDecoder = decoder.requireJsonDecoder("ReleaseAsset")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ReleaseAsset must be a JSON object")
      val browserDownloadUrl = json.decodeRequired<String>(rawObject, "browser_download_url")
      val contentType = json.decodeRequired<String>(rawObject, "content_type")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val downloadCount = json.decodeRequired<Int>(rawObject, "download_count")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val size = json.decodeRequired<Int>(rawObject, "size")
      val state = json.decodeRequired<InlineReleaseAssetStateXa6acf425>(rawObject, "state")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("digest")) {
        throw SerializationException("ReleaseAsset is missing required property 'digest'")
      }
      val digest = rawObject["digest"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("label")) {
        throw SerializationException("ReleaseAsset is missing required property 'label'")
      }
      val label = rawObject["label"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("uploader")) {
        throw SerializationException("ReleaseAsset is missing required property 'uploader'")
      }
      val uploader = rawObject["uploader"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableSimpleUser?>(requireNotNull(element)) }
      return ReleaseAsset(
        browserDownloadUrl = browserDownloadUrl,
        contentType = contentType,
        createdAt = createdAt,
        digest = digest,
        downloadCount = downloadCount,
        id = id,
        label = label,
        name = name,
        nodeId = nodeId,
        size = size,
        state = state,
        updatedAt = updatedAt,
        uploader = uploader,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ReleaseAsset) {
      val jsonEncoder = encoder.requireJsonEncoder("ReleaseAsset")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("browser_download_url", value.browserDownloadUrl)
        put("content_type", value.contentType)
        put("created_at", value.createdAt)
        put("digest", value.digest?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("download_count", json.encodeToJsonElement(value.downloadCount))
        put("id", json.encodeToJsonElement(value.id))
        put("label", value.label?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("name", value.name)
        put("node_id", value.nodeId)
        put("size", json.encodeToJsonElement(value.size))
        put("state", json.encodeToJsonElement(value.state))
        put("updated_at", value.updatedAt)
        put("uploader", value.uploader?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun releaseAsset(block: ReleaseAsset.Builder.() -> Unit): ReleaseAsset = ReleaseAsset.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ReleaseAsset is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("ReleaseAsset property '" + name + "' is not nullable")
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
