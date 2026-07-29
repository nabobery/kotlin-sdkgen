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

public enum class InlineCheckoutSessionAdaptivePricingX9958aa95Branch {
  PaymentPagesCheckoutSessionAdaptivePricing,
}

public sealed class InlineCheckoutSessionAdaptivePricingX9958aa95DecodingException(
  message: String,
) : SerializationException(message)

public class InlineCheckoutSessionAdaptivePricingX9958aa95NoMatchException(
  message: String,
) : InlineCheckoutSessionAdaptivePricingX9958aa95DecodingException(message)

internal data class InlineCheckoutSessionAdaptivePricingX9958aa95Inspection(
  public val matchesPaymentPagesCheckoutSessionAdaptivePricing: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentPagesCheckoutSessionAdaptivePricing).count { it }
}

/**
 * Settings for price localization with [Adaptive Pricing](https://docs.stripe.com/payments/checkout/adaptive-pricing).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout.session/properties/adaptive_pricing
 */
@Serializable(with = InlineCheckoutSessionAdaptivePricingX9958aa95.Serializer::class)
public class InlineCheckoutSessionAdaptivePricingX9958aa95 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCheckoutSessionAdaptivePricingX9958aa95Inspection,
) {
  public val paymentPagesCheckoutSessionAdaptivePricing:
      PaymentPagesCheckoutSessionAdaptivePricingView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentPagesCheckoutSessionAdaptivePricing) json.decodeFromJsonElement<PaymentPagesCheckoutSessionAdaptivePricingView>(raw) else null }

  public val matchedBranches: Set<InlineCheckoutSessionAdaptivePricingX9958aa95Branch>
    get() = buildSet {
      if (inspection.matchesPaymentPagesCheckoutSessionAdaptivePricing) add(InlineCheckoutSessionAdaptivePricingX9958aa95Branch.PaymentPagesCheckoutSessionAdaptivePricing)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCheckoutSessionAdaptivePricingX9958aa95 {
      val inspection = inspectInlineCheckoutSessionAdaptivePricingX9958aa95(raw)
      if (inspection.matchCount == 0) {
        throw InlineCheckoutSessionAdaptivePricingX9958aa95NoMatchException("InlineCheckoutSessionAdaptivePricingX9958aa95 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCheckoutSessionAdaptivePricingX9958aa95(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineCheckoutSessionAdaptivePricingX9958aa95> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCheckoutSessionAdaptivePricingX9958aa95 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCheckoutSessionAdaptivePricingX9958aa95")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutSessionAdaptivePricingX9958aa95) {
      encoder.requireJsonEncoder("InlineCheckoutSessionAdaptivePricingX9958aa95").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCheckoutSessionAdaptivePricingX9958aa95(element: JsonElement): InlineCheckoutSessionAdaptivePricingX9958aa95Inspection {
  val raw = element as? JsonObject ?: return InlineCheckoutSessionAdaptivePricingX9958aa95Inspection(
    matchesPaymentPagesCheckoutSessionAdaptivePricing = false,
    failures = listOf("PaymentPagesCheckoutSessionAdaptivePricing: expected JSON object"),
  )
  val matchesPaymentPagesCheckoutSessionAdaptivePricing = raw["enabled"] != null
  return InlineCheckoutSessionAdaptivePricingX9958aa95Inspection(
    matchesPaymentPagesCheckoutSessionAdaptivePricing = matchesPaymentPagesCheckoutSessionAdaptivePricing,
    failures = buildList {
      if (!matchesPaymentPagesCheckoutSessionAdaptivePricing) add("PaymentPagesCheckoutSessionAdaptivePricing: required properties 'enabled' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
