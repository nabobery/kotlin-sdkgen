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
 * sdkgen://source/openapi.yaml#/components/schemas/BaseInputs/anyOf/1/items/anyOf/0/properties/role/anyOf/0.
 */
@Serializable(with = InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf0.Serializer::class)
public sealed class InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `user`.
   */
  public data object User : InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf0() {
    public override val `value`: String = "user"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf0()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf0 =
      when (value) {
      User.value -> User
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf0) {
      encoder.encodeString(value.value)
    }
  }
}
