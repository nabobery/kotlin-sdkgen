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

public enum class InlineBillingBillResourceId011InvoiceItemDetailsX9fadf1d9Branch {
  BillingBillResourceInvoicingLinesParentsInvoiceLineItemInvoiceItemParent,
}

public sealed class InlineBillingBillResourceId011InvoiceItemDetailsX9fadf1d9DecodingException(
  message: String,
) : SerializationException(message)

public class InlineBillingBillResourceId011InvoiceItemDetailsX9fadf1d9NoMatchException(
  message: String,
) : InlineBillingBillResourceId011InvoiceItemDetailsX9fadf1d9DecodingException(message)

internal data class InlineBillingBillResourceId011InvoiceItemDetailsX9fadf1d9Inspection(
  public val matchesBillingBillResourceInvoicingLinesParentsInvoiceLineItemInvoiceItemParent:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBillingBillResourceInvoicingLinesParentsInvoiceLineItemInvoiceItemParent).count { it }
}

/**
 * Details about the invoice item that generated this line item
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/billing_bill_resource_invoicing_lines_parents_invoice_line_item_pare
 * nt/properties/invoice_item_details
 */
@Serializable(with = InlineBillingBillResourceId011InvoiceItemDetailsX9fadf1d9.Serializer::class)
public class InlineBillingBillResourceId011InvoiceItemDetailsX9fadf1d9 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineBillingBillResourceId011InvoiceItemDetailsX9fadf1d9Inspection,
) {
  public val billingBillResourceInvoicingLinesParentsInvoiceLineItemInvoiceItemParent:
      BillingBillResourceInvoicingLinesParentsInvoiceLineItemInvoiceItemParentView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBillingBillResourceInvoicingLinesParentsInvoiceLineItemInvoiceItemParent) json.decodeFromJsonElement<BillingBillResourceInvoicingLinesParentsInvoiceLineItemInvoiceItemParentView>(raw) else null }

  public val matchedBranches: Set<InlineBillingBillResourceId011InvoiceItemDetailsX9fadf1d9Branch>
    get() = buildSet {
      if (inspection.matchesBillingBillResourceInvoicingLinesParentsInvoiceLineItemInvoiceItemParent) add(InlineBillingBillResourceId011InvoiceItemDetailsX9fadf1d9Branch.BillingBillResourceInvoicingLinesParentsInvoiceLineItemInvoiceItemParent)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineBillingBillResourceId011InvoiceItemDetailsX9fadf1d9 {
      val inspection = inspectInlineBillingBillResourceId011InvoiceItemDetailsX9fadf1d9(raw)
      if (inspection.matchCount == 0) {
        throw InlineBillingBillResourceId011InvoiceItemDetailsX9fadf1d9NoMatchException("InlineBillingBillResourceId011InvoiceItemDetailsX9fadf1d9 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineBillingBillResourceId011InvoiceItemDetailsX9fadf1d9(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineBillingBillResourceId011InvoiceItemDetailsX9fadf1d9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBillingBillResourceId011InvoiceItemDetailsX9fadf1d9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBillingBillResourceId011InvoiceItemDetailsX9fadf1d9")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineBillingBillResourceId011InvoiceItemDetailsX9fadf1d9) {
      encoder.requireJsonEncoder("InlineBillingBillResourceId011InvoiceItemDetailsX9fadf1d9").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineBillingBillResourceId011InvoiceItemDetailsX9fadf1d9(element: JsonElement): InlineBillingBillResourceId011InvoiceItemDetailsX9fadf1d9Inspection {
  val raw = element as? JsonObject ?: return InlineBillingBillResourceId011InvoiceItemDetailsX9fadf1d9Inspection(
    matchesBillingBillResourceInvoicingLinesParentsInvoiceLineItemInvoiceItemParent = false,
    failures = listOf("BillingBillResourceInvoicingLinesParentsInvoiceLineItemInvoiceItemParent: expected JSON object"),
  )
  val matchesBillingBillResourceInvoicingLinesParentsInvoiceLineItemInvoiceItemParent = raw["invoice_item"].isString() && raw["proration"] != null
  return InlineBillingBillResourceId011InvoiceItemDetailsX9fadf1d9Inspection(
    matchesBillingBillResourceInvoicingLinesParentsInvoiceLineItemInvoiceItemParent = matchesBillingBillResourceInvoicingLinesParentsInvoiceLineItemInvoiceItemParent,
    failures = buildList {
      if (!matchesBillingBillResourceInvoicingLinesParentsInvoiceLineItemInvoiceItemParent) add("BillingBillResourceInvoicingLinesParentsInvoiceLineItemInvoiceItemParent: required properties 'invoice_item', 'proration' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
