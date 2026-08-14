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
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/verifone_p630/anyOf/0/properties/splashscreen/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/verifone_p630/anyOf/0/properties/splashscreen/anyOf/1
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1AnyOf2Xfd133b67.Serializer::class)
public sealed class InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1AnyOf2Xfd133b67 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1AnyOf2Xfd133b67() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1AnyOf2Xfd133b67()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1AnyOf2Xfd133b67 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1AnyOf2Xfd133b67> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1AnyOf2Xfd133b67", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1AnyOf2Xfd133b67 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1AnyOf2Xfd133b67) {
      encoder.encodeString(value.value)
    }
  }
}
