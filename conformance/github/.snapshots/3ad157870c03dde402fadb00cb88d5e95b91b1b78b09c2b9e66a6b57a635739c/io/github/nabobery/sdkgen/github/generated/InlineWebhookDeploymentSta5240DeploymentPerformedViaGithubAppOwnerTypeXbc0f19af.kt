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
 * erformed_via_github_app/properties/owner/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-status-created/properties/deployment/properties/p
 * erformed_via_github_app/properties/owner/properties/type
 */
@Serializable(with = InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppOwnerTypeXbc0f19af.Serializer::class)
public sealed class InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppOwnerTypeXbc0f19af {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppOwnerTypeXbc0f19af() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppOwnerTypeXbc0f19af() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppOwnerTypeXbc0f19af() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppOwnerTypeXbc0f19af()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppOwnerTypeXbc0f19af = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppOwnerTypeXbc0f19af> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppOwnerTypeXbc0f19af", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppOwnerTypeXbc0f19af = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppOwnerTypeXbc0f19af) {
      encoder.encodeString(value.value)
    }
  }
}
