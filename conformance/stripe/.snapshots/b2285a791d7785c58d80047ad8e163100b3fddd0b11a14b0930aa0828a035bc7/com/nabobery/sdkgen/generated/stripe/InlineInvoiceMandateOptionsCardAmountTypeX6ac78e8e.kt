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
 * One of `fixed` or `maximum`. If `fixed`, the `amount` param refers to the exact amount to be charged in future
 * payments. If `maximum`, the amount charged can be up to the value passed for the `amount` param.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice_mandate_options_card/properties/amount_type
 */
@Serializable(with = InlineInvoiceMandateOptionsCardAmountTypeX6ac78e8e.Serializer::class)
public sealed class InlineInvoiceMandateOptionsCardAmountTypeX6ac78e8e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `fixed`.
   */
  public data object Fixed : InlineInvoiceMandateOptionsCardAmountTypeX6ac78e8e() {
    public override val `value`: String = "fixed"
  }

  /**
   * Documented value. Wire value: `maximum`.
   */
  public data object Maximum : InlineInvoiceMandateOptionsCardAmountTypeX6ac78e8e() {
    public override val `value`: String = "maximum"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInvoiceMandateOptionsCardAmountTypeX6ac78e8e()

  public companion object {
    public fun fromValue(`value`: String): InlineInvoiceMandateOptionsCardAmountTypeX6ac78e8e = when (value) {
      Fixed.value -> Fixed
      Maximum.value -> Maximum
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineInvoiceMandateOptionsCardAmountTypeX6ac78e8e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineInvoiceMandateOptionsCardAmountTypeX6ac78e8e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInvoiceMandateOptionsCardAmountTypeX6ac78e8e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInvoiceMandateOptionsCardAmountTypeX6ac78e8e) {
      encoder.encodeString(value.value)
    }
  }
}
