package com.nabobery.sdkgen.generated.stripe

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
 * Apply a transformation to the reported usage or set quantity before computing the billed price. Cannot be combined
 * with `tiers`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1prices/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/transform_quantity
 */
@Serializable(with = InlineV1PricesPostRequestFormTransformQuantityXc0c69d44.Serializer::class)
public class InlineV1PricesPostRequestFormTransformQuantityXc0c69d44(
  public val divideBy: Int,
  public val round: InlineV1PricesPostRequestFormTransformQuantityRoundXec72de8f,
) {
  public class Builder {
    private var divideByValue: Int? = null

    public var divideBy: Int
      get() = requireNotNull(divideByValue) { "divideBy is required" }
      set(`value`) {
        divideByValue = value
      }

    private var roundValue: InlineV1PricesPostRequestFormTransformQuantityRoundXec72de8f? = null

    public var round: InlineV1PricesPostRequestFormTransformQuantityRoundXec72de8f
      get() = requireNotNull(roundValue) { "round is required" }
      set(`value`) {
        roundValue = value
      }

    public fun build(): InlineV1PricesPostRequestFormTransformQuantityXc0c69d44 {
      check(divideByValue != null) { "divideBy is required" }
      check(roundValue != null) { "round is required" }
      return InlineV1PricesPostRequestFormTransformQuantityXc0c69d44(
        divideBy = divideBy,
        round = round,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PricesPostRequestFormTransformQuantityXc0c69d44 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PricesPostRequestFormTransformQuantityXc0c69d44> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PricesPostRequestFormTransformQuantityXc0c69d44 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PricesPostRequestFormTransformQuantityXc0c69d44")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PricesPostRequestFormTransformQuantityXc0c69d44 must be a JSON object")
      val divideBy = json.decodeRequired<Int>(rawObject, "divide_by")
      val round = json.decodeRequired<InlineV1PricesPostRequestFormTransformQuantityRoundXec72de8f>(rawObject, "round")
      return InlineV1PricesPostRequestFormTransformQuantityXc0c69d44(
        divideBy = divideBy,
        round = round,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PricesPostRequestFormTransformQuantityXc0c69d44) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PricesPostRequestFormTransformQuantityXc0c69d44")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("divide_by", json.encodeToJsonElement(value.divideBy))
        put("round", json.encodeToJsonElement(value.round))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PricesPostRequestFormTransformQuantityXc0c69d44(block: InlineV1PricesPostRequestFormTransformQuantityXc0c69d44.Builder.() -> Unit): InlineV1PricesPostRequestFormTransformQuantityXc0c69d44 = InlineV1PricesPostRequestFormTransformQuantityXc0c69d44.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PricesPostRequestFormTransformQuantityXc0c69d44 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
