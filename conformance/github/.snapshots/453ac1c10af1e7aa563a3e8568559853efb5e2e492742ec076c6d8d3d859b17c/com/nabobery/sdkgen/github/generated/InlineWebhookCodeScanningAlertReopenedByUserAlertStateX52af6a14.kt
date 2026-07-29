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
 * State of a code scanning alert. Events for alerts found outside the default branch will return a `null` value until
 * they are dismissed or fixed.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-reopened-by-user/properties/alert/proper
 * ties/state
 */
@Serializable(with = InlineWebhookCodeScanningAlertReopenedByUserAlertStateX52af6a14.Serializer::class)
public sealed class InlineWebhookCodeScanningAlertReopenedByUserAlertStateX52af6a14 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookCodeScanningAlertReopenedByUserAlertStateX52af6a14() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `fixed`.
   */
  public data object Fixed : InlineWebhookCodeScanningAlertReopenedByUserAlertStateX52af6a14() {
    public override val `value`: String = "fixed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCodeScanningAlertReopenedByUserAlertStateX52af6a14()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCodeScanningAlertReopenedByUserAlertStateX52af6a14 = when (value) {
      Open.value -> Open
      Fixed.value -> Fixed
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookCodeScanningAlertReopenedByUserAlertStateX52af6a14> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookCodeScanningAlertReopenedByUserAlertStateX52af6a14", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAlertReopenedByUserAlertStateX52af6a14 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAlertReopenedByUserAlertStateX52af6a14) {
      encoder.encodeString(value.value)
    }
  }
}
