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
 * ub_app/properties/permissions/properties/issues.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-opened/properties/issue/properties/performed_via_gith
 * ub_app/properties/permissions/properties/issues
 */
@Serializable(with = InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsIssuesX2626e631.Serializer::class)
public sealed class InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsIssuesX2626e631 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsIssuesX2626e631() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsIssuesX2626e631() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsIssuesX2626e631()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsIssuesX2626e631 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsIssuesX2626e631> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsIssuesX2626e631", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsIssuesX2626e631 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsIssuesX2626e631) {
      encoder.encodeString(value.value)
    }
  }
}
