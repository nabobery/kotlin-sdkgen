package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class BillingBillResourceInvoiceItemParentsInvoiceItemSubscriptionParentView(
  public val subscription: String,
  @SerialName("subscription_item")
  public val subscriptionItem: String? = null,
)

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/billing_bill_resource_invoice_item_parents_invoice_item_subscription
 * _parent
 */
@Serializable(with = BillingBillResourceInvoiceItemParentsInvoiceItemSubscriptionParent.Serializer::class)
public class BillingBillResourceInvoiceItemParentsInvoiceItemSubscriptionParent(
  /**
   * The subscription that generated this invoice item
   */
  public val subscription: String,
  /**
   * The subscription item that generated this invoice item
   */
  public val subscriptionItem: String? = null,
) {
  public class Builder {
    private var subscriptionValue: String? = null

    public var subscription: String
      get() = requireNotNull(subscriptionValue) { "subscription is required" }
      set(`value`) {
        subscriptionValue = value
      }

    /**
     * The subscription item that generated this invoice item
     */
    public var subscriptionItem: String? = null

    public fun build(): BillingBillResourceInvoiceItemParentsInvoiceItemSubscriptionParent {
      check(subscriptionValue != null) { "subscription is required" }
      return BillingBillResourceInvoiceItemParentsInvoiceItemSubscriptionParent(
        subscription = subscription,
        subscriptionItem = subscriptionItem,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BillingBillResourceInvoiceItemParentsInvoiceItemSubscriptionParent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BillingBillResourceInvoiceItemParentsInvoiceItemSubscriptionParent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BillingBillResourceInvoiceItemParentsInvoiceItemSubscriptionParent {
      val jsonDecoder = decoder.requireJsonDecoder("BillingBillResourceInvoiceItemParentsInvoiceItemSubscriptionParent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BillingBillResourceInvoiceItemParentsInvoiceItemSubscriptionParent must be a JSON object")
      val subscription = json.decodeRequired<String>(rawObject, "subscription")
      return BillingBillResourceInvoiceItemParentsInvoiceItemSubscriptionParent(
        subscription = subscription,
        subscriptionItem = rawObject["subscription_item"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: BillingBillResourceInvoiceItemParentsInvoiceItemSubscriptionParent) {
      val jsonEncoder = encoder.requireJsonEncoder("BillingBillResourceInvoiceItemParentsInvoiceItemSubscriptionParent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("subscription", value.subscription)
        value.subscriptionItem?.let { put("subscription_item", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun billingBillResourceInvoiceItemParentsInvoiceItemSubscriptionParent(block: BillingBillResourceInvoiceItemParentsInvoiceItemSubscriptionParent.Builder.() -> Unit): BillingBillResourceInvoiceItemParentsInvoiceItemSubscriptionParent = BillingBillResourceInvoiceItemParentsInvoiceItemSubscriptionParent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BillingBillResourceInvoiceItemParentsInvoiceItemSubscriptionParent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
