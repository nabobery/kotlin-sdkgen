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
 * Whether to fund this transaction with Naver Pay points or a card.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_naver_pay/properties/funding
 */
@Serializable(with = InlinePaymentMethodNaverPayFundingX4eb0b779.Serializer::class)
public sealed class InlinePaymentMethodNaverPayFundingX4eb0b779 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `card`.
   */
  public data object Card : InlinePaymentMethodNaverPayFundingX4eb0b779() {
    public override val `value`: String = "card"
  }

  /**
   * Documented value. Wire value: `points`.
   */
  public data object Points : InlinePaymentMethodNaverPayFundingX4eb0b779() {
    public override val `value`: String = "points"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodNaverPayFundingX4eb0b779()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodNaverPayFundingX4eb0b779 = when (value) {
      Card.value -> Card
      Points.value -> Points
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePaymentMethodNaverPayFundingX4eb0b779> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodNaverPayFundingX4eb0b779", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodNaverPayFundingX4eb0b779 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodNaverPayFundingX4eb0b779) {
      encoder.encodeString(value.value)
    }
  }
}
