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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tools/items/anyOf/2/properties/type.
 */
@Serializable(with = InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf2PropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf2PropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `text_editor_20250124`.
   */
  public data object TextEditor20250124 : InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf2PropertiesType() {
    public override val `value`: String = "text_editor_20250124"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf2PropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf2PropertiesType = when (value) {
      TextEditor20250124.value -> TextEditor20250124
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf2PropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf2PropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf2PropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf2PropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
