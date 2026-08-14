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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tools/items/anyOf/2/properties/name.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tools/items/anyOf/2/properties/name
 */
@Serializable(with = InlineMessagesRequestToolsItemAnyOf3NameX5a5951a0.Serializer::class)
public sealed class InlineMessagesRequestToolsItemAnyOf3NameX5a5951a0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `str_replace_editor`.
   */
  public data object StrReplaceEditor : InlineMessagesRequestToolsItemAnyOf3NameX5a5951a0() {
    public override val `value`: String = "str_replace_editor"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesRequestToolsItemAnyOf3NameX5a5951a0()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesRequestToolsItemAnyOf3NameX5a5951a0 = when (value) {
      StrReplaceEditor.value -> StrReplaceEditor
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesRequestToolsItemAnyOf3NameX5a5951a0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineMessagesRequestToolsItemAnyOf3NameX5a5951a0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesRequestToolsItemAnyOf3NameX5a5951a0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesRequestToolsItemAnyOf3NameX5a5951a0) {
      encoder.encodeString(value.value)
    }
  }
}
