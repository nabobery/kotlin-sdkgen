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
 */
@Serializable(with = InlineComponentsSchemasObservabilityWebhookDestinationPropertiesConfigPropertiesMethod
  .Serializer::class)
public sealed class InlineComponentsSchemasObservabilityWebhookDestinationPropertiesConfigPropertiesMethod {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `POST`.
   */
  public data object Post : InlineComponentsSchemasObservabilityWebhookDestinationPropertiesConfigPropertiesMethod() {
    public override val `value`: String = "POST"
  }

  /**
   * Documented value. Wire value: `PUT`.
   */
  public data object Put : InlineComponentsSchemasObservabilityWebhookDestinationPropertiesConfigPropertiesMethod() {
    public override val `value`: String = "PUT"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasObservabilityWebhookDestinationPropertiesConfigPropertiesMethod()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasObservabilityWebhookDestinationPropertiesConfigPropertiesMethod = when (value) {
      Post.value -> Post
      Put.value -> Put
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasObservabilityWebhookDestinationPropertiesConfigPropertiesMethod> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasObservabilityWebhookDestinationPropertiesConfigPropertiesMethod", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasObservabilityWebhookDestinationPropertiesConfigPropertiesMethod = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasObservabilityWebhookDestinationPropertiesConfigPropertiesMethod) {
      encoder.encodeString(value.value)
    }
  }
}
