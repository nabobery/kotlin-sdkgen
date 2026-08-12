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
 * thub_app/properties/permissions/properties/discussions.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-reopened/properties/issue/properties/performed_via_gi
 * thub_app/properties/permissions/properties/discussions
 */
@Serializable(with = InlineWebhookIssuesReopenedIssuePerformedViaGithubAppDiscussionsX590b9e47.Serializer::class)
public sealed class InlineWebhookIssuesReopenedIssuePerformedViaGithubAppDiscussionsX590b9e47 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesReopenedIssuePerformedViaGithubAppDiscussionsX590b9e47() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesReopenedIssuePerformedViaGithubAppDiscussionsX590b9e47() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesReopenedIssuePerformedViaGithubAppDiscussionsX590b9e47()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesReopenedIssuePerformedViaGithubAppDiscussionsX590b9e47 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesReopenedIssuePerformedViaGithubAppDiscussionsX590b9e47> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesReopenedIssuePerformedViaGithubAppDiscussionsX590b9e47", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesReopenedIssuePerformedViaGithubAppDiscussionsX590b9e47 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesReopenedIssuePerformedViaGithubAppDiscussionsX590b9e47) {
      encoder.encodeString(value.value)
    }
  }
}
