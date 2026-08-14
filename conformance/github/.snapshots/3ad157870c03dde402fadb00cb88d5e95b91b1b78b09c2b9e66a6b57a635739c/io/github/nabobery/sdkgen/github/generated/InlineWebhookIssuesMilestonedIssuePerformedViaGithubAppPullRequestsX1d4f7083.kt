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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-milestoned/properties/issue/properties/performed_via_
 * github_app/properties/permissions/properties/pull_requests.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-milestoned/properties/issue/properties/performed_via_
 * github_app/properties/permissions/properties/pull_requests
 */
@Serializable(with = InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppPullRequestsX1d4f7083.Serializer::class)
public sealed class InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppPullRequestsX1d4f7083 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppPullRequestsX1d4f7083() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppPullRequestsX1d4f7083() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppPullRequestsX1d4f7083()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppPullRequestsX1d4f7083 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppPullRequestsX1d4f7083> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppPullRequestsX1d4f7083", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppPullRequestsX1d4f7083 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppPullRequestsX1d4f7083) {
      encoder.encodeString(value.value)
    }
  }
}
