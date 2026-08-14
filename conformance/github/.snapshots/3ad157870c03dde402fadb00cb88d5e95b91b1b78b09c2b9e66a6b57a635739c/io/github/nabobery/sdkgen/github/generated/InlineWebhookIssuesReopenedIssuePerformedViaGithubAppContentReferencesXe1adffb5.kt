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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-reopened/properties/issue/properties/performed_via_gi
 * thub_app/properties/permissions/properties/content_references.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-reopened/properties/issue/properties/performed_via_gi
 * thub_app/properties/permissions/properties/content_references
 */
@Serializable(with = InlineWebhookIssuesReopenedIssuePerformedViaGithubAppContentReferencesXe1adffb5.Serializer::class)
public sealed class InlineWebhookIssuesReopenedIssuePerformedViaGithubAppContentReferencesXe1adffb5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesReopenedIssuePerformedViaGithubAppContentReferencesXe1adffb5() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesReopenedIssuePerformedViaGithubAppContentReferencesXe1adffb5() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesReopenedIssuePerformedViaGithubAppContentReferencesXe1adffb5()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesReopenedIssuePerformedViaGithubAppContentReferencesXe1adffb5 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesReopenedIssuePerformedViaGithubAppContentReferencesXe1adffb5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesReopenedIssuePerformedViaGithubAppContentReferencesXe1adffb5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesReopenedIssuePerformedViaGithubAppContentReferencesXe1adffb5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesReopenedIssuePerformedViaGithubAppContentReferencesXe1adffb5) {
      encoder.encodeString(value.value)
    }
  }
}
