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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ChatDeveloperMessage/properties/role.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatDeveloperMessage/properties/role
 */
@Serializable(with = InlineChatDeveloperMessageRoleXaca6c656.Serializer::class)
public sealed class InlineChatDeveloperMessageRoleXaca6c656 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `developer`.
   */
  public data object Developer : InlineChatDeveloperMessageRoleXaca6c656() {
    public override val `value`: String = "developer"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineChatDeveloperMessageRoleXaca6c656()

  public companion object {
    public fun fromValue(`value`: String): InlineChatDeveloperMessageRoleXaca6c656 = when (value) {
      Developer.value -> Developer
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineChatDeveloperMessageRoleXaca6c656> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineChatDeveloperMessageRoleXaca6c656", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineChatDeveloperMessageRoleXaca6c656 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineChatDeveloperMessageRoleXaca6c656) {
      encoder.encodeString(value.value)
    }
  }
}
