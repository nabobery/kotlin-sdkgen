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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputImageGenerationServerToolItem/properties/type.
 */
@Serializable(with = InlineComponentsSchemasOutputImageGenerationServerToolItemPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasOutputImageGenerationServerToolItemPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:image_generation`.
   */
  public data object OpenrouterImageGeneration : InlineComponentsSchemasOutputImageGenerationServerToolItemPropertiesType() {
    public override val `value`: String = "openrouter:image_generation"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOutputImageGenerationServerToolItemPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOutputImageGenerationServerToolItemPropertiesType =
      when (value) {
      OpenrouterImageGeneration.value -> OpenrouterImageGeneration
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputImageGenerationServerToolItemPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOutputImageGenerationServerToolItemPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputImageGenerationServerToolItemPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOutputImageGenerationServerToolItemPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
