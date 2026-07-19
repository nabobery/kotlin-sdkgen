package com.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/AnthropicSpeed.
 */
@Serializable(with = AnthropicSpeed.Serializer::class)
public sealed class AnthropicSpeed {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `fast`.
   */
  public data object Fast : AnthropicSpeed() {
    public override val `value`: String = "fast"
  }

  /**
   * Documented value. Wire value: `standard`.
   */
  public data object Standard : AnthropicSpeed() {
    public override val `value`: String = "standard"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : AnthropicSpeed()

  public companion object {
    public fun fromValue(`value`: String): AnthropicSpeed = when (value) {
      Fast.value -> Fast
      Standard.value -> Standard
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<AnthropicSpeed> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.AnthropicSpeed", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): AnthropicSpeed = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: AnthropicSpeed) {
      encoder.encodeString(value.value)
    }
  }
}
