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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-appeared-in-branch/properties/alert/prop
 * erties/rule/properties/severity
 */
@Serializable(with = InlineWebhookCodeScanningAlertAppearedInBranchAlertRuleSeverityX3b0a87ba.Serializer::class)
public sealed class InlineWebhookCodeScanningAlertAppearedInBranchAlertRuleSeverityX3b0a87ba {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineWebhookCodeScanningAlertAppearedInBranchAlertRuleSeverityX3b0a87ba() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `note`.
   */
  public data object Note : InlineWebhookCodeScanningAlertAppearedInBranchAlertRuleSeverityX3b0a87ba() {
    public override val `value`: String = "note"
  }

  /**
   * Documented value. Wire value: `warning`.
   */
  public data object Warning : InlineWebhookCodeScanningAlertAppearedInBranchAlertRuleSeverityX3b0a87ba() {
    public override val `value`: String = "warning"
  }

  /**
   * Documented value. Wire value: `error`.
   */
  public data object Error : InlineWebhookCodeScanningAlertAppearedInBranchAlertRuleSeverityX3b0a87ba() {
    public override val `value`: String = "error"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCodeScanningAlertAppearedInBranchAlertRuleSeverityX3b0a87ba()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCodeScanningAlertAppearedInBranchAlertRuleSeverityX3b0a87ba = when (value) {
      None.value -> None
      Note.value -> Note
      Warning.value -> Warning
      Error.value -> Error
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCodeScanningAlertAppearedInBranchAlertRuleSeverityX3b0a87ba> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookCodeScanningAlertAppearedInBranchAlertRuleSeverityX3b0a87ba", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAlertAppearedInBranchAlertRuleSeverityX3b0a87ba = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAlertAppearedInBranchAlertRuleSeverityX3b0a87ba) {
      encoder.encodeString(value.value)
    }
  }
}
