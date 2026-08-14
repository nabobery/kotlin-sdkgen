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
 * github_app/properties/permissions/properties/discussions.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-milestoned/properties/issue/properties/performed_via_
 * github_app/properties/permissions/properties/discussions
 */
@Serializable(with = InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppDiscussionsX49d458f1.Serializer::class)
public sealed class InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppDiscussionsX49d458f1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppDiscussionsX49d458f1() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppDiscussionsX49d458f1() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppDiscussionsX49d458f1()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppDiscussionsX49d458f1 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppDiscussionsX49d458f1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppDiscussionsX49d458f1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppDiscussionsX49d458f1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppDiscussionsX49d458f1) {
      encoder.encodeString(value.value)
    }
  }
}
