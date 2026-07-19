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
 */
@Serializable(with = InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf0.Serializer::class)
public sealed class InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `user`.
   */
  public data object User : InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf0() {
    public override val `value`: String = "user"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf0()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf0 = when (value) {
      User.value -> User
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf0 =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf0) {
      encoder.encodeString(value.value)
    }
  }
}
