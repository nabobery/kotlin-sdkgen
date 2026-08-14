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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/thinking/oneOf/0/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/thinking/oneOf/0/properties/type
 */
@Serializable(with = InlineMessagesRequestThinkingOneOf1TypeX9c49263e.Serializer::class)
public sealed class InlineMessagesRequestThinkingOneOf1TypeX9c49263e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineMessagesRequestThinkingOneOf1TypeX9c49263e() {
    public override val `value`: String = "enabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesRequestThinkingOneOf1TypeX9c49263e()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesRequestThinkingOneOf1TypeX9c49263e = when (value) {
      Enabled.value -> Enabled
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesRequestThinkingOneOf1TypeX9c49263e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineMessagesRequestThinkingOneOf1TypeX9c49263e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesRequestThinkingOneOf1TypeX9c49263e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesRequestThinkingOneOf1TypeX9c49263e) {
      encoder.encodeString(value.value)
    }
  }
}
