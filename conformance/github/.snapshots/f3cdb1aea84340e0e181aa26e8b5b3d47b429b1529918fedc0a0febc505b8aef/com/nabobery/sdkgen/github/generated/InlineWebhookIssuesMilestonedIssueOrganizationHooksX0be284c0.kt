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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-milestoned/properties/issue/properties/performed_via_
 * github_app/properties/permissions/properties/organization_hooks.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-milestoned/properties/issue/properties/performed_via_
 * github_app/properties/permissions/properties/organization_hooks
 */
@Serializable(with = InlineWebhookIssuesMilestonedIssueOrganizationHooksX0be284c0.Serializer::class)
public sealed class InlineWebhookIssuesMilestonedIssueOrganizationHooksX0be284c0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesMilestonedIssueOrganizationHooksX0be284c0() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesMilestonedIssueOrganizationHooksX0be284c0() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesMilestonedIssueOrganizationHooksX0be284c0()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesMilestonedIssueOrganizationHooksX0be284c0 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesMilestonedIssueOrganizationHooksX0be284c0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesMilestonedIssueOrganizationHooksX0be284c0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesMilestonedIssueOrganizationHooksX0be284c0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesMilestonedIssueOrganizationHooksX0be284c0) {
      encoder.encodeString(value.value)
    }
  }
}
