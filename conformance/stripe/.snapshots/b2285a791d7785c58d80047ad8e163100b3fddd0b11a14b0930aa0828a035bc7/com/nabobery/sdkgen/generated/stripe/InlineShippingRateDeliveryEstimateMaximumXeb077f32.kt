package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineShippingRateDeliveryEstimateMaximumXeb077f32Branch {
  ShippingRateDeliveryEstimateBound,
}

public sealed class InlineShippingRateDeliveryEstimateMaximumXeb077f32DecodingException(
  message: String,
) : SerializationException(message)

public class InlineShippingRateDeliveryEstimateMaximumXeb077f32NoMatchException(
  message: String,
) : InlineShippingRateDeliveryEstimateMaximumXeb077f32DecodingException(message)

internal data class InlineShippingRateDeliveryEstimateMaximumXeb077f32Inspection(
  public val matchesShippingRateDeliveryEstimateBound: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesShippingRateDeliveryEstimateBound).count { it }
}

/**
 * The upper bound of the estimated range. If empty, represents no upper bound i.e., infinite.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/shipping_rate_delivery_estimate/properties/maximum
 */
@Serializable(with = InlineShippingRateDeliveryEstimateMaximumXeb077f32.Serializer::class)
public class InlineShippingRateDeliveryEstimateMaximumXeb077f32 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineShippingRateDeliveryEstimateMaximumXeb077f32Inspection,
) {
  public val shippingRateDeliveryEstimateBound: ShippingRateDeliveryEstimateBoundView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesShippingRateDeliveryEstimateBound) json.decodeFromJsonElement<ShippingRateDeliveryEstimateBoundView>(raw) else null }

  public val matchedBranches: Set<InlineShippingRateDeliveryEstimateMaximumXeb077f32Branch>
    get() = buildSet {
      if (inspection.matchesShippingRateDeliveryEstimateBound) add(InlineShippingRateDeliveryEstimateMaximumXeb077f32Branch.ShippingRateDeliveryEstimateBound)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineShippingRateDeliveryEstimateMaximumXeb077f32 {
      val inspection = inspectInlineShippingRateDeliveryEstimateMaximumXeb077f32(raw)
      if (inspection.matchCount == 0) {
        throw InlineShippingRateDeliveryEstimateMaximumXeb077f32NoMatchException("InlineShippingRateDeliveryEstimateMaximumXeb077f32 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineShippingRateDeliveryEstimateMaximumXeb077f32(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineShippingRateDeliveryEstimateMaximumXeb077f32> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineShippingRateDeliveryEstimateMaximumXeb077f32 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineShippingRateDeliveryEstimateMaximumXeb077f32")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineShippingRateDeliveryEstimateMaximumXeb077f32) {
      encoder.requireJsonEncoder("InlineShippingRateDeliveryEstimateMaximumXeb077f32").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineShippingRateDeliveryEstimateMaximumXeb077f32(element: JsonElement): InlineShippingRateDeliveryEstimateMaximumXeb077f32Inspection {
  val raw = element as? JsonObject ?: return InlineShippingRateDeliveryEstimateMaximumXeb077f32Inspection(
    matchesShippingRateDeliveryEstimateBound = false,
    failures = listOf("ShippingRateDeliveryEstimateBound: expected JSON object"),
  )
  val matchesShippingRateDeliveryEstimateBound = raw["unit"] != null && raw["value"] != null
  return InlineShippingRateDeliveryEstimateMaximumXeb077f32Inspection(
    matchesShippingRateDeliveryEstimateBound = matchesShippingRateDeliveryEstimateBound,
    failures = buildList {
      if (!matchesShippingRateDeliveryEstimateBound) add("ShippingRateDeliveryEstimateBound: required properties 'unit', 'value' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
