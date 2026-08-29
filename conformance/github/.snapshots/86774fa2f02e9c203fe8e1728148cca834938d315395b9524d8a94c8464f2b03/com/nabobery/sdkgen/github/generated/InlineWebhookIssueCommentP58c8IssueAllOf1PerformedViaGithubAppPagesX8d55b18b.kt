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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-pinned/properties/issue/allOf/0/properties/per
 * formed_via_github_app/properties/permissions/properties/pages.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-pinned/properties/issue/allOf/0/properties/per
 * formed_via_github_app/properties/permissions/properties/pages
 */
@Serializable(with = InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppPagesX8d55b18b.Serializer::class)
public sealed class InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppPagesX8d55b18b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppPagesX8d55b18b() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppPagesX8d55b18b() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppPagesX8d55b18b()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppPagesX8d55b18b = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppPagesX8d55b18b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppPagesX8d55b18b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppPagesX8d55b18b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppPagesX8d55b18b) {
      encoder.encodeString(value.value)
    }
  }
}
