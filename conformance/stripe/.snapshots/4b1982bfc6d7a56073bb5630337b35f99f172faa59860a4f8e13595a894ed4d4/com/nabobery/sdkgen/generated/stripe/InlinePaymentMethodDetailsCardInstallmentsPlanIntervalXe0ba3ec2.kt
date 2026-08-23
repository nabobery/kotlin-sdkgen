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
 * For `fixed_count` installment plans, this is the interval between installment payments your customer will make to
 * their credit card.
 * One of `month`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_method_details_card_installments_plan/properties/interval
 */
@Serializable(with = InlinePaymentMethodDetailsCardInstallmentsPlanIntervalXe0ba3ec2.Serializer::class)
public sealed class InlinePaymentMethodDetailsCardInstallmentsPlanIntervalXe0ba3ec2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `month`.
   */
  public data object Month : InlinePaymentMethodDetailsCardInstallmentsPlanIntervalXe0ba3ec2() {
    public override val `value`: String = "month"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodDetailsCardInstallmentsPlanIntervalXe0ba3ec2()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodDetailsCardInstallmentsPlanIntervalXe0ba3ec2 = when (value) {
      Month.value -> Month
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodDetailsCardInstallmentsPlanIntervalXe0ba3ec2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodDetailsCardInstallmentsPlanIntervalXe0ba3ec2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodDetailsCardInstallmentsPlanIntervalXe0ba3ec2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodDetailsCardInstallmentsPlanIntervalXe0ba3ec2) {
      encoder.encodeString(value.value)
    }
  }
}
