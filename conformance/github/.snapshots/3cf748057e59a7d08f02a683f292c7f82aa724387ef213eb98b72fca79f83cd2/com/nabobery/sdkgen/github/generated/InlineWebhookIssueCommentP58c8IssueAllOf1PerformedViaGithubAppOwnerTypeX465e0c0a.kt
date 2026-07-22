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
 * formed_via_github_app/properties/owner/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-pinned/properties/issue/allOf/0/properties/per
 * formed_via_github_app/properties/owner/properties/type
 */
@Serializable(with = InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppOwnerTypeX465e0c0a.Serializer::class)
public sealed class InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppOwnerTypeX465e0c0a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppOwnerTypeX465e0c0a() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppOwnerTypeX465e0c0a() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppOwnerTypeX465e0c0a() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppOwnerTypeX465e0c0a()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppOwnerTypeX465e0c0a = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppOwnerTypeX465e0c0a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppOwnerTypeX465e0c0a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppOwnerTypeX465e0c0a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppOwnerTypeX465e0c0a) {
      encoder.encodeString(value.value)
    }
  }
}
