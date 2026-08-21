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
 * Describes the type of payment.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_money_movement_card/properties
 * /payment_type
 */
@Serializable(with = InlineInsightsResourcesPaymentEvaluationMoneyMovementCardPaymentTypeX8c235b7f.Serializer::class)
public sealed class InlineInsightsResourcesPaymentEvaluationMoneyMovementCardPaymentTypeX8c235b7f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `one_off`.
   */
  public data object OneOff : InlineInsightsResourcesPaymentEvaluationMoneyMovementCardPaymentTypeX8c235b7f() {
    public override val `value`: String = "one_off"
  }

  /**
   * Documented value. Wire value: `recurring`.
   */
  public data object Recurring : InlineInsightsResourcesPaymentEvaluationMoneyMovementCardPaymentTypeX8c235b7f() {
    public override val `value`: String = "recurring"
  }

  /**
   * Documented value. Wire value: `setup_one_off`.
   */
  public data object SetupOneOff : InlineInsightsResourcesPaymentEvaluationMoneyMovementCardPaymentTypeX8c235b7f() {
    public override val `value`: String = "setup_one_off"
  }

  /**
   * Documented value. Wire value: `setup_recurring`.
   */
  public data object SetupRecurring : InlineInsightsResourcesPaymentEvaluationMoneyMovementCardPaymentTypeX8c235b7f() {
    public override val `value`: String = "setup_recurring"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInsightsResourcesPaymentEvaluationMoneyMovementCardPaymentTypeX8c235b7f()

  public companion object {
    public fun fromValue(`value`: String): InlineInsightsResourcesPaymentEvaluationMoneyMovementCardPaymentTypeX8c235b7f = when (value) {
      OneOff.value -> OneOff
      Recurring.value -> Recurring
      SetupOneOff.value -> SetupOneOff
      SetupRecurring.value -> SetupRecurring
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineInsightsResourcesPaymentEvaluationMoneyMovementCardPaymentTypeX8c235b7f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineInsightsResourcesPaymentEvaluationMoneyMovementCardPaymentTypeX8c235b7f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInsightsResourcesPaymentEvaluationMoneyMovementCardPaymentTypeX8c235b7f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInsightsResourcesPaymentEvaluationMoneyMovementCardPaymentTypeX8c235b7f) {
      encoder.encodeString(value.value)
    }
  }
}
