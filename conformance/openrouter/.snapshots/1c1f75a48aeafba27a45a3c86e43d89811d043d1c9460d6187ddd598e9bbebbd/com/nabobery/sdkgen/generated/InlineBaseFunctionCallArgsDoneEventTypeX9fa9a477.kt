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
 * sdkgen://source/openapi.yaml#/components/schemas/BaseFunctionCallArgsDoneEvent/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BaseFunctionCallArgsDoneEvent/properties/type
 */
@Serializable(with = InlineBaseFunctionCallArgsDoneEventTypeX9fa9a477.Serializer::class)
public sealed class InlineBaseFunctionCallArgsDoneEventTypeX9fa9a477 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.function_call_arguments.done`.
   */
  public data object ResponseFunctionCallArgumentsDone : InlineBaseFunctionCallArgsDoneEventTypeX9fa9a477() {
    public override val `value`: String = "response.function_call_arguments.done"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBaseFunctionCallArgsDoneEventTypeX9fa9a477()

  public companion object {
    public fun fromValue(`value`: String): InlineBaseFunctionCallArgsDoneEventTypeX9fa9a477 = when (value) {
      ResponseFunctionCallArgumentsDone.value -> ResponseFunctionCallArgumentsDone
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBaseFunctionCallArgsDoneEventTypeX9fa9a477> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineBaseFunctionCallArgsDoneEventTypeX9fa9a477", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBaseFunctionCallArgsDoneEventTypeX9fa9a477 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBaseFunctionCallArgsDoneEventTypeX9fa9a477) {
      encoder.encodeString(value.value)
    }
  }
}
