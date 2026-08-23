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
 * ded/schema/properties/country_options/properties/cd/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/cd/properties/type
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsCdTypeXbcd397be.Serializer::class)
public sealed class InlineV1TaxRegistrationsPostRequestFormCountryOptionsCdTypeXbcd397be {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `standard`.
   */
  public data object Standard : InlineV1TaxRegistrationsPostRequestFormCountryOptionsCdTypeXbcd397be() {
    public override val `value`: String = "standard"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TaxRegistrationsPostRequestFormCountryOptionsCdTypeXbcd397be()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TaxRegistrationsPostRequestFormCountryOptionsCdTypeXbcd397be = when (value) {
      Standard.value -> Standard
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsCdTypeXbcd397be> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TaxRegistrationsPostRequestFormCountryOptionsCdTypeXbcd397be", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsCdTypeXbcd397be = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsCdTypeXbcd397be) {
      encoder.encodeString(value.value)
    }
  }
}
