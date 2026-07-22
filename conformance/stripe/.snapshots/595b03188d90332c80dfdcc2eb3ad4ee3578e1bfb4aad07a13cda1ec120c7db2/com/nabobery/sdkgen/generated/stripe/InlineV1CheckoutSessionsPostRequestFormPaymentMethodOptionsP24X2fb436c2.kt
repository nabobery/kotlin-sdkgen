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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/p24.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/p24
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsP24X2fb436c2.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsP24X2fb436c2(
    public val setupFutureUsage: InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageXb684a462? = null,
    public val tosShownAndAccepted: Boolean? = null,
) {
    public class Builder {
        public var setupFutureUsage: InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageXb684a462? =
            null

        public var tosShownAndAccepted: Boolean? = null

        public fun build(): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsP24X2fb436c2 =
            InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsP24X2fb436c2(
                setupFutureUsage = setupFutureUsage,
                tosShownAndAccepted = tosShownAndAccepted,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsP24X2fb436c2 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsP24X2fb436c2> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsP24X2fb436c2 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsP24X2fb436c2",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsP24X2fb436c2 must be a JSON object",
                    )
            return InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsP24X2fb436c2(
                setupFutureUsage =
                    rawObject["setup_future_usage"]?.let {
                        json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageXb684a462>(it)
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
            `value`: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsP24X2fb436c2,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsP24X2fb436c2",
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

public fun inlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsP24X2fb436c2(
    block: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsP24X2fb436c2.Builder.() -> Unit,
): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsP24X2fb436c2 =
    InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsP24X2fb436c2.build(block)
