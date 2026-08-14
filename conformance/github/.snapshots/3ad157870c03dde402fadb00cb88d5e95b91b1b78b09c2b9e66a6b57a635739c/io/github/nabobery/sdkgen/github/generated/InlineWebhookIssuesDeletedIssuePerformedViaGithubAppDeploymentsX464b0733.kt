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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-deleted/properties/issue/properties/performed_via_git
 * hub_app/properties/permissions/properties/deployments.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-deleted/properties/issue/properties/performed_via_git
 * hub_app/properties/permissions/properties/deployments
 */
@Serializable(with = InlineWebhookIssuesDeletedIssuePerformedViaGithubAppDeploymentsX464b0733.Serializer::class)
public sealed class InlineWebhookIssuesDeletedIssuePerformedViaGithubAppDeploymentsX464b0733 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesDeletedIssuePerformedViaGithubAppDeploymentsX464b0733() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesDeletedIssuePerformedViaGithubAppDeploymentsX464b0733() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesDeletedIssuePerformedViaGithubAppDeploymentsX464b0733()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesDeletedIssuePerformedViaGithubAppDeploymentsX464b0733 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesDeletedIssuePerformedViaGithubAppDeploymentsX464b0733> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesDeletedIssuePerformedViaGithubAppDeploymentsX464b0733", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesDeletedIssuePerformedViaGithubAppDeploymentsX464b0733 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesDeletedIssuePerformedViaGithubAppDeploymentsX464b0733) {
      encoder.encodeString(value.value)
    }
  }
}
