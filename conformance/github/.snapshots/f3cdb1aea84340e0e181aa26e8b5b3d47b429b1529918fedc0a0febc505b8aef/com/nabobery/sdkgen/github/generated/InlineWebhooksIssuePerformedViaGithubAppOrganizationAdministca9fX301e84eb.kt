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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_issue/properties/performed_via_github_app/properties/permis
 * sions/properties/organization_administration.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_issue/properties/performed_via_github_app/properties/permis
 * sions/properties/organization_administration
 */
@Serializable(with = InlineWebhooksIssuePerformedViaGithubAppOrganizationAdministca9fX301e84eb.Serializer::class)
public sealed class InlineWebhooksIssuePerformedViaGithubAppOrganizationAdministca9fX301e84eb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhooksIssuePerformedViaGithubAppOrganizationAdministca9fX301e84eb() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhooksIssuePerformedViaGithubAppOrganizationAdministca9fX301e84eb() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksIssuePerformedViaGithubAppOrganizationAdministca9fX301e84eb()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksIssuePerformedViaGithubAppOrganizationAdministca9fX301e84eb = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksIssuePerformedViaGithubAppOrganizationAdministca9fX301e84eb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksIssuePerformedViaGithubAppOrganizationAdministca9fX301e84eb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksIssuePerformedViaGithubAppOrganizationAdministca9fX301e84eb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksIssuePerformedViaGithubAppOrganizationAdministca9fX301e84eb) {
      encoder.encodeString(value.value)
    }
  }
}
