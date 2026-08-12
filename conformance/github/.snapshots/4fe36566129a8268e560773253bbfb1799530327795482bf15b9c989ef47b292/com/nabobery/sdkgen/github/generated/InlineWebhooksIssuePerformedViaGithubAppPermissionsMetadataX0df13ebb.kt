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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_issue/properties/performed_via_github_app/properties/permis
 * sions/properties/metadata.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_issue/properties/performed_via_github_app/properties/permis
 * sions/properties/metadata
 */
@Serializable(with = InlineWebhooksIssuePerformedViaGithubAppPermissionsMetadataX0df13ebb.Serializer::class)
public sealed class InlineWebhooksIssuePerformedViaGithubAppPermissionsMetadataX0df13ebb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhooksIssuePerformedViaGithubAppPermissionsMetadataX0df13ebb() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhooksIssuePerformedViaGithubAppPermissionsMetadataX0df13ebb() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksIssuePerformedViaGithubAppPermissionsMetadataX0df13ebb()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksIssuePerformedViaGithubAppPermissionsMetadataX0df13ebb = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksIssuePerformedViaGithubAppPermissionsMetadataX0df13ebb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksIssuePerformedViaGithubAppPermissionsMetadataX0df13ebb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksIssuePerformedViaGithubAppPermissionsMetadataX0df13ebb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksIssuePerformedViaGithubAppPermissionsMetadataX0df13ebb) {
      encoder.encodeString(value.value)
    }
  }
}
