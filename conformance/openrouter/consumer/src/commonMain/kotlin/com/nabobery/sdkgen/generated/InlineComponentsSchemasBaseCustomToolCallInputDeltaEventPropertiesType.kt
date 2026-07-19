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
 * sdkgen://source/openapi.yaml#/components/schemas/BaseCustomToolCallInputDeltaEvent/properties/type.
 */
@Serializable(with = InlineComponentsSchemasBaseCustomToolCallInputDeltaEventPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasBaseCustomToolCallInputDeltaEventPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.custom_tool_call_input.delta`.
   */
  public data object ResponseCustomToolCallInputDelta : InlineComponentsSchemasBaseCustomToolCallInputDeltaEventPropertiesType() {
    public override val `value`: String = "response.custom_tool_call_input.delta"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasBaseCustomToolCallInputDeltaEventPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasBaseCustomToolCallInputDeltaEventPropertiesType =
      when (value) {
      ResponseCustomToolCallInputDelta.value -> ResponseCustomToolCallInputDelta
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasBaseCustomToolCallInputDeltaEventPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasBaseCustomToolCallInputDeltaEventPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasBaseCustomToolCallInputDeltaEventPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasBaseCustomToolCallInputDeltaEventPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
