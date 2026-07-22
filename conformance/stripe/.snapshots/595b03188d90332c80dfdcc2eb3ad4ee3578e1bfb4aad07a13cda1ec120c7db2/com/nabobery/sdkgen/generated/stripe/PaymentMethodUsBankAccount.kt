package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
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
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_us_bank_account
 */
@Serializable(with = PaymentMethodUsBankAccount.Serializer::class)
public class PaymentMethodUsBankAccount(
    /**
     * Account holder type: individual or company.
     */
    public val accountHolderType: InlinePaymentMethodUsBankAccountAccountHolderTypeX91c2d668? = null,
    /**
     * Account type: checkings or savings. Defaults to checking if omitted.
     */
    public val accountType: InlinePaymentMethodUsBankAccountAccountTypeX72df841c? = null,
    /**
     * The name of the bank.
     */
    public val bankName: String? = null,
    /**
     * The ID of the Financial Connections Account used to create the payment method.
     */
    public val financialConnectionsAccount: String? = null,
    /**
     * Uniquely identifies this particular bank account. You can use this attribute to check whether two bank accounts are
     * the same.
     */
    public val fingerprint: String? = null,
    /**
     * Last four digits of the bank account number.
     */
    public val last4: String? = null,
    /**
     * Contains information about US bank account networks that can be used.
     */
    public val networks: InlinePaymentMethodUsBankAccountNetworksX15dfa0ca? = null,
    /**
     * Routing number of the bank account.
     */
    public val routingNumber: String? = null,
    /**
     * Contains information about the future reusability of this PaymentMethod.
     */
    public val statusDetails: InlinePaymentMethodUsBankAccountStatusDetailsX20e39ea0? = null,
) {
    public class Builder {
        /**
         * Account holder type: individual or company.
         */
        public var accountHolderType: InlinePaymentMethodUsBankAccountAccountHolderTypeX91c2d668? = null

        /**
         * Account type: checkings or savings. Defaults to checking if omitted.
         */
        public var accountType: InlinePaymentMethodUsBankAccountAccountTypeX72df841c? = null

        /**
         * The name of the bank.
         */
        public var bankName: String? = null

        /**
         * The ID of the Financial Connections Account used to create the payment method.
         */
        public var financialConnectionsAccount: String? = null

        /**
         * Uniquely identifies this particular bank account. You can use this attribute to check whether two bank accounts
         * are the same.
         */
        public var fingerprint: String? = null

        /**
         * Last four digits of the bank account number.
         */
        public var last4: String? = null

        /**
         * Contains information about US bank account networks that can be used.
         */
        public var networks: InlinePaymentMethodUsBankAccountNetworksX15dfa0ca? = null

        /**
         * Routing number of the bank account.
         */
        public var routingNumber: String? = null

        /**
         * Contains information about the future reusability of this PaymentMethod.
         */
        public var statusDetails: InlinePaymentMethodUsBankAccountStatusDetailsX20e39ea0? = null

        public fun build(): PaymentMethodUsBankAccount =
            PaymentMethodUsBankAccount(
                accountHolderType = accountHolderType,
                accountType = accountType,
                bankName = bankName,
                financialConnectionsAccount = financialConnectionsAccount,
                fingerprint = fingerprint,
                last4 = last4,
                networks = networks,
                routingNumber = routingNumber,
                statusDetails = statusDetails,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentMethodUsBankAccount = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentMethodUsBankAccount> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentMethodUsBankAccount {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodUsBankAccount")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentMethodUsBankAccount must be a JSON object")
            return PaymentMethodUsBankAccount(
                accountHolderType =
                    rawObject["account_holder_type"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlinePaymentMethodUsBankAccountAccountHolderTypeX91c2d668?>(
                                element,
                            )
                        }
                    },
                accountType =
                    rawObject["account_type"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlinePaymentMethodUsBankAccountAccountTypeX72df841c?>(element)
                        }
                    },
                bankName =
                    rawObject["bank_name"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                financialConnectionsAccount =
                    rawObject["financial_connections_account"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                fingerprint =
                    rawObject["fingerprint"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                last4 =
                    rawObject["last4"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                networks =
                    rawObject["networks"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlinePaymentMethodUsBankAccountNetworksX15dfa0ca?>(element)
                        }
                    },
                routingNumber =
                    rawObject["routing_number"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                statusDetails =
                    rawObject["status_details"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlinePaymentMethodUsBankAccountStatusDetailsX20e39ea0?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentMethodUsBankAccount,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodUsBankAccount")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.accountHolderType?.let { put("account_holder_type", json.encodeToJsonElement(it)) }
                    value.accountType?.let { put("account_type", json.encodeToJsonElement(it)) }
                    value.bankName?.let { put("bank_name", it) }
                    value.financialConnectionsAccount?.let { put("financial_connections_account", it) }
                    value.fingerprint?.let { put("fingerprint", it) }
                    value.last4?.let { put("last4", it) }
                    value.networks?.let { put("networks", json.encodeToJsonElement(it)) }
                    value.routingNumber?.let { put("routing_number", it) }
                    value.statusDetails?.let { put("status_details", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentMethodUsBankAccount(
    block: PaymentMethodUsBankAccount.Builder.() -> Unit,
): PaymentMethodUsBankAccount = PaymentMethodUsBankAccount.build(block)
