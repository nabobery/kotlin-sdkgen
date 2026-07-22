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
 * Dispute opened event details attached to this payment evaluation.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_dispute_opened
 */
@Serializable(with = InsightsResourcesPaymentEvaluationDisputeOpened.Serializer::class)
public class InsightsResourcesPaymentEvaluationDisputeOpened(
    /**
     * Amount to dispute for this payment. A positive integer representing how much to charge in [the smallest currency
     * unit](https://docs.stripe.com/currencies#zero-decimal) (for example, 100 cents to charge 1.00 USD or 100 to charge
     * 100 Yen, a zero-decimal currency).
     */
    public val amount: Int,
    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
     * [supported currency](https://stripe.com/docs/currencies).
     */
    public val currency: String,
    /**
     * Reason given by cardholder for dispute.
     */
    public val reason: InlineInsightsResourcesPaymentEvaluationDisputeOpenedReasonX5af9f06c,
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

        private var reasonValue: InlineInsightsResourcesPaymentEvaluationDisputeOpenedReasonX5af9f06c? =
            null

        public var reason: InlineInsightsResourcesPaymentEvaluationDisputeOpenedReasonX5af9f06c
            get() = requireNotNull(reasonValue) { "reason is required" }
            set(`value`) {
                reasonValue = value
            }

        public fun build(): InsightsResourcesPaymentEvaluationDisputeOpened {
            check(amountValue != null) { "amount is required" }
            check(currencyValue != null) { "currency is required" }
            check(reasonValue != null) { "reason is required" }
            return InsightsResourcesPaymentEvaluationDisputeOpened(
                amount = amount,
                currency = currency,
                reason = reason,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InsightsResourcesPaymentEvaluationDisputeOpened =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InsightsResourcesPaymentEvaluationDisputeOpened> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InsightsResourcesPaymentEvaluationDisputeOpened {
            val jsonDecoder = decoder.requireJsonDecoder("InsightsResourcesPaymentEvaluationDisputeOpened")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InsightsResourcesPaymentEvaluationDisputeOpened must be a JSON object",
                    )
            val amount = json.decodeRequired<Int>(rawObject, "amount")
            val currency = json.decodeRequired<String>(rawObject, "currency")
            val reason =
                json.decodeRequired<InlineInsightsResourcesPaymentEvaluationDisputeOpenedReasonX5af9f06c>(
                    rawObject,
                    "reason",
                )
            return InsightsResourcesPaymentEvaluationDisputeOpened(
                amount = amount,
                currency = currency,
                reason = reason,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InsightsResourcesPaymentEvaluationDisputeOpened,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InsightsResourcesPaymentEvaluationDisputeOpened")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("amount", json.encodeToJsonElement(value.amount))
                    put("currency", value.currency)
                    put("reason", json.encodeToJsonElement(value.reason))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun insightsResourcesPaymentEvaluationDisputeOpened(
    block: InsightsResourcesPaymentEvaluationDisputeOpened.Builder.() -> Unit,
): InsightsResourcesPaymentEvaluationDisputeOpened = InsightsResourcesPaymentEvaluationDisputeOpened.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InsightsResourcesPaymentEvaluationDisputeOpened is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
