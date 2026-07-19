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
 * sdkgen://source/openapi.yaml#/components/schemas/ImageGenerationServerTool/properties/background.
 */
@Serializable(with = InlineComponentsSchemasImageGenerationServerToolPropertiesBackground.Serializer::class)
public sealed class InlineComponentsSchemasImageGenerationServerToolPropertiesBackground {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `transparent`.
   */
  public data object Transparent : InlineComponentsSchemasImageGenerationServerToolPropertiesBackground() {
    public override val `value`: String = "transparent"
  }

  /**
   * Documented value. Wire value: `opaque`.
   */
  public data object Opaque : InlineComponentsSchemasImageGenerationServerToolPropertiesBackground() {
    public override val `value`: String = "opaque"
  }

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlineComponentsSchemasImageGenerationServerToolPropertiesBackground() {
    public override val `value`: String = "auto"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasImageGenerationServerToolPropertiesBackground()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasImageGenerationServerToolPropertiesBackground =
      when (value) {
      Transparent.value -> Transparent
      Opaque.value -> Opaque
      Auto.value -> Auto
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasImageGenerationServerToolPropertiesBackground> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasImageGenerationServerToolPropertiesBackground", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasImageGenerationServerToolPropertiesBackground =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasImageGenerationServerToolPropertiesBackground) {
      encoder.encodeString(value.value)
    }
  }
}
