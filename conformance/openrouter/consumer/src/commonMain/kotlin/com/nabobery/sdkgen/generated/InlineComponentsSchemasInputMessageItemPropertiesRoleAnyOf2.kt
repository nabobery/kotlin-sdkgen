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
 */
@Serializable(with = InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf2.Serializer::class)
public sealed class InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `developer`.
   */
  public data object Developer : InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf2() {
    public override val `value`: String = "developer"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf2()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf2 = when (value) {
      Developer.value -> Developer
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf2 =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf2) {
      encoder.encodeString(value.value)
    }
  }
}
