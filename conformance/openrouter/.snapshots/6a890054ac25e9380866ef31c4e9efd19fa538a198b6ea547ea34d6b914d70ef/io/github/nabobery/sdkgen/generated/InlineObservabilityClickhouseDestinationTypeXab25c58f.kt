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
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityClickhouseDestination/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ObservabilityClickhouseDestination/properties/type
 */
@Serializable(with = InlineObservabilityClickhouseDestinationTypeXab25c58f.Serializer::class)
public sealed class InlineObservabilityClickhouseDestinationTypeXab25c58f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `clickhouse`.
   */
  public data object Clickhouse : InlineObservabilityClickhouseDestinationTypeXab25c58f() {
    public override val `value`: String = "clickhouse"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineObservabilityClickhouseDestinationTypeXab25c58f()

  public companion object {
    public fun fromValue(`value`: String): InlineObservabilityClickhouseDestinationTypeXab25c58f = when (value) {
      Clickhouse.value -> Clickhouse
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineObservabilityClickhouseDestinationTypeXab25c58f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineObservabilityClickhouseDestinationTypeXab25c58f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineObservabilityClickhouseDestinationTypeXab25c58f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineObservabilityClickhouseDestinationTypeXab25c58f) {
      encoder.encodeString(value.value)
    }
  }
}
