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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/acss_debit/anyOf/0/properties/mandate_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/acss_debit/anyOf/0/properties/mandate_options
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXb3bea880.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXb3bea880(
    public val customMandateUrl: InlineV1PaymentIntentsPostRequestFormCustomMandateUrlXead5e9c9? = null,
    public val intervalDescription: String? = null,
    public val paymentSchedule: InlineV1PaymentIntentsPostRequestFormPaymentScheduleX1f0495ce? = null,
    public val transactionType: InlineV1PaymentIntentsPostRequestFormTransactionTypeXc8487278? = null,
) {
    public class Builder {
        public var customMandateUrl: InlineV1PaymentIntentsPostRequestFormCustomMandateUrlXead5e9c9? =
            null

        public var intervalDescription: String? = null

        public var paymentSchedule: InlineV1PaymentIntentsPostRequestFormPaymentScheduleX1f0495ce? =
            null

        public var transactionType: InlineV1PaymentIntentsPostRequestFormTransactionTypeXc8487278? =
            null

        public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXb3bea880 =
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXb3bea880(
                customMandateUrl = customMandateUrl,
                intervalDescription = intervalDescription,
                paymentSchedule = paymentSchedule,
                transactionType = transactionType,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXb3bea880 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXb3bea880> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXb3bea880 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXb3bea880",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXb3bea880 must be a JSON object",
                    )
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXb3bea880(
                customMandateUrl =
                    rawObject["custom_mandate_url"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormCustomMandateUrlXead5e9c9>(it)
                    },
                intervalDescription =
                    rawObject["interval_description"]?.let {
                        json.decodeFromJsonElement<String>(
                            it,
                        )
                    },
                paymentSchedule =
                    rawObject["payment_schedule"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentScheduleX1f0495ce>(it)
                    },
                transactionType =
                    rawObject["transaction_type"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormTransactionTypeXc8487278>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXb3bea880,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXb3bea880",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.customMandateUrl?.let { put("custom_mandate_url", json.encodeToJsonElement(it)) }
                    value.intervalDescription?.let { put("interval_description", it) }
                    value.paymentSchedule?.let { put("payment_schedule", json.encodeToJsonElement(it)) }
                    value.transactionType?.let { put("transaction_type", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXb3bea880(
    block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXb3bea880.Builder.() -> Unit,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXb3bea880 =
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXb3bea880.build(block)
