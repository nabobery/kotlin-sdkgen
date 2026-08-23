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
 * ded/schema/properties/country_options/properties/mx/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/mx/properties/type
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsMxTypeX243ba30d.Serializer::class)
public sealed class InlineV1TaxRegistrationsPostRequestFormCountryOptionsMxTypeX243ba30d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `simplified`.
   */
  public data object Simplified : InlineV1TaxRegistrationsPostRequestFormCountryOptionsMxTypeX243ba30d() {
    public override val `value`: String = "simplified"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TaxRegistrationsPostRequestFormCountryOptionsMxTypeX243ba30d()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TaxRegistrationsPostRequestFormCountryOptionsMxTypeX243ba30d = when (value) {
      Simplified.value -> Simplified
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsMxTypeX243ba30d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TaxRegistrationsPostRequestFormCountryOptionsMxTypeX243ba30d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsMxTypeX243ba30d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMxTypeX243ba30d) {
      encoder.encodeString(value.value)
    }
  }
}
