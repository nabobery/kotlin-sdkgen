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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations~1{id}/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/expires_at/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations~1{id}/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/expires_at/anyOf/0
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormExpiresAtAnyOf1X5f8edac7.Serializer::class)
public sealed class InlineV1TaxRegistrationsPostRequestFormExpiresAtAnyOf1X5f8edac7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `now`.
   */
  public data object Now : InlineV1TaxRegistrationsPostRequestFormExpiresAtAnyOf1X5f8edac7() {
    public override val `value`: String = "now"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TaxRegistrationsPostRequestFormExpiresAtAnyOf1X5f8edac7()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TaxRegistrationsPostRequestFormExpiresAtAnyOf1X5f8edac7 = when (value) {
      Now.value -> Now
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormExpiresAtAnyOf1X5f8edac7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1TaxRegistrationsPostRequestFormExpiresAtAnyOf1X5f8edac7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormExpiresAtAnyOf1X5f8edac7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormExpiresAtAnyOf1X5f8edac7) {
      encoder.encodeString(value.value)
    }
  }
}
