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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ChatRequest/properties/modalities/items.
 */
@Serializable(with = InlineComponentsSchemasChatRequestPropertiesModalitiesItems.Serializer::class)
public sealed class InlineComponentsSchemasChatRequestPropertiesModalitiesItems {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `text`.
   */
  public data object Text : InlineComponentsSchemasChatRequestPropertiesModalitiesItems() {
    public override val `value`: String = "text"
  }

  /**
   * Documented value. Wire value: `image`.
   */
  public data object Image : InlineComponentsSchemasChatRequestPropertiesModalitiesItems() {
    public override val `value`: String = "image"
  }

  /**
   * Documented value. Wire value: `audio`.
   */
  public data object Audio : InlineComponentsSchemasChatRequestPropertiesModalitiesItems() {
    public override val `value`: String = "audio"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasChatRequestPropertiesModalitiesItems()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasChatRequestPropertiesModalitiesItems = when (value) {
      Text.value -> Text
      Image.value -> Image
      Audio.value -> Audio
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasChatRequestPropertiesModalitiesItems> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasChatRequestPropertiesModalitiesItems", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasChatRequestPropertiesModalitiesItems =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasChatRequestPropertiesModalitiesItems) {
      encoder.encodeString(value.value)
    }
  }
}
