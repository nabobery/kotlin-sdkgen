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
 * github_app/properties/permissions/properties/organization_packages.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-milestoned/properties/issue/properties/performed_via_
 * github_app/properties/permissions/properties/organization_packages
 */
@Serializable(with = InlineWebhookIssuesMilestonedIssueOrganizationPackagesXb49306ed.Serializer::class)
public sealed class InlineWebhookIssuesMilestonedIssueOrganizationPackagesXb49306ed {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesMilestonedIssueOrganizationPackagesXb49306ed() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesMilestonedIssueOrganizationPackagesXb49306ed() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesMilestonedIssueOrganizationPackagesXb49306ed()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesMilestonedIssueOrganizationPackagesXb49306ed = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesMilestonedIssueOrganizationPackagesXb49306ed> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesMilestonedIssueOrganizationPackagesXb49306ed", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesMilestonedIssueOrganizationPackagesXb49306ed = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesMilestonedIssueOrganizationPackagesXb49306ed) {
      encoder.encodeString(value.value)
    }
  }
}
