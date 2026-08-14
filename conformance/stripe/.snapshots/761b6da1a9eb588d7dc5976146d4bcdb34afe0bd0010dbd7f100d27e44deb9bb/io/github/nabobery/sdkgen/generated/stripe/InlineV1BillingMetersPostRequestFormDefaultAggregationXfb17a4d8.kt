package io.github.nabobery.sdkgen.generated.stripe

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
 * The default settings to aggregate a meter's events with.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1meters/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/default_aggregation
 */
@Serializable(with = InlineV1BillingMetersPostRequestFormDefaultAggregationXfb17a4d8.Serializer::class)
public class InlineV1BillingMetersPostRequestFormDefaultAggregationXfb17a4d8(
  public val formula: InlineV1BillingMetersPostRequestFormDefaultAggregationFormulaX793833c0,
) {
  public class Builder {
    private var formulaValue:
        InlineV1BillingMetersPostRequestFormDefaultAggregationFormulaX793833c0? = null

    public var formula: InlineV1BillingMetersPostRequestFormDefaultAggregationFormulaX793833c0
      get() = requireNotNull(formulaValue) { "formula is required" }
      set(`value`) {
        formulaValue = value
      }

    public fun build(): InlineV1BillingMetersPostRequestFormDefaultAggregationXfb17a4d8 {
      check(formulaValue != null) { "formula is required" }
      return InlineV1BillingMetersPostRequestFormDefaultAggregationXfb17a4d8(
        formula = formula,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BillingMetersPostRequestFormDefaultAggregationXfb17a4d8 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1BillingMetersPostRequestFormDefaultAggregationXfb17a4d8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingMetersPostRequestFormDefaultAggregationXfb17a4d8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingMetersPostRequestFormDefaultAggregationXfb17a4d8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BillingMetersPostRequestFormDefaultAggregationXfb17a4d8 must be a JSON object")
      val formula = json.decodeRequired<InlineV1BillingMetersPostRequestFormDefaultAggregationFormulaX793833c0>(rawObject, "formula")
      return InlineV1BillingMetersPostRequestFormDefaultAggregationXfb17a4d8(
        formula = formula,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingMetersPostRequestFormDefaultAggregationXfb17a4d8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingMetersPostRequestFormDefaultAggregationXfb17a4d8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("formula", json.encodeToJsonElement(value.formula))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1BillingMetersPostRequestFormDefaultAggregationXfb17a4d8(block: InlineV1BillingMetersPostRequestFormDefaultAggregationXfb17a4d8.Builder.() -> Unit): InlineV1BillingMetersPostRequestFormDefaultAggregationXfb17a4d8 = InlineV1BillingMetersPostRequestFormDefaultAggregationXfb17a4d8.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1BillingMetersPostRequestFormDefaultAggregationXfb17a4d8 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
