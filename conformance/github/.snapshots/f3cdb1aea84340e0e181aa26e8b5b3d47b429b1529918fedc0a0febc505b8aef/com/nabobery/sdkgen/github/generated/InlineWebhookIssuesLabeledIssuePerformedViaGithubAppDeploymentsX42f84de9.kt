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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-labeled/properties/issue/properties/performed_via_git
 * hub_app/properties/permissions/properties/deployments.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-labeled/properties/issue/properties/performed_via_git
 * hub_app/properties/permissions/properties/deployments
 */
@Serializable(with = InlineWebhookIssuesLabeledIssuePerformedViaGithubAppDeploymentsX42f84de9.Serializer::class)
public sealed class InlineWebhookIssuesLabeledIssuePerformedViaGithubAppDeploymentsX42f84de9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppDeploymentsX42f84de9() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppDeploymentsX42f84de9() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppDeploymentsX42f84de9()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesLabeledIssuePerformedViaGithubAppDeploymentsX42f84de9 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesLabeledIssuePerformedViaGithubAppDeploymentsX42f84de9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesLabeledIssuePerformedViaGithubAppDeploymentsX42f84de9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesLabeledIssuePerformedViaGithubAppDeploymentsX42f84de9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesLabeledIssuePerformedViaGithubAppDeploymentsX42f84de9) {
      encoder.encodeString(value.value)
    }
  }
}
