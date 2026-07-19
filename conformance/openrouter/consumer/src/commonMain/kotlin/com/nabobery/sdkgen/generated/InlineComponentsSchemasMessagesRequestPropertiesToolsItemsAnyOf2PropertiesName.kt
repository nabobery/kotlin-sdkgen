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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tools/items/anyOf/2/properties/name.
 */
@Serializable(with = InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf2PropertiesName.Serializer::class)
public sealed class InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf2PropertiesName {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `str_replace_editor`.
   */
  public data object StrReplaceEditor : InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf2PropertiesName() {
    public override val `value`: String = "str_replace_editor"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf2PropertiesName()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf2PropertiesName = when (value) {
      StrReplaceEditor.value -> StrReplaceEditor
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf2PropertiesName> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf2PropertiesName", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf2PropertiesName = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf2PropertiesName) {
      encoder.encodeString(value.value)
    }
  }
}
