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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-demilestoned/properties/issue/properties/performed_vi
 * a_github_app/properties/permissions/properties/emails.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-demilestoned/properties/issue/properties/performed_vi
 * a_github_app/properties/permissions/properties/emails
 */
@Serializable(with = InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppEmailsXed67d755.Serializer::class)
public sealed class InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppEmailsXed67d755 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppEmailsXed67d755() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppEmailsXed67d755() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppEmailsXed67d755()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppEmailsXed67d755 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppEmailsXed67d755> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppEmailsXed67d755", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppEmailsXed67d755 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppEmailsXed67d755) {
      encoder.encodeString(value.value)
    }
  }
}
