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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ObservabilityWebhookDestination/properties/type
 */
@Serializable(with = InlineObservabilityWebhookDestinationTypeX8453f751.Serializer::class)
public sealed class InlineObservabilityWebhookDestinationTypeX8453f751 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `webhook`.
   */
  public data object Webhook : InlineObservabilityWebhookDestinationTypeX8453f751() {
    public override val `value`: String = "webhook"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineObservabilityWebhookDestinationTypeX8453f751()

  public companion object {
    public fun fromValue(`value`: String): InlineObservabilityWebhookDestinationTypeX8453f751 = when (value) {
      Webhook.value -> Webhook
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineObservabilityWebhookDestinationTypeX8453f751> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineObservabilityWebhookDestinationTypeX8453f751", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineObservabilityWebhookDestinationTypeX8453f751 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineObservabilityWebhookDestinationTypeX8453f751) {
      encoder.encodeString(value.value)
    }
  }
}
