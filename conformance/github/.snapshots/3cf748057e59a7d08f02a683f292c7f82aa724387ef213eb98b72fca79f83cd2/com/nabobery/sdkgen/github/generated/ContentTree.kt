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
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Content Tree
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/content-tree
 */
@Serializable(with = ContentTree.Serializer::class)
public class ContentTree internal constructor(
  public val links: InlineContentTreeLinksX6e44b001,
  public val downloadUrl: String?,
  public val gitUrl: String?,
  public val htmlUrl: String?,
  public val name: String,
  public val path: String,
  public val sha: String,
  public val size: Int,
  public val type: String,
  public val url: String,
  private val contentState: FieldState<String>,
  private val encodingState: FieldState<String>,
  private val entriesState: FieldState<List<InlineContentTreeEntriesItemXc0b8f4a8>>,
) {
  public val content: String?
    get() = contentState.valueOrNull()

  public val encoding: String?
    get() = encodingState.valueOrNull()

  public val entries: List<InlineContentTreeEntriesItemXc0b8f4a8>?
    get() = entriesState.valueOrNull()

  public constructor(
    links: InlineContentTreeLinksX6e44b001,
    downloadUrl: String?,
    gitUrl: String?,
    htmlUrl: String?,
    name: String,
    path: String,
    sha: String,
    size: Int,
    type: String,
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
  encodingState = FieldState.Absent,
  entriesState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `content`.
   */
  public fun contentPresence(): FieldPresence = contentState.presence

  /**
   * Returns the wire presence of `encoding`.
   */
  public fun encodingPresence(): FieldPresence = encodingState.presence

  /**
   * Returns the wire presence of `entries`.
   */
  public fun entriesPresence(): FieldPresence = entriesState.presence

  public class Builder {
    private var linksValue: InlineContentTreeLinksX6e44b001? = null

    public var links: InlineContentTreeLinksX6e44b001
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

    private var typeValue: String? = null

    public var type: String
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
     * Required nullable field; assigning `null` records present-null.
     */
    public var downloadUrl: String?
      get() = downloadUrlState.valueOrNull()
      set(`value`) {
        downloadUrlState = value.toNullableFieldState()
      }

    private var gitUrlState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var gitUrl: String?
      get() = gitUrlState.valueOrNull()
      set(`value`) {
        gitUrlState = value.toNullableFieldState()
      }

    private var htmlUrlState: FieldState<String?> = FieldState.Absent

    /**
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

    private var encodingState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var encoding: String?
      get() = encodingState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "encoding is not nullable; call unsetEncoding() to omit it" }
        encodingState = FieldState.Value(present)
      }

    private var entriesState: FieldState<List<InlineContentTreeEntriesItemXc0b8f4a8>> =
        FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var entries: List<InlineContentTreeEntriesItemXc0b8f4a8>?
      get() = entriesState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "entries is not nullable; call unsetEntries() to omit it" }
        entriesState = FieldState.Value(present)
      }

    /**
     * Omits `content` from serialized output.
     */
    public fun unsetContent() {
      contentState = FieldState.Absent
    }

    /**
     * Omits `encoding` from serialized output.
     */
    public fun unsetEncoding() {
      encodingState = FieldState.Absent
    }

    /**
     * Omits `entries` from serialized output.
     */
    public fun unsetEntries() {
      entriesState = FieldState.Absent
    }

    public fun build(): ContentTree {
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
      return ContentTree(
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
        encodingState = encodingState,
        entriesState = entriesState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ContentTree = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ContentTree> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ContentTree {
      val jsonDecoder = decoder.requireJsonDecoder("ContentTree")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ContentTree must be a JSON object")
      val links = json.decodeRequired<InlineContentTreeLinksX6e44b001>(rawObject, "_links")
      val name = json.decodeRequired<String>(rawObject, "name")
      val path = json.decodeRequired<String>(rawObject, "path")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      val size = json.decodeRequired<Int>(rawObject, "size")
      val type = json.decodeRequired<String>(rawObject, "type")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("download_url")) {
        throw SerializationException("ContentTree is missing required property 'download_url'")
      }
      val downloadUrl = rawObject["download_url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("git_url")) {
        throw SerializationException("ContentTree is missing required property 'git_url'")
      }
      val gitUrl = rawObject["git_url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("html_url")) {
        throw SerializationException("ContentTree is missing required property 'html_url'")
      }
      val htmlUrl = rawObject["html_url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return ContentTree(
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
        encodingState = json.decodeOptional(rawObject, "encoding", nullable = false),
        entriesState = json.decodeOptional(rawObject, "entries", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: ContentTree) {
      val jsonEncoder = encoder.requireJsonEncoder("ContentTree")
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
        put("type", value.type)
        put("url", value.url)
        putState("content", value.contentState, json::encodeToJsonElement)
        putState("encoding", value.encodingState, json::encodeToJsonElement)
        putState("entries", value.entriesState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun contentTree(block: ContentTree.Builder.() -> Unit): ContentTree = ContentTree.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ContentTree is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("ContentTree property '" + name + "' is not nullable")
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
