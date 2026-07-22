package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_flows_payment_intent_presentment_details
 */
@Serializable(with = PaymentFlowsPaymentIntentPresentmentDetails.Serializer::class)
public class PaymentFlowsPaymentIntentPresentmentDetails(
    /**
     * Amount intended to be collected by this payment, denominated in `presentment_currency`.
     */
    public val presentmentAmount: Int,
    /**
     * Currency presented to the customer during payment.
     */
    public val presentmentCurrency: String,
) {
    public class Builder {
        private var presentmentAmountValue: Int? = null

        public var presentmentAmount: Int
            get() = requireNotNull(presentmentAmountValue) { "presentmentAmount is required" }
            set(`value`) {
                presentmentAmountValue = value
            }

        private var presentmentCurrencyValue: String? = null

        public var presentmentCurrency: String
            get() = requireNotNull(presentmentCurrencyValue) { "presentmentCurrency is required" }
            set(`value`) {
                presentmentCurrencyValue = value
            }

        public fun build(): PaymentFlowsPaymentIntentPresentmentDetails {
            check(presentmentAmountValue != null) { "presentmentAmount is required" }
            check(presentmentCurrencyValue != null) { "presentmentCurrency is required" }
            return PaymentFlowsPaymentIntentPresentmentDetails(
                presentmentAmount = presentmentAmount,
                presentmentCurrency = presentmentCurrency,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentFlowsPaymentIntentPresentmentDetails =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentFlowsPaymentIntentPresentmentDetails> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentFlowsPaymentIntentPresentmentDetails {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentFlowsPaymentIntentPresentmentDetails")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentFlowsPaymentIntentPresentmentDetails must be a JSON object")
            val presentmentAmount = json.decodeRequired<Int>(rawObject, "presentment_amount")
            val presentmentCurrency = json.decodeRequired<String>(rawObject, "presentment_currency")
            return PaymentFlowsPaymentIntentPresentmentDetails(
                presentmentAmount = presentmentAmount,
                presentmentCurrency = presentmentCurrency,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentFlowsPaymentIntentPresentmentDetails,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentFlowsPaymentIntentPresentmentDetails")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("presentment_amount", json.encodeToJsonElement(value.presentmentAmount))
                    put("presentment_currency", value.presentmentCurrency)
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentFlowsPaymentIntentPresentmentDetails(
    block: PaymentFlowsPaymentIntentPresentmentDetails.Builder.() -> Unit,
): PaymentFlowsPaymentIntentPresentmentDetails = PaymentFlowsPaymentIntentPresentmentDetails.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "PaymentFlowsPaymentIntentPresentmentDetails is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
