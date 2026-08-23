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
 * ub_app/properties/permissions/properties/checks.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-edited/properties/issue/properties/performed_via_gith
 * ub_app/properties/permissions/properties/checks
 */
@Serializable(with = InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsChecksXb724a20e.Serializer::class)
public sealed class InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsChecksXb724a20e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsChecksXb724a20e() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsChecksXb724a20e() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsChecksXb724a20e()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsChecksXb724a20e = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsChecksXb724a20e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsChecksXb724a20e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsChecksXb724a20e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsChecksXb724a20e) {
      encoder.encodeString(value.value)
    }
  }
}
