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
 * github_app/properties/permissions/properties/checks.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-milestoned/properties/issue/properties/performed_via_
 * github_app/properties/permissions/properties/checks
 */
@Serializable(with = InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppChecksX422ae4ef.Serializer::class)
public sealed class InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppChecksX422ae4ef {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppChecksX422ae4ef() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppChecksX422ae4ef() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppChecksX422ae4ef()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppChecksX422ae4ef = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppChecksX422ae4ef> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppChecksX422ae4ef", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppChecksX422ae4ef = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppChecksX422ae4ef) {
      encoder.encodeString(value.value)
    }
  }
}
