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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription}~1resume/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription}~1resume/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1SubscriptionsResumePostRequestFormX49dd835a.Serializer::class)
public class InlineV1SubscriptionsResumePostRequestFormX49dd835a(
    /**
     * The billing cycle anchor that applies when the subscription is resumed. Either `now` or `unchanged`. The default is
     * `now`. For more information, see the billing cycle
     * [documentation](https://docs.stripe.com/billing/subscriptions/billing-cycle).
     */
    public val billingCycleAnchor: InlineV1SubscriptionsResumePostRequestFormBillingCycleAnchorXbcb7599e? = null,
    /**
     * Specifies which fields in the response should be expanded.
     */
    public val expand: List<String>? = null,
    /**
     * Determines how to handle [prorations](https://docs.stripe.com/billing/subscriptions/prorations) resulting from the
     * `billing_cycle_anchor` being `unchanged`. When the `billing_cycle_anchor` is set to `now` (default value), no
     * prorations are generated. If no value is passed, the default is `create_prorations`.
     */
    public val prorationBehavior: InlineV1SubscriptionsResumePostRequestFormProrationBehaviorX4d5c438a? = null,
    /**
     * If set, prorations will be calculated as though the subscription was resumed at the given time. This can be used to
     * apply exactly the same prorations that were previewed with the [create
     * preview](https://stripe.com/docs/api/invoices/create_preview) endpoint.
     */
    public val prorationDate: Int? = null,
) {
    public class Builder {
        /**
         * The billing cycle anchor that applies when the subscription is resumed. Either `now` or `unchanged`. The default
         * is `now`. For more information, see the billing cycle
         * [documentation](https://docs.stripe.com/billing/subscriptions/billing-cycle).
         */
        public var billingCycleAnchor:
            InlineV1SubscriptionsResumePostRequestFormBillingCycleAnchorXbcb7599e? = null

        /**
         * Specifies which fields in the response should be expanded.
         */
        public var expand: List<String>? = null

        /**
         * Determines how to handle [prorations](https://docs.stripe.com/billing/subscriptions/prorations) resulting from
         * the `billing_cycle_anchor` being `unchanged`. When the `billing_cycle_anchor` is set to `now` (default value), no
         * prorations are generated. If no value is passed, the default is `create_prorations`.
         */
        public var prorationBehavior:
            InlineV1SubscriptionsResumePostRequestFormProrationBehaviorX4d5c438a? = null

        /**
         * If set, prorations will be calculated as though the subscription was resumed at the given time. This can be used
         * to apply exactly the same prorations that were previewed with the [create
         * preview](https://stripe.com/docs/api/invoices/create_preview) endpoint.
         */
        public var prorationDate: Int? = null

        public fun build(): InlineV1SubscriptionsResumePostRequestFormX49dd835a =
            InlineV1SubscriptionsResumePostRequestFormX49dd835a(
                billingCycleAnchor = billingCycleAnchor,
                expand = expand,
                prorationBehavior = prorationBehavior,
                prorationDate = prorationDate,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1SubscriptionsResumePostRequestFormX49dd835a =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsResumePostRequestFormX49dd835a> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1SubscriptionsResumePostRequestFormX49dd835a {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsResumePostRequestFormX49dd835a")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SubscriptionsResumePostRequestFormX49dd835a must be a JSON object",
                    )
            return InlineV1SubscriptionsResumePostRequestFormX49dd835a(
                billingCycleAnchor =
                    rawObject["billing_cycle_anchor"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionsResumePostRequestFormBillingCycleAnchorXbcb7599e>(
                                it,
                            )
                    },
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
                prorationBehavior =
                    rawObject["proration_behavior"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionsResumePostRequestFormProrationBehaviorX4d5c438a>(
                                it,
                            )
                    },
                prorationDate = rawObject["proration_date"]?.let { json.decodeFromJsonElement<Int>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsResumePostRequestFormX49dd835a,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionsResumePostRequestFormX49dd835a")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.billingCycleAnchor?.let { put("billing_cycle_anchor", json.encodeToJsonElement(it)) }
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                    value.prorationBehavior?.let { put("proration_behavior", json.encodeToJsonElement(it)) }
                    value.prorationDate?.let { put("proration_date", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1SubscriptionsResumePostRequestFormX49dd835a(
    block: InlineV1SubscriptionsResumePostRequestFormX49dd835a.Builder.() -> Unit,
): InlineV1SubscriptionsResumePostRequestFormX49dd835a =
    InlineV1SubscriptionsResumePostRequestFormX49dd835a.build(block)
