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
 * Source: sdkgen://source/openapi.json#/components/schemas/tax.calculation_line_item/properties/tax_behavior
 */
@Serializable(with = InlineTaxCalculationLineItemTaxBehaviorX254c641f.Serializer::class)
public sealed class InlineTaxCalculationLineItemTaxBehaviorX254c641f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `exclusive`.
   */
  public data object Exclusive : InlineTaxCalculationLineItemTaxBehaviorX254c641f() {
    public override val `value`: String = "exclusive"
  }

  /**
   * Documented value. Wire value: `inclusive`.
   */
  public data object Inclusive : InlineTaxCalculationLineItemTaxBehaviorX254c641f() {
    public override val `value`: String = "inclusive"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTaxCalculationLineItemTaxBehaviorX254c641f()

  public companion object {
    public fun fromValue(`value`: String): InlineTaxCalculationLineItemTaxBehaviorX254c641f = when (value) {
      Exclusive.value -> Exclusive
      Inclusive.value -> Inclusive
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineTaxCalculationLineItemTaxBehaviorX254c641f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTaxCalculationLineItemTaxBehaviorX254c641f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTaxCalculationLineItemTaxBehaviorX254c641f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTaxCalculationLineItemTaxBehaviorX254c641f) {
      encoder.encodeString(value.value)
    }
  }
}
