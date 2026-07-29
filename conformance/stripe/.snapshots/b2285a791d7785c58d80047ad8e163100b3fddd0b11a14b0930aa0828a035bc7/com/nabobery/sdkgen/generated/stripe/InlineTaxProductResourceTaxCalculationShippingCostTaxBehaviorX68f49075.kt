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
 * Specifies whether the `amount` includes taxes. If `tax_behavior=inclusive`, then the amount includes taxes.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/tax_product_resource_tax_calculation_shipping_cost/properties/tax_be
 * havior
 */
@Serializable(with = InlineTaxProductResourceTaxCalculationShippingCostTaxBehaviorX68f49075.Serializer::class)
public sealed class InlineTaxProductResourceTaxCalculationShippingCostTaxBehaviorX68f49075 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `exclusive`.
   */
  public data object Exclusive : InlineTaxProductResourceTaxCalculationShippingCostTaxBehaviorX68f49075() {
    public override val `value`: String = "exclusive"
  }

  /**
   * Documented value. Wire value: `inclusive`.
   */
  public data object Inclusive : InlineTaxProductResourceTaxCalculationShippingCostTaxBehaviorX68f49075() {
    public override val `value`: String = "inclusive"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTaxProductResourceTaxCalculationShippingCostTaxBehaviorX68f49075()

  public companion object {
    public fun fromValue(`value`: String): InlineTaxProductResourceTaxCalculationShippingCostTaxBehaviorX68f49075 = when (value) {
      Exclusive.value -> Exclusive
      Inclusive.value -> Inclusive
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineTaxProductResourceTaxCalculationShippingCostTaxBehaviorX68f49075> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTaxProductResourceTaxCalculationShippingCostTaxBehaviorX68f49075", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTaxProductResourceTaxCalculationShippingCostTaxBehaviorX68f49075 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTaxProductResourceTaxCalculationShippingCostTaxBehaviorX68f49075) {
      encoder.encodeString(value.value)
    }
  }
}
