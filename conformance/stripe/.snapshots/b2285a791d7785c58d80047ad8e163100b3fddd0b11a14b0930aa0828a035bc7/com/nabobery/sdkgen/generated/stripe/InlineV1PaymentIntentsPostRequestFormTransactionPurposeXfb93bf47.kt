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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/us_bank_account/anyOf/0/properties/transaction_purpose.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/us_bank_account/anyOf/0/properties/transaction_purpose
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormTransactionPurposeXfb93bf47.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormTransactionPurposeXfb93bf47 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1PaymentIntentsPostRequestFormTransactionPurposeXfb93bf47() {
    public override val `value`: String = ""
  }

  /**
   * Documented value. Wire value: `goods`.
   */
  public data object Goods : InlineV1PaymentIntentsPostRequestFormTransactionPurposeXfb93bf47() {
    public override val `value`: String = "goods"
  }

  /**
   * Documented value. Wire value: `other`.
   */
  public data object Other : InlineV1PaymentIntentsPostRequestFormTransactionPurposeXfb93bf47() {
    public override val `value`: String = "other"
  }

  /**
   * Documented value. Wire value: `services`.
   */
  public data object Services : InlineV1PaymentIntentsPostRequestFormTransactionPurposeXfb93bf47() {
    public override val `value`: String = "services"
  }

  /**
   * Documented value. Wire value: `unspecified`.
   */
  public data object Unspecified : InlineV1PaymentIntentsPostRequestFormTransactionPurposeXfb93bf47() {
    public override val `value`: String = "unspecified"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsPostRequestFormTransactionPurposeXfb93bf47()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsPostRequestFormTransactionPurposeXfb93bf47 = when (value) {
      Value.value -> Value
      Goods.value -> Goods
      Other.value -> Other
      Services.value -> Services
      Unspecified.value -> Unspecified
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormTransactionPurposeXfb93bf47> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormTransactionPurposeXfb93bf47", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormTransactionPurposeXfb93bf47 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormTransactionPurposeXfb93bf47) {
      encoder.encodeString(value.value)
    }
  }
}
