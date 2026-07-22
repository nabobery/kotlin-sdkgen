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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/customer_balanc
 * e/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/customer_balanc
 * e/anyOf/0
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xcf738347.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xcf738347(
    public val bankTransfer: InlineV1CustomersSubscriptionsPostRequestFormBankTransferX2913bca3? = null,
    public val fundingType: String? = null,
) {
    public class Builder {
        public var bankTransfer: InlineV1CustomersSubscriptionsPostRequestFormBankTransferX2913bca3? =
            null

        public var fundingType: String? = null

        public fun build(): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xcf738347 =
            InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xcf738347(
                bankTransfer = bankTransfer,
                fundingType = fundingType,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xcf738347 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xcf738347> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xcf738347 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xcf738347",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xcf738347 must be a JSON object",
                    )
            return InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xcf738347(
                bankTransfer =
                    rawObject["bank_transfer"]?.let {
                        json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormBankTransferX2913bca3>(
                            it,
                        )
                    },
                fundingType = rawObject["funding_type"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xcf738347,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xcf738347",
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

public fun inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xcf738347(
    block: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xcf738347.Builder.() -> Unit,
): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xcf738347 =
    InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xcf738347.build(block)
