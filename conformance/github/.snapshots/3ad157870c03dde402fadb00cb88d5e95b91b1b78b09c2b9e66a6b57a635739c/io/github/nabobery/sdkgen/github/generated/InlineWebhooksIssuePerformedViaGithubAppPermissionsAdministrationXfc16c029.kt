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
 * sions/properties/administration.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_issue/properties/performed_via_github_app/properties/permis
 * sions/properties/administration
 */
@Serializable(with = InlineWebhooksIssuePerformedViaGithubAppPermissionsAdministrationXfc16c029.Serializer::class)
public sealed class InlineWebhooksIssuePerformedViaGithubAppPermissionsAdministrationXfc16c029 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhooksIssuePerformedViaGithubAppPermissionsAdministrationXfc16c029() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhooksIssuePerformedViaGithubAppPermissionsAdministrationXfc16c029() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksIssuePerformedViaGithubAppPermissionsAdministrationXfc16c029()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksIssuePerformedViaGithubAppPermissionsAdministrationXfc16c029 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksIssuePerformedViaGithubAppPermissionsAdministrationXfc16c029> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhooksIssuePerformedViaGithubAppPermissionsAdministrationXfc16c029", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksIssuePerformedViaGithubAppPermissionsAdministrationXfc16c029 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksIssuePerformedViaGithubAppPermissionsAdministrationXfc16c029) {
      encoder.encodeString(value.value)
    }
  }
}
