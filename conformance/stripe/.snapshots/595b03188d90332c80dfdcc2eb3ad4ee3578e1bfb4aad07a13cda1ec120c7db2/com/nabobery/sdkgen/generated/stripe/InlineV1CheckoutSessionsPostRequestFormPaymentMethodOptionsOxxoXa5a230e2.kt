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
import kotlin.Int
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/oxxo.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/oxxo
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsOxxoXa5a230e2.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsOxxoXa5a230e2(
    public val expiresAfterDays: Int? = null,
    public val setupFutureUsage: InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX34fff3d1? = null,
) {
    public class Builder {
        public var expiresAfterDays: Int? = null

        public var setupFutureUsage: InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX34fff3d1? =
            null

        public fun build(): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsOxxoXa5a230e2 =
            InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsOxxoXa5a230e2(
                expiresAfterDays = expiresAfterDays,
                setupFutureUsage = setupFutureUsage,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsOxxoXa5a230e2 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsOxxoXa5a230e2> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsOxxoXa5a230e2 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsOxxoXa5a230e2",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsOxxoXa5a230e2 must be a JSON object",
                    )
            return InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsOxxoXa5a230e2(
                expiresAfterDays = rawObject["expires_after_days"]?.let { json.decodeFromJsonElement<Int>(it) },
                setupFutureUsage =
                    rawObject["setup_future_usage"]?.let {
                        json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX34fff3d1>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsOxxoXa5a230e2,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsOxxoXa5a230e2",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.expiresAfterDays?.let { put("expires_after_days", json.encodeToJsonElement(it)) }
                    value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsOxxoXa5a230e2(
    block: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsOxxoXa5a230e2.Builder.() -> Unit,
): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsOxxoXa5a230e2 =
    InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsOxxoXa5a230e2.build(block)
