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
 * A page of files belonging to the requesting workspace.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FileListResponse
 */
@Serializable(with = FileListResponse.Serializer::class)
public class FileListResponse(
  /**
   * Opaque cursor for the next page; null when there are no more results.
   */
  public val cursor: String?,
  `data`: List<FileMetadata>,
  public val firstId: String?,
  public val hasMore: Boolean,
  public val lastId: String?,
) {
  public val `data`: List<FileMetadata> = data.toList()

  public class Builder {
    private var dataValue: List<FileMetadata>? = null

    public var `data`: List<FileMetadata>
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

    public fun build(): FileListResponse {
      check(dataValue != null) { "data is required" }
      check(hasMoreValue != null) { "hasMore is required" }
      check(cursorState !== FieldState.Absent) { "cursor is required, even when null" }
      check(firstIdState !== FieldState.Absent) { "firstId is required, even when null" }
      check(lastIdState !== FieldState.Absent) { "lastId is required, even when null" }
      return FileListResponse(
        cursor = cursorState.valueOrNull(),
        data = data,
        firstId = firstIdState.valueOrNull(),
        hasMore = hasMore,
        lastId = lastIdState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): FileListResponse = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<FileListResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): FileListResponse {
      val jsonDecoder = decoder.requireJsonDecoder("FileListResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("FileListResponse must be a JSON object")
      val data = json.decodeRequired<List<FileMetadata>>(rawObject, "data")
      val hasMore = json.decodeRequired<Boolean>(rawObject, "has_more")
      if (!rawObject.containsKey("cursor")) {
        throw SerializationException("FileListResponse is missing required property 'cursor'")
      }
      val cursor = rawObject["cursor"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("first_id")) {
        throw SerializationException("FileListResponse is missing required property 'first_id'")
      }
      val firstId = rawObject["first_id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("last_id")) {
        throw SerializationException("FileListResponse is missing required property 'last_id'")
      }
      val lastId = rawObject["last_id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return FileListResponse(
        cursor = cursor,
        data = data,
        firstId = firstId,
        hasMore = hasMore,
        lastId = lastId,
      )
    }

    override fun serialize(encoder: Encoder, `value`: FileListResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("FileListResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
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

public fun fileListResponse(block: FileListResponse.Builder.() -> Unit): FileListResponse = FileListResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("FileListResponse is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("FileListResponse property '" + name + "' is not nullable")
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
