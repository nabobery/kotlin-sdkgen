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
 * Blob
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/blob
 */
@Serializable(with = Blob.Serializer::class)
public class Blob internal constructor(
  public val content: String,
  public val encoding: String,
  public val nodeId: String,
  public val sha: String,
  public val size: Int?,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  private val highlightedContentState: FieldState<String>,
) {
  public val highlightedContent: String?
    get() = highlightedContentState.valueOrNull()

  public constructor(
    content: String,
    encoding: String,
    nodeId: String,
    sha: String,
    size: Int?,
    url: String,
  ) : this(content = content,
  encoding = encoding,
  nodeId = nodeId,
  sha = sha,
  size = size,
  url = url,
  highlightedContentState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `highlighted_content`.
   */
  public fun highlightedContentPresence(): FieldPresence = highlightedContentState.presence

  public class Builder {
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

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var shaValue: String? = null

    public var sha: String
      get() = requireNotNull(shaValue) { "sha is required" }
      set(`value`) {
        shaValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var sizeState: FieldState<Int?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var size: Int?
      get() = sizeState.valueOrNull()
      set(`value`) {
        sizeState = value.toNullableFieldState()
      }

    private var highlightedContentState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var highlightedContent: String?
      get() = highlightedContentState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "highlightedContent is not nullable; call unsetHighlightedContent() to omit it" }
        highlightedContentState = FieldState.Value(present)
      }

    /**
     * Omits `highlighted_content` from serialized output.
     */
    public fun unsetHighlightedContent() {
      highlightedContentState = FieldState.Absent
    }

    public fun build(): Blob {
      check(contentValue != null) { "content is required" }
      check(encodingValue != null) { "encoding is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(shaValue != null) { "sha is required" }
      check(urlValue != null) { "url is required" }
      check(sizeState !== FieldState.Absent) { "size is required, even when null" }
      return Blob(
        content = content,
        encoding = encoding,
        nodeId = nodeId,
        sha = sha,
        size = sizeState.valueOrNull(),
        url = url,
        highlightedContentState = highlightedContentState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Blob = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<Blob> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Blob {
      val jsonDecoder = decoder.requireJsonDecoder("Blob")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Blob must be a JSON object")
      val content = json.decodeRequired<String>(rawObject, "content")
      val encoding = json.decodeRequired<String>(rawObject, "encoding")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("size")) {
        throw SerializationException("Blob is missing required property 'size'")
      }
      val size = rawObject["size"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      return Blob(
        content = content,
        encoding = encoding,
        nodeId = nodeId,
        sha = sha,
        size = size,
        url = url,
        highlightedContentState = json.decodeOptional(rawObject, "highlighted_content", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: Blob) {
      val jsonEncoder = encoder.requireJsonEncoder("Blob")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("content", value.content)
        put("encoding", value.encoding)
        put("node_id", value.nodeId)
        put("sha", value.sha)
        put("size", value.size?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("url", value.url)
        putState("highlighted_content", value.highlightedContentState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun blob(block: Blob.Builder.() -> Unit): Blob = Blob.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Blob is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("Blob property '" + name + "' is not nullable")
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
