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

public enum class InlineBillingBillResourceI2ab7CreditedItemsX25e33ab9Branch {
  BillingBillResourceInvoicingLinesCommonCreditedItems,
}

public sealed class InlineBillingBillResourceI2ab7CreditedItemsX25e33ab9DecodingException(
  message: String,
) : SerializationException(message)

public class InlineBillingBillResourceI2ab7CreditedItemsX25e33ab9NoMatchException(
  message: String,
) : InlineBillingBillResourceI2ab7CreditedItemsX25e33ab9DecodingException(message)

internal data class InlineBillingBillResourceI2ab7CreditedItemsX25e33ab9Inspection(
  public val matchesBillingBillResourceInvoicingLinesCommonCreditedItems: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBillingBillResourceInvoicingLinesCommonCreditedItems).count { it }
}

/**
 * For a credit proration `line_item`, the original debit line_items to which the credit proration applies.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/billing_bill_resource_invoicing_lines_common_proration_details/prope
 * rties/credited_items
 */
@Serializable(with = InlineBillingBillResourceI2ab7CreditedItemsX25e33ab9.Serializer::class)
public class InlineBillingBillResourceI2ab7CreditedItemsX25e33ab9 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineBillingBillResourceI2ab7CreditedItemsX25e33ab9Inspection,
) {
  public val billingBillResourceInvoicingLinesCommonCreditedItems:
      BillingBillResourceInvoicingLinesCommonCreditedItemsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBillingBillResourceInvoicingLinesCommonCreditedItems) json.decodeFromJsonElement<BillingBillResourceInvoicingLinesCommonCreditedItemsView>(raw) else null }

  public val matchedBranches: Set<InlineBillingBillResourceI2ab7CreditedItemsX25e33ab9Branch>
    get() = buildSet {
      if (inspection.matchesBillingBillResourceInvoicingLinesCommonCreditedItems) add(InlineBillingBillResourceI2ab7CreditedItemsX25e33ab9Branch.BillingBillResourceInvoicingLinesCommonCreditedItems)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineBillingBillResourceI2ab7CreditedItemsX25e33ab9 {
      val inspection = inspectInlineBillingBillResourceI2ab7CreditedItemsX25e33ab9(raw)
      if (inspection.matchCount == 0) {
        throw InlineBillingBillResourceI2ab7CreditedItemsX25e33ab9NoMatchException("InlineBillingBillResourceI2ab7CreditedItemsX25e33ab9 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineBillingBillResourceI2ab7CreditedItemsX25e33ab9(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineBillingBillResourceI2ab7CreditedItemsX25e33ab9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBillingBillResourceI2ab7CreditedItemsX25e33ab9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBillingBillResourceI2ab7CreditedItemsX25e33ab9")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineBillingBillResourceI2ab7CreditedItemsX25e33ab9) {
      encoder.requireJsonEncoder("InlineBillingBillResourceI2ab7CreditedItemsX25e33ab9").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineBillingBillResourceI2ab7CreditedItemsX25e33ab9(element: JsonElement): InlineBillingBillResourceI2ab7CreditedItemsX25e33ab9Inspection {
  val raw = element as? JsonObject ?: return InlineBillingBillResourceI2ab7CreditedItemsX25e33ab9Inspection(
    matchesBillingBillResourceInvoicingLinesCommonCreditedItems = false,
    failures = listOf("BillingBillResourceInvoicingLinesCommonCreditedItems: expected JSON object"),
  )
  val matchesBillingBillResourceInvoicingLinesCommonCreditedItems = raw["invoice"].isString() && raw["invoice_line_items"].isStringArray()
  return InlineBillingBillResourceI2ab7CreditedItemsX25e33ab9Inspection(
    matchesBillingBillResourceInvoicingLinesCommonCreditedItems = matchesBillingBillResourceInvoicingLinesCommonCreditedItems,
    failures = buildList {
      if (!matchesBillingBillResourceInvoicingLinesCommonCreditedItems) add("BillingBillResourceInvoicingLinesCommonCreditedItems: required properties 'invoice', 'invoice_line_items' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
