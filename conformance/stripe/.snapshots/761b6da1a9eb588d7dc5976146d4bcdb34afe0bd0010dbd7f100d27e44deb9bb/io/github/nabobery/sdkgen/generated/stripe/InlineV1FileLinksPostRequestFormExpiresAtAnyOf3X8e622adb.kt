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
 * ded/schema/properties/expires_at/anyOf/2.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1file_links~1{link}/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/expires_at/anyOf/2
 */
@Serializable(with = InlineV1FileLinksPostRequestFormExpiresAtAnyOf3X8e622adb.Serializer::class)
public sealed class InlineV1FileLinksPostRequestFormExpiresAtAnyOf3X8e622adb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1FileLinksPostRequestFormExpiresAtAnyOf3X8e622adb() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1FileLinksPostRequestFormExpiresAtAnyOf3X8e622adb()

  public companion object {
    public fun fromValue(`value`: String): InlineV1FileLinksPostRequestFormExpiresAtAnyOf3X8e622adb = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1FileLinksPostRequestFormExpiresAtAnyOf3X8e622adb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1FileLinksPostRequestFormExpiresAtAnyOf3X8e622adb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1FileLinksPostRequestFormExpiresAtAnyOf3X8e622adb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1FileLinksPostRequestFormExpiresAtAnyOf3X8e622adb) {
      encoder.encodeString(value.value)
    }
  }
}
