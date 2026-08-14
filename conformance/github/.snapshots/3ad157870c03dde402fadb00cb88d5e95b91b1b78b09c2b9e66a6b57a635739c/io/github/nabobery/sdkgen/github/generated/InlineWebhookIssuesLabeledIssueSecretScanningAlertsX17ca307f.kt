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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-labeled/properties/issue/properties/performed_via_git
 * hub_app/properties/permissions/properties/secret_scanning_alerts.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-labeled/properties/issue/properties/performed_via_git
 * hub_app/properties/permissions/properties/secret_scanning_alerts
 */
@Serializable(with = InlineWebhookIssuesLabeledIssueSecretScanningAlertsX17ca307f.Serializer::class)
public sealed class InlineWebhookIssuesLabeledIssueSecretScanningAlertsX17ca307f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesLabeledIssueSecretScanningAlertsX17ca307f() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesLabeledIssueSecretScanningAlertsX17ca307f() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesLabeledIssueSecretScanningAlertsX17ca307f()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesLabeledIssueSecretScanningAlertsX17ca307f = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesLabeledIssueSecretScanningAlertsX17ca307f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesLabeledIssueSecretScanningAlertsX17ca307f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesLabeledIssueSecretScanningAlertsX17ca307f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesLabeledIssueSecretScanningAlertsX17ca307f) {
      encoder.encodeString(value.value)
    }
  }
}
