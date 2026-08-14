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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-transferred/properties/changes/properties/new_issue/p
 * roperties/performed_via_github_app/properties/permissions/properties/actions.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-transferred/properties/changes/properties/new_issue/p
 * roperties/performed_via_github_app/properties/permissions/properties/actions
 */
@Serializable(with = InlineWebhookIssuesTransferredChangesNewIssueActionsX80862426.Serializer::class)
public sealed class InlineWebhookIssuesTransferredChangesNewIssueActionsX80862426 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesTransferredChangesNewIssueActionsX80862426() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesTransferredChangesNewIssueActionsX80862426() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesTransferredChangesNewIssueActionsX80862426()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesTransferredChangesNewIssueActionsX80862426 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesTransferredChangesNewIssueActionsX80862426> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesTransferredChangesNewIssueActionsX80862426", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesTransferredChangesNewIssueActionsX80862426 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesTransferredChangesNewIssueActionsX80862426) {
      encoder.encodeString(value.value)
    }
  }
}
