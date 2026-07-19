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
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityWebhookDestination/properties/type.
 */
@Serializable(with = InlineComponentsSchemasObservabilityWebhookDestinationPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasObservabilityWebhookDestinationPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `webhook`.
   */
  public data object Webhook : InlineComponentsSchemasObservabilityWebhookDestinationPropertiesType() {
    public override val `value`: String = "webhook"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasObservabilityWebhookDestinationPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasObservabilityWebhookDestinationPropertiesType =
      when (value) {
      Webhook.value -> Webhook
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasObservabilityWebhookDestinationPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasObservabilityWebhookDestinationPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasObservabilityWebhookDestinationPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasObservabilityWebhookDestinationPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
