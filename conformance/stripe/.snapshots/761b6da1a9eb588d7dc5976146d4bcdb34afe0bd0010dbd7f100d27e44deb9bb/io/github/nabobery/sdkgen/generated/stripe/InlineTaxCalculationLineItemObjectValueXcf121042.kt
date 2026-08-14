package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax.calculation_line_item/properties/object
 */
@Serializable(with = InlineTaxCalculationLineItemObjectValueXcf121042.Serializer::class)
public sealed class InlineTaxCalculationLineItemObjectValueXcf121042 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `tax.calculation_line_item`.
   */
  public data object TaxCalculationLineItem : InlineTaxCalculationLineItemObjectValueXcf121042() {
    public override val `value`: String = "tax.calculation_line_item"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTaxCalculationLineItemObjectValueXcf121042()

  public companion object {
    public fun fromValue(`value`: String): InlineTaxCalculationLineItemObjectValueXcf121042 = when (value) {
      TaxCalculationLineItem.value -> TaxCalculationLineItem
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTaxCalculationLineItemObjectValueXcf121042> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineTaxCalculationLineItemObjectValueXcf121042", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTaxCalculationLineItemObjectValueXcf121042 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTaxCalculationLineItemObjectValueXcf121042) {
      encoder.encodeString(value.value)
    }
  }
}
