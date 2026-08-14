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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tools/items/anyOf/1/properties/name.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tools/items/anyOf/1/properties/name
 */
@Serializable(with = InlineMessagesRequestToolsItemAnyOf2NameXf148cdb2.Serializer::class)
public sealed class InlineMessagesRequestToolsItemAnyOf2NameXf148cdb2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `bash`.
   */
  public data object Bash : InlineMessagesRequestToolsItemAnyOf2NameXf148cdb2() {
    public override val `value`: String = "bash"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesRequestToolsItemAnyOf2NameXf148cdb2()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesRequestToolsItemAnyOf2NameXf148cdb2 = when (value) {
      Bash.value -> Bash
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesRequestToolsItemAnyOf2NameXf148cdb2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineMessagesRequestToolsItemAnyOf2NameXf148cdb2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesRequestToolsItemAnyOf2NameXf148cdb2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesRequestToolsItemAnyOf2NameXf148cdb2) {
      encoder.encodeString(value.value)
    }
  }
}
