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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/us_bank_account/properties/networks.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/us_bank_account/properties/networks
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworksXb02ba7df.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworksXb02ba7df(
    public val requested: List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsItemX5daab781>? = null,
) {
    public class Builder {
        public var requested:
            List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsItemX5daab781>? = null

        public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworksXb02ba7df =
            InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworksXb02ba7df(
                requested = requested,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworksXb02ba7df = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworksXb02ba7df> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworksXb02ba7df {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworksXb02ba7df",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworksXb02ba7df must be a JSON object",
                    )
            return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworksXb02ba7df(
                requested =
                    rawObject["requested"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsItemX5daab781>>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworksXb02ba7df,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworksXb02ba7df",
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

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworksXb02ba7df(
    block: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworksXb02ba7df.Builder.() -> Unit,
): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworksXb02ba7df =
    InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworksXb02ba7df.build(block)
