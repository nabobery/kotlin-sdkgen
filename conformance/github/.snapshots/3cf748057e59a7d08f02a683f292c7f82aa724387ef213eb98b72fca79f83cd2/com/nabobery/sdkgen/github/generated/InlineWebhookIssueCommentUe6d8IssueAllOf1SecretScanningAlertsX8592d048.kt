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
 * erformed_via_github_app/properties/permissions/properties/secret_scanning_alerts.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-unpinned/properties/issue/allOf/0/properties/p
 * erformed_via_github_app/properties/permissions/properties/secret_scanning_alerts
 */
@Serializable(with = InlineWebhookIssueCommentUe6d8IssueAllOf1SecretScanningAlertsX8592d048.Serializer::class)
public sealed class InlineWebhookIssueCommentUe6d8IssueAllOf1SecretScanningAlertsX8592d048 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssueCommentUe6d8IssueAllOf1SecretScanningAlertsX8592d048() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssueCommentUe6d8IssueAllOf1SecretScanningAlertsX8592d048() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssueCommentUe6d8IssueAllOf1SecretScanningAlertsX8592d048()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssueCommentUe6d8IssueAllOf1SecretScanningAlertsX8592d048 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookIssueCommentUe6d8IssueAllOf1SecretScanningAlertsX8592d048> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssueCommentUe6d8IssueAllOf1SecretScanningAlertsX8592d048", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentUe6d8IssueAllOf1SecretScanningAlertsX8592d048 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentUe6d8IssueAllOf1SecretScanningAlertsX8592d048) {
      encoder.encodeString(value.value)
    }
  }
}
