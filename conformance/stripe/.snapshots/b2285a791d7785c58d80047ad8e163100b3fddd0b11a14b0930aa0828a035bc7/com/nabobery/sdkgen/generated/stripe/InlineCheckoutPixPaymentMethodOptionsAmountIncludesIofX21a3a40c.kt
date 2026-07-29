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
 * Determines if the amount includes the IOF tax.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/checkout_pix_payment_method_options/properties/amount_includes_iof
 */
@Serializable(with = InlineCheckoutPixPaymentMethodOptionsAmountIncludesIofX21a3a40c.Serializer::class)
public sealed class InlineCheckoutPixPaymentMethodOptionsAmountIncludesIofX21a3a40c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `always`.
   */
  public data object Always : InlineCheckoutPixPaymentMethodOptionsAmountIncludesIofX21a3a40c() {
    public override val `value`: String = "always"
  }

  /**
   * Documented value. Wire value: `never`.
   */
  public data object Never : InlineCheckoutPixPaymentMethodOptionsAmountIncludesIofX21a3a40c() {
    public override val `value`: String = "never"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCheckoutPixPaymentMethodOptionsAmountIncludesIofX21a3a40c()

  public companion object {
    public fun fromValue(`value`: String): InlineCheckoutPixPaymentMethodOptionsAmountIncludesIofX21a3a40c = when (value) {
      Always.value -> Always
      Never.value -> Never
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineCheckoutPixPaymentMethodOptionsAmountIncludesIofX21a3a40c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCheckoutPixPaymentMethodOptionsAmountIncludesIofX21a3a40c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCheckoutPixPaymentMethodOptionsAmountIncludesIofX21a3a40c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutPixPaymentMethodOptionsAmountIncludesIofX21a3a40c) {
      encoder.encodeString(value.value)
    }
  }
}
