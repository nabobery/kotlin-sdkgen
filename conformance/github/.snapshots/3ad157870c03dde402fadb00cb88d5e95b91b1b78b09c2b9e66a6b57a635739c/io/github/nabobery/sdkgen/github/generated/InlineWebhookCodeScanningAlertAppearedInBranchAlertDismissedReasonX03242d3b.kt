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
 * The reason for dismissing or closing the alert.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-appeared-in-branch/properties/alert/prop
 * erties/dismissed_reason
 */
@Serializable(with = InlineWebhookCodeScanningAlertAppearedInBranchAlertDismissedReasonX03242d3b.Serializer::class)
public sealed class InlineWebhookCodeScanningAlertAppearedInBranchAlertDismissedReasonX03242d3b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `false positive`.
   */
  public data object FalsePositive : InlineWebhookCodeScanningAlertAppearedInBranchAlertDismissedReasonX03242d3b() {
    public override val `value`: String = "false positive"
  }

  /**
   * Documented value. Wire value: `won't fix`.
   */
  public data object WonTFix : InlineWebhookCodeScanningAlertAppearedInBranchAlertDismissedReasonX03242d3b() {
    public override val `value`: String = "won't fix"
  }

  /**
   * Documented value. Wire value: `used in tests`.
   */
  public data object UsedInTests : InlineWebhookCodeScanningAlertAppearedInBranchAlertDismissedReasonX03242d3b() {
    public override val `value`: String = "used in tests"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCodeScanningAlertAppearedInBranchAlertDismissedReasonX03242d3b()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCodeScanningAlertAppearedInBranchAlertDismissedReasonX03242d3b = when (value) {
      FalsePositive.value -> FalsePositive
      WonTFix.value -> WonTFix
      UsedInTests.value -> UsedInTests
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCodeScanningAlertAppearedInBranchAlertDismissedReasonX03242d3b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookCodeScanningAlertAppearedInBranchAlertDismissedReasonX03242d3b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAlertAppearedInBranchAlertDismissedReasonX03242d3b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAlertAppearedInBranchAlertDismissedReasonX03242d3b) {
      encoder.encodeString(value.value)
    }
  }
}
