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
 * sdkgen://source/openapi.yaml#/components/schemas/StopServerToolsWhenStepCountIs/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/StopServerToolsWhenStepCountIs/properties/type
 */
@Serializable(with = InlineStopServerToolsWhenStepCountIsTypeXb5e4dd48.Serializer::class)
public sealed class InlineStopServerToolsWhenStepCountIsTypeXb5e4dd48 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `step_count_is`.
   */
  public data object StepCountIs : InlineStopServerToolsWhenStepCountIsTypeXb5e4dd48() {
    public override val `value`: String = "step_count_is"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineStopServerToolsWhenStepCountIsTypeXb5e4dd48()

  public companion object {
    public fun fromValue(`value`: String): InlineStopServerToolsWhenStepCountIsTypeXb5e4dd48 = when (value) {
      StepCountIs.value -> StepCountIs
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineStopServerToolsWhenStepCountIsTypeXb5e4dd48> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineStopServerToolsWhenStepCountIsTypeXb5e4dd48", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineStopServerToolsWhenStepCountIsTypeXb5e4dd48 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineStopServerToolsWhenStepCountIsTypeXb5e4dd48) {
      encoder.encodeString(value.value)
    }
  }
}
