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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponseInputMessageItem/properties/role/anyOf/1
 */
@Serializable(with = InlineOpenAiResponseInputMessageItemRoleAnyOf2X3c18f9d4.Serializer::class)
public sealed class InlineOpenAiResponseInputMessageItemRoleAnyOf2X3c18f9d4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `system`.
   */
  public data object System : InlineOpenAiResponseInputMessageItemRoleAnyOf2X3c18f9d4() {
    public override val `value`: String = "system"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOpenAiResponseInputMessageItemRoleAnyOf2X3c18f9d4()

  public companion object {
    public fun fromValue(`value`: String): InlineOpenAiResponseInputMessageItemRoleAnyOf2X3c18f9d4 = when (value) {
      System.value -> System
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOpenAiResponseInputMessageItemRoleAnyOf2X3c18f9d4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOpenAiResponseInputMessageItemRoleAnyOf2X3c18f9d4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOpenAiResponseInputMessageItemRoleAnyOf2X3c18f9d4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOpenAiResponseInputMessageItemRoleAnyOf2X3c18f9d4) {
      encoder.encodeString(value.value)
    }
  }
}
