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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/sepa_debit/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/sepa_debit/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa04292f8.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa04292f8(
    public val mandateOptions: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXf3e54e16? = null,
    public val setupFutureUsage: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXcb930703? = null,
    public val targetDate: String? = null,
) {
    public class Builder {
        public var mandateOptions:
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXf3e54e16? = null

        public var setupFutureUsage: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXcb930703? =
            null

        public var targetDate: String? = null

        public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa04292f8 =
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa04292f8(
                mandateOptions = mandateOptions,
                setupFutureUsage = setupFutureUsage,
                targetDate = targetDate,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa04292f8 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa04292f8> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa04292f8 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa04292f8",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa04292f8 must be a JSON object",
                    )
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa04292f8(
                mandateOptions =
                    rawObject["mandate_options"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXf3e54e16>(
                                it,
                            )
                    },
                setupFutureUsage =
                    rawObject["setup_future_usage"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXcb930703>(it)
                    },
                targetDate = rawObject["target_date"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa04292f8,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa04292f8",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
                    value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
                    value.targetDate?.let { put("target_date", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa04292f8(
    block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa04292f8.Builder.() -> Unit,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa04292f8 =
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa04292f8.build(block)
