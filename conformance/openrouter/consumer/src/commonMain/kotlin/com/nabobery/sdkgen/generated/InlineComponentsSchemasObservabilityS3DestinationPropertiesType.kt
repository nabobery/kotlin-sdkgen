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
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityS3Destination/properties/type.
 */
@Serializable(with = InlineComponentsSchemasObservabilityS3DestinationPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasObservabilityS3DestinationPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `s3`.
   */
  public data object S3 : InlineComponentsSchemasObservabilityS3DestinationPropertiesType() {
    public override val `value`: String = "s3"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasObservabilityS3DestinationPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasObservabilityS3DestinationPropertiesType =
      when (value) {
      S3.value -> S3
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasObservabilityS3DestinationPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasObservabilityS3DestinationPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasObservabilityS3DestinationPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasObservabilityS3DestinationPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
