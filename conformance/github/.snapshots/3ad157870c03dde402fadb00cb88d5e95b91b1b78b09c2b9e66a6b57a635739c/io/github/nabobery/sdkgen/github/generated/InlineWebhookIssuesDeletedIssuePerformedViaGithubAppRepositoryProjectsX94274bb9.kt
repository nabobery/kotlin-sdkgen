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
 * hub_app/properties/permissions/properties/repository_projects.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-deleted/properties/issue/properties/performed_via_git
 * hub_app/properties/permissions/properties/repository_projects
 */
@Serializable(with = InlineWebhookIssuesDeletedIssuePerformedViaGithubAppRepositoryProjectsX94274bb9.Serializer::class)
public sealed class InlineWebhookIssuesDeletedIssuePerformedViaGithubAppRepositoryProjectsX94274bb9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesDeletedIssuePerformedViaGithubAppRepositoryProjectsX94274bb9() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesDeletedIssuePerformedViaGithubAppRepositoryProjectsX94274bb9() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesDeletedIssuePerformedViaGithubAppRepositoryProjectsX94274bb9()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesDeletedIssuePerformedViaGithubAppRepositoryProjectsX94274bb9 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesDeletedIssuePerformedViaGithubAppRepositoryProjectsX94274bb9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesDeletedIssuePerformedViaGithubAppRepositoryProjectsX94274bb9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesDeletedIssuePerformedViaGithubAppRepositoryProjectsX94274bb9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesDeletedIssuePerformedViaGithubAppRepositoryProjectsX94274bb9) {
      encoder.encodeString(value.value)
    }
  }
}
