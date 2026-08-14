package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/connect_embedded_account_session_create_components
 */
@Serializable(with = ConnectEmbeddedAccountSessionCreateComponents.Serializer::class)
public class ConnectEmbeddedAccountSessionCreateComponents(
  public val accountManagement: ConnectEmbeddedAccountConfigClaim,
  public val accountOnboarding: ConnectEmbeddedAccountConfigClaim,
  public val balanceReport: ConnectEmbeddedBaseConfigClaim,
  public val balances: ConnectEmbeddedPayoutsConfig,
  public val disputesList: ConnectEmbeddedDisputesListConfig,
  public val documents: ConnectEmbeddedBaseConfigClaim,
  public val financialAccount: ConnectEmbeddedFinancialAccountConfigClaim,
  public val financialAccountTransactions: ConnectEmbeddedFinancialAccountTransactionsConfigClaim,
  public val instantPayoutsPromotion: ConnectEmbeddedInstantPayoutsPromotionConfig,
  public val issuingCard: ConnectEmbeddedIssuingCardConfigClaim,
  public val issuingCardsList: ConnectEmbeddedIssuingCardsListConfigClaim,
  public val notificationBanner: ConnectEmbeddedAccountConfigClaim,
  public val paymentDetails: ConnectEmbeddedPaymentsConfigClaim,
  public val paymentDisputes: ConnectEmbeddedPaymentDisputesConfig,
  public val payments: ConnectEmbeddedPaymentsConfigClaim,
  public val payoutDetails: ConnectEmbeddedBaseConfigClaim,
  public val payoutReconciliationReport: ConnectEmbeddedBaseConfigClaim,
  public val payouts: ConnectEmbeddedPayoutsConfig,
  public val payoutsList: ConnectEmbeddedBaseConfigClaim,
  public val taxRegistrations: ConnectEmbeddedBaseConfigClaim,
  public val taxSettings: ConnectEmbeddedBaseConfigClaim,
) {
  public class Builder {
    private var accountManagementValue: ConnectEmbeddedAccountConfigClaim? = null

    public var accountManagement: ConnectEmbeddedAccountConfigClaim
      get() = requireNotNull(accountManagementValue) { "accountManagement is required" }
      set(`value`) {
        accountManagementValue = value
      }

    private var accountOnboardingValue: ConnectEmbeddedAccountConfigClaim? = null

    public var accountOnboarding: ConnectEmbeddedAccountConfigClaim
      get() = requireNotNull(accountOnboardingValue) { "accountOnboarding is required" }
      set(`value`) {
        accountOnboardingValue = value
      }

    private var balanceReportValue: ConnectEmbeddedBaseConfigClaim? = null

    public var balanceReport: ConnectEmbeddedBaseConfigClaim
      get() = requireNotNull(balanceReportValue) { "balanceReport is required" }
      set(`value`) {
        balanceReportValue = value
      }

    private var balancesValue: ConnectEmbeddedPayoutsConfig? = null

    public var balances: ConnectEmbeddedPayoutsConfig
      get() = requireNotNull(balancesValue) { "balances is required" }
      set(`value`) {
        balancesValue = value
      }

    private var disputesListValue: ConnectEmbeddedDisputesListConfig? = null

    public var disputesList: ConnectEmbeddedDisputesListConfig
      get() = requireNotNull(disputesListValue) { "disputesList is required" }
      set(`value`) {
        disputesListValue = value
      }

    private var documentsValue: ConnectEmbeddedBaseConfigClaim? = null

    public var documents: ConnectEmbeddedBaseConfigClaim
      get() = requireNotNull(documentsValue) { "documents is required" }
      set(`value`) {
        documentsValue = value
      }

    private var financialAccountValue: ConnectEmbeddedFinancialAccountConfigClaim? = null

    public var financialAccount: ConnectEmbeddedFinancialAccountConfigClaim
      get() = requireNotNull(financialAccountValue) { "financialAccount is required" }
      set(`value`) {
        financialAccountValue = value
      }

    private var financialAccountTransactionsValue:
        ConnectEmbeddedFinancialAccountTransactionsConfigClaim? = null

    public var financialAccountTransactions: ConnectEmbeddedFinancialAccountTransactionsConfigClaim
      get() = requireNotNull(financialAccountTransactionsValue) { "financialAccountTransactions is required" }
      set(`value`) {
        financialAccountTransactionsValue = value
      }

    private var instantPayoutsPromotionValue: ConnectEmbeddedInstantPayoutsPromotionConfig? = null

    public var instantPayoutsPromotion: ConnectEmbeddedInstantPayoutsPromotionConfig
      get() = requireNotNull(instantPayoutsPromotionValue) { "instantPayoutsPromotion is required" }
      set(`value`) {
        instantPayoutsPromotionValue = value
      }

    private var issuingCardValue: ConnectEmbeddedIssuingCardConfigClaim? = null

    public var issuingCard: ConnectEmbeddedIssuingCardConfigClaim
      get() = requireNotNull(issuingCardValue) { "issuingCard is required" }
      set(`value`) {
        issuingCardValue = value
      }

    private var issuingCardsListValue: ConnectEmbeddedIssuingCardsListConfigClaim? = null

    public var issuingCardsList: ConnectEmbeddedIssuingCardsListConfigClaim
      get() = requireNotNull(issuingCardsListValue) { "issuingCardsList is required" }
      set(`value`) {
        issuingCardsListValue = value
      }

    private var notificationBannerValue: ConnectEmbeddedAccountConfigClaim? = null

    public var notificationBanner: ConnectEmbeddedAccountConfigClaim
      get() = requireNotNull(notificationBannerValue) { "notificationBanner is required" }
      set(`value`) {
        notificationBannerValue = value
      }

    private var paymentDetailsValue: ConnectEmbeddedPaymentsConfigClaim? = null

    public var paymentDetails: ConnectEmbeddedPaymentsConfigClaim
      get() = requireNotNull(paymentDetailsValue) { "paymentDetails is required" }
      set(`value`) {
        paymentDetailsValue = value
      }

    private var paymentDisputesValue: ConnectEmbeddedPaymentDisputesConfig? = null

    public var paymentDisputes: ConnectEmbeddedPaymentDisputesConfig
      get() = requireNotNull(paymentDisputesValue) { "paymentDisputes is required" }
      set(`value`) {
        paymentDisputesValue = value
      }

    private var paymentsValue: ConnectEmbeddedPaymentsConfigClaim? = null

    public var payments: ConnectEmbeddedPaymentsConfigClaim
      get() = requireNotNull(paymentsValue) { "payments is required" }
      set(`value`) {
        paymentsValue = value
      }

    private var payoutDetailsValue: ConnectEmbeddedBaseConfigClaim? = null

    public var payoutDetails: ConnectEmbeddedBaseConfigClaim
      get() = requireNotNull(payoutDetailsValue) { "payoutDetails is required" }
      set(`value`) {
        payoutDetailsValue = value
      }

    private var payoutReconciliationReportValue: ConnectEmbeddedBaseConfigClaim? = null

    public var payoutReconciliationReport: ConnectEmbeddedBaseConfigClaim
      get() = requireNotNull(payoutReconciliationReportValue) { "payoutReconciliationReport is required" }
      set(`value`) {
        payoutReconciliationReportValue = value
      }

    private var payoutsValue: ConnectEmbeddedPayoutsConfig? = null

    public var payouts: ConnectEmbeddedPayoutsConfig
      get() = requireNotNull(payoutsValue) { "payouts is required" }
      set(`value`) {
        payoutsValue = value
      }

    private var payoutsListValue: ConnectEmbeddedBaseConfigClaim? = null

    public var payoutsList: ConnectEmbeddedBaseConfigClaim
      get() = requireNotNull(payoutsListValue) { "payoutsList is required" }
      set(`value`) {
        payoutsListValue = value
      }

    private var taxRegistrationsValue: ConnectEmbeddedBaseConfigClaim? = null

    public var taxRegistrations: ConnectEmbeddedBaseConfigClaim
      get() = requireNotNull(taxRegistrationsValue) { "taxRegistrations is required" }
      set(`value`) {
        taxRegistrationsValue = value
      }

    private var taxSettingsValue: ConnectEmbeddedBaseConfigClaim? = null

    public var taxSettings: ConnectEmbeddedBaseConfigClaim
      get() = requireNotNull(taxSettingsValue) { "taxSettings is required" }
      set(`value`) {
        taxSettingsValue = value
      }

    public fun build(): ConnectEmbeddedAccountSessionCreateComponents {
      check(accountManagementValue != null) { "accountManagement is required" }
      check(accountOnboardingValue != null) { "accountOnboarding is required" }
      check(balanceReportValue != null) { "balanceReport is required" }
      check(balancesValue != null) { "balances is required" }
      check(disputesListValue != null) { "disputesList is required" }
      check(documentsValue != null) { "documents is required" }
      check(financialAccountValue != null) { "financialAccount is required" }
      check(financialAccountTransactionsValue != null) { "financialAccountTransactions is required" }
      check(instantPayoutsPromotionValue != null) { "instantPayoutsPromotion is required" }
      check(issuingCardValue != null) { "issuingCard is required" }
      check(issuingCardsListValue != null) { "issuingCardsList is required" }
      check(notificationBannerValue != null) { "notificationBanner is required" }
      check(paymentDetailsValue != null) { "paymentDetails is required" }
      check(paymentDisputesValue != null) { "paymentDisputes is required" }
      check(paymentsValue != null) { "payments is required" }
      check(payoutDetailsValue != null) { "payoutDetails is required" }
      check(payoutReconciliationReportValue != null) { "payoutReconciliationReport is required" }
      check(payoutsValue != null) { "payouts is required" }
      check(payoutsListValue != null) { "payoutsList is required" }
      check(taxRegistrationsValue != null) { "taxRegistrations is required" }
      check(taxSettingsValue != null) { "taxSettings is required" }
      return ConnectEmbeddedAccountSessionCreateComponents(
        accountManagement = accountManagement,
        accountOnboarding = accountOnboarding,
        balanceReport = balanceReport,
        balances = balances,
        disputesList = disputesList,
        documents = documents,
        financialAccount = financialAccount,
        financialAccountTransactions = financialAccountTransactions,
        instantPayoutsPromotion = instantPayoutsPromotion,
        issuingCard = issuingCard,
        issuingCardsList = issuingCardsList,
        notificationBanner = notificationBanner,
        paymentDetails = paymentDetails,
        paymentDisputes = paymentDisputes,
        payments = payments,
        payoutDetails = payoutDetails,
        payoutReconciliationReport = payoutReconciliationReport,
        payouts = payouts,
        payoutsList = payoutsList,
        taxRegistrations = taxRegistrations,
        taxSettings = taxSettings,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ConnectEmbeddedAccountSessionCreateComponents = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ConnectEmbeddedAccountSessionCreateComponents> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ConnectEmbeddedAccountSessionCreateComponents {
      val jsonDecoder = decoder.requireJsonDecoder("ConnectEmbeddedAccountSessionCreateComponents")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ConnectEmbeddedAccountSessionCreateComponents must be a JSON object")
      val accountManagement = json.decodeRequired<ConnectEmbeddedAccountConfigClaim>(rawObject, "account_management")
      val accountOnboarding = json.decodeRequired<ConnectEmbeddedAccountConfigClaim>(rawObject, "account_onboarding")
      val balanceReport = json.decodeRequired<ConnectEmbeddedBaseConfigClaim>(rawObject, "balance_report")
      val balances = json.decodeRequired<ConnectEmbeddedPayoutsConfig>(rawObject, "balances")
      val disputesList = json.decodeRequired<ConnectEmbeddedDisputesListConfig>(rawObject, "disputes_list")
      val documents = json.decodeRequired<ConnectEmbeddedBaseConfigClaim>(rawObject, "documents")
      val financialAccount = json.decodeRequired<ConnectEmbeddedFinancialAccountConfigClaim>(rawObject, "financial_account")
      val financialAccountTransactions = json.decodeRequired<ConnectEmbeddedFinancialAccountTransactionsConfigClaim>(rawObject, "financial_account_transactions")
      val instantPayoutsPromotion = json.decodeRequired<ConnectEmbeddedInstantPayoutsPromotionConfig>(rawObject, "instant_payouts_promotion")
      val issuingCard = json.decodeRequired<ConnectEmbeddedIssuingCardConfigClaim>(rawObject, "issuing_card")
      val issuingCardsList = json.decodeRequired<ConnectEmbeddedIssuingCardsListConfigClaim>(rawObject, "issuing_cards_list")
      val notificationBanner = json.decodeRequired<ConnectEmbeddedAccountConfigClaim>(rawObject, "notification_banner")
      val paymentDetails = json.decodeRequired<ConnectEmbeddedPaymentsConfigClaim>(rawObject, "payment_details")
      val paymentDisputes = json.decodeRequired<ConnectEmbeddedPaymentDisputesConfig>(rawObject, "payment_disputes")
      val payments = json.decodeRequired<ConnectEmbeddedPaymentsConfigClaim>(rawObject, "payments")
      val payoutDetails = json.decodeRequired<ConnectEmbeddedBaseConfigClaim>(rawObject, "payout_details")
      val payoutReconciliationReport = json.decodeRequired<ConnectEmbeddedBaseConfigClaim>(rawObject, "payout_reconciliation_report")
      val payouts = json.decodeRequired<ConnectEmbeddedPayoutsConfig>(rawObject, "payouts")
      val payoutsList = json.decodeRequired<ConnectEmbeddedBaseConfigClaim>(rawObject, "payouts_list")
      val taxRegistrations = json.decodeRequired<ConnectEmbeddedBaseConfigClaim>(rawObject, "tax_registrations")
      val taxSettings = json.decodeRequired<ConnectEmbeddedBaseConfigClaim>(rawObject, "tax_settings")
      return ConnectEmbeddedAccountSessionCreateComponents(
        accountManagement = accountManagement,
        accountOnboarding = accountOnboarding,
        balanceReport = balanceReport,
        balances = balances,
        disputesList = disputesList,
        documents = documents,
        financialAccount = financialAccount,
        financialAccountTransactions = financialAccountTransactions,
        instantPayoutsPromotion = instantPayoutsPromotion,
        issuingCard = issuingCard,
        issuingCardsList = issuingCardsList,
        notificationBanner = notificationBanner,
        paymentDetails = paymentDetails,
        paymentDisputes = paymentDisputes,
        payments = payments,
        payoutDetails = payoutDetails,
        payoutReconciliationReport = payoutReconciliationReport,
        payouts = payouts,
        payoutsList = payoutsList,
        taxRegistrations = taxRegistrations,
        taxSettings = taxSettings,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ConnectEmbeddedAccountSessionCreateComponents) {
      val jsonEncoder = encoder.requireJsonEncoder("ConnectEmbeddedAccountSessionCreateComponents")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("account_management", json.encodeToJsonElement(value.accountManagement))
        put("account_onboarding", json.encodeToJsonElement(value.accountOnboarding))
        put("balance_report", json.encodeToJsonElement(value.balanceReport))
        put("balances", json.encodeToJsonElement(value.balances))
        put("disputes_list", json.encodeToJsonElement(value.disputesList))
        put("documents", json.encodeToJsonElement(value.documents))
        put("financial_account", json.encodeToJsonElement(value.financialAccount))
        put("financial_account_transactions", json.encodeToJsonElement(value.financialAccountTransactions))
        put("instant_payouts_promotion", json.encodeToJsonElement(value.instantPayoutsPromotion))
        put("issuing_card", json.encodeToJsonElement(value.issuingCard))
        put("issuing_cards_list", json.encodeToJsonElement(value.issuingCardsList))
        put("notification_banner", json.encodeToJsonElement(value.notificationBanner))
        put("payment_details", json.encodeToJsonElement(value.paymentDetails))
        put("payment_disputes", json.encodeToJsonElement(value.paymentDisputes))
        put("payments", json.encodeToJsonElement(value.payments))
        put("payout_details", json.encodeToJsonElement(value.payoutDetails))
        put("payout_reconciliation_report", json.encodeToJsonElement(value.payoutReconciliationReport))
        put("payouts", json.encodeToJsonElement(value.payouts))
        put("payouts_list", json.encodeToJsonElement(value.payoutsList))
        put("tax_registrations", json.encodeToJsonElement(value.taxRegistrations))
        put("tax_settings", json.encodeToJsonElement(value.taxSettings))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun connectEmbeddedAccountSessionCreateComponents(block: ConnectEmbeddedAccountSessionCreateComponents.Builder.() -> Unit): ConnectEmbeddedAccountSessionCreateComponents = ConnectEmbeddedAccountSessionCreateComponents.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ConnectEmbeddedAccountSessionCreateComponents is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
