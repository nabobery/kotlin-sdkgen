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
 * sdkgen://source/openapi.json#/components/schemas/payment_method_options_mandate_options_pix/properties/amount_include
 * s_iof
 */
@Serializable(with = InlinePaymentMethodOptionsMandateOptionsPixAmountIncludesIofX90ab6306.Serializer::class)
public sealed class InlinePaymentMethodOptionsMandateOptionsPixAmountIncludesIofX90ab6306 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `always`.
   */
  public data object Always : InlinePaymentMethodOptionsMandateOptionsPixAmountIncludesIofX90ab6306() {
    public override val `value`: String = "always"
  }

  /**
   * Documented value. Wire value: `never`.
   */
  public data object Never : InlinePaymentMethodOptionsMandateOptionsPixAmountIncludesIofX90ab6306() {
    public override val `value`: String = "never"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodOptionsMandateOptionsPixAmountIncludesIofX90ab6306()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodOptionsMandateOptionsPixAmountIncludesIofX90ab6306 = when (value) {
      Always.value -> Always
      Never.value -> Never
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodOptionsMandateOptionsPixAmountIncludesIofX90ab6306> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodOptionsMandateOptionsPixAmountIncludesIofX90ab6306", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodOptionsMandateOptionsPixAmountIncludesIofX90ab6306 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodOptionsMandateOptionsPixAmountIncludesIofX90ab6306) {
      encoder.encodeString(value.value)
    }
  }
}
