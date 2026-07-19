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
 * sdkgen://source/openapi.yaml#/components/schemas/InputMessageItem/properties/role/anyOf/1.
 */
@Serializable(with = InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf1.Serializer::class)
public sealed class InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `system`.
   */
  public data object System : InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf1() {
    public override val `value`: String = "system"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf1()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf1 = when (value) {
      System.value -> System
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf1 =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf1) {
      encoder.encodeString(value.value)
    }
  }
}
