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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/us_bank_acc
 * ount/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/us_bank_acc
 * ount/anyOf/0
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c5c8a4.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c5c8a4(
    public val financialConnections:
        InlineV1SubscriptionsPostRequestFormPaymentSettingsFinancialConnectionsX9a17d584? = null,
    public val verificationMethod: InlineV1SubscriptionsPostRequestFormPaymentSettingsVerificationMethodXfff80e45? = null,
) {
    public class Builder {
        public var financialConnections:
            InlineV1SubscriptionsPostRequestFormPaymentSettingsFinancialConnectionsX9a17d584? = null

        public var verificationMethod:
            InlineV1SubscriptionsPostRequestFormPaymentSettingsVerificationMethodXfff80e45? = null

        public fun build(): InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c5c8a4 =
            InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c5c8a4(
                financialConnections = financialConnections,
                verificationMethod = verificationMethod,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c5c8a4 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c5c8a4> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c5c8a4 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c5c8a4",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c5c8a4 must be a JSON object",
                    )
            return InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c5c8a4(
                financialConnections =
                    rawObject["financial_connections"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsFinancialConnectionsX9a17d584>(
                                it,
                            )
                    },
                verificationMethod =
                    rawObject["verification_method"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsVerificationMethodXfff80e45>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c5c8a4,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c5c8a4",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.financialConnections?.let { put("financial_connections", json.encodeToJsonElement(it)) }
                    value.verificationMethod?.let { put("verification_method", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c5c8a4(
    block: InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c5c8a4.Builder.() -> Unit,
): InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c5c8a4 =
    InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c5c8a4.build(block)
