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
 * Severity of a code scanning alert.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-alert-severity
 */
@Serializable(with = CodeScanningAlertSeverity.Serializer::class)
public sealed class CodeScanningAlertSeverity {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `critical`.
   */
  public data object Critical : CodeScanningAlertSeverity() {
    public override val `value`: String = "critical"
  }

  /**
   * Documented value. Wire value: `high`.
   */
  public data object High : CodeScanningAlertSeverity() {
    public override val `value`: String = "high"
  }

  /**
   * Documented value. Wire value: `medium`.
   */
  public data object Medium : CodeScanningAlertSeverity() {
    public override val `value`: String = "medium"
  }

  /**
   * Documented value. Wire value: `low`.
   */
  public data object Low : CodeScanningAlertSeverity() {
    public override val `value`: String = "low"
  }

  /**
   * Documented value. Wire value: `warning`.
   */
  public data object Warning : CodeScanningAlertSeverity() {
    public override val `value`: String = "warning"
  }

  /**
   * Documented value. Wire value: `note`.
   */
  public data object Note : CodeScanningAlertSeverity() {
    public override val `value`: String = "note"
  }

  /**
   * Documented value. Wire value: `error`.
   */
  public data object Error : CodeScanningAlertSeverity() {
    public override val `value`: String = "error"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : CodeScanningAlertSeverity()

  public companion object {
    public fun fromValue(`value`: String): CodeScanningAlertSeverity = when (value) {
      Critical.value -> Critical
      High.value -> High
      Medium.value -> Medium
      Low.value -> Low
      Warning.value -> Warning
      Note.value -> Note
      Error.value -> Error
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<CodeScanningAlertSeverity> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.CodeScanningAlertSeverity", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): CodeScanningAlertSeverity = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: CodeScanningAlertSeverity) {
      encoder.encodeString(value.value)
    }
  }
}
