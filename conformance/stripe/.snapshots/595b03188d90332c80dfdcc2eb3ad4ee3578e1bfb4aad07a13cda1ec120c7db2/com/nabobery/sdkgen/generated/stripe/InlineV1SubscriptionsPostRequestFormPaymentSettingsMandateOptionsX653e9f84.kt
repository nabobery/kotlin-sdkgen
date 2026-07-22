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
 * on~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/acss_debit/
 * anyOf/0/properties/mandate_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/acss_debit/
 * anyOf/0/properties/mandate_options
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX653e9f84.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX653e9f84(
    public val transactionType: InlineV1SubscriptionsPostRequestFormPaymentSettingsTransactionTypeX8ad3041e? = null,
) {
    public class Builder {
        public var transactionType:
            InlineV1SubscriptionsPostRequestFormPaymentSettingsTransactionTypeX8ad3041e? = null

        public fun build(): InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX653e9f84 =
            InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX653e9f84(
                transactionType = transactionType,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX653e9f84 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX653e9f84> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX653e9f84 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX653e9f84",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX653e9f84 must be a JSON object",
                    )
            return InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX653e9f84(
                transactionType =
                    rawObject["transaction_type"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsTransactionTypeX8ad3041e>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX653e9f84,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX653e9f84",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.transactionType?.let { put("transaction_type", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX653e9f84(
    block: InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX653e9f84.Builder.() -> Unit,
): InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX653e9f84 =
    InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX653e9f84.build(block)
