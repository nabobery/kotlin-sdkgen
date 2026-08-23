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
 * ub_app/properties/permissions/properties/packages.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-edited/properties/issue/properties/performed_via_gith
 * ub_app/properties/permissions/properties/packages
 */
@Serializable(with = InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsPackagesX7e7c9d9f.Serializer::class)
public sealed class InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsPackagesX7e7c9d9f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsPackagesX7e7c9d9f() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsPackagesX7e7c9d9f() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsPackagesX7e7c9d9f()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsPackagesX7e7c9d9f = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsPackagesX7e7c9d9f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsPackagesX7e7c9d9f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsPackagesX7e7c9d9f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsPackagesX7e7c9d9f) {
      encoder.encodeString(value.value)
    }
  }
}
