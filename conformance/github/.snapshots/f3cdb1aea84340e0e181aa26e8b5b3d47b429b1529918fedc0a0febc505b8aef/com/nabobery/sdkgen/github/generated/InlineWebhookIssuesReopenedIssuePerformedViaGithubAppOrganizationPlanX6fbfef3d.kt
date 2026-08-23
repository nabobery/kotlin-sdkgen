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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-reopened/properties/issue/properties/performed_via_gi
 * thub_app/properties/permissions/properties/organization_plan.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-reopened/properties/issue/properties/performed_via_gi
 * thub_app/properties/permissions/properties/organization_plan
 */
@Serializable(with = InlineWebhookIssuesReopenedIssuePerformedViaGithubAppOrganizationPlanX6fbfef3d.Serializer::class)
public sealed class InlineWebhookIssuesReopenedIssuePerformedViaGithubAppOrganizationPlanX6fbfef3d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesReopenedIssuePerformedViaGithubAppOrganizationPlanX6fbfef3d() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesReopenedIssuePerformedViaGithubAppOrganizationPlanX6fbfef3d() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesReopenedIssuePerformedViaGithubAppOrganizationPlanX6fbfef3d()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesReopenedIssuePerformedViaGithubAppOrganizationPlanX6fbfef3d = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesReopenedIssuePerformedViaGithubAppOrganizationPlanX6fbfef3d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesReopenedIssuePerformedViaGithubAppOrganizationPlanX6fbfef3d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesReopenedIssuePerformedViaGithubAppOrganizationPlanX6fbfef3d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesReopenedIssuePerformedViaGithubAppOrganizationPlanX6fbfef3d) {
      encoder.encodeString(value.value)
    }
  }
}
