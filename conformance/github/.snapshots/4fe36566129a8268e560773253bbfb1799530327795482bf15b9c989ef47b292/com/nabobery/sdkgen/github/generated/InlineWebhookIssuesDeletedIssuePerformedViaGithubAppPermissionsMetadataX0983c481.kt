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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-deleted/properties/issue/properties/performed_via_git
 * hub_app/properties/permissions/properties/metadata.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-deleted/properties/issue/properties/performed_via_git
 * hub_app/properties/permissions/properties/metadata
 */
@Serializable(with = InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsMetadataX0983c481.Serializer::class)
public sealed class InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsMetadataX0983c481 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsMetadataX0983c481() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsMetadataX0983c481() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsMetadataX0983c481()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsMetadataX0983c481 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsMetadataX0983c481> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsMetadataX0983c481", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsMetadataX0983c481 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsMetadataX0983c481) {
      encoder.encodeString(value.value)
    }
  }
}
