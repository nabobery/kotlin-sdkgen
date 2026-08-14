package io.github.nabobery.sdkgen.generated

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
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/context_management/properties/edits/items
 * /oneOf/0/properties/type
 */
@Serializable(with = InlineMessagesRequestContextManagementEditsItemOneOf1TypeXad9edda4.Serializer::class)
public sealed class InlineMessagesRequestContextManagementEditsItemOneOf1TypeXad9edda4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `clear_tool_uses_20250919`.
   */
  public data object ClearToolUses20250919 : InlineMessagesRequestContextManagementEditsItemOneOf1TypeXad9edda4() {
    public override val `value`: String = "clear_tool_uses_20250919"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesRequestContextManagementEditsItemOneOf1TypeXad9edda4()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesRequestContextManagementEditsItemOneOf1TypeXad9edda4 = when (value) {
      ClearToolUses20250919.value -> ClearToolUses20250919
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesRequestContextManagementEditsItemOneOf1TypeXad9edda4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineMessagesRequestContextManagementEditsItemOneOf1TypeXad9edda4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesRequestContextManagementEditsItemOneOf1TypeXad9edda4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesRequestContextManagementEditsItemOneOf1TypeXad9edda4) {
      encoder.encodeString(value.value)
    }
  }
}
