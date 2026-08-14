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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-reopened-by-user/properties/alert/proper
 * ties/rule/properties/severity
 */
@Serializable(with = InlineWebhookCodeScanningAlertReopenedByUserAlertRuleSeverityX9d4f9b42.Serializer::class)
public sealed class InlineWebhookCodeScanningAlertReopenedByUserAlertRuleSeverityX9d4f9b42 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineWebhookCodeScanningAlertReopenedByUserAlertRuleSeverityX9d4f9b42() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `note`.
   */
  public data object Note : InlineWebhookCodeScanningAlertReopenedByUserAlertRuleSeverityX9d4f9b42() {
    public override val `value`: String = "note"
  }

  /**
   * Documented value. Wire value: `warning`.
   */
  public data object Warning : InlineWebhookCodeScanningAlertReopenedByUserAlertRuleSeverityX9d4f9b42() {
    public override val `value`: String = "warning"
  }

  /**
   * Documented value. Wire value: `error`.
   */
  public data object Error : InlineWebhookCodeScanningAlertReopenedByUserAlertRuleSeverityX9d4f9b42() {
    public override val `value`: String = "error"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCodeScanningAlertReopenedByUserAlertRuleSeverityX9d4f9b42()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCodeScanningAlertReopenedByUserAlertRuleSeverityX9d4f9b42 = when (value) {
      None.value -> None
      Note.value -> Note
      Warning.value -> Warning
      Error.value -> Error
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCodeScanningAlertReopenedByUserAlertRuleSeverityX9d4f9b42> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookCodeScanningAlertReopenedByUserAlertRuleSeverityX9d4f9b42", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAlertReopenedByUserAlertRuleSeverityX9d4f9b42 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAlertReopenedByUserAlertRuleSeverityX9d4f9b42) {
      encoder.encodeString(value.value)
    }
  }
}
