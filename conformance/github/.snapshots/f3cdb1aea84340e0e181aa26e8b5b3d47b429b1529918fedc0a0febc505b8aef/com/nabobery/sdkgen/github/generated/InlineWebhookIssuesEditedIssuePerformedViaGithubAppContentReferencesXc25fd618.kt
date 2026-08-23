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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-edited/properties/issue/properties/performed_via_gith
 * ub_app/properties/permissions/properties/content_references.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-edited/properties/issue/properties/performed_via_gith
 * ub_app/properties/permissions/properties/content_references
 */
@Serializable(with = InlineWebhookIssuesEditedIssuePerformedViaGithubAppContentReferencesXc25fd618.Serializer::class)
public sealed class InlineWebhookIssuesEditedIssuePerformedViaGithubAppContentReferencesXc25fd618 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesEditedIssuePerformedViaGithubAppContentReferencesXc25fd618() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesEditedIssuePerformedViaGithubAppContentReferencesXc25fd618() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesEditedIssuePerformedViaGithubAppContentReferencesXc25fd618()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesEditedIssuePerformedViaGithubAppContentReferencesXc25fd618 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesEditedIssuePerformedViaGithubAppContentReferencesXc25fd618> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesEditedIssuePerformedViaGithubAppContentReferencesXc25fd618", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesEditedIssuePerformedViaGithubAppContentReferencesXc25fd618 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesEditedIssuePerformedViaGithubAppContentReferencesXc25fd618) {
      encoder.encodeString(value.value)
    }
  }
}
