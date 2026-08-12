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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-edited/properties/issue/properties/performed_via_gith
 * ub_app/properties/permissions/properties/organization_packages.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-edited/properties/issue/properties/performed_via_gith
 * ub_app/properties/permissions/properties/organization_packages
 */
@Serializable(with = InlineWebhookIssuesEditedIssuePerformedViaGithubAppOrganizationPackagesX9b17944b.Serializer::class)
public sealed class InlineWebhookIssuesEditedIssuePerformedViaGithubAppOrganizationPackagesX9b17944b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesEditedIssuePerformedViaGithubAppOrganizationPackagesX9b17944b() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesEditedIssuePerformedViaGithubAppOrganizationPackagesX9b17944b() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesEditedIssuePerformedViaGithubAppOrganizationPackagesX9b17944b()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesEditedIssuePerformedViaGithubAppOrganizationPackagesX9b17944b = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesEditedIssuePerformedViaGithubAppOrganizationPackagesX9b17944b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesEditedIssuePerformedViaGithubAppOrganizationPackagesX9b17944b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesEditedIssuePerformedViaGithubAppOrganizationPackagesX9b17944b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesEditedIssuePerformedViaGithubAppOrganizationPackagesX9b17944b) {
      encoder.encodeString(value.value)
    }
  }
}
