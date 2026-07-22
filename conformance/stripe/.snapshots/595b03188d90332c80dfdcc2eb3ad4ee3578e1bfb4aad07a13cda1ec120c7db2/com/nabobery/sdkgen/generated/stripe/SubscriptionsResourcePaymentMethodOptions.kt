package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Unit

@Serializable
public data class SubscriptionsResourcePaymentMethodOptionsView(
    @SerialName("acss_debit")
    public val acssDebit: InlineSubscriptionsResourcePaymentMethodOptionsAcssDebitXee7bc235? = null,
    public val bancontact: InlineSubscriptionsResourcePaymentMethodOptionsBancontactX9391c49c? = null,
    public val card: InlineSubscriptionsResourcePaymentMethodOptionsCardX188087bc? = null,
    @SerialName("customer_balance")
    public val customerBalance: InlineSubscriptionsResourcePaymentMethodOptionsCustomerBalanceX313818de? = null,
    public val konbini: InlineSubscriptionsResourcePaymentMethodOptionsKonbiniXd507e5d1? = null,
    public val payto: InlineSubscriptionsResourcePaymentMethodOptionsPaytoX542135c1? = null,
    public val pix: InlineSubscriptionsResourcePaymentMethodOptionsPixX520b5633? = null,
    @SerialName("sepa_debit")
    public val sepaDebit: InlineSubscriptionsResourcePaymentMethodOptionsSepaDebitX715a7c0b? = null,
    public val upi: InlineSubscriptionsResourcePaymentMethodOptionsUpiX35e798ed? = null,
    @SerialName("us_bank_account")
    public val usBankAccount: InlineSubscriptionsResourcePaymentMethodOptionsUsBankAccountXd7ad0d47? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscriptions_resource_payment_method_options
 */
@Serializable(with = SubscriptionsResourcePaymentMethodOptions.Serializer::class)
public class SubscriptionsResourcePaymentMethodOptions(
    /**
     * This sub-hash contains details about the Canadian pre-authorized debit payment method options to pass to invoices
     * created by the subscription.
     */
    public val acssDebit: InlineSubscriptionsResourcePaymentMethodOptionsAcssDebitXee7bc235? = null,
    /**
     * This sub-hash contains details about the Bancontact payment method options to pass to invoices created by the
     * subscription.
     */
    public val bancontact: InlineSubscriptionsResourcePaymentMethodOptionsBancontactX9391c49c? = null,
    /**
     * This sub-hash contains details about the Card payment method options to pass to invoices created by the
     * subscription.
     */
    public val card: InlineSubscriptionsResourcePaymentMethodOptionsCardX188087bc? = null,
    /**
     * This sub-hash contains details about the Bank transfer payment method options to pass to invoices created by the
     * subscription.
     */
    public val customerBalance: InlineSubscriptionsResourcePaymentMethodOptionsCustomerBalanceX313818de? = null,
    /**
     * This sub-hash contains details about the Konbini payment method options to pass to invoices created by the
     * subscription.
     */
    public val konbini: InlineSubscriptionsResourcePaymentMethodOptionsKonbiniXd507e5d1? = null,
    /**
     * This sub-hash contains details about the PayTo payment method options to pass to invoices created by the
     * subscription.
     */
    public val payto: InlineSubscriptionsResourcePaymentMethodOptionsPaytoX542135c1? = null,
    /**
     * This sub-hash contains details about the Pix payment method options to pass to invoices created by the
     * subscription.
     */
    public val pix: InlineSubscriptionsResourcePaymentMethodOptionsPixX520b5633? = null,
    /**
     * This sub-hash contains details about the SEPA Direct Debit payment method options to pass to invoices created by
     * the subscription.
     */
    public val sepaDebit: InlineSubscriptionsResourcePaymentMethodOptionsSepaDebitX715a7c0b? = null,
    /**
     * This sub-hash contains details about the UPI payment method options to pass to invoices created by the
     * subscription.
     */
    public val upi: InlineSubscriptionsResourcePaymentMethodOptionsUpiX35e798ed? = null,
    /**
     * This sub-hash contains details about the ACH direct debit payment method options to pass to invoices created by the
     * subscription.
     */
    public val usBankAccount: InlineSubscriptionsResourcePaymentMethodOptionsUsBankAccountXd7ad0d47? = null,
) {
    public class Builder {
        /**
         * This sub-hash contains details about the Canadian pre-authorized debit payment method options to pass to invoices
         * created by the subscription.
         */
        public var acssDebit: InlineSubscriptionsResourcePaymentMethodOptionsAcssDebitXee7bc235? = null

        /**
         * This sub-hash contains details about the Bancontact payment method options to pass to invoices created by the
         * subscription.
         */
        public var bancontact: InlineSubscriptionsResourcePaymentMethodOptionsBancontactX9391c49c? =
            null

        /**
         * This sub-hash contains details about the Card payment method options to pass to invoices created by the
         * subscription.
         */
        public var card: InlineSubscriptionsResourcePaymentMethodOptionsCardX188087bc? = null

        /**
         * This sub-hash contains details about the Bank transfer payment method options to pass to invoices created by the
         * subscription.
         */
        public var customerBalance:
            InlineSubscriptionsResourcePaymentMethodOptionsCustomerBalanceX313818de? = null

        /**
         * This sub-hash contains details about the Konbini payment method options to pass to invoices created by the
         * subscription.
         */
        public var konbini: InlineSubscriptionsResourcePaymentMethodOptionsKonbiniXd507e5d1? = null

        /**
         * This sub-hash contains details about the PayTo payment method options to pass to invoices created by the
         * subscription.
         */
        public var payto: InlineSubscriptionsResourcePaymentMethodOptionsPaytoX542135c1? = null

        /**
         * This sub-hash contains details about the Pix payment method options to pass to invoices created by the
         * subscription.
         */
        public var pix: InlineSubscriptionsResourcePaymentMethodOptionsPixX520b5633? = null

        /**
         * This sub-hash contains details about the SEPA Direct Debit payment method options to pass to invoices created by
         * the subscription.
         */
        public var sepaDebit: InlineSubscriptionsResourcePaymentMethodOptionsSepaDebitX715a7c0b? = null

        /**
         * This sub-hash contains details about the UPI payment method options to pass to invoices created by the
         * subscription.
         */
        public var upi: InlineSubscriptionsResourcePaymentMethodOptionsUpiX35e798ed? = null

        /**
         * This sub-hash contains details about the ACH direct debit payment method options to pass to invoices created by
         * the subscription.
         */
        public var usBankAccount: InlineSubscriptionsResourcePaymentMethodOptionsUsBankAccountXd7ad0d47? =
            null

        public fun build(): SubscriptionsResourcePaymentMethodOptions =
            SubscriptionsResourcePaymentMethodOptions(
                acssDebit = acssDebit,
                bancontact = bancontact,
                card = card,
                customerBalance = customerBalance,
                konbini = konbini,
                payto = payto,
                pix = pix,
                sepaDebit = sepaDebit,
                upi = upi,
                usBankAccount = usBankAccount,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): SubscriptionsResourcePaymentMethodOptions =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<SubscriptionsResourcePaymentMethodOptions> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): SubscriptionsResourcePaymentMethodOptions {
            val jsonDecoder = decoder.requireJsonDecoder("SubscriptionsResourcePaymentMethodOptions")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("SubscriptionsResourcePaymentMethodOptions must be a JSON object")
            return SubscriptionsResourcePaymentMethodOptions(
                acssDebit =
                    rawObject["acss_debit"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<InlineSubscriptionsResourcePaymentMethodOptionsAcssDebitXee7bc235?>(
                                    element,
                                )
                        }
                    },
                bancontact =
                    rawObject["bancontact"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<InlineSubscriptionsResourcePaymentMethodOptionsBancontactX9391c49c?>(
                                    element,
                                )
                        }
                    },
                card =
                    rawObject["card"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineSubscriptionsResourcePaymentMethodOptionsCardX188087bc?>(
                                element,
                            )
                        }
                    },
                customerBalance =
                    rawObject["customer_balance"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<InlineSubscriptionsResourcePaymentMethodOptionsCustomerBalanceX313818de?>(
                                    element,
                                )
                        }
                    },
                konbini =
                    rawObject["konbini"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<InlineSubscriptionsResourcePaymentMethodOptionsKonbiniXd507e5d1?>(
                                    element,
                                )
                        }
                    },
                payto =
                    rawObject["payto"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineSubscriptionsResourcePaymentMethodOptionsPaytoX542135c1?>(
                                element,
                            )
                        }
                    },
                pix =
                    rawObject["pix"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineSubscriptionsResourcePaymentMethodOptionsPixX520b5633?>(
                                element,
                            )
                        }
                    },
                sepaDebit =
                    rawObject["sepa_debit"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<InlineSubscriptionsResourcePaymentMethodOptionsSepaDebitX715a7c0b?>(
                                    element,
                                )
                        }
                    },
                upi =
                    rawObject["upi"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineSubscriptionsResourcePaymentMethodOptionsUpiX35e798ed?>(
                                element,
                            )
                        }
                    },
                usBankAccount =
                    rawObject["us_bank_account"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<InlineSubscriptionsResourcePaymentMethodOptionsUsBankAccountXd7ad0d47?>(
                                    element,
                                )
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: SubscriptionsResourcePaymentMethodOptions,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("SubscriptionsResourcePaymentMethodOptions")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.acssDebit?.let { put("acss_debit", json.encodeToJsonElement(it)) }
                    value.bancontact?.let { put("bancontact", json.encodeToJsonElement(it)) }
                    value.card?.let { put("card", json.encodeToJsonElement(it)) }
                    value.customerBalance?.let { put("customer_balance", json.encodeToJsonElement(it)) }
                    value.konbini?.let { put("konbini", json.encodeToJsonElement(it)) }
                    value.payto?.let { put("payto", json.encodeToJsonElement(it)) }
                    value.pix?.let { put("pix", json.encodeToJsonElement(it)) }
                    value.sepaDebit?.let { put("sepa_debit", json.encodeToJsonElement(it)) }
                    value.upi?.let { put("upi", json.encodeToJsonElement(it)) }
                    value.usBankAccount?.let { put("us_bank_account", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun subscriptionsResourcePaymentMethodOptions(
    block: SubscriptionsResourcePaymentMethodOptions.Builder.() -> Unit,
): SubscriptionsResourcePaymentMethodOptions = SubscriptionsResourcePaymentMethodOptions.build(block)
