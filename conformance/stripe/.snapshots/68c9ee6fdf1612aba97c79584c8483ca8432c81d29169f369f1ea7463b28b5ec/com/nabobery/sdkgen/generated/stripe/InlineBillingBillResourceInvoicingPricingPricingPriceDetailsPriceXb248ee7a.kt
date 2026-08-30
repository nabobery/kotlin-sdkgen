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

public enum class InlineBillingBillResourceInvoicingPricingPricingPriceDetailsPriceXb248ee7aBranch {
  Branch1,
  Price,
}

public sealed class InlineBillingBillResourceInvoicingPricingPricingPriceDetailsPriceXb248ee7aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineBillingBillResourceInvoicingPricingPricingPriceDetailsPriceXb248ee7aNoMatchException(
  message: String,
) : InlineBillingBillResourceInvoicingPricingPricingPriceDetailsPriceXb248ee7aDecodingException(message)

internal data class InlineBillingBillResourceInvoicingPricingPricingPriceDetailsPriceXb248ee7aInspection(
  public val matchesBranch1: Boolean,
  public val matchesPrice: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesPrice).count { it }
}

/**
 * The ID of the price this item is associated with.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/billing_bill_resource_invoicing_pricing_pricing_price_details/proper
 * ties/price
 */
@Serializable(with = InlineBillingBillResourceInvoicingPricingPricingPriceDetailsPriceXb248ee7a.Serializer::class)
public class InlineBillingBillResourceInvoicingPricingPricingPriceDetailsPriceXb248ee7a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineBillingBillResourceInvoicingPricingPricingPriceDetailsPriceXb248ee7aInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val price: Price? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPrice) json.decodeFromJsonElement<Price>(raw) else null }

  public val matchedBranches:
      Set<InlineBillingBillResourceInvoicingPricingPricingPriceDetailsPriceXb248ee7aBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineBillingBillResourceInvoicingPricingPricingPriceDetailsPriceXb248ee7aBranch.Branch1)
      if (inspection.matchesPrice) add(InlineBillingBillResourceInvoicingPricingPricingPriceDetailsPriceXb248ee7aBranch.Price)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineBillingBillResourceInvoicingPricingPricingPriceDetailsPriceXb248ee7a {
      val inspection = inspectInlineBillingBillResourceInvoicingPricingPricingPriceDetailsPriceXb248ee7a(raw)
      if (inspection.matchCount == 0) {
        throw InlineBillingBillResourceInvoicingPricingPricingPriceDetailsPriceXb248ee7aNoMatchException("InlineBillingBillResourceInvoicingPricingPricingPriceDetailsPriceXb248ee7a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineBillingBillResourceInvoicingPricingPricingPriceDetailsPriceXb248ee7a(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineBillingBillResourceInvoicingPricingPricingPriceDetailsPriceXb248ee7a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBillingBillResourceInvoicingPricingPricingPriceDetailsPriceXb248ee7a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBillingBillResourceInvoicingPricingPricingPriceDetailsPriceXb248ee7a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineBillingBillResourceInvoicingPricingPricingPriceDetailsPriceXb248ee7a) {
      encoder.requireJsonEncoder("InlineBillingBillResourceInvoicingPricingPricingPriceDetailsPriceXb248ee7a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineBillingBillResourceInvoicingPricingPricingPriceDetailsPriceXb248ee7a(element: JsonElement): InlineBillingBillResourceInvoicingPricingPricingPriceDetailsPriceXb248ee7aInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesPrice = element.isJsonDecodable<Price>()
  return InlineBillingBillResourceInvoicingPricingPricingPriceDetailsPriceXb248ee7aInspection(
    matchesBranch1 = matchesBranch1,
    matchesPrice = matchesPrice,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesPrice) add("Price: value does not match Price")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
