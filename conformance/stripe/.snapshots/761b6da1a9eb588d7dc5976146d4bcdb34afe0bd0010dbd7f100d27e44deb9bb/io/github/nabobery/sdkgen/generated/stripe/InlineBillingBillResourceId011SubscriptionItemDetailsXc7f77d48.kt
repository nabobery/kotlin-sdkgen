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

public enum class InlineBillingBillResourceId011SubscriptionItemDetailsXc7f77d48Branch {
  BillingBillResourceInvoicingLinesParentsInvoiceLineItemSubscriptionItemParent,
}

public sealed class InlineBillingBillResourceId011SubscriptionItemDetailsXc7f77d48DecodingException(
  message: String,
) : SerializationException(message)

public class InlineBillingBillResourceId011SubscriptionItemDetailsXc7f77d48NoMatchException(
  message: String,
) : InlineBillingBillResourceId011SubscriptionItemDetailsXc7f77d48DecodingException(message)

internal data class InlineBillingBillResourceId011SubscriptionItemDetailsXc7f77d48Inspection(
  public val matchesBillingBillResourceInvoicingLinesParentsInvoiceLineItemSubscriptionItemParent:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBillingBillResourceInvoicingLinesParentsInvoiceLineItemSubscriptionItemParent).count { it }
}

/**
 * Details about the subscription item that generated this line item
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/billing_bill_resource_invoicing_lines_parents_invoice_line_item_pare
 * nt/properties/subscription_item_details
 */
@Serializable(with = InlineBillingBillResourceId011SubscriptionItemDetailsXc7f77d48.Serializer::class)
public class InlineBillingBillResourceId011SubscriptionItemDetailsXc7f77d48 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineBillingBillResourceId011SubscriptionItemDetailsXc7f77d48Inspection,
) {
  public val billingBillResourceInvoicingLinesParentsInvoiceLineItemSubscriptionItemParent:
      BillingBillResourceInvoicingLinesParentsInvoiceLineItemSubscriptionItemParentView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBillingBillResourceInvoicingLinesParentsInvoiceLineItemSubscriptionItemParent) json.decodeFromJsonElement<BillingBillResourceInvoicingLinesParentsInvoiceLineItemSubscriptionItemParentView>(raw) else null }

  public val matchedBranches:
      Set<InlineBillingBillResourceId011SubscriptionItemDetailsXc7f77d48Branch>
    get() = buildSet {
      if (inspection.matchesBillingBillResourceInvoicingLinesParentsInvoiceLineItemSubscriptionItemParent) add(InlineBillingBillResourceId011SubscriptionItemDetailsXc7f77d48Branch.BillingBillResourceInvoicingLinesParentsInvoiceLineItemSubscriptionItemParent)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineBillingBillResourceId011SubscriptionItemDetailsXc7f77d48 {
      val inspection = inspectInlineBillingBillResourceId011SubscriptionItemDetailsXc7f77d48(raw)
      if (inspection.matchCount == 0) {
        throw InlineBillingBillResourceId011SubscriptionItemDetailsXc7f77d48NoMatchException("InlineBillingBillResourceId011SubscriptionItemDetailsXc7f77d48 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineBillingBillResourceId011SubscriptionItemDetailsXc7f77d48(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineBillingBillResourceId011SubscriptionItemDetailsXc7f77d48> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBillingBillResourceId011SubscriptionItemDetailsXc7f77d48 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBillingBillResourceId011SubscriptionItemDetailsXc7f77d48")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineBillingBillResourceId011SubscriptionItemDetailsXc7f77d48) {
      encoder.requireJsonEncoder("InlineBillingBillResourceId011SubscriptionItemDetailsXc7f77d48").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineBillingBillResourceId011SubscriptionItemDetailsXc7f77d48(element: JsonElement): InlineBillingBillResourceId011SubscriptionItemDetailsXc7f77d48Inspection {
  val raw = element as? JsonObject ?: return InlineBillingBillResourceId011SubscriptionItemDetailsXc7f77d48Inspection(
    matchesBillingBillResourceInvoicingLinesParentsInvoiceLineItemSubscriptionItemParent = false,
    failures = listOf("BillingBillResourceInvoicingLinesParentsInvoiceLineItemSubscriptionItemParent: expected JSON object"),
  )
  val matchesBillingBillResourceInvoicingLinesParentsInvoiceLineItemSubscriptionItemParent = raw["proration"] != null && raw["subscription_item"].isString()
  return InlineBillingBillResourceId011SubscriptionItemDetailsXc7f77d48Inspection(
    matchesBillingBillResourceInvoicingLinesParentsInvoiceLineItemSubscriptionItemParent = matchesBillingBillResourceInvoicingLinesParentsInvoiceLineItemSubscriptionItemParent,
    failures = buildList {
      if (!matchesBillingBillResourceInvoicingLinesParentsInvoiceLineItemSubscriptionItemParent) add("BillingBillResourceInvoicingLinesParentsInvoiceLineItemSubscriptionItemParent: required properties 'proration', 'subscription_item' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
