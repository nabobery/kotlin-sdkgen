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
 * Reason given by cardholder for dispute.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_dispute_opened/properties/reas
 * on
 */
@Serializable(with = InlineInsightsResourcesPaymentEvaluationDisputeOpenedReasonX5af9f06c.Serializer::class)
public sealed class InlineInsightsResourcesPaymentEvaluationDisputeOpenedReasonX5af9f06c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `account_not_available`.
   */
  public data object AccountNotAvailable : InlineInsightsResourcesPaymentEvaluationDisputeOpenedReasonX5af9f06c() {
    public override val `value`: String = "account_not_available"
  }

  /**
   * Documented value. Wire value: `credit_not_processed`.
   */
  public data object CreditNotProcessed : InlineInsightsResourcesPaymentEvaluationDisputeOpenedReasonX5af9f06c() {
    public override val `value`: String = "credit_not_processed"
  }

  /**
   * Documented value. Wire value: `customer_initiated`.
   */
  public data object CustomerInitiated : InlineInsightsResourcesPaymentEvaluationDisputeOpenedReasonX5af9f06c() {
    public override val `value`: String = "customer_initiated"
  }

  /**
   * Documented value. Wire value: `duplicate`.
   */
  public data object Duplicate : InlineInsightsResourcesPaymentEvaluationDisputeOpenedReasonX5af9f06c() {
    public override val `value`: String = "duplicate"
  }

  /**
   * Documented value. Wire value: `fraudulent`.
   */
  public data object Fraudulent : InlineInsightsResourcesPaymentEvaluationDisputeOpenedReasonX5af9f06c() {
    public override val `value`: String = "fraudulent"
  }

  /**
   * Documented value. Wire value: `general`.
   */
  public data object General : InlineInsightsResourcesPaymentEvaluationDisputeOpenedReasonX5af9f06c() {
    public override val `value`: String = "general"
  }

  /**
   * Documented value. Wire value: `noncompliant`.
   */
  public data object Noncompliant : InlineInsightsResourcesPaymentEvaluationDisputeOpenedReasonX5af9f06c() {
    public override val `value`: String = "noncompliant"
  }

  /**
   * Documented value. Wire value: `product_not_received`.
   */
  public data object ProductNotReceived : InlineInsightsResourcesPaymentEvaluationDisputeOpenedReasonX5af9f06c() {
    public override val `value`: String = "product_not_received"
  }

  /**
   * Documented value. Wire value: `product_unacceptable`.
   */
  public data object ProductUnacceptable : InlineInsightsResourcesPaymentEvaluationDisputeOpenedReasonX5af9f06c() {
    public override val `value`: String = "product_unacceptable"
  }

  /**
   * Documented value. Wire value: `subscription_canceled`.
   */
  public data object SubscriptionCanceled : InlineInsightsResourcesPaymentEvaluationDisputeOpenedReasonX5af9f06c() {
    public override val `value`: String = "subscription_canceled"
  }

  /**
   * Documented value. Wire value: `unrecognized`.
   */
  public data object Unrecognized : InlineInsightsResourcesPaymentEvaluationDisputeOpenedReasonX5af9f06c() {
    public override val `value`: String = "unrecognized"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInsightsResourcesPaymentEvaluationDisputeOpenedReasonX5af9f06c()

  public companion object {
    public fun fromValue(`value`: String): InlineInsightsResourcesPaymentEvaluationDisputeOpenedReasonX5af9f06c = when (value) {
      AccountNotAvailable.value -> AccountNotAvailable
      CreditNotProcessed.value -> CreditNotProcessed
      CustomerInitiated.value -> CustomerInitiated
      Duplicate.value -> Duplicate
      Fraudulent.value -> Fraudulent
      General.value -> General
      Noncompliant.value -> Noncompliant
      ProductNotReceived.value -> ProductNotReceived
      ProductUnacceptable.value -> ProductUnacceptable
      SubscriptionCanceled.value -> SubscriptionCanceled
      Unrecognized.value -> Unrecognized
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineInsightsResourcesPaymentEvaluationDisputeOpenedReasonX5af9f06c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineInsightsResourcesPaymentEvaluationDisputeOpenedReasonX5af9f06c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInsightsResourcesPaymentEvaluationDisputeOpenedReasonX5af9f06c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInsightsResourcesPaymentEvaluationDisputeOpenedReasonX5af9f06c) {
      encoder.encodeString(value.value)
    }
  }
}
