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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-opened/properties/issue/properties/performed_via_gith
 * ub_app/properties/permissions/properties/pull_requests.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-opened/properties/issue/properties/performed_via_gith
 * ub_app/properties/permissions/properties/pull_requests
 */
@Serializable(with = InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPullRequestsX602156da.Serializer::class)
public sealed class InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPullRequestsX602156da {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPullRequestsX602156da() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPullRequestsX602156da() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPullRequestsX602156da()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPullRequestsX602156da = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPullRequestsX602156da> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPullRequestsX602156da", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPullRequestsX602156da = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPullRequestsX602156da) {
      encoder.encodeString(value.value)
    }
  }
}
