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
 * /oneOf/1/properties/type.
 */
@Serializable(with = InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits6dec7c82
  .Serializer::class)
public sealed class InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits6dec7c82 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `clear_thinking_20251015`.
   */
  public data object ClearThinking20251015 : InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits6dec7c82() {
    public override val `value`: String = "clear_thinking_20251015"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits6dec7c82()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits6dec7c82 = when (value) {
      ClearThinking20251015.value -> ClearThinking20251015
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits6dec7c82> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits6dec7c82", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits6dec7c82 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits6dec7c82) {
      encoder.encodeString(value.value)
    }
  }
}
