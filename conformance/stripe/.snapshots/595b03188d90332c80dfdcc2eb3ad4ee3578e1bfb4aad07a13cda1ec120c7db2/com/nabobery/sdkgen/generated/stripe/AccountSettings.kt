package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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
import kotlin.String
import kotlin.Unit

@Serializable
public data class AccountSettingsView(
    @SerialName("bacs_debit_payments")
    public val bacsDebitPayments: AccountBacsDebitPaymentsSettings? = null,
    public val branding: AccountBrandingSettings,
    @SerialName("card_issuing")
    public val cardIssuing: AccountCardIssuingSettings? = null,
    @SerialName("card_payments")
    public val cardPayments: AccountCardPaymentsSettings,
    public val dashboard: AccountDashboardSettings,
    public val invoices: AccountInvoicesSettings? = null,
    public val payments: AccountPaymentsSettings,
    public val payouts: AccountPayoutSettings? = null,
    @SerialName("sepa_debit_payments")
    public val sepaDebitPayments: AccountSepaDebitPaymentsSettings? = null,
    public val treasury: AccountTreasurySettings? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_settings
 */
@Serializable(with = AccountSettings.Serializer::class)
public class AccountSettings(
    public val branding: AccountBrandingSettings,
    public val cardPayments: AccountCardPaymentsSettings,
    public val dashboard: AccountDashboardSettings,
    public val payments: AccountPaymentsSettings,
    public val bacsDebitPayments: AccountBacsDebitPaymentsSettings? = null,
    public val cardIssuing: AccountCardIssuingSettings? = null,
    public val invoices: AccountInvoicesSettings? = null,
    public val payouts: AccountPayoutSettings? = null,
    public val sepaDebitPayments: AccountSepaDebitPaymentsSettings? = null,
    public val treasury: AccountTreasurySettings? = null,
) {
    public class Builder {
        private var brandingValue: AccountBrandingSettings? = null

        public var branding: AccountBrandingSettings
            get() = requireNotNull(brandingValue) { "branding is required" }
            set(`value`) {
                brandingValue = value
            }

        private var cardPaymentsValue: AccountCardPaymentsSettings? = null

        public var cardPayments: AccountCardPaymentsSettings
            get() = requireNotNull(cardPaymentsValue) { "cardPayments is required" }
            set(`value`) {
                cardPaymentsValue = value
            }

        private var dashboardValue: AccountDashboardSettings? = null

        public var dashboard: AccountDashboardSettings
            get() = requireNotNull(dashboardValue) { "dashboard is required" }
            set(`value`) {
                dashboardValue = value
            }

        private var paymentsValue: AccountPaymentsSettings? = null

        public var payments: AccountPaymentsSettings
            get() = requireNotNull(paymentsValue) { "payments is required" }
            set(`value`) {
                paymentsValue = value
            }

        public var bacsDebitPayments: AccountBacsDebitPaymentsSettings? = null

        public var cardIssuing: AccountCardIssuingSettings? = null

        public var invoices: AccountInvoicesSettings? = null

        public var payouts: AccountPayoutSettings? = null

        public var sepaDebitPayments: AccountSepaDebitPaymentsSettings? = null

        public var treasury: AccountTreasurySettings? = null

        public fun build(): AccountSettings {
            check(brandingValue != null) { "branding is required" }
            check(cardPaymentsValue != null) { "cardPayments is required" }
            check(dashboardValue != null) { "dashboard is required" }
            check(paymentsValue != null) { "payments is required" }
            return AccountSettings(
                branding = branding,
                cardPayments = cardPayments,
                dashboard = dashboard,
                payments = payments,
                bacsDebitPayments = bacsDebitPayments,
                cardIssuing = cardIssuing,
                invoices = invoices,
                payouts = payouts,
                sepaDebitPayments = sepaDebitPayments,
                treasury = treasury,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): AccountSettings = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<AccountSettings> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): AccountSettings {
            val jsonDecoder = decoder.requireJsonDecoder("AccountSettings")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("AccountSettings must be a JSON object")
            val branding = json.decodeRequired<AccountBrandingSettings>(rawObject, "branding")
            val cardPayments = json.decodeRequired<AccountCardPaymentsSettings>(rawObject, "card_payments")
            val dashboard = json.decodeRequired<AccountDashboardSettings>(rawObject, "dashboard")
            val payments = json.decodeRequired<AccountPaymentsSettings>(rawObject, "payments")
            return AccountSettings(
                branding = branding,
                cardPayments = cardPayments,
                dashboard = dashboard,
                payments = payments,
                bacsDebitPayments =
                    rawObject["bacs_debit_payments"]?.let {
                        json.decodeFromJsonElement<AccountBacsDebitPaymentsSettings>(it)
                    },
                cardIssuing =
                    rawObject["card_issuing"]?.let {
                        json
                            .decodeFromJsonElement<AccountCardIssuingSettings>(
                                it,
                            )
                    },
                invoices = rawObject["invoices"]?.let { json.decodeFromJsonElement<AccountInvoicesSettings>(it) },
                payouts = rawObject["payouts"]?.let { json.decodeFromJsonElement<AccountPayoutSettings>(it) },
                sepaDebitPayments =
                    rawObject["sepa_debit_payments"]?.let {
                        json.decodeFromJsonElement<AccountSepaDebitPaymentsSettings>(it)
                    },
                treasury = rawObject["treasury"]?.let { json.decodeFromJsonElement<AccountTreasurySettings>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: AccountSettings,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("AccountSettings")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("branding", json.encodeToJsonElement(value.branding))
                    put("card_payments", json.encodeToJsonElement(value.cardPayments))
                    put("dashboard", json.encodeToJsonElement(value.dashboard))
                    put("payments", json.encodeToJsonElement(value.payments))
                    value.bacsDebitPayments?.let { put("bacs_debit_payments", json.encodeToJsonElement(it)) }
                    value.cardIssuing?.let { put("card_issuing", json.encodeToJsonElement(it)) }
                    value.invoices?.let { put("invoices", json.encodeToJsonElement(it)) }
                    value.payouts?.let { put("payouts", json.encodeToJsonElement(it)) }
                    value.sepaDebitPayments?.let { put("sepa_debit_payments", json.encodeToJsonElement(it)) }
                    value.treasury?.let { put("treasury", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun accountSettings(block: AccountSettings.Builder.() -> Unit): AccountSettings = AccountSettings.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name] ?: throw SerializationException("AccountSettings is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
