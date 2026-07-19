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
 */
@Serializable(with = InlineComponentsSchemasChatUserMessagePropertiesRole.Serializer::class)
public sealed class InlineComponentsSchemasChatUserMessagePropertiesRole {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `user`.
   */
  public data object User : InlineComponentsSchemasChatUserMessagePropertiesRole() {
    public override val `value`: String = "user"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasChatUserMessagePropertiesRole()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasChatUserMessagePropertiesRole = when (value) {
      User.value -> User
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasChatUserMessagePropertiesRole> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasChatUserMessagePropertiesRole",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasChatUserMessagePropertiesRole =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasChatUserMessagePropertiesRole) {
      encoder.encodeString(value.value)
    }
  }
}
