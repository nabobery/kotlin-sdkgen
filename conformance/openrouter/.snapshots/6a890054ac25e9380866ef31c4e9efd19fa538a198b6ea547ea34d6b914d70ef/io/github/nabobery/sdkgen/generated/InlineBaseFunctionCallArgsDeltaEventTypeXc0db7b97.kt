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
 * sdkgen://source/openapi.yaml#/components/schemas/BaseFunctionCallArgsDeltaEvent/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BaseFunctionCallArgsDeltaEvent/properties/type
 */
@Serializable(with = InlineBaseFunctionCallArgsDeltaEventTypeXc0db7b97.Serializer::class)
public sealed class InlineBaseFunctionCallArgsDeltaEventTypeXc0db7b97 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.function_call_arguments.delta`.
   */
  public data object ResponseFunctionCallArgumentsDelta : InlineBaseFunctionCallArgsDeltaEventTypeXc0db7b97() {
    public override val `value`: String = "response.function_call_arguments.delta"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBaseFunctionCallArgsDeltaEventTypeXc0db7b97()

  public companion object {
    public fun fromValue(`value`: String): InlineBaseFunctionCallArgsDeltaEventTypeXc0db7b97 = when (value) {
      ResponseFunctionCallArgumentsDelta.value -> ResponseFunctionCallArgumentsDelta
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBaseFunctionCallArgsDeltaEventTypeXc0db7b97> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineBaseFunctionCallArgsDeltaEventTypeXc0db7b97", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBaseFunctionCallArgsDeltaEventTypeXc0db7b97 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBaseFunctionCallArgsDeltaEventTypeXc0db7b97) {
      encoder.encodeString(value.value)
    }
  }
}
