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

public enum class InlineBillingBillResourceI0765SubscriptionDetailsXc39ddbddBranch {
  BillingBillResourceInvoicingParentsInvoiceSubscriptionParent,
}

public sealed class InlineBillingBillResourceI0765SubscriptionDetailsXc39ddbddDecodingException(
  message: String,
) : SerializationException(message)

public class InlineBillingBillResourceI0765SubscriptionDetailsXc39ddbddNoMatchException(
  message: String,
) : InlineBillingBillResourceI0765SubscriptionDetailsXc39ddbddDecodingException(message)

internal data class InlineBillingBillResourceI0765SubscriptionDetailsXc39ddbddInspection(
  public val matchesBillingBillResourceInvoicingParentsInvoiceSubscriptionParent: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBillingBillResourceInvoicingParentsInvoiceSubscriptionParent).count { it }
}

/**
 * Details about the subscription that generated this invoice
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/billing_bill_resource_invoicing_parents_invoice_parent/properties/su
 * bscription_details
 */
@Serializable(with = InlineBillingBillResourceI0765SubscriptionDetailsXc39ddbdd.Serializer::class)
public class InlineBillingBillResourceI0765SubscriptionDetailsXc39ddbdd internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineBillingBillResourceI0765SubscriptionDetailsXc39ddbddInspection,
) {
  public val billingBillResourceInvoicingParentsInvoiceSubscriptionParent:
      BillingBillResourceInvoicingParentsInvoiceSubscriptionParentView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBillingBillResourceInvoicingParentsInvoiceSubscriptionParent) json.decodeFromJsonElement<BillingBillResourceInvoicingParentsInvoiceSubscriptionParentView>(raw) else null }

  public val matchedBranches: Set<InlineBillingBillResourceI0765SubscriptionDetailsXc39ddbddBranch>
    get() = buildSet {
      if (inspection.matchesBillingBillResourceInvoicingParentsInvoiceSubscriptionParent) add(InlineBillingBillResourceI0765SubscriptionDetailsXc39ddbddBranch.BillingBillResourceInvoicingParentsInvoiceSubscriptionParent)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineBillingBillResourceI0765SubscriptionDetailsXc39ddbdd {
      val inspection = inspectInlineBillingBillResourceI0765SubscriptionDetailsXc39ddbdd(raw)
      if (inspection.matchCount == 0) {
        throw InlineBillingBillResourceI0765SubscriptionDetailsXc39ddbddNoMatchException("InlineBillingBillResourceI0765SubscriptionDetailsXc39ddbdd matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineBillingBillResourceI0765SubscriptionDetailsXc39ddbdd(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineBillingBillResourceI0765SubscriptionDetailsXc39ddbdd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBillingBillResourceI0765SubscriptionDetailsXc39ddbdd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBillingBillResourceI0765SubscriptionDetailsXc39ddbdd")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineBillingBillResourceI0765SubscriptionDetailsXc39ddbdd) {
      encoder.requireJsonEncoder("InlineBillingBillResourceI0765SubscriptionDetailsXc39ddbdd").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineBillingBillResourceI0765SubscriptionDetailsXc39ddbdd(element: JsonElement): InlineBillingBillResourceI0765SubscriptionDetailsXc39ddbddInspection {
  val raw = element as? JsonObject ?: return InlineBillingBillResourceI0765SubscriptionDetailsXc39ddbddInspection(
    matchesBillingBillResourceInvoicingParentsInvoiceSubscriptionParent = false,
    failures = listOf("BillingBillResourceInvoicingParentsInvoiceSubscriptionParent: expected JSON object"),
  )
  val matchesBillingBillResourceInvoicingParentsInvoiceSubscriptionParent = raw["subscription"] != null
  return InlineBillingBillResourceI0765SubscriptionDetailsXc39ddbddInspection(
    matchesBillingBillResourceInvoicingParentsInvoiceSubscriptionParent = matchesBillingBillResourceInvoicingParentsInvoiceSubscriptionParent,
    failures = buildList {
      if (!matchesBillingBillResourceInvoicingParentsInvoiceSubscriptionParent) add("BillingBillResourceInvoicingParentsInvoiceSubscriptionParent: required properties 'subscription' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
