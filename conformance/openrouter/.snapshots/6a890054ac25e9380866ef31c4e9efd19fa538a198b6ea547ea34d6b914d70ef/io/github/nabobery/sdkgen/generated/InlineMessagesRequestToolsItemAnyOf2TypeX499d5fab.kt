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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tools/items/anyOf/1/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tools/items/anyOf/1/properties/type
 */
@Serializable(with = InlineMessagesRequestToolsItemAnyOf2TypeX499d5fab.Serializer::class)
public sealed class InlineMessagesRequestToolsItemAnyOf2TypeX499d5fab {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `bash_20250124`.
   */
  public data object Bash20250124 : InlineMessagesRequestToolsItemAnyOf2TypeX499d5fab() {
    public override val `value`: String = "bash_20250124"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesRequestToolsItemAnyOf2TypeX499d5fab()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesRequestToolsItemAnyOf2TypeX499d5fab = when (value) {
      Bash20250124.value -> Bash20250124
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesRequestToolsItemAnyOf2TypeX499d5fab> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineMessagesRequestToolsItemAnyOf2TypeX499d5fab", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesRequestToolsItemAnyOf2TypeX499d5fab = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesRequestToolsItemAnyOf2TypeX499d5fab) {
      encoder.encodeString(value.value)
    }
  }
}
