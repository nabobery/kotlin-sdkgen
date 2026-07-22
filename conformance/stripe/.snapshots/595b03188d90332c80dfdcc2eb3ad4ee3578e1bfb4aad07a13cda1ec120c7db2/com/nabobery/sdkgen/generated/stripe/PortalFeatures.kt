package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/portal_features
 */
@Serializable(with = PortalFeatures.Serializer::class)
public class PortalFeatures(
    public val customerUpdate: PortalCustomerUpdate,
    public val invoiceHistory: PortalInvoiceList,
    public val paymentMethodUpdate: PortalPaymentMethodUpdate,
    public val subscriptionCancel: PortalSubscriptionCancel,
    public val subscriptionUpdate: PortalSubscriptionUpdate,
) {
    public class Builder {
        private var customerUpdateValue: PortalCustomerUpdate? = null

        public var customerUpdate: PortalCustomerUpdate
            get() = requireNotNull(customerUpdateValue) { "customerUpdate is required" }
            set(`value`) {
                customerUpdateValue = value
            }

        private var invoiceHistoryValue: PortalInvoiceList? = null

        public var invoiceHistory: PortalInvoiceList
            get() = requireNotNull(invoiceHistoryValue) { "invoiceHistory is required" }
            set(`value`) {
                invoiceHistoryValue = value
            }

        private var paymentMethodUpdateValue: PortalPaymentMethodUpdate? = null

        public var paymentMethodUpdate: PortalPaymentMethodUpdate
            get() = requireNotNull(paymentMethodUpdateValue) { "paymentMethodUpdate is required" }
            set(`value`) {
                paymentMethodUpdateValue = value
            }

        private var subscriptionCancelValue: PortalSubscriptionCancel? = null

        public var subscriptionCancel: PortalSubscriptionCancel
            get() = requireNotNull(subscriptionCancelValue) { "subscriptionCancel is required" }
            set(`value`) {
                subscriptionCancelValue = value
            }

        private var subscriptionUpdateValue: PortalSubscriptionUpdate? = null

        public var subscriptionUpdate: PortalSubscriptionUpdate
            get() = requireNotNull(subscriptionUpdateValue) { "subscriptionUpdate is required" }
            set(`value`) {
                subscriptionUpdateValue = value
            }

        public fun build(): PortalFeatures {
            check(customerUpdateValue != null) { "customerUpdate is required" }
            check(invoiceHistoryValue != null) { "invoiceHistory is required" }
            check(paymentMethodUpdateValue != null) { "paymentMethodUpdate is required" }
            check(subscriptionCancelValue != null) { "subscriptionCancel is required" }
            check(subscriptionUpdateValue != null) { "subscriptionUpdate is required" }
            return PortalFeatures(
                customerUpdate = customerUpdate,
                invoiceHistory = invoiceHistory,
                paymentMethodUpdate = paymentMethodUpdate,
                subscriptionCancel = subscriptionCancel,
                subscriptionUpdate = subscriptionUpdate,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PortalFeatures = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PortalFeatures> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PortalFeatures {
            val jsonDecoder = decoder.requireJsonDecoder("PortalFeatures")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PortalFeatures must be a JSON object")
            val customerUpdate = json.decodeRequired<PortalCustomerUpdate>(rawObject, "customer_update")
            val invoiceHistory = json.decodeRequired<PortalInvoiceList>(rawObject, "invoice_history")
            val paymentMethodUpdate = json.decodeRequired<PortalPaymentMethodUpdate>(rawObject, "payment_method_update")
            val subscriptionCancel = json.decodeRequired<PortalSubscriptionCancel>(rawObject, "subscription_cancel")
            val subscriptionUpdate = json.decodeRequired<PortalSubscriptionUpdate>(rawObject, "subscription_update")
            return PortalFeatures(
                customerUpdate = customerUpdate,
                invoiceHistory = invoiceHistory,
                paymentMethodUpdate = paymentMethodUpdate,
                subscriptionCancel = subscriptionCancel,
                subscriptionUpdate = subscriptionUpdate,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PortalFeatures,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PortalFeatures")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("customer_update", json.encodeToJsonElement(value.customerUpdate))
                    put("invoice_history", json.encodeToJsonElement(value.invoiceHistory))
                    put("payment_method_update", json.encodeToJsonElement(value.paymentMethodUpdate))
                    put("subscription_cancel", json.encodeToJsonElement(value.subscriptionCancel))
                    put("subscription_update", json.encodeToJsonElement(value.subscriptionUpdate))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun portalFeatures(block: PortalFeatures.Builder.() -> Unit): PortalFeatures = PortalFeatures.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name] ?: throw SerializationException("PortalFeatures is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
