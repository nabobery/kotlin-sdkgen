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
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityWebhookDestination/properties/config/properties/method.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityWebhookDestination/properties/config/properties/method
 */
@Serializable(with = InlineObservabilityWebhookDestinationConfigMethodXc1cc6f0b.Serializer::class)
public sealed class InlineObservabilityWebhookDestinationConfigMethodXc1cc6f0b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `POST`.
   */
  public data object Post : InlineObservabilityWebhookDestinationConfigMethodXc1cc6f0b() {
    public override val `value`: String = "POST"
  }

  /**
   * Documented value. Wire value: `PUT`.
   */
  public data object Put : InlineObservabilityWebhookDestinationConfigMethodXc1cc6f0b() {
    public override val `value`: String = "PUT"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineObservabilityWebhookDestinationConfigMethodXc1cc6f0b()

  public companion object {
    public fun fromValue(`value`: String): InlineObservabilityWebhookDestinationConfigMethodXc1cc6f0b = when (value) {
      Post.value -> Post
      Put.value -> Put
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineObservabilityWebhookDestinationConfigMethodXc1cc6f0b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineObservabilityWebhookDestinationConfigMethodXc1cc6f0b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineObservabilityWebhookDestinationConfigMethodXc1cc6f0b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineObservabilityWebhookDestinationConfigMethodXc1cc6f0b) {
      encoder.encodeString(value.value)
    }
  }
}
