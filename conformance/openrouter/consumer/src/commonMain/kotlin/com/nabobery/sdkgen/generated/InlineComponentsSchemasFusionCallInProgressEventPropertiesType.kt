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
 * sdkgen://source/openapi.yaml#/components/schemas/FusionCallInProgressEvent/properties/type.
 */
@Serializable(with = InlineComponentsSchemasFusionCallInProgressEventPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasFusionCallInProgressEventPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.fusion_call.in_progress`.
   */
  public data object ResponseFusionCallInProgress : InlineComponentsSchemasFusionCallInProgressEventPropertiesType() {
    public override val `value`: String = "response.fusion_call.in_progress"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasFusionCallInProgressEventPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasFusionCallInProgressEventPropertiesType =
      when (value) {
      ResponseFusionCallInProgress.value -> ResponseFusionCallInProgress
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasFusionCallInProgressEventPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasFusionCallInProgressEventPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasFusionCallInProgressEventPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasFusionCallInProgressEventPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
