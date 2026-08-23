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
 * sdkgen://source/openapi.yaml#/components/schemas/InputMessageItem/properties/role/anyOf/2.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/InputMessageItem/properties/role/anyOf/2
 */
@Serializable(with = InlineInputMessageItemRoleAnyOf3X339f9235.Serializer::class)
public sealed class InlineInputMessageItemRoleAnyOf3X339f9235 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `developer`.
   */
  public data object Developer : InlineInputMessageItemRoleAnyOf3X339f9235() {
    public override val `value`: String = "developer"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInputMessageItemRoleAnyOf3X339f9235()

  public companion object {
    public fun fromValue(`value`: String): InlineInputMessageItemRoleAnyOf3X339f9235 = when (value) {
      Developer.value -> Developer
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineInputMessageItemRoleAnyOf3X339f9235> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineInputMessageItemRoleAnyOf3X339f9235", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInputMessageItemRoleAnyOf3X339f9235 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInputMessageItemRoleAnyOf3X339f9235) {
      encoder.encodeString(value.value)
    }
  }
}
