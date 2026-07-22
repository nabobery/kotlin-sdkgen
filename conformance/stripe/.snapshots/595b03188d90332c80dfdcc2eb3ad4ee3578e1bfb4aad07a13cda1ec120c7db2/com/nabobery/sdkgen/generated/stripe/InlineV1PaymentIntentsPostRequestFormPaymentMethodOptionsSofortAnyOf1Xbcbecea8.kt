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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/sofort/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/sofort/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xbcbecea8.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xbcbecea8(
    public val preferredLanguage: InlineV1PaymentIntentsPostRequestFormPreferredLanguageXf2a88b83? = null,
    public val setupFutureUsage: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXd790ecd0? = null,
) {
    public class Builder {
        public var preferredLanguage: InlineV1PaymentIntentsPostRequestFormPreferredLanguageXf2a88b83? =
            null

        public var setupFutureUsage: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXd790ecd0? =
            null

        public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xbcbecea8 =
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xbcbecea8(
                preferredLanguage = preferredLanguage,
                setupFutureUsage = setupFutureUsage,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xbcbecea8 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xbcbecea8> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xbcbecea8 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xbcbecea8",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xbcbecea8 must be a JSON object",
                    )
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xbcbecea8(
                preferredLanguage =
                    rawObject["preferred_language"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPreferredLanguageXf2a88b83>(it)
                    },
                setupFutureUsage =
                    rawObject["setup_future_usage"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXd790ecd0>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xbcbecea8,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xbcbecea8",
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

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xbcbecea8(
    block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xbcbecea8.Builder.() -> Unit,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xbcbecea8 =
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xbcbecea8.build(block)
