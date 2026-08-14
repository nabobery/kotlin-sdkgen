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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-opened/properties/changes/properties/old_issue/proper
 * ties/performed_via_github_app/properties/permissions/properties/keys.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-opened/properties/changes/properties/old_issue/proper
 * ties/performed_via_github_app/properties/permissions/properties/keys
 */
@Serializable(with = InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppKeysX0aa7b527.Serializer::class)
public sealed class InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppKeysX0aa7b527 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppKeysX0aa7b527() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppKeysX0aa7b527() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppKeysX0aa7b527()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppKeysX0aa7b527 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppKeysX0aa7b527> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppKeysX0aa7b527", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppKeysX0aa7b527 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppKeysX0aa7b527) {
      encoder.encodeString(value.value)
    }
  }
}
