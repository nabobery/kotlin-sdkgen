package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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
public data class InvoicePaymentMethodOptionsCardView(
    public val installments: InvoiceInstallmentsCard? = null,
    @SerialName("request_three_d_secure")
    public val requestThreeDSecure: InlineInvoicePaymentMethodOptionsCardRequestThreeDSecureX6b0f6085? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice_payment_method_options_card
 */
@Serializable(with = InvoicePaymentMethodOptionsCard.Serializer::class)
public class InvoicePaymentMethodOptionsCard(
    public val installments: InvoiceInstallmentsCard? = null,
    /**
     * We strongly recommend that you rely on our SCA Engine to automatically prompt your customers for authentication
     * based on risk level and [other requirements](https://docs.stripe.com/strong-customer-authentication). However, if
     * you wish to request 3D Secure based on logic from your own fraud engine, provide this option. Read our guide on
     * [manually requesting 3D Secure](https://docs.stripe.com/payments/3d-secure/authentication-flow#manual-three-ds) for
     * more information on how this configuration interacts with Radar and our SCA Engine.
     */
    public val requestThreeDSecure: InlineInvoicePaymentMethodOptionsCardRequestThreeDSecureX6b0f6085? = null,
) {
    public class Builder {
        public var installments: InvoiceInstallmentsCard? = null

        /**
         * We strongly recommend that you rely on our SCA Engine to automatically prompt your customers for authentication
         * based on risk level and [other requirements](https://docs.stripe.com/strong-customer-authentication). However, if
         * you wish to request 3D Secure based on logic from your own fraud engine, provide this option. Read our guide on
         * [manually requesting 3D Secure](https://docs.stripe.com/payments/3d-secure/authentication-flow#manual-three-ds)
         * for more information on how this configuration interacts with Radar and our SCA Engine.
         */
        public var requestThreeDSecure:
            InlineInvoicePaymentMethodOptionsCardRequestThreeDSecureX6b0f6085? = null

        public fun build(): InvoicePaymentMethodOptionsCard =
            InvoicePaymentMethodOptionsCard(
                installments = installments,
                requestThreeDSecure = requestThreeDSecure,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InvoicePaymentMethodOptionsCard = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InvoicePaymentMethodOptionsCard> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InvoicePaymentMethodOptionsCard {
            val jsonDecoder = decoder.requireJsonDecoder("InvoicePaymentMethodOptionsCard")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("InvoicePaymentMethodOptionsCard must be a JSON object")
            return InvoicePaymentMethodOptionsCard(
                installments =
                    rawObject["installments"]?.let {
                        json.decodeFromJsonElement<InvoiceInstallmentsCard>(
                            it,
                        )
                    },
                requestThreeDSecure =
                    rawObject["request_three_d_secure"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<InlineInvoicePaymentMethodOptionsCardRequestThreeDSecureX6b0f6085?>(
                                    element,
                                )
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InvoicePaymentMethodOptionsCard,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InvoicePaymentMethodOptionsCard")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.installments?.let { put("installments", json.encodeToJsonElement(it)) }
                    value.requestThreeDSecure?.let { put("request_three_d_secure", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun invoicePaymentMethodOptionsCard(
    block: InvoicePaymentMethodOptionsCard.Builder.() -> Unit,
): InvoicePaymentMethodOptionsCard = InvoicePaymentMethodOptionsCard.build(block)
