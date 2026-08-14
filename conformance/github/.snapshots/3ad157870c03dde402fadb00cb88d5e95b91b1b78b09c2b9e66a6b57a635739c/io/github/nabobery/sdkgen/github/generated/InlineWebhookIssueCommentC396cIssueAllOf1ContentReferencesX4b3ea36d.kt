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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-created/properties/issue/allOf/0/properties/pe
 * rformed_via_github_app/properties/permissions/properties/content_references.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-created/properties/issue/allOf/0/properties/pe
 * rformed_via_github_app/properties/permissions/properties/content_references
 */
@Serializable(with = InlineWebhookIssueCommentC396cIssueAllOf1ContentReferencesX4b3ea36d.Serializer::class)
public sealed class InlineWebhookIssueCommentC396cIssueAllOf1ContentReferencesX4b3ea36d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssueCommentC396cIssueAllOf1ContentReferencesX4b3ea36d() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssueCommentC396cIssueAllOf1ContentReferencesX4b3ea36d() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssueCommentC396cIssueAllOf1ContentReferencesX4b3ea36d()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssueCommentC396cIssueAllOf1ContentReferencesX4b3ea36d = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssueCommentC396cIssueAllOf1ContentReferencesX4b3ea36d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssueCommentC396cIssueAllOf1ContentReferencesX4b3ea36d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentC396cIssueAllOf1ContentReferencesX4b3ea36d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentC396cIssueAllOf1ContentReferencesX4b3ea36d) {
      encoder.encodeString(value.value)
    }
  }
}
