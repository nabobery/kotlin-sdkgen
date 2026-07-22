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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-alert-rule/properties/severity
 */
@Serializable(with = InlineCodeScanningAlertRuleSeverityX076d5005.Serializer::class)
public sealed class InlineCodeScanningAlertRuleSeverityX076d5005 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineCodeScanningAlertRuleSeverityX076d5005() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `note`.
   */
  public data object Note : InlineCodeScanningAlertRuleSeverityX076d5005() {
    public override val `value`: String = "note"
  }

  /**
   * Documented value. Wire value: `warning`.
   */
  public data object Warning : InlineCodeScanningAlertRuleSeverityX076d5005() {
    public override val `value`: String = "warning"
  }

  /**
   * Documented value. Wire value: `error`.
   */
  public data object Error : InlineCodeScanningAlertRuleSeverityX076d5005() {
    public override val `value`: String = "error"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeScanningAlertRuleSeverityX076d5005()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeScanningAlertRuleSeverityX076d5005 = when (value) {
      None.value -> None
      Note.value -> Note
      Warning.value -> Warning
      Error.value -> Error
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineCodeScanningAlertRuleSeverityX076d5005> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCodeScanningAlertRuleSeverityX076d5005", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeScanningAlertRuleSeverityX076d5005 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeScanningAlertRuleSeverityX076d5005) {
      encoder.encodeString(value.value)
    }
  }
}
