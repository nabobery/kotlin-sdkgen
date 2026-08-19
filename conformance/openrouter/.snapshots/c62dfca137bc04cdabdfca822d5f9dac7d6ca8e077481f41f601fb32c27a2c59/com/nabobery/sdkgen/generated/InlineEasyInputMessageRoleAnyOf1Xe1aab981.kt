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
 * sdkgen://source/openapi.yaml#/components/schemas/EasyInputMessage/properties/role/anyOf/0.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/EasyInputMessage/properties/role/anyOf/0
 */
@Serializable(with = InlineEasyInputMessageRoleAnyOf1Xe1aab981.Serializer::class)
public sealed class InlineEasyInputMessageRoleAnyOf1Xe1aab981 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `user`.
   */
  public data object User : InlineEasyInputMessageRoleAnyOf1Xe1aab981() {
    public override val `value`: String = "user"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineEasyInputMessageRoleAnyOf1Xe1aab981()

  public companion object {
    public fun fromValue(`value`: String): InlineEasyInputMessageRoleAnyOf1Xe1aab981 = when (value) {
      User.value -> User
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineEasyInputMessageRoleAnyOf1Xe1aab981> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineEasyInputMessageRoleAnyOf1Xe1aab981", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineEasyInputMessageRoleAnyOf1Xe1aab981 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineEasyInputMessageRoleAnyOf1Xe1aab981) {
      encoder.encodeString(value.value)
    }
  }
}
