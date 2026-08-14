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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content/anyOf/1/items/oneOf/5/proper
 * ties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content/anyOf/1/items/oneOf/5/proper
 * ties/type
 */
@Serializable(with = InlineMessagesMessageParamContentAnyOf2ItemOneOf6TypeXdaecd580.Serializer::class)
public sealed class InlineMessagesMessageParamContentAnyOf2ItemOneOf6TypeXdaecd580 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `thinking`.
   */
  public data object Thinking : InlineMessagesMessageParamContentAnyOf2ItemOneOf6TypeXdaecd580() {
    public override val `value`: String = "thinking"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesMessageParamContentAnyOf2ItemOneOf6TypeXdaecd580()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesMessageParamContentAnyOf2ItemOneOf6TypeXdaecd580 = when (value) {
      Thinking.value -> Thinking
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesMessageParamContentAnyOf2ItemOneOf6TypeXdaecd580> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineMessagesMessageParamContentAnyOf2ItemOneOf6TypeXdaecd580", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesMessageParamContentAnyOf2ItemOneOf6TypeXdaecd580 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesMessageParamContentAnyOf2ItemOneOf6TypeXdaecd580) {
      encoder.encodeString(value.value)
    }
  }
}
