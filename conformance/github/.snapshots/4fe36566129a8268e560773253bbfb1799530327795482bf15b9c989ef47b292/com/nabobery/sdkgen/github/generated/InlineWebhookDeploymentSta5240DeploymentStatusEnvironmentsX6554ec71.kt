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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-status-created/properties/deployment_status/prope
 * rties/performed_via_github_app/properties/permissions/properties/environments.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-status-created/properties/deployment_status/prope
 * rties/performed_via_github_app/properties/permissions/properties/environments
 */
@Serializable(with = InlineWebhookDeploymentSta5240DeploymentStatusEnvironmentsX6554ec71.Serializer::class)
public sealed class InlineWebhookDeploymentSta5240DeploymentStatusEnvironmentsX6554ec71 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookDeploymentSta5240DeploymentStatusEnvironmentsX6554ec71() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookDeploymentSta5240DeploymentStatusEnvironmentsX6554ec71() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDeploymentSta5240DeploymentStatusEnvironmentsX6554ec71()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDeploymentSta5240DeploymentStatusEnvironmentsX6554ec71 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookDeploymentSta5240DeploymentStatusEnvironmentsX6554ec71> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookDeploymentSta5240DeploymentStatusEnvironmentsX6554ec71", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentSta5240DeploymentStatusEnvironmentsX6554ec71 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentSta5240DeploymentStatusEnvironmentsX6554ec71) {
      encoder.encodeString(value.value)
    }
  }
}
