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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_issue/properties/performed_via_github_app/properties/permis
 * sions/properties/issues.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_issue/properties/performed_via_github_app/properties/permis
 * sions/properties/issues
 */
@Serializable(with = InlineWebhooksIssuePerformedViaGithubAppPermissionsIssuesX07f6ce7b.Serializer::class)
public sealed class InlineWebhooksIssuePerformedViaGithubAppPermissionsIssuesX07f6ce7b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhooksIssuePerformedViaGithubAppPermissionsIssuesX07f6ce7b() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhooksIssuePerformedViaGithubAppPermissionsIssuesX07f6ce7b() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksIssuePerformedViaGithubAppPermissionsIssuesX07f6ce7b()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksIssuePerformedViaGithubAppPermissionsIssuesX07f6ce7b = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksIssuePerformedViaGithubAppPermissionsIssuesX07f6ce7b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhooksIssuePerformedViaGithubAppPermissionsIssuesX07f6ce7b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksIssuePerformedViaGithubAppPermissionsIssuesX07f6ce7b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksIssuePerformedViaGithubAppPermissionsIssuesX07f6ce7b) {
      encoder.encodeString(value.value)
    }
  }
}
