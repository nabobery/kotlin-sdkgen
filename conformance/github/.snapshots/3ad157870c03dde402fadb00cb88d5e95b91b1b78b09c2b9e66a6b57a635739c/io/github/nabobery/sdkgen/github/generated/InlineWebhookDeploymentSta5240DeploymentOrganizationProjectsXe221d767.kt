package io.github.nabobery.sdkgen.github.generated

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
 * erformed_via_github_app/properties/permissions/properties/organization_projects.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-status-created/properties/deployment/properties/p
 * erformed_via_github_app/properties/permissions/properties/organization_projects
 */
@Serializable(with = InlineWebhookDeploymentSta5240DeploymentOrganizationProjectsXe221d767.Serializer::class)
public sealed class InlineWebhookDeploymentSta5240DeploymentOrganizationProjectsXe221d767 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookDeploymentSta5240DeploymentOrganizationProjectsXe221d767() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookDeploymentSta5240DeploymentOrganizationProjectsXe221d767() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDeploymentSta5240DeploymentOrganizationProjectsXe221d767()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDeploymentSta5240DeploymentOrganizationProjectsXe221d767 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookDeploymentSta5240DeploymentOrganizationProjectsXe221d767> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookDeploymentSta5240DeploymentOrganizationProjectsXe221d767", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentSta5240DeploymentOrganizationProjectsXe221d767 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentSta5240DeploymentOrganizationProjectsXe221d767) {
      encoder.encodeString(value.value)
    }
  }
}
