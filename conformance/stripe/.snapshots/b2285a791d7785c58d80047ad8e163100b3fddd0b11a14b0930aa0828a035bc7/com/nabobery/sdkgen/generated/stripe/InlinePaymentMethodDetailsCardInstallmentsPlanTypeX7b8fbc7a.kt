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
 * Type of installment plan, one of `fixed_count`, `bonus`, or `revolving`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_method_details_card_installments_plan/properties/type
 */
@Serializable(with = InlinePaymentMethodDetailsCardInstallmentsPlanTypeX7b8fbc7a.Serializer::class)
public sealed class InlinePaymentMethodDetailsCardInstallmentsPlanTypeX7b8fbc7a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `bonus`.
   */
  public data object Bonus : InlinePaymentMethodDetailsCardInstallmentsPlanTypeX7b8fbc7a() {
    public override val `value`: String = "bonus"
  }

  /**
   * Documented value. Wire value: `fixed_count`.
   */
  public data object FixedCount : InlinePaymentMethodDetailsCardInstallmentsPlanTypeX7b8fbc7a() {
    public override val `value`: String = "fixed_count"
  }

  /**
   * Documented value. Wire value: `revolving`.
   */
  public data object Revolving : InlinePaymentMethodDetailsCardInstallmentsPlanTypeX7b8fbc7a() {
    public override val `value`: String = "revolving"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodDetailsCardInstallmentsPlanTypeX7b8fbc7a()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodDetailsCardInstallmentsPlanTypeX7b8fbc7a = when (value) {
      Bonus.value -> Bonus
      FixedCount.value -> FixedCount
      Revolving.value -> Revolving
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePaymentMethodDetailsCardInstallmentsPlanTypeX7b8fbc7a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodDetailsCardInstallmentsPlanTypeX7b8fbc7a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodDetailsCardInstallmentsPlanTypeX7b8fbc7a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodDetailsCardInstallmentsPlanTypeX7b8fbc7a) {
      encoder.encodeString(value.value)
    }
  }
}
