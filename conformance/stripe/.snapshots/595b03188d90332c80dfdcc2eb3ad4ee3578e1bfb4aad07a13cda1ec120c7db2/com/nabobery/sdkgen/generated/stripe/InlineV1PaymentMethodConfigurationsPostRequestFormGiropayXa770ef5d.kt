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
 * giropay is a German payment method based on online banking, introduced in 2006. It allows customers to complete
 * transactions online using their online banking environment, with funds debited from their bank account. Depending on
 * their bank, customers confirm payments on giropay using a second factor of authentication or a PIN. giropay accounts
 * for 10% of online checkouts in Germany. Check this [page](https://docs.stripe.com/payments/giropay) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/giropay
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormGiropayXa770ef5d.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormGiropayXa770ef5d(
    public val displayPreference: InlineV1PaymentMethodConfidc49PostRequestFormGiropayDisplayPreferenceX087674ff? = null,
) {
    public class Builder {
        public var displayPreference:
            InlineV1PaymentMethodConfidc49PostRequestFormGiropayDisplayPreferenceX087674ff? = null

        public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormGiropayXa770ef5d =
            InlineV1PaymentMethodConfigurationsPostRequestFormGiropayXa770ef5d(
                displayPreference = displayPreference,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentMethodConfigurationsPostRequestFormGiropayXa770ef5d = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormGiropayXa770ef5d> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormGiropayXa770ef5d {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormGiropayXa770ef5d",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentMethodConfigurationsPostRequestFormGiropayXa770ef5d must be a JSON object",
                    )
            return InlineV1PaymentMethodConfigurationsPostRequestFormGiropayXa770ef5d(
                displayPreference =
                    rawObject["display_preference"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormGiropayDisplayPreferenceX087674ff>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentMethodConfigurationsPostRequestFormGiropayXa770ef5d,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormGiropayXa770ef5d",
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

public fun inlineV1PaymentMethodConfigurationsPostRequestFormGiropayXa770ef5d(
    block: InlineV1PaymentMethodConfigurationsPostRequestFormGiropayXa770ef5d.Builder.() -> Unit,
): InlineV1PaymentMethodConfigurationsPostRequestFormGiropayXa770ef5d =
    InlineV1PaymentMethodConfigurationsPostRequestFormGiropayXa770ef5d.build(block)
