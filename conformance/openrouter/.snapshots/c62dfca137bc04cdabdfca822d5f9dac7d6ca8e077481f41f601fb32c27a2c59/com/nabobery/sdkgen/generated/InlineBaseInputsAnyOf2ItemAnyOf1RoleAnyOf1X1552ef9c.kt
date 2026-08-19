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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BaseInputs/anyOf/1/items/anyOf/0/properties/role/anyOf/0
 */
@Serializable(with = InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf1X1552ef9c.Serializer::class)
public sealed class InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf1X1552ef9c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `user`.
   */
  public data object User : InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf1X1552ef9c() {
    public override val `value`: String = "user"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf1X1552ef9c()

  public companion object {
    public fun fromValue(`value`: String): InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf1X1552ef9c = when (value) {
      User.value -> User
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf1X1552ef9c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf1X1552ef9c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf1X1552ef9c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf1X1552ef9c) {
      encoder.encodeString(value.value)
    }
  }
}
