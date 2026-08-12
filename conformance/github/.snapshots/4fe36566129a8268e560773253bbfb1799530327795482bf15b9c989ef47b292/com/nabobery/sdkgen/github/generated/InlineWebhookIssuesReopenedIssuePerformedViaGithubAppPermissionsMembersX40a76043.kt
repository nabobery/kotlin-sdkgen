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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-reopened/properties/issue/properties/performed_via_gi
 * thub_app/properties/permissions/properties/members.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-reopened/properties/issue/properties/performed_via_gi
 * thub_app/properties/permissions/properties/members
 */
@Serializable(with = InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsMembersX40a76043.Serializer::class)
public sealed class InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsMembersX40a76043 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsMembersX40a76043() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsMembersX40a76043() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsMembersX40a76043()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsMembersX40a76043 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsMembersX40a76043> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsMembersX40a76043", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsMembersX40a76043 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsMembersX40a76043) {
      encoder.encodeString(value.value)
    }
  }
}
