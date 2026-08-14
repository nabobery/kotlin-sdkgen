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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/InputMessageItem/properties/role/anyOf/0.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/InputMessageItem/properties/role/anyOf/0
 */
@Serializable(with = InlineInputMessageItemRoleAnyOf1X4ce025c6.Serializer::class)
public sealed class InlineInputMessageItemRoleAnyOf1X4ce025c6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `user`.
   */
  public data object User : InlineInputMessageItemRoleAnyOf1X4ce025c6() {
    public override val `value`: String = "user"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInputMessageItemRoleAnyOf1X4ce025c6()

  public companion object {
    public fun fromValue(`value`: String): InlineInputMessageItemRoleAnyOf1X4ce025c6 = when (value) {
      User.value -> User
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineInputMessageItemRoleAnyOf1X4ce025c6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineInputMessageItemRoleAnyOf1X4ce025c6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInputMessageItemRoleAnyOf1X4ce025c6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInputMessageItemRoleAnyOf1X4ce025c6) {
      encoder.encodeString(value.value)
    }
  }
}
