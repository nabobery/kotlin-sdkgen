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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ChatUserMessage/properties/role.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatUserMessage/properties/role
 */
@Serializable(with = InlineChatUserMessageRoleXc7a5143a.Serializer::class)
public sealed class InlineChatUserMessageRoleXc7a5143a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `user`.
   */
  public data object User : InlineChatUserMessageRoleXc7a5143a() {
    public override val `value`: String = "user"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineChatUserMessageRoleXc7a5143a()

  public companion object {
    public fun fromValue(`value`: String): InlineChatUserMessageRoleXc7a5143a = when (value) {
      User.value -> User
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineChatUserMessageRoleXc7a5143a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineChatUserMessageRoleXc7a5143a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineChatUserMessageRoleXc7a5143a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineChatUserMessageRoleXc7a5143a) {
      encoder.encodeString(value.value)
    }
  }
}
