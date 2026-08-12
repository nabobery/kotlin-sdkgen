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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-locked/properties/issue/properties/performed_via_gith
 * ub_app/properties/permissions/properties/deployments.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-locked/properties/issue/properties/performed_via_gith
 * ub_app/properties/permissions/properties/deployments
 */
@Serializable(with = InlineWebhookIssuesLockedIssuePerformedViaGithubAppDeploymentsX20a06d86.Serializer::class)
public sealed class InlineWebhookIssuesLockedIssuePerformedViaGithubAppDeploymentsX20a06d86 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesLockedIssuePerformedViaGithubAppDeploymentsX20a06d86() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesLockedIssuePerformedViaGithubAppDeploymentsX20a06d86() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesLockedIssuePerformedViaGithubAppDeploymentsX20a06d86()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesLockedIssuePerformedViaGithubAppDeploymentsX20a06d86 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesLockedIssuePerformedViaGithubAppDeploymentsX20a06d86> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesLockedIssuePerformedViaGithubAppDeploymentsX20a06d86", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesLockedIssuePerformedViaGithubAppDeploymentsX20a06d86 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesLockedIssuePerformedViaGithubAppDeploymentsX20a06d86) {
      encoder.encodeString(value.value)
    }
  }
}
