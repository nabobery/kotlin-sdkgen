package io.github.nabobery.sdkgen.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicCitationCharLocationParam/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicCitationCharLocationParam/properties/type
 */
@Serializable(with = InlineAnthropicCitationCharLocationParamTypeXaf2ecc9f.Serializer::class)
public sealed class InlineAnthropicCitationCharLocationParamTypeXaf2ecc9f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `char_location`.
   */
  public data object CharLocation : InlineAnthropicCitationCharLocationParamTypeXaf2ecc9f() {
    public override val `value`: String = "char_location"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicCitationCharLocationParamTypeXaf2ecc9f()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicCitationCharLocationParamTypeXaf2ecc9f = when (value) {
      CharLocation.value -> CharLocation
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicCitationCharLocationParamTypeXaf2ecc9f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAnthropicCitationCharLocationParamTypeXaf2ecc9f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicCitationCharLocationParamTypeXaf2ecc9f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicCitationCharLocationParamTypeXaf2ecc9f) {
      encoder.encodeString(value.value)
    }
  }
}
