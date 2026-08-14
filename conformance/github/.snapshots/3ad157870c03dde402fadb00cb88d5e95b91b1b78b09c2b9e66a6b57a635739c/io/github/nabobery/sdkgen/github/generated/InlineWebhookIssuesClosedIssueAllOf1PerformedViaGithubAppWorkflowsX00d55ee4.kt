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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-closed/properties/issue/allOf/0/properties/performed_
 * via_github_app/properties/permissions/properties/workflows.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-closed/properties/issue/allOf/0/properties/performed_
 * via_github_app/properties/permissions/properties/workflows
 */
@Serializable(with = InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppWorkflowsX00d55ee4.Serializer::class)
public sealed class InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppWorkflowsX00d55ee4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppWorkflowsX00d55ee4() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppWorkflowsX00d55ee4() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppWorkflowsX00d55ee4()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppWorkflowsX00d55ee4 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppWorkflowsX00d55ee4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppWorkflowsX00d55ee4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppWorkflowsX00d55ee4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppWorkflowsX00d55ee4) {
      encoder.encodeString(value.value)
    }
  }
}
