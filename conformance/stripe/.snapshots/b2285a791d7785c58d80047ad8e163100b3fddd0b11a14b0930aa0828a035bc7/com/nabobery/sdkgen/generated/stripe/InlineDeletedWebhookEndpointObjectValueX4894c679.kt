package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/deleted_webhook_endpoint/properties/object
 */
@Serializable(with = InlineDeletedWebhookEndpointObjectValueX4894c679.Serializer::class)
public sealed class InlineDeletedWebhookEndpointObjectValueX4894c679 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `webhook_endpoint`.
   */
  public data object WebhookEndpoint : InlineDeletedWebhookEndpointObjectValueX4894c679() {
    public override val `value`: String = "webhook_endpoint"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDeletedWebhookEndpointObjectValueX4894c679()

  public companion object {
    public fun fromValue(`value`: String): InlineDeletedWebhookEndpointObjectValueX4894c679 = when (value) {
      WebhookEndpoint.value -> WebhookEndpoint
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineDeletedWebhookEndpointObjectValueX4894c679> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineDeletedWebhookEndpointObjectValueX4894c679", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDeletedWebhookEndpointObjectValueX4894c679 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDeletedWebhookEndpointObjectValueX4894c679) {
      encoder.encodeString(value.value)
    }
  }
}
