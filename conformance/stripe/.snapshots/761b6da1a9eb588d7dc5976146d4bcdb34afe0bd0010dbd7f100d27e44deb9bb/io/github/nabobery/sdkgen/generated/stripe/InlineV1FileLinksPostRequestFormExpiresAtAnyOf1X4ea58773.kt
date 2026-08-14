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
 * sdkgen://source/openapi.json#/paths/~1v1~1file_links~1{link}/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/expires_at/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1file_links~1{link}/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/expires_at/anyOf/0
 */
@Serializable(with = InlineV1FileLinksPostRequestFormExpiresAtAnyOf1X4ea58773.Serializer::class)
public sealed class InlineV1FileLinksPostRequestFormExpiresAtAnyOf1X4ea58773 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `now`.
   */
  public data object Now : InlineV1FileLinksPostRequestFormExpiresAtAnyOf1X4ea58773() {
    public override val `value`: String = "now"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1FileLinksPostRequestFormExpiresAtAnyOf1X4ea58773()

  public companion object {
    public fun fromValue(`value`: String): InlineV1FileLinksPostRequestFormExpiresAtAnyOf1X4ea58773 = when (value) {
      Now.value -> Now
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1FileLinksPostRequestFormExpiresAtAnyOf1X4ea58773> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1FileLinksPostRequestFormExpiresAtAnyOf1X4ea58773", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1FileLinksPostRequestFormExpiresAtAnyOf1X4ea58773 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1FileLinksPostRequestFormExpiresAtAnyOf1X4ea58773) {
      encoder.encodeString(value.value)
    }
  }
}
