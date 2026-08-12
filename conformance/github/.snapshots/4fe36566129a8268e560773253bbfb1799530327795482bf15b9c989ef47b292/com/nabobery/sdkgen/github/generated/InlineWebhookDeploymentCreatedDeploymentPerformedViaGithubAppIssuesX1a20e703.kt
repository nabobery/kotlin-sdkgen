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
 * d_via_github_app/properties/permissions/properties/issues.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-created/properties/deployment/properties/performe
 * d_via_github_app/properties/permissions/properties/issues
 */
@Serializable(with = InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppIssuesX1a20e703.Serializer::class)
public sealed class InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppIssuesX1a20e703 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppIssuesX1a20e703() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppIssuesX1a20e703() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppIssuesX1a20e703()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppIssuesX1a20e703 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppIssuesX1a20e703> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppIssuesX1a20e703", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppIssuesX1a20e703 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppIssuesX1a20e703) {
      encoder.encodeString(value.value)
    }
  }
}
