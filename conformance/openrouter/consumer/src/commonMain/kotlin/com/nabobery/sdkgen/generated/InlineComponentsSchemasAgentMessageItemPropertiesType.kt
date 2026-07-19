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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/AgentMessageItem/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAgentMessageItemPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAgentMessageItemPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `agent_message`.
   */
  public data object AgentMessage : InlineComponentsSchemasAgentMessageItemPropertiesType() {
    public override val `value`: String = "agent_message"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAgentMessageItemPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAgentMessageItemPropertiesType = when (value) {
      AgentMessage.value -> AgentMessage
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAgentMessageItemPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAgentMessageItemPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAgentMessageItemPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasAgentMessageItemPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
