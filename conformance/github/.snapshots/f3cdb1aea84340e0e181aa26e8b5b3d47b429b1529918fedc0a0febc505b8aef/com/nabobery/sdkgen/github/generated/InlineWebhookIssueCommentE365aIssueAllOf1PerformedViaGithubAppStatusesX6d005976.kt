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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-edited/properties/issue/allOf/0/properties/per
 * formed_via_github_app/properties/permissions/properties/statuses.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-edited/properties/issue/allOf/0/properties/per
 * formed_via_github_app/properties/permissions/properties/statuses
 */
@Serializable(with = InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppStatusesX6d005976.Serializer::class)
public sealed class InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppStatusesX6d005976 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppStatusesX6d005976() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppStatusesX6d005976() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppStatusesX6d005976()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppStatusesX6d005976 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppStatusesX6d005976> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppStatusesX6d005976", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppStatusesX6d005976 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppStatusesX6d005976) {
      encoder.encodeString(value.value)
    }
  }
}
