package com.nabobery.sdkgen.generated.stripe

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
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_flows_private_payment_methods_paypal_amount_details_line_ite
 * m_payment_method_options
 */
@Serializable(with = PaymentFlowsPrivatePaymentMethodsPaypalAmountDetailsLineItemPaymentMethodOptions.Serializer::class)
public class PaymentFlowsPrivatePaymentMethodsPaypalAmountDetailsLineItemPaymentMethodOptions(
    /**
     * Type of the line item.
     */
    public val category: InlinePaymentFlowsPrivateP52b4CategoryXa8014b41? = null,
    /**
     * Description of the line item.
     */
    public val description: String? = null,
    /**
     * The Stripe account ID of the connected account that sells the item. This is only needed when using [Separate
     * Charges and Transfers](https://docs.stripe.com/connect/separate-charges-and-transfers).
     */
    public val soldBy: String? = null,
) {
    public class Builder {
        /**
         * Type of the line item.
         */
        public var category: InlinePaymentFlowsPrivateP52b4CategoryXa8014b41? = null

        /**
         * Description of the line item.
         */
        public var description: String? = null

        /**
         * The Stripe account ID of the connected account that sells the item. This is only needed when using [Separate
         * Charges and Transfers](https://docs.stripe.com/connect/separate-charges-and-transfers).
         */
        public var soldBy: String? = null

        public fun build(): PaymentFlowsPrivatePaymentMethodsPaypalAmountDetailsLineItemPaymentMethodOptions =
            PaymentFlowsPrivatePaymentMethodsPaypalAmountDetailsLineItemPaymentMethodOptions(
                category = category,
                description = description,
                soldBy = soldBy,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): PaymentFlowsPrivatePaymentMethodsPaypalAmountDetailsLineItemPaymentMethodOptions =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentFlowsPrivatePaymentMethodsPaypalAmountDetailsLineItemPaymentMethodOptions> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): PaymentFlowsPrivatePaymentMethodsPaypalAmountDetailsLineItemPaymentMethodOptions {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "PaymentFlowsPrivatePaymentMethodsPaypalAmountDetailsLineItemPaymentMethodOptions",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "PaymentFlowsPrivatePaymentMethodsPaypalAmountDetailsLineItemPaymentMethodOptions must be a JSON object",
                    )
            return PaymentFlowsPrivatePaymentMethodsPaypalAmountDetailsLineItemPaymentMethodOptions(
                category =
                    rawObject["category"]?.let {
                        json.decodeFromJsonElement<InlinePaymentFlowsPrivateP52b4CategoryXa8014b41>(it)
                    },
                description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
                soldBy = rawObject["sold_by"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentFlowsPrivatePaymentMethodsPaypalAmountDetailsLineItemPaymentMethodOptions,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "PaymentFlowsPrivatePaymentMethodsPaypalAmountDetailsLineItemPaymentMethodOptions",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.category?.let { put("category", json.encodeToJsonElement(it)) }
                    value.description?.let { put("description", it) }
                    value.soldBy?.let { put("sold_by", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentFlowsPrivatePaymentMethodsPaypalAmountDetailsLineItemPaymentMethodOptions(
    block: PaymentFlowsPrivatePaymentMethodsPaypalAmountDetailsLineItemPaymentMethodOptions.Builder.() -> Unit,
): PaymentFlowsPrivatePaymentMethodsPaypalAmountDetailsLineItemPaymentMethodOptions =
    PaymentFlowsPrivatePaymentMethodsPaypalAmountDetailsLineItemPaymentMethodOptions.build(block)
