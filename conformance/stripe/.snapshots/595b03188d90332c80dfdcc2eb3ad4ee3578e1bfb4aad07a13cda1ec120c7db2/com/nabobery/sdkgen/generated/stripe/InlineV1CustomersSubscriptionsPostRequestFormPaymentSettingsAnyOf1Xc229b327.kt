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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/card/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/card/anyOf/0
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc229b327.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc229b327(
    public val mandateOptions: InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX7d448a91? = null,
    public val network: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsNetworkX284f5122? = null,
    public val requestThreeDSecure: InlineV1CustomersSubscriptionsPostRequestFormRequestThreeDSecureX6bf952ab? = null,
) {
    public class Builder {
        public var mandateOptions: InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX7d448a91? =
            null

        public var network:
            InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsNetworkX284f5122? = null

        public var requestThreeDSecure:
            InlineV1CustomersSubscriptionsPostRequestFormRequestThreeDSecureX6bf952ab? = null

        public fun build(): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc229b327 =
            InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc229b327(
                mandateOptions = mandateOptions,
                network = network,
                requestThreeDSecure = requestThreeDSecure,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc229b327 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc229b327> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc229b327 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc229b327",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc229b327 must be a JSON object",
                    )
            return InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc229b327(
                mandateOptions =
                    rawObject["mandate_options"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX7d448a91>(
                                it,
                            )
                    },
                network =
                    rawObject["network"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsNetworkX284f5122>(
                                it,
                            )
                    },
                requestThreeDSecure =
                    rawObject["request_three_d_secure"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormRequestThreeDSecureX6bf952ab>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc229b327,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc229b327",
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

public fun inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc229b327(
    block: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc229b327.Builder.() -> Unit,
): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc229b327 =
    InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc229b327.build(block)
