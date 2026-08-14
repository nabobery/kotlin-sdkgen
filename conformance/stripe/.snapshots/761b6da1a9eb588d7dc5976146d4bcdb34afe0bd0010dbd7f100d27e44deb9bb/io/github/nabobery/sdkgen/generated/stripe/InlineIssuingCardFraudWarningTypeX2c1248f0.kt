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
 * The type of fraud warning that most recently took place on this card. This field updates with every new fraud
 * warning, so the value changes over time. If populated, cancel and reissue the card.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_card_fraud_warning/properties/type
 */
@Serializable(with = InlineIssuingCardFraudWarningTypeX2c1248f0.Serializer::class)
public sealed class InlineIssuingCardFraudWarningTypeX2c1248f0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `card_testing_exposure`.
   */
  public data object CardTestingExposure : InlineIssuingCardFraudWarningTypeX2c1248f0() {
    public override val `value`: String = "card_testing_exposure"
  }

  /**
   * Documented value. Wire value: `fraud_dispute_filed`.
   */
  public data object FraudDisputeFiled : InlineIssuingCardFraudWarningTypeX2c1248f0() {
    public override val `value`: String = "fraud_dispute_filed"
  }

  /**
   * Documented value. Wire value: `third_party_reported`.
   */
  public data object ThirdPartyReported : InlineIssuingCardFraudWarningTypeX2c1248f0() {
    public override val `value`: String = "third_party_reported"
  }

  /**
   * Documented value. Wire value: `user_indicated_fraud`.
   */
  public data object UserIndicatedFraud : InlineIssuingCardFraudWarningTypeX2c1248f0() {
    public override val `value`: String = "user_indicated_fraud"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingCardFraudWarningTypeX2c1248f0()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingCardFraudWarningTypeX2c1248f0 = when (value) {
      CardTestingExposure.value -> CardTestingExposure
      FraudDisputeFiled.value -> FraudDisputeFiled
      ThirdPartyReported.value -> ThirdPartyReported
      UserIndicatedFraud.value -> UserIndicatedFraud
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingCardFraudWarningTypeX2c1248f0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineIssuingCardFraudWarningTypeX2c1248f0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingCardFraudWarningTypeX2c1248f0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingCardFraudWarningTypeX2c1248f0) {
      encoder.encodeString(value.value)
    }
  }
}
