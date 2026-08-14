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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tools/items/anyOf/4/properties/name.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tools/items/anyOf/4/properties/name
 */
@Serializable(with = InlineMessagesRequestToolsItemAnyOf5NameX24a8dde1.Serializer::class)
public sealed class InlineMessagesRequestToolsItemAnyOf5NameX24a8dde1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `web_search`.
   */
  public data object WebSearch : InlineMessagesRequestToolsItemAnyOf5NameX24a8dde1() {
    public override val `value`: String = "web_search"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesRequestToolsItemAnyOf5NameX24a8dde1()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesRequestToolsItemAnyOf5NameX24a8dde1 = when (value) {
      WebSearch.value -> WebSearch
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesRequestToolsItemAnyOf5NameX24a8dde1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineMessagesRequestToolsItemAnyOf5NameX24a8dde1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesRequestToolsItemAnyOf5NameX24a8dde1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesRequestToolsItemAnyOf5NameX24a8dde1) {
      encoder.encodeString(value.value)
    }
  }
}
