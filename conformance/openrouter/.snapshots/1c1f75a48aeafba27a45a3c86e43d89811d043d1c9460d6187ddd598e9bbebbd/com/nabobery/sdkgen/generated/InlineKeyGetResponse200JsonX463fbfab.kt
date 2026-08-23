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
 * Generated model for sdkgen://source/openapi.yaml#/paths/~1key/get/responses/200/content/application~1json/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1key/get/responses/200/content/application~1json/schema
 */
@Serializable(with = InlineKeyGetResponse200JsonX463fbfab.Serializer::class)
public class InlineKeyGetResponse200JsonX463fbfab(
  /**
   * Current API key information
   */
  public val `data`: InlineKeyGetResponse200JsonDataXff2cd45b,
) {
  public class Builder {
    private var dataValue: InlineKeyGetResponse200JsonDataXff2cd45b? = null

    public var `data`: InlineKeyGetResponse200JsonDataXff2cd45b
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    public fun build(): InlineKeyGetResponse200JsonX463fbfab {
      check(dataValue != null) { "data is required" }
      return InlineKeyGetResponse200JsonX463fbfab(
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineKeyGetResponse200JsonX463fbfab = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineKeyGetResponse200JsonX463fbfab> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineKeyGetResponse200JsonX463fbfab {
      val jsonDecoder = decoder.requireJsonDecoder("InlineKeyGetResponse200JsonX463fbfab")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineKeyGetResponse200JsonX463fbfab must be a JSON object")
      val data = json.decodeRequired<InlineKeyGetResponse200JsonDataXff2cd45b>(rawObject, "data")
      return InlineKeyGetResponse200JsonX463fbfab(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineKeyGetResponse200JsonX463fbfab) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineKeyGetResponse200JsonX463fbfab")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineKeyGetResponse200JsonX463fbfab(block: InlineKeyGetResponse200JsonX463fbfab.Builder.() -> Unit): InlineKeyGetResponse200JsonX463fbfab = InlineKeyGetResponse200JsonX463fbfab.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineKeyGetResponse200JsonX463fbfab is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
