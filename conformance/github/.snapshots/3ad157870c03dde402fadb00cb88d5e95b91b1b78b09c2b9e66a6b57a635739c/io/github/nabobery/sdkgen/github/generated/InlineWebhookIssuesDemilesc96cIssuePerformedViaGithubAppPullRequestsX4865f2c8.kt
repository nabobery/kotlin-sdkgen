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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-demilestoned/properties/issue/properties/performed_vi
 * a_github_app/properties/permissions/properties/pull_requests.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-demilestoned/properties/issue/properties/performed_vi
 * a_github_app/properties/permissions/properties/pull_requests
 */
@Serializable(with = InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppPullRequestsX4865f2c8.Serializer::class)
public sealed class InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppPullRequestsX4865f2c8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppPullRequestsX4865f2c8() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppPullRequestsX4865f2c8() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppPullRequestsX4865f2c8()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppPullRequestsX4865f2c8 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppPullRequestsX4865f2c8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppPullRequestsX4865f2c8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppPullRequestsX4865f2c8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppPullRequestsX4865f2c8) {
      encoder.encodeString(value.value)
    }
  }
}
