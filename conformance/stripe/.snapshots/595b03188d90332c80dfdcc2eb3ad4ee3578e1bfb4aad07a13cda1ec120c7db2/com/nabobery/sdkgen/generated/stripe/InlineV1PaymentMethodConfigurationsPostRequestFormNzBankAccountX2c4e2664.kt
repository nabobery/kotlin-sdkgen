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
 * Stripe users in New Zealand can accept Bulk Electronic Clearing System (BECS) direct debit payments from customers
 * with a New Zeland bank account. Check this [page](https://docs.stripe.com/payments/nz-bank-account) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/nz_bank_account
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormNzBankAccountX2c4e2664.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormNzBankAccountX2c4e2664(
    public val displayPreference: InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceX2ef29b23? = null,
) {
    public class Builder {
        public var displayPreference:
            InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceX2ef29b23? = null

        public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormNzBankAccountX2c4e2664 =
            InlineV1PaymentMethodConfigurationsPostRequestFormNzBankAccountX2c4e2664(
                displayPreference = displayPreference,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentMethodConfigurationsPostRequestFormNzBankAccountX2c4e2664 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormNzBankAccountX2c4e2664> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentMethodConfigurationsPostRequestFormNzBankAccountX2c4e2664 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormNzBankAccountX2c4e2664",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentMethodConfigurationsPostRequestFormNzBankAccountX2c4e2664 must be a JSON object",
                    )
            return InlineV1PaymentMethodConfigurationsPostRequestFormNzBankAccountX2c4e2664(
                displayPreference =
                    rawObject["display_preference"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceX2ef29b23>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentMethodConfigurationsPostRequestFormNzBankAccountX2c4e2664,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormNzBankAccountX2c4e2664",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormNzBankAccountX2c4e2664(
    block: InlineV1PaymentMethodConfigurationsPostRequestFormNzBankAccountX2c4e2664.Builder.() -> Unit,
): InlineV1PaymentMethodConfigurationsPostRequestFormNzBankAccountX2c4e2664 =
    InlineV1PaymentMethodConfigurationsPostRequestFormNzBankAccountX2c4e2664.build(block)
