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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-locked/properties/issue/properties/performed_via_gith
 * ub_app/properties/permissions/properties/administration.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-locked/properties/issue/properties/performed_via_gith
 * ub_app/properties/permissions/properties/administration
 */
@Serializable(with = InlineWebhookIssuesLockedIssuePerformedViaGithubAppAdministrationXf7380881.Serializer::class)
public sealed class InlineWebhookIssuesLockedIssuePerformedViaGithubAppAdministrationXf7380881 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesLockedIssuePerformedViaGithubAppAdministrationXf7380881() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesLockedIssuePerformedViaGithubAppAdministrationXf7380881() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesLockedIssuePerformedViaGithubAppAdministrationXf7380881()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesLockedIssuePerformedViaGithubAppAdministrationXf7380881 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesLockedIssuePerformedViaGithubAppAdministrationXf7380881> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesLockedIssuePerformedViaGithubAppAdministrationXf7380881", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesLockedIssuePerformedViaGithubAppAdministrationXf7380881 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesLockedIssuePerformedViaGithubAppAdministrationXf7380881) {
      encoder.encodeString(value.value)
    }
  }
}
