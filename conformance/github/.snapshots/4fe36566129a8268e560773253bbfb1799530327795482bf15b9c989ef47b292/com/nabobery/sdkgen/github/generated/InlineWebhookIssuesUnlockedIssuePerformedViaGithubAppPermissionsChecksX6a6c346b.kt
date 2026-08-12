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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-unlocked/properties/issue/properties/performed_via_gi
 * thub_app/properties/permissions/properties/checks.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-unlocked/properties/issue/properties/performed_via_gi
 * thub_app/properties/permissions/properties/checks
 */
@Serializable(with = InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsChecksX6a6c346b.Serializer::class)
public sealed class InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsChecksX6a6c346b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsChecksX6a6c346b() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsChecksX6a6c346b() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsChecksX6a6c346b()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsChecksX6a6c346b = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsChecksX6a6c346b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsChecksX6a6c346b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsChecksX6a6c346b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsChecksX6a6c346b) {
      encoder.encodeString(value.value)
    }
  }
}
