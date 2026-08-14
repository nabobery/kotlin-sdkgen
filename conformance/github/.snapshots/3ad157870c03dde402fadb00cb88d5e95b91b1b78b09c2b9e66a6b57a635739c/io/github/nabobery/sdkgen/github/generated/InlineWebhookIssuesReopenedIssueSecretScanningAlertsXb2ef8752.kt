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
 * thub_app/properties/permissions/properties/secret_scanning_alerts.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-reopened/properties/issue/properties/performed_via_gi
 * thub_app/properties/permissions/properties/secret_scanning_alerts
 */
@Serializable(with = InlineWebhookIssuesReopenedIssueSecretScanningAlertsXb2ef8752.Serializer::class)
public sealed class InlineWebhookIssuesReopenedIssueSecretScanningAlertsXb2ef8752 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesReopenedIssueSecretScanningAlertsXb2ef8752() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesReopenedIssueSecretScanningAlertsXb2ef8752() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesReopenedIssueSecretScanningAlertsXb2ef8752()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesReopenedIssueSecretScanningAlertsXb2ef8752 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesReopenedIssueSecretScanningAlertsXb2ef8752> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesReopenedIssueSecretScanningAlertsXb2ef8752", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesReopenedIssueSecretScanningAlertsXb2ef8752 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesReopenedIssueSecretScanningAlertsXb2ef8752) {
      encoder.encodeString(value.value)
    }
  }
}
