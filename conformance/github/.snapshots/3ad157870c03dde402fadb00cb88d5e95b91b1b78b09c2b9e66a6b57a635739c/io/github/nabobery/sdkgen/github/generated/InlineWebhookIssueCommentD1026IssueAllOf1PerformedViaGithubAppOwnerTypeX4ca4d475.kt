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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-deleted/properties/issue/allOf/0/properties/pe
 * rformed_via_github_app/properties/owner/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-deleted/properties/issue/allOf/0/properties/pe
 * rformed_via_github_app/properties/owner/properties/type
 */
@Serializable(with = InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppOwnerTypeX4ca4d475.Serializer::class)
public sealed class InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppOwnerTypeX4ca4d475 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppOwnerTypeX4ca4d475() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppOwnerTypeX4ca4d475() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppOwnerTypeX4ca4d475() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppOwnerTypeX4ca4d475()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppOwnerTypeX4ca4d475 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppOwnerTypeX4ca4d475> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppOwnerTypeX4ca4d475", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppOwnerTypeX4ca4d475 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppOwnerTypeX4ca4d475) {
      encoder.encodeString(value.value)
    }
  }
}
