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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-demilestoned/properties/issue/properties/performed_vi
 * a_github_app/properties/permissions/properties/metadata.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-demilestoned/properties/issue/properties/performed_vi
 * a_github_app/properties/permissions/properties/metadata
 */
@Serializable(with = InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppMetadataX609e835b.Serializer::class)
public sealed class InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppMetadataX609e835b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppMetadataX609e835b() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppMetadataX609e835b() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppMetadataX609e835b()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppMetadataX609e835b = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppMetadataX609e835b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppMetadataX609e835b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppMetadataX609e835b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppMetadataX609e835b) {
      encoder.encodeString(value.value)
    }
  }
}
