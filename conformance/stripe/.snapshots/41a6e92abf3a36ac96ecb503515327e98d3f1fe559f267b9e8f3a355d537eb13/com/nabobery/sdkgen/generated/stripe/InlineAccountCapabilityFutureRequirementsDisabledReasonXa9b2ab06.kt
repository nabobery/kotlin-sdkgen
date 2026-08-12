package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * This is typed as an enum for consistency with `requirements.disabled_reason`, but it safe to assume
 * `future_requirements.disabled_reason` is null because fields in `future_requirements` will never disable the account.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/account_capability_future_requirements/properties/disabled_reason
 */
@Serializable(with = InlineAccountCapabilityFutureRequirementsDisabledReasonXa9b2ab06.Serializer::class)
public sealed class InlineAccountCapabilityFutureRequirementsDisabledReasonXa9b2ab06 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `other`.
   */
  public data object Other : InlineAccountCapabilityFutureRequirementsDisabledReasonXa9b2ab06() {
    public override val `value`: String = "other"
  }

  /**
   * Documented value. Wire value: `paused.inactivity`.
   */
  public data object PausedInactivity : InlineAccountCapabilityFutureRequirementsDisabledReasonXa9b2ab06() {
    public override val `value`: String = "paused.inactivity"
  }

  /**
   * Documented value. Wire value: `pending.onboarding`.
   */
  public data object PendingOnboarding : InlineAccountCapabilityFutureRequirementsDisabledReasonXa9b2ab06() {
    public override val `value`: String = "pending.onboarding"
  }

  /**
   * Documented value. Wire value: `pending.review`.
   */
  public data object PendingReview : InlineAccountCapabilityFutureRequirementsDisabledReasonXa9b2ab06() {
    public override val `value`: String = "pending.review"
  }

  /**
   * Documented value. Wire value: `platform_disabled`.
   */
  public data object PlatformDisabled : InlineAccountCapabilityFutureRequirementsDisabledReasonXa9b2ab06() {
    public override val `value`: String = "platform_disabled"
  }

  /**
   * Documented value. Wire value: `platform_paused`.
   */
  public data object PlatformPaused : InlineAccountCapabilityFutureRequirementsDisabledReasonXa9b2ab06() {
    public override val `value`: String = "platform_paused"
  }

  /**
   * Documented value. Wire value: `rejected.inactivity`.
   */
  public data object RejectedInactivity : InlineAccountCapabilityFutureRequirementsDisabledReasonXa9b2ab06() {
    public override val `value`: String = "rejected.inactivity"
  }

  /**
   * Documented value. Wire value: `rejected.other`.
   */
  public data object RejectedOther : InlineAccountCapabilityFutureRequirementsDisabledReasonXa9b2ab06() {
    public override val `value`: String = "rejected.other"
  }

  /**
   * Documented value. Wire value: `rejected.unsupported_business`.
   */
  public data object RejectedUnsupportedBusiness : InlineAccountCapabilityFutureRequirementsDisabledReasonXa9b2ab06() {
    public override val `value`: String = "rejected.unsupported_business"
  }

  /**
   * Documented value. Wire value: `requirements.fields_needed`.
   */
  public data object RequirementsFieldsNeeded : InlineAccountCapabilityFutureRequirementsDisabledReasonXa9b2ab06() {
    public override val `value`: String = "requirements.fields_needed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountCapabilityFutureRequirementsDisabledReasonXa9b2ab06()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountCapabilityFutureRequirementsDisabledReasonXa9b2ab06 = when (value) {
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

  internal object Serializer : KSerializer<InlineAccountCapabilityFutureRequirementsDisabledReasonXa9b2ab06> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineAccountCapabilityFutureRequirementsDisabledReasonXa9b2ab06", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountCapabilityFutureRequirementsDisabledReasonXa9b2ab06 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountCapabilityFutureRequirementsDisabledReasonXa9b2ab06) {
      encoder.encodeString(value.value)
    }
  }
}
