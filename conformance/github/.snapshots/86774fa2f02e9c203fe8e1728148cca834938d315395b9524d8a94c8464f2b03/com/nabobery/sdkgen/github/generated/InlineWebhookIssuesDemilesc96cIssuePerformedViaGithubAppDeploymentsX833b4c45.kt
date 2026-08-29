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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-demilestoned/properties/issue/properties/performed_vi
 * a_github_app/properties/permissions/properties/deployments.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-demilestoned/properties/issue/properties/performed_vi
 * a_github_app/properties/permissions/properties/deployments
 */
@Serializable(with = InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppDeploymentsX833b4c45.Serializer::class)
public sealed class InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppDeploymentsX833b4c45 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppDeploymentsX833b4c45() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppDeploymentsX833b4c45() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppDeploymentsX833b4c45()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppDeploymentsX833b4c45 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppDeploymentsX833b4c45> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppDeploymentsX833b4c45", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppDeploymentsX833b4c45 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppDeploymentsX833b4c45) {
      encoder.encodeString(value.value)
    }
  }
}
