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

public enum class InlineBillingBillResourceI4934SubscriptionDetailsX69eb365aBranch {
  BillingBillResourceInvoiceItemParentsInvoiceItemSubscriptionParent,
}

public sealed class InlineBillingBillResourceI4934SubscriptionDetailsX69eb365aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineBillingBillResourceI4934SubscriptionDetailsX69eb365aNoMatchException(
  message: String,
) : InlineBillingBillResourceI4934SubscriptionDetailsX69eb365aDecodingException(message)

internal data class InlineBillingBillResourceI4934SubscriptionDetailsX69eb365aInspection(
  public val matchesBillingBillResourceInvoiceItemParentsInvoiceItemSubscriptionParent: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBillingBillResourceInvoiceItemParentsInvoiceItemSubscriptionParent).count { it }
}

/**
 * Details about the subscription that generated this invoice item
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/billing_bill_resource_invoice_item_parents_invoice_item_parent/prope
 * rties/subscription_details
 */
@Serializable(with = InlineBillingBillResourceI4934SubscriptionDetailsX69eb365a.Serializer::class)
public class InlineBillingBillResourceI4934SubscriptionDetailsX69eb365a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineBillingBillResourceI4934SubscriptionDetailsX69eb365aInspection,
) {
  public val billingBillResourceInvoiceItemParentsInvoiceItemSubscriptionParent:
      BillingBillResourceInvoiceItemParentsInvoiceItemSubscriptionParentView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBillingBillResourceInvoiceItemParentsInvoiceItemSubscriptionParent) json.decodeFromJsonElement<BillingBillResourceInvoiceItemParentsInvoiceItemSubscriptionParentView>(raw) else null }

  public val matchedBranches: Set<InlineBillingBillResourceI4934SubscriptionDetailsX69eb365aBranch>
    get() = buildSet {
      if (inspection.matchesBillingBillResourceInvoiceItemParentsInvoiceItemSubscriptionParent) add(InlineBillingBillResourceI4934SubscriptionDetailsX69eb365aBranch.BillingBillResourceInvoiceItemParentsInvoiceItemSubscriptionParent)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineBillingBillResourceI4934SubscriptionDetailsX69eb365a {
      val inspection = inspectInlineBillingBillResourceI4934SubscriptionDetailsX69eb365a(raw)
      if (inspection.matchCount == 0) {
        throw InlineBillingBillResourceI4934SubscriptionDetailsX69eb365aNoMatchException("InlineBillingBillResourceI4934SubscriptionDetailsX69eb365a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineBillingBillResourceI4934SubscriptionDetailsX69eb365a(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineBillingBillResourceI4934SubscriptionDetailsX69eb365a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBillingBillResourceI4934SubscriptionDetailsX69eb365a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBillingBillResourceI4934SubscriptionDetailsX69eb365a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineBillingBillResourceI4934SubscriptionDetailsX69eb365a) {
      encoder.requireJsonEncoder("InlineBillingBillResourceI4934SubscriptionDetailsX69eb365a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineBillingBillResourceI4934SubscriptionDetailsX69eb365a(element: JsonElement): InlineBillingBillResourceI4934SubscriptionDetailsX69eb365aInspection {
  val raw = element as? JsonObject ?: return InlineBillingBillResourceI4934SubscriptionDetailsX69eb365aInspection(
    matchesBillingBillResourceInvoiceItemParentsInvoiceItemSubscriptionParent = false,
    failures = listOf("BillingBillResourceInvoiceItemParentsInvoiceItemSubscriptionParent: expected JSON object"),
  )
  val matchesBillingBillResourceInvoiceItemParentsInvoiceItemSubscriptionParent = raw["subscription"].isString()
  return InlineBillingBillResourceI4934SubscriptionDetailsX69eb365aInspection(
    matchesBillingBillResourceInvoiceItemParentsInvoiceItemSubscriptionParent = matchesBillingBillResourceInvoiceItemParentsInvoiceItemSubscriptionParent,
    failures = buildList {
      if (!matchesBillingBillResourceInvoiceItemParentsInvoiceItemSubscriptionParent) add("BillingBillResourceInvoiceItemParentsInvoiceItemSubscriptionParent: required properties 'subscription' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
