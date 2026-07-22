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
 * ded/schema/properties/payment_method_options/properties/afterpay_clearpay.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/afterpay_clearpay
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormAfterpayClearpayX1acb765a.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormAfterpayClearpayX1acb765a(
    public val captureMethod: InlineV1CheckoutSessionsPostRequestFormCaptureMethodX70437bee? = null,
    public val setupFutureUsage: InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX07c379d5? = null,
) {
    public class Builder {
        public var captureMethod: InlineV1CheckoutSessionsPostRequestFormCaptureMethodX70437bee? = null

        public var setupFutureUsage: InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX07c379d5? =
            null

        public fun build(): InlineV1CheckoutSessionsPostRequestFormAfterpayClearpayX1acb765a =
            InlineV1CheckoutSessionsPostRequestFormAfterpayClearpayX1acb765a(
                captureMethod = captureMethod,
                setupFutureUsage = setupFutureUsage,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormAfterpayClearpayX1acb765a =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormAfterpayClearpayX1acb765a> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormAfterpayClearpayX1acb765a {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CheckoutSessionsPostRequestFormAfterpayClearpayX1acb765a",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CheckoutSessionsPostRequestFormAfterpayClearpayX1acb765a must be a JSON object",
                    )
            return InlineV1CheckoutSessionsPostRequestFormAfterpayClearpayX1acb765a(
                captureMethod =
                    rawObject["capture_method"]?.let {
                        json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormCaptureMethodX70437bee>(it)
                    },
                setupFutureUsage =
                    rawObject["setup_future_usage"]?.let {
                        json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX07c379d5>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CheckoutSessionsPostRequestFormAfterpayClearpayX1acb765a,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1CheckoutSessionsPostRequestFormAfterpayClearpayX1acb765a",
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

public fun inlineV1CheckoutSessionsPostRequestFormAfterpayClearpayX1acb765a(
    block: InlineV1CheckoutSessionsPostRequestFormAfterpayClearpayX1acb765a.Builder.() -> Unit,
): InlineV1CheckoutSessionsPostRequestFormAfterpayClearpayX1acb765a =
    InlineV1CheckoutSessionsPostRequestFormAfterpayClearpayX1acb765a.build(block)
