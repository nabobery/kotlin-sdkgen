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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/InProgressEvent/properties/type.
 */
@Serializable(with = InlineComponentsSchemasInProgressEventPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasInProgressEventPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.in_progress`.
   */
  public data object ResponseInProgress : InlineComponentsSchemasInProgressEventPropertiesType() {
    public override val `value`: String = "response.in_progress"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasInProgressEventPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasInProgressEventPropertiesType = when (value) {
      ResponseInProgress.value -> ResponseInProgress
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasInProgressEventPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasInProgressEventPropertiesType",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasInProgressEventPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasInProgressEventPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
