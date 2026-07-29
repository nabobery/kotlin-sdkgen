package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The exemption requested via 3DS and accepted by the issuer at authentication time.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payments_primitives_payment_records_resource_payment_method_card_det
 * ails_resource_three_d_secure/properties/exemption_indicator
 */
@Serializable(with = InlinePaymentsPrimitivesPabc9bExemptionIndicatorX00cd1440.Serializer::class)
public sealed class InlinePaymentsPrimitivesPabc9bExemptionIndicatorX00cd1440 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `low_risk`.
   */
  public data object LowRisk : InlinePaymentsPrimitivesPabc9bExemptionIndicatorX00cd1440() {
    public override val `value`: String = "low_risk"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlinePaymentsPrimitivesPabc9bExemptionIndicatorX00cd1440() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentsPrimitivesPabc9bExemptionIndicatorX00cd1440()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentsPrimitivesPabc9bExemptionIndicatorX00cd1440 = when (value) {
      LowRisk.value -> LowRisk
      None.value -> None
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePaymentsPrimitivesPabc9bExemptionIndicatorX00cd1440> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentsPrimitivesPabc9bExemptionIndicatorX00cd1440", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentsPrimitivesPabc9bExemptionIndicatorX00cd1440 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentsPrimitivesPabc9bExemptionIndicatorX00cd1440) {
      encoder.encodeString(value.value)
    }
  }
}
