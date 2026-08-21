package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/parameters/webhook-delivery-status/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/components/parameters/webhook-delivery-status/schema
 */
@Serializable(with = InlineWebhookDeliveryStatusParameterX02ba252e.Serializer::class)
public sealed class InlineWebhookDeliveryStatusParameterX02ba252e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `success`.
   */
  public data object Success : InlineWebhookDeliveryStatusParameterX02ba252e() {
    public override val `value`: String = "success"
  }

  /**
   * Documented value. Wire value: `failure`.
   */
  public data object Failure : InlineWebhookDeliveryStatusParameterX02ba252e() {
    public override val `value`: String = "failure"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDeliveryStatusParameterX02ba252e()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDeliveryStatusParameterX02ba252e = when (value) {
      Success.value -> Success
      Failure.value -> Failure
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookDeliveryStatusParameterX02ba252e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookDeliveryStatusParameterX02ba252e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDeliveryStatusParameterX02ba252e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeliveryStatusParameterX02ba252e) {
      encoder.encodeString(value.value)
    }
  }
}
