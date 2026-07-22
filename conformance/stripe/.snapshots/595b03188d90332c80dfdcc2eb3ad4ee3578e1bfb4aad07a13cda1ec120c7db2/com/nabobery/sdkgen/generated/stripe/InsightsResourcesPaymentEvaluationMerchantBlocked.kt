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
import kotlin.String
import kotlin.Unit

/**
 * Details of a merchant_blocked outcome attached to this payment evaluation.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_merchant_blocked
 */
@Serializable(with = InsightsResourcesPaymentEvaluationMerchantBlocked.Serializer::class)
public class InsightsResourcesPaymentEvaluationMerchantBlocked(
    /**
     * The reason the payment was blocked by the merchant.
     */
    public val reason: InlineInsightsResourcesPaymentEvaluationMerchantBlockedReasonX2845e6fd,
) {
    public class Builder {
        private var reasonValue: InlineInsightsResourcesPaymentEvaluationMerchantBlockedReasonX2845e6fd? =
            null

        public var reason: InlineInsightsResourcesPaymentEvaluationMerchantBlockedReasonX2845e6fd
            get() = requireNotNull(reasonValue) { "reason is required" }
            set(`value`) {
                reasonValue = value
            }

        public fun build(): InsightsResourcesPaymentEvaluationMerchantBlocked {
            check(reasonValue != null) { "reason is required" }
            return InsightsResourcesPaymentEvaluationMerchantBlocked(
                reason = reason,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InsightsResourcesPaymentEvaluationMerchantBlocked =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InsightsResourcesPaymentEvaluationMerchantBlocked> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InsightsResourcesPaymentEvaluationMerchantBlocked {
            val jsonDecoder = decoder.requireJsonDecoder("InsightsResourcesPaymentEvaluationMerchantBlocked")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InsightsResourcesPaymentEvaluationMerchantBlocked must be a JSON object",
                    )
            val reason =
                json.decodeRequired<InlineInsightsResourcesPaymentEvaluationMerchantBlockedReasonX2845e6fd>(
                    rawObject,
                    "reason",
                )
            return InsightsResourcesPaymentEvaluationMerchantBlocked(
                reason = reason,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InsightsResourcesPaymentEvaluationMerchantBlocked,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InsightsResourcesPaymentEvaluationMerchantBlocked")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("reason", json.encodeToJsonElement(value.reason))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun insightsResourcesPaymentEvaluationMerchantBlocked(
    block: InsightsResourcesPaymentEvaluationMerchantBlocked.Builder.() -> Unit,
): InsightsResourcesPaymentEvaluationMerchantBlocked = InsightsResourcesPaymentEvaluationMerchantBlocked.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InsightsResourcesPaymentEvaluationMerchantBlocked is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
