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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/sofort/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/sofort/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xd0eb9c5f.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xd0eb9c5f(
    public val preferredLanguage: InlineV1PaymentIntentsConfirmPostRequestFormPreferredLanguageX76489852? = null,
    public val setupFutureUsage: InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageX5231f878? = null,
) {
    public class Builder {
        public var preferredLanguage:
            InlineV1PaymentIntentsConfirmPostRequestFormPreferredLanguageX76489852? = null

        public var setupFutureUsage:
            InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageX5231f878? = null

        public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xd0eb9c5f =
            InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xd0eb9c5f(
                preferredLanguage = preferredLanguage,
                setupFutureUsage = setupFutureUsage,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xd0eb9c5f =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xd0eb9c5f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xd0eb9c5f {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xd0eb9c5f",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xd0eb9c5f must be a JSON object",
                    )
            return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xd0eb9c5f(
                preferredLanguage =
                    rawObject["preferred_language"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPreferredLanguageX76489852>(
                                it,
                            )
                    },
                setupFutureUsage =
                    rawObject["setup_future_usage"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageX5231f878>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xd0eb9c5f,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xd0eb9c5f",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.preferredLanguage?.let { put("preferred_language", json.encodeToJsonElement(it)) }
                    value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xd0eb9c5f(
    block: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xd0eb9c5f.Builder.() -> Unit,
): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xd0eb9c5f =
    InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xd0eb9c5f.build(block)
