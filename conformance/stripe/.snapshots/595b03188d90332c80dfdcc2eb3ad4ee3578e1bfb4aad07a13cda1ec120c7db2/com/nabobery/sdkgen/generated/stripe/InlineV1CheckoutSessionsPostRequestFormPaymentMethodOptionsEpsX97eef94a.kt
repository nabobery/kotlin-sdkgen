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
 * ded/schema/properties/payment_method_options/properties/eps.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/eps
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsEpsX97eef94a.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsEpsX97eef94a(
    public val setupFutureUsage: InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX739e79e1? = null,
) {
    public class Builder {
        public var setupFutureUsage: InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX739e79e1? =
            null

        public fun build(): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsEpsX97eef94a =
            InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsEpsX97eef94a(
                setupFutureUsage = setupFutureUsage,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsEpsX97eef94a = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsEpsX97eef94a> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsEpsX97eef94a {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsEpsX97eef94a",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsEpsX97eef94a must be a JSON object",
                    )
            return InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsEpsX97eef94a(
                setupFutureUsage =
                    rawObject["setup_future_usage"]?.let {
                        json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX739e79e1>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsEpsX97eef94a,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsEpsX97eef94a",
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

public fun inlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsEpsX97eef94a(
    block: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsEpsX97eef94a.Builder.() -> Unit,
): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsEpsX97eef94a =
    InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsEpsX97eef94a.build(block)
