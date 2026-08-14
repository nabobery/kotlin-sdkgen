package io.github.nabobery.sdkgen.generated.stripe

import com.nabobery.sdkgen.runtime.SdkAuthentication
import com.nabobery.sdkgen.runtime.SdkTransport
import com.nabobery.sdkgen.runtime.auth.CredentialProvider
import com.nabobery.sdkgen.runtime.auth.TrustedHosts
import io.github.nabobery.sdkgen.generated.stripe.account.AccountClient
import io.github.nabobery.sdkgen.generated.stripe.accountlinks.AccountLinksClient
import io.github.nabobery.sdkgen.generated.stripe.accounts.AccountsClient
import io.github.nabobery.sdkgen.generated.stripe.applepay.ApplePayClient
import io.github.nabobery.sdkgen.generated.stripe.applicationfees.ApplicationFeesClient
import io.github.nabobery.sdkgen.generated.stripe.apps.AppsClient
import io.github.nabobery.sdkgen.generated.stripe.balance.BalanceClient
import io.github.nabobery.sdkgen.generated.stripe.balancesettings.BalanceSettingsClient
import io.github.nabobery.sdkgen.generated.stripe.balancetransactions.BalanceTransactionsClient
import io.github.nabobery.sdkgen.generated.stripe.billing.BillingClient
import io.github.nabobery.sdkgen.generated.stripe.billingportal.BillingPortalClient
import io.github.nabobery.sdkgen.generated.stripe.charges.ChargesClient
import io.github.nabobery.sdkgen.generated.stripe.checkout.CheckoutClient
import io.github.nabobery.sdkgen.generated.stripe.climate.ClimateClient
import io.github.nabobery.sdkgen.generated.stripe.confirmationtokens.ConfirmationTokensClient
import io.github.nabobery.sdkgen.generated.stripe.countryspecs.CountrySpecsClient
import io.github.nabobery.sdkgen.generated.stripe.coupons.CouponsClient
import io.github.nabobery.sdkgen.generated.stripe.creditnotes.CreditNotesClient
import io.github.nabobery.sdkgen.generated.stripe.customers.CustomersClient
import io.github.nabobery.sdkgen.generated.stripe.customersessions.CustomerSessionsClient
import io.github.nabobery.sdkgen.generated.stripe.disputes.DisputesClient
import io.github.nabobery.sdkgen.generated.stripe.entitlements.EntitlementsClient
import io.github.nabobery.sdkgen.generated.stripe.ephemeralkeys.EphemeralKeysClient
import io.github.nabobery.sdkgen.generated.stripe.events.EventsClient
import io.github.nabobery.sdkgen.generated.stripe.exchangerates.ExchangeRatesClient
import io.github.nabobery.sdkgen.generated.stripe.externalaccounts.ExternalAccountsClient
import io.github.nabobery.sdkgen.generated.stripe.filelinks.FileLinksClient
import io.github.nabobery.sdkgen.generated.stripe.files.FilesClient
import io.github.nabobery.sdkgen.generated.stripe.financialconnections.FinancialConnectionsClient
import io.github.nabobery.sdkgen.generated.stripe.forwarding.ForwardingClient
import io.github.nabobery.sdkgen.generated.stripe.identity.IdentityClient
import io.github.nabobery.sdkgen.generated.stripe.invoiceitems.InvoiceitemsClient
import io.github.nabobery.sdkgen.generated.stripe.invoicepayments.InvoicePaymentsClient
import io.github.nabobery.sdkgen.generated.stripe.invoicerenderingtemplates.InvoiceRenderingTemplatesClient
import io.github.nabobery.sdkgen.generated.stripe.invoices.InvoicesClient
import io.github.nabobery.sdkgen.generated.stripe.issuing.IssuingClient
import io.github.nabobery.sdkgen.generated.stripe.linkaccountsessions.LinkAccountSessionsClient
import io.github.nabobery.sdkgen.generated.stripe.linkedaccounts.LinkedAccountsClient
import io.github.nabobery.sdkgen.generated.stripe.mandates.MandatesClient
import io.github.nabobery.sdkgen.generated.stripe.paymentattemptrecords.PaymentAttemptRecordsClient
import io.github.nabobery.sdkgen.generated.stripe.paymentintents.PaymentIntentsClient
import io.github.nabobery.sdkgen.generated.stripe.paymentlinks.PaymentLinksClient
import io.github.nabobery.sdkgen.generated.stripe.paymentmethodconfigurations.PaymentMethodConfigurationsClient
import io.github.nabobery.sdkgen.generated.stripe.paymentmethoddomains.PaymentMethodDomainsClient
import io.github.nabobery.sdkgen.generated.stripe.paymentmethods.PaymentMethodsClient
import io.github.nabobery.sdkgen.generated.stripe.paymentrecords.PaymentRecordsClient
import io.github.nabobery.sdkgen.generated.stripe.payouts.PayoutsClient
import io.github.nabobery.sdkgen.generated.stripe.plans.PlansClient
import io.github.nabobery.sdkgen.generated.stripe.prices.PricesClient
import io.github.nabobery.sdkgen.generated.stripe.products.ProductsClient
import io.github.nabobery.sdkgen.generated.stripe.promotioncodes.PromotionCodesClient
import io.github.nabobery.sdkgen.generated.stripe.quotes.QuotesClient
import io.github.nabobery.sdkgen.generated.stripe.radar.RadarClient
import io.github.nabobery.sdkgen.generated.stripe.refunds.RefundsClient
import io.github.nabobery.sdkgen.generated.stripe.reporting.ReportingClient
import io.github.nabobery.sdkgen.generated.stripe.reviews.ReviewsClient
import io.github.nabobery.sdkgen.generated.stripe.setupattempts.SetupAttemptsClient
import io.github.nabobery.sdkgen.generated.stripe.setupintents.SetupIntentsClient
import io.github.nabobery.sdkgen.generated.stripe.shippingrates.ShippingRatesClient
import io.github.nabobery.sdkgen.generated.stripe.sigma.SigmaClient
import io.github.nabobery.sdkgen.generated.stripe.sources.SourcesClient
import io.github.nabobery.sdkgen.generated.stripe.subscriptionitems.SubscriptionItemsClient
import io.github.nabobery.sdkgen.generated.stripe.subscriptions.SubscriptionsClient
import io.github.nabobery.sdkgen.generated.stripe.subscriptionschedules.SubscriptionSchedulesClient
import io.github.nabobery.sdkgen.generated.stripe.tax.TaxClient
import io.github.nabobery.sdkgen.generated.stripe.taxcodes.TaxCodesClient
import io.github.nabobery.sdkgen.generated.stripe.taxids.TaxIdsClient
import io.github.nabobery.sdkgen.generated.stripe.taxrates.TaxRatesClient
import io.github.nabobery.sdkgen.generated.stripe.terminal.TerminalClient
import io.github.nabobery.sdkgen.generated.stripe.testhelpers.TestHelpersClient
import io.github.nabobery.sdkgen.generated.stripe.tokens.TokensClient
import io.github.nabobery.sdkgen.generated.stripe.topups.TopupsClient
import io.github.nabobery.sdkgen.generated.stripe.transfers.TransfersClient
import io.github.nabobery.sdkgen.generated.stripe.treasury.TreasuryClient
import io.github.nabobery.sdkgen.generated.stripe.webhookendpoints.WebhookEndpointsClient
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.Map

