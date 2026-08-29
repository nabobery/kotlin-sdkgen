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
 * sdkgen://source/openapi.yaml#/components/schemas/BaseInputs/anyOf/1/items/anyOf/0/properties/role/anyOf/3.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BaseInputs/anyOf/1/items/anyOf/0/properties/role/anyOf/3
 */
@Serializable(with = InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf4X17df7c2c.Serializer::class)
public sealed class InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf4X17df7c2c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `developer`.
   */
  public data object Developer : InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf4X17df7c2c() {
    public override val `value`: String = "developer"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf4X17df7c2c()

  public companion object {
    public fun fromValue(`value`: String): InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf4X17df7c2c = when (value) {
      Developer.value -> Developer
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf4X17df7c2c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf4X17df7c2c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf4X17df7c2c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf4X17df7c2c) {
      encoder.encodeString(value.value)
    }
  }
}
