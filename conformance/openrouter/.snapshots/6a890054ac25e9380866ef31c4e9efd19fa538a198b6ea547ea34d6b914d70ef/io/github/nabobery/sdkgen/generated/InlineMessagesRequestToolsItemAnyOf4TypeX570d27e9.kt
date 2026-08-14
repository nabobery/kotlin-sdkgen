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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tools/items/anyOf/3/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tools/items/anyOf/3/properties/type
 */
@Serializable(with = InlineMessagesRequestToolsItemAnyOf4TypeX570d27e9.Serializer::class)
public sealed class InlineMessagesRequestToolsItemAnyOf4TypeX570d27e9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `web_search_20250305`.
   */
  public data object WebSearch20250305 : InlineMessagesRequestToolsItemAnyOf4TypeX570d27e9() {
    public override val `value`: String = "web_search_20250305"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesRequestToolsItemAnyOf4TypeX570d27e9()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesRequestToolsItemAnyOf4TypeX570d27e9 = when (value) {
      WebSearch20250305.value -> WebSearch20250305
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesRequestToolsItemAnyOf4TypeX570d27e9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineMessagesRequestToolsItemAnyOf4TypeX570d27e9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesRequestToolsItemAnyOf4TypeX570d27e9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesRequestToolsItemAnyOf4TypeX570d27e9) {
      encoder.encodeString(value.value)
    }
  }
}
