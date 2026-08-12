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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-locked/properties/issue/properties/performed_via_gith
 * ub_app/properties/permissions/properties/organization_administration.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-locked/properties/issue/properties/performed_via_gith
 * ub_app/properties/permissions/properties/organization_administration
 */
@Serializable(with = InlineWebhookIssuesLockedIssueOrganizationAdministca9fX747087c5.Serializer::class)
public sealed class InlineWebhookIssuesLockedIssueOrganizationAdministca9fX747087c5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesLockedIssueOrganizationAdministca9fX747087c5() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesLockedIssueOrganizationAdministca9fX747087c5() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesLockedIssueOrganizationAdministca9fX747087c5()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesLockedIssueOrganizationAdministca9fX747087c5 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesLockedIssueOrganizationAdministca9fX747087c5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesLockedIssueOrganizationAdministca9fX747087c5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesLockedIssueOrganizationAdministca9fX747087c5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesLockedIssueOrganizationAdministca9fX747087c5) {
      encoder.encodeString(value.value)
    }
  }
}
