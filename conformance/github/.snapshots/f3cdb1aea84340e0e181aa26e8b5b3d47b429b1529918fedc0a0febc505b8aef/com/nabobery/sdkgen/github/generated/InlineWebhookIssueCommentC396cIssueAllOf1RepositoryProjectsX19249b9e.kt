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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-created/properties/issue/allOf/0/properties/pe
 * rformed_via_github_app/properties/permissions/properties/repository_projects.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-created/properties/issue/allOf/0/properties/pe
 * rformed_via_github_app/properties/permissions/properties/repository_projects
 */
@Serializable(with = InlineWebhookIssueCommentC396cIssueAllOf1RepositoryProjectsX19249b9e.Serializer::class)
public sealed class InlineWebhookIssueCommentC396cIssueAllOf1RepositoryProjectsX19249b9e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssueCommentC396cIssueAllOf1RepositoryProjectsX19249b9e() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssueCommentC396cIssueAllOf1RepositoryProjectsX19249b9e() {
    public override val `value`: String = "write"
  }

  /**
   * Documented value. Wire value: `admin`.
   */
  public data object Admin : InlineWebhookIssueCommentC396cIssueAllOf1RepositoryProjectsX19249b9e() {
    public override val `value`: String = "admin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssueCommentC396cIssueAllOf1RepositoryProjectsX19249b9e()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssueCommentC396cIssueAllOf1RepositoryProjectsX19249b9e = when (value) {
      Read.value -> Read
      Write.value -> Write
      Admin.value -> Admin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssueCommentC396cIssueAllOf1RepositoryProjectsX19249b9e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssueCommentC396cIssueAllOf1RepositoryProjectsX19249b9e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentC396cIssueAllOf1RepositoryProjectsX19249b9e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentC396cIssueAllOf1RepositoryProjectsX19249b9e) {
      encoder.encodeString(value.value)
    }
  }
}