/**
 * Client for Stripe API.
 */
public class StripeClient(
  transport: SdkTransport,
  baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  authentication: SdkAuthentication? = null,
) {
  /**
   * Operations tagged/grouped under 'account'.
   */
  public val account: AccountClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        AccountClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'account_links'.
   */
  public val accountLinks: AccountLinksClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        AccountLinksClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'accounts'.
   */
  public val accounts: AccountsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        AccountsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'apple_pay'.
   */
  public val applePay: ApplePayClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        ApplePayClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'application_fees'.
   */
  public val applicationFees: ApplicationFeesClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        ApplicationFeesClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'apps'.
   */
  public val apps: AppsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        AppsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'balance'.
   */
  public val balance: BalanceClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        BalanceClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'balance_settings'.
   */
  public val balanceSettings: BalanceSettingsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        BalanceSettingsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'balance_transactions'.
   */
  public val balanceTransactions: BalanceTransactionsClient by
      lazy(LazyThreadSafetyMode.PUBLICATION) {
        BalanceTransactionsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'billing'.
   */
  public val billing: BillingClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        BillingClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'billing_portal'.
   */
  public val billingPortal: BillingPortalClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        BillingPortalClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'charges'.
   */
  public val charges: ChargesClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        ChargesClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'checkout'.
   */
  public val checkout: CheckoutClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        CheckoutClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'climate'.
   */
  public val climate: ClimateClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        ClimateClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'confirmation_tokens'.
   */
  public val confirmationTokens: ConfirmationTokensClient by
      lazy(LazyThreadSafetyMode.PUBLICATION) {
        ConfirmationTokensClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'country_specs'.
   */
  public val countrySpecs: CountrySpecsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        CountrySpecsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'coupons'.
   */
  public val coupons: CouponsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        CouponsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'credit_notes'.
   */
  public val creditNotes: CreditNotesClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        CreditNotesClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'customers'.
   */
  public val customers: CustomersClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        CustomersClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'customer_sessions'.
   */
  public val customerSessions: CustomerSessionsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        CustomerSessionsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'disputes'.
   */
  public val disputes: DisputesClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        DisputesClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'entitlements'.
   */
  public val entitlements: EntitlementsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        EntitlementsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'ephemeral_keys'.
   */
  public val ephemeralKeys: EphemeralKeysClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        EphemeralKeysClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'events'.
   */
  public val events: EventsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        EventsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'exchange_rates'.
   */
  public val exchangeRates: ExchangeRatesClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        ExchangeRatesClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'external_accounts'.
   */
  public val externalAccounts: ExternalAccountsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        ExternalAccountsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'file_links'.
   */
  public val fileLinks: FileLinksClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        FileLinksClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'files'.
   */
  public val files: FilesClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        FilesClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'financial_connections'.
   */
  public val financialConnections: FinancialConnectionsClient by
      lazy(LazyThreadSafetyMode.PUBLICATION) {
        FinancialConnectionsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'forwarding'.
   */
  public val forwarding: ForwardingClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        ForwardingClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'identity'.
   */
  public val identity: IdentityClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        IdentityClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'invoiceitems'.
   */
  public val invoiceitems: InvoiceitemsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        InvoiceitemsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'invoice_payments'.
   */
  public val invoicePayments: InvoicePaymentsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        InvoicePaymentsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'invoice_rendering_templates'.
   */
  public val invoiceRenderingTemplates: InvoiceRenderingTemplatesClient by
      lazy(LazyThreadSafetyMode.PUBLICATION) {
        InvoiceRenderingTemplatesClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'invoices'.
   */
  public val invoices: InvoicesClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        InvoicesClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'issuing'.
   */
  public val issuing: IssuingClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        IssuingClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'link_account_sessions'.
   */
  public val linkAccountSessions: LinkAccountSessionsClient by
      lazy(LazyThreadSafetyMode.PUBLICATION) {
        LinkAccountSessionsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'linked_accounts'.
   */
  public val linkedAccounts: LinkedAccountsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        LinkedAccountsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'mandates'.
   */
  public val mandates: MandatesClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        MandatesClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'payment_attempt_records'.
   */
  public val paymentAttemptRecords: PaymentAttemptRecordsClient by
      lazy(LazyThreadSafetyMode.PUBLICATION) {
        PaymentAttemptRecordsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'payment_intents'.
   */
  public val paymentIntents: PaymentIntentsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        PaymentIntentsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'payment_links'.
   */
  public val paymentLinks: PaymentLinksClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        PaymentLinksClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'payment_method_configurations'.
   */
  public val paymentMethodConfigurations: PaymentMethodConfigurationsClient by
      lazy(LazyThreadSafetyMode.PUBLICATION) {
        PaymentMethodConfigurationsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'payment_method_domains'.
   */
  public val paymentMethodDomains: PaymentMethodDomainsClient by
      lazy(LazyThreadSafetyMode.PUBLICATION) {
        PaymentMethodDomainsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'payment_methods'.
   */
  public val paymentMethods: PaymentMethodsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        PaymentMethodsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'payment_records'.
   */
  public val paymentRecords: PaymentRecordsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        PaymentRecordsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'payouts'.
   */
  public val payouts: PayoutsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        PayoutsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'plans'.
   */
  public val plans: PlansClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        PlansClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'prices'.
   */
  public val prices: PricesClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        PricesClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'products'.
   */
  public val products: ProductsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        ProductsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'promotion_codes'.
   */
  public val promotionCodes: PromotionCodesClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        PromotionCodesClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'quotes'.
   */
  public val quotes: QuotesClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        QuotesClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'radar'.
   */
  public val radar: RadarClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        RadarClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'refunds'.
   */
  public val refunds: RefundsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        RefundsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'reporting'.
   */
  public val reporting: ReportingClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        ReportingClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'reviews'.
   */
  public val reviews: ReviewsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        ReviewsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'setup_attempts'.
   */
  public val setupAttempts: SetupAttemptsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        SetupAttemptsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'setup_intents'.
   */
  public val setupIntents: SetupIntentsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        SetupIntentsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'shipping_rates'.
   */
  public val shippingRates: ShippingRatesClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        ShippingRatesClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'sigma'.
   */
  public val sigma: SigmaClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        SigmaClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'sources'.
   */
  public val sources: SourcesClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        SourcesClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'subscription_items'.
   */
  public val subscriptionItems: SubscriptionItemsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        SubscriptionItemsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'subscriptions'.
   */
  public val subscriptions: SubscriptionsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        SubscriptionsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'subscription_schedules'.
   */
  public val subscriptionSchedules: SubscriptionSchedulesClient by
      lazy(LazyThreadSafetyMode.PUBLICATION) {
        SubscriptionSchedulesClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'tax'.
   */
  public val tax: TaxClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        TaxClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'tax_codes'.
   */
  public val taxCodes: TaxCodesClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        TaxCodesClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'tax_ids'.
   */
  public val taxIds: TaxIdsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        TaxIdsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'tax_rates'.
   */
  public val taxRates: TaxRatesClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        TaxRatesClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'terminal'.
   */
  public val terminal: TerminalClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        TerminalClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'test_helpers'.
   */
  public val testHelpers: TestHelpersClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        TestHelpersClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'tokens'.
   */
  public val tokens: TokensClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        TokensClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'topups'.
   */
  public val topups: TopupsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        TopupsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'transfers'.
   */
  public val transfers: TransfersClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        TransfersClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'treasury'.
   */
  public val treasury: TreasuryClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        TreasuryClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'webhook_endpoints'.
   */
  public val webhookEndpoints: WebhookEndpointsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        WebhookEndpointsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }
}
