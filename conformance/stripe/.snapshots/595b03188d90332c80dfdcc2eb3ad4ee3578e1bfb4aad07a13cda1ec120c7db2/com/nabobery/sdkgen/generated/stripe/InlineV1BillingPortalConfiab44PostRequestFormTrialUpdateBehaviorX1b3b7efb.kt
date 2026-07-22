package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlin.String

/**
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations~1{configuration}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/features/properties/subscription_update/properties/trial_update_be
 * havior.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations~1{configuration}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/features/properties/subscription_update/properties/trial_update_be
 * havior
 */
@Serializable(with = InlineV1BillingPortalConfiab44PostRequestFormTrialUpdateBehaviorX1b3b7efb.Serializer::class)
public sealed class InlineV1BillingPortalConfiab44PostRequestFormTrialUpdateBehaviorX1b3b7efb {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `continue_trial`.
     */
    public data object ContinueTrial : InlineV1BillingPortalConfiab44PostRequestFormTrialUpdateBehaviorX1b3b7efb() {
        public override val `value`: String = "continue_trial"
    }

    /**
     * Documented value. Wire value: `end_trial`.
     */
    public data object EndTrial : InlineV1BillingPortalConfiab44PostRequestFormTrialUpdateBehaviorX1b3b7efb() {
        public override val `value`: String = "end_trial"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1BillingPortalConfiab44PostRequestFormTrialUpdateBehaviorX1b3b7efb()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1BillingPortalConfiab44PostRequestFormTrialUpdateBehaviorX1b3b7efb =
            when (value) {
                ContinueTrial.value -> ContinueTrial
                EndTrial.value -> EndTrial
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1BillingPortalConfiab44PostRequestFormTrialUpdateBehaviorX1b3b7efb> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1BillingPortalConfiab44PostRequestFormTrialUpdateBehaviorX1b3b7efb",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1BillingPortalConfiab44PostRequestFormTrialUpdateBehaviorX1b3b7efb = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1BillingPortalConfiab44PostRequestFormTrialUpdateBehaviorX1b3b7efb,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
