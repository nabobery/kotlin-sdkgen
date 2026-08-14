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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/role.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/role
 */
@Serializable(with = InlineMessagesMessageParamRoleXb49c78b7.Serializer::class)
public sealed class InlineMessagesMessageParamRoleXb49c78b7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `user`.
   */
  public data object User : InlineMessagesMessageParamRoleXb49c78b7() {
    public override val `value`: String = "user"
  }

  /**
   * Documented value. Wire value: `assistant`.
   */
  public data object Assistant : InlineMessagesMessageParamRoleXb49c78b7() {
    public override val `value`: String = "assistant"
  }

  /**
   * Documented value. Wire value: `system`.
   */
  public data object System : InlineMessagesMessageParamRoleXb49c78b7() {
    public override val `value`: String = "system"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesMessageParamRoleXb49c78b7()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesMessageParamRoleXb49c78b7 = when (value) {
      User.value -> User
      Assistant.value -> Assistant
      System.value -> System
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesMessageParamRoleXb49c78b7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineMessagesMessageParamRoleXb49c78b7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesMessageParamRoleXb49c78b7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesMessageParamRoleXb49c78b7) {
      encoder.encodeString(value.value)
    }
  }
}
