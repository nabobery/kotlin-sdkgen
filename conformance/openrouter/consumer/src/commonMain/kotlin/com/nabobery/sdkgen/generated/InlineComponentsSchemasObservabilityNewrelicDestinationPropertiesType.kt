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
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityNewrelicDestination/properties/type.
 */
@Serializable(with = InlineComponentsSchemasObservabilityNewrelicDestinationPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasObservabilityNewrelicDestinationPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `newrelic`.
   */
  public data object Newrelic : InlineComponentsSchemasObservabilityNewrelicDestinationPropertiesType() {
    public override val `value`: String = "newrelic"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasObservabilityNewrelicDestinationPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasObservabilityNewrelicDestinationPropertiesType =
      when (value) {
      Newrelic.value -> Newrelic
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasObservabilityNewrelicDestinationPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasObservabilityNewrelicDestinationPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasObservabilityNewrelicDestinationPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasObservabilityNewrelicDestinationPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
