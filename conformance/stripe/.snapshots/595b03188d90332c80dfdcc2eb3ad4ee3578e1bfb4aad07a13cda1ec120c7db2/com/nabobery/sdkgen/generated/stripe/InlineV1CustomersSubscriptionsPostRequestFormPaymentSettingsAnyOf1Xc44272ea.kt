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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * /properties/customer_balance/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * /properties/customer_balance/anyOf/0
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc44272ea.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc44272ea(
    public val bankTransfer: InlineV1CustomersSubscriptionsPostRequestFormBankTransferXbab1098a? = null,
    public val fundingType: String? = null,
) {
    public class Builder {
        public var bankTransfer: InlineV1CustomersSubscriptionsPostRequestFormBankTransferXbab1098a? =
            null

        public var fundingType: String? = null

        public fun build(): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc44272ea =
            InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc44272ea(
                bankTransfer = bankTransfer,
                fundingType = fundingType,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc44272ea = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc44272ea> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc44272ea {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc44272ea",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc44272ea must be a JSON object",
                    )
            return InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc44272ea(
                bankTransfer =
                    rawObject["bank_transfer"]?.let {
                        json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormBankTransferXbab1098a>(
                            it,
                        )
                    },
                fundingType = rawObject["funding_type"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc44272ea,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc44272ea",
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

public fun inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc44272ea(
    block: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc44272ea.Builder.() -> Unit,
): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc44272ea =
    InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc44272ea.build(block)
