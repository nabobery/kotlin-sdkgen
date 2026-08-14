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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-closed/properties/issue/allOf/0/properties/performed_
 * via_github_app/properties/permissions/properties/statuses.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-closed/properties/issue/allOf/0/properties/performed_
 * via_github_app/properties/permissions/properties/statuses
 */
@Serializable(with = InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppStatusesX1d98642d.Serializer::class)
public sealed class InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppStatusesX1d98642d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppStatusesX1d98642d() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppStatusesX1d98642d() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppStatusesX1d98642d()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppStatusesX1d98642d = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppStatusesX1d98642d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppStatusesX1d98642d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppStatusesX1d98642d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppStatusesX1d98642d) {
      encoder.encodeString(value.value)
    }
  }
}
