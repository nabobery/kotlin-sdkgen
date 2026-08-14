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
 * ties/performed_via_github_app/properties/permissions/properties/secrets.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-opened/properties/changes/properties/old_issue/proper
 * ties/performed_via_github_app/properties/permissions/properties/secrets
 */
@Serializable(with = InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppSecretsX3d4b2238.Serializer::class)
public sealed class InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppSecretsX3d4b2238 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppSecretsX3d4b2238() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppSecretsX3d4b2238() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppSecretsX3d4b2238()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppSecretsX3d4b2238 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppSecretsX3d4b2238> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppSecretsX3d4b2238", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppSecretsX3d4b2238 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppSecretsX3d4b2238) {
      encoder.encodeString(value.value)
    }
  }
}
