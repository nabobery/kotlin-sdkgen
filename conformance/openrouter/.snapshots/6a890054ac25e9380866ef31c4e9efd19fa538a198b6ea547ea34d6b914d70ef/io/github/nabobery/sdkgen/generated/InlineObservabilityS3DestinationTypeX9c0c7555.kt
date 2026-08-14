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
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityS3Destination/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ObservabilityS3Destination/properties/type
 */
@Serializable(with = InlineObservabilityS3DestinationTypeX9c0c7555.Serializer::class)
public sealed class InlineObservabilityS3DestinationTypeX9c0c7555 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `s3`.
   */
  public data object S3 : InlineObservabilityS3DestinationTypeX9c0c7555() {
    public override val `value`: String = "s3"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineObservabilityS3DestinationTypeX9c0c7555()

  public companion object {
    public fun fromValue(`value`: String): InlineObservabilityS3DestinationTypeX9c0c7555 = when (value) {
      S3.value -> S3
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineObservabilityS3DestinationTypeX9c0c7555> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineObservabilityS3DestinationTypeX9c0c7555", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineObservabilityS3DestinationTypeX9c0c7555 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineObservabilityS3DestinationTypeX9c0c7555) {
      encoder.encodeString(value.value)
    }
  }
}
