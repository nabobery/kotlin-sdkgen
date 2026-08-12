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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_issue_2/properties/performed_via_github_app/properties/perm
 * issions/properties/organization_secrets.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_issue_2/properties/performed_via_github_app/properties/perm
 * issions/properties/organization_secrets
 */
@Serializable(with = InlineWebhooksIssue2PerformedViaGithubAppPermissionsOrganizationSecretsXf801f08f.Serializer::class)
public sealed class InlineWebhooksIssue2PerformedViaGithubAppPermissionsOrganizationSecretsXf801f08f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhooksIssue2PerformedViaGithubAppPermissionsOrganizationSecretsXf801f08f() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhooksIssue2PerformedViaGithubAppPermissionsOrganizationSecretsXf801f08f() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksIssue2PerformedViaGithubAppPermissionsOrganizationSecretsXf801f08f()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksIssue2PerformedViaGithubAppPermissionsOrganizationSecretsXf801f08f = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksIssue2PerformedViaGithubAppPermissionsOrganizationSecretsXf801f08f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksIssue2PerformedViaGithubAppPermissionsOrganizationSecretsXf801f08f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksIssue2PerformedViaGithubAppPermissionsOrganizationSecretsXf801f08f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksIssue2PerformedViaGithubAppPermissionsOrganizationSecretsXf801f08f) {
      encoder.encodeString(value.value)
    }
  }
}
