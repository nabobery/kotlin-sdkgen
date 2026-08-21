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
 * **Required when the state is dismissed.** The reason for dismissing or closing the alert.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-alert-dismissed-reason
 */
@Serializable(with = CodeScanningAlertDismissedReason.Serializer::class)
public sealed class CodeScanningAlertDismissedReason {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `false positive`.
   */
  public data object FalsePositive : CodeScanningAlertDismissedReason() {
    public override val `value`: String = "false positive"
  }

  /**
   * Documented value. Wire value: `won't fix`.
   */
  public data object WonTFix : CodeScanningAlertDismissedReason() {
    public override val `value`: String = "won't fix"
  }

  /**
   * Documented value. Wire value: `used in tests`.
   */
  public data object UsedInTests : CodeScanningAlertDismissedReason() {
    public override val `value`: String = "used in tests"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : CodeScanningAlertDismissedReason()

  public companion object {
    public fun fromValue(`value`: String): CodeScanningAlertDismissedReason = when (value) {
      FalsePositive.value -> FalsePositive
      WonTFix.value -> WonTFix
      UsedInTests.value -> UsedInTests
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<CodeScanningAlertDismissedReason> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.CodeScanningAlertDismissedReason", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): CodeScanningAlertDismissedReason = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: CodeScanningAlertDismissedReason) {
      encoder.encodeString(value.value)
    }
  }
}
