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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/bancontact.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/bancontact
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBancontactX6629fa0c.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBancontactX6629fa0c(
    public val setupFutureUsage: InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX9c0909be? = null,
) {
    public class Builder {
        public var setupFutureUsage: InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX9c0909be? =
            null

        public fun build(): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBancontactX6629fa0c =
            InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBancontactX6629fa0c(
                setupFutureUsage = setupFutureUsage,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBancontactX6629fa0c =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBancontactX6629fa0c> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBancontactX6629fa0c {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBancontactX6629fa0c",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBancontactX6629fa0c must be a JSON object",
                    )
            return InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBancontactX6629fa0c(
                setupFutureUsage =
                    rawObject["setup_future_usage"]?.let {
                        json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX9c0909be>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBancontactX6629fa0c,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBancontactX6629fa0c",
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

public fun inlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBancontactX6629fa0c(
    block: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBancontactX6629fa0c.Builder.() -> Unit,
): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBancontactX6629fa0c =
    InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBancontactX6629fa0c.build(block)
