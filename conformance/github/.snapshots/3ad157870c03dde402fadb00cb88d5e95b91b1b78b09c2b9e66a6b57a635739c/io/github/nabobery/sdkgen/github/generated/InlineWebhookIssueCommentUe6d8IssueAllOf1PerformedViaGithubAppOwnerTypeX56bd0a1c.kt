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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-unpinned/properties/issue/allOf/0/properties/p
 * erformed_via_github_app/properties/owner/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-unpinned/properties/issue/allOf/0/properties/p
 * erformed_via_github_app/properties/owner/properties/type
 */
@Serializable(with = InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppOwnerTypeX56bd0a1c.Serializer::class)
public sealed class InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppOwnerTypeX56bd0a1c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppOwnerTypeX56bd0a1c() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppOwnerTypeX56bd0a1c() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppOwnerTypeX56bd0a1c() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppOwnerTypeX56bd0a1c()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppOwnerTypeX56bd0a1c = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppOwnerTypeX56bd0a1c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppOwnerTypeX56bd0a1c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppOwnerTypeX56bd0a1c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppOwnerTypeX56bd0a1c) {
      encoder.encodeString(value.value)
    }
  }
}
