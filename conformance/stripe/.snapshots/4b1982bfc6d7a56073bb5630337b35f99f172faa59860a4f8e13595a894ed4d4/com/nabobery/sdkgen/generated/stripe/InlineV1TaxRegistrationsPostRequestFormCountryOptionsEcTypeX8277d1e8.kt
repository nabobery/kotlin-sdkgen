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
 * ded/schema/properties/country_options/properties/ec/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/ec/properties/type
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsEcTypeX8277d1e8.Serializer::class)
public sealed class InlineV1TaxRegistrationsPostRequestFormCountryOptionsEcTypeX8277d1e8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `simplified`.
   */
  public data object Simplified : InlineV1TaxRegistrationsPostRequestFormCountryOptionsEcTypeX8277d1e8() {
    public override val `value`: String = "simplified"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TaxRegistrationsPostRequestFormCountryOptionsEcTypeX8277d1e8()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TaxRegistrationsPostRequestFormCountryOptionsEcTypeX8277d1e8 = when (value) {
      Simplified.value -> Simplified
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsEcTypeX8277d1e8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TaxRegistrationsPostRequestFormCountryOptionsEcTypeX8277d1e8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsEcTypeX8277d1e8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsEcTypeX8277d1e8) {
      encoder.encodeString(value.value)
    }
  }
}
