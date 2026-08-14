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
 * erformed_via_github_app/properties/permissions/properties/team_discussions.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-unpinned/properties/issue/allOf/0/properties/p
 * erformed_via_github_app/properties/permissions/properties/team_discussions
 */
@Serializable(with = InlineWebhookIssueCommentUe6d8IssueAllOf1TeamDiscussionsXd4d35dbc.Serializer::class)
public sealed class InlineWebhookIssueCommentUe6d8IssueAllOf1TeamDiscussionsXd4d35dbc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssueCommentUe6d8IssueAllOf1TeamDiscussionsXd4d35dbc() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssueCommentUe6d8IssueAllOf1TeamDiscussionsXd4d35dbc() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssueCommentUe6d8IssueAllOf1TeamDiscussionsXd4d35dbc()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssueCommentUe6d8IssueAllOf1TeamDiscussionsXd4d35dbc = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssueCommentUe6d8IssueAllOf1TeamDiscussionsXd4d35dbc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssueCommentUe6d8IssueAllOf1TeamDiscussionsXd4d35dbc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentUe6d8IssueAllOf1TeamDiscussionsXd4d35dbc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentUe6d8IssueAllOf1TeamDiscussionsXd4d35dbc) {
      encoder.encodeString(value.value)
    }
  }
}
