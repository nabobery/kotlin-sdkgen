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
 * The tax type, such as `vat` or `sales_tax`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_product_resource_tax_rate_details/properties/tax_type
 */
@Serializable(with = InlineTaxProductResourceTaxRateDetailsTaxTypeX29d1ece4.Serializer::class)
public sealed class InlineTaxProductResourceTaxRateDetailsTaxTypeX29d1ece4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `amusement_tax`.
   */
  public data object AmusementTax : InlineTaxProductResourceTaxRateDetailsTaxTypeX29d1ece4() {
    public override val `value`: String = "amusement_tax"
  }

  /**
   * Documented value. Wire value: `communications_tax`.
   */
  public data object CommunicationsTax : InlineTaxProductResourceTaxRateDetailsTaxTypeX29d1ece4() {
    public override val `value`: String = "communications_tax"
  }

  /**
   * Documented value. Wire value: `gst`.
   */
  public data object Gst : InlineTaxProductResourceTaxRateDetailsTaxTypeX29d1ece4() {
    public override val `value`: String = "gst"
  }

  /**
   * Documented value. Wire value: `hst`.
   */
  public data object Hst : InlineTaxProductResourceTaxRateDetailsTaxTypeX29d1ece4() {
    public override val `value`: String = "hst"
  }

  /**
   * Documented value. Wire value: `igst`.
   */
  public data object Igst : InlineTaxProductResourceTaxRateDetailsTaxTypeX29d1ece4() {
    public override val `value`: String = "igst"
  }

  /**
   * Documented value. Wire value: `jct`.
   */
  public data object Jct : InlineTaxProductResourceTaxRateDetailsTaxTypeX29d1ece4() {
    public override val `value`: String = "jct"
  }

  /**
   * Documented value. Wire value: `lease_tax`.
   */
  public data object LeaseTax : InlineTaxProductResourceTaxRateDetailsTaxTypeX29d1ece4() {
    public override val `value`: String = "lease_tax"
  }

  /**
   * Documented value. Wire value: `pst`.
   */
  public data object Pst : InlineTaxProductResourceTaxRateDetailsTaxTypeX29d1ece4() {
    public override val `value`: String = "pst"
  }

  /**
   * Documented value. Wire value: `qst`.
   */
  public data object Qst : InlineTaxProductResourceTaxRateDetailsTaxTypeX29d1ece4() {
    public override val `value`: String = "qst"
  }

  /**
   * Documented value. Wire value: `retail_delivery_fee`.
   */
  public data object RetailDeliveryFee : InlineTaxProductResourceTaxRateDetailsTaxTypeX29d1ece4() {
    public override val `value`: String = "retail_delivery_fee"
  }

  /**
   * Documented value. Wire value: `rst`.
   */
  public data object Rst : InlineTaxProductResourceTaxRateDetailsTaxTypeX29d1ece4() {
    public override val `value`: String = "rst"
  }

  /**
   * Documented value. Wire value: `sales_tax`.
   */
  public data object SalesTax : InlineTaxProductResourceTaxRateDetailsTaxTypeX29d1ece4() {
    public override val `value`: String = "sales_tax"
  }

  /**
   * Documented value. Wire value: `service_tax`.
   */
  public data object ServiceTax : InlineTaxProductResourceTaxRateDetailsTaxTypeX29d1ece4() {
    public override val `value`: String = "service_tax"
  }

  /**
   * Documented value. Wire value: `vat`.
   */
  public data object Vat : InlineTaxProductResourceTaxRateDetailsTaxTypeX29d1ece4() {
    public override val `value`: String = "vat"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTaxProductResourceTaxRateDetailsTaxTypeX29d1ece4()

  public companion object {
    public fun fromValue(`value`: String): InlineTaxProductResourceTaxRateDetailsTaxTypeX29d1ece4 = when (value) {
      AmusementTax.value -> AmusementTax
      CommunicationsTax.value -> CommunicationsTax
      Gst.value -> Gst
      Hst.value -> Hst
      Igst.value -> Igst
      Jct.value -> Jct
      LeaseTax.value -> LeaseTax
      Pst.value -> Pst
      Qst.value -> Qst
      RetailDeliveryFee.value -> RetailDeliveryFee
      Rst.value -> Rst
      SalesTax.value -> SalesTax
      ServiceTax.value -> ServiceTax
      Vat.value -> Vat
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTaxProductResourceTaxRateDetailsTaxTypeX29d1ece4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTaxProductResourceTaxRateDetailsTaxTypeX29d1ece4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTaxProductResourceTaxRateDetailsTaxTypeX29d1ece4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTaxProductResourceTaxRateDetailsTaxTypeX29d1ece4) {
      encoder.encodeString(value.value)
    }
  }
}
