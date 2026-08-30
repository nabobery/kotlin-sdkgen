package com.nabobery.sdkgen.generated

import kotlin.Boolean
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/OpenRouterFileList.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenRouterFileList
 */
@Serializable(with = OpenRouterFileList.Serializer::class)
public class OpenRouterFileList(
  public val shape: InlineOpenRouterFileListShapeX1640caf6,
  /**
   * Opaque cursor for the next page; null when there are no more results.
   */
  public val cursor: String?,
  `data`: List<FileEntry>,
  public val firstId: String?,
  public val hasMore: Boolean,
  public val lastId: String?,
) {
  public val `data`: List<FileEntry> = data.toList()

  public class Builder {
    private var shapeValue: InlineOpenRouterFileListShapeX1640caf6? = null

    public var shape: InlineOpenRouterFileListShapeX1640caf6
      get() = requireNotNull(shapeValue) { "shape is required" }
      set(`value`) {
        shapeValue = value
      }

    private var dataValue: List<FileEntry>? = null

    public var `data`: List<FileEntry>
      get() = requireNotNull(dataValue) { "data is required" }.toList()
      set(`value`) {
        dataValue = value.toList()
      }

    private var hasMoreValue: Boolean? = null

    public var hasMore: Boolean
      get() = requireNotNull(hasMoreValue) { "hasMore is required" }
      set(`value`) {
        hasMoreValue = value
      }

    private var cursorState: FieldState<String?> = FieldState.Absent

    /**
     * Opaque cursor for the next page; null when there are no more results.
     * Required nullable field; assigning `null` records present-null.
     */
    public var cursor: String?
      get() = cursorState.valueOrNull()
      set(`value`) {
        cursorState = value.toNullableFieldState()
      }

    private var firstIdState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var firstId: String?
      get() = firstIdState.valueOrNull()
      set(`value`) {
        firstIdState = value.toNullableFieldState()
      }

    private var lastIdState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var lastId: String?
      get() = lastIdState.valueOrNull()
      set(`value`) {
        lastIdState = value.toNullableFieldState()
      }

    public fun build(): OpenRouterFileList {
      check(shapeValue != null) { "shape is required" }
      check(dataValue != null) { "data is required" }
      check(hasMoreValue != null) { "hasMore is required" }
      check(cursorState !== FieldState.Absent) { "cursor is required, even when null" }
      check(firstIdState !== FieldState.Absent) { "firstId is required, even when null" }
      check(lastIdState !== FieldState.Absent) { "lastId is required, even when null" }
      return OpenRouterFileList(
        shape = shape,
        cursor = cursorState.valueOrNull(),
        data = data,
        firstId = firstIdState.valueOrNull(),
        hasMore = hasMore,
        lastId = lastIdState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OpenRouterFileList = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<OpenRouterFileList> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OpenRouterFileList {
      val jsonDecoder = decoder.requireJsonDecoder("OpenRouterFileList")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OpenRouterFileList must be a JSON object")
      val shape = json.decodeRequired<InlineOpenRouterFileListShapeX1640caf6>(rawObject, "_shape")
      val data = json.decodeRequired<List<FileEntry>>(rawObject, "data")
      val hasMore = json.decodeRequired<Boolean>(rawObject, "has_more")
      if (!rawObject.containsKey("cursor")) {
        throw SerializationException("OpenRouterFileList is missing required property 'cursor'")
      }
      val cursor = rawObject["cursor"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("first_id")) {
        throw SerializationException("OpenRouterFileList is missing required property 'first_id'")
      }
      val firstId = rawObject["first_id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("last_id")) {
        throw SerializationException("OpenRouterFileList is missing required property 'last_id'")
      }
      val lastId = rawObject["last_id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return OpenRouterFileList(
        shape = shape,
        cursor = cursor,
        data = data,
        firstId = firstId,
        hasMore = hasMore,
        lastId = lastId,
      )
    }

    override fun serialize(encoder: Encoder, `value`: OpenRouterFileList) {
      val jsonEncoder = encoder.requireJsonEncoder("OpenRouterFileList")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("_shape", json.encodeToJsonElement(value.shape))
        put("cursor", value.cursor?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("data", json.encodeToJsonElement(value.data))
        put("first_id", value.firstId?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("has_more", json.encodeToJsonElement(value.hasMore))
        put("last_id", value.lastId?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun openRouterFileList(block: OpenRouterFileList.Builder.() -> Unit): OpenRouterFileList = OpenRouterFileList.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OpenRouterFileList is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("OpenRouterFileList property '" + name + "' is not nullable")
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
