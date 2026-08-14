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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-locked/properties/issue/properties/performed_via_gith
 * ub_app/properties/permissions/properties/pull_requests.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-locked/properties/issue/properties/performed_via_gith
 * ub_app/properties/permissions/properties/pull_requests
 */
@Serializable(with = InlineWebhookIssuesLockedIssuePerformedViaGithubAppPullRequestsX1162a2d3.Serializer::class)
public sealed class InlineWebhookIssuesLockedIssuePerformedViaGithubAppPullRequestsX1162a2d3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesLockedIssuePerformedViaGithubAppPullRequestsX1162a2d3() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesLockedIssuePerformedViaGithubAppPullRequestsX1162a2d3() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesLockedIssuePerformedViaGithubAppPullRequestsX1162a2d3()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesLockedIssuePerformedViaGithubAppPullRequestsX1162a2d3 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesLockedIssuePerformedViaGithubAppPullRequestsX1162a2d3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesLockedIssuePerformedViaGithubAppPullRequestsX1162a2d3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesLockedIssuePerformedViaGithubAppPullRequestsX1162a2d3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesLockedIssuePerformedViaGithubAppPullRequestsX1162a2d3) {
      encoder.encodeString(value.value)
    }
  }
}
