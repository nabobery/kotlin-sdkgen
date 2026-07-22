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
 * Content File
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/content-file
 */
@Serializable(with = ContentFile.Serializer::class)
public class ContentFile internal constructor(
  public val links: InlineContentFileLinksXefc75164,
  public val content: String,
  public val downloadUrl: String?,
  public val encoding: String,
  public val gitUrl: String?,
  public val htmlUrl: String?,
  public val name: String,
  public val path: String,
  public val sha: String,
  public val size: Int,
  public val type: InlineContentFileTypeXd379f86b,
  public val url: String,
  private val submoduleGitUrlState: FieldState<String>,
  private val targetState: FieldState<String>,
) {
  public val submoduleGitUrl: String?
    get() = submoduleGitUrlState.valueOrNull()

  public val target: String?
    get() = targetState.valueOrNull()

  public constructor(
    links: InlineContentFileLinksXefc75164,
    content: String,
    downloadUrl: String?,
    encoding: String,
    gitUrl: String?,
    htmlUrl: String?,
    name: String,
    path: String,
    sha: String,
    size: Int,
    type: InlineContentFileTypeXd379f86b,
    url: String,
  ) : this(links = links,
  content = content,
  downloadUrl = downloadUrl,
  encoding = encoding,
  gitUrl = gitUrl,
  htmlUrl = htmlUrl,
  name = name,
  path = path,
  sha = sha,
  size = size,
  type = type,
  url = url,
  submoduleGitUrlState = FieldState.Absent,
  targetState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `submodule_git_url`.
   */
  public fun submoduleGitUrlPresence(): FieldPresence = submoduleGitUrlState.presence

  /**
   * Returns the wire presence of `target`.
   */
  public fun targetPresence(): FieldPresence = targetState.presence

  public class Builder {
    private var linksValue: InlineContentFileLinksXefc75164? = null

    public var links: InlineContentFileLinksXefc75164
      get() = requireNotNull(linksValue) { "links is required" }
      set(`value`) {
        linksValue = value
      }

    private var contentValue: String? = null

    public var content: String
      get() = requireNotNull(contentValue) { "content is required" }
      set(`value`) {
        contentValue = value
      }

    private var encodingValue: String? = null

    public var encoding: String
      get() = requireNotNull(encodingValue) { "encoding is required" }
      set(`value`) {
        encodingValue = value
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

    private var typeValue: InlineContentFileTypeXd379f86b? = null

    public var type: InlineContentFileTypeXd379f86b
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

    private var submoduleGitUrlState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var submoduleGitUrl: String?
      get() = submoduleGitUrlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "submoduleGitUrl is not nullable; call unsetSubmoduleGitUrl() to omit it" }
        submoduleGitUrlState = FieldState.Value(present)
      }

    private var targetState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var target: String?
      get() = targetState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "target is not nullable; call unsetTarget() to omit it" }
        targetState = FieldState.Value(present)
      }

    /**
     * Omits `submodule_git_url` from serialized output.
     */
    public fun unsetSubmoduleGitUrl() {
      submoduleGitUrlState = FieldState.Absent
    }

    /**
     * Omits `target` from serialized output.
     */
    public fun unsetTarget() {
      targetState = FieldState.Absent
    }

    public fun build(): ContentFile {
      check(linksValue != null) { "links is required" }
      check(contentValue != null) { "content is required" }
      check(encodingValue != null) { "encoding is required" }
      check(nameValue != null) { "name is required" }
      check(pathValue != null) { "path is required" }
      check(shaValue != null) { "sha is required" }
      check(sizeValue != null) { "size is required" }
      check(typeValue != null) { "type is required" }
      check(urlValue != null) { "url is required" }
      check(downloadUrlState !== FieldState.Absent) { "downloadUrl is required, even when null" }
      check(gitUrlState !== FieldState.Absent) { "gitUrl is required, even when null" }
      check(htmlUrlState !== FieldState.Absent) { "htmlUrl is required, even when null" }
      return ContentFile(
        links = links,
        content = content,
        downloadUrl = downloadUrlState.valueOrNull(),
        encoding = encoding,
        gitUrl = gitUrlState.valueOrNull(),
        htmlUrl = htmlUrlState.valueOrNull(),
        name = name,
        path = path,
        sha = sha,
        size = size,
        type = type,
        url = url,
        submoduleGitUrlState = submoduleGitUrlState,
        targetState = targetState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ContentFile = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ContentFile> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ContentFile {
      val jsonDecoder = decoder.requireJsonDecoder("ContentFile")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ContentFile must be a JSON object")
      val links = json.decodeRequired<InlineContentFileLinksXefc75164>(rawObject, "_links")
      val content = json.decodeRequired<String>(rawObject, "content")
      val encoding = json.decodeRequired<String>(rawObject, "encoding")
      val name = json.decodeRequired<String>(rawObject, "name")
      val path = json.decodeRequired<String>(rawObject, "path")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      val size = json.decodeRequired<Int>(rawObject, "size")
      val type = json.decodeRequired<InlineContentFileTypeXd379f86b>(rawObject, "type")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("download_url")) {
        throw SerializationException("ContentFile is missing required property 'download_url'")
      }
      val downloadUrl = rawObject["download_url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("git_url")) {
        throw SerializationException("ContentFile is missing required property 'git_url'")
      }
      val gitUrl = rawObject["git_url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("html_url")) {
        throw SerializationException("ContentFile is missing required property 'html_url'")
      }
      val htmlUrl = rawObject["html_url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return ContentFile(
        links = links,
        content = content,
        downloadUrl = downloadUrl,
        encoding = encoding,
        gitUrl = gitUrl,
        htmlUrl = htmlUrl,
        name = name,
        path = path,
        sha = sha,
        size = size,
        type = type,
        url = url,
        submoduleGitUrlState = json.decodeOptional(rawObject, "submodule_git_url", nullable = false),
        targetState = json.decodeOptional(rawObject, "target", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: ContentFile) {
      val jsonEncoder = encoder.requireJsonEncoder("ContentFile")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("_links", json.encodeToJsonElement(value.links))
        put("content", value.content)
        put("download_url", value.downloadUrl?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("encoding", value.encoding)
        put("git_url", value.gitUrl?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("html_url", value.htmlUrl?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("name", value.name)
        put("path", value.path)
        put("sha", value.sha)
        put("size", json.encodeToJsonElement(value.size))
        put("type", json.encodeToJsonElement(value.type))
        put("url", value.url)
        putState("submodule_git_url", value.submoduleGitUrlState, json::encodeToJsonElement)
        putState("target", value.targetState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun contentFile(block: ContentFile.Builder.() -> Unit): ContentFile = ContentFile.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ContentFile is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("ContentFile property '" + name + "' is not nullable")
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
