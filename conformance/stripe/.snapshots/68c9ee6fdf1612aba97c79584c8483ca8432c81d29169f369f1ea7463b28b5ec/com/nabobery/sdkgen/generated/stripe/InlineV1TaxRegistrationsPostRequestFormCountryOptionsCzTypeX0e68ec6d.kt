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
 * ded/schema/properties/country_options/properties/cz/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/cz/properties/type
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzTypeX0e68ec6d.Serializer::class)
public sealed class InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzTypeX0e68ec6d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `ioss`.
   */
  public data object Ioss : InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzTypeX0e68ec6d() {
    public override val `value`: String = "ioss"
  }

  /**
   * Documented value. Wire value: `oss_non_union`.
   */
  public data object OssNonUnion : InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzTypeX0e68ec6d() {
    public override val `value`: String = "oss_non_union"
  }

  /**
   * Documented value. Wire value: `oss_union`.
   */
  public data object OssUnion : InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzTypeX0e68ec6d() {
    public override val `value`: String = "oss_union"
  }

  /**
   * Documented value. Wire value: `standard`.
   */
  public data object Standard : InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzTypeX0e68ec6d() {
    public override val `value`: String = "standard"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzTypeX0e68ec6d()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzTypeX0e68ec6d = when (value) {
      Ioss.value -> Ioss
      OssNonUnion.value -> OssNonUnion
      OssUnion.value -> OssUnion
      Standard.value -> Standard
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzTypeX0e68ec6d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzTypeX0e68ec6d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzTypeX0e68ec6d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzTypeX0e68ec6d) {
      encoder.encodeString(value.value)
    }
  }
}
