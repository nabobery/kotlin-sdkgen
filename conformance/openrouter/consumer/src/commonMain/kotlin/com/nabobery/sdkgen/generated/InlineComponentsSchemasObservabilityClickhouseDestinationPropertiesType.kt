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
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityClickhouseDestination/properties/type.
 */
@Serializable(with = InlineComponentsSchemasObservabilityClickhouseDestinationPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasObservabilityClickhouseDestinationPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `clickhouse`.
   */
  public data object Clickhouse : InlineComponentsSchemasObservabilityClickhouseDestinationPropertiesType() {
    public override val `value`: String = "clickhouse"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasObservabilityClickhouseDestinationPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasObservabilityClickhouseDestinationPropertiesType =
      when (value) {
      Clickhouse.value -> Clickhouse
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasObservabilityClickhouseDestinationPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasObservabilityClickhouseDestinationPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasObservabilityClickhouseDestinationPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasObservabilityClickhouseDestinationPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
