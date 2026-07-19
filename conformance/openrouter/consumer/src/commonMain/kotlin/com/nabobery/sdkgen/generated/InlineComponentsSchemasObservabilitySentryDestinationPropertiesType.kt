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
 */
@Serializable(with = InlineComponentsSchemasObservabilitySentryDestinationPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasObservabilitySentryDestinationPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `sentry`.
   */
  public data object Sentry : InlineComponentsSchemasObservabilitySentryDestinationPropertiesType() {
    public override val `value`: String = "sentry"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasObservabilitySentryDestinationPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasObservabilitySentryDestinationPropertiesType =
      when (value) {
      Sentry.value -> Sentry
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasObservabilitySentryDestinationPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasObservabilitySentryDestinationPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasObservabilitySentryDestinationPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasObservabilitySentryDestinationPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
