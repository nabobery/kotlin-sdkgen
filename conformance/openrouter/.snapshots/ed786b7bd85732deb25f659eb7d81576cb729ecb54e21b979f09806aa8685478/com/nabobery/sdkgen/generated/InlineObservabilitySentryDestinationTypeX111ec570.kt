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
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilitySentryDestination/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ObservabilitySentryDestination/properties/type
 */
@Serializable(with = InlineObservabilitySentryDestinationTypeX111ec570.Serializer::class)
public sealed class InlineObservabilitySentryDestinationTypeX111ec570 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `sentry`.
   */
  public data object Sentry : InlineObservabilitySentryDestinationTypeX111ec570() {
    public override val `value`: String = "sentry"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineObservabilitySentryDestinationTypeX111ec570()

  public companion object {
    public fun fromValue(`value`: String): InlineObservabilitySentryDestinationTypeX111ec570 = when (value) {
      Sentry.value -> Sentry
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineObservabilitySentryDestinationTypeX111ec570> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineObservabilitySentryDestinationTypeX111ec570", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineObservabilitySentryDestinationTypeX111ec570 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineObservabilitySentryDestinationTypeX111ec570) {
      encoder.encodeString(value.value)
    }
  }
}
