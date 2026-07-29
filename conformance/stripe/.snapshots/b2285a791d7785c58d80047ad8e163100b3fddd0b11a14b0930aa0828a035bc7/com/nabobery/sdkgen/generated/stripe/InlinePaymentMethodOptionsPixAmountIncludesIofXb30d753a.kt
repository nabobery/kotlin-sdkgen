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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_options_pix/properties/amount_includes_iof
 */
@Serializable(with = InlinePaymentMethodOptionsPixAmountIncludesIofXb30d753a.Serializer::class)
public sealed class InlinePaymentMethodOptionsPixAmountIncludesIofXb30d753a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `always`.
   */
  public data object Always : InlinePaymentMethodOptionsPixAmountIncludesIofXb30d753a() {
    public override val `value`: String = "always"
  }

  /**
   * Documented value. Wire value: `never`.
   */
  public data object Never : InlinePaymentMethodOptionsPixAmountIncludesIofXb30d753a() {
    public override val `value`: String = "never"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodOptionsPixAmountIncludesIofXb30d753a()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodOptionsPixAmountIncludesIofXb30d753a = when (value) {
      Always.value -> Always
      Never.value -> Never
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePaymentMethodOptionsPixAmountIncludesIofXb30d753a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodOptionsPixAmountIncludesIofXb30d753a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodOptionsPixAmountIncludesIofXb30d753a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodOptionsPixAmountIncludesIofXb30d753a) {
      encoder.encodeString(value.value)
    }
  }
}
