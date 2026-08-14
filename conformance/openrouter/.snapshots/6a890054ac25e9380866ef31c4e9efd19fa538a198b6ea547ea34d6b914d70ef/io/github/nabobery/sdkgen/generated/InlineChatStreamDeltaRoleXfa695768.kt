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
 * The role of the message author
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatStreamDelta/properties/role
 */
@Serializable(with = InlineChatStreamDeltaRoleXfa695768.Serializer::class)
public sealed class InlineChatStreamDeltaRoleXfa695768 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `assistant`.
   */
  public data object Assistant : InlineChatStreamDeltaRoleXfa695768() {
    public override val `value`: String = "assistant"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineChatStreamDeltaRoleXfa695768()

  public companion object {
    public fun fromValue(`value`: String): InlineChatStreamDeltaRoleXfa695768 = when (value) {
      Assistant.value -> Assistant
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineChatStreamDeltaRoleXfa695768> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineChatStreamDeltaRoleXfa695768", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineChatStreamDeltaRoleXfa695768 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineChatStreamDeltaRoleXfa695768) {
      encoder.encodeString(value.value)
    }
  }
}
