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
 * roperties/performed_via_github_app/properties/permissions/properties/pull_requests.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-transferred/properties/changes/properties/new_issue/p
 * roperties/performed_via_github_app/properties/permissions/properties/pull_requests
 */
@Serializable(with = InlineWebhookIssuesTransferredChangesNewIssuePullRequestsX85808348.Serializer::class)
public sealed class InlineWebhookIssuesTransferredChangesNewIssuePullRequestsX85808348 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesTransferredChangesNewIssuePullRequestsX85808348() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesTransferredChangesNewIssuePullRequestsX85808348() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesTransferredChangesNewIssuePullRequestsX85808348()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesTransferredChangesNewIssuePullRequestsX85808348 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesTransferredChangesNewIssuePullRequestsX85808348> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesTransferredChangesNewIssuePullRequestsX85808348", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesTransferredChangesNewIssuePullRequestsX85808348 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesTransferredChangesNewIssuePullRequestsX85808348) {
      encoder.encodeString(value.value)
    }
  }
}
