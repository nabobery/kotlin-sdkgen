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
 * plication~1x-www-form-urlencoded/schema/properties/features/properties/subscription_cancel.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations~1{configuration}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/features/properties/subscription_cancel
 */
@Serializable(with = InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionCancelX73570623.Serializer::class)
public class InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionCancelX73570623(
    public val cancellationReason:
        InlineV1BillingPortalConfiab44PostRequestFormFeaturesCancellationReasonXdaf9dded? = null,
    public val enabled: Boolean? = null,
    public val mode: InlineV1BillingPortalConfiab44PostRequestFormFeaturesModeX5654b5aa? = null,
    public val prorationBehavior: InlineV1BillingPortalConfiab44PostRequestFormFeaturesProrationBehaviorXfdc4d22d? = null,
) {
    public class Builder {
        public var cancellationReason:
            InlineV1BillingPortalConfiab44PostRequestFormFeaturesCancellationReasonXdaf9dded? = null

        public var enabled: Boolean? = null

        public var mode: InlineV1BillingPortalConfiab44PostRequestFormFeaturesModeX5654b5aa? = null

        public var prorationBehavior:
            InlineV1BillingPortalConfiab44PostRequestFormFeaturesProrationBehaviorXfdc4d22d? = null

        public fun build(): InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionCancelX73570623 =
            InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionCancelX73570623(
                cancellationReason = cancellationReason,
                enabled = enabled,
                mode = mode,
                prorationBehavior = prorationBehavior,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionCancelX73570623 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionCancelX73570623> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionCancelX73570623 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionCancelX73570623",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionCancelX73570623 must be a JSON object",
                    )
            return InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionCancelX73570623(
                cancellationReason =
                    rawObject["cancellation_reason"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1BillingPortalConfiab44PostRequestFormFeaturesCancellationReasonXdaf9dded>(
                                it,
                            )
                    },
                enabled = rawObject["enabled"]?.let { json.decodeFromJsonElement<Boolean>(it) },
                mode =
                    rawObject["mode"]?.let {
                        json.decodeFromJsonElement<InlineV1BillingPortalConfiab44PostRequestFormFeaturesModeX5654b5aa>(
                            it,
                        )
                    },
                prorationBehavior =
                    rawObject["proration_behavior"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1BillingPortalConfiab44PostRequestFormFeaturesProrationBehaviorXfdc4d22d>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionCancelX73570623,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionCancelX73570623",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.cancellationReason?.let { put("cancellation_reason", json.encodeToJsonElement(it)) }
                    value.enabled?.let { put("enabled", json.encodeToJsonElement(it)) }
                    value.mode?.let { put("mode", json.encodeToJsonElement(it)) }
                    value.prorationBehavior?.let { put("proration_behavior", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionCancelX73570623(
    block: InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionCancelX73570623.Builder.() -> Unit,
): InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionCancelX73570623 =
    InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionCancelX73570623.build(block)
