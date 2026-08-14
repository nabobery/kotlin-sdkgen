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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-closed-by-user/properties/alert/properti
 * es/dismissed_reason
 */
@Serializable(with = InlineWebhookCodeScanningAlertClosedByUserAlertDismissedReasonX61954461.Serializer::class)
public sealed class InlineWebhookCodeScanningAlertClosedByUserAlertDismissedReasonX61954461 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `false positive`.
   */
  public data object FalsePositive : InlineWebhookCodeScanningAlertClosedByUserAlertDismissedReasonX61954461() {
    public override val `value`: String = "false positive"
  }

  /**
   * Documented value. Wire value: `won't fix`.
   */
  public data object WonTFix : InlineWebhookCodeScanningAlertClosedByUserAlertDismissedReasonX61954461() {
    public override val `value`: String = "won't fix"
  }

  /**
   * Documented value. Wire value: `used in tests`.
   */
  public data object UsedInTests : InlineWebhookCodeScanningAlertClosedByUserAlertDismissedReasonX61954461() {
    public override val `value`: String = "used in tests"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCodeScanningAlertClosedByUserAlertDismissedReasonX61954461()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCodeScanningAlertClosedByUserAlertDismissedReasonX61954461 = when (value) {
      FalsePositive.value -> FalsePositive
      WonTFix.value -> WonTFix
      UsedInTests.value -> UsedInTests
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCodeScanningAlertClosedByUserAlertDismissedReasonX61954461> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookCodeScanningAlertClosedByUserAlertDismissedReasonX61954461", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAlertClosedByUserAlertDismissedReasonX61954461 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAlertClosedByUserAlertDismissedReasonX61954461) {
      encoder.encodeString(value.value)
    }
  }
}
