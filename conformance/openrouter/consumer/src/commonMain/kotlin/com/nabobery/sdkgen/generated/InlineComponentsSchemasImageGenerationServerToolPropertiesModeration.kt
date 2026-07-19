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
 * sdkgen://source/openapi.yaml#/components/schemas/ImageGenerationServerTool/properties/moderation.
 */
@Serializable(with = InlineComponentsSchemasImageGenerationServerToolPropertiesModeration.Serializer::class)
public sealed class InlineComponentsSchemasImageGenerationServerToolPropertiesModeration {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlineComponentsSchemasImageGenerationServerToolPropertiesModeration() {
    public override val `value`: String = "auto"
  }

  /**
   * Documented value. Wire value: `low`.
   */
  public data object Low : InlineComponentsSchemasImageGenerationServerToolPropertiesModeration() {
    public override val `value`: String = "low"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasImageGenerationServerToolPropertiesModeration()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasImageGenerationServerToolPropertiesModeration =
      when (value) {
      Auto.value -> Auto
      Low.value -> Low
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasImageGenerationServerToolPropertiesModeration> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasImageGenerationServerToolPropertiesModeration", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasImageGenerationServerToolPropertiesModeration =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasImageGenerationServerToolPropertiesModeration) {
      encoder.encodeString(value.value)
    }
  }
}
