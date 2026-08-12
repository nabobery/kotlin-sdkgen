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
 * hub_app/properties/permissions/properties/organization_projects.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-deleted/properties/issue/properties/performed_via_git
 * hub_app/properties/permissions/properties/organization_projects
 */
@Serializable(with = InlineWebhookIssuesDeletedIssueOrganizationProjectsX81657410.Serializer::class)
public sealed class InlineWebhookIssuesDeletedIssueOrganizationProjectsX81657410 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesDeletedIssueOrganizationProjectsX81657410() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesDeletedIssueOrganizationProjectsX81657410() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesDeletedIssueOrganizationProjectsX81657410()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesDeletedIssueOrganizationProjectsX81657410 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesDeletedIssueOrganizationProjectsX81657410> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesDeletedIssueOrganizationProjectsX81657410", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesDeletedIssueOrganizationProjectsX81657410 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesDeletedIssueOrganizationProjectsX81657410) {
      encoder.encodeString(value.value)
    }
  }
}
