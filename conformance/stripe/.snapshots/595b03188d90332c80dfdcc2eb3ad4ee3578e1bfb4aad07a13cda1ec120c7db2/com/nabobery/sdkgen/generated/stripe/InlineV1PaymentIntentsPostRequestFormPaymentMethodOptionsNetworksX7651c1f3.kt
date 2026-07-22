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
import kotlin.collections.List

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/us_bank_account/anyOf/0/properties/networks.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/us_bank_account/anyOf/0/properties/networks
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworksX7651c1f3.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworksX7651c1f3(
    public val requested: List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemX93d43883>? = null,
) {
    public class Builder {
        public var requested:
            List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemX93d43883>? = null

        public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworksX7651c1f3 =
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworksX7651c1f3(
                requested = requested,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworksX7651c1f3 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworksX7651c1f3> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworksX7651c1f3 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworksX7651c1f3",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworksX7651c1f3 must be a JSON object",
                    )
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworksX7651c1f3(
                requested =
                    rawObject["requested"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemX93d43883>>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworksX7651c1f3,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworksX7651c1f3",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.requested?.let { put("requested", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworksX7651c1f3(
    block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworksX7651c1f3.Builder.() -> Unit,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworksX7651c1f3 =
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworksX7651c1f3.build(block)
