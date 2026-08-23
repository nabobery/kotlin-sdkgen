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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ChatToolMessage/properties/role.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatToolMessage/properties/role
 */
@Serializable(with = InlineChatToolMessageRoleXd22779fe.Serializer::class)
public sealed class InlineChatToolMessageRoleXd22779fe {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `tool`.
   */
  public data object Tool : InlineChatToolMessageRoleXd22779fe() {
    public override val `value`: String = "tool"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineChatToolMessageRoleXd22779fe()

  public companion object {
    public fun fromValue(`value`: String): InlineChatToolMessageRoleXd22779fe = when (value) {
      Tool.value -> Tool
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineChatToolMessageRoleXd22779fe> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineChatToolMessageRoleXd22779fe", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineChatToolMessageRoleXd22779fe = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineChatToolMessageRoleXd22779fe) {
      encoder.encodeString(value.value)
    }
  }
}
