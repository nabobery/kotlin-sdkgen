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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/us_bank_account/properties/networks.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/us_bank_account/properties/networks
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsNetworksX20a3349d.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsNetworksX20a3349d(
    public val requested: List<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsItemX0e786b9b>? = null,
) {
    public class Builder {
        public var requested:
            List<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsItemX0e786b9b>? = null

        public fun build(): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsNetworksX20a3349d =
            InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsNetworksX20a3349d(
                requested = requested,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsNetworksX20a3349d =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsNetworksX20a3349d> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsNetworksX20a3349d {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsNetworksX20a3349d",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsNetworksX20a3349d must be a JSON object",
                    )
            return InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsNetworksX20a3349d(
                requested =
                    rawObject["requested"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsItemX0e786b9b>>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsNetworksX20a3349d,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsNetworksX20a3349d",
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

public fun inlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsNetworksX20a3349d(
    block: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsNetworksX20a3349d.Builder.() -> Unit,
): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsNetworksX20a3349d =
    InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsNetworksX20a3349d.build(block)
