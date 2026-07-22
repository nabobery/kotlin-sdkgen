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
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * /properties/card/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * /properties/card/anyOf/0
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe4434636.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe4434636(
    public val mandateOptions: InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX2e6e2f5b? = null,
    public val network: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsNetworkX7cfe2d10? = null,
    public val requestThreeDSecure: InlineV1CustomersSubscriptionsPostRequestFormRequestThreeDSecureX815619db? = null,
) {
    public class Builder {
        public var mandateOptions: InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX2e6e2f5b? =
            null

        public var network:
            InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsNetworkX7cfe2d10? = null

        public var requestThreeDSecure:
            InlineV1CustomersSubscriptionsPostRequestFormRequestThreeDSecureX815619db? = null

        public fun build(): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe4434636 =
            InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe4434636(
                mandateOptions = mandateOptions,
                network = network,
                requestThreeDSecure = requestThreeDSecure,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe4434636 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe4434636> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe4434636 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe4434636",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe4434636 must be a JSON object",
                    )
            return InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe4434636(
                mandateOptions =
                    rawObject["mandate_options"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX2e6e2f5b>(
                                it,
                            )
                    },
                network =
                    rawObject["network"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsNetworkX7cfe2d10>(
                                it,
                            )
                    },
                requestThreeDSecure =
                    rawObject["request_three_d_secure"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormRequestThreeDSecureX815619db>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe4434636,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe4434636",
                )
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

public fun inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe4434636(
    block: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe4434636.Builder.() -> Unit,
): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe4434636 =
    InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe4434636.build(block)
