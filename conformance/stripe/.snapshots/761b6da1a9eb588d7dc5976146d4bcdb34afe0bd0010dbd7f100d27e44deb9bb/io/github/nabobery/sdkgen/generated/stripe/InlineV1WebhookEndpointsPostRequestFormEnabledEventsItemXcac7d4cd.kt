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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1webhook_endpoints~1{webhook_endpoint}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/enabled_events/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1webhook_endpoints~1{webhook_endpoint}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/enabled_events/items
 */
@Serializable(with = InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd.Serializer::class)
public sealed class InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `*`.
   */
  public data object Value : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "*"
  }

  /**
   * Documented value. Wire value: `account.application.authorized`.
   */
  public data object AccountApplicationAuthorized : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "account.application.authorized"
  }

  /**
   * Documented value. Wire value: `account.application.deauthorized`.
   */
  public data object AccountApplicationDeauthorized : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "account.application.deauthorized"
  }

  /**
   * Documented value. Wire value: `account.external_account.created`.
   */
  public data object AccountExternalAccountCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "account.external_account.created"
  }

  /**
   * Documented value. Wire value: `account.external_account.deleted`.
   */
  public data object AccountExternalAccountDeleted : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "account.external_account.deleted"
  }

  /**
   * Documented value. Wire value: `account.external_account.updated`.
   */
  public data object AccountExternalAccountUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "account.external_account.updated"
  }

  /**
   * Documented value. Wire value: `account.updated`.
   */
  public data object AccountUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "account.updated"
  }

  /**
   * Documented value. Wire value: `application_fee.created`.
   */
  public data object ApplicationFeeCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "application_fee.created"
  }

  /**
   * Documented value. Wire value: `application_fee.refund.updated`.
   */
  public data object ApplicationFeeRefundUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "application_fee.refund.updated"
  }

  /**
   * Documented value. Wire value: `application_fee.refunded`.
   */
  public data object ApplicationFeeRefunded : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "application_fee.refunded"
  }

  /**
   * Documented value. Wire value: `balance.available`.
   */
  public data object BalanceAvailable : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "balance.available"
  }

  /**
   * Documented value. Wire value: `balance_settings.updated`.
   */
  public data object BalanceSettingsUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "balance_settings.updated"
  }

  /**
   * Documented value. Wire value: `billing.alert.triggered`.
   */
  public data object BillingAlertTriggered : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "billing.alert.triggered"
  }

  /**
   * Documented value. Wire value: `billing.credit_balance_transaction.created`.
   */
  public data object BillingCreditBalanceTransactionCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "billing.credit_balance_transaction.created"
  }

  /**
   * Documented value. Wire value: `billing.credit_grant.created`.
   */
  public data object BillingCreditGrantCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "billing.credit_grant.created"
  }

  /**
   * Documented value. Wire value: `billing.credit_grant.updated`.
   */
  public data object BillingCreditGrantUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "billing.credit_grant.updated"
  }

  /**
   * Documented value. Wire value: `billing.meter.created`.
   */
  public data object BillingMeterCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "billing.meter.created"
  }

  /**
   * Documented value. Wire value: `billing.meter.deactivated`.
   */
  public data object BillingMeterDeactivated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "billing.meter.deactivated"
  }

  /**
   * Documented value. Wire value: `billing.meter.reactivated`.
   */
  public data object BillingMeterReactivated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "billing.meter.reactivated"
  }

  /**
   * Documented value. Wire value: `billing.meter.updated`.
   */
  public data object BillingMeterUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "billing.meter.updated"
  }

  /**
   * Documented value. Wire value: `billing_portal.configuration.created`.
   */
  public data object BillingPortalConfigurationCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "billing_portal.configuration.created"
  }

  /**
   * Documented value. Wire value: `billing_portal.configuration.updated`.
   */
  public data object BillingPortalConfigurationUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "billing_portal.configuration.updated"
  }

  /**
   * Documented value. Wire value: `billing_portal.session.created`.
   */
  public data object BillingPortalSessionCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "billing_portal.session.created"
  }

  /**
   * Documented value. Wire value: `capability.updated`.
   */
  public data object CapabilityUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "capability.updated"
  }

  /**
   * Documented value. Wire value: `cash_balance.funds_available`.
   */
  public data object CashBalanceFundsAvailable : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "cash_balance.funds_available"
  }

  /**
   * Documented value. Wire value: `charge.captured`.
   */
  public data object ChargeCaptured : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "charge.captured"
  }

  /**
   * Documented value. Wire value: `charge.dispute.closed`.
   */
  public data object ChargeDisputeClosed : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "charge.dispute.closed"
  }

  /**
   * Documented value. Wire value: `charge.dispute.created`.
   */
  public data object ChargeDisputeCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "charge.dispute.created"
  }

  /**
   * Documented value. Wire value: `charge.dispute.funds_reinstated`.
   */
  public data object ChargeDisputeFundsReinstated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "charge.dispute.funds_reinstated"
  }

  /**
   * Documented value. Wire value: `charge.dispute.funds_withdrawn`.
   */
  public data object ChargeDisputeFundsWithdrawn : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "charge.dispute.funds_withdrawn"
  }

  /**
   * Documented value. Wire value: `charge.dispute.updated`.
   */
  public data object ChargeDisputeUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "charge.dispute.updated"
  }

  /**
   * Documented value. Wire value: `charge.expired`.
   */
  public data object ChargeExpired : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "charge.expired"
  }

  /**
   * Documented value. Wire value: `charge.failed`.
   */
  public data object ChargeFailed : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "charge.failed"
  }

  /**
   * Documented value. Wire value: `charge.pending`.
   */
  public data object ChargePending : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "charge.pending"
  }

  /**
   * Documented value. Wire value: `charge.refund.updated`.
   */
  public data object ChargeRefundUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "charge.refund.updated"
  }

  /**
   * Documented value. Wire value: `charge.refunded`.
   */
  public data object ChargeRefunded : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "charge.refunded"
  }

  /**
   * Documented value. Wire value: `charge.succeeded`.
   */
  public data object ChargeSucceeded : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "charge.succeeded"
  }

  /**
   * Documented value. Wire value: `charge.updated`.
   */
  public data object ChargeUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "charge.updated"
  }

  /**
   * Documented value. Wire value: `checkout.session.async_payment_failed`.
   */
  public data object CheckoutSessionAsyncPaymentFailed : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "checkout.session.async_payment_failed"
  }

  /**
   * Documented value. Wire value: `checkout.session.async_payment_succeeded`.
   */
  public data object CheckoutSessionAsyncPaymentSucceeded : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "checkout.session.async_payment_succeeded"
  }

  /**
   * Documented value. Wire value: `checkout.session.completed`.
   */
  public data object CheckoutSessionCompleted : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "checkout.session.completed"
  }

  /**
   * Documented value. Wire value: `checkout.session.expired`.
   */
  public data object CheckoutSessionExpired : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "checkout.session.expired"
  }

  /**
   * Documented value. Wire value: `climate.order.canceled`.
   */
  public data object ClimateOrderCanceled : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "climate.order.canceled"
  }

  /**
   * Documented value. Wire value: `climate.order.created`.
   */
  public data object ClimateOrderCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "climate.order.created"
  }

  /**
   * Documented value. Wire value: `climate.order.delayed`.
   */
  public data object ClimateOrderDelayed : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "climate.order.delayed"
  }

  /**
   * Documented value. Wire value: `climate.order.delivered`.
   */
  public data object ClimateOrderDelivered : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "climate.order.delivered"
  }

  /**
   * Documented value. Wire value: `climate.order.product_substituted`.
   */
  public data object ClimateOrderProductSubstituted : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "climate.order.product_substituted"
  }

  /**
   * Documented value. Wire value: `climate.product.created`.
   */
  public data object ClimateProductCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "climate.product.created"
  }

  /**
   * Documented value. Wire value: `climate.product.pricing_updated`.
   */
  public data object ClimateProductPricingUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "climate.product.pricing_updated"
  }

  /**
   * Documented value. Wire value: `coupon.created`.
   */
  public data object CouponCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "coupon.created"
  }

  /**
   * Documented value. Wire value: `coupon.deleted`.
   */
  public data object CouponDeleted : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "coupon.deleted"
  }

  /**
   * Documented value. Wire value: `coupon.updated`.
   */
  public data object CouponUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "coupon.updated"
  }

  /**
   * Documented value. Wire value: `credit_note.created`.
   */
  public data object CreditNoteCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "credit_note.created"
  }

  /**
   * Documented value. Wire value: `credit_note.updated`.
   */
  public data object CreditNoteUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "credit_note.updated"
  }

  /**
   * Documented value. Wire value: `credit_note.voided`.
   */
  public data object CreditNoteVoided : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "credit_note.voided"
  }

  /**
   * Documented value. Wire value: `customer.created`.
   */
  public data object CustomerCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "customer.created"
  }

  /**
   * Documented value. Wire value: `customer.deleted`.
   */
  public data object CustomerDeleted : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "customer.deleted"
  }

  /**
   * Documented value. Wire value: `customer.discount.created`.
   */
  public data object CustomerDiscountCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "customer.discount.created"
  }

  /**
   * Documented value. Wire value: `customer.discount.deleted`.
   */
  public data object CustomerDiscountDeleted : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "customer.discount.deleted"
  }

  /**
   * Documented value. Wire value: `customer.discount.updated`.
   */
  public data object CustomerDiscountUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "customer.discount.updated"
  }

  /**
   * Documented value. Wire value: `customer.source.created`.
   */
  public data object CustomerSourceCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "customer.source.created"
  }

  /**
   * Documented value. Wire value: `customer.source.deleted`.
   */
  public data object CustomerSourceDeleted : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "customer.source.deleted"
  }

  /**
   * Documented value. Wire value: `customer.source.expiring`.
   */
  public data object CustomerSourceExpiring : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "customer.source.expiring"
  }

  /**
   * Documented value. Wire value: `customer.source.updated`.
   */
  public data object CustomerSourceUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "customer.source.updated"
  }

  /**
   * Documented value. Wire value: `customer.subscription.created`.
   */
  public data object CustomerSubscriptionCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "customer.subscription.created"
  }

  /**
   * Documented value. Wire value: `customer.subscription.deleted`.
   */
  public data object CustomerSubscriptionDeleted : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "customer.subscription.deleted"
  }

  /**
   * Documented value. Wire value: `customer.subscription.paused`.
   */
  public data object CustomerSubscriptionPaused : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "customer.subscription.paused"
  }

  /**
   * Documented value. Wire value: `customer.subscription.pending_update_applied`.
   */
  public data object CustomerSubscriptionPendingUpdateApplied : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "customer.subscription.pending_update_applied"
  }

  /**
   * Documented value. Wire value: `customer.subscription.pending_update_expired`.
   */
  public data object CustomerSubscriptionPendingUpdateExpired : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "customer.subscription.pending_update_expired"
  }

  /**
   * Documented value. Wire value: `customer.subscription.resumed`.
   */
  public data object CustomerSubscriptionResumed : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "customer.subscription.resumed"
  }

  /**
   * Documented value. Wire value: `customer.subscription.trial_will_end`.
   */
  public data object CustomerSubscriptionTrialWillEnd : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "customer.subscription.trial_will_end"
  }

  /**
   * Documented value. Wire value: `customer.subscription.updated`.
   */
  public data object CustomerSubscriptionUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "customer.subscription.updated"
  }

  /**
   * Documented value. Wire value: `customer.tax_id.created`.
   */
  public data object CustomerTaxIdCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "customer.tax_id.created"
  }

  /**
   * Documented value. Wire value: `customer.tax_id.deleted`.
   */
  public data object CustomerTaxIdDeleted : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "customer.tax_id.deleted"
  }

  /**
   * Documented value. Wire value: `customer.tax_id.updated`.
   */
  public data object CustomerTaxIdUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "customer.tax_id.updated"
  }

  /**
   * Documented value. Wire value: `customer.updated`.
   */
  public data object CustomerUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "customer.updated"
  }

  /**
   * Documented value. Wire value: `customer_cash_balance_transaction.created`.
   */
  public data object CustomerCashBalanceTransactionCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "customer_cash_balance_transaction.created"
  }

  /**
   * Documented value. Wire value: `entitlements.active_entitlement_summary.updated`.
   */
  public data object EntitlementsActiveEntitlementSummaryUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "entitlements.active_entitlement_summary.updated"
  }

  /**
   * Documented value. Wire value: `file.created`.
   */
  public data object FileCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "file.created"
  }

  /**
   * Documented value. Wire value: `financial_connections.account.account_numbers_updated`.
   */
  public data object FinancialConnectionsAccountAccountNumbersUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "financial_connections.account.account_numbers_updated"
  }

  /**
   * Documented value. Wire value: `financial_connections.account.created`.
   */
  public data object FinancialConnectionsAccountCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "financial_connections.account.created"
  }

  /**
   * Documented value. Wire value: `financial_connections.account.deactivated`.
   */
  public data object FinancialConnectionsAccountDeactivated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "financial_connections.account.deactivated"
  }

  /**
   * Documented value. Wire value: `financial_connections.account.disconnected`.
   */
  public data object FinancialConnectionsAccountDisconnected : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "financial_connections.account.disconnected"
  }

  /**
   * Documented value. Wire value: `financial_connections.account.reactivated`.
   */
  public data object FinancialConnectionsAccountReactivated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "financial_connections.account.reactivated"
  }

  /**
   * Documented value. Wire value: `financial_connections.account.refreshed_balance`.
   */
  public data object FinancialConnectionsAccountRefreshedBalance : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "financial_connections.account.refreshed_balance"
  }

  /**
   * Documented value. Wire value: `financial_connections.account.refreshed_ownership`.
   */
  public data object FinancialConnectionsAccountRefreshedOwnership : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "financial_connections.account.refreshed_ownership"
  }

  /**
   * Documented value. Wire value: `financial_connections.account.refreshed_transactions`.
   */
  public data object FinancialConnectionsAccountRefreshedTransactions : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "financial_connections.account.refreshed_transactions"
  }

  /**
   * Documented value. Wire value: `financial_connections.account.upcoming_account_number_expiry`.
   */
  public data object FinancialConnectionsAccountUpcomingAccountNumberExpiry : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String =
        "financial_connections.account.upcoming_account_number_expiry"
  }

  /**
   * Documented value. Wire value: `identity.verification_session.canceled`.
   */
  public data object IdentityVerificationSessionCanceled : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "identity.verification_session.canceled"
  }

  /**
   * Documented value. Wire value: `identity.verification_session.created`.
   */
  public data object IdentityVerificationSessionCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "identity.verification_session.created"
  }

  /**
   * Documented value. Wire value: `identity.verification_session.processing`.
   */
  public data object IdentityVerificationSessionProcessing : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "identity.verification_session.processing"
  }

  /**
   * Documented value. Wire value: `identity.verification_session.redacted`.
   */
  public data object IdentityVerificationSessionRedacted : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "identity.verification_session.redacted"
  }

  /**
   * Documented value. Wire value: `identity.verification_session.requires_input`.
   */
  public data object IdentityVerificationSessionRequiresInput : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "identity.verification_session.requires_input"
  }

  /**
   * Documented value. Wire value: `identity.verification_session.verified`.
   */
  public data object IdentityVerificationSessionVerified : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "identity.verification_session.verified"
  }

  /**
   * Documented value. Wire value: `invoice.created`.
   */
  public data object InvoiceCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "invoice.created"
  }

  /**
   * Documented value. Wire value: `invoice.deleted`.
   */
  public data object InvoiceDeleted : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "invoice.deleted"
  }

  /**
   * Documented value. Wire value: `invoice.finalization_failed`.
   */
  public data object InvoiceFinalizationFailed : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "invoice.finalization_failed"
  }

  /**
   * Documented value. Wire value: `invoice.finalized`.
   */
  public data object InvoiceFinalized : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "invoice.finalized"
  }

  /**
   * Documented value. Wire value: `invoice.marked_uncollectible`.
   */
  public data object InvoiceMarkedUncollectible : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "invoice.marked_uncollectible"
  }

  /**
   * Documented value. Wire value: `invoice.overdue`.
   */
  public data object InvoiceOverdue : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "invoice.overdue"
  }

  /**
   * Documented value. Wire value: `invoice.overpaid`.
   */
  public data object InvoiceOverpaid : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "invoice.overpaid"
  }

  /**
   * Documented value. Wire value: `invoice.paid`.
   */
  public data object InvoicePaid : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "invoice.paid"
  }

  /**
   * Documented value. Wire value: `invoice.payment_action_required`.
   */
  public data object InvoicePaymentActionRequired : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "invoice.payment_action_required"
  }

  /**
   * Documented value. Wire value: `invoice.payment_attempt_required`.
   */
  public data object InvoicePaymentAttemptRequired : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "invoice.payment_attempt_required"
  }

  /**
   * Documented value. Wire value: `invoice.payment_failed`.
   */
  public data object InvoicePaymentFailed : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "invoice.payment_failed"
  }

  /**
   * Documented value. Wire value: `invoice.payment_succeeded`.
   */
  public data object InvoicePaymentSucceeded : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "invoice.payment_succeeded"
  }

  /**
   * Documented value. Wire value: `invoice.sent`.
   */
  public data object InvoiceSent : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "invoice.sent"
  }

  /**
   * Documented value. Wire value: `invoice.upcoming`.
   */
  public data object InvoiceUpcoming : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "invoice.upcoming"
  }

  /**
   * Documented value. Wire value: `invoice.updated`.
   */
  public data object InvoiceUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "invoice.updated"
  }

  /**
   * Documented value. Wire value: `invoice.voided`.
   */
  public data object InvoiceVoided : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "invoice.voided"
  }

  /**
   * Documented value. Wire value: `invoice.will_be_due`.
   */
  public data object InvoiceWillBeDue : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "invoice.will_be_due"
  }

  /**
   * Documented value. Wire value: `invoice_payment.paid`.
   */
  public data object InvoicePaymentPaid : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "invoice_payment.paid"
  }

  /**
   * Documented value. Wire value: `invoiceitem.created`.
   */
  public data object InvoiceitemCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "invoiceitem.created"
  }

  /**
   * Documented value. Wire value: `invoiceitem.deleted`.
   */
  public data object InvoiceitemDeleted : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "invoiceitem.deleted"
  }

  /**
   * Documented value. Wire value: `issuing_authorization.created`.
   */
  public data object IssuingAuthorizationCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "issuing_authorization.created"
  }

  /**
   * Documented value. Wire value: `issuing_authorization.request`.
   */
  public data object IssuingAuthorizationRequest : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "issuing_authorization.request"
  }

  /**
   * Documented value. Wire value: `issuing_authorization.updated`.
   */
  public data object IssuingAuthorizationUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "issuing_authorization.updated"
  }

  /**
   * Documented value. Wire value: `issuing_card.created`.
   */
  public data object IssuingCardCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "issuing_card.created"
  }

  /**
   * Documented value. Wire value: `issuing_card.updated`.
   */
  public data object IssuingCardUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "issuing_card.updated"
  }

  /**
   * Documented value. Wire value: `issuing_cardholder.created`.
   */
  public data object IssuingCardholderCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "issuing_cardholder.created"
  }

  /**
   * Documented value. Wire value: `issuing_cardholder.updated`.
   */
  public data object IssuingCardholderUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "issuing_cardholder.updated"
  }

  /**
   * Documented value. Wire value: `issuing_dispute.closed`.
   */
  public data object IssuingDisputeClosed : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "issuing_dispute.closed"
  }

  /**
   * Documented value. Wire value: `issuing_dispute.created`.
   */
  public data object IssuingDisputeCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "issuing_dispute.created"
  }

  /**
   * Documented value. Wire value: `issuing_dispute.funds_reinstated`.
   */
  public data object IssuingDisputeFundsReinstated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "issuing_dispute.funds_reinstated"
  }

  /**
   * Documented value. Wire value: `issuing_dispute.funds_rescinded`.
   */
  public data object IssuingDisputeFundsRescinded : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "issuing_dispute.funds_rescinded"
  }

  /**
   * Documented value. Wire value: `issuing_dispute.submitted`.
   */
  public data object IssuingDisputeSubmitted : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "issuing_dispute.submitted"
  }

  /**
   * Documented value. Wire value: `issuing_dispute.updated`.
   */
  public data object IssuingDisputeUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "issuing_dispute.updated"
  }

  /**
   * Documented value. Wire value: `issuing_personalization_design.activated`.
   */
  public data object IssuingPersonalizationDesignActivated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "issuing_personalization_design.activated"
  }

  /**
   * Documented value. Wire value: `issuing_personalization_design.deactivated`.
   */
  public data object IssuingPersonalizationDesignDeactivated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "issuing_personalization_design.deactivated"
  }

  /**
   * Documented value. Wire value: `issuing_personalization_design.rejected`.
   */
  public data object IssuingPersonalizationDesignRejected : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "issuing_personalization_design.rejected"
  }

  /**
   * Documented value. Wire value: `issuing_personalization_design.updated`.
   */
  public data object IssuingPersonalizationDesignUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "issuing_personalization_design.updated"
  }

  /**
   * Documented value. Wire value: `issuing_token.created`.
   */
  public data object IssuingTokenCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "issuing_token.created"
  }

  /**
   * Documented value. Wire value: `issuing_token.updated`.
   */
  public data object IssuingTokenUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "issuing_token.updated"
  }

  /**
   * Documented value. Wire value: `issuing_transaction.created`.
   */
  public data object IssuingTransactionCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "issuing_transaction.created"
  }

  /**
   * Documented value. Wire value: `issuing_transaction.purchase_details_receipt_updated`.
   */
  public data object IssuingTransactionPurchaseDetailsReceiptUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "issuing_transaction.purchase_details_receipt_updated"
  }

  /**
   * Documented value. Wire value: `issuing_transaction.updated`.
   */
  public data object IssuingTransactionUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "issuing_transaction.updated"
  }

  /**
   * Documented value. Wire value: `mandate.updated`.
   */
  public data object MandateUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "mandate.updated"
  }

  /**
   * Documented value. Wire value: `payment_intent.amount_capturable_updated`.
   */
  public data object PaymentIntentAmountCapturableUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "payment_intent.amount_capturable_updated"
  }

  /**
   * Documented value. Wire value: `payment_intent.canceled`.
   */
  public data object PaymentIntentCanceled : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "payment_intent.canceled"
  }

  /**
   * Documented value. Wire value: `payment_intent.created`.
   */
  public data object PaymentIntentCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "payment_intent.created"
  }

  /**
   * Documented value. Wire value: `payment_intent.partially_funded`.
   */
  public data object PaymentIntentPartiallyFunded : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "payment_intent.partially_funded"
  }

  /**
   * Documented value. Wire value: `payment_intent.payment_failed`.
   */
  public data object PaymentIntentPaymentFailed : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "payment_intent.payment_failed"
  }

  /**
   * Documented value. Wire value: `payment_intent.processing`.
   */
  public data object PaymentIntentProcessing : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "payment_intent.processing"
  }

  /**
   * Documented value. Wire value: `payment_intent.requires_action`.
   */
  public data object PaymentIntentRequiresAction : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "payment_intent.requires_action"
  }

  /**
   * Documented value. Wire value: `payment_intent.succeeded`.
   */
  public data object PaymentIntentSucceeded : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "payment_intent.succeeded"
  }

  /**
   * Documented value. Wire value: `payment_link.created`.
   */
  public data object PaymentLinkCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "payment_link.created"
  }

  /**
   * Documented value. Wire value: `payment_link.updated`.
   */
  public data object PaymentLinkUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "payment_link.updated"
  }

  /**
   * Documented value. Wire value: `payment_method.attached`.
   */
  public data object PaymentMethodAttached : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "payment_method.attached"
  }

  /**
   * Documented value. Wire value: `payment_method.automatically_updated`.
   */
  public data object PaymentMethodAutomaticallyUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "payment_method.automatically_updated"
  }

  /**
   * Documented value. Wire value: `payment_method.detached`.
   */
  public data object PaymentMethodDetached : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "payment_method.detached"
  }

  /**
   * Documented value. Wire value: `payment_method.updated`.
   */
  public data object PaymentMethodUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "payment_method.updated"
  }

  /**
   * Documented value. Wire value: `payout.canceled`.
   */
  public data object PayoutCanceled : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "payout.canceled"
  }

  /**
   * Documented value. Wire value: `payout.created`.
   */
  public data object PayoutCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "payout.created"
  }

  /**
   * Documented value. Wire value: `payout.failed`.
   */
  public data object PayoutFailed : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "payout.failed"
  }

  /**
   * Documented value. Wire value: `payout.paid`.
   */
  public data object PayoutPaid : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "payout.paid"
  }

  /**
   * Documented value. Wire value: `payout.reconciliation_completed`.
   */
  public data object PayoutReconciliationCompleted : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "payout.reconciliation_completed"
  }

  /**
   * Documented value. Wire value: `payout.updated`.
   */
  public data object PayoutUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "payout.updated"
  }

  /**
   * Documented value. Wire value: `person.created`.
   */
  public data object PersonCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "person.created"
  }

  /**
   * Documented value. Wire value: `person.deleted`.
   */
  public data object PersonDeleted : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "person.deleted"
  }

  /**
   * Documented value. Wire value: `person.updated`.
   */
  public data object PersonUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "person.updated"
  }

  /**
   * Documented value. Wire value: `plan.created`.
   */
  public data object PlanCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "plan.created"
  }

  /**
   * Documented value. Wire value: `plan.deleted`.
   */
  public data object PlanDeleted : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "plan.deleted"
  }

  /**
   * Documented value. Wire value: `plan.updated`.
   */
  public data object PlanUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "plan.updated"
  }

  /**
   * Documented value. Wire value: `price.created`.
   */
  public data object PriceCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "price.created"
  }

  /**
   * Documented value. Wire value: `price.deleted`.
   */
  public data object PriceDeleted : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "price.deleted"
  }

  /**
   * Documented value. Wire value: `price.updated`.
   */
  public data object PriceUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "price.updated"
  }

  /**
   * Documented value. Wire value: `product.created`.
   */
  public data object ProductCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "product.created"
  }

  /**
   * Documented value. Wire value: `product.deleted`.
   */
  public data object ProductDeleted : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "product.deleted"
  }

  /**
   * Documented value. Wire value: `product.updated`.
   */
  public data object ProductUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "product.updated"
  }

  /**
   * Documented value. Wire value: `promotion_code.created`.
   */
  public data object PromotionCodeCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "promotion_code.created"
  }

  /**
   * Documented value. Wire value: `promotion_code.updated`.
   */
  public data object PromotionCodeUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "promotion_code.updated"
  }

  /**
   * Documented value. Wire value: `quote.accepted`.
   */
  public data object QuoteAccepted : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "quote.accepted"
  }

  /**
   * Documented value. Wire value: `quote.canceled`.
   */
  public data object QuoteCanceled : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "quote.canceled"
  }

  /**
   * Documented value. Wire value: `quote.created`.
   */
  public data object QuoteCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "quote.created"
  }

  /**
   * Documented value. Wire value: `quote.finalized`.
   */
  public data object QuoteFinalized : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "quote.finalized"
  }

  /**
   * Documented value. Wire value: `radar.early_fraud_warning.created`.
   */
  public data object RadarEarlyFraudWarningCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "radar.early_fraud_warning.created"
  }

  /**
   * Documented value. Wire value: `radar.early_fraud_warning.updated`.
   */
  public data object RadarEarlyFraudWarningUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "radar.early_fraud_warning.updated"
  }

  /**
   * Documented value. Wire value: `refund.created`.
   */
  public data object RefundCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "refund.created"
  }

  /**
   * Documented value. Wire value: `refund.failed`.
   */
  public data object RefundFailed : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "refund.failed"
  }

  /**
   * Documented value. Wire value: `refund.updated`.
   */
  public data object RefundUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "refund.updated"
  }

  /**
   * Documented value. Wire value: `reporting.report_run.failed`.
   */
  public data object ReportingReportRunFailed : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "reporting.report_run.failed"
  }

  /**
   * Documented value. Wire value: `reporting.report_run.succeeded`.
   */
  public data object ReportingReportRunSucceeded : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "reporting.report_run.succeeded"
  }

  /**
   * Documented value. Wire value: `reporting.report_type.updated`.
   */
  public data object ReportingReportTypeUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "reporting.report_type.updated"
  }

  /**
   * Documented value. Wire value: `reserve.hold.created`.
   */
  public data object ReserveHoldCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "reserve.hold.created"
  }

  /**
   * Documented value. Wire value: `reserve.hold.updated`.
   */
  public data object ReserveHoldUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "reserve.hold.updated"
  }

  /**
   * Documented value. Wire value: `reserve.plan.created`.
   */
  public data object ReservePlanCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "reserve.plan.created"
  }

  /**
   * Documented value. Wire value: `reserve.plan.disabled`.
   */
  public data object ReservePlanDisabled : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "reserve.plan.disabled"
  }

  /**
   * Documented value. Wire value: `reserve.plan.expired`.
   */
  public data object ReservePlanExpired : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "reserve.plan.expired"
  }

  /**
   * Documented value. Wire value: `reserve.plan.updated`.
   */
  public data object ReservePlanUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "reserve.plan.updated"
  }

  /**
   * Documented value. Wire value: `reserve.release.created`.
   */
  public data object ReserveReleaseCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "reserve.release.created"
  }

  /**
   * Documented value. Wire value: `review.closed`.
   */
  public data object ReviewClosed : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "review.closed"
  }

  /**
   * Documented value. Wire value: `review.opened`.
   */
  public data object ReviewOpened : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "review.opened"
  }

  /**
   * Documented value. Wire value: `setup_intent.canceled`.
   */
  public data object SetupIntentCanceled : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "setup_intent.canceled"
  }

  /**
   * Documented value. Wire value: `setup_intent.created`.
   */
  public data object SetupIntentCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "setup_intent.created"
  }

  /**
   * Documented value. Wire value: `setup_intent.requires_action`.
   */
  public data object SetupIntentRequiresAction : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "setup_intent.requires_action"
  }

  /**
   * Documented value. Wire value: `setup_intent.setup_failed`.
   */
  public data object SetupIntentSetupFailed : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "setup_intent.setup_failed"
  }

  /**
   * Documented value. Wire value: `setup_intent.succeeded`.
   */
  public data object SetupIntentSucceeded : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "setup_intent.succeeded"
  }

  /**
   * Documented value. Wire value: `sigma.scheduled_query_run.created`.
   */
  public data object SigmaScheduledQueryRunCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "sigma.scheduled_query_run.created"
  }

  /**
   * Documented value. Wire value: `source.canceled`.
   */
  public data object SourceCanceled : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "source.canceled"
  }

  /**
   * Documented value. Wire value: `source.chargeable`.
   */
  public data object SourceChargeable : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "source.chargeable"
  }

  /**
   * Documented value. Wire value: `source.failed`.
   */
  public data object SourceFailed : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "source.failed"
  }

  /**
   * Documented value. Wire value: `source.mandate_notification`.
   */
  public data object SourceMandateNotification : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "source.mandate_notification"
  }

  /**
   * Documented value. Wire value: `source.refund_attributes_required`.
   */
  public data object SourceRefundAttributesRequired : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "source.refund_attributes_required"
  }

  /**
   * Documented value. Wire value: `source.transaction.created`.
   */
  public data object SourceTransactionCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "source.transaction.created"
  }

  /**
   * Documented value. Wire value: `source.transaction.updated`.
   */
  public data object SourceTransactionUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "source.transaction.updated"
  }

  /**
   * Documented value. Wire value: `subscription_schedule.aborted`.
   */
  public data object SubscriptionScheduleAborted : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "subscription_schedule.aborted"
  }

  /**
   * Documented value. Wire value: `subscription_schedule.canceled`.
   */
  public data object SubscriptionScheduleCanceled : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "subscription_schedule.canceled"
  }

  /**
   * Documented value. Wire value: `subscription_schedule.completed`.
   */
  public data object SubscriptionScheduleCompleted : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "subscription_schedule.completed"
  }

  /**
   * Documented value. Wire value: `subscription_schedule.created`.
   */
  public data object SubscriptionScheduleCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "subscription_schedule.created"
  }

  /**
   * Documented value. Wire value: `subscription_schedule.expiring`.
   */
  public data object SubscriptionScheduleExpiring : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "subscription_schedule.expiring"
  }

  /**
   * Documented value. Wire value: `subscription_schedule.released`.
   */
  public data object SubscriptionScheduleReleased : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "subscription_schedule.released"
  }

  /**
   * Documented value. Wire value: `subscription_schedule.updated`.
   */
  public data object SubscriptionScheduleUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "subscription_schedule.updated"
  }

  /**
   * Documented value. Wire value: `tax.settings.updated`.
   */
  public data object TaxSettingsUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "tax.settings.updated"
  }

  /**
   * Documented value. Wire value: `tax_rate.created`.
   */
  public data object TaxRateCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "tax_rate.created"
  }

  /**
   * Documented value. Wire value: `tax_rate.updated`.
   */
  public data object TaxRateUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "tax_rate.updated"
  }

  /**
   * Documented value. Wire value: `terminal.reader.action_failed`.
   */
  public data object TerminalReaderActionFailed : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "terminal.reader.action_failed"
  }

  /**
   * Documented value. Wire value: `terminal.reader.action_succeeded`.
   */
  public data object TerminalReaderActionSucceeded : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "terminal.reader.action_succeeded"
  }

  /**
   * Documented value. Wire value: `terminal.reader.action_updated`.
   */
  public data object TerminalReaderActionUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "terminal.reader.action_updated"
  }

  /**
   * Documented value. Wire value: `test_helpers.test_clock.advancing`.
   */
  public data object TestHelpersTestClockAdvancing : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "test_helpers.test_clock.advancing"
  }

  /**
   * Documented value. Wire value: `test_helpers.test_clock.created`.
   */
  public data object TestHelpersTestClockCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "test_helpers.test_clock.created"
  }

  /**
   * Documented value. Wire value: `test_helpers.test_clock.deleted`.
   */
  public data object TestHelpersTestClockDeleted : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "test_helpers.test_clock.deleted"
  }

  /**
   * Documented value. Wire value: `test_helpers.test_clock.internal_failure`.
   */
  public data object TestHelpersTestClockInternalFailure : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "test_helpers.test_clock.internal_failure"
  }

  /**
   * Documented value. Wire value: `test_helpers.test_clock.ready`.
   */
  public data object TestHelpersTestClockReady : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "test_helpers.test_clock.ready"
  }

  /**
   * Documented value. Wire value: `topup.canceled`.
   */
  public data object TopupCanceled : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "topup.canceled"
  }

  /**
   * Documented value. Wire value: `topup.created`.
   */
  public data object TopupCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "topup.created"
  }

  /**
   * Documented value. Wire value: `topup.failed`.
   */
  public data object TopupFailed : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "topup.failed"
  }

  /**
   * Documented value. Wire value: `topup.reversed`.
   */
  public data object TopupReversed : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "topup.reversed"
  }

  /**
   * Documented value. Wire value: `topup.succeeded`.
   */
  public data object TopupSucceeded : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "topup.succeeded"
  }

  /**
   * Documented value. Wire value: `transfer.created`.
   */
  public data object TransferCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "transfer.created"
  }

  /**
   * Documented value. Wire value: `transfer.reversed`.
   */
  public data object TransferReversed : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "transfer.reversed"
  }

  /**
   * Documented value. Wire value: `transfer.updated`.
   */
  public data object TransferUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "transfer.updated"
  }

  /**
   * Documented value. Wire value: `treasury.credit_reversal.created`.
   */
  public data object TreasuryCreditReversalCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "treasury.credit_reversal.created"
  }

  /**
   * Documented value. Wire value: `treasury.credit_reversal.posted`.
   */
  public data object TreasuryCreditReversalPosted : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "treasury.credit_reversal.posted"
  }

  /**
   * Documented value. Wire value: `treasury.debit_reversal.completed`.
   */
  public data object TreasuryDebitReversalCompleted : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "treasury.debit_reversal.completed"
  }

  /**
   * Documented value. Wire value: `treasury.debit_reversal.created`.
   */
  public data object TreasuryDebitReversalCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "treasury.debit_reversal.created"
  }

  /**
   * Documented value. Wire value: `treasury.debit_reversal.initial_credit_granted`.
   */
  public data object TreasuryDebitReversalInitialCreditGranted : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "treasury.debit_reversal.initial_credit_granted"
  }

  /**
   * Documented value. Wire value: `treasury.financial_account.closed`.
   */
  public data object TreasuryFinancialAccountClosed : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "treasury.financial_account.closed"
  }

  /**
   * Documented value. Wire value: `treasury.financial_account.created`.
   */
  public data object TreasuryFinancialAccountCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "treasury.financial_account.created"
  }

  /**
   * Documented value. Wire value: `treasury.financial_account.features_status_updated`.
   */
  public data object TreasuryFinancialAccountFeaturesStatusUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "treasury.financial_account.features_status_updated"
  }

  /**
   * Documented value. Wire value: `treasury.inbound_transfer.canceled`.
   */
  public data object TreasuryInboundTransferCanceled : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "treasury.inbound_transfer.canceled"
  }

  /**
   * Documented value. Wire value: `treasury.inbound_transfer.created`.
   */
  public data object TreasuryInboundTransferCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "treasury.inbound_transfer.created"
  }

  /**
   * Documented value. Wire value: `treasury.inbound_transfer.failed`.
   */
  public data object TreasuryInboundTransferFailed : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "treasury.inbound_transfer.failed"
  }

  /**
   * Documented value. Wire value: `treasury.inbound_transfer.succeeded`.
   */
  public data object TreasuryInboundTransferSucceeded : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "treasury.inbound_transfer.succeeded"
  }

  /**
   * Documented value. Wire value: `treasury.outbound_payment.canceled`.
   */
  public data object TreasuryOutboundPaymentCanceled : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "treasury.outbound_payment.canceled"
  }

  /**
   * Documented value. Wire value: `treasury.outbound_payment.created`.
   */
  public data object TreasuryOutboundPaymentCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "treasury.outbound_payment.created"
  }

  /**
   * Documented value. Wire value: `treasury.outbound_payment.expected_arrival_date_updated`.
   */
  public data object TreasuryOutboundPaymentExpectedArrivalDateUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "treasury.outbound_payment.expected_arrival_date_updated"
  }

  /**
   * Documented value. Wire value: `treasury.outbound_payment.failed`.
   */
  public data object TreasuryOutboundPaymentFailed : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "treasury.outbound_payment.failed"
  }

  /**
   * Documented value. Wire value: `treasury.outbound_payment.posted`.
   */
  public data object TreasuryOutboundPaymentPosted : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "treasury.outbound_payment.posted"
  }

  /**
   * Documented value. Wire value: `treasury.outbound_payment.returned`.
   */
  public data object TreasuryOutboundPaymentReturned : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "treasury.outbound_payment.returned"
  }

  /**
   * Documented value. Wire value: `treasury.outbound_payment.tracking_details_updated`.
   */
  public data object TreasuryOutboundPaymentTrackingDetailsUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "treasury.outbound_payment.tracking_details_updated"
  }

  /**
   * Documented value. Wire value: `treasury.outbound_transfer.canceled`.
   */
  public data object TreasuryOutboundTransferCanceled : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "treasury.outbound_transfer.canceled"
  }

  /**
   * Documented value. Wire value: `treasury.outbound_transfer.created`.
   */
  public data object TreasuryOutboundTransferCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "treasury.outbound_transfer.created"
  }

  /**
   * Documented value. Wire value: `treasury.outbound_transfer.expected_arrival_date_updated`.
   */
  public data object TreasuryOutboundTransferExpectedArrivalDateUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "treasury.outbound_transfer.expected_arrival_date_updated"
  }

  /**
   * Documented value. Wire value: `treasury.outbound_transfer.failed`.
   */
  public data object TreasuryOutboundTransferFailed : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "treasury.outbound_transfer.failed"
  }

  /**
   * Documented value. Wire value: `treasury.outbound_transfer.posted`.
   */
  public data object TreasuryOutboundTransferPosted : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "treasury.outbound_transfer.posted"
  }

  /**
   * Documented value. Wire value: `treasury.outbound_transfer.returned`.
   */
  public data object TreasuryOutboundTransferReturned : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "treasury.outbound_transfer.returned"
  }

  /**
   * Documented value. Wire value: `treasury.outbound_transfer.tracking_details_updated`.
   */
  public data object TreasuryOutboundTransferTrackingDetailsUpdated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "treasury.outbound_transfer.tracking_details_updated"
  }

  /**
   * Documented value. Wire value: `treasury.received_credit.created`.
   */
  public data object TreasuryReceivedCreditCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "treasury.received_credit.created"
  }

  /**
   * Documented value. Wire value: `treasury.received_credit.failed`.
   */
  public data object TreasuryReceivedCreditFailed : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "treasury.received_credit.failed"
  }

  /**
   * Documented value. Wire value: `treasury.received_credit.succeeded`.
   */
  public data object TreasuryReceivedCreditSucceeded : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "treasury.received_credit.succeeded"
  }

  /**
   * Documented value. Wire value: `treasury.received_debit.created`.
   */
  public data object TreasuryReceivedDebitCreated : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd() {
    public override val `value`: String = "treasury.received_debit.created"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd()

  public companion object {
    public fun fromValue(`value`: String): InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd = when (value) {
      Value.value -> Value
      AccountApplicationAuthorized.value -> AccountApplicationAuthorized
      AccountApplicationDeauthorized.value -> AccountApplicationDeauthorized
      AccountExternalAccountCreated.value -> AccountExternalAccountCreated
      AccountExternalAccountDeleted.value -> AccountExternalAccountDeleted
      AccountExternalAccountUpdated.value -> AccountExternalAccountUpdated
      AccountUpdated.value -> AccountUpdated
      ApplicationFeeCreated.value -> ApplicationFeeCreated
      ApplicationFeeRefundUpdated.value -> ApplicationFeeRefundUpdated
      ApplicationFeeRefunded.value -> ApplicationFeeRefunded
      BalanceAvailable.value -> BalanceAvailable
      BalanceSettingsUpdated.value -> BalanceSettingsUpdated
      BillingAlertTriggered.value -> BillingAlertTriggered
      BillingCreditBalanceTransactionCreated.value -> BillingCreditBalanceTransactionCreated
      BillingCreditGrantCreated.value -> BillingCreditGrantCreated
      BillingCreditGrantUpdated.value -> BillingCreditGrantUpdated
      BillingMeterCreated.value -> BillingMeterCreated
      BillingMeterDeactivated.value -> BillingMeterDeactivated
      BillingMeterReactivated.value -> BillingMeterReactivated
      BillingMeterUpdated.value -> BillingMeterUpdated
      BillingPortalConfigurationCreated.value -> BillingPortalConfigurationCreated
      BillingPortalConfigurationUpdated.value -> BillingPortalConfigurationUpdated
      BillingPortalSessionCreated.value -> BillingPortalSessionCreated
      CapabilityUpdated.value -> CapabilityUpdated
      CashBalanceFundsAvailable.value -> CashBalanceFundsAvailable
      ChargeCaptured.value -> ChargeCaptured
      ChargeDisputeClosed.value -> ChargeDisputeClosed
      ChargeDisputeCreated.value -> ChargeDisputeCreated
      ChargeDisputeFundsReinstated.value -> ChargeDisputeFundsReinstated
      ChargeDisputeFundsWithdrawn.value -> ChargeDisputeFundsWithdrawn
      ChargeDisputeUpdated.value -> ChargeDisputeUpdated
      ChargeExpired.value -> ChargeExpired
      ChargeFailed.value -> ChargeFailed
      ChargePending.value -> ChargePending
      ChargeRefundUpdated.value -> ChargeRefundUpdated
      ChargeRefunded.value -> ChargeRefunded
      ChargeSucceeded.value -> ChargeSucceeded
      ChargeUpdated.value -> ChargeUpdated
      CheckoutSessionAsyncPaymentFailed.value -> CheckoutSessionAsyncPaymentFailed
      CheckoutSessionAsyncPaymentSucceeded.value -> CheckoutSessionAsyncPaymentSucceeded
      CheckoutSessionCompleted.value -> CheckoutSessionCompleted
      CheckoutSessionExpired.value -> CheckoutSessionExpired
      ClimateOrderCanceled.value -> ClimateOrderCanceled
      ClimateOrderCreated.value -> ClimateOrderCreated
      ClimateOrderDelayed.value -> ClimateOrderDelayed
      ClimateOrderDelivered.value -> ClimateOrderDelivered
      ClimateOrderProductSubstituted.value -> ClimateOrderProductSubstituted
      ClimateProductCreated.value -> ClimateProductCreated
      ClimateProductPricingUpdated.value -> ClimateProductPricingUpdated
      CouponCreated.value -> CouponCreated
      CouponDeleted.value -> CouponDeleted
      CouponUpdated.value -> CouponUpdated
      CreditNoteCreated.value -> CreditNoteCreated
      CreditNoteUpdated.value -> CreditNoteUpdated
      CreditNoteVoided.value -> CreditNoteVoided
      CustomerCreated.value -> CustomerCreated
      CustomerDeleted.value -> CustomerDeleted
      CustomerDiscountCreated.value -> CustomerDiscountCreated
      CustomerDiscountDeleted.value -> CustomerDiscountDeleted
      CustomerDiscountUpdated.value -> CustomerDiscountUpdated
      CustomerSourceCreated.value -> CustomerSourceCreated
      CustomerSourceDeleted.value -> CustomerSourceDeleted
      CustomerSourceExpiring.value -> CustomerSourceExpiring
      CustomerSourceUpdated.value -> CustomerSourceUpdated
      CustomerSubscriptionCreated.value -> CustomerSubscriptionCreated
      CustomerSubscriptionDeleted.value -> CustomerSubscriptionDeleted
      CustomerSubscriptionPaused.value -> CustomerSubscriptionPaused
      CustomerSubscriptionPendingUpdateApplied.value -> CustomerSubscriptionPendingUpdateApplied
      CustomerSubscriptionPendingUpdateExpired.value -> CustomerSubscriptionPendingUpdateExpired
      CustomerSubscriptionResumed.value -> CustomerSubscriptionResumed
      CustomerSubscriptionTrialWillEnd.value -> CustomerSubscriptionTrialWillEnd
      CustomerSubscriptionUpdated.value -> CustomerSubscriptionUpdated
      CustomerTaxIdCreated.value -> CustomerTaxIdCreated
      CustomerTaxIdDeleted.value -> CustomerTaxIdDeleted
      CustomerTaxIdUpdated.value -> CustomerTaxIdUpdated
      CustomerUpdated.value -> CustomerUpdated
      CustomerCashBalanceTransactionCreated.value -> CustomerCashBalanceTransactionCreated
      EntitlementsActiveEntitlementSummaryUpdated.value -> EntitlementsActiveEntitlementSummaryUpdated
      FileCreated.value -> FileCreated
      FinancialConnectionsAccountAccountNumbersUpdated.value -> FinancialConnectionsAccountAccountNumbersUpdated
      FinancialConnectionsAccountCreated.value -> FinancialConnectionsAccountCreated
      FinancialConnectionsAccountDeactivated.value -> FinancialConnectionsAccountDeactivated
      FinancialConnectionsAccountDisconnected.value -> FinancialConnectionsAccountDisconnected
      FinancialConnectionsAccountReactivated.value -> FinancialConnectionsAccountReactivated
      FinancialConnectionsAccountRefreshedBalance.value -> FinancialConnectionsAccountRefreshedBalance
      FinancialConnectionsAccountRefreshedOwnership.value -> FinancialConnectionsAccountRefreshedOwnership
      FinancialConnectionsAccountRefreshedTransactions.value -> FinancialConnectionsAccountRefreshedTransactions
      FinancialConnectionsAccountUpcomingAccountNumberExpiry.value -> FinancialConnectionsAccountUpcomingAccountNumberExpiry
      IdentityVerificationSessionCanceled.value -> IdentityVerificationSessionCanceled
      IdentityVerificationSessionCreated.value -> IdentityVerificationSessionCreated
      IdentityVerificationSessionProcessing.value -> IdentityVerificationSessionProcessing
      IdentityVerificationSessionRedacted.value -> IdentityVerificationSessionRedacted
      IdentityVerificationSessionRequiresInput.value -> IdentityVerificationSessionRequiresInput
      IdentityVerificationSessionVerified.value -> IdentityVerificationSessionVerified
      InvoiceCreated.value -> InvoiceCreated
      InvoiceDeleted.value -> InvoiceDeleted
      InvoiceFinalizationFailed.value -> InvoiceFinalizationFailed
      InvoiceFinalized.value -> InvoiceFinalized
      InvoiceMarkedUncollectible.value -> InvoiceMarkedUncollectible
      InvoiceOverdue.value -> InvoiceOverdue
      InvoiceOverpaid.value -> InvoiceOverpaid
      InvoicePaid.value -> InvoicePaid
      InvoicePaymentActionRequired.value -> InvoicePaymentActionRequired
      InvoicePaymentAttemptRequired.value -> InvoicePaymentAttemptRequired
      InvoicePaymentFailed.value -> InvoicePaymentFailed
      InvoicePaymentSucceeded.value -> InvoicePaymentSucceeded
      InvoiceSent.value -> InvoiceSent
      InvoiceUpcoming.value -> InvoiceUpcoming
      InvoiceUpdated.value -> InvoiceUpdated
      InvoiceVoided.value -> InvoiceVoided
      InvoiceWillBeDue.value -> InvoiceWillBeDue
      InvoicePaymentPaid.value -> InvoicePaymentPaid
      InvoiceitemCreated.value -> InvoiceitemCreated
      InvoiceitemDeleted.value -> InvoiceitemDeleted
      IssuingAuthorizationCreated.value -> IssuingAuthorizationCreated
      IssuingAuthorizationRequest.value -> IssuingAuthorizationRequest
      IssuingAuthorizationUpdated.value -> IssuingAuthorizationUpdated
      IssuingCardCreated.value -> IssuingCardCreated
      IssuingCardUpdated.value -> IssuingCardUpdated
      IssuingCardholderCreated.value -> IssuingCardholderCreated
      IssuingCardholderUpdated.value -> IssuingCardholderUpdated
      IssuingDisputeClosed.value -> IssuingDisputeClosed
      IssuingDisputeCreated.value -> IssuingDisputeCreated
      IssuingDisputeFundsReinstated.value -> IssuingDisputeFundsReinstated
      IssuingDisputeFundsRescinded.value -> IssuingDisputeFundsRescinded
      IssuingDisputeSubmitted.value -> IssuingDisputeSubmitted
      IssuingDisputeUpdated.value -> IssuingDisputeUpdated
      IssuingPersonalizationDesignActivated.value -> IssuingPersonalizationDesignActivated
      IssuingPersonalizationDesignDeactivated.value -> IssuingPersonalizationDesignDeactivated
      IssuingPersonalizationDesignRejected.value -> IssuingPersonalizationDesignRejected
      IssuingPersonalizationDesignUpdated.value -> IssuingPersonalizationDesignUpdated
      IssuingTokenCreated.value -> IssuingTokenCreated
      IssuingTokenUpdated.value -> IssuingTokenUpdated
      IssuingTransactionCreated.value -> IssuingTransactionCreated
      IssuingTransactionPurchaseDetailsReceiptUpdated.value -> IssuingTransactionPurchaseDetailsReceiptUpdated
      IssuingTransactionUpdated.value -> IssuingTransactionUpdated
      MandateUpdated.value -> MandateUpdated
      PaymentIntentAmountCapturableUpdated.value -> PaymentIntentAmountCapturableUpdated
      PaymentIntentCanceled.value -> PaymentIntentCanceled
      PaymentIntentCreated.value -> PaymentIntentCreated
      PaymentIntentPartiallyFunded.value -> PaymentIntentPartiallyFunded
      PaymentIntentPaymentFailed.value -> PaymentIntentPaymentFailed
      PaymentIntentProcessing.value -> PaymentIntentProcessing
      PaymentIntentRequiresAction.value -> PaymentIntentRequiresAction
      PaymentIntentSucceeded.value -> PaymentIntentSucceeded
      PaymentLinkCreated.value -> PaymentLinkCreated
      PaymentLinkUpdated.value -> PaymentLinkUpdated
      PaymentMethodAttached.value -> PaymentMethodAttached
      PaymentMethodAutomaticallyUpdated.value -> PaymentMethodAutomaticallyUpdated
      PaymentMethodDetached.value -> PaymentMethodDetached
      PaymentMethodUpdated.value -> PaymentMethodUpdated
      PayoutCanceled.value -> PayoutCanceled
      PayoutCreated.value -> PayoutCreated
      PayoutFailed.value -> PayoutFailed
      PayoutPaid.value -> PayoutPaid
      PayoutReconciliationCompleted.value -> PayoutReconciliationCompleted
      PayoutUpdated.value -> PayoutUpdated
      PersonCreated.value -> PersonCreated
      PersonDeleted.value -> PersonDeleted
      PersonUpdated.value -> PersonUpdated
      PlanCreated.value -> PlanCreated
      PlanDeleted.value -> PlanDeleted
      PlanUpdated.value -> PlanUpdated
      PriceCreated.value -> PriceCreated
      PriceDeleted.value -> PriceDeleted
      PriceUpdated.value -> PriceUpdated
      ProductCreated.value -> ProductCreated
      ProductDeleted.value -> ProductDeleted
      ProductUpdated.value -> ProductUpdated
      PromotionCodeCreated.value -> PromotionCodeCreated
      PromotionCodeUpdated.value -> PromotionCodeUpdated
      QuoteAccepted.value -> QuoteAccepted
      QuoteCanceled.value -> QuoteCanceled
      QuoteCreated.value -> QuoteCreated
      QuoteFinalized.value -> QuoteFinalized
      RadarEarlyFraudWarningCreated.value -> RadarEarlyFraudWarningCreated
      RadarEarlyFraudWarningUpdated.value -> RadarEarlyFraudWarningUpdated
      RefundCreated.value -> RefundCreated
      RefundFailed.value -> RefundFailed
      RefundUpdated.value -> RefundUpdated
      ReportingReportRunFailed.value -> ReportingReportRunFailed
      ReportingReportRunSucceeded.value -> ReportingReportRunSucceeded
      ReportingReportTypeUpdated.value -> ReportingReportTypeUpdated
      ReserveHoldCreated.value -> ReserveHoldCreated
      ReserveHoldUpdated.value -> ReserveHoldUpdated
      ReservePlanCreated.value -> ReservePlanCreated
      ReservePlanDisabled.value -> ReservePlanDisabled
      ReservePlanExpired.value -> ReservePlanExpired
      ReservePlanUpdated.value -> ReservePlanUpdated
      ReserveReleaseCreated.value -> ReserveReleaseCreated
      ReviewClosed.value -> ReviewClosed
      ReviewOpened.value -> ReviewOpened
      SetupIntentCanceled.value -> SetupIntentCanceled
      SetupIntentCreated.value -> SetupIntentCreated
      SetupIntentRequiresAction.value -> SetupIntentRequiresAction
      SetupIntentSetupFailed.value -> SetupIntentSetupFailed
      SetupIntentSucceeded.value -> SetupIntentSucceeded
      SigmaScheduledQueryRunCreated.value -> SigmaScheduledQueryRunCreated
      SourceCanceled.value -> SourceCanceled
      SourceChargeable.value -> SourceChargeable
      SourceFailed.value -> SourceFailed
      SourceMandateNotification.value -> SourceMandateNotification
      SourceRefundAttributesRequired.value -> SourceRefundAttributesRequired
      SourceTransactionCreated.value -> SourceTransactionCreated
      SourceTransactionUpdated.value -> SourceTransactionUpdated
      SubscriptionScheduleAborted.value -> SubscriptionScheduleAborted
      SubscriptionScheduleCanceled.value -> SubscriptionScheduleCanceled
      SubscriptionScheduleCompleted.value -> SubscriptionScheduleCompleted
      SubscriptionScheduleCreated.value -> SubscriptionScheduleCreated
      SubscriptionScheduleExpiring.value -> SubscriptionScheduleExpiring
      SubscriptionScheduleReleased.value -> SubscriptionScheduleReleased
      SubscriptionScheduleUpdated.value -> SubscriptionScheduleUpdated
      TaxSettingsUpdated.value -> TaxSettingsUpdated
      TaxRateCreated.value -> TaxRateCreated
      TaxRateUpdated.value -> TaxRateUpdated
      TerminalReaderActionFailed.value -> TerminalReaderActionFailed
      TerminalReaderActionSucceeded.value -> TerminalReaderActionSucceeded
      TerminalReaderActionUpdated.value -> TerminalReaderActionUpdated
      TestHelpersTestClockAdvancing.value -> TestHelpersTestClockAdvancing
      TestHelpersTestClockCreated.value -> TestHelpersTestClockCreated
      TestHelpersTestClockDeleted.value -> TestHelpersTestClockDeleted
      TestHelpersTestClockInternalFailure.value -> TestHelpersTestClockInternalFailure
      TestHelpersTestClockReady.value -> TestHelpersTestClockReady
      TopupCanceled.value -> TopupCanceled
      TopupCreated.value -> TopupCreated
      TopupFailed.value -> TopupFailed
      TopupReversed.value -> TopupReversed
      TopupSucceeded.value -> TopupSucceeded
      TransferCreated.value -> TransferCreated
      TransferReversed.value -> TransferReversed
      TransferUpdated.value -> TransferUpdated
      TreasuryCreditReversalCreated.value -> TreasuryCreditReversalCreated
      TreasuryCreditReversalPosted.value -> TreasuryCreditReversalPosted
      TreasuryDebitReversalCompleted.value -> TreasuryDebitReversalCompleted
      TreasuryDebitReversalCreated.value -> TreasuryDebitReversalCreated
      TreasuryDebitReversalInitialCreditGranted.value -> TreasuryDebitReversalInitialCreditGranted
      TreasuryFinancialAccountClosed.value -> TreasuryFinancialAccountClosed
      TreasuryFinancialAccountCreated.value -> TreasuryFinancialAccountCreated
      TreasuryFinancialAccountFeaturesStatusUpdated.value -> TreasuryFinancialAccountFeaturesStatusUpdated
      TreasuryInboundTransferCanceled.value -> TreasuryInboundTransferCanceled
      TreasuryInboundTransferCreated.value -> TreasuryInboundTransferCreated
      TreasuryInboundTransferFailed.value -> TreasuryInboundTransferFailed
      TreasuryInboundTransferSucceeded.value -> TreasuryInboundTransferSucceeded
      TreasuryOutboundPaymentCanceled.value -> TreasuryOutboundPaymentCanceled
      TreasuryOutboundPaymentCreated.value -> TreasuryOutboundPaymentCreated
      TreasuryOutboundPaymentExpectedArrivalDateUpdated.value -> TreasuryOutboundPaymentExpectedArrivalDateUpdated
      TreasuryOutboundPaymentFailed.value -> TreasuryOutboundPaymentFailed
      TreasuryOutboundPaymentPosted.value -> TreasuryOutboundPaymentPosted
      TreasuryOutboundPaymentReturned.value -> TreasuryOutboundPaymentReturned
      TreasuryOutboundPaymentTrackingDetailsUpdated.value -> TreasuryOutboundPaymentTrackingDetailsUpdated
      TreasuryOutboundTransferCanceled.value -> TreasuryOutboundTransferCanceled
      TreasuryOutboundTransferCreated.value -> TreasuryOutboundTransferCreated
      TreasuryOutboundTransferExpectedArrivalDateUpdated.value -> TreasuryOutboundTransferExpectedArrivalDateUpdated
      TreasuryOutboundTransferFailed.value -> TreasuryOutboundTransferFailed
      TreasuryOutboundTransferPosted.value -> TreasuryOutboundTransferPosted
      TreasuryOutboundTransferReturned.value -> TreasuryOutboundTransferReturned
      TreasuryOutboundTransferTrackingDetailsUpdated.value -> TreasuryOutboundTransferTrackingDetailsUpdated
      TreasuryReceivedCreditCreated.value -> TreasuryReceivedCreditCreated
      TreasuryReceivedCreditFailed.value -> TreasuryReceivedCreditFailed
      TreasuryReceivedCreditSucceeded.value -> TreasuryReceivedCreditSucceeded
      TreasuryReceivedDebitCreated.value -> TreasuryReceivedDebitCreated
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd) {
      encoder.encodeString(value.value)
    }
  }
}
