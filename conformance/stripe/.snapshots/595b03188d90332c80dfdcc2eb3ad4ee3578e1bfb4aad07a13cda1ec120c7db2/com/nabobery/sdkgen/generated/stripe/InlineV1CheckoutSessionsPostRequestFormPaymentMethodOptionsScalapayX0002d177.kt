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
 * ded/schema/properties/payment_method_options/properties/scalapay.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/scalapay
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsScalapayX0002d177.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsScalapayX0002d177(
    public val captureMethod: InlineV1CheckoutSessionsPostRequestFormCaptureMethodX9a7298af? = null,
) {
    public class Builder {
        public var captureMethod: InlineV1CheckoutSessionsPostRequestFormCaptureMethodX9a7298af? = null

        public fun build(): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsScalapayX0002d177 =
            InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsScalapayX0002d177(
                captureMethod = captureMethod,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsScalapayX0002d177 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsScalapayX0002d177> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsScalapayX0002d177 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsScalapayX0002d177",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsScalapayX0002d177 must be a JSON object",
                    )
            return InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsScalapayX0002d177(
                captureMethod =
                    rawObject["capture_method"]?.let {
                        json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormCaptureMethodX9a7298af>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsScalapayX0002d177,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsScalapayX0002d177",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.captureMethod?.let { put("capture_method", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsScalapayX0002d177(
    block: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsScalapayX0002d177.Builder.() -> Unit,
): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsScalapayX0002d177 =
    InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsScalapayX0002d177.build(block)
