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
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_rate/properties/object
 */
@Serializable(with = InlineTaxRateObjectValueXa9523a0e.Serializer::class)
public sealed class InlineTaxRateObjectValueXa9523a0e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `tax_rate`.
   */
  public data object TaxRate : InlineTaxRateObjectValueXa9523a0e() {
    public override val `value`: String = "tax_rate"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTaxRateObjectValueXa9523a0e()

  public companion object {
    public fun fromValue(`value`: String): InlineTaxRateObjectValueXa9523a0e = when (value) {
      TaxRate.value -> TaxRate
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTaxRateObjectValueXa9523a0e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineTaxRateObjectValueXa9523a0e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTaxRateObjectValueXa9523a0e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTaxRateObjectValueXa9523a0e) {
      encoder.encodeString(value.value)
    }
  }
}
