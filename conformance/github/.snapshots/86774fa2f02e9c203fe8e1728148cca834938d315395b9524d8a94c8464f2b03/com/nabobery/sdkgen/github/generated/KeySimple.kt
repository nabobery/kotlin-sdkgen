package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Key Simple
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/key-simple
 */
@Serializable(with = KeySimple.Serializer::class)
public class KeySimple(
  public val id: Int,
  public val key: String,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String? = null,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val lastUsed: String? = null,
) {
  public class Builder {
    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var keyValue: String? = null

    public var key: String
      get() = requireNotNull(keyValue) { "key is required" }
      set(`value`) {
        keyValue = value
      }

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var createdAt: String? = null

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var lastUsed: String? = null

    public fun build(): KeySimple {
      check(idValue != null) { "id is required" }
      check(keyValue != null) { "key is required" }
      return KeySimple(
        id = id,
        key = key,
        createdAt = createdAt,
        lastUsed = lastUsed,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): KeySimple = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<KeySimple> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): KeySimple {
      val jsonDecoder = decoder.requireJsonDecoder("KeySimple")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("KeySimple must be a JSON object")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val key = json.decodeRequired<String>(rawObject, "key")
      return KeySimple(
        id = id,
        key = key,
        createdAt = rawObject["created_at"]?.let { json.decodeFromJsonElement<String>(it) },
        lastUsed = rawObject["last_used"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: KeySimple) {
      val jsonEncoder = encoder.requireJsonEncoder("KeySimple")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", json.encodeToJsonElement(value.id))
        put("key", value.key)
        value.createdAt?.let { put("created_at", it) }
        value.lastUsed?.let { put("last_used", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun keySimple(block: KeySimple.Builder.() -> Unit): KeySimple = KeySimple.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("KeySimple is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
