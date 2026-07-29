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
 * Whether this tax is inclusive or exclusive.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/billing_bill_resource_invoicing_taxes_tax/properties/tax_behavior
 */
@Serializable(with = InlineBillingBillResourceInvoicingTaxesTaxTaxBehaviorXb3894f7a.Serializer::class)
public sealed class InlineBillingBillResourceInvoicingTaxesTaxTaxBehaviorXb3894f7a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `exclusive`.
   */
  public data object Exclusive : InlineBillingBillResourceInvoicingTaxesTaxTaxBehaviorXb3894f7a() {
    public override val `value`: String = "exclusive"
  }

  /**
   * Documented value. Wire value: `inclusive`.
   */
  public data object Inclusive : InlineBillingBillResourceInvoicingTaxesTaxTaxBehaviorXb3894f7a() {
    public override val `value`: String = "inclusive"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBillingBillResourceInvoicingTaxesTaxTaxBehaviorXb3894f7a()

  public companion object {
    public fun fromValue(`value`: String): InlineBillingBillResourceInvoicingTaxesTaxTaxBehaviorXb3894f7a = when (value) {
      Exclusive.value -> Exclusive
      Inclusive.value -> Inclusive
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineBillingBillResourceInvoicingTaxesTaxTaxBehaviorXb3894f7a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineBillingBillResourceInvoicingTaxesTaxTaxBehaviorXb3894f7a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBillingBillResourceInvoicingTaxesTaxTaxBehaviorXb3894f7a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBillingBillResourceInvoicingTaxesTaxTaxBehaviorXb3894f7a) {
      encoder.encodeString(value.value)
    }
  }
}
