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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/role.
 */
@Serializable(with = InlineComponentsSchemasMessagesMessageParamPropertiesRole.Serializer::class)
public sealed class InlineComponentsSchemasMessagesMessageParamPropertiesRole {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `user`.
   */
  public data object User : InlineComponentsSchemasMessagesMessageParamPropertiesRole() {
    public override val `value`: String = "user"
  }

  /**
   * Documented value. Wire value: `assistant`.
   */
  public data object Assistant : InlineComponentsSchemasMessagesMessageParamPropertiesRole() {
    public override val `value`: String = "assistant"
  }

  /**
   * Documented value. Wire value: `system`.
   */
  public data object System : InlineComponentsSchemasMessagesMessageParamPropertiesRole() {
    public override val `value`: String = "system"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasMessagesMessageParamPropertiesRole()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasMessagesMessageParamPropertiesRole = when (value) {
      User.value -> User
      Assistant.value -> Assistant
      System.value -> System
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesMessageParamPropertiesRole> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasMessagesMessageParamPropertiesRole", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesMessageParamPropertiesRole =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasMessagesMessageParamPropertiesRole) {
      encoder.encodeString(value.value)
    }
  }
}
