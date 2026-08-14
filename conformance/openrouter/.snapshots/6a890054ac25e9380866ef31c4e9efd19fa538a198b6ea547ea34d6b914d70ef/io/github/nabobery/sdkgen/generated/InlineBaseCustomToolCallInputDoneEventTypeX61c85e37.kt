package io.github.nabobery.sdkgen.generated

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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BaseCustomToolCallInputDoneEvent/properties/type
 */
@Serializable(with = InlineBaseCustomToolCallInputDoneEventTypeX61c85e37.Serializer::class)
public sealed class InlineBaseCustomToolCallInputDoneEventTypeX61c85e37 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.custom_tool_call_input.done`.
   */
  public data object ResponseCustomToolCallInputDone : InlineBaseCustomToolCallInputDoneEventTypeX61c85e37() {
    public override val `value`: String = "response.custom_tool_call_input.done"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBaseCustomToolCallInputDoneEventTypeX61c85e37()

  public companion object {
    public fun fromValue(`value`: String): InlineBaseCustomToolCallInputDoneEventTypeX61c85e37 = when (value) {
      ResponseCustomToolCallInputDone.value -> ResponseCustomToolCallInputDone
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBaseCustomToolCallInputDoneEventTypeX61c85e37> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineBaseCustomToolCallInputDoneEventTypeX61c85e37", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBaseCustomToolCallInputDoneEventTypeX61c85e37 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBaseCustomToolCallInputDoneEventTypeX61c85e37) {
      encoder.encodeString(value.value)
    }
  }
}
