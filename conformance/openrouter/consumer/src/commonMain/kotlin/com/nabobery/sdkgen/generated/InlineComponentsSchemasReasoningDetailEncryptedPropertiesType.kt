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
 * sdkgen://source/openapi.yaml#/components/schemas/ReasoningDetailEncrypted/properties/type.
 */
@Serializable(with = InlineComponentsSchemasReasoningDetailEncryptedPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasReasoningDetailEncryptedPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `reasoning.encrypted`.
   */
  public data object ReasoningEncrypted : InlineComponentsSchemasReasoningDetailEncryptedPropertiesType() {
    public override val `value`: String = "reasoning.encrypted"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasReasoningDetailEncryptedPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasReasoningDetailEncryptedPropertiesType =
      when (value) {
      ReasoningEncrypted.value -> ReasoningEncrypted
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasReasoningDetailEncryptedPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasReasoningDetailEncryptedPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasReasoningDetailEncryptedPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasReasoningDetailEncryptedPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
