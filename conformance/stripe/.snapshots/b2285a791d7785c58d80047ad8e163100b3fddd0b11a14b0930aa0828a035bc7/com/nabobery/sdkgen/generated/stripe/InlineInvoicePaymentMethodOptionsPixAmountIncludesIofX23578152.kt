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
 * sdkgen://source/openapi.json#/components/schemas/invoice_payment_method_options_pix/properties/amount_includes_iof
 */
@Serializable(with = InlineInvoicePaymentMethodOptionsPixAmountIncludesIofX23578152.Serializer::class)
public sealed class InlineInvoicePaymentMethodOptionsPixAmountIncludesIofX23578152 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `always`.
   */
  public data object Always : InlineInvoicePaymentMethodOptionsPixAmountIncludesIofX23578152() {
    public override val `value`: String = "always"
  }

  /**
   * Documented value. Wire value: `never`.
   */
  public data object Never : InlineInvoicePaymentMethodOptionsPixAmountIncludesIofX23578152() {
    public override val `value`: String = "never"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInvoicePaymentMethodOptionsPixAmountIncludesIofX23578152()

  public companion object {
    public fun fromValue(`value`: String): InlineInvoicePaymentMethodOptionsPixAmountIncludesIofX23578152 = when (value) {
      Always.value -> Always
      Never.value -> Never
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineInvoicePaymentMethodOptionsPixAmountIncludesIofX23578152> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineInvoicePaymentMethodOptionsPixAmountIncludesIofX23578152", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInvoicePaymentMethodOptionsPixAmountIncludesIofX23578152 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInvoicePaymentMethodOptionsPixAmountIncludesIofX23578152) {
      encoder.encodeString(value.value)
    }
  }
}
