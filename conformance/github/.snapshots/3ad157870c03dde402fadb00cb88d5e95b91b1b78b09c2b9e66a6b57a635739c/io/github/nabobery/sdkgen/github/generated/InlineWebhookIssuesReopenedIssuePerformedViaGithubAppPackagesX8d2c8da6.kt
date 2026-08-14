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
 * thub_app/properties/permissions/properties/packages.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-reopened/properties/issue/properties/performed_via_gi
 * thub_app/properties/permissions/properties/packages
 */
@Serializable(with = InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPackagesX8d2c8da6.Serializer::class)
public sealed class InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPackagesX8d2c8da6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPackagesX8d2c8da6() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPackagesX8d2c8da6() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPackagesX8d2c8da6()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPackagesX8d2c8da6 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPackagesX8d2c8da6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPackagesX8d2c8da6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPackagesX8d2c8da6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPackagesX8d2c8da6) {
      encoder.encodeString(value.value)
    }
  }
}
