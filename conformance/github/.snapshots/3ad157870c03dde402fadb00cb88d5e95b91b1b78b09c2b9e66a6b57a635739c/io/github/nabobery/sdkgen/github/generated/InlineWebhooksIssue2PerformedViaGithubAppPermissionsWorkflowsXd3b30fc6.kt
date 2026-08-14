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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_issue_2/properties/performed_via_github_app/properties/perm
 * issions/properties/workflows.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_issue_2/properties/performed_via_github_app/properties/perm
 * issions/properties/workflows
 */
@Serializable(with = InlineWebhooksIssue2PerformedViaGithubAppPermissionsWorkflowsXd3b30fc6.Serializer::class)
public sealed class InlineWebhooksIssue2PerformedViaGithubAppPermissionsWorkflowsXd3b30fc6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhooksIssue2PerformedViaGithubAppPermissionsWorkflowsXd3b30fc6() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhooksIssue2PerformedViaGithubAppPermissionsWorkflowsXd3b30fc6() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksIssue2PerformedViaGithubAppPermissionsWorkflowsXd3b30fc6()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksIssue2PerformedViaGithubAppPermissionsWorkflowsXd3b30fc6 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksIssue2PerformedViaGithubAppPermissionsWorkflowsXd3b30fc6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhooksIssue2PerformedViaGithubAppPermissionsWorkflowsXd3b30fc6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksIssue2PerformedViaGithubAppPermissionsWorkflowsXd3b30fc6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksIssue2PerformedViaGithubAppPermissionsWorkflowsXd3b30fc6) {
      encoder.encodeString(value.value)
    }
  }
}
