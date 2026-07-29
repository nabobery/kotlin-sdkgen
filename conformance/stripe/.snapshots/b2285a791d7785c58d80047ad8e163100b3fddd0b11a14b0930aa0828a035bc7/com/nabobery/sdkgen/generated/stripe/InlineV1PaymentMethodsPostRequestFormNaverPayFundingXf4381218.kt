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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/naver_pay/properties/funding.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/naver_pay/properties/funding
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormNaverPayFundingXf4381218.Serializer::class)
public sealed class InlineV1PaymentMethodsPostRequestFormNaverPayFundingXf4381218 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `card`.
   */
  public data object Card : InlineV1PaymentMethodsPostRequestFormNaverPayFundingXf4381218() {
    public override val `value`: String = "card"
  }

  /**
   * Documented value. Wire value: `points`.
   */
  public data object Points : InlineV1PaymentMethodsPostRequestFormNaverPayFundingXf4381218() {
    public override val `value`: String = "points"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentMethodsPostRequestFormNaverPayFundingXf4381218()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentMethodsPostRequestFormNaverPayFundingXf4381218 = when (value) {
      Card.value -> Card
      Points.value -> Points
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormNaverPayFundingXf4381218> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentMethodsPostRequestFormNaverPayFundingXf4381218", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodsPostRequestFormNaverPayFundingXf4381218 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodsPostRequestFormNaverPayFundingXf4381218) {
      encoder.encodeString(value.value)
    }
  }
}
