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
 * chema/properties/payment_method_options/properties/upi/properties/mandate_options/properties/amount_type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/upi/properties/mandate_options/properties/amount_type
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiAmountTypeXcc35f5d4.Serializer::class)
public sealed class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiAmountTypeXcc35f5d4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `fixed`.
   */
  public data object Fixed : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiAmountTypeXcc35f5d4() {
    public override val `value`: String = "fixed"
  }

  /**
   * Documented value. Wire value: `maximum`.
   */
  public data object Maximum : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiAmountTypeXcc35f5d4() {
    public override val `value`: String = "maximum"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiAmountTypeXcc35f5d4()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiAmountTypeXcc35f5d4 = when (value) {
      Fixed.value -> Fixed
      Maximum.value -> Maximum
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiAmountTypeXcc35f5d4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiAmountTypeXcc35f5d4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiAmountTypeXcc35f5d4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiAmountTypeXcc35f5d4) {
      encoder.encodeString(value.value)
    }
  }
}
