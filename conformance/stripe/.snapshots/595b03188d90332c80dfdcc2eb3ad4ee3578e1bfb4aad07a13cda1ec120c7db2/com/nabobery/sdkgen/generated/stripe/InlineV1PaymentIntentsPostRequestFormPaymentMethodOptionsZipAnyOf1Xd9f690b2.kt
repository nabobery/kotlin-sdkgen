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
 * urlencoded/schema/properties/payment_method_options/properties/zip/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/zip/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd9f690b2.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd9f690b2(
    public val setupFutureUsage: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXb0a1df8b? = null,
) {
    public class Builder {
        public var setupFutureUsage: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXb0a1df8b? =
            null

        public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd9f690b2 =
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd9f690b2(
                setupFutureUsage = setupFutureUsage,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd9f690b2 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd9f690b2> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd9f690b2 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd9f690b2",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd9f690b2 must be a JSON object",
                    )
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd9f690b2(
                setupFutureUsage =
                    rawObject["setup_future_usage"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXb0a1df8b>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd9f690b2,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd9f690b2",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd9f690b2(
    block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd9f690b2.Builder.() -> Unit,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd9f690b2 =
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd9f690b2.build(block)
