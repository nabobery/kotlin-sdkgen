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
 * Possible values are `incomplete`, `incomplete_expired`, `trialing`, `active`, `past_due`, `canceled`, `unpaid`, or
 * `paused`.
 *
 * For `collection_method=charge_automatically` a subscription moves into `incomplete` if the initial payment attempt
 * fails. A subscription in this status can only have metadata and default_source updated. Once the first invoice is
 * paid, the subscription moves into an `active` status. If the first invoice is not paid within 23 hours, the
 * subscription transitions to `incomplete_expired`. This is a terminal status, the open invoice will be voided and no
 * further invoices will be generated.
 *
 * A subscription that is currently in a trial period is `trialing` and moves to `active` when the trial period is over.
 *
 * A subscription can only enter a `paused` status [when a trial ends without a payment
 * method](https://docs.stripe.com/billing/subscriptions/trials#create-free-trials-without-payment). A `paused`
 * subscription doesn't generate invoices and can be resumed after your customer adds their payment method. The `paused`
 * status is different from [pausing collection](https://docs.stripe.com/billing/subscriptions/pause-payment), which
 * still generates invoices and leaves the subscription's status unchanged.
 *
 * If subscription `collection_method=charge_automatically`, it becomes `past_due` when payment is required but cannot
 * be paid (due to failed payment or awaiting additional user actions). Once Stripe has exhausted all payment retry
 * attempts, the subscription will become `canceled` or `unpaid` (depending on your subscriptions settings).
 *
 * If subscription `collection_method=send_invoice` it becomes `past_due` when its invoice is not paid by the due date,
 * and `canceled` or `unpaid` if it is still not paid by an additional deadline after that. Note that when a
 * subscription has a status of `unpaid`, no subsequent invoices will be attempted (invoices will be created, but then
 * immediately automatically closed). After receiving updated payment information from a customer, you may choose to
 * reopen and pay their closed invoices.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription/properties/status
 */
@Serializable(with = InlineSubscriptionStatusXc06e66c3.Serializer::class)
public sealed class InlineSubscriptionStatusXc06e66c3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineSubscriptionStatusXc06e66c3() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `canceled`.
   */
  public data object Canceled : InlineSubscriptionStatusXc06e66c3() {
    public override val `value`: String = "canceled"
  }

  /**
   * Documented value. Wire value: `incomplete`.
   */
  public data object Incomplete : InlineSubscriptionStatusXc06e66c3() {
    public override val `value`: String = "incomplete"
  }

  /**
   * Documented value. Wire value: `incomplete_expired`.
   */
  public data object IncompleteExpired : InlineSubscriptionStatusXc06e66c3() {
    public override val `value`: String = "incomplete_expired"
  }

  /**
   * Documented value. Wire value: `past_due`.
   */
  public data object PastDue : InlineSubscriptionStatusXc06e66c3() {
    public override val `value`: String = "past_due"
  }

  /**
   * Documented value. Wire value: `paused`.
   */
  public data object Paused : InlineSubscriptionStatusXc06e66c3() {
    public override val `value`: String = "paused"
  }

  /**
   * Documented value. Wire value: `trialing`.
   */
  public data object Trialing : InlineSubscriptionStatusXc06e66c3() {
    public override val `value`: String = "trialing"
  }

  /**
   * Documented value. Wire value: `unpaid`.
   */
  public data object Unpaid : InlineSubscriptionStatusXc06e66c3() {
    public override val `value`: String = "unpaid"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSubscriptionStatusXc06e66c3()

  public companion object {
    public fun fromValue(`value`: String): InlineSubscriptionStatusXc06e66c3 = when (value) {
      Active.value -> Active
      Canceled.value -> Canceled
      Incomplete.value -> Incomplete
      IncompleteExpired.value -> IncompleteExpired
      PastDue.value -> PastDue
      Paused.value -> Paused
      Trialing.value -> Trialing
      Unpaid.value -> Unpaid
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSubscriptionStatusXc06e66c3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineSubscriptionStatusXc06e66c3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSubscriptionStatusXc06e66c3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionStatusXc06e66c3) {
      encoder.encodeString(value.value)
    }
  }
}
