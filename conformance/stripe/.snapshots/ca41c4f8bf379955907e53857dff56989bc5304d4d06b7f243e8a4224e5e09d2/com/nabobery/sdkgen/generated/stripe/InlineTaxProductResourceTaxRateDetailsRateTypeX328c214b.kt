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
 * Indicates the type of tax rate applied to the taxable amount. This value can be `null` when no tax applies to the
 * location. This field is only present for TaxRates created by Stripe Tax.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_product_resource_tax_rate_details/properties/rate_type
 */
@Serializable(with = InlineTaxProductResourceTaxRateDetailsRateTypeX328c214b.Serializer::class)
public sealed class InlineTaxProductResourceTaxRateDetailsRateTypeX328c214b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `flat_amount`.
   */
  public data object FlatAmount : InlineTaxProductResourceTaxRateDetailsRateTypeX328c214b() {
    public override val `value`: String = "flat_amount"
  }

  /**
   * Documented value. Wire value: `percentage`.
   */
  public data object Percentage : InlineTaxProductResourceTaxRateDetailsRateTypeX328c214b() {
    public override val `value`: String = "percentage"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTaxProductResourceTaxRateDetailsRateTypeX328c214b()

  public companion object {
    public fun fromValue(`value`: String): InlineTaxProductResourceTaxRateDetailsRateTypeX328c214b = when (value) {
      FlatAmount.value -> FlatAmount
      Percentage.value -> Percentage
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTaxProductResourceTaxRateDetailsRateTypeX328c214b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTaxProductResourceTaxRateDetailsRateTypeX328c214b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTaxProductResourceTaxRateDetailsRateTypeX328c214b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTaxProductResourceTaxRateDetailsRateTypeX328c214b) {
      encoder.encodeString(value.value)
    }
  }
}
