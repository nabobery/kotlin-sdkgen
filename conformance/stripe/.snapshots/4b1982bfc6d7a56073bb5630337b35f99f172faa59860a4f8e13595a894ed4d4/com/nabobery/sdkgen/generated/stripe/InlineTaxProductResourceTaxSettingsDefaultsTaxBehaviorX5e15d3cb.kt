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
 * Default [tax behavior](https://stripe.com/docs/tax/products-prices-tax-categories-tax-behavior#tax-behavior) used to
 * specify whether the price is considered inclusive of taxes or exclusive of taxes. If the item's price has a tax
 * behavior set, it will take precedence over the default tax behavior.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/tax_product_resource_tax_settings_defaults/properties/tax_behavior
 */
@Serializable(with = InlineTaxProductResourceTaxSettingsDefaultsTaxBehaviorX5e15d3cb.Serializer::class)
public sealed class InlineTaxProductResourceTaxSettingsDefaultsTaxBehaviorX5e15d3cb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `exclusive`.
   */
  public data object Exclusive : InlineTaxProductResourceTaxSettingsDefaultsTaxBehaviorX5e15d3cb() {
    public override val `value`: String = "exclusive"
  }

  /**
   * Documented value. Wire value: `inclusive`.
   */
  public data object Inclusive : InlineTaxProductResourceTaxSettingsDefaultsTaxBehaviorX5e15d3cb() {
    public override val `value`: String = "inclusive"
  }

  /**
   * Documented value. Wire value: `inferred_by_currency`.
   */
  public data object InferredByCurrency : InlineTaxProductResourceTaxSettingsDefaultsTaxBehaviorX5e15d3cb() {
    public override val `value`: String = "inferred_by_currency"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTaxProductResourceTaxSettingsDefaultsTaxBehaviorX5e15d3cb()

  public companion object {
    public fun fromValue(`value`: String): InlineTaxProductResourceTaxSettingsDefaultsTaxBehaviorX5e15d3cb = when (value) {
      Exclusive.value -> Exclusive
      Inclusive.value -> Inclusive
      InferredByCurrency.value -> InferredByCurrency
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTaxProductResourceTaxSettingsDefaultsTaxBehaviorX5e15d3cb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTaxProductResourceTaxSettingsDefaultsTaxBehaviorX5e15d3cb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTaxProductResourceTaxSettingsDefaultsTaxBehaviorX5e15d3cb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTaxProductResourceTaxSettingsDefaultsTaxBehaviorX5e15d3cb) {
      encoder.encodeString(value.value)
    }
  }
}
