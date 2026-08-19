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
 * sdkgen://source/openapi.yaml#/components/schemas/AgentMessageItem/properties/content/items/oneOf/2/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/AgentMessageItem/properties/content/items/oneOf/2/properties/type
 */
@Serializable(with = InlineAgentMessageItemContentItemOneOf3TypeX5fe6d0fe.Serializer::class)
public sealed class InlineAgentMessageItemContentItemOneOf3TypeX5fe6d0fe {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `encrypted_content`.
   */
  public data object EncryptedContent : InlineAgentMessageItemContentItemOneOf3TypeX5fe6d0fe() {
    public override val `value`: String = "encrypted_content"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAgentMessageItemContentItemOneOf3TypeX5fe6d0fe()

  public companion object {
    public fun fromValue(`value`: String): InlineAgentMessageItemContentItemOneOf3TypeX5fe6d0fe = when (value) {
      EncryptedContent.value -> EncryptedContent
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAgentMessageItemContentItemOneOf3TypeX5fe6d0fe> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineAgentMessageItemContentItemOneOf3TypeX5fe6d0fe", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAgentMessageItemContentItemOneOf3TypeX5fe6d0fe = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAgentMessageItemContentItemOneOf3TypeX5fe6d0fe) {
      encoder.encodeString(value.value)
    }
  }
}
