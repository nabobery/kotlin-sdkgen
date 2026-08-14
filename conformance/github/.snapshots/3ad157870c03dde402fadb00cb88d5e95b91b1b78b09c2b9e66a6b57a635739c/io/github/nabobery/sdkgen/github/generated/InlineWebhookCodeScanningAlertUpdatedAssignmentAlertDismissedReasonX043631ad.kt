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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-updated-assignment/properties/alert/prop
 * erties/dismissed_reason
 */
@Serializable(with = InlineWebhookCodeScanningAlertUpdatedAssignmentAlertDismissedReasonX043631ad.Serializer::class)
public sealed class InlineWebhookCodeScanningAlertUpdatedAssignmentAlertDismissedReasonX043631ad {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `false positive`.
   */
  public data object FalsePositive : InlineWebhookCodeScanningAlertUpdatedAssignmentAlertDismissedReasonX043631ad() {
    public override val `value`: String = "false positive"
  }

  /**
   * Documented value. Wire value: `won't fix`.
   */
  public data object WonTFix : InlineWebhookCodeScanningAlertUpdatedAssignmentAlertDismissedReasonX043631ad() {
    public override val `value`: String = "won't fix"
  }

  /**
   * Documented value. Wire value: `used in tests`.
   */
  public data object UsedInTests : InlineWebhookCodeScanningAlertUpdatedAssignmentAlertDismissedReasonX043631ad() {
    public override val `value`: String = "used in tests"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCodeScanningAlertUpdatedAssignmentAlertDismissedReasonX043631ad()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCodeScanningAlertUpdatedAssignmentAlertDismissedReasonX043631ad = when (value) {
      FalsePositive.value -> FalsePositive
      WonTFix.value -> WonTFix
      UsedInTests.value -> UsedInTests
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCodeScanningAlertUpdatedAssignmentAlertDismissedReasonX043631ad> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookCodeScanningAlertUpdatedAssignmentAlertDismissedReasonX043631ad", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAlertUpdatedAssignmentAlertDismissedReasonX043631ad = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAlertUpdatedAssignmentAlertDismissedReasonX043631ad) {
      encoder.encodeString(value.value)
    }
  }
}
