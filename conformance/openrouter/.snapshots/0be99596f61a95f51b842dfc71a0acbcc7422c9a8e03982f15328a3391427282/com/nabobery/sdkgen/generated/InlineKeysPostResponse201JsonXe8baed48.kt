package com.nabobery.sdkgen.generated

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/paths/~1keys/post/responses/201/content/application~1json/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1keys/post/responses/201/content/application~1json/schema
 */
@Serializable(with = InlineKeysPostResponse201JsonXe8baed48.Serializer::class)
public class InlineKeysPostResponse201JsonXe8baed48(
  /**
   * The created API key information
   */
  public val `data`: InlineKeysPostResponse201JsonDataX8e245ea2,
  /**
   * The actual API key string (only shown once)
   */
  public val key: String,
) {
  public class Builder {
    private var dataValue: InlineKeysPostResponse201JsonDataX8e245ea2? = null

    public var `data`: InlineKeysPostResponse201JsonDataX8e245ea2
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    private var keyValue: String? = null

    public var key: String
      get() = requireNotNull(keyValue) { "key is required" }
      set(`value`) {
        keyValue = value
      }

    public fun build(): InlineKeysPostResponse201JsonXe8baed48 {
      check(dataValue != null) { "data is required" }
      check(keyValue != null) { "key is required" }
      return InlineKeysPostResponse201JsonXe8baed48(
        data = data,
        key = key,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineKeysPostResponse201JsonXe8baed48 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineKeysPostResponse201JsonXe8baed48> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineKeysPostResponse201JsonXe8baed48 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineKeysPostResponse201JsonXe8baed48")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineKeysPostResponse201JsonXe8baed48 must be a JSON object")
      val data = json.decodeRequired<InlineKeysPostResponse201JsonDataX8e245ea2>(rawObject, "data")
      val key = json.decodeRequired<String>(rawObject, "key")
      return InlineKeysPostResponse201JsonXe8baed48(
        data = data,
        key = key,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineKeysPostResponse201JsonXe8baed48) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineKeysPostResponse201JsonXe8baed48")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
        put("key", value.key)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineKeysPostResponse201JsonXe8baed48(block: InlineKeysPostResponse201JsonXe8baed48.Builder.() -> Unit): InlineKeysPostResponse201JsonXe8baed48 = InlineKeysPostResponse201JsonXe8baed48.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineKeysPostResponse201JsonXe8baed48 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
