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
 * sdkgen://source/openapi.yaml#/components/schemas/EasyInputMessage/properties/role/anyOf/3.
 */
@Serializable(with = InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf3.Serializer::class)
public sealed class InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `developer`.
   */
  public data object Developer : InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf3() {
    public override val `value`: String = "developer"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf3()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf3 = when (value) {
      Developer.value -> Developer
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf3 =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf3) {
      encoder.encodeString(value.value)
    }
  }
}
