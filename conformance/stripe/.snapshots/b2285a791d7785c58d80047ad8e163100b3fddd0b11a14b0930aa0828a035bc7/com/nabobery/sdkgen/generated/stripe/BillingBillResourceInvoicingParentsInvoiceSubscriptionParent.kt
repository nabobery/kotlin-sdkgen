package com.nabobery.sdkgen.generated.stripe

import kotlin.ConsistentCopyVisibility
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@ConsistentCopyVisibility
@Serializable
public data class BillingBillResourceInvoicingParentsInvoiceSubscriptionParentView internal constructor(
  public val metadata: Map<String, String>? = null,
  public val subscription: InlineBillingBillResourceIb302SubscriptionX174cd364,
  @SerialName("subscription_proration_date")
  public val subscriptionProrationDate: Int? = null,
)

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/billing_bill_resource_invoicing_parents_invoice_subscription_parent
 */
@Serializable(with = BillingBillResourceInvoicingParentsInvoiceSubscriptionParent.Serializer::class)
public class BillingBillResourceInvoicingParentsInvoiceSubscriptionParent(
  /**
   * The subscription that generated this invoice
   */
  public val subscription: InlineBillingBillResourceIb302SubscriptionX174cd364,
  metadata: Map<String, String>? = null,
  /**
   * Only set for upcoming invoices that preview prorations. The time used to calculate prorations.
   */
  public val subscriptionProrationDate: Int? = null,
) {
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) defined as subscription metadata when an invoice is
   * created. Becomes an immutable snapshot of the subscription metadata at the time of invoice finalization.
   * *Note: This attribute is populated only for invoices created on or after June 29, 2023.*
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var subscriptionValue: InlineBillingBillResourceIb302SubscriptionX174cd364? = null

    public var subscription: InlineBillingBillResourceIb302SubscriptionX174cd364
      get() = requireNotNull(subscriptionValue) { "subscription is required" }
      set(`value`) {
        subscriptionValue = value
      }

    private var metadataValue: Map<String, String>? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) defined as subscription metadata when an invoice
     * is created. Becomes an immutable snapshot of the subscription metadata at the time of invoice finalization.
     * *Note: This attribute is populated only for invoices created on or after June 29, 2023.*
     */
    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * Only set for upcoming invoices that preview prorations. The time used to calculate prorations.
     */
    public var subscriptionProrationDate: Int? = null

    public fun build(): BillingBillResourceInvoicingParentsInvoiceSubscriptionParent {
      check(subscriptionValue != null) { "subscription is required" }
      return BillingBillResourceInvoicingParentsInvoiceSubscriptionParent(
        subscription = subscription,
        metadata = metadata,
        subscriptionProrationDate = subscriptionProrationDate,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BillingBillResourceInvoicingParentsInvoiceSubscriptionParent = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<BillingBillResourceInvoicingParentsInvoiceSubscriptionParent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BillingBillResourceInvoicingParentsInvoiceSubscriptionParent {
      val jsonDecoder = decoder.requireJsonDecoder("BillingBillResourceInvoicingParentsInvoiceSubscriptionParent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BillingBillResourceInvoicingParentsInvoiceSubscriptionParent must be a JSON object")
      val subscription = json.decodeRequired<InlineBillingBillResourceIb302SubscriptionX174cd364>(rawObject, "subscription")
      return BillingBillResourceInvoicingParentsInvoiceSubscriptionParent(
        subscription = subscription,
        metadata = rawObject["metadata"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Map<String, String>?>(element) },
        subscriptionProrationDate = rawObject["subscription_proration_date"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: BillingBillResourceInvoicingParentsInvoiceSubscriptionParent) {
      val jsonEncoder = encoder.requireJsonEncoder("BillingBillResourceInvoicingParentsInvoiceSubscriptionParent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("subscription", json.encodeToJsonElement(value.subscription))
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.subscriptionProrationDate?.let { put("subscription_proration_date", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun billingBillResourceInvoicingParentsInvoiceSubscriptionParent(block: BillingBillResourceInvoicingParentsInvoiceSubscriptionParent.Builder.() -> Unit): BillingBillResourceInvoicingParentsInvoiceSubscriptionParent = BillingBillResourceInvoicingParentsInvoiceSubscriptionParent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BillingBillResourceInvoicingParentsInvoiceSubscriptionParent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
