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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-unpinned/properties/issue/allOf/0/properties/p
 * erformed_via_github_app/properties/permissions/properties/organization_hooks.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-unpinned/properties/issue/allOf/0/properties/p
 * erformed_via_github_app/properties/permissions/properties/organization_hooks
 */
@Serializable(with = InlineWebhookIssueCommentUe6d8IssueAllOf1OrganizationHooksX9b077ed8.Serializer::class)
public sealed class InlineWebhookIssueCommentUe6d8IssueAllOf1OrganizationHooksX9b077ed8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssueCommentUe6d8IssueAllOf1OrganizationHooksX9b077ed8() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssueCommentUe6d8IssueAllOf1OrganizationHooksX9b077ed8() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssueCommentUe6d8IssueAllOf1OrganizationHooksX9b077ed8()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssueCommentUe6d8IssueAllOf1OrganizationHooksX9b077ed8 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssueCommentUe6d8IssueAllOf1OrganizationHooksX9b077ed8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssueCommentUe6d8IssueAllOf1OrganizationHooksX9b077ed8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentUe6d8IssueAllOf1OrganizationHooksX9b077ed8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentUe6d8IssueAllOf1OrganizationHooksX9b077ed8) {
      encoder.encodeString(value.value)
    }
  }
}
