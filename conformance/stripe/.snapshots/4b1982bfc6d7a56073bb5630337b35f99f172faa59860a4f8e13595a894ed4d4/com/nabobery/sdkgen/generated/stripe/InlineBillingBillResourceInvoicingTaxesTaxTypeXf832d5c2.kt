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
 * The type of tax information.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing_bill_resource_invoicing_taxes_tax/properties/type
 */
@Serializable(with = InlineBillingBillResourceInvoicingTaxesTaxTypeXf832d5c2.Serializer::class)
public sealed class InlineBillingBillResourceInvoicingTaxesTaxTypeXf832d5c2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `tax_rate_details`.
   */
  public data object TaxRateDetails : InlineBillingBillResourceInvoicingTaxesTaxTypeXf832d5c2() {
    public override val `value`: String = "tax_rate_details"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBillingBillResourceInvoicingTaxesTaxTypeXf832d5c2()

  public companion object {
    public fun fromValue(`value`: String): InlineBillingBillResourceInvoicingTaxesTaxTypeXf832d5c2 = when (value) {
      TaxRateDetails.value -> TaxRateDetails
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBillingBillResourceInvoicingTaxesTaxTypeXf832d5c2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineBillingBillResourceInvoicingTaxesTaxTypeXf832d5c2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBillingBillResourceInvoicingTaxesTaxTypeXf832d5c2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBillingBillResourceInvoicingTaxesTaxTypeXf832d5c2) {
      encoder.encodeString(value.value)
    }
  }
}
