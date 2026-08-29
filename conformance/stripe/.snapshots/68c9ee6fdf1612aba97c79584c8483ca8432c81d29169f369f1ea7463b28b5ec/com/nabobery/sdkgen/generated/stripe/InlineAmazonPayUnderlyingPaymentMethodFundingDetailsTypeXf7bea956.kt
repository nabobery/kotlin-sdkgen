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
 * funding type of the underlying payment method.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/amazon_pay_underlying_payment_method_funding_details/properties/type
 */
@Serializable(with = InlineAmazonPayUnderlyingPaymentMethodFundingDetailsTypeXf7bea956.Serializer::class)
public sealed class InlineAmazonPayUnderlyingPaymentMethodFundingDetailsTypeXf7bea956 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `card`.
   */
  public data object Card : InlineAmazonPayUnderlyingPaymentMethodFundingDetailsTypeXf7bea956() {
    public override val `value`: String = "card"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAmazonPayUnderlyingPaymentMethodFundingDetailsTypeXf7bea956()

  public companion object {
    public fun fromValue(`value`: String): InlineAmazonPayUnderlyingPaymentMethodFundingDetailsTypeXf7bea956 = when (value) {
      Card.value -> Card
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAmazonPayUnderlyingPaymentMethodFundingDetailsTypeXf7bea956> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineAmazonPayUnderlyingPaymentMethodFundingDetailsTypeXf7bea956", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAmazonPayUnderlyingPaymentMethodFundingDetailsTypeXf7bea956 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAmazonPayUnderlyingPaymentMethodFundingDetailsTypeXf7bea956) {
      encoder.encodeString(value.value)
    }
  }
}
