package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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
import kotlin.String
import kotlin.Unit

@Serializable
public data class PaymentIntentPaymentMethodOptionsUsBankAccountView(
    @SerialName("financial_connections")
    public val financialConnections: LinkedAccountOptionsCommon? = null,
    @SerialName("mandate_options")
    public val mandateOptions: PaymentMethodOptionsUsBankAccountMandateOptions? = null,
    @SerialName("setup_future_usage")
    public val setupFutureUsage: InlinePaymentIntentPaymentMethodOptionsUsBankAccountSetupFutureUsageX0a863d58? = null,
    @SerialName("target_date")
    public val targetDate: String? = null,
    @SerialName("transaction_purpose")
    public val transactionPurpose:
        InlinePaymentIntentPaymentMethodOptionsUsBankAccountTransactionPurposeX0ccb14eb? = null,
    @SerialName("verification_method")
    public val verificationMethod:
        InlinePaymentIntentPaymentMethodOptionsUsBankAccountVerificationMethodX3195fcd7? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options_us_bank_account
 */
@Serializable(with = PaymentIntentPaymentMethodOptionsUsBankAccount.Serializer::class)
public class PaymentIntentPaymentMethodOptionsUsBankAccount(
    public val financialConnections: LinkedAccountOptionsCommon? = null,
    public val mandateOptions: PaymentMethodOptionsUsBankAccountMandateOptions? = null,
    /**
     * Indicates that you intend to make future payments with this PaymentIntent's payment method.
     *
     * If you provide a Customer with the PaymentIntent, you can use this parameter to [attach the payment
     * method](/payments/save-during-payment) to the Customer after the PaymentIntent is confirmed and the customer
     * completes any required actions. If you don't provide a Customer, you can still
     * [attach](/api/payment_methods/attach) the payment method to a Customer after the transaction completes.
     *
     * If the payment method is `card_present` and isn't a digital wallet, Stripe creates and attaches a
     * [generated_card](/api/charges/object#charge_object-payment_method_details-card_present-generated_card) payment
     * method representing the card to the Customer instead.
     *
     * When processing card payments, Stripe uses `setup_future_usage` to help you comply with regional legislation and
     * network rules, such as [SCA](/strong-customer-authentication).
     */
    public val setupFutureUsage: InlinePaymentIntentPaymentMethodOptionsUsBankAccountSetupFutureUsageX0a863d58? = null,
    /**
     * Controls when Stripe will attempt to debit the funds from the customer's account. The date must be a string in
     * YYYY-MM-DD format. The date must be in the future and between 3 and 15 calendar days from now.
     */
    public val targetDate: String? = null,
    /**
     * The purpose of the transaction.
     */
    public val transactionPurpose:
        InlinePaymentIntentPaymentMethodOptionsUsBankAccountTransactionPurposeX0ccb14eb? = null,
    /**
     * Bank account verification method. The default value is `automatic`.
     */
    public val verificationMethod:
        InlinePaymentIntentPaymentMethodOptionsUsBankAccountVerificationMethodX3195fcd7? = null,
) {
    public class Builder {
        public var financialConnections: LinkedAccountOptionsCommon? = null

        public var mandateOptions: PaymentMethodOptionsUsBankAccountMandateOptions? = null

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment method.
         *
         * If you provide a Customer with the PaymentIntent, you can use this parameter to [attach the payment
         * method](/payments/save-during-payment) to the Customer after the PaymentIntent is confirmed and the customer
         * completes any required actions. If you don't provide a Customer, you can still
         * [attach](/api/payment_methods/attach) the payment method to a Customer after the transaction completes.
         *
         * If the payment method is `card_present` and isn't a digital wallet, Stripe creates and attaches a
         * [generated_card](/api/charges/object#charge_object-payment_method_details-card_present-generated_card) payment
         * method representing the card to the Customer instead.
         *
         * When processing card payments, Stripe uses `setup_future_usage` to help you comply with regional legislation and
         * network rules, such as [SCA](/strong-customer-authentication).
         */
        public var setupFutureUsage:
            InlinePaymentIntentPaymentMethodOptionsUsBankAccountSetupFutureUsageX0a863d58? = null

        /**
         * Controls when Stripe will attempt to debit the funds from the customer's account. The date must be a string in
         * YYYY-MM-DD format. The date must be in the future and between 3 and 15 calendar days from now.
         */
        public var targetDate: String? = null

        /**
         * The purpose of the transaction.
         */
        public var transactionPurpose:
            InlinePaymentIntentPaymentMethodOptionsUsBankAccountTransactionPurposeX0ccb14eb? = null

        /**
         * Bank account verification method. The default value is `automatic`.
         */
        public var verificationMethod:
            InlinePaymentIntentPaymentMethodOptionsUsBankAccountVerificationMethodX3195fcd7? = null

        public fun build(): PaymentIntentPaymentMethodOptionsUsBankAccount =
            PaymentIntentPaymentMethodOptionsUsBankAccount(
                financialConnections = financialConnections,
                mandateOptions = mandateOptions,
                setupFutureUsage = setupFutureUsage,
                targetDate = targetDate,
                transactionPurpose = transactionPurpose,
                verificationMethod = verificationMethod,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentIntentPaymentMethodOptionsUsBankAccount =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentIntentPaymentMethodOptionsUsBankAccount> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentIntentPaymentMethodOptionsUsBankAccount {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentIntentPaymentMethodOptionsUsBankAccount")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "PaymentIntentPaymentMethodOptionsUsBankAccount must be a JSON object",
                    )
            return PaymentIntentPaymentMethodOptionsUsBankAccount(
                financialConnections =
                    rawObject["financial_connections"]?.let {
                        json.decodeFromJsonElement<LinkedAccountOptionsCommon>(it)
                    },
                mandateOptions =
                    rawObject["mandate_options"]?.let {
                        json.decodeFromJsonElement<PaymentMethodOptionsUsBankAccountMandateOptions>(it)
                    },
                setupFutureUsage =
                    rawObject["setup_future_usage"]?.let {
                        json
                            .decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsUsBankAccountSetupFutureUsageX0a863d58>(
                                it,
                            )
                    },
                targetDate = rawObject["target_date"]?.let { json.decodeFromJsonElement<String>(it) },
                transactionPurpose =
                    rawObject["transaction_purpose"]?.let {
                        json
                            .decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsUsBankAccountTransactionPurposeX0ccb14eb>(
                                it,
                            )
                    },
                verificationMethod =
                    rawObject["verification_method"]?.let {
                        json
                            .decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsUsBankAccountVerificationMethodX3195fcd7>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentIntentPaymentMethodOptionsUsBankAccount,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentIntentPaymentMethodOptionsUsBankAccount")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.financialConnections?.let { put("financial_connections", json.encodeToJsonElement(it)) }
                    value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
                    value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
                    value.targetDate?.let { put("target_date", it) }
                    value.transactionPurpose?.let { put("transaction_purpose", json.encodeToJsonElement(it)) }
                    value.verificationMethod?.let { put("verification_method", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentIntentPaymentMethodOptionsUsBankAccount(
    block: PaymentIntentPaymentMethodOptionsUsBankAccount.Builder.() -> Unit,
): PaymentIntentPaymentMethodOptionsUsBankAccount = PaymentIntentPaymentMethodOptionsUsBankAccount.build(block)
