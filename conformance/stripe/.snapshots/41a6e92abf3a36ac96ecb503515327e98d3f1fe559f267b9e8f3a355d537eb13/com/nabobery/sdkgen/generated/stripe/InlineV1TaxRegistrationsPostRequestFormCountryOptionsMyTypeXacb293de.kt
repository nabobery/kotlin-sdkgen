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
 * ded/schema/properties/country_options/properties/my/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/my/properties/type
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsMyTypeXacb293de.Serializer::class)
public sealed class InlineV1TaxRegistrationsPostRequestFormCountryOptionsMyTypeXacb293de {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `simplified`.
   */
  public data object Simplified : InlineV1TaxRegistrationsPostRequestFormCountryOptionsMyTypeXacb293de() {
    public override val `value`: String = "simplified"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TaxRegistrationsPostRequestFormCountryOptionsMyTypeXacb293de()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TaxRegistrationsPostRequestFormCountryOptionsMyTypeXacb293de = when (value) {
      Simplified.value -> Simplified
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsMyTypeXacb293de> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TaxRegistrationsPostRequestFormCountryOptionsMyTypeXacb293de", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsMyTypeXacb293de = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMyTypeXacb293de) {
      encoder.encodeString(value.value)
    }
  }
}
