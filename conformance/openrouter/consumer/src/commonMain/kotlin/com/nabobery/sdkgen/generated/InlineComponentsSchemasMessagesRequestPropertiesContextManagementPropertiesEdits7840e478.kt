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
 * /oneOf/2/properties/type.
 */
@Serializable(with = InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits7840e478
  .Serializer::class)
public sealed class InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits7840e478 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `compact_20260112`.
   */
  public data object Compact20260112 : InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits7840e478() {
    public override val `value`: String = "compact_20260112"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits7840e478()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits7840e478 = when (value) {
      Compact20260112.value -> Compact20260112
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits7840e478> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits7840e478", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits7840e478 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits7840e478) {
      encoder.encodeString(value.value)
    }
  }
}
