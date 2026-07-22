package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Unit

@Serializable
public data class PaymentMethodDetailsCardInstallmentsView(
    public val plan: InlinePaymentMethodDetailsCardInstallmentsPlanX67429504? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_card_installments
 */
@Serializable(with = PaymentMethodDetailsCardInstallments.Serializer::class)
public class PaymentMethodDetailsCardInstallments(
    /**
     * Installment plan selected for the payment.
     */
    public val plan: InlinePaymentMethodDetailsCardInstallmentsPlanX67429504? = null,
) {
    public class Builder {
        /**
         * Installment plan selected for the payment.
         */
        public var plan: InlinePaymentMethodDetailsCardInstallmentsPlanX67429504? = null

        public fun build(): PaymentMethodDetailsCardInstallments =
            PaymentMethodDetailsCardInstallments(
                plan = plan,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentMethodDetailsCardInstallments =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentMethodDetailsCardInstallments> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentMethodDetailsCardInstallments {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsCardInstallments")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentMethodDetailsCardInstallments must be a JSON object")
            return PaymentMethodDetailsCardInstallments(
                plan =
                    rawObject["plan"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlinePaymentMethodDetailsCardInstallmentsPlanX67429504?>(
                                element,
                            )
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentMethodDetailsCardInstallments,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsCardInstallments")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.plan?.let { put("plan", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentMethodDetailsCardInstallments(
    block: PaymentMethodDetailsCardInstallments.Builder.() -> Unit,
): PaymentMethodDetailsCardInstallments = PaymentMethodDetailsCardInstallments.build(block)
