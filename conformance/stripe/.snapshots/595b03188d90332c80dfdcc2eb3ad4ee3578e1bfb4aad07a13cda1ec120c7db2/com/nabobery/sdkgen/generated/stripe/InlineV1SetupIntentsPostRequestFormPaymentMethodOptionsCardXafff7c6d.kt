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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/card.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/card
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardXafff7c6d.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardXafff7c6d(
    public val mandateOptions: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX6034332c? = null,
    public val network: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardNetworkXf4137df2? = null,
    public val requestThreeDSecure: InlineV1SetupIntentsPostRequestFormRequestThreeDSecureXbe60bd3b? = null,
    public val threeDSecure: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardThreeDSecureXcb142d5f? = null,
) {
    public class Builder {
        public var mandateOptions:
            InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX6034332c? = null

        public var network: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardNetworkXf4137df2? =
            null

        public var requestThreeDSecure: InlineV1SetupIntentsPostRequestFormRequestThreeDSecureXbe60bd3b? =
            null

        public var threeDSecure:
            InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardThreeDSecureXcb142d5f? = null

        public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardXafff7c6d =
            InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardXafff7c6d(
                mandateOptions = mandateOptions,
                network = network,
                requestThreeDSecure = requestThreeDSecure,
                threeDSecure = threeDSecure,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardXafff7c6d = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardXafff7c6d> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardXafff7c6d {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardXafff7c6d",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardXafff7c6d must be a JSON object",
                    )
            return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardXafff7c6d(
                mandateOptions =
                    rawObject["mandate_options"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX6034332c>(
                                it,
                            )
                    },
                network =
                    rawObject["network"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardNetworkXf4137df2>(
                                it,
                            )
                    },
                requestThreeDSecure =
                    rawObject["request_three_d_secure"]?.let {
                        json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormRequestThreeDSecureXbe60bd3b>(it)
                    },
                threeDSecure =
                    rawObject["three_d_secure"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardThreeDSecureXcb142d5f>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardXafff7c6d,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardXafff7c6d",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
                    value.network?.let { put("network", json.encodeToJsonElement(it)) }
                    value.requestThreeDSecure?.let { put("request_three_d_secure", json.encodeToJsonElement(it)) }
                    value.threeDSecure?.let { put("three_d_secure", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardXafff7c6d(
    block: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardXafff7c6d.Builder.() -> Unit,
): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardXafff7c6d =
    InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardXafff7c6d.build(block)
