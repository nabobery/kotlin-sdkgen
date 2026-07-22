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
 * Bancontact is the most popular online payment method in Belgium, with over 15 million cards in circulation.
 * [Customers](https://docs.stripe.com/api/customers) use a Bancontact card or mobile app linked to a Belgian bank
 * account to make online payments that are secure, guaranteed, and confirmed immediately. Check this
 * [page](https://docs.stripe.com/payments/bancontact) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/bancontact
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormBancontactX8748cb60.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormBancontactX8748cb60(
    public val displayPreference: InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceXc8110cd2? = null,
) {
    public class Builder {
        public var displayPreference:
            InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceXc8110cd2? = null

        public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormBancontactX8748cb60 =
            InlineV1PaymentMethodConfigurationsPostRequestFormBancontactX8748cb60(
                displayPreference = displayPreference,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentMethodConfigurationsPostRequestFormBancontactX8748cb60 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormBancontactX8748cb60> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentMethodConfigurationsPostRequestFormBancontactX8748cb60 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormBancontactX8748cb60",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentMethodConfigurationsPostRequestFormBancontactX8748cb60 must be a JSON object",
                    )
            return InlineV1PaymentMethodConfigurationsPostRequestFormBancontactX8748cb60(
                displayPreference =
                    rawObject["display_preference"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceXc8110cd2>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentMethodConfigurationsPostRequestFormBancontactX8748cb60,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormBancontactX8748cb60",
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

public fun inlineV1PaymentMethodConfigurationsPostRequestFormBancontactX8748cb60(
    block: InlineV1PaymentMethodConfigurationsPostRequestFormBancontactX8748cb60.Builder.() -> Unit,
): InlineV1PaymentMethodConfigurationsPostRequestFormBancontactX8748cb60 =
    InlineV1PaymentMethodConfigurationsPostRequestFormBancontactX8748cb60.build(block)
