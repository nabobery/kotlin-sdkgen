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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-alert-rule-summary/properties/severity
 */
@Serializable(with = InlineCodeScanningAlertRuleSummarySeverityX8d449552.Serializer::class)
public sealed class InlineCodeScanningAlertRuleSummarySeverityX8d449552 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineCodeScanningAlertRuleSummarySeverityX8d449552() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `note`.
   */
  public data object Note : InlineCodeScanningAlertRuleSummarySeverityX8d449552() {
    public override val `value`: String = "note"
  }

  /**
   * Documented value. Wire value: `warning`.
   */
  public data object Warning : InlineCodeScanningAlertRuleSummarySeverityX8d449552() {
    public override val `value`: String = "warning"
  }

  /**
   * Documented value. Wire value: `error`.
   */
  public data object Error : InlineCodeScanningAlertRuleSummarySeverityX8d449552() {
    public override val `value`: String = "error"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeScanningAlertRuleSummarySeverityX8d449552()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeScanningAlertRuleSummarySeverityX8d449552 = when (value) {
      None.value -> None
      Note.value -> Note
      Warning.value -> Warning
      Error.value -> Error
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineCodeScanningAlertRuleSummarySeverityX8d449552> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCodeScanningAlertRuleSummarySeverityX8d449552", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeScanningAlertRuleSummarySeverityX8d449552 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeScanningAlertRuleSummarySeverityX8d449552) {
      encoder.encodeString(value.value)
    }
  }
}
