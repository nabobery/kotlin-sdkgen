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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlinePaymentPagesCheckoutSessionShippingCostShippingRateX5b77a1d9Branch {
  Branch1,
  ShippingRate,
}

public sealed class InlinePaymentPagesCheckoutSessionShippingCostShippingRateX5b77a1d9DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentPagesCheckoutSessionShippingCostShippingRateX5b77a1d9NoMatchException(
  message: String,
) : InlinePaymentPagesCheckoutSessionShippingCostShippingRateX5b77a1d9DecodingException(message)

internal data class InlinePaymentPagesCheckoutSessionShippingCostShippingRateX5b77a1d9Inspection(
  public val matchesBranch1: Boolean,
  public val matchesShippingRate: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesShippingRate).count { it }
}

/**
 * The ID of the ShippingRate for this order.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_shipping_cost/properties/shipping_rat
 * e
 */
@Serializable(with = InlinePaymentPagesCheckoutSessionShippingCostShippingRateX5b77a1d9.Serializer::class)
public class InlinePaymentPagesCheckoutSessionShippingCostShippingRateX5b77a1d9 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlinePaymentPagesCheckoutSessionShippingCostShippingRateX5b77a1d9Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val shippingRate: ShippingRate? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesShippingRate) json.decodeFromJsonElement<ShippingRate>(raw) else null }

  public val matchedBranches:
      Set<InlinePaymentPagesCheckoutSessionShippingCostShippingRateX5b77a1d9Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlinePaymentPagesCheckoutSessionShippingCostShippingRateX5b77a1d9Branch.Branch1)
      if (inspection.matchesShippingRate) add(InlinePaymentPagesCheckoutSessionShippingCostShippingRateX5b77a1d9Branch.ShippingRate)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentPagesCheckoutSessionShippingCostShippingRateX5b77a1d9 {
      val inspection = inspectInlinePaymentPagesCheckoutSessionShippingCostShippingRateX5b77a1d9(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentPagesCheckoutSessionShippingCostShippingRateX5b77a1d9NoMatchException("InlinePaymentPagesCheckoutSessionShippingCostShippingRateX5b77a1d9 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentPagesCheckoutSessionShippingCostShippingRateX5b77a1d9(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentPagesCheckoutSessionShippingCostShippingRateX5b77a1d9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentPagesCheckoutSessionShippingCostShippingRateX5b77a1d9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentPagesCheckoutSessionShippingCostShippingRateX5b77a1d9")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentPagesCheckoutSessionShippingCostShippingRateX5b77a1d9) {
      encoder.requireJsonEncoder("InlinePaymentPagesCheckoutSessionShippingCostShippingRateX5b77a1d9").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentPagesCheckoutSessionShippingCostShippingRateX5b77a1d9(element: JsonElement): InlinePaymentPagesCheckoutSessionShippingCostShippingRateX5b77a1d9Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesShippingRate = element.isJsonDecodable<ShippingRate>()
  return InlinePaymentPagesCheckoutSessionShippingCostShippingRateX5b77a1d9Inspection(
    matchesBranch1 = matchesBranch1,
    matchesShippingRate = matchesShippingRate,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesShippingRate) add("ShippingRate: value does not match ShippingRate")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
