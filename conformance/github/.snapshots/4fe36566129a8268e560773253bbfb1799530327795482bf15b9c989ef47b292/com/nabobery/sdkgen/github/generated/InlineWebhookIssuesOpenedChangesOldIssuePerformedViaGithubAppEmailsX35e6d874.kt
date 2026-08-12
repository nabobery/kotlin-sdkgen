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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-opened/properties/changes/properties/old_issue/proper
 * ties/performed_via_github_app/properties/permissions/properties/emails.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-opened/properties/changes/properties/old_issue/proper
 * ties/performed_via_github_app/properties/permissions/properties/emails
 */
@Serializable(with = InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppEmailsX35e6d874.Serializer::class)
public sealed class InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppEmailsX35e6d874 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppEmailsX35e6d874() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppEmailsX35e6d874() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppEmailsX35e6d874()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppEmailsX35e6d874 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppEmailsX35e6d874> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppEmailsX35e6d874", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppEmailsX35e6d874 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppEmailsX35e6d874) {
      encoder.encodeString(value.value)
    }
  }
}
