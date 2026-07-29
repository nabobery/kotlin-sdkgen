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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-status-created/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-status-created/properties/action
 */
@Serializable(with = InlineWebhookDeploymentStatusCreatedActionXe8c7cce4.Serializer::class)
public sealed class InlineWebhookDeploymentStatusCreatedActionXe8c7cce4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineWebhookDeploymentStatusCreatedActionXe8c7cce4() {
    public override val `value`: String = "created"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDeploymentStatusCreatedActionXe8c7cce4()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDeploymentStatusCreatedActionXe8c7cce4 = when (value) {
      Created.value -> Created
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookDeploymentStatusCreatedActionXe8c7cce4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookDeploymentStatusCreatedActionXe8c7cce4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentStatusCreatedActionXe8c7cce4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentStatusCreatedActionXe8c7cce4) {
      encoder.encodeString(value.value)
    }
  }
}
