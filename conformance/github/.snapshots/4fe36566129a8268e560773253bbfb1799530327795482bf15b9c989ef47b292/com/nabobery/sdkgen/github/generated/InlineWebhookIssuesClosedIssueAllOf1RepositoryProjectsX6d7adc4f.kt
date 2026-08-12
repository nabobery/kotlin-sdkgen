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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-closed/properties/issue/allOf/0/properties/performed_
 * via_github_app/properties/permissions/properties/repository_projects.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-closed/properties/issue/allOf/0/properties/performed_
 * via_github_app/properties/permissions/properties/repository_projects
 */
@Serializable(with = InlineWebhookIssuesClosedIssueAllOf1RepositoryProjectsX6d7adc4f.Serializer::class)
public sealed class InlineWebhookIssuesClosedIssueAllOf1RepositoryProjectsX6d7adc4f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesClosedIssueAllOf1RepositoryProjectsX6d7adc4f() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesClosedIssueAllOf1RepositoryProjectsX6d7adc4f() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesClosedIssueAllOf1RepositoryProjectsX6d7adc4f()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesClosedIssueAllOf1RepositoryProjectsX6d7adc4f = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesClosedIssueAllOf1RepositoryProjectsX6d7adc4f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesClosedIssueAllOf1RepositoryProjectsX6d7adc4f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesClosedIssueAllOf1RepositoryProjectsX6d7adc4f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesClosedIssueAllOf1RepositoryProjectsX6d7adc4f) {
      encoder.encodeString(value.value)
    }
  }
}
