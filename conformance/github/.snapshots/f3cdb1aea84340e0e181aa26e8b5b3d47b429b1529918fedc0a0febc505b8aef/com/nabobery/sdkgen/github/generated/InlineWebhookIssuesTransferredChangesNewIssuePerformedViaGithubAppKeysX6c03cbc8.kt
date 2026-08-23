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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-transferred/properties/changes/properties/new_issue/p
 * roperties/performed_via_github_app/properties/permissions/properties/keys.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-transferred/properties/changes/properties/new_issue/p
 * roperties/performed_via_github_app/properties/permissions/properties/keys
 */
@Serializable(with = InlineWebhookIssuesTransferredChangesNewIssuePerformedViaGithubAppKeysX6c03cbc8.Serializer::class)
public sealed class InlineWebhookIssuesTransferredChangesNewIssuePerformedViaGithubAppKeysX6c03cbc8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesTransferredChangesNewIssuePerformedViaGithubAppKeysX6c03cbc8() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesTransferredChangesNewIssuePerformedViaGithubAppKeysX6c03cbc8() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesTransferredChangesNewIssuePerformedViaGithubAppKeysX6c03cbc8()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesTransferredChangesNewIssuePerformedViaGithubAppKeysX6c03cbc8 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesTransferredChangesNewIssuePerformedViaGithubAppKeysX6c03cbc8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesTransferredChangesNewIssuePerformedViaGithubAppKeysX6c03cbc8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesTransferredChangesNewIssuePerformedViaGithubAppKeysX6c03cbc8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesTransferredChangesNewIssuePerformedViaGithubAppKeysX6c03cbc8) {
      encoder.encodeString(value.value)
    }
  }
}
