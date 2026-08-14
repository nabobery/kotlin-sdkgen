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
 * The severity of the alert.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-reopened/properties/alert/properties/rul
 * e/properties/severity
 */
@Serializable(with = InlineWebhookCodeScanningAlertReopenedAlertRuleSeverityX7af3bf20.Serializer::class)
public sealed class InlineWebhookCodeScanningAlertReopenedAlertRuleSeverityX7af3bf20 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineWebhookCodeScanningAlertReopenedAlertRuleSeverityX7af3bf20() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `note`.
   */
  public data object Note : InlineWebhookCodeScanningAlertReopenedAlertRuleSeverityX7af3bf20() {
    public override val `value`: String = "note"
  }

  /**
   * Documented value. Wire value: `warning`.
   */
  public data object Warning : InlineWebhookCodeScanningAlertReopenedAlertRuleSeverityX7af3bf20() {
    public override val `value`: String = "warning"
  }

  /**
   * Documented value. Wire value: `error`.
   */
  public data object Error : InlineWebhookCodeScanningAlertReopenedAlertRuleSeverityX7af3bf20() {
    public override val `value`: String = "error"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCodeScanningAlertReopenedAlertRuleSeverityX7af3bf20()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCodeScanningAlertReopenedAlertRuleSeverityX7af3bf20 = when (value) {
      None.value -> None
      Note.value -> Note
      Warning.value -> Warning
      Error.value -> Error
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCodeScanningAlertReopenedAlertRuleSeverityX7af3bf20> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookCodeScanningAlertReopenedAlertRuleSeverityX7af3bf20", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAlertReopenedAlertRuleSeverityX7af3bf20 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAlertReopenedAlertRuleSeverityX7af3bf20) {
      encoder.encodeString(value.value)
    }
  }
}
