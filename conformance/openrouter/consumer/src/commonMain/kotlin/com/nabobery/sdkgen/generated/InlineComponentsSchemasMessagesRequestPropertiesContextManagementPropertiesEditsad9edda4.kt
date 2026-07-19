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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/context_management/properties/edits/items
 * /oneOf/0/properties/type.
 */
@Serializable(with = InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsad9edda4
  .Serializer::class)
public sealed class InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsad9edda4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `clear_tool_uses_20250919`.
   */
  public data object ClearToolUses20250919 : InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsad9edda4() {
    public override val `value`: String = "clear_tool_uses_20250919"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsad9edda4()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsad9edda4 = when (value) {
      ClearToolUses20250919.value -> ClearToolUses20250919
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsad9edda4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsad9edda4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsad9edda4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsad9edda4) {
      encoder.encodeString(value.value)
    }
  }
}
