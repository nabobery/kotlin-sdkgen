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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-deleted/properties/issue/properties/performed_via_git
 * hub_app/properties/permissions/properties/organization_packages.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-deleted/properties/issue/properties/performed_via_git
 * hub_app/properties/permissions/properties/organization_packages
 */
@Serializable(with = InlineWebhookIssuesDeletedIssueOrganizationPackagesXc39796ca.Serializer::class)
public sealed class InlineWebhookIssuesDeletedIssueOrganizationPackagesXc39796ca {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesDeletedIssueOrganizationPackagesXc39796ca() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesDeletedIssueOrganizationPackagesXc39796ca() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesDeletedIssueOrganizationPackagesXc39796ca()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesDeletedIssueOrganizationPackagesXc39796ca = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesDeletedIssueOrganizationPackagesXc39796ca> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesDeletedIssueOrganizationPackagesXc39796ca", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesDeletedIssueOrganizationPackagesXc39796ca = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesDeletedIssueOrganizationPackagesXc39796ca) {
      encoder.encodeString(value.value)
    }
  }
}
