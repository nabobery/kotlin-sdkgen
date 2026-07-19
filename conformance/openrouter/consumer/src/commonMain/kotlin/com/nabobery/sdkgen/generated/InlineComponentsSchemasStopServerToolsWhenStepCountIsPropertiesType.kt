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
 */
@Serializable(with = InlineComponentsSchemasStopServerToolsWhenStepCountIsPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasStopServerToolsWhenStepCountIsPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `step_count_is`.
   */
  public data object StepCountIs : InlineComponentsSchemasStopServerToolsWhenStepCountIsPropertiesType() {
    public override val `value`: String = "step_count_is"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasStopServerToolsWhenStepCountIsPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasStopServerToolsWhenStepCountIsPropertiesType =
      when (value) {
      StepCountIs.value -> StepCountIs
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasStopServerToolsWhenStepCountIsPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasStopServerToolsWhenStepCountIsPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasStopServerToolsWhenStepCountIsPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasStopServerToolsWhenStepCountIsPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
