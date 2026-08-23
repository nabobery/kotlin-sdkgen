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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-opened/properties/issue/properties/performed_via_gith
 * ub_app/properties/permissions/properties/emails.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-opened/properties/issue/properties/performed_via_gith
 * ub_app/properties/permissions/properties/emails
 */
@Serializable(with = InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsEmailsXf65e21f7.Serializer::class)
public sealed class InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsEmailsXf65e21f7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsEmailsXf65e21f7() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsEmailsXf65e21f7() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsEmailsXf65e21f7()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsEmailsXf65e21f7 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsEmailsXf65e21f7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsEmailsXf65e21f7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsEmailsXf65e21f7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsEmailsXf65e21f7) {
      encoder.encodeString(value.value)
    }
  }
}
