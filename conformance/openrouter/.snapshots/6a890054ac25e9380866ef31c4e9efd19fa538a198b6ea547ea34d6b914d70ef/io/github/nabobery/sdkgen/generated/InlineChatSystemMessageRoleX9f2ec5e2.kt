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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ChatSystemMessage/properties/role.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatSystemMessage/properties/role
 */
@Serializable(with = InlineChatSystemMessageRoleX9f2ec5e2.Serializer::class)
public sealed class InlineChatSystemMessageRoleX9f2ec5e2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `system`.
   */
  public data object System : InlineChatSystemMessageRoleX9f2ec5e2() {
    public override val `value`: String = "system"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineChatSystemMessageRoleX9f2ec5e2()

  public companion object {
    public fun fromValue(`value`: String): InlineChatSystemMessageRoleX9f2ec5e2 = when (value) {
      System.value -> System
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineChatSystemMessageRoleX9f2ec5e2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineChatSystemMessageRoleX9f2ec5e2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineChatSystemMessageRoleX9f2ec5e2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineChatSystemMessageRoleX9f2ec5e2) {
      encoder.encodeString(value.value)
    }
  }
}
