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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BaseCustomToolCallInputDeltaEvent/properties/type
 */
@Serializable(with = InlineBaseCustomToolCallInputDeltaEventTypeXce45a844.Serializer::class)
public sealed class InlineBaseCustomToolCallInputDeltaEventTypeXce45a844 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.custom_tool_call_input.delta`.
   */
  public data object ResponseCustomToolCallInputDelta : InlineBaseCustomToolCallInputDeltaEventTypeXce45a844() {
    public override val `value`: String = "response.custom_tool_call_input.delta"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBaseCustomToolCallInputDeltaEventTypeXce45a844()

  public companion object {
    public fun fromValue(`value`: String): InlineBaseCustomToolCallInputDeltaEventTypeXce45a844 = when (value) {
      ResponseCustomToolCallInputDelta.value -> ResponseCustomToolCallInputDelta
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBaseCustomToolCallInputDeltaEventTypeXce45a844> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineBaseCustomToolCallInputDeltaEventTypeXce45a844", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBaseCustomToolCallInputDeltaEventTypeXce45a844 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBaseCustomToolCallInputDeltaEventTypeXce45a844) {
      encoder.encodeString(value.value)
    }
  }
}
