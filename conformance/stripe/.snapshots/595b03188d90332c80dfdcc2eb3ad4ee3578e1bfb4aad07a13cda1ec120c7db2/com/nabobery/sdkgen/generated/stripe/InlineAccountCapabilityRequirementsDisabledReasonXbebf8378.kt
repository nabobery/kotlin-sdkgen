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
 * Description of why the capability is disabled. [Learn more about handling verification
 * issues](https://docs.stripe.com/connect/handling-api-verification).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capability_requirements/properties/disabled_reason
 */
@Serializable(with = InlineAccountCapabilityRequirementsDisabledReasonXbebf8378.Serializer::class)
public sealed class InlineAccountCapabilityRequirementsDisabledReasonXbebf8378 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `other`.
     */
    public data object Other : InlineAccountCapabilityRequirementsDisabledReasonXbebf8378() {
        public override val `value`: String = "other"
    }

    /**
     * Documented value. Wire value: `paused.inactivity`.
     */
    public data object PausedInactivity : InlineAccountCapabilityRequirementsDisabledReasonXbebf8378() {
        public override val `value`: String = "paused.inactivity"
    }

    /**
     * Documented value. Wire value: `pending.onboarding`.
     */
    public data object PendingOnboarding : InlineAccountCapabilityRequirementsDisabledReasonXbebf8378() {
        public override val `value`: String = "pending.onboarding"
    }

    /**
     * Documented value. Wire value: `pending.review`.
     */
    public data object PendingReview : InlineAccountCapabilityRequirementsDisabledReasonXbebf8378() {
        public override val `value`: String = "pending.review"
    }

    /**
     * Documented value. Wire value: `platform_disabled`.
     */
    public data object PlatformDisabled : InlineAccountCapabilityRequirementsDisabledReasonXbebf8378() {
        public override val `value`: String = "platform_disabled"
    }

    /**
     * Documented value. Wire value: `platform_paused`.
     */
    public data object PlatformPaused : InlineAccountCapabilityRequirementsDisabledReasonXbebf8378() {
        public override val `value`: String = "platform_paused"
    }

    /**
     * Documented value. Wire value: `rejected.inactivity`.
     */
    public data object RejectedInactivity : InlineAccountCapabilityRequirementsDisabledReasonXbebf8378() {
        public override val `value`: String = "rejected.inactivity"
    }

    /**
     * Documented value. Wire value: `rejected.other`.
     */
    public data object RejectedOther : InlineAccountCapabilityRequirementsDisabledReasonXbebf8378() {
        public override val `value`: String = "rejected.other"
    }

    /**
     * Documented value. Wire value: `rejected.unsupported_business`.
     */
    public data object RejectedUnsupportedBusiness : InlineAccountCapabilityRequirementsDisabledReasonXbebf8378() {
        public override val `value`: String = "rejected.unsupported_business"
    }

    /**
     * Documented value. Wire value: `requirements.fields_needed`.
     */
    public data object RequirementsFieldsNeeded : InlineAccountCapabilityRequirementsDisabledReasonXbebf8378() {
        public override val `value`: String = "requirements.fields_needed"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineAccountCapabilityRequirementsDisabledReasonXbebf8378()

    public companion object {
        public fun fromValue(`value`: String): InlineAccountCapabilityRequirementsDisabledReasonXbebf8378 =
            when (value) {
                Other.value -> Other
                PausedInactivity.value -> PausedInactivity
                PendingOnboarding.value -> PendingOnboarding
                PendingReview.value -> PendingReview
                PlatformDisabled.value -> PlatformDisabled
                PlatformPaused.value -> PlatformPaused
                RejectedInactivity.value -> RejectedInactivity
                RejectedOther.value -> RejectedOther
                RejectedUnsupportedBusiness.value -> RejectedUnsupportedBusiness
                RequirementsFieldsNeeded.value -> RequirementsFieldsNeeded
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineAccountCapabilityRequirementsDisabledReasonXbebf8378> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineAccountCapabilityRequirementsDisabledReasonXbebf8378",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineAccountCapabilityRequirementsDisabledReasonXbebf8378 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineAccountCapabilityRequirementsDisabledReasonXbebf8378,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
