package com.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Each key of the dictionary represents an embedded component, and each embedded component maps to its configuration
 * (e.g. whether it has been enabled or not).
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1account_sessions/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/components
 */
@Serializable(with = InlineV1AccountSessionsPostRequestFormComponentsX621e47a3.Serializer::class)
public class InlineV1AccountSessionsPostRequestFormComponentsX621e47a3(
  public val accountManagement:
      InlineV1AccountSessionsPostRequestFormComponentsAccountManagementXf938a460? = null,
  public val accountOnboarding:
      InlineV1AccountSessionsPostRequestFormComponentsAccountOnboardingX2c600e84? = null,
  public val balanceReport:
      InlineV1AccountSessionsPostRequestFormComponentsBalanceReportX320fa6c7? = null,
  public val balances: InlineV1AccountSessionsPostRequestFormComponentsBalancesX47ba8513? = null,
  public val disputesList:
      InlineV1AccountSessionsPostRequestFormComponentsDisputesListXf3ff1ba6? = null,
  public val documents: InlineV1AccountSessionsPostRequestFormComponentsDocumentsX5c9d67c7? = null,
  public val financialAccount:
      InlineV1AccountSessionsPostRequestFormComponentsFinancialAccountX16c37f4a? = null,
  public val financialAccountTransactions:
      InlineV1AccountSessionsPostRequestFormFinancialAccountTrane127X4bf4b8a7? = null,
  public val instantPayoutsPromotion:
      InlineV1AccountSessionsPostRequestFormComponentsInstantPayoutsPromotionX1cf840ec? = null,
  public val issuingCard:
      InlineV1AccountSessionsPostRequestFormComponentsIssuingCardX085614aa? = null,
  public val issuingCardsList:
      InlineV1AccountSessionsPostRequestFormComponentsIssuingCardsListX27e1c9cc? = null,
  public val notificationBanner:
      InlineV1AccountSessionsPostRequestFormComponentsNotificationBannerXd1d0b4d7? = null,
  public val paymentDetails:
      InlineV1AccountSessionsPostRequestFormComponentsPaymentDetailsX08e1c631? = null,
  public val paymentDisputes:
      InlineV1AccountSessionsPostRequestFormComponentsPaymentDisputesXfacf6bbb? = null,
  public val payments: InlineV1AccountSessionsPostRequestFormComponentsPaymentsX94816c2f? = null,
  public val payoutDetails:
      InlineV1AccountSessionsPostRequestFormComponentsPayoutDetailsX9bda0df5? = null,
  public val payoutReconciliationReport:
      InlineV1AccountSessionsPostRequestFormPayoutReconciliationfd97X634f1588? = null,
  public val payouts: InlineV1AccountSessionsPostRequestFormComponentsPayoutsX7b5f15fa? = null,
  public val payoutsList:
      InlineV1AccountSessionsPostRequestFormComponentsPayoutsListX00d5f0e8? = null,
  public val taxRegistrations:
      InlineV1AccountSessionsPostRequestFormComponentsTaxRegistrationsXee75b36e? = null,
  public val taxSettings:
      InlineV1AccountSessionsPostRequestFormComponentsTaxSettingsX26422387? = null,
) {
  public class Builder {
    public var accountManagement:
        InlineV1AccountSessionsPostRequestFormComponentsAccountManagementXf938a460? = null

    public var accountOnboarding:
        InlineV1AccountSessionsPostRequestFormComponentsAccountOnboardingX2c600e84? = null

    public var balanceReport:
        InlineV1AccountSessionsPostRequestFormComponentsBalanceReportX320fa6c7? = null

    public var balances: InlineV1AccountSessionsPostRequestFormComponentsBalancesX47ba8513? = null

    public var disputesList: InlineV1AccountSessionsPostRequestFormComponentsDisputesListXf3ff1ba6?
        = null

    public var documents: InlineV1AccountSessionsPostRequestFormComponentsDocumentsX5c9d67c7? = null

    public var financialAccount:
        InlineV1AccountSessionsPostRequestFormComponentsFinancialAccountX16c37f4a? = null

    public var financialAccountTransactions:
        InlineV1AccountSessionsPostRequestFormFinancialAccountTrane127X4bf4b8a7? = null

    public var instantPayoutsPromotion:
        InlineV1AccountSessionsPostRequestFormComponentsInstantPayoutsPromotionX1cf840ec? = null

    public var issuingCard: InlineV1AccountSessionsPostRequestFormComponentsIssuingCardX085614aa? =
        null

    public var issuingCardsList:
        InlineV1AccountSessionsPostRequestFormComponentsIssuingCardsListX27e1c9cc? = null

    public var notificationBanner:
        InlineV1AccountSessionsPostRequestFormComponentsNotificationBannerXd1d0b4d7? = null

    public var paymentDetails:
        InlineV1AccountSessionsPostRequestFormComponentsPaymentDetailsX08e1c631? = null

    public var paymentDisputes:
        InlineV1AccountSessionsPostRequestFormComponentsPaymentDisputesXfacf6bbb? = null

    public var payments: InlineV1AccountSessionsPostRequestFormComponentsPaymentsX94816c2f? = null

    public var payoutDetails:
        InlineV1AccountSessionsPostRequestFormComponentsPayoutDetailsX9bda0df5? = null

    public var payoutReconciliationReport:
        InlineV1AccountSessionsPostRequestFormPayoutReconciliationfd97X634f1588? = null

    public var payouts: InlineV1AccountSessionsPostRequestFormComponentsPayoutsX7b5f15fa? = null

    public var payoutsList: InlineV1AccountSessionsPostRequestFormComponentsPayoutsListX00d5f0e8? =
        null

    public var taxRegistrations:
        InlineV1AccountSessionsPostRequestFormComponentsTaxRegistrationsXee75b36e? = null

    public var taxSettings: InlineV1AccountSessionsPostRequestFormComponentsTaxSettingsX26422387? =
        null

    public fun build(): InlineV1AccountSessionsPostRequestFormComponentsX621e47a3 = InlineV1AccountSessionsPostRequestFormComponentsX621e47a3(
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

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountSessionsPostRequestFormComponentsX621e47a3 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1AccountSessionsPostRequestFormComponentsX621e47a3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountSessionsPostRequestFormComponentsX621e47a3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountSessionsPostRequestFormComponentsX621e47a3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountSessionsPostRequestFormComponentsX621e47a3 must be a JSON object")
      return InlineV1AccountSessionsPostRequestFormComponentsX621e47a3(
        accountManagement = rawObject["account_management"]?.let { json.decodeFromJsonElement<InlineV1AccountSessionsPostRequestFormComponentsAccountManagementXf938a460>(it) },
        accountOnboarding = rawObject["account_onboarding"]?.let { json.decodeFromJsonElement<InlineV1AccountSessionsPostRequestFormComponentsAccountOnboardingX2c600e84>(it) },
        balanceReport = rawObject["balance_report"]?.let { json.decodeFromJsonElement<InlineV1AccountSessionsPostRequestFormComponentsBalanceReportX320fa6c7>(it) },
        balances = rawObject["balances"]?.let { json.decodeFromJsonElement<InlineV1AccountSessionsPostRequestFormComponentsBalancesX47ba8513>(it) },
        disputesList = rawObject["disputes_list"]?.let { json.decodeFromJsonElement<InlineV1AccountSessionsPostRequestFormComponentsDisputesListXf3ff1ba6>(it) },
        documents = rawObject["documents"]?.let { json.decodeFromJsonElement<InlineV1AccountSessionsPostRequestFormComponentsDocumentsX5c9d67c7>(it) },
        financialAccount = rawObject["financial_account"]?.let { json.decodeFromJsonElement<InlineV1AccountSessionsPostRequestFormComponentsFinancialAccountX16c37f4a>(it) },
        financialAccountTransactions = rawObject["financial_account_transactions"]?.let { json.decodeFromJsonElement<InlineV1AccountSessionsPostRequestFormFinancialAccountTrane127X4bf4b8a7>(it) },
        instantPayoutsPromotion = rawObject["instant_payouts_promotion"]?.let { json.decodeFromJsonElement<InlineV1AccountSessionsPostRequestFormComponentsInstantPayoutsPromotionX1cf840ec>(it) },
        issuingCard = rawObject["issuing_card"]?.let { json.decodeFromJsonElement<InlineV1AccountSessionsPostRequestFormComponentsIssuingCardX085614aa>(it) },
        issuingCardsList = rawObject["issuing_cards_list"]?.let { json.decodeFromJsonElement<InlineV1AccountSessionsPostRequestFormComponentsIssuingCardsListX27e1c9cc>(it) },
        notificationBanner = rawObject["notification_banner"]?.let { json.decodeFromJsonElement<InlineV1AccountSessionsPostRequestFormComponentsNotificationBannerXd1d0b4d7>(it) },
        paymentDetails = rawObject["payment_details"]?.let { json.decodeFromJsonElement<InlineV1AccountSessionsPostRequestFormComponentsPaymentDetailsX08e1c631>(it) },
        paymentDisputes = rawObject["payment_disputes"]?.let { json.decodeFromJsonElement<InlineV1AccountSessionsPostRequestFormComponentsPaymentDisputesXfacf6bbb>(it) },
        payments = rawObject["payments"]?.let { json.decodeFromJsonElement<InlineV1AccountSessionsPostRequestFormComponentsPaymentsX94816c2f>(it) },
        payoutDetails = rawObject["payout_details"]?.let { json.decodeFromJsonElement<InlineV1AccountSessionsPostRequestFormComponentsPayoutDetailsX9bda0df5>(it) },
        payoutReconciliationReport = rawObject["payout_reconciliation_report"]?.let { json.decodeFromJsonElement<InlineV1AccountSessionsPostRequestFormPayoutReconciliationfd97X634f1588>(it) },
        payouts = rawObject["payouts"]?.let { json.decodeFromJsonElement<InlineV1AccountSessionsPostRequestFormComponentsPayoutsX7b5f15fa>(it) },
        payoutsList = rawObject["payouts_list"]?.let { json.decodeFromJsonElement<InlineV1AccountSessionsPostRequestFormComponentsPayoutsListX00d5f0e8>(it) },
        taxRegistrations = rawObject["tax_registrations"]?.let { json.decodeFromJsonElement<InlineV1AccountSessionsPostRequestFormComponentsTaxRegistrationsXee75b36e>(it) },
        taxSettings = rawObject["tax_settings"]?.let { json.decodeFromJsonElement<InlineV1AccountSessionsPostRequestFormComponentsTaxSettingsX26422387>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountSessionsPostRequestFormComponentsX621e47a3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountSessionsPostRequestFormComponentsX621e47a3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.accountManagement?.let { put("account_management", json.encodeToJsonElement(it)) }
        value.accountOnboarding?.let { put("account_onboarding", json.encodeToJsonElement(it)) }
        value.balanceReport?.let { put("balance_report", json.encodeToJsonElement(it)) }
        value.balances?.let { put("balances", json.encodeToJsonElement(it)) }
        value.disputesList?.let { put("disputes_list", json.encodeToJsonElement(it)) }
        value.documents?.let { put("documents", json.encodeToJsonElement(it)) }
        value.financialAccount?.let { put("financial_account", json.encodeToJsonElement(it)) }
        value.financialAccountTransactions?.let { put("financial_account_transactions", json.encodeToJsonElement(it)) }
        value.instantPayoutsPromotion?.let { put("instant_payouts_promotion", json.encodeToJsonElement(it)) }
        value.issuingCard?.let { put("issuing_card", json.encodeToJsonElement(it)) }
        value.issuingCardsList?.let { put("issuing_cards_list", json.encodeToJsonElement(it)) }
        value.notificationBanner?.let { put("notification_banner", json.encodeToJsonElement(it)) }
        value.paymentDetails?.let { put("payment_details", json.encodeToJsonElement(it)) }
        value.paymentDisputes?.let { put("payment_disputes", json.encodeToJsonElement(it)) }
        value.payments?.let { put("payments", json.encodeToJsonElement(it)) }
        value.payoutDetails?.let { put("payout_details", json.encodeToJsonElement(it)) }
        value.payoutReconciliationReport?.let { put("payout_reconciliation_report", json.encodeToJsonElement(it)) }
        value.payouts?.let { put("payouts", json.encodeToJsonElement(it)) }
        value.payoutsList?.let { put("payouts_list", json.encodeToJsonElement(it)) }
        value.taxRegistrations?.let { put("tax_registrations", json.encodeToJsonElement(it)) }
        value.taxSettings?.let { put("tax_settings", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountSessionsPostRequestFormComponentsX621e47a3(block: InlineV1AccountSessionsPostRequestFormComponentsX621e47a3.Builder.() -> Unit): InlineV1AccountSessionsPostRequestFormComponentsX621e47a3 = InlineV1AccountSessionsPostRequestFormComponentsX621e47a3.build(block)
