package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit

@Serializable
public data class SubscriptionBillingThresholdsView(
    @SerialName("amount_gte")
    public val amountGte: Int? = null,
    @SerialName("reset_billing_cycle_anchor")
    public val resetBillingCycleAnchor: Boolean? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription_billing_thresholds
 */
@Serializable(with = SubscriptionBillingThresholds.Serializer::class)
public class SubscriptionBillingThresholds(
    /**
     * Monetary threshold that triggers the subscription to create an invoice
     */
    public val amountGte: Int? = null,
    /**
     * Indicates if the `billing_cycle_anchor` should be reset when a threshold is reached. If true,
     * `billing_cycle_anchor` will be updated to the date/time the threshold was last reached; otherwise, the value will
     * remain unchanged. This value may not be `true` if the subscription contains items with plans that have
     * `aggregate_usage=last_ever`.
     */
    public val resetBillingCycleAnchor: Boolean? = null,
) {
    public class Builder {
        /**
         * Monetary threshold that triggers the subscription to create an invoice
         */
        public var amountGte: Int? = null

        /**
         * Indicates if the `billing_cycle_anchor` should be reset when a threshold is reached. If true,
         * `billing_cycle_anchor` will be updated to the date/time the threshold was last reached; otherwise, the value will
         * remain unchanged. This value may not be `true` if the subscription contains items with plans that have
         * `aggregate_usage=last_ever`.
         */
        public var resetBillingCycleAnchor: Boolean? = null

        public fun build(): SubscriptionBillingThresholds =
            SubscriptionBillingThresholds(
                amountGte = amountGte,
                resetBillingCycleAnchor = resetBillingCycleAnchor,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): SubscriptionBillingThresholds = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<SubscriptionBillingThresholds> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): SubscriptionBillingThresholds {
            val jsonDecoder = decoder.requireJsonDecoder("SubscriptionBillingThresholds")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("SubscriptionBillingThresholds must be a JSON object")
            return SubscriptionBillingThresholds(
                amountGte =
                    rawObject["amount_gte"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
                resetBillingCycleAnchor =
                    rawObject["reset_billing_cycle_anchor"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Boolean?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: SubscriptionBillingThresholds,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("SubscriptionBillingThresholds")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.amountGte?.let { put("amount_gte", json.encodeToJsonElement(it)) }
                    value.resetBillingCycleAnchor?.let {
                        put(
                            "reset_billing_cycle_anchor",
                            json.encodeToJsonElement(it),
                        )
                    }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun subscriptionBillingThresholds(
    block: SubscriptionBillingThresholds.Builder.() -> Unit,
): SubscriptionBillingThresholds = SubscriptionBillingThresholds.build(block)
