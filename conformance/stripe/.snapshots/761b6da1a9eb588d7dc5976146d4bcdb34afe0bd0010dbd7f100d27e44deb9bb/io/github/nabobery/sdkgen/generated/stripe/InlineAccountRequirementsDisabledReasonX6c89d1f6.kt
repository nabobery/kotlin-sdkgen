package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * If the account is disabled, this enum describes why. [Learn more about handling verification
 * issues](https://docs.stripe.com/connect/handling-api-verification).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_requirements/properties/disabled_reason
 */
@Serializable(with = InlineAccountRequirementsDisabledReasonX6c89d1f6.Serializer::class)
public sealed class InlineAccountRequirementsDisabledReasonX6c89d1f6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `action_required.requested_capabilities`.
   */
  public data object ActionRequiredRequestedCapabilities : InlineAccountRequirementsDisabledReasonX6c89d1f6() {
    public override val `value`: String = "action_required.requested_capabilities"
  }

  /**
   * Documented value. Wire value: `listed`.
   */
  public data object Listed : InlineAccountRequirementsDisabledReasonX6c89d1f6() {
    public override val `value`: String = "listed"
  }

  /**
   * Documented value. Wire value: `other`.
   */
  public data object Other : InlineAccountRequirementsDisabledReasonX6c89d1f6() {
    public override val `value`: String = "other"
  }

  /**
   * Documented value. Wire value: `platform_paused`.
   */
  public data object PlatformPaused : InlineAccountRequirementsDisabledReasonX6c89d1f6() {
    public override val `value`: String = "platform_paused"
  }

  /**
   * Documented value. Wire value: `rejected.fraud`.
   */
  public data object RejectedFraud : InlineAccountRequirementsDisabledReasonX6c89d1f6() {
    public override val `value`: String = "rejected.fraud"
  }

  /**
   * Documented value. Wire value: `rejected.incomplete_verification`.
   */
  public data object RejectedIncompleteVerification : InlineAccountRequirementsDisabledReasonX6c89d1f6() {
    public override val `value`: String = "rejected.incomplete_verification"
  }

  /**
   * Documented value. Wire value: `rejected.listed`.
   */
  public data object RejectedListed : InlineAccountRequirementsDisabledReasonX6c89d1f6() {
    public override val `value`: String = "rejected.listed"
  }

  /**
   * Documented value. Wire value: `rejected.other`.
   */
  public data object RejectedOther : InlineAccountRequirementsDisabledReasonX6c89d1f6() {
    public override val `value`: String = "rejected.other"
  }

  /**
   * Documented value. Wire value: `rejected.platform_fraud`.
   */
  public data object RejectedPlatformFraud : InlineAccountRequirementsDisabledReasonX6c89d1f6() {
    public override val `value`: String = "rejected.platform_fraud"
  }

  /**
   * Documented value. Wire value: `rejected.platform_other`.
   */
  public data object RejectedPlatformOther : InlineAccountRequirementsDisabledReasonX6c89d1f6() {
    public override val `value`: String = "rejected.platform_other"
  }

  /**
   * Documented value. Wire value: `rejected.platform_terms_of_service`.
   */
  public data object RejectedPlatformTermsOfService : InlineAccountRequirementsDisabledReasonX6c89d1f6() {
    public override val `value`: String = "rejected.platform_terms_of_service"
  }

  /**
   * Documented value. Wire value: `rejected.terms_of_service`.
   */
  public data object RejectedTermsOfService : InlineAccountRequirementsDisabledReasonX6c89d1f6() {
    public override val `value`: String = "rejected.terms_of_service"
  }

  /**
   * Documented value. Wire value: `requirements.past_due`.
   */
  public data object RequirementsPastDue : InlineAccountRequirementsDisabledReasonX6c89d1f6() {
    public override val `value`: String = "requirements.past_due"
  }

  /**
   * Documented value. Wire value: `requirements.pending_verification`.
   */
  public data object RequirementsPendingVerification : InlineAccountRequirementsDisabledReasonX6c89d1f6() {
    public override val `value`: String = "requirements.pending_verification"
  }

  /**
   * Documented value. Wire value: `under_review`.
   */
  public data object UnderReview : InlineAccountRequirementsDisabledReasonX6c89d1f6() {
    public override val `value`: String = "under_review"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountRequirementsDisabledReasonX6c89d1f6()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountRequirementsDisabledReasonX6c89d1f6 = when (value) {
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

  internal object Serializer : KSerializer<InlineAccountRequirementsDisabledReasonX6c89d1f6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineAccountRequirementsDisabledReasonX6c89d1f6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountRequirementsDisabledReasonX6c89d1f6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountRequirementsDisabledReasonX6c89d1f6) {
      encoder.encodeString(value.value)
    }
  }
}
