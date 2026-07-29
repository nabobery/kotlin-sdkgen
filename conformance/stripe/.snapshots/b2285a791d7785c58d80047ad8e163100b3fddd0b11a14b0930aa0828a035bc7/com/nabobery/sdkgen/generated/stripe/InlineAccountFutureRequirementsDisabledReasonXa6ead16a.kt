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
 * This is typed as an enum for consistency with `requirements.disabled_reason`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_future_requirements/properties/disabled_reason
 */
@Serializable(with = InlineAccountFutureRequirementsDisabledReasonXa6ead16a.Serializer::class)
public sealed class InlineAccountFutureRequirementsDisabledReasonXa6ead16a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `action_required.requested_capabilities`.
   */
  public data object ActionRequiredRequestedCapabilities : InlineAccountFutureRequirementsDisabledReasonXa6ead16a() {
    public override val `value`: String = "action_required.requested_capabilities"
  }

  /**
   * Documented value. Wire value: `listed`.
   */
  public data object Listed : InlineAccountFutureRequirementsDisabledReasonXa6ead16a() {
    public override val `value`: String = "listed"
  }

  /**
   * Documented value. Wire value: `other`.
   */
  public data object Other : InlineAccountFutureRequirementsDisabledReasonXa6ead16a() {
    public override val `value`: String = "other"
  }

  /**
   * Documented value. Wire value: `platform_paused`.
   */
  public data object PlatformPaused : InlineAccountFutureRequirementsDisabledReasonXa6ead16a() {
    public override val `value`: String = "platform_paused"
  }

  /**
   * Documented value. Wire value: `rejected.fraud`.
   */
  public data object RejectedFraud : InlineAccountFutureRequirementsDisabledReasonXa6ead16a() {
    public override val `value`: String = "rejected.fraud"
  }

  /**
   * Documented value. Wire value: `rejected.incomplete_verification`.
   */
  public data object RejectedIncompleteVerification : InlineAccountFutureRequirementsDisabledReasonXa6ead16a() {
    public override val `value`: String = "rejected.incomplete_verification"
  }

  /**
   * Documented value. Wire value: `rejected.listed`.
   */
  public data object RejectedListed : InlineAccountFutureRequirementsDisabledReasonXa6ead16a() {
    public override val `value`: String = "rejected.listed"
  }

  /**
   * Documented value. Wire value: `rejected.other`.
   */
  public data object RejectedOther : InlineAccountFutureRequirementsDisabledReasonXa6ead16a() {
    public override val `value`: String = "rejected.other"
  }

  /**
   * Documented value. Wire value: `rejected.platform_fraud`.
   */
  public data object RejectedPlatformFraud : InlineAccountFutureRequirementsDisabledReasonXa6ead16a() {
    public override val `value`: String = "rejected.platform_fraud"
  }

  /**
   * Documented value. Wire value: `rejected.platform_other`.
   */
  public data object RejectedPlatformOther : InlineAccountFutureRequirementsDisabledReasonXa6ead16a() {
    public override val `value`: String = "rejected.platform_other"
  }

  /**
   * Documented value. Wire value: `rejected.platform_terms_of_service`.
   */
  public data object RejectedPlatformTermsOfService : InlineAccountFutureRequirementsDisabledReasonXa6ead16a() {
    public override val `value`: String = "rejected.platform_terms_of_service"
  }

  /**
   * Documented value. Wire value: `rejected.terms_of_service`.
   */
  public data object RejectedTermsOfService : InlineAccountFutureRequirementsDisabledReasonXa6ead16a() {
    public override val `value`: String = "rejected.terms_of_service"
  }

  /**
   * Documented value. Wire value: `requirements.past_due`.
   */
  public data object RequirementsPastDue : InlineAccountFutureRequirementsDisabledReasonXa6ead16a() {
    public override val `value`: String = "requirements.past_due"
  }

  /**
   * Documented value. Wire value: `requirements.pending_verification`.
   */
  public data object RequirementsPendingVerification : InlineAccountFutureRequirementsDisabledReasonXa6ead16a() {
    public override val `value`: String = "requirements.pending_verification"
  }

  /**
   * Documented value. Wire value: `under_review`.
   */
  public data object UnderReview : InlineAccountFutureRequirementsDisabledReasonXa6ead16a() {
    public override val `value`: String = "under_review"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountFutureRequirementsDisabledReasonXa6ead16a()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountFutureRequirementsDisabledReasonXa6ead16a = when (value) {
      ActionRequiredRequestedCapabilities.value -> ActionRequiredRequestedCapabilities
      Listed.value -> Listed
      Other.value -> Other
      PlatformPaused.value -> PlatformPaused
      RejectedFraud.value -> RejectedFraud
      RejectedIncompleteVerification.value -> RejectedIncompleteVerification
      RejectedListed.value -> RejectedListed
      RejectedOther.value -> RejectedOther
      RejectedPlatformFraud.value -> RejectedPlatformFraud
      RejectedPlatformOther.value -> RejectedPlatformOther
      RejectedPlatformTermsOfService.value -> RejectedPlatformTermsOfService
      RejectedTermsOfService.value -> RejectedTermsOfService
      RequirementsPastDue.value -> RequirementsPastDue
      RequirementsPendingVerification.value -> RequirementsPendingVerification
      UnderReview.value -> UnderReview
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAccountFutureRequirementsDisabledReasonXa6ead16a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineAccountFutureRequirementsDisabledReasonXa6ead16a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountFutureRequirementsDisabledReasonXa6ead16a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountFutureRequirementsDisabledReasonXa6ead16a) {
      encoder.encodeString(value.value)
    }
  }
}
