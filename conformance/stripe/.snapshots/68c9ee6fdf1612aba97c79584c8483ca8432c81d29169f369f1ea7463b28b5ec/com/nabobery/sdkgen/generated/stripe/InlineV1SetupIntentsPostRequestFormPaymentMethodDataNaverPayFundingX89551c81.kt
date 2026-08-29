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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_data/properties/naver_pay/properties/funding.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_data/properties/naver_pay/properties/funding
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayFundingX89551c81.Serializer::class)
public sealed class InlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayFundingX89551c81 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `card`.
   */
  public data object Card : InlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayFundingX89551c81() {
    public override val `value`: String = "card"
  }

  /**
   * Documented value. Wire value: `points`.
   */
  public data object Points : InlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayFundingX89551c81() {
    public override val `value`: String = "points"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayFundingX89551c81()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayFundingX89551c81 = when (value) {
      Card.value -> Card
      Points.value -> Points
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayFundingX89551c81> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayFundingX89551c81", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayFundingX89551c81 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayFundingX89551c81) {
      encoder.encodeString(value.value)
    }
  }
}
