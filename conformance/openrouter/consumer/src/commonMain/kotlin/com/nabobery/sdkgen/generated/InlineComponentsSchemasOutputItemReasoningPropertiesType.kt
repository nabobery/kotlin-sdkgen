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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/OutputItemReasoning/properties/type.
 */
@Serializable(with = InlineComponentsSchemasOutputItemReasoningPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasOutputItemReasoningPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `reasoning`.
   */
  public data object Reasoning : InlineComponentsSchemasOutputItemReasoningPropertiesType() {
    public override val `value`: String = "reasoning"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOutputItemReasoningPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOutputItemReasoningPropertiesType = when (value) {
      Reasoning.value -> Reasoning
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputItemReasoningPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOutputItemReasoningPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputItemReasoningPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasOutputItemReasoningPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
