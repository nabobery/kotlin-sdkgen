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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputItemCustomToolCall/properties/type.
 */
@Serializable(with = InlineComponentsSchemasOutputItemCustomToolCallPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasOutputItemCustomToolCallPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `custom_tool_call`.
   */
  public data object CustomToolCall : InlineComponentsSchemasOutputItemCustomToolCallPropertiesType() {
    public override val `value`: String = "custom_tool_call"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOutputItemCustomToolCallPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOutputItemCustomToolCallPropertiesType =
      when (value) {
      CustomToolCall.value -> CustomToolCall
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputItemCustomToolCallPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOutputItemCustomToolCallPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputItemCustomToolCallPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasOutputItemCustomToolCallPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
