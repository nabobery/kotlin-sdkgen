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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/AnthropicServiceTier.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicServiceTier
 */
@Serializable(with = AnthropicServiceTier.Serializer::class)
public sealed class AnthropicServiceTier {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `standard`.
   */
  public data object Standard : AnthropicServiceTier() {
    public override val `value`: String = "standard"
  }

  /**
   * Documented value. Wire value: `priority`.
   */
  public data object Priority : AnthropicServiceTier() {
    public override val `value`: String = "priority"
  }

  /**
   * Documented value. Wire value: `batch`.
   */
  public data object Batch : AnthropicServiceTier() {
    public override val `value`: String = "batch"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : AnthropicServiceTier()

  public companion object {
    public fun fromValue(`value`: String): AnthropicServiceTier = when (value) {
      Standard.value -> Standard
      Priority.value -> Priority
      Batch.value -> Batch
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<AnthropicServiceTier> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.AnthropicServiceTier", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): AnthropicServiceTier = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: AnthropicServiceTier) {
      encoder.encodeString(value.value)
    }
  }
}
