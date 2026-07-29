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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_deducted_at_source/properties/object
 */
@Serializable(with = InlineTaxDeductedAtSourceObjectValueX7029309a.Serializer::class)
public sealed class InlineTaxDeductedAtSourceObjectValueX7029309a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `tax_deducted_at_source`.
   */
  public data object TaxDeductedAtSource : InlineTaxDeductedAtSourceObjectValueX7029309a() {
    public override val `value`: String = "tax_deducted_at_source"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTaxDeductedAtSourceObjectValueX7029309a()

  public companion object {
    public fun fromValue(`value`: String): InlineTaxDeductedAtSourceObjectValueX7029309a = when (value) {
      TaxDeductedAtSource.value -> TaxDeductedAtSource
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineTaxDeductedAtSourceObjectValueX7029309a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTaxDeductedAtSourceObjectValueX7029309a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTaxDeductedAtSourceObjectValueX7029309a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTaxDeductedAtSourceObjectValueX7029309a) {
      encoder.encodeString(value.value)
    }
  }
}
