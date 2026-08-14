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
 * Type of registration in `country`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/tax_product_registrations_resource_country_options_simplified/proper
 * ties/type
 */
@Serializable(with = InlineTaxProductRegistrationsResourceCountryOptionsSimplifiedTypeX91637e9c.Serializer::class)
public sealed class InlineTaxProductRegistrationsResourceCountryOptionsSimplifiedTypeX91637e9c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `simplified`.
   */
  public data object Simplified : InlineTaxProductRegistrationsResourceCountryOptionsSimplifiedTypeX91637e9c() {
    public override val `value`: String = "simplified"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTaxProductRegistrationsResourceCountryOptionsSimplifiedTypeX91637e9c()

  public companion object {
    public fun fromValue(`value`: String): InlineTaxProductRegistrationsResourceCountryOptionsSimplifiedTypeX91637e9c = when (value) {
      Simplified.value -> Simplified
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTaxProductRegistrationsResourceCountryOptionsSimplifiedTypeX91637e9c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineTaxProductRegistrationsResourceCountryOptionsSimplifiedTypeX91637e9c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTaxProductRegistrationsResourceCountryOptionsSimplifiedTypeX91637e9c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTaxProductRegistrationsResourceCountryOptionsSimplifiedTypeX91637e9c) {
      encoder.encodeString(value.value)
    }
  }
}
