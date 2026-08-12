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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-status-created/properties/deployment/properties/p
 * erformed_via_github_app/properties/permissions/properties/deployments.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-status-created/properties/deployment/properties/p
 * erformed_via_github_app/properties/permissions/properties/deployments
 */
@Serializable(with = InlineWebhookDeploymentSta5240DeploymentDeploymentsXe46020cb.Serializer::class)
public sealed class InlineWebhookDeploymentSta5240DeploymentDeploymentsXe46020cb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookDeploymentSta5240DeploymentDeploymentsXe46020cb() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookDeploymentSta5240DeploymentDeploymentsXe46020cb() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDeploymentSta5240DeploymentDeploymentsXe46020cb()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDeploymentSta5240DeploymentDeploymentsXe46020cb = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookDeploymentSta5240DeploymentDeploymentsXe46020cb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookDeploymentSta5240DeploymentDeploymentsXe46020cb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentSta5240DeploymentDeploymentsXe46020cb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentSta5240DeploymentDeploymentsXe46020cb) {
      encoder.encodeString(value.value)
    }
  }
}
