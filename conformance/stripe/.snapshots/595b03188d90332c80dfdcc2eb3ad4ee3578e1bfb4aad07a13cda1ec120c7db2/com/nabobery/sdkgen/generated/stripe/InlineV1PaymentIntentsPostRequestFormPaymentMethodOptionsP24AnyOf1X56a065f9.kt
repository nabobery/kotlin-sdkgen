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
import kotlin.Boolean
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/p24/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/p24/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X56a065f9.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X56a065f9(
    public val setupFutureUsage: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX1a248344? = null,
    public val tosShownAndAccepted: Boolean? = null,
) {
    public class Builder {
        public var setupFutureUsage: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX1a248344? =
            null

        public var tosShownAndAccepted: Boolean? = null

        public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X56a065f9 =
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X56a065f9(
                setupFutureUsage = setupFutureUsage,
                tosShownAndAccepted = tosShownAndAccepted,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X56a065f9 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X56a065f9> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X56a065f9 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X56a065f9",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X56a065f9 must be a JSON object",
                    )
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X56a065f9(
                setupFutureUsage =
                    rawObject["setup_future_usage"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX1a248344>(it)
                    },
                tosShownAndAccepted =
                    rawObject["tos_shown_and_accepted"]?.let {
                        json
                            .decodeFromJsonElement<Boolean>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X56a065f9,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X56a065f9",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
                    value.tosShownAndAccepted?.let { put("tos_shown_and_accepted", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X56a065f9(
    block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X56a065f9.Builder.() -> Unit,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X56a065f9 =
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X56a065f9.build(block)
