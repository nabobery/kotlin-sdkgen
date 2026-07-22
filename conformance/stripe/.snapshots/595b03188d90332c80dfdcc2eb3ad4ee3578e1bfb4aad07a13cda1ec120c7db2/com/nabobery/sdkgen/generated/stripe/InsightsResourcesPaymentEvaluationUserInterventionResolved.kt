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
import kotlin.String
import kotlin.Unit

/**
 * User Intervention Resolved Event details attached to this payment evaluation
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_user_intervention_resolved
 */
@Serializable(with = InsightsResourcesPaymentEvaluationUserInterventionResolved.Serializer::class)
public class InsightsResourcesPaymentEvaluationUserInterventionResolved(
    /**
     * Unique ID of this intervention. Use this to provide the result.
     */
    public val key: String,
    /**
     * Result of the intervention if it has been completed.
     */
    public val outcome: InlineInsightsResourcesPaymentEvaluationUserInterventionResolvedOutcomeX213724ab? = null,
) {
    public class Builder {
        private var keyValue: String? = null

        public var key: String
            get() = requireNotNull(keyValue) { "key is required" }
            set(`value`) {
                keyValue = value
            }

        /**
         * Result of the intervention if it has been completed.
         */
        public var outcome:
            InlineInsightsResourcesPaymentEvaluationUserInterventionResolvedOutcomeX213724ab? = null

        public fun build(): InsightsResourcesPaymentEvaluationUserInterventionResolved {
            check(keyValue != null) { "key is required" }
            return InsightsResourcesPaymentEvaluationUserInterventionResolved(
                key = key,
                outcome = outcome,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InsightsResourcesPaymentEvaluationUserInterventionResolved =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InsightsResourcesPaymentEvaluationUserInterventionResolved> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InsightsResourcesPaymentEvaluationUserInterventionResolved {
            val jsonDecoder = decoder.requireJsonDecoder("InsightsResourcesPaymentEvaluationUserInterventionResolved")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InsightsResourcesPaymentEvaluationUserInterventionResolved must be a JSON object",
                    )
            val key = json.decodeRequired<String>(rawObject, "key")
            return InsightsResourcesPaymentEvaluationUserInterventionResolved(
                key = key,
                outcome =
                    rawObject["outcome"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<InlineInsightsResourcesPaymentEvaluationUserInterventionResolvedOutcomeX213724ab?>(
                                    element,
                                )
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InsightsResourcesPaymentEvaluationUserInterventionResolved,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InsightsResourcesPaymentEvaluationUserInterventionResolved")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("key", value.key)
                    value.outcome?.let { put("outcome", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun insightsResourcesPaymentEvaluationUserInterventionResolved(
    block: InsightsResourcesPaymentEvaluationUserInterventionResolved.Builder.() -> Unit,
): InsightsResourcesPaymentEvaluationUserInterventionResolved =
    InsightsResourcesPaymentEvaluationUserInterventionResolved.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InsightsResourcesPaymentEvaluationUserInterventionResolved is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
