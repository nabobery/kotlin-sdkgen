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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicCitationCharLocation/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicCitationCharLocation/properties/type
 */
@Serializable(with = InlineAnthropicCitationCharLocationTypeX3be71257.Serializer::class)
public sealed class InlineAnthropicCitationCharLocationTypeX3be71257 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `char_location`.
   */
  public data object CharLocation : InlineAnthropicCitationCharLocationTypeX3be71257() {
    public override val `value`: String = "char_location"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicCitationCharLocationTypeX3be71257()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicCitationCharLocationTypeX3be71257 = when (value) {
      CharLocation.value -> CharLocation
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicCitationCharLocationTypeX3be71257> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAnthropicCitationCharLocationTypeX3be71257", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicCitationCharLocationTypeX3be71257 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicCitationCharLocationTypeX3be71257) {
      encoder.encodeString(value.value)
    }
  }
}
