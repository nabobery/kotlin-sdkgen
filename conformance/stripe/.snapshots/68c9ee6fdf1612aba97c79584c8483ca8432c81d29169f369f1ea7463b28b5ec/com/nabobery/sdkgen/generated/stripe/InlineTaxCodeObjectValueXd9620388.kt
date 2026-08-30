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
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_code/properties/object
 */
@Serializable(with = InlineTaxCodeObjectValueXd9620388.Serializer::class)
public sealed class InlineTaxCodeObjectValueXd9620388 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `tax_code`.
   */
  public data object TaxCode : InlineTaxCodeObjectValueXd9620388() {
    public override val `value`: String = "tax_code"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTaxCodeObjectValueXd9620388()

  public companion object {
    public fun fromValue(`value`: String): InlineTaxCodeObjectValueXd9620388 = when (value) {
      TaxCode.value -> TaxCode
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTaxCodeObjectValueXd9620388> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTaxCodeObjectValueXd9620388", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTaxCodeObjectValueXd9620388 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTaxCodeObjectValueXd9620388) {
      encoder.encodeString(value.value)
    }
  }
}
