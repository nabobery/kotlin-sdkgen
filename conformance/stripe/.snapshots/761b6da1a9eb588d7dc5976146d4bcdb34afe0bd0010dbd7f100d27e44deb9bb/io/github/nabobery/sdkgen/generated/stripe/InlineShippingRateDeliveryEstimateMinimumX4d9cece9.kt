package io.github.nabobery.sdkgen.generated.stripe

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

public enum class InlineShippingRateDeliveryEstimateMinimumX4d9cece9Branch {
  ShippingRateDeliveryEstimateBound,
}

public sealed class InlineShippingRateDeliveryEstimateMinimumX4d9cece9DecodingException(
  message: String,
) : SerializationException(message)

public class InlineShippingRateDeliveryEstimateMinimumX4d9cece9NoMatchException(
  message: String,
) : InlineShippingRateDeliveryEstimateMinimumX4d9cece9DecodingException(message)

internal data class InlineShippingRateDeliveryEstimateMinimumX4d9cece9Inspection(
  public val matchesShippingRateDeliveryEstimateBound: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesShippingRateDeliveryEstimateBound).count { it }
}

/**
 * The lower bound of the estimated range. If empty, represents no lower bound.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/shipping_rate_delivery_estimate/properties/minimum
 */
@Serializable(with = InlineShippingRateDeliveryEstimateMinimumX4d9cece9.Serializer::class)
public class InlineShippingRateDeliveryEstimateMinimumX4d9cece9 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineShippingRateDeliveryEstimateMinimumX4d9cece9Inspection,
) {
  public val shippingRateDeliveryEstimateBound: ShippingRateDeliveryEstimateBoundView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesShippingRateDeliveryEstimateBound) json.decodeFromJsonElement<ShippingRateDeliveryEstimateBoundView>(raw) else null }

  public val matchedBranches: Set<InlineShippingRateDeliveryEstimateMinimumX4d9cece9Branch>
    get() = buildSet {
      if (inspection.matchesShippingRateDeliveryEstimateBound) add(InlineShippingRateDeliveryEstimateMinimumX4d9cece9Branch.ShippingRateDeliveryEstimateBound)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineShippingRateDeliveryEstimateMinimumX4d9cece9 {
      val inspection = inspectInlineShippingRateDeliveryEstimateMinimumX4d9cece9(raw)
      if (inspection.matchCount == 0) {
        throw InlineShippingRateDeliveryEstimateMinimumX4d9cece9NoMatchException("InlineShippingRateDeliveryEstimateMinimumX4d9cece9 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineShippingRateDeliveryEstimateMinimumX4d9cece9(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineShippingRateDeliveryEstimateMinimumX4d9cece9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineShippingRateDeliveryEstimateMinimumX4d9cece9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineShippingRateDeliveryEstimateMinimumX4d9cece9")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineShippingRateDeliveryEstimateMinimumX4d9cece9) {
      encoder.requireJsonEncoder("InlineShippingRateDeliveryEstimateMinimumX4d9cece9").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineShippingRateDeliveryEstimateMinimumX4d9cece9(element: JsonElement): InlineShippingRateDeliveryEstimateMinimumX4d9cece9Inspection {
  val raw = element as? JsonObject ?: return InlineShippingRateDeliveryEstimateMinimumX4d9cece9Inspection(
    matchesShippingRateDeliveryEstimateBound = false,
    failures = listOf("ShippingRateDeliveryEstimateBound: expected JSON object"),
  )
  val matchesShippingRateDeliveryEstimateBound = raw["unit"] != null && raw["value"] != null
  return InlineShippingRateDeliveryEstimateMinimumX4d9cece9Inspection(
    matchesShippingRateDeliveryEstimateBound = matchesShippingRateDeliveryEstimateBound,
    failures = buildList {
      if (!matchesShippingRateDeliveryEstimateBound) add("ShippingRateDeliveryEstimateBound: required properties 'unit', 'value' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
