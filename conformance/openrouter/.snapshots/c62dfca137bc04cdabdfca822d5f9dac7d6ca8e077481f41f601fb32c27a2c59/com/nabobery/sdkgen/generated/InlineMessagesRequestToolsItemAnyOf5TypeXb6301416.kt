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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tools/items/anyOf/4/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tools/items/anyOf/4/properties/type
 */
@Serializable(with = InlineMessagesRequestToolsItemAnyOf5TypeXb6301416.Serializer::class)
public sealed class InlineMessagesRequestToolsItemAnyOf5TypeXb6301416 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `web_search_20260209`.
   */
  public data object WebSearch20260209 : InlineMessagesRequestToolsItemAnyOf5TypeXb6301416() {
    public override val `value`: String = "web_search_20260209"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesRequestToolsItemAnyOf5TypeXb6301416()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesRequestToolsItemAnyOf5TypeXb6301416 = when (value) {
      WebSearch20260209.value -> WebSearch20260209
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesRequestToolsItemAnyOf5TypeXb6301416> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineMessagesRequestToolsItemAnyOf5TypeXb6301416", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesRequestToolsItemAnyOf5TypeXb6301416 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesRequestToolsItemAnyOf5TypeXb6301416) {
      encoder.encodeString(value.value)
    }
  }
}
