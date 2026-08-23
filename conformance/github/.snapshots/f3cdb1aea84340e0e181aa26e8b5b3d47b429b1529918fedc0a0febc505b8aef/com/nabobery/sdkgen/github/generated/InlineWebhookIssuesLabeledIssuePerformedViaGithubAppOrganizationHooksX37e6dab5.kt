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
 * hub_app/properties/permissions/properties/organization_hooks.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-labeled/properties/issue/properties/performed_via_git
 * hub_app/properties/permissions/properties/organization_hooks
 */
@Serializable(with = InlineWebhookIssuesLabeledIssuePerformedViaGithubAppOrganizationHooksX37e6dab5.Serializer::class)
public sealed class InlineWebhookIssuesLabeledIssuePerformedViaGithubAppOrganizationHooksX37e6dab5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppOrganizationHooksX37e6dab5() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppOrganizationHooksX37e6dab5() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppOrganizationHooksX37e6dab5()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesLabeledIssuePerformedViaGithubAppOrganizationHooksX37e6dab5 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesLabeledIssuePerformedViaGithubAppOrganizationHooksX37e6dab5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesLabeledIssuePerformedViaGithubAppOrganizationHooksX37e6dab5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesLabeledIssuePerformedViaGithubAppOrganizationHooksX37e6dab5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesLabeledIssuePerformedViaGithubAppOrganizationHooksX37e6dab5) {
      encoder.encodeString(value.value)
    }
  }
}
