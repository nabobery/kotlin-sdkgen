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
 * sdkgen://source/openapi.yaml#/paths/~1keys~1{hash}/patch/responses/200/content/application~1json/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1keys~1{hash}/patch/responses/200/content/application~1json/schema
 */
@Serializable(with = InlineKeysPatchResponse200JsonX79fdf341.Serializer::class)
public class InlineKeysPatchResponse200JsonX79fdf341(
  /**
   * The updated API key information
   */
  public val `data`: InlineKeysPatchResponse200JsonDataX2b3f0105,
) {
  public class Builder {
    private var dataValue: InlineKeysPatchResponse200JsonDataX2b3f0105? = null

    public var `data`: InlineKeysPatchResponse200JsonDataX2b3f0105
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    public fun build(): InlineKeysPatchResponse200JsonX79fdf341 {
      check(dataValue != null) { "data is required" }
      return InlineKeysPatchResponse200JsonX79fdf341(
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineKeysPatchResponse200JsonX79fdf341 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineKeysPatchResponse200JsonX79fdf341> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineKeysPatchResponse200JsonX79fdf341 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineKeysPatchResponse200JsonX79fdf341")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineKeysPatchResponse200JsonX79fdf341 must be a JSON object")
      val data = json.decodeRequired<InlineKeysPatchResponse200JsonDataX2b3f0105>(rawObject, "data")
      return InlineKeysPatchResponse200JsonX79fdf341(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineKeysPatchResponse200JsonX79fdf341) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineKeysPatchResponse200JsonX79fdf341")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineKeysPatchResponse200JsonX79fdf341(block: InlineKeysPatchResponse200JsonX79fdf341.Builder.() -> Unit): InlineKeysPatchResponse200JsonX79fdf341 = InlineKeysPatchResponse200JsonX79fdf341.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineKeysPatchResponse200JsonX79fdf341 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
