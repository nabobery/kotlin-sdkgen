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
 * hub_app/properties/permissions/properties/actions.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-deleted/properties/issue/properties/performed_via_git
 * hub_app/properties/permissions/properties/actions
 */
@Serializable(with = InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsActionsXaa3cbfbd.Serializer::class)
public sealed class InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsActionsXaa3cbfbd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsActionsXaa3cbfbd() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsActionsXaa3cbfbd() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsActionsXaa3cbfbd()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsActionsXaa3cbfbd = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsActionsXaa3cbfbd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsActionsXaa3cbfbd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsActionsXaa3cbfbd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsActionsXaa3cbfbd) {
      encoder.encodeString(value.value)
    }
  }
}
