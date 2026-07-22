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
 * The reason for dismissing or closing the alert.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-fixed/properties/alert/properties/dismis
 * sed_reason
 */
@Serializable(with = InlineWebhookCodeScanningAlertFixedAlertDismissedReasonXece79ab1.Serializer::class)
public sealed class InlineWebhookCodeScanningAlertFixedAlertDismissedReasonXece79ab1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `false positive`.
   */
  public data object FalsePositive : InlineWebhookCodeScanningAlertFixedAlertDismissedReasonXece79ab1() {
    public override val `value`: String = "false positive"
  }

  /**
   * Documented value. Wire value: `won't fix`.
   */
  public data object WonTFix : InlineWebhookCodeScanningAlertFixedAlertDismissedReasonXece79ab1() {
    public override val `value`: String = "won't fix"
  }

  /**
   * Documented value. Wire value: `used in tests`.
   */
  public data object UsedInTests : InlineWebhookCodeScanningAlertFixedAlertDismissedReasonXece79ab1() {
    public override val `value`: String = "used in tests"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCodeScanningAlertFixedAlertDismissedReasonXece79ab1()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCodeScanningAlertFixedAlertDismissedReasonXece79ab1 = when (value) {
      FalsePositive.value -> FalsePositive
      WonTFix.value -> WonTFix
      UsedInTests.value -> UsedInTests
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookCodeScanningAlertFixedAlertDismissedReasonXece79ab1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookCodeScanningAlertFixedAlertDismissedReasonXece79ab1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAlertFixedAlertDismissedReasonXece79ab1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAlertFixedAlertDismissedReasonXece79ab1) {
      encoder.encodeString(value.value)
    }
  }
}
