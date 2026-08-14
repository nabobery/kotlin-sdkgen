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
 * roperties/performed_via_github_app/properties/permissions/properties/emails.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-transferred/properties/changes/properties/new_issue/p
 * roperties/performed_via_github_app/properties/permissions/properties/emails
 */
@Serializable(with = InlineWebhookIssuesTransferredChangesNewIssueEmailsX85d9e6c2.Serializer::class)
public sealed class InlineWebhookIssuesTransferredChangesNewIssueEmailsX85d9e6c2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesTransferredChangesNewIssueEmailsX85d9e6c2() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesTransferredChangesNewIssueEmailsX85d9e6c2() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesTransferredChangesNewIssueEmailsX85d9e6c2()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesTransferredChangesNewIssueEmailsX85d9e6c2 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesTransferredChangesNewIssueEmailsX85d9e6c2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesTransferredChangesNewIssueEmailsX85d9e6c2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesTransferredChangesNewIssueEmailsX85d9e6c2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesTransferredChangesNewIssueEmailsX85d9e6c2) {
      encoder.encodeString(value.value)
    }
  }
}
