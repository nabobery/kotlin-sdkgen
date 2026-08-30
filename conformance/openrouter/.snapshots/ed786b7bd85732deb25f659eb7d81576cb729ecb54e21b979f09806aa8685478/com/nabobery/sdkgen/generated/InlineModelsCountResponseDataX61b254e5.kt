package com.nabobery.sdkgen.generated

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Model count data
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ModelsCountResponse/properties/data
 */
@Serializable(with = InlineModelsCountResponseDataX61b254e5.Serializer::class)
public class InlineModelsCountResponseDataX61b254e5(
  /**
   * Total number of available models
   */
  public val count: Int,
) {
  public class Builder {
    private var countValue: Int? = null

    public var count: Int
      get() = requireNotNull(countValue) { "count is required" }
      set(`value`) {
        countValue = value
      }

    public fun build(): InlineModelsCountResponseDataX61b254e5 {
      check(countValue != null) { "count is required" }
      return InlineModelsCountResponseDataX61b254e5(
        count = count,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineModelsCountResponseDataX61b254e5 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineModelsCountResponseDataX61b254e5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineModelsCountResponseDataX61b254e5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineModelsCountResponseDataX61b254e5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineModelsCountResponseDataX61b254e5 must be a JSON object")
      val count = json.decodeRequired<Int>(rawObject, "count")
      return InlineModelsCountResponseDataX61b254e5(
        count = count,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineModelsCountResponseDataX61b254e5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineModelsCountResponseDataX61b254e5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("count", json.encodeToJsonElement(value.count))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineModelsCountResponseDataX61b254e5(block: InlineModelsCountResponseDataX61b254e5.Builder.() -> Unit): InlineModelsCountResponseDataX61b254e5 = InlineModelsCountResponseDataX61b254e5.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineModelsCountResponseDataX61b254e5 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
