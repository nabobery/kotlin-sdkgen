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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/p24/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/p24/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X4acd05ac.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X4acd05ac(
    public val setupFutureUsage: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX4e65ccc3? = null,
    public val tosShownAndAccepted: Boolean? = null,
) {
    public class Builder {
        public var setupFutureUsage: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX4e65ccc3? =
            null

        public var tosShownAndAccepted: Boolean? = null

        public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X4acd05ac =
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X4acd05ac(
                setupFutureUsage = setupFutureUsage,
                tosShownAndAccepted = tosShownAndAccepted,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X4acd05ac = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X4acd05ac> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X4acd05ac {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X4acd05ac",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X4acd05ac must be a JSON object",
                    )
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X4acd05ac(
                setupFutureUsage =
                    rawObject["setup_future_usage"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX4e65ccc3>(it)
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
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X4acd05ac,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X4acd05ac",
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

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X4acd05ac(
    block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X4acd05ac.Builder.() -> Unit,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X4acd05ac =
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X4acd05ac.build(block)
