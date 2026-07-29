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

public enum class InlineLineItemPricingX2cc3399aBranch {
  BillingBillResourceInvoicingPricingPricing,
}

public sealed class InlineLineItemPricingX2cc3399aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineLineItemPricingX2cc3399aNoMatchException(
  message: String,
) : InlineLineItemPricingX2cc3399aDecodingException(message)

internal data class InlineLineItemPricingX2cc3399aInspection(
  public val matchesBillingBillResourceInvoicingPricingPricing: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBillingBillResourceInvoicingPricingPricing).count { it }
}

/**
 * The pricing information of the line item.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/line_item/properties/pricing
 */
@Serializable(with = InlineLineItemPricingX2cc3399a.Serializer::class)
public class InlineLineItemPricingX2cc3399a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineLineItemPricingX2cc3399aInspection,
) {
  public val billingBillResourceInvoicingPricingPricing:
      BillingBillResourceInvoicingPricingPricingView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBillingBillResourceInvoicingPricingPricing) json.decodeFromJsonElement<BillingBillResourceInvoicingPricingPricingView>(raw) else null }

  public val matchedBranches: Set<InlineLineItemPricingX2cc3399aBranch>
    get() = buildSet {
      if (inspection.matchesBillingBillResourceInvoicingPricingPricing) add(InlineLineItemPricingX2cc3399aBranch.BillingBillResourceInvoicingPricingPricing)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineLineItemPricingX2cc3399a {
      val inspection = inspectInlineLineItemPricingX2cc3399a(raw)
      if (inspection.matchCount == 0) {
        throw InlineLineItemPricingX2cc3399aNoMatchException("InlineLineItemPricingX2cc3399a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineLineItemPricingX2cc3399a(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineLineItemPricingX2cc3399a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineLineItemPricingX2cc3399a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineLineItemPricingX2cc3399a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineLineItemPricingX2cc3399a) {
      encoder.requireJsonEncoder("InlineLineItemPricingX2cc3399a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineLineItemPricingX2cc3399a(element: JsonElement): InlineLineItemPricingX2cc3399aInspection {
  val raw = element as? JsonObject ?: return InlineLineItemPricingX2cc3399aInspection(
    matchesBillingBillResourceInvoicingPricingPricing = false,
    failures = listOf("BillingBillResourceInvoicingPricingPricing: expected JSON object"),
  )
  val matchesBillingBillResourceInvoicingPricingPricing = raw["type"] != null
  return InlineLineItemPricingX2cc3399aInspection(
    matchesBillingBillResourceInvoicingPricingPricing = matchesBillingBillResourceInvoicingPricingPricing,
    failures = buildList {
      if (!matchesBillingBillResourceInvoicingPricingPricing) add("BillingBillResourceInvoicingPricingPricing: required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
