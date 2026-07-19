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
 * sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponseCustomToolCall/properties/type.
 */
@Serializable(with = InlineComponentsSchemasOpenAiResponseCustomToolCallPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasOpenAiResponseCustomToolCallPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `custom_tool_call`.
   */
  public data object CustomToolCall : InlineComponentsSchemasOpenAiResponseCustomToolCallPropertiesType() {
    public override val `value`: String = "custom_tool_call"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOpenAiResponseCustomToolCallPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOpenAiResponseCustomToolCallPropertiesType =
      when (value) {
      CustomToolCall.value -> CustomToolCall
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOpenAiResponseCustomToolCallPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOpenAiResponseCustomToolCallPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOpenAiResponseCustomToolCallPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOpenAiResponseCustomToolCallPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
