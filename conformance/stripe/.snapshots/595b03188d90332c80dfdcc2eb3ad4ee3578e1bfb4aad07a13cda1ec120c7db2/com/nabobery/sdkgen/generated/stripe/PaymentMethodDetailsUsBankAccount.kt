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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_us_bank_account
 */
@Serializable(with = PaymentMethodDetailsUsBankAccount.Serializer::class)
public class PaymentMethodDetailsUsBankAccount(
    /**
     * Account holder type: individual or company.
     */
    public val accountHolderType: InlinePaymentMethodDetailsUsBankAccountAccountHolderTypeX45d7508e? = null,
    /**
     * Account type: checkings or savings. Defaults to checking if omitted.
     */
    public val accountType: InlinePaymentMethodDetailsUsBankAccountAccountTypeX6c240b2e? = null,
    /**
     * Name of the bank associated with the bank account.
     */
    public val bankName: String? = null,
    /**
     * Estimated date to debit the customer's bank account. A date string in YYYY-MM-DD format.
     */
    public val expectedDebitDate: String? = null,
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
     * ID of the mandate used to make this payment.
     */
    public val mandate: InlinePaymentMethodDetailsUsBankAccountMandateX477127d7? = null,
    /**
     * Reference number to locate ACH payments with customer's bank.
     */
    public val paymentReference: String? = null,
    /**
     * Routing number of the bank account.
     */
    public val routingNumber: String? = null,
) {
    public class Builder {
        /**
         * Account holder type: individual or company.
         */
        public var accountHolderType: InlinePaymentMethodDetailsUsBankAccountAccountHolderTypeX45d7508e? =
            null

        /**
         * Account type: checkings or savings. Defaults to checking if omitted.
         */
        public var accountType: InlinePaymentMethodDetailsUsBankAccountAccountTypeX6c240b2e? = null

        /**
         * Name of the bank associated with the bank account.
         */
        public var bankName: String? = null

        /**
         * Estimated date to debit the customer's bank account. A date string in YYYY-MM-DD format.
         */
        public var expectedDebitDate: String? = null

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
         * ID of the mandate used to make this payment.
         */
        public var mandate: InlinePaymentMethodDetailsUsBankAccountMandateX477127d7? = null

        /**
         * Reference number to locate ACH payments with customer's bank.
         */
        public var paymentReference: String? = null

        /**
         * Routing number of the bank account.
         */
        public var routingNumber: String? = null

        public fun build(): PaymentMethodDetailsUsBankAccount =
            PaymentMethodDetailsUsBankAccount(
                accountHolderType = accountHolderType,
                accountType = accountType,
                bankName = bankName,
                expectedDebitDate = expectedDebitDate,
                fingerprint = fingerprint,
                last4 = last4,
                mandate = mandate,
                paymentReference = paymentReference,
                routingNumber = routingNumber,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentMethodDetailsUsBankAccount = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentMethodDetailsUsBankAccount> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentMethodDetailsUsBankAccount {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsUsBankAccount")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentMethodDetailsUsBankAccount must be a JSON object")
            return PaymentMethodDetailsUsBankAccount(
                accountHolderType =
                    rawObject["account_holder_type"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<InlinePaymentMethodDetailsUsBankAccountAccountHolderTypeX45d7508e?>(
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
                            json.decodeFromJsonElement<InlinePaymentMethodDetailsUsBankAccountAccountTypeX6c240b2e?>(
                                element,
                            )
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
                expectedDebitDate =
                    rawObject["expected_debit_date"]?.let {
                        json.decodeFromJsonElement<String>(
                            it,
                        )
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
                mandate =
                    rawObject["mandate"]?.let {
                        json.decodeFromJsonElement<InlinePaymentMethodDetailsUsBankAccountMandateX477127d7>(it)
                    },
                paymentReference =
                    rawObject["payment_reference"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
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
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentMethodDetailsUsBankAccount,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsUsBankAccount")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.accountHolderType?.let { put("account_holder_type", json.encodeToJsonElement(it)) }
                    value.accountType?.let { put("account_type", json.encodeToJsonElement(it)) }
                    value.bankName?.let { put("bank_name", it) }
                    value.expectedDebitDate?.let { put("expected_debit_date", it) }
                    value.fingerprint?.let { put("fingerprint", it) }
                    value.last4?.let { put("last4", it) }
                    value.mandate?.let { put("mandate", json.encodeToJsonElement(it)) }
                    value.paymentReference?.let { put("payment_reference", it) }
                    value.routingNumber?.let { put("routing_number", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentMethodDetailsUsBankAccount(
    block: PaymentMethodDetailsUsBankAccount.Builder.() -> Unit,
): PaymentMethodDetailsUsBankAccount = PaymentMethodDetailsUsBankAccount.build(block)
