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
 * sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponseCustomToolCallOutput/properties/type.
 */
@Serializable(with = InlineComponentsSchemasOpenAiResponseCustomToolCallOutputPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasOpenAiResponseCustomToolCallOutputPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `custom_tool_call_output`.
   */
  public data object CustomToolCallOutput : InlineComponentsSchemasOpenAiResponseCustomToolCallOutputPropertiesType() {
    public override val `value`: String = "custom_tool_call_output"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOpenAiResponseCustomToolCallOutputPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOpenAiResponseCustomToolCallOutputPropertiesType =
      when (value) {
      CustomToolCallOutput.value -> CustomToolCallOutput
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOpenAiResponseCustomToolCallOutputPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOpenAiResponseCustomToolCallOutputPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOpenAiResponseCustomToolCallOutputPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOpenAiResponseCustomToolCallOutputPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
