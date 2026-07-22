package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/customer_ba
 * lance/anyOf/0/properties/bank_transfer/properties/eu_bank_transfer.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/customer_ba
 * lance/anyOf/0/properties/bank_transfer/properties/eu_bank_transfer
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsEuBankTransferX84554062.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPaymentSettingsEuBankTransferX84554062(
    public val country: String,
) {
    public class Builder {
        private var countryValue: String? = null

        public var country: String
            get() = requireNotNull(countryValue) { "country is required" }
            set(`value`) {
                countryValue = value
            }

        public fun build(): InlineV1SubscriptionsPostRequestFormPaymentSettingsEuBankTransferX84554062 {
            check(countryValue != null) { "country is required" }
            return InlineV1SubscriptionsPostRequestFormPaymentSettingsEuBankTransferX84554062(
                country = country,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1SubscriptionsPostRequestFormPaymentSettingsEuBankTransferX84554062 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsEuBankTransferX84554062> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionsPostRequestFormPaymentSettingsEuBankTransferX84554062 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionsPostRequestFormPaymentSettingsEuBankTransferX84554062",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SubscriptionsPostRequestFormPaymentSettingsEuBankTransferX84554062 must be a JSON object",
                    )
            val country = json.decodeRequired<String>(rawObject, "country")
            return InlineV1SubscriptionsPostRequestFormPaymentSettingsEuBankTransferX84554062(
                country = country,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsEuBankTransferX84554062,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SubscriptionsPostRequestFormPaymentSettingsEuBankTransferX84554062",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("country", value.country)
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1SubscriptionsPostRequestFormPaymentSettingsEuBankTransferX84554062(
    block: InlineV1SubscriptionsPostRequestFormPaymentSettingsEuBankTransferX84554062.Builder.() -> Unit,
): InlineV1SubscriptionsPostRequestFormPaymentSettingsEuBankTransferX84554062 =
    InlineV1SubscriptionsPostRequestFormPaymentSettingsEuBankTransferX84554062.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1SubscriptionsPostRequestFormPaymentSettingsEuBankTransferX84554062 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
