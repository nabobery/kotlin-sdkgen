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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-edited/properties/issue/properties/performed_via_gith
 * ub_app/properties/permissions/properties/metadata.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-edited/properties/issue/properties/performed_via_gith
 * ub_app/properties/permissions/properties/metadata
 */
@Serializable(with = InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsMetadataX89e35e22.Serializer::class)
public sealed class InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsMetadataX89e35e22 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsMetadataX89e35e22() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsMetadataX89e35e22() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsMetadataX89e35e22()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsMetadataX89e35e22 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsMetadataX89e35e22> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsMetadataX89e35e22", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsMetadataX89e35e22 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsMetadataX89e35e22) {
      encoder.encodeString(value.value)
    }
  }
}
