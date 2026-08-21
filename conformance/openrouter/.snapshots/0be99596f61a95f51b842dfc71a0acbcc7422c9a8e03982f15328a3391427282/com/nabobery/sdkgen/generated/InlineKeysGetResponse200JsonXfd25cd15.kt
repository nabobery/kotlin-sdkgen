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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1keys~1{hash}/get/responses/200/content/application~1json/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1keys~1{hash}/get/responses/200/content/application~1json/schema
 */
@Serializable(with = InlineKeysGetResponse200JsonXfd25cd15.Serializer::class)
public class InlineKeysGetResponse200JsonXfd25cd15(
  /**
   * The API key information
   */
  public val `data`: InlineKeysGetResponse200JsonDataX5145d42b,
) {
  public class Builder {
    private var dataValue: InlineKeysGetResponse200JsonDataX5145d42b? = null

    public var `data`: InlineKeysGetResponse200JsonDataX5145d42b
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    public fun build(): InlineKeysGetResponse200JsonXfd25cd15 {
      check(dataValue != null) { "data is required" }
      return InlineKeysGetResponse200JsonXfd25cd15(
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineKeysGetResponse200JsonXfd25cd15 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineKeysGetResponse200JsonXfd25cd15> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineKeysGetResponse200JsonXfd25cd15 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineKeysGetResponse200JsonXfd25cd15")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineKeysGetResponse200JsonXfd25cd15 must be a JSON object")
      val data = json.decodeRequired<InlineKeysGetResponse200JsonDataX5145d42b>(rawObject, "data")
      return InlineKeysGetResponse200JsonXfd25cd15(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineKeysGetResponse200JsonXfd25cd15) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineKeysGetResponse200JsonXfd25cd15")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineKeysGetResponse200JsonXfd25cd15(block: InlineKeysGetResponse200JsonXfd25cd15.Builder.() -> Unit): InlineKeysGetResponse200JsonXfd25cd15 = InlineKeysGetResponse200JsonXfd25cd15.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineKeysGetResponse200JsonXfd25cd15 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
