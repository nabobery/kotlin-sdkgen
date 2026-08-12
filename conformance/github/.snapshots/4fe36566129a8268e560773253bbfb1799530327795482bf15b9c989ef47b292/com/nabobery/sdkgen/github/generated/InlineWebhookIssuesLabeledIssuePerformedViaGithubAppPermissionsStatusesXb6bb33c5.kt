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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-labeled/properties/issue/properties/performed_via_git
 * hub_app/properties/permissions/properties/statuses.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-labeled/properties/issue/properties/performed_via_git
 * hub_app/properties/permissions/properties/statuses
 */
@Serializable(with = InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsStatusesXb6bb33c5.Serializer::class)
public sealed class InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsStatusesXb6bb33c5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsStatusesXb6bb33c5() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsStatusesXb6bb33c5() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsStatusesXb6bb33c5()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsStatusesXb6bb33c5 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsStatusesXb6bb33c5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsStatusesXb6bb33c5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsStatusesXb6bb33c5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsStatusesXb6bb33c5) {
      encoder.encodeString(value.value)
    }
  }
}
