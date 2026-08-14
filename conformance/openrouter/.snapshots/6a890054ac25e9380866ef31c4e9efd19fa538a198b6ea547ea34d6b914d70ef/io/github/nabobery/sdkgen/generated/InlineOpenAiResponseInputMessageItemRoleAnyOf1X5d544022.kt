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
 * sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponseInputMessageItem/properties/role/anyOf/0.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponseInputMessageItem/properties/role/anyOf/0
 */
@Serializable(with = InlineOpenAiResponseInputMessageItemRoleAnyOf1X5d544022.Serializer::class)
public sealed class InlineOpenAiResponseInputMessageItemRoleAnyOf1X5d544022 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `user`.
   */
  public data object User : InlineOpenAiResponseInputMessageItemRoleAnyOf1X5d544022() {
    public override val `value`: String = "user"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOpenAiResponseInputMessageItemRoleAnyOf1X5d544022()

  public companion object {
    public fun fromValue(`value`: String): InlineOpenAiResponseInputMessageItemRoleAnyOf1X5d544022 = when (value) {
      User.value -> User
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOpenAiResponseInputMessageItemRoleAnyOf1X5d544022> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineOpenAiResponseInputMessageItemRoleAnyOf1X5d544022", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOpenAiResponseInputMessageItemRoleAnyOf1X5d544022 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOpenAiResponseInputMessageItemRoleAnyOf1X5d544022) {
      encoder.encodeString(value.value)
    }
  }
}
