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

public enum class InlinePaymentIntentAmountDetailsLineItemTaxX754180e6Branch {
  PaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourceTax,
}

public sealed class InlinePaymentIntentAmountDetailsLineItemTaxX754180e6DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentIntentAmountDetailsLineItemTaxX754180e6NoMatchException(
  message: String,
) : InlinePaymentIntentAmountDetailsLineItemTaxX754180e6DecodingException(message)

internal data class InlinePaymentIntentAmountDetailsLineItemTaxX754180e6Inspection(
  public val matchesPaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourceTax:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourceTax).count { it }
}

/**
 * Contains information about the tax on the item.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_amount_details_line_item/properties/tax
 */
@Serializable(with = InlinePaymentIntentAmountDetailsLineItemTaxX754180e6.Serializer::class)
public class InlinePaymentIntentAmountDetailsLineItemTaxX754180e6 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentIntentAmountDetailsLineItemTaxX754180e6Inspection,
) {
  public val paymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourceTax:
      PaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourceTaxView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourceTax) json.decodeFromJsonElement<PaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourceTaxView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentIntentAmountDetailsLineItemTaxX754180e6Branch>
    get() = buildSet {
      if (inspection.matchesPaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourceTax) add(InlinePaymentIntentAmountDetailsLineItemTaxX754180e6Branch.PaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourceTax)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentIntentAmountDetailsLineItemTaxX754180e6 {
      val inspection = inspectInlinePaymentIntentAmountDetailsLineItemTaxX754180e6(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentIntentAmountDetailsLineItemTaxX754180e6NoMatchException("InlinePaymentIntentAmountDetailsLineItemTaxX754180e6 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentIntentAmountDetailsLineItemTaxX754180e6(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentIntentAmountDetailsLineItemTaxX754180e6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentIntentAmountDetailsLineItemTaxX754180e6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentAmountDetailsLineItemTaxX754180e6")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentAmountDetailsLineItemTaxX754180e6) {
      encoder.requireJsonEncoder("InlinePaymentIntentAmountDetailsLineItemTaxX754180e6").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentIntentAmountDetailsLineItemTaxX754180e6(element: JsonElement): InlinePaymentIntentAmountDetailsLineItemTaxX754180e6Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentIntentAmountDetailsLineItemTaxX754180e6Inspection(
    matchesPaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourceTax = false,
    failures = listOf("PaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourceTax: expected JSON object"),
  )
  val matchesPaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourceTax = raw["total_tax_amount"] != null
  return InlinePaymentIntentAmountDetailsLineItemTaxX754180e6Inspection(
    matchesPaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourceTax = matchesPaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourceTax,
    failures = buildList {
      if (!matchesPaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourceTax) add("PaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourceTax: required properties 'total_tax_amount' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
