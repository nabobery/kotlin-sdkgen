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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/card.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/card
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardX5a9b8b8e.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardX5a9b8b8e(
    public val mandateOptions: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXd98c17fc? = null,
    public val network: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardNetworkXd2e2f785? = null,
    public val requestThreeDSecure: InlineV1SetupIntentsPostRequestFormRequestThreeDSecureX7aa799fd? = null,
    public val threeDSecure: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardThreeDSecureXfc6e42c9? = null,
) {
    public class Builder {
        public var mandateOptions:
            InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXd98c17fc? = null

        public var network: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardNetworkXd2e2f785? =
            null

        public var requestThreeDSecure: InlineV1SetupIntentsPostRequestFormRequestThreeDSecureX7aa799fd? =
            null

        public var threeDSecure:
            InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardThreeDSecureXfc6e42c9? = null

        public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardX5a9b8b8e =
            InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardX5a9b8b8e(
                mandateOptions = mandateOptions,
                network = network,
                requestThreeDSecure = requestThreeDSecure,
                threeDSecure = threeDSecure,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardX5a9b8b8e = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardX5a9b8b8e> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardX5a9b8b8e {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardX5a9b8b8e",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardX5a9b8b8e must be a JSON object",
                    )
            return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardX5a9b8b8e(
                mandateOptions =
                    rawObject["mandate_options"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXd98c17fc>(
                                it,
                            )
                    },
                network =
                    rawObject["network"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardNetworkXd2e2f785>(
                                it,
                            )
                    },
                requestThreeDSecure =
                    rawObject["request_three_d_secure"]?.let {
                        json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormRequestThreeDSecureX7aa799fd>(it)
                    },
                threeDSecure =
                    rawObject["three_d_secure"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardThreeDSecureXfc6e42c9>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardX5a9b8b8e,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardX5a9b8b8e",
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

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardX5a9b8b8e(
    block: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardX5a9b8b8e.Builder.() -> Unit,
): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardX5a9b8b8e =
    InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardX5a9b8b8e.build(block)
