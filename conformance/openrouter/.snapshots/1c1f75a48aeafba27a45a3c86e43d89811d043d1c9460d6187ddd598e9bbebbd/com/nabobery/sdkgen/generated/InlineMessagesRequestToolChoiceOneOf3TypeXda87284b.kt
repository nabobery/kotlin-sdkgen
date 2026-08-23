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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tool_choice/oneOf/2/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tool_choice/oneOf/2/properties/type
 */
@Serializable(with = InlineMessagesRequestToolChoiceOneOf3TypeXda87284b.Serializer::class)
public sealed class InlineMessagesRequestToolChoiceOneOf3TypeXda87284b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineMessagesRequestToolChoiceOneOf3TypeXda87284b() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesRequestToolChoiceOneOf3TypeXda87284b()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesRequestToolChoiceOneOf3TypeXda87284b = when (value) {
      None.value -> None
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesRequestToolChoiceOneOf3TypeXda87284b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineMessagesRequestToolChoiceOneOf3TypeXda87284b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesRequestToolChoiceOneOf3TypeXda87284b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesRequestToolChoiceOneOf3TypeXda87284b) {
      encoder.encodeString(value.value)
    }
  }
}
