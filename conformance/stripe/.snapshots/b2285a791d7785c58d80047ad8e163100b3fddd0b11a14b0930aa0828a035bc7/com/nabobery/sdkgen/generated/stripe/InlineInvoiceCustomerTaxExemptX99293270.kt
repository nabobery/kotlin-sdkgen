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
 * The customer's tax exempt status. Until the invoice is finalized, this field will equal `customer.tax_exempt`. Once
 * the invoice is finalized, this field will no longer be updated.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice/properties/customer_tax_exempt
 */
@Serializable(with = InlineInvoiceCustomerTaxExemptX99293270.Serializer::class)
public sealed class InlineInvoiceCustomerTaxExemptX99293270 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `exempt`.
   */
  public data object Exempt : InlineInvoiceCustomerTaxExemptX99293270() {
    public override val `value`: String = "exempt"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineInvoiceCustomerTaxExemptX99293270() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `reverse`.
   */
  public data object Reverse : InlineInvoiceCustomerTaxExemptX99293270() {
    public override val `value`: String = "reverse"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInvoiceCustomerTaxExemptX99293270()

  public companion object {
    public fun fromValue(`value`: String): InlineInvoiceCustomerTaxExemptX99293270 = when (value) {
      Exempt.value -> Exempt
      None.value -> None
      Reverse.value -> Reverse
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineInvoiceCustomerTaxExemptX99293270> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineInvoiceCustomerTaxExemptX99293270", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInvoiceCustomerTaxExemptX99293270 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInvoiceCustomerTaxExemptX99293270) {
      encoder.encodeString(value.value)
    }
  }
}
