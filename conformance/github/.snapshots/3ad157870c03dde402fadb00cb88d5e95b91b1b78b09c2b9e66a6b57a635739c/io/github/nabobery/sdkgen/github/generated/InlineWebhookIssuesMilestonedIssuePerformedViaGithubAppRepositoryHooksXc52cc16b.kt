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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-milestoned/properties/issue/properties/performed_via_
 * github_app/properties/permissions/properties/repository_hooks.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-milestoned/properties/issue/properties/performed_via_
 * github_app/properties/permissions/properties/repository_hooks
 */
@Serializable(with = InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppRepositoryHooksXc52cc16b.Serializer::class)
public sealed class InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppRepositoryHooksXc52cc16b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppRepositoryHooksXc52cc16b() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppRepositoryHooksXc52cc16b() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppRepositoryHooksXc52cc16b()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppRepositoryHooksXc52cc16b = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppRepositoryHooksXc52cc16b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppRepositoryHooksXc52cc16b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppRepositoryHooksXc52cc16b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppRepositoryHooksXc52cc16b) {
      encoder.encodeString(value.value)
    }
  }
}
