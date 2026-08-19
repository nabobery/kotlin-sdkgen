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
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityPosthogDestination/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ObservabilityPosthogDestination/properties/type
 */
@Serializable(with = InlineObservabilityPosthogDestinationTypeXecda09da.Serializer::class)
public sealed class InlineObservabilityPosthogDestinationTypeXecda09da {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `posthog`.
   */
  public data object Posthog : InlineObservabilityPosthogDestinationTypeXecda09da() {
    public override val `value`: String = "posthog"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineObservabilityPosthogDestinationTypeXecda09da()

  public companion object {
    public fun fromValue(`value`: String): InlineObservabilityPosthogDestinationTypeXecda09da = when (value) {
      Posthog.value -> Posthog
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineObservabilityPosthogDestinationTypeXecda09da> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineObservabilityPosthogDestinationTypeXecda09da", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineObservabilityPosthogDestinationTypeXecda09da = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineObservabilityPosthogDestinationTypeXecda09da) {
      encoder.encodeString(value.value)
    }
  }
}
