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
 */
@Serializable(with = InlineComponentsSchemasObservabilitySnowflakeDestinationPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasObservabilitySnowflakeDestinationPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `snowflake`.
   */
  public data object Snowflake : InlineComponentsSchemasObservabilitySnowflakeDestinationPropertiesType() {
    public override val `value`: String = "snowflake"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasObservabilitySnowflakeDestinationPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasObservabilitySnowflakeDestinationPropertiesType =
      when (value) {
      Snowflake.value -> Snowflake
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasObservabilitySnowflakeDestinationPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasObservabilitySnowflakeDestinationPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasObservabilitySnowflakeDestinationPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasObservabilitySnowflakeDestinationPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
