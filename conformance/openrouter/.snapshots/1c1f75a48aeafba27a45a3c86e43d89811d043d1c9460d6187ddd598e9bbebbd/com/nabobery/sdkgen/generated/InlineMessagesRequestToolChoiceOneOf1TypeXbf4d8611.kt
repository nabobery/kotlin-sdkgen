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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tool_choice/oneOf/0/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tool_choice/oneOf/0/properties/type
 */
@Serializable(with = InlineMessagesRequestToolChoiceOneOf1TypeXbf4d8611.Serializer::class)
public sealed class InlineMessagesRequestToolChoiceOneOf1TypeXbf4d8611 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlineMessagesRequestToolChoiceOneOf1TypeXbf4d8611() {
    public override val `value`: String = "auto"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesRequestToolChoiceOneOf1TypeXbf4d8611()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesRequestToolChoiceOneOf1TypeXbf4d8611 = when (value) {
      Auto.value -> Auto
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesRequestToolChoiceOneOf1TypeXbf4d8611> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineMessagesRequestToolChoiceOneOf1TypeXbf4d8611", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesRequestToolChoiceOneOf1TypeXbf4d8611 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesRequestToolChoiceOneOf1TypeXbf4d8611) {
      encoder.encodeString(value.value)
    }
  }
}
