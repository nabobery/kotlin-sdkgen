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
 * rformed_via_github_app/properties/permissions/properties/keys.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-deleted/properties/issue/allOf/0/properties/pe
 * rformed_via_github_app/properties/permissions/properties/keys
 */
@Serializable(with = InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppKeysXc5bfc85b.Serializer::class)
public sealed class InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppKeysXc5bfc85b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppKeysXc5bfc85b() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppKeysXc5bfc85b() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppKeysXc5bfc85b()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppKeysXc5bfc85b = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppKeysXc5bfc85b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppKeysXc5bfc85b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppKeysXc5bfc85b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppKeysXc5bfc85b) {
      encoder.encodeString(value.value)
    }
  }
}
