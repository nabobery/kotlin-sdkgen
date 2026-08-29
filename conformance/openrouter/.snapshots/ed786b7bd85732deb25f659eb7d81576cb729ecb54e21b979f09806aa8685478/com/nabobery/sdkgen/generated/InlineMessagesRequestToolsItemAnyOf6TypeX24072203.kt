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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tools/items/anyOf/5/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tools/items/anyOf/5/properties/type
 */
@Serializable(with = InlineMessagesRequestToolsItemAnyOf6TypeX24072203.Serializer::class)
public sealed class InlineMessagesRequestToolsItemAnyOf6TypeX24072203 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `advisor_20260301`.
   */
  public data object Advisor20260301 : InlineMessagesRequestToolsItemAnyOf6TypeX24072203() {
    public override val `value`: String = "advisor_20260301"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesRequestToolsItemAnyOf6TypeX24072203()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesRequestToolsItemAnyOf6TypeX24072203 = when (value) {
      Advisor20260301.value -> Advisor20260301
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesRequestToolsItemAnyOf6TypeX24072203> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineMessagesRequestToolsItemAnyOf6TypeX24072203", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesRequestToolsItemAnyOf6TypeX24072203 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesRequestToolsItemAnyOf6TypeX24072203) {
      encoder.encodeString(value.value)
    }
  }
}
