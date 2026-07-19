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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tools/items/anyOf/0/properties/type.
 */
@Serializable(with = InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0PropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0PropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `custom`.
   */
  public data object Custom : InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0PropertiesType() {
    public override val `value`: String = "custom"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0PropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0PropertiesType = when (value) {
      Custom.value -> Custom
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0PropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0PropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0PropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf0PropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
