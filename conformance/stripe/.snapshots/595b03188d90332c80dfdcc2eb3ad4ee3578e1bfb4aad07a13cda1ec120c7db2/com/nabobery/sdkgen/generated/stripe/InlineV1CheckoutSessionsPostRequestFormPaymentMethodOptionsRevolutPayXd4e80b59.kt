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
 * ded/schema/properties/payment_method_options/properties/revolut_pay.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/revolut_pay
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsRevolutPayXd4e80b59.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsRevolutPayXd4e80b59(
    public val captureMethod: InlineV1CheckoutSessionsPostRequestFormCaptureMethodX6324a92e? = null,
    public val setupFutureUsage: InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX206da843? = null,
) {
    public class Builder {
        public var captureMethod: InlineV1CheckoutSessionsPostRequestFormCaptureMethodX6324a92e? = null

        public var setupFutureUsage: InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX206da843? =
            null

        public fun build(): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsRevolutPayXd4e80b59 =
            InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsRevolutPayXd4e80b59(
                captureMethod = captureMethod,
                setupFutureUsage = setupFutureUsage,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsRevolutPayXd4e80b59 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsRevolutPayXd4e80b59> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsRevolutPayXd4e80b59 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsRevolutPayXd4e80b59",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsRevolutPayXd4e80b59 must be a JSON object",
                    )
            return InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsRevolutPayXd4e80b59(
                captureMethod =
                    rawObject["capture_method"]?.let {
                        json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormCaptureMethodX6324a92e>(it)
                    },
                setupFutureUsage =
                    rawObject["setup_future_usage"]?.let {
                        json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX206da843>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsRevolutPayXd4e80b59,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsRevolutPayXd4e80b59",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.captureMethod?.let { put("capture_method", json.encodeToJsonElement(it)) }
                    value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsRevolutPayXd4e80b59(
    block: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsRevolutPayXd4e80b59.Builder.() -> Unit,
): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsRevolutPayXd4e80b59 =
    InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsRevolutPayXd4e80b59.build(block)
