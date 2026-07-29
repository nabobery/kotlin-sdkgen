package com.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Information about the features available in the portal.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations~1{configuration}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/features
 */
@Serializable(with = InlineV1BillingPortalConfigurationsPostRequestFormFeaturesX378a9f5b.Serializer::class)
public class InlineV1BillingPortalConfigurationsPostRequestFormFeaturesX378a9f5b(
  public val customerUpdate:
      InlineV1BillingPortalConfiab44PostRequestFormFeaturesCustomerUpdateX5eb21c80? = null,
  public val invoiceHistory:
      InlineV1BillingPortalConfiab44PostRequestFormFeaturesInvoiceHistoryXd18abc6d? = null,
  public val paymentMethodUpdate:
      InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodUpdateX68b7baa0? = null,
  public val subscriptionCancel:
      InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionCancelX73570623? = null,
  public val subscriptionUpdate:
      InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionUpdateXc65ccefe? = null,
) {
  public class Builder {
    public var customerUpdate:
        InlineV1BillingPortalConfiab44PostRequestFormFeaturesCustomerUpdateX5eb21c80? = null

    public var invoiceHistory:
        InlineV1BillingPortalConfiab44PostRequestFormFeaturesInvoiceHistoryXd18abc6d? = null

    public var paymentMethodUpdate:
        InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodUpdateX68b7baa0? = null

    public var subscriptionCancel:
        InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionCancelX73570623? = null

    public var subscriptionUpdate:
        InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionUpdateXc65ccefe? = null

    public fun build(): InlineV1BillingPortalConfigurationsPostRequestFormFeaturesX378a9f5b = InlineV1BillingPortalConfigurationsPostRequestFormFeaturesX378a9f5b(
      customerUpdate = customerUpdate,
      invoiceHistory = invoiceHistory,
      paymentMethodUpdate = paymentMethodUpdate,
      subscriptionCancel = subscriptionCancel,
      subscriptionUpdate = subscriptionUpdate,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BillingPortalConfigurationsPostRequestFormFeaturesX378a9f5b = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1BillingPortalConfigurationsPostRequestFormFeaturesX378a9f5b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingPortalConfigurationsPostRequestFormFeaturesX378a9f5b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingPortalConfigurationsPostRequestFormFeaturesX378a9f5b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BillingPortalConfigurationsPostRequestFormFeaturesX378a9f5b must be a JSON object")
      return InlineV1BillingPortalConfigurationsPostRequestFormFeaturesX378a9f5b(
        customerUpdate = rawObject["customer_update"]?.let { json.decodeFromJsonElement<InlineV1BillingPortalConfiab44PostRequestFormFeaturesCustomerUpdateX5eb21c80>(it) },
        invoiceHistory = rawObject["invoice_history"]?.let { json.decodeFromJsonElement<InlineV1BillingPortalConfiab44PostRequestFormFeaturesInvoiceHistoryXd18abc6d>(it) },
        paymentMethodUpdate = rawObject["payment_method_update"]?.let { json.decodeFromJsonElement<InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodUpdateX68b7baa0>(it) },
        subscriptionCancel = rawObject["subscription_cancel"]?.let { json.decodeFromJsonElement<InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionCancelX73570623>(it) },
        subscriptionUpdate = rawObject["subscription_update"]?.let { json.decodeFromJsonElement<InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionUpdateXc65ccefe>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingPortalConfigurationsPostRequestFormFeaturesX378a9f5b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingPortalConfigurationsPostRequestFormFeaturesX378a9f5b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.customerUpdate?.let { put("customer_update", json.encodeToJsonElement(it)) }
        value.invoiceHistory?.let { put("invoice_history", json.encodeToJsonElement(it)) }
        value.paymentMethodUpdate?.let { put("payment_method_update", json.encodeToJsonElement(it)) }
        value.subscriptionCancel?.let { put("subscription_cancel", json.encodeToJsonElement(it)) }
        value.subscriptionUpdate?.let { put("subscription_update", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1BillingPortalConfigurationsPostRequestFormFeaturesX378a9f5b(block: InlineV1BillingPortalConfigurationsPostRequestFormFeaturesX378a9f5b.Builder.() -> Unit): InlineV1BillingPortalConfigurationsPostRequestFormFeaturesX378a9f5b = InlineV1BillingPortalConfigurationsPostRequestFormFeaturesX378a9f5b.build(block)
