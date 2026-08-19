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
 * Total credits purchased and used
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1credits/get/responses/200/content/application~1json/schema
 */
@Serializable(with = InlineCreditsGetResponse200JsonX5d127cc8.Serializer::class)
public class InlineCreditsGetResponse200JsonX5d127cc8(
  public val `data`: InlineCreditsGetResponse200JsonDataX5055cf42,
) {
  public class Builder {
    private var dataValue: InlineCreditsGetResponse200JsonDataX5055cf42? = null

    public var `data`: InlineCreditsGetResponse200JsonDataX5055cf42
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    public fun build(): InlineCreditsGetResponse200JsonX5d127cc8 {
      check(dataValue != null) { "data is required" }
      return InlineCreditsGetResponse200JsonX5d127cc8(
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineCreditsGetResponse200JsonX5d127cc8 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineCreditsGetResponse200JsonX5d127cc8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCreditsGetResponse200JsonX5d127cc8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCreditsGetResponse200JsonX5d127cc8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineCreditsGetResponse200JsonX5d127cc8 must be a JSON object")
      val data = json.decodeRequired<InlineCreditsGetResponse200JsonDataX5055cf42>(rawObject, "data")
      return InlineCreditsGetResponse200JsonX5d127cc8(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineCreditsGetResponse200JsonX5d127cc8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineCreditsGetResponse200JsonX5d127cc8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineCreditsGetResponse200JsonX5d127cc8(block: InlineCreditsGetResponse200JsonX5d127cc8.Builder.() -> Unit): InlineCreditsGetResponse200JsonX5d127cc8 = InlineCreditsGetResponse200JsonX5d127cc8.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineCreditsGetResponse200JsonX5d127cc8 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
