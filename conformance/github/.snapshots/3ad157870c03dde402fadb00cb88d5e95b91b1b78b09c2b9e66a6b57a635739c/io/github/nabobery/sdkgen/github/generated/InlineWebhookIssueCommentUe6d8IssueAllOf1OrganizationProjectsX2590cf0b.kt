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
 * erformed_via_github_app/properties/permissions/properties/organization_projects.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-unpinned/properties/issue/allOf/0/properties/p
 * erformed_via_github_app/properties/permissions/properties/organization_projects
 */
@Serializable(with = InlineWebhookIssueCommentUe6d8IssueAllOf1OrganizationProjectsX2590cf0b.Serializer::class)
public sealed class InlineWebhookIssueCommentUe6d8IssueAllOf1OrganizationProjectsX2590cf0b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssueCommentUe6d8IssueAllOf1OrganizationProjectsX2590cf0b() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssueCommentUe6d8IssueAllOf1OrganizationProjectsX2590cf0b() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssueCommentUe6d8IssueAllOf1OrganizationProjectsX2590cf0b()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssueCommentUe6d8IssueAllOf1OrganizationProjectsX2590cf0b = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssueCommentUe6d8IssueAllOf1OrganizationProjectsX2590cf0b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssueCommentUe6d8IssueAllOf1OrganizationProjectsX2590cf0b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentUe6d8IssueAllOf1OrganizationProjectsX2590cf0b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentUe6d8IssueAllOf1OrganizationProjectsX2590cf0b) {
      encoder.encodeString(value.value)
    }
  }
}
