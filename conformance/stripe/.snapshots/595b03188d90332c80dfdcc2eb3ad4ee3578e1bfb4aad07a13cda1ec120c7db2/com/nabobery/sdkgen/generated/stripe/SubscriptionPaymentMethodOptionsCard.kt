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
public data class SubscriptionPaymentMethodOptionsCardView(
    @SerialName("mandate_options")
    public val mandateOptions: InvoiceMandateOptionsCard? = null,
    public val network: InlineSubscriptionPaymentMethodOptionsCardNetworkXe9bf37aa? = null,
    @SerialName("request_three_d_secure")
    public val requestThreeDSecure: InlineSubscriptionPaymentMethodOptionsCardRequestThreeDSecureX5bc18e0a? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription_payment_method_options_card
 */
@Serializable(with = SubscriptionPaymentMethodOptionsCard.Serializer::class)
public class SubscriptionPaymentMethodOptionsCard(
    public val mandateOptions: InvoiceMandateOptionsCard? = null,
    /**
     * Selected network to process this Subscription on. Depends on the available networks of the card attached to the
     * Subscription. Can be only set confirm-time.
     */
    public val network: InlineSubscriptionPaymentMethodOptionsCardNetworkXe9bf37aa? = null,
    /**
     * We strongly recommend that you rely on our SCA Engine to automatically prompt your customers for authentication
     * based on risk level and [other requirements](https://docs.stripe.com/strong-customer-authentication). However, if
     * you wish to request 3D Secure based on logic from your own fraud engine, provide this option. Read our guide on
     * [manually requesting 3D Secure](https://docs.stripe.com/payments/3d-secure/authentication-flow#manual-three-ds) for
     * more information on how this configuration interacts with Radar and our SCA Engine.
     */
    public val requestThreeDSecure: InlineSubscriptionPaymentMethodOptionsCardRequestThreeDSecureX5bc18e0a? = null,
) {
    public class Builder {
        public var mandateOptions: InvoiceMandateOptionsCard? = null

        /**
         * Selected network to process this Subscription on. Depends on the available networks of the card attached to the
         * Subscription. Can be only set confirm-time.
         */
        public var network: InlineSubscriptionPaymentMethodOptionsCardNetworkXe9bf37aa? = null

        /**
         * We strongly recommend that you rely on our SCA Engine to automatically prompt your customers for authentication
         * based on risk level and [other requirements](https://docs.stripe.com/strong-customer-authentication). However, if
         * you wish to request 3D Secure based on logic from your own fraud engine, provide this option. Read our guide on
         * [manually requesting 3D Secure](https://docs.stripe.com/payments/3d-secure/authentication-flow#manual-three-ds)
         * for more information on how this configuration interacts with Radar and our SCA Engine.
         */
        public var requestThreeDSecure:
            InlineSubscriptionPaymentMethodOptionsCardRequestThreeDSecureX5bc18e0a? = null

        public fun build(): SubscriptionPaymentMethodOptionsCard =
            SubscriptionPaymentMethodOptionsCard(
                mandateOptions = mandateOptions,
                network = network,
                requestThreeDSecure = requestThreeDSecure,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): SubscriptionPaymentMethodOptionsCard =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<SubscriptionPaymentMethodOptionsCard> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): SubscriptionPaymentMethodOptionsCard {
            val jsonDecoder = decoder.requireJsonDecoder("SubscriptionPaymentMethodOptionsCard")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("SubscriptionPaymentMethodOptionsCard must be a JSON object")
            return SubscriptionPaymentMethodOptionsCard(
                mandateOptions =
                    rawObject["mandate_options"]?.let {
                        json.decodeFromJsonElement<InvoiceMandateOptionsCard>(
                            it,
                        )
                    },
                network =
                    rawObject["network"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineSubscriptionPaymentMethodOptionsCardNetworkXe9bf37aa?>(
                                element,
                            )
                        }
                    },
                requestThreeDSecure =
                    rawObject["request_three_d_secure"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<InlineSubscriptionPaymentMethodOptionsCardRequestThreeDSecureX5bc18e0a?>(
                                    element,
                                )
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: SubscriptionPaymentMethodOptionsCard,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("SubscriptionPaymentMethodOptionsCard")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
                    value.network?.let { put("network", json.encodeToJsonElement(it)) }
                    value.requestThreeDSecure?.let { put("request_three_d_secure", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun subscriptionPaymentMethodOptionsCard(
    block: SubscriptionPaymentMethodOptionsCard.Builder.() -> Unit,
): SubscriptionPaymentMethodOptionsCard = SubscriptionPaymentMethodOptionsCard.build(block)
