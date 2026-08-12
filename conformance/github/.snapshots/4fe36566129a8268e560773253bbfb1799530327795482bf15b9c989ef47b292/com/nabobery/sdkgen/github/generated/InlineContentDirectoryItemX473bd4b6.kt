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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/content-directory/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/content-directory/items
 */
@Serializable(with = InlineContentDirectoryItemX473bd4b6.Serializer::class)
public class InlineContentDirectoryItemX473bd4b6 internal constructor(
  public val links: InlineContentDirectoryItemLinksXd366e547,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val downloadUrl: String?,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val gitUrl: String?,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String?,
  public val name: String,
  public val path: String,
  public val sha: String,
  public val size: Int,
  public val type: InlineContentDirectoryItemTypeX7118c3f4,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  private val contentState: FieldState<String>,
) {
  public val content: String?
    get() = contentState.valueOrNull()

  public constructor(
    links: InlineContentDirectoryItemLinksXd366e547,
    downloadUrl: String?,
    gitUrl: String?,
    htmlUrl: String?,
    name: String,
    path: String,
    sha: String,
    size: Int,
    type: InlineContentDirectoryItemTypeX7118c3f4,
    url: String,
  ) : this(links = links,
  downloadUrl = downloadUrl,
  gitUrl = gitUrl,
  htmlUrl = htmlUrl,
  name = name,
  path = path,
  sha = sha,
  size = size,
  type = type,
  url = url,
  contentState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `content`.
   */
  public fun contentPresence(): FieldPresence = contentState.presence

  public class Builder {
    private var linksValue: InlineContentDirectoryItemLinksXd366e547? = null

    public var links: InlineContentDirectoryItemLinksXd366e547
      get() = requireNotNull(linksValue) { "links is required" }
      set(`value`) {
        linksValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var pathValue: String? = null

    public var path: String
      get() = requireNotNull(pathValue) { "path is required" }
      set(`value`) {
        pathValue = value
      }

    private var shaValue: String? = null

    public var sha: String
      get() = requireNotNull(shaValue) { "sha is required" }
      set(`value`) {
        shaValue = value
      }

    private var sizeValue: Int? = null

    public var size: Int
      get() = requireNotNull(sizeValue) { "size is required" }
      set(`value`) {
        sizeValue = value
      }

    private var typeValue: InlineContentDirectoryItemTypeX7118c3f4? = null

    public var type: InlineContentDirectoryItemTypeX7118c3f4
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var downloadUrlState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var downloadUrl: String?
      get() = downloadUrlState.valueOrNull()
      set(`value`) {
        downloadUrlState = value.toNullableFieldState()
      }

    private var gitUrlState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var gitUrl: String?
      get() = gitUrlState.valueOrNull()
      set(`value`) {
        gitUrlState = value.toNullableFieldState()
      }

    private var htmlUrlState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var htmlUrl: String?
      get() = htmlUrlState.valueOrNull()
      set(`value`) {
        htmlUrlState = value.toNullableFieldState()
      }

    private var contentState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var content: String?
      get() = contentState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "content is not nullable; call unsetContent() to omit it" }
        contentState = FieldState.Value(present)
      }

    /**
     * Omits `content` from serialized output.
     */
    public fun unsetContent() {
      contentState = FieldState.Absent
    }

    public fun build(): InlineContentDirectoryItemX473bd4b6 {
      check(linksValue != null) { "links is required" }
      check(nameValue != null) { "name is required" }
      check(pathValue != null) { "path is required" }
      check(shaValue != null) { "sha is required" }
      check(sizeValue != null) { "size is required" }
      check(typeValue != null) { "type is required" }
      check(urlValue != null) { "url is required" }
      check(downloadUrlState !== FieldState.Absent) { "downloadUrl is required, even when null" }
      check(gitUrlState !== FieldState.Absent) { "gitUrl is required, even when null" }
      check(htmlUrlState !== FieldState.Absent) { "htmlUrl is required, even when null" }
      return InlineContentDirectoryItemX473bd4b6(
        links = links,
        downloadUrl = downloadUrlState.valueOrNull(),
        gitUrl = gitUrlState.valueOrNull(),
        htmlUrl = htmlUrlState.valueOrNull(),
        name = name,
        path = path,
        sha = sha,
        size = size,
        type = type,
        url = url,
        contentState = contentState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineContentDirectoryItemX473bd4b6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineContentDirectoryItemX473bd4b6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineContentDirectoryItemX473bd4b6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineContentDirectoryItemX473bd4b6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineContentDirectoryItemX473bd4b6 must be a JSON object")
      val links = json.decodeRequired<InlineContentDirectoryItemLinksXd366e547>(rawObject, "_links")
      val name = json.decodeRequired<String>(rawObject, "name")
      val path = json.decodeRequired<String>(rawObject, "path")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      val size = json.decodeRequired<Int>(rawObject, "size")
      val type = json.decodeRequired<InlineContentDirectoryItemTypeX7118c3f4>(rawObject, "type")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("download_url")) {
        throw SerializationException("InlineContentDirectoryItemX473bd4b6 is missing required property 'download_url'")
      }
      val downloadUrl = rawObject["download_url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("git_url")) {
        throw SerializationException("InlineContentDirectoryItemX473bd4b6 is missing required property 'git_url'")
      }
      val gitUrl = rawObject["git_url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("html_url")) {
        throw SerializationException("InlineContentDirectoryItemX473bd4b6 is missing required property 'html_url'")
      }
      val htmlUrl = rawObject["html_url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineContentDirectoryItemX473bd4b6(
        links = links,
        downloadUrl = downloadUrl,
        gitUrl = gitUrl,
        htmlUrl = htmlUrl,
        name = name,
        path = path,
        sha = sha,
        size = size,
        type = type,
        url = url,
        contentState = json.decodeOptional(rawObject, "content", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineContentDirectoryItemX473bd4b6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineContentDirectoryItemX473bd4b6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("_links", json.encodeToJsonElement(value.links))
        put("download_url", value.downloadUrl?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("git_url", value.gitUrl?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("html_url", value.htmlUrl?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("name", value.name)
        put("path", value.path)
        put("sha", value.sha)
        put("size", json.encodeToJsonElement(value.size))
        put("type", json.encodeToJsonElement(value.type))
        put("url", value.url)
        putState("content", value.contentState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineContentDirectoryItemX473bd4b6(block: InlineContentDirectoryItemX473bd4b6.Builder.() -> Unit): InlineContentDirectoryItemX473bd4b6 = InlineContentDirectoryItemX473bd4b6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineContentDirectoryItemX473bd4b6 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineContentDirectoryItemX473bd4b6 property '" + name + "' is not nullable")
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
