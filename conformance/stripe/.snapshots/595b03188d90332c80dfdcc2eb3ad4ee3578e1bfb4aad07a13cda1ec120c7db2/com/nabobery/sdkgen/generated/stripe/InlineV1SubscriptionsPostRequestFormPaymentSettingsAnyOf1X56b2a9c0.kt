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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_options/properties/customer_balance/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_options/properties/customer_balance/anyOf/0
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X56b2a9c0.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X56b2a9c0(
    public val bankTransfer: InlineV1SubscriptionsPostRequestFormPaymentSettingsBankTransferX5ee6dc6b? = null,
    public val fundingType: String? = null,
) {
    public class Builder {
        public var bankTransfer:
            InlineV1SubscriptionsPostRequestFormPaymentSettingsBankTransferX5ee6dc6b? = null

        public var fundingType: String? = null

        public fun build(): InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X56b2a9c0 =
            InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X56b2a9c0(
                bankTransfer = bankTransfer,
                fundingType = fundingType,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X56b2a9c0 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X56b2a9c0> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X56b2a9c0 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X56b2a9c0",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X56b2a9c0 must be a JSON object",
                    )
            return InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X56b2a9c0(
                bankTransfer =
                    rawObject["bank_transfer"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsBankTransferX5ee6dc6b>(
                                it,
                            )
                    },
                fundingType = rawObject["funding_type"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X56b2a9c0,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X56b2a9c0",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.bankTransfer?.let { put("bank_transfer", json.encodeToJsonElement(it)) }
                    value.fundingType?.let { put("funding_type", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X56b2a9c0(
    block: InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X56b2a9c0.Builder.() -> Unit,
): InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X56b2a9c0 =
    InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X56b2a9c0.build(block)
