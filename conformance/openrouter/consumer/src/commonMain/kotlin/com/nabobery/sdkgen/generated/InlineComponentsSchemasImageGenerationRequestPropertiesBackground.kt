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
 * Background treatment. `transparent` requires an output_format that supports alpha (png or webp).
 */
@Serializable(with = InlineComponentsSchemasImageGenerationRequestPropertiesBackground.Serializer::class)
public sealed class InlineComponentsSchemasImageGenerationRequestPropertiesBackground {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlineComponentsSchemasImageGenerationRequestPropertiesBackground() {
    public override val `value`: String = "auto"
  }

  /**
   * Documented value. Wire value: `transparent`.
   */
  public data object Transparent : InlineComponentsSchemasImageGenerationRequestPropertiesBackground() {
    public override val `value`: String = "transparent"
  }

  /**
   * Documented value. Wire value: `opaque`.
   */
  public data object Opaque : InlineComponentsSchemasImageGenerationRequestPropertiesBackground() {
    public override val `value`: String = "opaque"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasImageGenerationRequestPropertiesBackground()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasImageGenerationRequestPropertiesBackground =
      when (value) {
      Auto.value -> Auto
      Transparent.value -> Transparent
      Opaque.value -> Opaque
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasImageGenerationRequestPropertiesBackground> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasImageGenerationRequestPropertiesBackground", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasImageGenerationRequestPropertiesBackground =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasImageGenerationRequestPropertiesBackground) {
      encoder.encodeString(value.value)
    }
  }
}
