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
 * /oneOf/1/properties/keep/anyOf/2.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/context_management/properties/edits/items
 * /oneOf/1/properties/keep/anyOf/2
 */
@Serializable(with = InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf3X0890d2a7.Serializer::class)
public sealed class InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf3X0890d2a7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf3X0890d2a7() {
    public override val `value`: String = "all"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf3X0890d2a7()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf3X0890d2a7 = when (value) {
      All.value -> All
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf3X0890d2a7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf3X0890d2a7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf3X0890d2a7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf3X0890d2a7) {
      encoder.encodeString(value.value)
    }
  }
}
