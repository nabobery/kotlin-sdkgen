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
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/verifone_p400/properties/splashscreen/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/verifone_p400/properties/splashscreen/anyOf/1
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf2X22c36be9.Serializer::class)
public sealed class InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf2X22c36be9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf2X22c36be9() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf2X22c36be9()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf2X22c36be9 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf2X22c36be9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf2X22c36be9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf2X22c36be9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf2X22c36be9) {
      encoder.encodeString(value.value)
    }
  }
}
