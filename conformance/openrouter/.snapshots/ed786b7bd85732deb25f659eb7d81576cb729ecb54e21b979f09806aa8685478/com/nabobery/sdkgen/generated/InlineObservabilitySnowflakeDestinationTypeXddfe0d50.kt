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
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilitySnowflakeDestination/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ObservabilitySnowflakeDestination/properties/type
 */
@Serializable(with = InlineObservabilitySnowflakeDestinationTypeXddfe0d50.Serializer::class)
public sealed class InlineObservabilitySnowflakeDestinationTypeXddfe0d50 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `snowflake`.
   */
  public data object Snowflake : InlineObservabilitySnowflakeDestinationTypeXddfe0d50() {
    public override val `value`: String = "snowflake"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineObservabilitySnowflakeDestinationTypeXddfe0d50()

  public companion object {
    public fun fromValue(`value`: String): InlineObservabilitySnowflakeDestinationTypeXddfe0d50 = when (value) {
      Snowflake.value -> Snowflake
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineObservabilitySnowflakeDestinationTypeXddfe0d50> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineObservabilitySnowflakeDestinationTypeXddfe0d50", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineObservabilitySnowflakeDestinationTypeXddfe0d50 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineObservabilitySnowflakeDestinationTypeXddfe0d50) {
      encoder.encodeString(value.value)
    }
  }
}
