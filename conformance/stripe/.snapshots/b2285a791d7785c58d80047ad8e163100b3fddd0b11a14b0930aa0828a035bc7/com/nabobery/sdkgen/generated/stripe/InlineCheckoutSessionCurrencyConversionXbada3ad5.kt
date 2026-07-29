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

public enum class InlineCheckoutSessionCurrencyConversionXbada3ad5Branch {
  PaymentPagesCheckoutSessionCurrencyConversion,
}

public sealed class InlineCheckoutSessionCurrencyConversionXbada3ad5DecodingException(
  message: String,
) : SerializationException(message)

public class InlineCheckoutSessionCurrencyConversionXbada3ad5NoMatchException(
  message: String,
) : InlineCheckoutSessionCurrencyConversionXbada3ad5DecodingException(message)

internal data class InlineCheckoutSessionCurrencyConversionXbada3ad5Inspection(
  public val matchesPaymentPagesCheckoutSessionCurrencyConversion: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentPagesCheckoutSessionCurrencyConversion).count { it }
}

/**
 * Currency conversion details for [Adaptive Pricing](https://docs.stripe.com/payments/checkout/adaptive-pricing)
 * sessions created before 2025-03-31.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout.session/properties/currency_conversion
 */
@Serializable(with = InlineCheckoutSessionCurrencyConversionXbada3ad5.Serializer::class)
public class InlineCheckoutSessionCurrencyConversionXbada3ad5 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCheckoutSessionCurrencyConversionXbada3ad5Inspection,
) {
  public val paymentPagesCheckoutSessionCurrencyConversion:
      PaymentPagesCheckoutSessionCurrencyConversionView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentPagesCheckoutSessionCurrencyConversion) json.decodeFromJsonElement<PaymentPagesCheckoutSessionCurrencyConversionView>(raw) else null }

  public val matchedBranches: Set<InlineCheckoutSessionCurrencyConversionXbada3ad5Branch>
    get() = buildSet {
      if (inspection.matchesPaymentPagesCheckoutSessionCurrencyConversion) add(InlineCheckoutSessionCurrencyConversionXbada3ad5Branch.PaymentPagesCheckoutSessionCurrencyConversion)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCheckoutSessionCurrencyConversionXbada3ad5 {
      val inspection = inspectInlineCheckoutSessionCurrencyConversionXbada3ad5(raw)
      if (inspection.matchCount == 0) {
        throw InlineCheckoutSessionCurrencyConversionXbada3ad5NoMatchException("InlineCheckoutSessionCurrencyConversionXbada3ad5 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCheckoutSessionCurrencyConversionXbada3ad5(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineCheckoutSessionCurrencyConversionXbada3ad5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCheckoutSessionCurrencyConversionXbada3ad5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCheckoutSessionCurrencyConversionXbada3ad5")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutSessionCurrencyConversionXbada3ad5) {
      encoder.requireJsonEncoder("InlineCheckoutSessionCurrencyConversionXbada3ad5").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCheckoutSessionCurrencyConversionXbada3ad5(element: JsonElement): InlineCheckoutSessionCurrencyConversionXbada3ad5Inspection {
  val raw = element as? JsonObject ?: return InlineCheckoutSessionCurrencyConversionXbada3ad5Inspection(
    matchesPaymentPagesCheckoutSessionCurrencyConversion = false,
    failures = listOf("PaymentPagesCheckoutSessionCurrencyConversion: expected JSON object"),
  )
  val matchesPaymentPagesCheckoutSessionCurrencyConversion = raw["amount_subtotal"] != null && raw["amount_total"] != null && raw["fx_rate"].isString() && raw["source_currency"].isString()
  return InlineCheckoutSessionCurrencyConversionXbada3ad5Inspection(
    matchesPaymentPagesCheckoutSessionCurrencyConversion = matchesPaymentPagesCheckoutSessionCurrencyConversion,
    failures = buildList {
      if (!matchesPaymentPagesCheckoutSessionCurrencyConversion) add("PaymentPagesCheckoutSessionCurrencyConversion: required properties 'amount_subtotal', 'amount_total', 'fx_rate', 'source_currency' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
