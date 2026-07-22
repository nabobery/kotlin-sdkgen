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
import kotlin.Boolean
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations~1{configuration}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/features/properties/subscription_update.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations~1{configuration}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/features/properties/subscription_update
 */
@Serializable(with = InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionUpdateXc65ccefe.Serializer::class)
public class InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionUpdateXc65ccefe(
    public val billingCycleAnchor:
        InlineV1BillingPortalConfiab44PostRequestFormFeaturesBillingCycleAnchorX9915120c? = null,
    public val defaultAllowedUpdates: InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesX819d8f26? = null,
    public val enabled: Boolean? = null,
    public val products: InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXf0f4d7e1? = null,
    public val prorationBehavior: InlineV1BillingPortalConfiab44PostRequestFormFeaturesProrationBehaviorX8549a24b? = null,
    public val scheduleAtPeriodEnd: InlineV1BillingPortalConfiab44PostRequestFormScheduleAtPeriodEndX72d26155? = null,
    public val trialUpdateBehavior: InlineV1BillingPortalConfiab44PostRequestFormTrialUpdateBehaviorX1b3b7efb? = null,
) {
    public class Builder {
        public var billingCycleAnchor:
            InlineV1BillingPortalConfiab44PostRequestFormFeaturesBillingCycleAnchorX9915120c? = null

        public var defaultAllowedUpdates:
            InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesX819d8f26? = null

        public var enabled: Boolean? = null

        public var products: InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXf0f4d7e1? =
            null

        public var prorationBehavior:
            InlineV1BillingPortalConfiab44PostRequestFormFeaturesProrationBehaviorX8549a24b? = null

        public var scheduleAtPeriodEnd:
            InlineV1BillingPortalConfiab44PostRequestFormScheduleAtPeriodEndX72d26155? = null

        public var trialUpdateBehavior:
            InlineV1BillingPortalConfiab44PostRequestFormTrialUpdateBehaviorX1b3b7efb? = null

        public fun build(): InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionUpdateXc65ccefe =
            InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionUpdateXc65ccefe(
                billingCycleAnchor = billingCycleAnchor,
                defaultAllowedUpdates = defaultAllowedUpdates,
                enabled = enabled,
                products = products,
                prorationBehavior = prorationBehavior,
                scheduleAtPeriodEnd = scheduleAtPeriodEnd,
                trialUpdateBehavior = trialUpdateBehavior,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionUpdateXc65ccefe =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionUpdateXc65ccefe> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionUpdateXc65ccefe {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionUpdateXc65ccefe",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionUpdateXc65ccefe must be a JSON object",
                    )
            return InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionUpdateXc65ccefe(
                billingCycleAnchor =
                    rawObject["billing_cycle_anchor"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1BillingPortalConfiab44PostRequestFormFeaturesBillingCycleAnchorX9915120c>(
                                it,
                            )
                    },
                defaultAllowedUpdates =
                    rawObject["default_allowed_updates"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesX819d8f26>(
                                it,
                            )
                    },
                enabled = rawObject["enabled"]?.let { json.decodeFromJsonElement<Boolean>(it) },
                products =
                    rawObject["products"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXf0f4d7e1>(
                                it,
                            )
                    },
                prorationBehavior =
                    rawObject["proration_behavior"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1BillingPortalConfiab44PostRequestFormFeaturesProrationBehaviorX8549a24b>(
                                it,
                            )
                    },
                scheduleAtPeriodEnd =
                    rawObject["schedule_at_period_end"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1BillingPortalConfiab44PostRequestFormScheduleAtPeriodEndX72d26155>(
                                it,
                            )
                    },
                trialUpdateBehavior =
                    rawObject["trial_update_behavior"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1BillingPortalConfiab44PostRequestFormTrialUpdateBehaviorX1b3b7efb>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionUpdateXc65ccefe,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionUpdateXc65ccefe",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.billingCycleAnchor?.let { put("billing_cycle_anchor", json.encodeToJsonElement(it)) }
                    value.defaultAllowedUpdates?.let { put("default_allowed_updates", json.encodeToJsonElement(it)) }
                    value.enabled?.let { put("enabled", json.encodeToJsonElement(it)) }
                    value.products?.let { put("products", json.encodeToJsonElement(it)) }
                    value.prorationBehavior?.let { put("proration_behavior", json.encodeToJsonElement(it)) }
                    value.scheduleAtPeriodEnd?.let { put("schedule_at_period_end", json.encodeToJsonElement(it)) }
                    value.trialUpdateBehavior?.let { put("trial_update_behavior", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionUpdateXc65ccefe(
    block: InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionUpdateXc65ccefe.Builder.() -> Unit,
): InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionUpdateXc65ccefe =
    InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionUpdateXc65ccefe.build(block)
