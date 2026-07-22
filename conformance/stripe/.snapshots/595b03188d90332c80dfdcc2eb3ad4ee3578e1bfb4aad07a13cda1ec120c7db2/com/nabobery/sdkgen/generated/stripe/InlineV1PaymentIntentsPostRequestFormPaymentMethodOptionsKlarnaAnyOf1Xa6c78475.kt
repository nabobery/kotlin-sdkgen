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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/klarna/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/klarna/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1Xa6c78475.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1Xa6c78475(
    public val captureMethod: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCaptureMethodXf1bc4e18? = null,
    public val onDemand: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandX80331675? = null,
    public val preferredLocale: InlineV1PaymentIntentsPostRequestFormPreferredLocaleX4cf74476? = null,
    public val setupFutureUsage: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX9b065b4c? = null,
    public val subscriptions: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX2585bc1f? = null,
) {
    public class Builder {
        public var captureMethod:
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCaptureMethodXf1bc4e18? = null

        public var onDemand:
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandX80331675? = null

        public var preferredLocale: InlineV1PaymentIntentsPostRequestFormPreferredLocaleX4cf74476? =
            null

        public var setupFutureUsage: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX9b065b4c? =
            null

        public var subscriptions:
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX2585bc1f? = null

        public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1Xa6c78475 =
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1Xa6c78475(
                captureMethod = captureMethod,
                onDemand = onDemand,
                preferredLocale = preferredLocale,
                setupFutureUsage = setupFutureUsage,
                subscriptions = subscriptions,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1Xa6c78475 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1Xa6c78475> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1Xa6c78475 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1Xa6c78475",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1Xa6c78475 must be a JSON object",
                    )
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1Xa6c78475(
                captureMethod =
                    rawObject["capture_method"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCaptureMethodXf1bc4e18>(
                                it,
                            )
                    },
                onDemand =
                    rawObject["on_demand"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandX80331675>(
                                it,
                            )
                    },
                preferredLocale =
                    rawObject["preferred_locale"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPreferredLocaleX4cf74476>(it)
                    },
                setupFutureUsage =
                    rawObject["setup_future_usage"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX9b065b4c>(it)
                    },
                subscriptions =
                    rawObject["subscriptions"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX2585bc1f>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1Xa6c78475,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1Xa6c78475",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.captureMethod?.let { put("capture_method", json.encodeToJsonElement(it)) }
                    value.onDemand?.let { put("on_demand", json.encodeToJsonElement(it)) }
                    value.preferredLocale?.let { put("preferred_locale", json.encodeToJsonElement(it)) }
                    value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
                    value.subscriptions?.let { put("subscriptions", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1Xa6c78475(
    block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1Xa6c78475.Builder.() -> Unit,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1Xa6c78475 =
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1Xa6c78475.build(block)
