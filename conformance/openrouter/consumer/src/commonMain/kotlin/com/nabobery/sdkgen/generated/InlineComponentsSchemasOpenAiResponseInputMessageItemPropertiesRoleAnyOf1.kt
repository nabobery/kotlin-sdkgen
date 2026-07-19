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
 * sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponseInputMessageItem/properties/role/anyOf/1.
 */
@Serializable(with = InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf1.Serializer::class)
public sealed class InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `system`.
   */
  public data object System : InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf1() {
    public override val `value`: String = "system"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf1()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf1 =
      when (value) {
      System.value -> System
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf1) {
      encoder.encodeString(value.value)
    }
  }
}
