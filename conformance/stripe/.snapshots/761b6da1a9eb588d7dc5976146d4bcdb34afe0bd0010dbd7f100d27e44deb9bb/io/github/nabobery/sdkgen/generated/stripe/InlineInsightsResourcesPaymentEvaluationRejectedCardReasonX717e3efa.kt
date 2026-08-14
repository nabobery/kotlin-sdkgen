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
 * Card issuer's reason for the network decline.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_rejected_card/properties/reaso
 * n
 */
@Serializable(with = InlineInsightsResourcesPaymentEvaluationRejectedCardReasonX717e3efa.Serializer::class)
public sealed class InlineInsightsResourcesPaymentEvaluationRejectedCardReasonX717e3efa {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `authentication_failed`.
   */
  public data object AuthenticationFailed : InlineInsightsResourcesPaymentEvaluationRejectedCardReasonX717e3efa() {
    public override val `value`: String = "authentication_failed"
  }

  /**
   * Documented value. Wire value: `do_not_honor`.
   */
  public data object DoNotHonor : InlineInsightsResourcesPaymentEvaluationRejectedCardReasonX717e3efa() {
    public override val `value`: String = "do_not_honor"
  }

  /**
   * Documented value. Wire value: `expired`.
   */
  public data object Expired : InlineInsightsResourcesPaymentEvaluationRejectedCardReasonX717e3efa() {
    public override val `value`: String = "expired"
  }

  /**
   * Documented value. Wire value: `incorrect_cvc`.
   */
  public data object IncorrectCvc : InlineInsightsResourcesPaymentEvaluationRejectedCardReasonX717e3efa() {
    public override val `value`: String = "incorrect_cvc"
  }

  /**
   * Documented value. Wire value: `incorrect_number`.
   */
  public data object IncorrectNumber : InlineInsightsResourcesPaymentEvaluationRejectedCardReasonX717e3efa() {
    public override val `value`: String = "incorrect_number"
  }

  /**
   * Documented value. Wire value: `incorrect_postal_code`.
   */
  public data object IncorrectPostalCode : InlineInsightsResourcesPaymentEvaluationRejectedCardReasonX717e3efa() {
    public override val `value`: String = "incorrect_postal_code"
  }

  /**
   * Documented value. Wire value: `insufficient_funds`.
   */
  public data object InsufficientFunds : InlineInsightsResourcesPaymentEvaluationRejectedCardReasonX717e3efa() {
    public override val `value`: String = "insufficient_funds"
  }

  /**
   * Documented value. Wire value: `invalid_account`.
   */
  public data object InvalidAccount : InlineInsightsResourcesPaymentEvaluationRejectedCardReasonX717e3efa() {
    public override val `value`: String = "invalid_account"
  }

  /**
   * Documented value. Wire value: `lost_card`.
   */
  public data object LostCard : InlineInsightsResourcesPaymentEvaluationRejectedCardReasonX717e3efa() {
    public override val `value`: String = "lost_card"
  }

  /**
   * Documented value. Wire value: `other`.
   */
  public data object Other : InlineInsightsResourcesPaymentEvaluationRejectedCardReasonX717e3efa() {
    public override val `value`: String = "other"
  }

  /**
   * Documented value. Wire value: `processing_error`.
   */
  public data object ProcessingError : InlineInsightsResourcesPaymentEvaluationRejectedCardReasonX717e3efa() {
    public override val `value`: String = "processing_error"
  }

  /**
   * Documented value. Wire value: `reported_stolen`.
   */
  public data object ReportedStolen : InlineInsightsResourcesPaymentEvaluationRejectedCardReasonX717e3efa() {
    public override val `value`: String = "reported_stolen"
  }

  /**
   * Documented value. Wire value: `try_again_later`.
   */
  public data object TryAgainLater : InlineInsightsResourcesPaymentEvaluationRejectedCardReasonX717e3efa() {
    public override val `value`: String = "try_again_later"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInsightsResourcesPaymentEvaluationRejectedCardReasonX717e3efa()

  public companion object {
    public fun fromValue(`value`: String): InlineInsightsResourcesPaymentEvaluationRejectedCardReasonX717e3efa = when (value) {
      AuthenticationFailed.value -> AuthenticationFailed
      DoNotHonor.value -> DoNotHonor
      Expired.value -> Expired
      IncorrectCvc.value -> IncorrectCvc
      IncorrectNumber.value -> IncorrectNumber
      IncorrectPostalCode.value -> IncorrectPostalCode
      InsufficientFunds.value -> InsufficientFunds
      InvalidAccount.value -> InvalidAccount
      LostCard.value -> LostCard
      Other.value -> Other
      ProcessingError.value -> ProcessingError
      ReportedStolen.value -> ReportedStolen
      TryAgainLater.value -> TryAgainLater
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineInsightsResourcesPaymentEvaluationRejectedCardReasonX717e3efa> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineInsightsResourcesPaymentEvaluationRejectedCardReasonX717e3efa", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInsightsResourcesPaymentEvaluationRejectedCardReasonX717e3efa = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInsightsResourcesPaymentEvaluationRejectedCardReasonX717e3efa) {
      encoder.encodeString(value.value)
    }
  }
}
