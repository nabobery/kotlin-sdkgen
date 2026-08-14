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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-demilestoned/properties/issue/properties/performed_vi
 * a_github_app/properties/permissions/properties/organization_projects.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-demilestoned/properties/issue/properties/performed_vi
 * a_github_app/properties/permissions/properties/organization_projects
 */
@Serializable(with = InlineWebhookIssuesDemilesc96cIssueOrganizationProjectsX4a0c5dc2.Serializer::class)
public sealed class InlineWebhookIssuesDemilesc96cIssueOrganizationProjectsX4a0c5dc2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesDemilesc96cIssueOrganizationProjectsX4a0c5dc2() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesDemilesc96cIssueOrganizationProjectsX4a0c5dc2() {
    public override val `value`: String = "write"
  }

  /**
   * Documented value. Wire value: `admin`.
   */
  public data object Admin : InlineWebhookIssuesDemilesc96cIssueOrganizationProjectsX4a0c5dc2() {
    public override val `value`: String = "admin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesDemilesc96cIssueOrganizationProjectsX4a0c5dc2()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesDemilesc96cIssueOrganizationProjectsX4a0c5dc2 = when (value) {
      Read.value -> Read
      Write.value -> Write
      Admin.value -> Admin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesDemilesc96cIssueOrganizationProjectsX4a0c5dc2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesDemilesc96cIssueOrganizationProjectsX4a0c5dc2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesDemilesc96cIssueOrganizationProjectsX4a0c5dc2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesDemilesc96cIssueOrganizationProjectsX4a0c5dc2) {
      encoder.encodeString(value.value)
    }
  }
}
