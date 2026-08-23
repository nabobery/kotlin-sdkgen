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
 * hub_app/properties/permissions/properties/pull_requests.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-labeled/properties/issue/properties/performed_via_git
 * hub_app/properties/permissions/properties/pull_requests
 */
@Serializable(with = InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPullRequestsXde87f760.Serializer::class)
public sealed class InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPullRequestsXde87f760 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPullRequestsXde87f760() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPullRequestsXde87f760() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPullRequestsXde87f760()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPullRequestsXde87f760 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPullRequestsXde87f760> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPullRequestsXde87f760", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPullRequestsXde87f760 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPullRequestsXde87f760) {
      encoder.encodeString(value.value)
    }
  }
}
