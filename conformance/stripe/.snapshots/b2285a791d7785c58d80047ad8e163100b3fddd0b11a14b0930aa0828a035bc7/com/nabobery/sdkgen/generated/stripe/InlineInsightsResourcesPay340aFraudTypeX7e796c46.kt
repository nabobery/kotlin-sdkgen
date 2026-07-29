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
 * The type of fraud labeled by the issuer.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_early_fraud_warning_received/p
 * roperties/fraud_type
 */
@Serializable(with = InlineInsightsResourcesPay340aFraudTypeX7e796c46.Serializer::class)
public sealed class InlineInsightsResourcesPay340aFraudTypeX7e796c46 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `made_with_lost_card`.
   */
  public data object MadeWithLostCard : InlineInsightsResourcesPay340aFraudTypeX7e796c46() {
    public override val `value`: String = "made_with_lost_card"
  }

  /**
   * Documented value. Wire value: `made_with_stolen_card`.
   */
  public data object MadeWithStolenCard : InlineInsightsResourcesPay340aFraudTypeX7e796c46() {
    public override val `value`: String = "made_with_stolen_card"
  }

  /**
   * Documented value. Wire value: `other`.
   */
  public data object Other : InlineInsightsResourcesPay340aFraudTypeX7e796c46() {
    public override val `value`: String = "other"
  }

  /**
   * Documented value. Wire value: `unauthorized_use_of_card`.
   */
  public data object UnauthorizedUseOfCard : InlineInsightsResourcesPay340aFraudTypeX7e796c46() {
    public override val `value`: String = "unauthorized_use_of_card"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInsightsResourcesPay340aFraudTypeX7e796c46()

  public companion object {
    public fun fromValue(`value`: String): InlineInsightsResourcesPay340aFraudTypeX7e796c46 = when (value) {
      MadeWithLostCard.value -> MadeWithLostCard
      MadeWithStolenCard.value -> MadeWithStolenCard
      Other.value -> Other
      UnauthorizedUseOfCard.value -> UnauthorizedUseOfCard
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineInsightsResourcesPay340aFraudTypeX7e796c46> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineInsightsResourcesPay340aFraudTypeX7e796c46", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInsightsResourcesPay340aFraudTypeX7e796c46 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInsightsResourcesPay340aFraudTypeX7e796c46) {
      encoder.encodeString(value.value)
    }
  }
}
