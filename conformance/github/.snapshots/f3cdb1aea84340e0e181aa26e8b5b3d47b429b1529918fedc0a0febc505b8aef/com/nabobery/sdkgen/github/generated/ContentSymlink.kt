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
 * An object describing a symlink
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/content-symlink
 */
@Serializable(with = ContentSymlink.Serializer::class)
public class ContentSymlink(
  public val links: InlineContentSymlinkLinksX5e2990b7,
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
  public val target: String,
  public val type: InlineContentSymlinkTypeX33a2a068,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
) {
  public class Builder {
    private var linksValue: InlineContentSymlinkLinksX5e2990b7? = null

    public var links: InlineContentSymlinkLinksX5e2990b7
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

    private var targetValue: String? = null

    public var target: String
      get() = requireNotNull(targetValue) { "target is required" }
      set(`value`) {
        targetValue = value
      }

    private var typeValue: InlineContentSymlinkTypeX33a2a068? = null

    public var type: InlineContentSymlinkTypeX33a2a068
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

    public fun build(): ContentSymlink {
      check(linksValue != null) { "links is required" }
      check(nameValue != null) { "name is required" }
      check(pathValue != null) { "path is required" }
      check(shaValue != null) { "sha is required" }
      check(sizeValue != null) { "size is required" }
      check(targetValue != null) { "target is required" }
      check(typeValue != null) { "type is required" }
      check(urlValue != null) { "url is required" }
      check(downloadUrlState !== FieldState.Absent) { "downloadUrl is required, even when null" }
      check(gitUrlState !== FieldState.Absent) { "gitUrl is required, even when null" }
      check(htmlUrlState !== FieldState.Absent) { "htmlUrl is required, even when null" }
      return ContentSymlink(
        links = links,
        downloadUrl = downloadUrlState.valueOrNull(),
        gitUrl = gitUrlState.valueOrNull(),
        htmlUrl = htmlUrlState.valueOrNull(),
        name = name,
        path = path,
        sha = sha,
        size = size,
        target = target,
        type = type,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ContentSymlink = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ContentSymlink> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ContentSymlink {
      val jsonDecoder = decoder.requireJsonDecoder("ContentSymlink")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ContentSymlink must be a JSON object")
      val links = json.decodeRequired<InlineContentSymlinkLinksX5e2990b7>(rawObject, "_links")
      val name = json.decodeRequired<String>(rawObject, "name")
      val path = json.decodeRequired<String>(rawObject, "path")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      val size = json.decodeRequired<Int>(rawObject, "size")
      val target = json.decodeRequired<String>(rawObject, "target")
      val type = json.decodeRequired<InlineContentSymlinkTypeX33a2a068>(rawObject, "type")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("download_url")) {
        throw SerializationException("ContentSymlink is missing required property 'download_url'")
      }
      val downloadUrl = rawObject["download_url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("git_url")) {
        throw SerializationException("ContentSymlink is missing required property 'git_url'")
      }
      val gitUrl = rawObject["git_url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("html_url")) {
        throw SerializationException("ContentSymlink is missing required property 'html_url'")
      }
      val htmlUrl = rawObject["html_url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return ContentSymlink(
        links = links,
        downloadUrl = downloadUrl,
        gitUrl = gitUrl,
        htmlUrl = htmlUrl,
        name = name,
        path = path,
        sha = sha,
        size = size,
        target = target,
        type = type,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ContentSymlink) {
      val jsonEncoder = encoder.requireJsonEncoder("ContentSymlink")
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
        put("target", value.target)
        put("type", json.encodeToJsonElement(value.type))
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun contentSymlink(block: ContentSymlink.Builder.() -> Unit): ContentSymlink = ContentSymlink.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ContentSymlink is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("ContentSymlink property '" + name + "' is not nullable")
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
