package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 * Payment details attached to this payment evaluation.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_payment_details
 */
@Serializable(with = InsightsResourcesPaymentEvaluationPaymentDetails.Serializer::class)
public class InsightsResourcesPaymentEvaluationPaymentDetails(
    /**
     * Amount intended to be collected by this payment. A positive integer representing how much to charge in the
     * [smallest currency unit](https://docs.stripe.com/currencies#zero-decimal) (e.g., 100 cents to charge $1.00 or 100
     * to charge ¥100, a zero-decimal currency). The minimum amount is $0.50 US or [equivalent in charge
     * currency](https://docs.stripe.com/currencies#minimum-and-maximum-charge-amounts). The amount value supports up to
     * eight digits (e.g., a value of 99999999 for a USD charge of $999,999.99).
     */
    public val amount: Int,
    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
     * [supported currency](https://stripe.com/docs/currencies).
     */
    public val currency: String,
    /**
     * An arbitrary string attached to the object. Often useful for displaying to users.
     */
    public val description: String? = null,
    /**
     * Details about the payment's customer presence and type.
     */
    public val moneyMovementDetails: InlineInsightsResourcesPay1e91MoneyMovementDetailsXd20bc7c4? = null,
    /**
     * Details about the payment method used for the payment.
     */
    public val paymentMethodDetails: InlineInsightsResourcesPay1e91PaymentMethodDetailsX1c90f570? = null,
    /**
     * Shipping details for the payment evaluation.
     */
    public val shippingDetails: InlineInsightsResourcesPaymentEvaluationPaymentDetailsShippingDetailsXbc8fa696? = null,
    /**
     * Payment statement descriptor.
     */
    public val statementDescriptor: String? = null,
) {
    public class Builder {
        private var amountValue: Int? = null

        public var amount: Int
            get() = requireNotNull(amountValue) { "amount is required" }
            set(`value`) {
                amountValue = value
            }

        private var currencyValue: String? = null

        public var currency: String
            get() = requireNotNull(currencyValue) { "currency is required" }
            set(`value`) {
                currencyValue = value
            }

        /**
         * An arbitrary string attached to the object. Often useful for displaying to users.
         */
        public var description: String? = null

        /**
         * Details about the payment's customer presence and type.
         */
        public var moneyMovementDetails: InlineInsightsResourcesPay1e91MoneyMovementDetailsXd20bc7c4? =
            null

        /**
         * Details about the payment method used for the payment.
         */
        public var paymentMethodDetails: InlineInsightsResourcesPay1e91PaymentMethodDetailsX1c90f570? =
            null

        /**
         * Shipping details for the payment evaluation.
         */
        public var shippingDetails:
            InlineInsightsResourcesPaymentEvaluationPaymentDetailsShippingDetailsXbc8fa696? = null

        /**
         * Payment statement descriptor.
         */
        public var statementDescriptor: String? = null

        public fun build(): InsightsResourcesPaymentEvaluationPaymentDetails {
            check(amountValue != null) { "amount is required" }
            check(currencyValue != null) { "currency is required" }
            return InsightsResourcesPaymentEvaluationPaymentDetails(
                amount = amount,
                currency = currency,
                description = description,
                moneyMovementDetails = moneyMovementDetails,
                paymentMethodDetails = paymentMethodDetails,
                shippingDetails = shippingDetails,
                statementDescriptor = statementDescriptor,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InsightsResourcesPaymentEvaluationPaymentDetails =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InsightsResourcesPaymentEvaluationPaymentDetails> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InsightsResourcesPaymentEvaluationPaymentDetails {
            val jsonDecoder = decoder.requireJsonDecoder("InsightsResourcesPaymentEvaluationPaymentDetails")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InsightsResourcesPaymentEvaluationPaymentDetails must be a JSON object",
                    )
            val amount = json.decodeRequired<Int>(rawObject, "amount")
            val currency = json.decodeRequired<String>(rawObject, "currency")
            return InsightsResourcesPaymentEvaluationPaymentDetails(
                amount = amount,
                currency = currency,
                description =
                    rawObject["description"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                moneyMovementDetails =
                    rawObject["money_movement_details"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineInsightsResourcesPay1e91MoneyMovementDetailsXd20bc7c4?>(
                                element,
                            )
                        }
                    },
                paymentMethodDetails =
                    rawObject["payment_method_details"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineInsightsResourcesPay1e91PaymentMethodDetailsX1c90f570?>(
                                element,
                            )
                        }
                    },
                shippingDetails =
                    rawObject["shipping_details"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<InlineInsightsResourcesPaymentEvaluationPaymentDetailsShippingDetailsXbc8fa696?>(
                                    element,
                                )
                        }
                    },
                statementDescriptor =
                    rawObject["statement_descriptor"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InsightsResourcesPaymentEvaluationPaymentDetails,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InsightsResourcesPaymentEvaluationPaymentDetails")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("amount", json.encodeToJsonElement(value.amount))
                    put("currency", value.currency)
                    value.description?.let { put("description", it) }
                    value.moneyMovementDetails?.let { put("money_movement_details", json.encodeToJsonElement(it)) }
                    value.paymentMethodDetails?.let { put("payment_method_details", json.encodeToJsonElement(it)) }
                    value.shippingDetails?.let { put("shipping_details", json.encodeToJsonElement(it)) }
                    value.statementDescriptor?.let { put("statement_descriptor", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun insightsResourcesPaymentEvaluationPaymentDetails(
    block: InsightsResourcesPaymentEvaluationPaymentDetails.Builder.() -> Unit,
): InsightsResourcesPaymentEvaluationPaymentDetails = InsightsResourcesPaymentEvaluationPaymentDetails.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InsightsResourcesPaymentEvaluationPaymentDetails is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
