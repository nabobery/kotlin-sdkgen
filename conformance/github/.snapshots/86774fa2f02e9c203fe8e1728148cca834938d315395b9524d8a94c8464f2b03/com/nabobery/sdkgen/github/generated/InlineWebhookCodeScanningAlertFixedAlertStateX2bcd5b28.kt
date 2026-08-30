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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-fixed/properties/alert/properties/state
 */
@Serializable(with = InlineWebhookCodeScanningAlertFixedAlertStateX2bcd5b28.Serializer::class)
public sealed class InlineWebhookCodeScanningAlertFixedAlertStateX2bcd5b28 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `fixed`.
   */
  public data object Fixed : InlineWebhookCodeScanningAlertFixedAlertStateX2bcd5b28() {
    public override val `value`: String = "fixed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCodeScanningAlertFixedAlertStateX2bcd5b28()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCodeScanningAlertFixedAlertStateX2bcd5b28 = when (value) {
      Fixed.value -> Fixed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCodeScanningAlertFixedAlertStateX2bcd5b28> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookCodeScanningAlertFixedAlertStateX2bcd5b28", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAlertFixedAlertStateX2bcd5b28 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAlertFixedAlertStateX2bcd5b28) {
      encoder.encodeString(value.value)
    }
  }
}
