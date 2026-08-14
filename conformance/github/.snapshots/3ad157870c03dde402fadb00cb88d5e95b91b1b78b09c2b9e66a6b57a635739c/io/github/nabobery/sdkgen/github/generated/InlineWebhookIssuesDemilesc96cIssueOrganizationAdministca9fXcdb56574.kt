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
 * a_github_app/properties/permissions/properties/organization_administration.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-demilestoned/properties/issue/properties/performed_vi
 * a_github_app/properties/permissions/properties/organization_administration
 */
@Serializable(with = InlineWebhookIssuesDemilesc96cIssueOrganizationAdministca9fXcdb56574.Serializer::class)
public sealed class InlineWebhookIssuesDemilesc96cIssueOrganizationAdministca9fXcdb56574 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesDemilesc96cIssueOrganizationAdministca9fXcdb56574() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesDemilesc96cIssueOrganizationAdministca9fXcdb56574() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesDemilesc96cIssueOrganizationAdministca9fXcdb56574()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesDemilesc96cIssueOrganizationAdministca9fXcdb56574 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesDemilesc96cIssueOrganizationAdministca9fXcdb56574> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesDemilesc96cIssueOrganizationAdministca9fXcdb56574", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesDemilesc96cIssueOrganizationAdministca9fXcdb56574 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesDemilesc96cIssueOrganizationAdministca9fXcdb56574) {
      encoder.encodeString(value.value)
    }
  }
}
