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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/AgentMessageItem/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AgentMessageItem/properties/type
 */
@Serializable(with = InlineAgentMessageItemTypeX27997a7b.Serializer::class)
public sealed class InlineAgentMessageItemTypeX27997a7b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `agent_message`.
   */
  public data object AgentMessage : InlineAgentMessageItemTypeX27997a7b() {
    public override val `value`: String = "agent_message"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAgentMessageItemTypeX27997a7b()

  public companion object {
    public fun fromValue(`value`: String): InlineAgentMessageItemTypeX27997a7b = when (value) {
      AgentMessage.value -> AgentMessage
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAgentMessageItemTypeX27997a7b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAgentMessageItemTypeX27997a7b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAgentMessageItemTypeX27997a7b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAgentMessageItemTypeX27997a7b) {
      encoder.encodeString(value.value)
    }
  }
}
