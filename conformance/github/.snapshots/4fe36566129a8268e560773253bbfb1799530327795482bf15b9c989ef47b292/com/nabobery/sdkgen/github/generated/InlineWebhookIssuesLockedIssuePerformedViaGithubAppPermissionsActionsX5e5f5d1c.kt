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
 * ub_app/properties/permissions/properties/actions.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-locked/properties/issue/properties/performed_via_gith
 * ub_app/properties/permissions/properties/actions
 */
@Serializable(with = InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsActionsX5e5f5d1c.Serializer::class)
public sealed class InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsActionsX5e5f5d1c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsActionsX5e5f5d1c() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsActionsX5e5f5d1c() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsActionsX5e5f5d1c()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsActionsX5e5f5d1c = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsActionsX5e5f5d1c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsActionsX5e5f5d1c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsActionsX5e5f5d1c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsActionsX5e5f5d1c) {
      encoder.encodeString(value.value)
    }
  }
}
