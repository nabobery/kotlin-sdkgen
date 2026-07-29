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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/ca/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/ca/properties/type
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsCaTypeX1a3c6308.Serializer::class)
public sealed class InlineV1TaxRegistrationsPostRequestFormCountryOptionsCaTypeX1a3c6308 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `province_standard`.
   */
  public data object ProvinceStandard : InlineV1TaxRegistrationsPostRequestFormCountryOptionsCaTypeX1a3c6308() {
    public override val `value`: String = "province_standard"
  }

  /**
   * Documented value. Wire value: `simplified`.
   */
  public data object Simplified : InlineV1TaxRegistrationsPostRequestFormCountryOptionsCaTypeX1a3c6308() {
    public override val `value`: String = "simplified"
  }

  /**
   * Documented value. Wire value: `standard`.
   */
  public data object Standard : InlineV1TaxRegistrationsPostRequestFormCountryOptionsCaTypeX1a3c6308() {
    public override val `value`: String = "standard"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TaxRegistrationsPostRequestFormCountryOptionsCaTypeX1a3c6308()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TaxRegistrationsPostRequestFormCountryOptionsCaTypeX1a3c6308 = when (value) {
      ProvinceStandard.value -> ProvinceStandard
      Simplified.value -> Simplified
      Standard.value -> Standard
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsCaTypeX1a3c6308> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TaxRegistrationsPostRequestFormCountryOptionsCaTypeX1a3c6308", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsCaTypeX1a3c6308 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsCaTypeX1a3c6308) {
      encoder.encodeString(value.value)
    }
  }
}
