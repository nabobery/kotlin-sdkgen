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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesStartEvent/properties/message/properties/role.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesStartEvent/properties/message/properties/role
 */
@Serializable(with = InlineMessagesStartEventMessageRoleXdd76094e.Serializer::class)
public sealed class InlineMessagesStartEventMessageRoleXdd76094e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `assistant`.
   */
  public data object Assistant : InlineMessagesStartEventMessageRoleXdd76094e() {
    public override val `value`: String = "assistant"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesStartEventMessageRoleXdd76094e()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesStartEventMessageRoleXdd76094e = when (value) {
      Assistant.value -> Assistant
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesStartEventMessageRoleXdd76094e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineMessagesStartEventMessageRoleXdd76094e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesStartEventMessageRoleXdd76094e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesStartEventMessageRoleXdd76094e) {
      encoder.encodeString(value.value)
    }
  }
}
