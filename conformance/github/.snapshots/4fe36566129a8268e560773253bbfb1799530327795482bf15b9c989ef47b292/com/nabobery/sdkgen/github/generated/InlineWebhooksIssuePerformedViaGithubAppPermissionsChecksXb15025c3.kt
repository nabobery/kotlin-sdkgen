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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_issue/properties/performed_via_github_app/properties/permis
 * sions/properties/checks.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_issue/properties/performed_via_github_app/properties/permis
 * sions/properties/checks
 */
@Serializable(with = InlineWebhooksIssuePerformedViaGithubAppPermissionsChecksXb15025c3.Serializer::class)
public sealed class InlineWebhooksIssuePerformedViaGithubAppPermissionsChecksXb15025c3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhooksIssuePerformedViaGithubAppPermissionsChecksXb15025c3() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhooksIssuePerformedViaGithubAppPermissionsChecksXb15025c3() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksIssuePerformedViaGithubAppPermissionsChecksXb15025c3()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksIssuePerformedViaGithubAppPermissionsChecksXb15025c3 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksIssuePerformedViaGithubAppPermissionsChecksXb15025c3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksIssuePerformedViaGithubAppPermissionsChecksXb15025c3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksIssuePerformedViaGithubAppPermissionsChecksXb15025c3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksIssuePerformedViaGithubAppPermissionsChecksXb15025c3) {
      encoder.encodeString(value.value)
    }
  }
}
