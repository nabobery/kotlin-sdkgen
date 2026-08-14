package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-milestoned/properties/issue/properties/performed_via_
 * github_app/properties/permissions/properties/organization_secrets.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-milestoned/properties/issue/properties/performed_via_
 * github_app/properties/permissions/properties/organization_secrets
 */
@Serializable(with = InlineWebhookIssuesMilestonedIssueOrganizationSecretsX140f85de.Serializer::class)
public sealed class InlineWebhookIssuesMilestonedIssueOrganizationSecretsX140f85de {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesMilestonedIssueOrganizationSecretsX140f85de() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesMilestonedIssueOrganizationSecretsX140f85de() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesMilestonedIssueOrganizationSecretsX140f85de()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesMilestonedIssueOrganizationSecretsX140f85de = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesMilestonedIssueOrganizationSecretsX140f85de> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesMilestonedIssueOrganizationSecretsX140f85de", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesMilestonedIssueOrganizationSecretsX140f85de = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesMilestonedIssueOrganizationSecretsX140f85de) {
      encoder.encodeString(value.value)
    }
  }
}
