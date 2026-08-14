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
 * If `disabled_reason` is present, all cards will decline authorizations with `cardholder_verification_required`
 * reason.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_cardholder_requirements/properties/disabled_reason
 */
@Serializable(with = InlineIssuingCardholderRequirementsDisabledReasonXb22ed862.Serializer::class)
public sealed class InlineIssuingCardholderRequirementsDisabledReasonXb22ed862 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `listed`.
   */
  public data object Listed : InlineIssuingCardholderRequirementsDisabledReasonXb22ed862() {
    public override val `value`: String = "listed"
  }

  /**
   * Documented value. Wire value: `rejected.listed`.
   */
  public data object RejectedListed : InlineIssuingCardholderRequirementsDisabledReasonXb22ed862() {
    public override val `value`: String = "rejected.listed"
  }

  /**
   * Documented value. Wire value: `requirements.past_due`.
   */
  public data object RequirementsPastDue : InlineIssuingCardholderRequirementsDisabledReasonXb22ed862() {
    public override val `value`: String = "requirements.past_due"
  }

  /**
   * Documented value. Wire value: `under_review`.
   */
  public data object UnderReview : InlineIssuingCardholderRequirementsDisabledReasonXb22ed862() {
    public override val `value`: String = "under_review"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingCardholderRequirementsDisabledReasonXb22ed862()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingCardholderRequirementsDisabledReasonXb22ed862 = when (value) {
      Listed.value -> Listed
      RejectedListed.value -> RejectedListed
      RequirementsPastDue.value -> RequirementsPastDue
      UnderReview.value -> UnderReview
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingCardholderRequirementsDisabledReasonXb22ed862> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineIssuingCardholderRequirementsDisabledReasonXb22ed862", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingCardholderRequirementsDisabledReasonXb22ed862 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingCardholderRequirementsDisabledReasonXb22ed862) {
      encoder.encodeString(value.value)
    }
  }
}
