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
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityArizeDestination/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ObservabilityArizeDestination/properties/type
 */
@Serializable(with = InlineObservabilityArizeDestinationTypeXaa945fac.Serializer::class)
public sealed class InlineObservabilityArizeDestinationTypeXaa945fac {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `arize`.
   */
  public data object Arize : InlineObservabilityArizeDestinationTypeXaa945fac() {
    public override val `value`: String = "arize"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineObservabilityArizeDestinationTypeXaa945fac()

  public companion object {
    public fun fromValue(`value`: String): InlineObservabilityArizeDestinationTypeXaa945fac = when (value) {
      Arize.value -> Arize
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineObservabilityArizeDestinationTypeXaa945fac> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineObservabilityArizeDestinationTypeXaa945fac", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineObservabilityArizeDestinationTypeXaa945fac = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineObservabilityArizeDestinationTypeXaa945fac) {
      encoder.encodeString(value.value)
    }
  }
}
