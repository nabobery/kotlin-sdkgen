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
 * The severity of the alert.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-closed-by-user/properties/alert/properti
 * es/rule/properties/severity
 */
@Serializable(with = InlineWebhookCodeScanningAlertClosedByUserAlertRuleSeverityXf39c96c9.Serializer::class)
public sealed class InlineWebhookCodeScanningAlertClosedByUserAlertRuleSeverityXf39c96c9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineWebhookCodeScanningAlertClosedByUserAlertRuleSeverityXf39c96c9() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `note`.
   */
  public data object Note : InlineWebhookCodeScanningAlertClosedByUserAlertRuleSeverityXf39c96c9() {
    public override val `value`: String = "note"
  }

  /**
   * Documented value. Wire value: `warning`.
   */
  public data object Warning : InlineWebhookCodeScanningAlertClosedByUserAlertRuleSeverityXf39c96c9() {
    public override val `value`: String = "warning"
  }

  /**
   * Documented value. Wire value: `error`.
   */
  public data object Error : InlineWebhookCodeScanningAlertClosedByUserAlertRuleSeverityXf39c96c9() {
    public override val `value`: String = "error"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCodeScanningAlertClosedByUserAlertRuleSeverityXf39c96c9()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCodeScanningAlertClosedByUserAlertRuleSeverityXf39c96c9 = when (value) {
      None.value -> None
      Note.value -> Note
      Warning.value -> Warning
      Error.value -> Error
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCodeScanningAlertClosedByUserAlertRuleSeverityXf39c96c9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookCodeScanningAlertClosedByUserAlertRuleSeverityXf39c96c9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAlertClosedByUserAlertRuleSeverityXf39c96c9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAlertClosedByUserAlertRuleSeverityXf39c96c9) {
      encoder.encodeString(value.value)
    }
  }
}
