package com.nabobery.sdkgen.generated

import kotlin.Boolean
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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1auth~1keys/post/responses/200/content/application~1json/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1auth~1keys/post/responses/200/content/application~1json/schema
 */
@Serializable(with = InlineAuthKeysPostResponse200JsonX2c58353e.Serializer::class)
public class InlineAuthKeysPostResponse200JsonX2c58353e(
  /**
   * The API key to use for OpenRouter requests
   */
  public val key: String,
  /**
   * User ID associated with the API key
   */
  public val userId: String?,
) {
  public class Builder {
    private var keyValue: String? = null

    public var key: String
      get() = requireNotNull(keyValue) { "key is required" }
      set(`value`) {
        keyValue = value
      }

    private var userIdState: FieldState<String?> = FieldState.Absent

    /**
     * User ID associated with the API key
     * Required nullable field; assigning `null` records present-null.
     */
    public var userId: String?
      get() = userIdState.valueOrNull()
      set(`value`) {
        userIdState = value.toNullableFieldState()
      }

    public fun build(): InlineAuthKeysPostResponse200JsonX2c58353e {
      check(keyValue != null) { "key is required" }
      check(userIdState !== FieldState.Absent) { "userId is required, even when null" }
      return InlineAuthKeysPostResponse200JsonX2c58353e(
        key = key,
        userId = userIdState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAuthKeysPostResponse200JsonX2c58353e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAuthKeysPostResponse200JsonX2c58353e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAuthKeysPostResponse200JsonX2c58353e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAuthKeysPostResponse200JsonX2c58353e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAuthKeysPostResponse200JsonX2c58353e must be a JSON object")
      val key = json.decodeRequired<String>(rawObject, "key")
      if (!rawObject.containsKey("user_id")) {
        throw SerializationException("InlineAuthKeysPostResponse200JsonX2c58353e is missing required property 'user_id'")
      }
      val userId = rawObject["user_id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineAuthKeysPostResponse200JsonX2c58353e(
        key = key,
        userId = userId,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAuthKeysPostResponse200JsonX2c58353e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAuthKeysPostResponse200JsonX2c58353e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("key", value.key)
        put("user_id", value.userId?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAuthKeysPostResponse200JsonX2c58353e(block: InlineAuthKeysPostResponse200JsonX2c58353e.Builder.() -> Unit): InlineAuthKeysPostResponse200JsonX2c58353e = InlineAuthKeysPostResponse200JsonX2c58353e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAuthKeysPostResponse200JsonX2c58353e is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineAuthKeysPostResponse200JsonX2c58353e property '" + name + "' is not nullable")
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
