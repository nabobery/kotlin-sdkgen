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
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tools/items/anyOf/2/properties/type
 */
@Serializable(with = InlineMessagesRequestToolsItemAnyOf3TypeX6560aa82.Serializer::class)
public sealed class InlineMessagesRequestToolsItemAnyOf3TypeX6560aa82 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `text_editor_20250124`.
   */
  public data object TextEditor20250124 : InlineMessagesRequestToolsItemAnyOf3TypeX6560aa82() {
    public override val `value`: String = "text_editor_20250124"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesRequestToolsItemAnyOf3TypeX6560aa82()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesRequestToolsItemAnyOf3TypeX6560aa82 = when (value) {
      TextEditor20250124.value -> TextEditor20250124
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesRequestToolsItemAnyOf3TypeX6560aa82> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineMessagesRequestToolsItemAnyOf3TypeX6560aa82", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesRequestToolsItemAnyOf3TypeX6560aa82 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesRequestToolsItemAnyOf3TypeX6560aa82) {
      encoder.encodeString(value.value)
    }
  }
}
