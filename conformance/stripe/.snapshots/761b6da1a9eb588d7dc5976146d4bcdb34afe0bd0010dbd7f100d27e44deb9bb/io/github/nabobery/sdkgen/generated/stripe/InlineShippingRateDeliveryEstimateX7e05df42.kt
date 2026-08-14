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

public enum class InlineShippingRateDeliveryEstimateX7e05df42Branch {
  ShippingRateDeliveryEstimate,
}

public sealed class InlineShippingRateDeliveryEstimateX7e05df42DecodingException(
  message: String,
) : SerializationException(message)

public class InlineShippingRateDeliveryEstimateX7e05df42NoMatchException(
  message: String,
) : InlineShippingRateDeliveryEstimateX7e05df42DecodingException(message)

internal data class InlineShippingRateDeliveryEstimateX7e05df42Inspection(
  public val matchesShippingRateDeliveryEstimate: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesShippingRateDeliveryEstimate).count { it }
}

/**
 * The estimated range for how long shipping will take, meant to be displayable to the customer. This will appear on
 * CheckoutSessions.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/shipping_rate/properties/delivery_estimate
 */
@Serializable(with = InlineShippingRateDeliveryEstimateX7e05df42.Serializer::class)
public class InlineShippingRateDeliveryEstimateX7e05df42 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineShippingRateDeliveryEstimateX7e05df42Inspection,
) {
  public val shippingRateDeliveryEstimate: ShippingRateDeliveryEstimateView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesShippingRateDeliveryEstimate) json.decodeFromJsonElement<ShippingRateDeliveryEstimateView>(raw) else null }

  public val matchedBranches: Set<InlineShippingRateDeliveryEstimateX7e05df42Branch>
    get() = buildSet {
      if (inspection.matchesShippingRateDeliveryEstimate) add(InlineShippingRateDeliveryEstimateX7e05df42Branch.ShippingRateDeliveryEstimate)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineShippingRateDeliveryEstimateX7e05df42 {
      val inspection = inspectInlineShippingRateDeliveryEstimateX7e05df42(raw)
      if (inspection.matchCount == 0) {
        throw InlineShippingRateDeliveryEstimateX7e05df42NoMatchException("InlineShippingRateDeliveryEstimateX7e05df42 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineShippingRateDeliveryEstimateX7e05df42(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineShippingRateDeliveryEstimateX7e05df42> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineShippingRateDeliveryEstimateX7e05df42 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineShippingRateDeliveryEstimateX7e05df42")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineShippingRateDeliveryEstimateX7e05df42) {
      encoder.requireJsonEncoder("InlineShippingRateDeliveryEstimateX7e05df42").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineShippingRateDeliveryEstimateX7e05df42(element: JsonElement): InlineShippingRateDeliveryEstimateX7e05df42Inspection {
  val raw = element as? JsonObject ?: return InlineShippingRateDeliveryEstimateX7e05df42Inspection(
    matchesShippingRateDeliveryEstimate = false,
    failures = listOf("ShippingRateDeliveryEstimate: expected JSON object"),
  )
  val matchesShippingRateDeliveryEstimate = true
  return InlineShippingRateDeliveryEstimateX7e05df42Inspection(
    matchesShippingRateDeliveryEstimate = matchesShippingRateDeliveryEstimate,
    failures = buildList {
      if (!matchesShippingRateDeliveryEstimate) add("ShippingRateDeliveryEstimate: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
