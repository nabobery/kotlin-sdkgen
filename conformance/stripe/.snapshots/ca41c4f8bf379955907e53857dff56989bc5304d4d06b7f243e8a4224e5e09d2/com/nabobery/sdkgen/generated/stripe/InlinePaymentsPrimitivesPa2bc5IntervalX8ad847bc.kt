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
 * their credit card. One of `month`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payments_primitives_payment_records_resource_payment_method_card_det
 * ails_resource_installment_plan/properties/interval
 */
@Serializable(with = InlinePaymentsPrimitivesPa2bc5IntervalX8ad847bc.Serializer::class)
public sealed class InlinePaymentsPrimitivesPa2bc5IntervalX8ad847bc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `month`.
   */
  public data object Month : InlinePaymentsPrimitivesPa2bc5IntervalX8ad847bc() {
    public override val `value`: String = "month"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentsPrimitivesPa2bc5IntervalX8ad847bc()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentsPrimitivesPa2bc5IntervalX8ad847bc = when (value) {
      Month.value -> Month
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentsPrimitivesPa2bc5IntervalX8ad847bc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentsPrimitivesPa2bc5IntervalX8ad847bc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentsPrimitivesPa2bc5IntervalX8ad847bc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentsPrimitivesPa2bc5IntervalX8ad847bc) {
      encoder.encodeString(value.value)
    }
  }
}
