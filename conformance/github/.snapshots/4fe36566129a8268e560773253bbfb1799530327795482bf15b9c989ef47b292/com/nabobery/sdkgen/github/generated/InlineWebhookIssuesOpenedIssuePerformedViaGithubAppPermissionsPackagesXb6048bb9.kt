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
 * ub_app/properties/permissions/properties/packages.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-opened/properties/issue/properties/performed_via_gith
 * ub_app/properties/permissions/properties/packages
 */
@Serializable(with = InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsPackagesXb6048bb9.Serializer::class)
public sealed class InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsPackagesXb6048bb9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsPackagesXb6048bb9() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsPackagesXb6048bb9() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsPackagesXb6048bb9()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsPackagesXb6048bb9 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsPackagesXb6048bb9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsPackagesXb6048bb9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsPackagesXb6048bb9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsPackagesXb6048bb9) {
      encoder.encodeString(value.value)
    }
  }
}
