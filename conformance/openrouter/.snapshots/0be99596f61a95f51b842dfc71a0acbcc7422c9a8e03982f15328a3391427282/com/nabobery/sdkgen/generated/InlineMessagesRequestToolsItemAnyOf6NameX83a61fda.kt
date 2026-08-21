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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tools/items/anyOf/5/properties/name.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tools/items/anyOf/5/properties/name
 */
@Serializable(with = InlineMessagesRequestToolsItemAnyOf6NameX83a61fda.Serializer::class)
public sealed class InlineMessagesRequestToolsItemAnyOf6NameX83a61fda {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `advisor`.
   */
  public data object Advisor : InlineMessagesRequestToolsItemAnyOf6NameX83a61fda() {
    public override val `value`: String = "advisor"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesRequestToolsItemAnyOf6NameX83a61fda()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesRequestToolsItemAnyOf6NameX83a61fda = when (value) {
      Advisor.value -> Advisor
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesRequestToolsItemAnyOf6NameX83a61fda> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineMessagesRequestToolsItemAnyOf6NameX83a61fda", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesRequestToolsItemAnyOf6NameX83a61fda = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesRequestToolsItemAnyOf6NameX83a61fda) {
      encoder.encodeString(value.value)
    }
  }
}
