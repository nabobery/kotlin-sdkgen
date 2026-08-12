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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/ImageGenerationServerTool/properties/input_fidelity.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ImageGenerationServerTool/properties/input_fidelity
 */
@Serializable(with = InlineImageGenerationServerToolInputFidelityXe40d4274.Serializer::class)
public sealed class InlineImageGenerationServerToolInputFidelityXe40d4274 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `high`.
   */
  public data object High : InlineImageGenerationServerToolInputFidelityXe40d4274() {
    public override val `value`: String = "high"
  }

  /**
   * Documented value. Wire value: `low`.
   */
  public data object Low : InlineImageGenerationServerToolInputFidelityXe40d4274() {
    public override val `value`: String = "low"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineImageGenerationServerToolInputFidelityXe40d4274()

  public companion object {
    public fun fromValue(`value`: String): InlineImageGenerationServerToolInputFidelityXe40d4274 = when (value) {
      High.value -> High
      Low.value -> Low
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineImageGenerationServerToolInputFidelityXe40d4274> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineImageGenerationServerToolInputFidelityXe40d4274", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineImageGenerationServerToolInputFidelityXe40d4274 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineImageGenerationServerToolInputFidelityXe40d4274) {
      encoder.encodeString(value.value)
    }
  }
}
