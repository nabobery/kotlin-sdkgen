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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-deleted/properties/issue/properties/performed_via_git
 * hub_app/properties/permissions/properties/discussions.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-deleted/properties/issue/properties/performed_via_git
 * hub_app/properties/permissions/properties/discussions
 */
@Serializable(with = InlineWebhookIssuesDeletedIssuePerformedViaGithubAppDiscussionsXbcb842cb.Serializer::class)
public sealed class InlineWebhookIssuesDeletedIssuePerformedViaGithubAppDiscussionsXbcb842cb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesDeletedIssuePerformedViaGithubAppDiscussionsXbcb842cb() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesDeletedIssuePerformedViaGithubAppDiscussionsXbcb842cb() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesDeletedIssuePerformedViaGithubAppDiscussionsXbcb842cb()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesDeletedIssuePerformedViaGithubAppDiscussionsXbcb842cb = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesDeletedIssuePerformedViaGithubAppDiscussionsXbcb842cb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesDeletedIssuePerformedViaGithubAppDiscussionsXbcb842cb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesDeletedIssuePerformedViaGithubAppDiscussionsXbcb842cb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesDeletedIssuePerformedViaGithubAppDiscussionsXbcb842cb) {
      encoder.encodeString(value.value)
    }
  }
}
