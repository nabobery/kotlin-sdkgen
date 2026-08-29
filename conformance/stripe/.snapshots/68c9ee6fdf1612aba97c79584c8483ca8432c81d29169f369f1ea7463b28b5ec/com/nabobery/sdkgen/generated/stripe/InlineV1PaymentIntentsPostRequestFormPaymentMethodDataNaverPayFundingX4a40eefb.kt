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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_data/properties/naver_pay/properties/funding.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_data/properties/naver_pay/properties/funding
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNaverPayFundingX4a40eefb.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNaverPayFundingX4a40eefb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `card`.
   */
  public data object Card : InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNaverPayFundingX4a40eefb() {
    public override val `value`: String = "card"
  }

  /**
   * Documented value. Wire value: `points`.
   */
  public data object Points : InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNaverPayFundingX4a40eefb() {
    public override val `value`: String = "points"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNaverPayFundingX4a40eefb()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNaverPayFundingX4a40eefb = when (value) {
      Card.value -> Card
      Points.value -> Points
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNaverPayFundingX4a40eefb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNaverPayFundingX4a40eefb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNaverPayFundingX4a40eefb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNaverPayFundingX4a40eefb) {
      encoder.encodeString(value.value)
    }
  }
}
