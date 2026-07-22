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
 * Afterpay gives your customers a way to pay for purchases in installments, check this
 * [page](https://docs.stripe.com/payments/afterpay-clearpay) for more details like country availability. Afterpay is
 * particularly popular among businesses selling fashion, beauty, and sports products.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/afterpay_clearpay
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormAfterpayClearpayXb760da75.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormAfterpayClearpayXb760da75(
    public val displayPreference: InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceXa167eeca? = null,
) {
    public class Builder {
        public var displayPreference:
            InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceXa167eeca? = null

        public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormAfterpayClearpayXb760da75 =
            InlineV1PaymentMethodConfigurationsPostRequestFormAfterpayClearpayXb760da75(
                displayPreference = displayPreference,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentMethodConfigurationsPostRequestFormAfterpayClearpayXb760da75 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormAfterpayClearpayXb760da75> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentMethodConfigurationsPostRequestFormAfterpayClearpayXb760da75 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormAfterpayClearpayXb760da75",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentMethodConfigurationsPostRequestFormAfterpayClearpayXb760da75 must be a JSON object",
                    )
            return InlineV1PaymentMethodConfigurationsPostRequestFormAfterpayClearpayXb760da75(
                displayPreference =
                    rawObject["display_preference"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceXa167eeca>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentMethodConfigurationsPostRequestFormAfterpayClearpayXb760da75,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormAfterpayClearpayXb760da75",
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

public fun inlineV1PaymentMethodConfigurationsPostRequestFormAfterpayClearpayXb760da75(
    block: InlineV1PaymentMethodConfigurationsPostRequestFormAfterpayClearpayXb760da75.Builder.() -> Unit,
): InlineV1PaymentMethodConfigurationsPostRequestFormAfterpayClearpayXb760da75 =
    InlineV1PaymentMethodConfigurationsPostRequestFormAfterpayClearpayXb760da75.build(block)
