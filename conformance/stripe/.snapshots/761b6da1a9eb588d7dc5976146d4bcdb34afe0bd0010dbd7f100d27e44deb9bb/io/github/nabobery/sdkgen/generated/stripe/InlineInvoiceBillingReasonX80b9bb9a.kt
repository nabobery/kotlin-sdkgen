package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Indicates the reason why the invoice was created.
 *
 * * `manual`: Unrelated to a subscription, for example, created via the invoice editor.
 * * `subscription`: No longer in use. Applies to subscriptions from before May 2018 where no distinction was made
 * between updates, cycles, and thresholds.
 * * `subscription_create`: A new subscription was created.
 * * `subscription_cycle`: A subscription advanced into a new period.
 * * `subscription_threshold`: A subscription reached a billing threshold.
 * * `subscription_update`: A subscription was updated.
 * * `upcoming`: Reserved for upcoming invoices created through the Create Preview Invoice API or when an
 * `invoice.upcoming` event is generated for an upcoming invoice on a subscription.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice/properties/billing_reason
 */
@Serializable(with = InlineInvoiceBillingReasonX80b9bb9a.Serializer::class)
public sealed class InlineInvoiceBillingReasonX80b9bb9a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `automatic_pending_invoice_item_invoice`.
   */
  public data object AutomaticPendingInvoiceItemInvoice : InlineInvoiceBillingReasonX80b9bb9a() {
    public override val `value`: String = "automatic_pending_invoice_item_invoice"
  }

  /**
   * Documented value. Wire value: `manual`.
   */
  public data object Manual : InlineInvoiceBillingReasonX80b9bb9a() {
    public override val `value`: String = "manual"
  }

  /**
   * Documented value. Wire value: `quote_accept`.
   */
  public data object QuoteAccept : InlineInvoiceBillingReasonX80b9bb9a() {
    public override val `value`: String = "quote_accept"
  }

  /**
   * Documented value. Wire value: `subscription`.
   */
  public data object Subscription : InlineInvoiceBillingReasonX80b9bb9a() {
    public override val `value`: String = "subscription"
  }

  /**
   * Documented value. Wire value: `subscription_create`.
   */
  public data object SubscriptionCreate : InlineInvoiceBillingReasonX80b9bb9a() {
    public override val `value`: String = "subscription_create"
  }

  /**
   * Documented value. Wire value: `subscription_cycle`.
   */
  public data object SubscriptionCycle : InlineInvoiceBillingReasonX80b9bb9a() {
    public override val `value`: String = "subscription_cycle"
  }

  /**
   * Documented value. Wire value: `subscription_threshold`.
   */
  public data object SubscriptionThreshold : InlineInvoiceBillingReasonX80b9bb9a() {
    public override val `value`: String = "subscription_threshold"
  }

  /**
   * Documented value. Wire value: `subscription_update`.
   */
  public data object SubscriptionUpdate : InlineInvoiceBillingReasonX80b9bb9a() {
    public override val `value`: String = "subscription_update"
  }

  /**
   * Documented value. Wire value: `upcoming`.
   */
  public data object Upcoming : InlineInvoiceBillingReasonX80b9bb9a() {
    public override val `value`: String = "upcoming"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInvoiceBillingReasonX80b9bb9a()

  public companion object {
    public fun fromValue(`value`: String): InlineInvoiceBillingReasonX80b9bb9a = when (value) {
      AutomaticPendingInvoiceItemInvoice.value -> AutomaticPendingInvoiceItemInvoice
      Manual.value -> Manual
      QuoteAccept.value -> QuoteAccept
      Subscription.value -> Subscription
      SubscriptionCreate.value -> SubscriptionCreate
      SubscriptionCycle.value -> SubscriptionCycle
      SubscriptionThreshold.value -> SubscriptionThreshold
      SubscriptionUpdate.value -> SubscriptionUpdate
      Upcoming.value -> Upcoming
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineInvoiceBillingReasonX80b9bb9a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineInvoiceBillingReasonX80b9bb9a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInvoiceBillingReasonX80b9bb9a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInvoiceBillingReasonX80b9bb9a) {
      encoder.encodeString(value.value)
    }
  }
}
