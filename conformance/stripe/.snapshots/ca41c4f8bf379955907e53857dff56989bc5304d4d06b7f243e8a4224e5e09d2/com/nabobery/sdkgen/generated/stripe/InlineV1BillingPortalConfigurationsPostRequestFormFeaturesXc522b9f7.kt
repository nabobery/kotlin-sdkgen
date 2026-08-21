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
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/features
 */
@Serializable(with = InlineV1BillingPortalConfigurationsPostRequestFormFeaturesXc522b9f7.Serializer::class)
public class InlineV1BillingPortalConfigurationsPostRequestFormFeaturesXc522b9f7(
  public val customerUpdate:
      InlineV1BillingPortalConfiab44PostRequestFormFeaturesCustomerUpdateX94b0b355? = null,
  public val invoiceHistory:
      InlineV1BillingPortalConfiab44PostRequestFormFeaturesInvoiceHistoryXd324f088? = null,
  public val paymentMethodUpdate:
      InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodUpdateXc5a1340f? = null,
  public val subscriptionCancel:
      InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionCancelX97fe34ab? = null,
  public val subscriptionUpdate:
      InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionUpdateX8729b148? = null,
) {
  public class Builder {
    public var customerUpdate:
        InlineV1BillingPortalConfiab44PostRequestFormFeaturesCustomerUpdateX94b0b355? = null

    public var invoiceHistory:
        InlineV1BillingPortalConfiab44PostRequestFormFeaturesInvoiceHistoryXd324f088? = null

    public var paymentMethodUpdate:
        InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodUpdateXc5a1340f? = null

    public var subscriptionCancel:
        InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionCancelX97fe34ab? = null

    public var subscriptionUpdate:
        InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionUpdateX8729b148? = null

    public fun build(): InlineV1BillingPortalConfigurationsPostRequestFormFeaturesXc522b9f7 = InlineV1BillingPortalConfigurationsPostRequestFormFeaturesXc522b9f7(
      customerUpdate = customerUpdate,
      invoiceHistory = invoiceHistory,
      paymentMethodUpdate = paymentMethodUpdate,
      subscriptionCancel = subscriptionCancel,
      subscriptionUpdate = subscriptionUpdate,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BillingPortalConfigurationsPostRequestFormFeaturesXc522b9f7 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1BillingPortalConfigurationsPostRequestFormFeaturesXc522b9f7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingPortalConfigurationsPostRequestFormFeaturesXc522b9f7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingPortalConfigurationsPostRequestFormFeaturesXc522b9f7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BillingPortalConfigurationsPostRequestFormFeaturesXc522b9f7 must be a JSON object")
      return InlineV1BillingPortalConfigurationsPostRequestFormFeaturesXc522b9f7(
        customerUpdate = rawObject["customer_update"]?.let { json.decodeFromJsonElement<InlineV1BillingPortalConfiab44PostRequestFormFeaturesCustomerUpdateX94b0b355>(it) },
        invoiceHistory = rawObject["invoice_history"]?.let { json.decodeFromJsonElement<InlineV1BillingPortalConfiab44PostRequestFormFeaturesInvoiceHistoryXd324f088>(it) },
        paymentMethodUpdate = rawObject["payment_method_update"]?.let { json.decodeFromJsonElement<InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodUpdateXc5a1340f>(it) },
        subscriptionCancel = rawObject["subscription_cancel"]?.let { json.decodeFromJsonElement<InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionCancelX97fe34ab>(it) },
        subscriptionUpdate = rawObject["subscription_update"]?.let { json.decodeFromJsonElement<InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionUpdateX8729b148>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingPortalConfigurationsPostRequestFormFeaturesXc522b9f7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingPortalConfigurationsPostRequestFormFeaturesXc522b9f7")
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

public fun inlineV1BillingPortalConfigurationsPostRequestFormFeaturesXc522b9f7(block: InlineV1BillingPortalConfigurationsPostRequestFormFeaturesXc522b9f7.Builder.() -> Unit): InlineV1BillingPortalConfigurationsPostRequestFormFeaturesXc522b9f7 = InlineV1BillingPortalConfigurationsPostRequestFormFeaturesXc522b9f7.build(block)
