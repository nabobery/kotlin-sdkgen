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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-edited/properties/issue/allOf/0/properties/per
 * formed_via_github_app/properties/owner/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-edited/properties/issue/allOf/0/properties/per
 * formed_via_github_app/properties/owner/properties/type
 */
@Serializable(with = InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppOwnerTypeX9a3e26a7.Serializer::class)
public sealed class InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppOwnerTypeX9a3e26a7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppOwnerTypeX9a3e26a7() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppOwnerTypeX9a3e26a7() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppOwnerTypeX9a3e26a7() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppOwnerTypeX9a3e26a7()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppOwnerTypeX9a3e26a7 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppOwnerTypeX9a3e26a7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppOwnerTypeX9a3e26a7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppOwnerTypeX9a3e26a7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppOwnerTypeX9a3e26a7) {
      encoder.encodeString(value.value)
    }
  }
}
