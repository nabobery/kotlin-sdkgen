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
 * sdkgen://source/openapi.yaml#/components/schemas/EasyInputMessage/properties/role/anyOf/2.
 */
@Serializable(with = InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf2.Serializer::class)
public sealed class InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `assistant`.
   */
  public data object Assistant : InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf2() {
    public override val `value`: String = "assistant"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf2()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf2 = when (value) {
      Assistant.value -> Assistant
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf2 =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf2) {
      encoder.encodeString(value.value)
    }
  }
}
