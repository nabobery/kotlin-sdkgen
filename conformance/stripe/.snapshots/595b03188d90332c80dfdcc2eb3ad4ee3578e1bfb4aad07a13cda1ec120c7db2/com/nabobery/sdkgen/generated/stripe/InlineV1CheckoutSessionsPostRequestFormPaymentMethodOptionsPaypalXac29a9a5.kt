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
import kotlin.String
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/paypal.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/paypal
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaypalXac29a9a5.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaypalXac29a9a5(
    public val captureMethod: InlineV1CheckoutSessionsPostRequestFormCaptureMethodXc72ad29d? = null,
    public val preferredLocale: InlineV1CheckoutSessionsPostRequestFormPreferredLocaleX6f7b5a20? = null,
    public val reference: String? = null,
    public val riskCorrelationId: String? = null,
    public val setupFutureUsage: InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX8861b72a? = null,
) {
    public class Builder {
        public var captureMethod: InlineV1CheckoutSessionsPostRequestFormCaptureMethodXc72ad29d? = null

        public var preferredLocale: InlineV1CheckoutSessionsPostRequestFormPreferredLocaleX6f7b5a20? =
            null

        public var reference: String? = null

        public var riskCorrelationId: String? = null

        public var setupFutureUsage: InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX8861b72a? =
            null

        public fun build(): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaypalXac29a9a5 =
            InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaypalXac29a9a5(
                captureMethod = captureMethod,
                preferredLocale = preferredLocale,
                reference = reference,
                riskCorrelationId = riskCorrelationId,
                setupFutureUsage = setupFutureUsage,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaypalXac29a9a5 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaypalXac29a9a5> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaypalXac29a9a5 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaypalXac29a9a5",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaypalXac29a9a5 must be a JSON object",
                    )
            return InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaypalXac29a9a5(
                captureMethod =
                    rawObject["capture_method"]?.let {
                        json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormCaptureMethodXc72ad29d>(it)
                    },
                preferredLocale =
                    rawObject["preferred_locale"]?.let {
                        json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPreferredLocaleX6f7b5a20>(it)
                    },
                reference = rawObject["reference"]?.let { json.decodeFromJsonElement<String>(it) },
                riskCorrelationId = rawObject["risk_correlation_id"]?.let { json.decodeFromJsonElement<String>(it) },
                setupFutureUsage =
                    rawObject["setup_future_usage"]?.let {
                        json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX8861b72a>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaypalXac29a9a5,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaypalXac29a9a5",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.captureMethod?.let { put("capture_method", json.encodeToJsonElement(it)) }
                    value.preferredLocale?.let { put("preferred_locale", json.encodeToJsonElement(it)) }
                    value.reference?.let { put("reference", it) }
                    value.riskCorrelationId?.let { put("risk_correlation_id", it) }
                    value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaypalXac29a9a5(
    block: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaypalXac29a9a5.Builder.() -> Unit,
): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaypalXac29a9a5 =
    InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaypalXac29a9a5.build(block)
