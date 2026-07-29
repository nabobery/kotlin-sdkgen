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
 * Type of registration in `country`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/tax_product_registrations_resource_country_options_thailand/properti
 * es/type
 */
@Serializable(with = InlineTaxProductRegistrationsResourceCountryOptionsThailandTypeX831d6740.Serializer::class)
public sealed class InlineTaxProductRegistrationsResourceCountryOptionsThailandTypeX831d6740 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `simplified`.
   */
  public data object Simplified : InlineTaxProductRegistrationsResourceCountryOptionsThailandTypeX831d6740() {
    public override val `value`: String = "simplified"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTaxProductRegistrationsResourceCountryOptionsThailandTypeX831d6740()

  public companion object {
    public fun fromValue(`value`: String): InlineTaxProductRegistrationsResourceCountryOptionsThailandTypeX831d6740 = when (value) {
      Simplified.value -> Simplified
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineTaxProductRegistrationsResourceCountryOptionsThailandTypeX831d6740> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTaxProductRegistrationsResourceCountryOptionsThailandTypeX831d6740", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTaxProductRegistrationsResourceCountryOptionsThailandTypeX831d6740 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTaxProductRegistrationsResourceCountryOptionsThailandTypeX831d6740) {
      encoder.encodeString(value.value)
    }
  }
}
