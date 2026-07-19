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
 * sdkgen://source/openapi.yaml#/components/schemas/InputMessageItem/properties/role/anyOf/0.
 */
@Serializable(with = InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf0.Serializer::class)
public sealed class InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `user`.
   */
  public data object User : InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf0() {
    public override val `value`: String = "user"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf0()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf0 = when (value) {
      User.value -> User
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf0 =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf0) {
      encoder.encodeString(value.value)
    }
  }
}
