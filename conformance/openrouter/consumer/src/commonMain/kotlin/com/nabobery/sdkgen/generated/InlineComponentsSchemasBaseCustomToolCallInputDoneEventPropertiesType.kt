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
 * sdkgen://source/openapi.yaml#/components/schemas/BaseCustomToolCallInputDoneEvent/properties/type.
 */
@Serializable(with = InlineComponentsSchemasBaseCustomToolCallInputDoneEventPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasBaseCustomToolCallInputDoneEventPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.custom_tool_call_input.done`.
   */
  public data object ResponseCustomToolCallInputDone : InlineComponentsSchemasBaseCustomToolCallInputDoneEventPropertiesType() {
    public override val `value`: String = "response.custom_tool_call_input.done"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasBaseCustomToolCallInputDoneEventPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasBaseCustomToolCallInputDoneEventPropertiesType =
      when (value) {
      ResponseCustomToolCallInputDone.value -> ResponseCustomToolCallInputDone
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasBaseCustomToolCallInputDoneEventPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasBaseCustomToolCallInputDoneEventPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasBaseCustomToolCallInputDoneEventPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasBaseCustomToolCallInputDoneEventPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
