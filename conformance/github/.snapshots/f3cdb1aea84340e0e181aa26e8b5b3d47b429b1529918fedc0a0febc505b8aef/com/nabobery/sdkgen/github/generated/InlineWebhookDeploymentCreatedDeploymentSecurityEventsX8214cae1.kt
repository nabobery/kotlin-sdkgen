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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-created/properties/deployment/properties/performe
 * d_via_github_app/properties/permissions/properties/security_events.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-created/properties/deployment/properties/performe
 * d_via_github_app/properties/permissions/properties/security_events
 */
@Serializable(with = InlineWebhookDeploymentCreatedDeploymentSecurityEventsX8214cae1.Serializer::class)
public sealed class InlineWebhookDeploymentCreatedDeploymentSecurityEventsX8214cae1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookDeploymentCreatedDeploymentSecurityEventsX8214cae1() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookDeploymentCreatedDeploymentSecurityEventsX8214cae1() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDeploymentCreatedDeploymentSecurityEventsX8214cae1()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDeploymentCreatedDeploymentSecurityEventsX8214cae1 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookDeploymentCreatedDeploymentSecurityEventsX8214cae1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookDeploymentCreatedDeploymentSecurityEventsX8214cae1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentCreatedDeploymentSecurityEventsX8214cae1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentCreatedDeploymentSecurityEventsX8214cae1) {
      encoder.encodeString(value.value)
    }
  }
}
