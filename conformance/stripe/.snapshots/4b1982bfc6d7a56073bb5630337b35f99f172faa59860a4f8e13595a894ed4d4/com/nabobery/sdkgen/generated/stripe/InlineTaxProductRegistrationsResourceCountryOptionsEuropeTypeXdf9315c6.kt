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
 * Type of registration in an EU country.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/tax_product_registrations_resource_country_options_europe/properties
 * /type
 */
@Serializable(with = InlineTaxProductRegistrationsResourceCountryOptionsEuropeTypeXdf9315c6.Serializer::class)
public sealed class InlineTaxProductRegistrationsResourceCountryOptionsEuropeTypeXdf9315c6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `ioss`.
   */
  public data object Ioss : InlineTaxProductRegistrationsResourceCountryOptionsEuropeTypeXdf9315c6() {
    public override val `value`: String = "ioss"
  }

  /**
   * Documented value. Wire value: `oss_non_union`.
   */
  public data object OssNonUnion : InlineTaxProductRegistrationsResourceCountryOptionsEuropeTypeXdf9315c6() {
    public override val `value`: String = "oss_non_union"
  }

  /**
   * Documented value. Wire value: `oss_union`.
   */
  public data object OssUnion : InlineTaxProductRegistrationsResourceCountryOptionsEuropeTypeXdf9315c6() {
    public override val `value`: String = "oss_union"
  }

  /**
   * Documented value. Wire value: `standard`.
   */
  public data object Standard : InlineTaxProductRegistrationsResourceCountryOptionsEuropeTypeXdf9315c6() {
    public override val `value`: String = "standard"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTaxProductRegistrationsResourceCountryOptionsEuropeTypeXdf9315c6()

  public companion object {
    public fun fromValue(`value`: String): InlineTaxProductRegistrationsResourceCountryOptionsEuropeTypeXdf9315c6 = when (value) {
      Ioss.value -> Ioss
      OssNonUnion.value -> OssNonUnion
      OssUnion.value -> OssUnion
      Standard.value -> Standard
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTaxProductRegistrationsResourceCountryOptionsEuropeTypeXdf9315c6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTaxProductRegistrationsResourceCountryOptionsEuropeTypeXdf9315c6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTaxProductRegistrationsResourceCountryOptionsEuropeTypeXdf9315c6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTaxProductRegistrationsResourceCountryOptionsEuropeTypeXdf9315c6) {
      encoder.encodeString(value.value)
    }
  }
}
