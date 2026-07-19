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
 * sdkgen://source/openapi.yaml#/components/schemas/ImageGenerationServerTool/properties/quality.
 */
@Serializable(with = InlineComponentsSchemasImageGenerationServerToolPropertiesQuality.Serializer::class)
public sealed class InlineComponentsSchemasImageGenerationServerToolPropertiesQuality {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `low`.
   */
  public data object Low : InlineComponentsSchemasImageGenerationServerToolPropertiesQuality() {
    public override val `value`: String = "low"
  }

  /**
   * Documented value. Wire value: `medium`.
   */
  public data object Medium : InlineComponentsSchemasImageGenerationServerToolPropertiesQuality() {
    public override val `value`: String = "medium"
  }

  /**
   * Documented value. Wire value: `high`.
   */
  public data object High : InlineComponentsSchemasImageGenerationServerToolPropertiesQuality() {
    public override val `value`: String = "high"
  }

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlineComponentsSchemasImageGenerationServerToolPropertiesQuality() {
    public override val `value`: String = "auto"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasImageGenerationServerToolPropertiesQuality()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasImageGenerationServerToolPropertiesQuality =
      when (value) {
      Low.value -> Low
      Medium.value -> Medium
      High.value -> High
      Auto.value -> Auto
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasImageGenerationServerToolPropertiesQuality> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasImageGenerationServerToolPropertiesQuality", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasImageGenerationServerToolPropertiesQuality =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasImageGenerationServerToolPropertiesQuality) {
      encoder.encodeString(value.value)
    }
  }
}
