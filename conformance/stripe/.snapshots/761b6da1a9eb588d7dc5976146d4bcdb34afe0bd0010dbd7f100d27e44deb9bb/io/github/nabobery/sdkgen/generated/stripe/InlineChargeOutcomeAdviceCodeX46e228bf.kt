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
 * An enumerated value providing a more detailed explanation on [how to proceed with an
 * error](https://docs.stripe.com/declines#retrying-issuer-declines).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/charge_outcome/properties/advice_code
 */
@Serializable(with = InlineChargeOutcomeAdviceCodeX46e228bf.Serializer::class)
public sealed class InlineChargeOutcomeAdviceCodeX46e228bf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `confirm_card_data`.
   */
  public data object ConfirmCardData : InlineChargeOutcomeAdviceCodeX46e228bf() {
    public override val `value`: String = "confirm_card_data"
  }

  /**
   * Documented value. Wire value: `do_not_try_again`.
   */
  public data object DoNotTryAgain : InlineChargeOutcomeAdviceCodeX46e228bf() {
    public override val `value`: String = "do_not_try_again"
  }

  /**
   * Documented value. Wire value: `try_again_later`.
   */
  public data object TryAgainLater : InlineChargeOutcomeAdviceCodeX46e228bf() {
    public override val `value`: String = "try_again_later"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineChargeOutcomeAdviceCodeX46e228bf()

  public companion object {
    public fun fromValue(`value`: String): InlineChargeOutcomeAdviceCodeX46e228bf = when (value) {
      ConfirmCardData.value -> ConfirmCardData
      DoNotTryAgain.value -> DoNotTryAgain
      TryAgainLater.value -> TryAgainLater
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineChargeOutcomeAdviceCodeX46e228bf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineChargeOutcomeAdviceCodeX46e228bf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineChargeOutcomeAdviceCodeX46e228bf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineChargeOutcomeAdviceCodeX46e228bf) {
      encoder.encodeString(value.value)
    }
  }
}
