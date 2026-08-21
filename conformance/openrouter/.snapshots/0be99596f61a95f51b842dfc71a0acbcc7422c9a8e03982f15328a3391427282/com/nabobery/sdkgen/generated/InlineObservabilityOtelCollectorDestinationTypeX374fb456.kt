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
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityOtelCollectorDestination/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ObservabilityOtelCollectorDestination/properties/type
 */
@Serializable(with = InlineObservabilityOtelCollectorDestinationTypeX374fb456.Serializer::class)
public sealed class InlineObservabilityOtelCollectorDestinationTypeX374fb456 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `otel-collector`.
   */
  public data object OtelCollector : InlineObservabilityOtelCollectorDestinationTypeX374fb456() {
    public override val `value`: String = "otel-collector"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineObservabilityOtelCollectorDestinationTypeX374fb456()

  public companion object {
    public fun fromValue(`value`: String): InlineObservabilityOtelCollectorDestinationTypeX374fb456 = when (value) {
      OtelCollector.value -> OtelCollector
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineObservabilityOtelCollectorDestinationTypeX374fb456> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineObservabilityOtelCollectorDestinationTypeX374fb456", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineObservabilityOtelCollectorDestinationTypeX374fb456 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineObservabilityOtelCollectorDestinationTypeX374fb456) {
      encoder.encodeString(value.value)
    }
  }
}
