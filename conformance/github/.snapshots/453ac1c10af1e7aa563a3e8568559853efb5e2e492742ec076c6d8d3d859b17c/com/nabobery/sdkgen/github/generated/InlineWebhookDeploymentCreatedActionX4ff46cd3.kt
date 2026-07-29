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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-created/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-created/properties/action
 */
@Serializable(with = InlineWebhookDeploymentCreatedActionX4ff46cd3.Serializer::class)
public sealed class InlineWebhookDeploymentCreatedActionX4ff46cd3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineWebhookDeploymentCreatedActionX4ff46cd3() {
    public override val `value`: String = "created"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDeploymentCreatedActionX4ff46cd3()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDeploymentCreatedActionX4ff46cd3 = when (value) {
      Created.value -> Created
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookDeploymentCreatedActionX4ff46cd3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookDeploymentCreatedActionX4ff46cd3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentCreatedActionX4ff46cd3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentCreatedActionX4ff46cd3) {
      encoder.encodeString(value.value)
    }
  }
}
