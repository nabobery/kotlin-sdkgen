package com.nabobery.sdkgen.generated.stripe

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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormX1b3ed724.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormX1b3ed724(
    /**
     * Amount intended to be collected by this PaymentIntent. A positive integer representing how much to charge in the
     * [smallest currency unit](https://docs.stripe.com/currencies#zero-decimal) (e.g., 100 cents to charge $1.00 or 100
     * to charge ¥100, a zero-decimal currency). The minimum amount is $0.50 US or [equivalent in charge
     * currency](https://docs.stripe.com/currencies#minimum-and-maximum-charge-amounts). The amount value supports up to
     * eight digits (e.g., a value of 99999999 for a USD charge of $999,999.99).
     */
    public val amount: Int? = null,
    /**
     * Provides industry-specific information about the amount.
     */
    public val amountDetails: InlineV1PaymentIntentsPostRequestFormAmountDetailsX93d20156? = null,
    /**
     * The amount of the application fee (if any) that will be requested to be applied to the payment and transferred to
     * the application owner's Stripe account. The amount of the application fee collected will be capped at the total
     * amount captured. For more information, see the PaymentIntents [use case for connected
     * accounts](https://docs.stripe.com/payments/connected-accounts).
     */
    public val applicationFeeAmount: InlineV1PaymentIntentsPostRequestFormApplicationFeeAmountX29b5acea? = null,
    /**
     * Controls when the funds will be captured from the customer's account.
     */
    public val captureMethod: InlineV1PaymentIntentsPostRequestFormCaptureMethodXcc0e3e94? = null,
    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
     * [supported currency](https://stripe.com/docs/currencies).
     */
    public val currency: String? = null,
    /**
     * ID of the Customer this PaymentIntent belongs to, if one exists.
     *
     * Payment methods attached to other Customers cannot be used with this PaymentIntent.
     *
     * If [setup_future_usage](https://api.stripe.com#payment_intent_object-setup_future_usage) is set and this
     * PaymentIntent's payment method is not `card_present`, then the payment method attaches to the Customer after the
     * PaymentIntent has been confirmed and any required actions from the user are complete. If the payment method is
     * `card_present` and isn't a digital wallet, then a
     * [generated_card](https://docs.stripe.com/api/charges/object#charge_object-payment_method_details-card_present-gener
     * ated_card) payment method representing the card is created and attached to the Customer instead.
     */
    public val customer: String? = null,
    /**
     * ID of the Account representing the customer that this PaymentIntent belongs to, if one exists.
     *
     * Payment methods attached to other Accounts cannot be used with this PaymentIntent.
     *
     * If [setup_future_usage](https://api.stripe.com#payment_intent_object-setup_future_usage) is set and this
     * PaymentIntent's payment method is not `card_present`, then the payment method attaches to the Account after the
     * PaymentIntent has been confirmed and any required actions from the user are complete. If the payment method is
     * `card_present` and isn't a digital wallet, then a
     * [generated_card](https://docs.stripe.com/api/charges/object#charge_object-payment_method_details-card_present-gener
     * ated_card) payment method representing the card is created and attached to the Account instead.
     */
    public val customerAccount: String? = null,
    /**
     * An arbitrary string attached to the object. Often useful for displaying to users.
     */
    public val description: String? = null,
    /**
     * The list of payment method types to exclude from use with this payment.
     */
    public val excludedPaymentMethodTypes:
        InlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesX74fbaaa9? = null,
    /**
     * Specifies which fields in the response should be expanded.
     */
    public val expand: List<String>? = null,
    /**
     * Automations to be run during the PaymentIntent lifecycle
     */
    public val hooks: InlineV1PaymentIntentsPostRequestFormHooksX33240745? = null,
    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
     * for storing additional information about the object in a structured format. Individual keys can be unset by posting
     * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public val metadata: InlineV1PaymentIntentsPostRequestFormMetadataXa66ba526? = null,
    /**
     * Provides industry-specific information about the charge.
     */
    public val paymentDetails: InlineV1PaymentIntentsPostRequestFormPaymentDetailsX5d054eea? = null,
    /**
     * ID of the payment method (a PaymentMethod, Card, or [compatible
     * Source](https://docs.stripe.com/payments/payment-methods/transitioning#compatibility) object) to attach to this
     * PaymentIntent. To unset this field to null, pass in an empty string.
     */
    public val paymentMethod: String? = null,
    /**
     * The ID of the [payment method configuration](https://docs.stripe.com/api/payment_method_configurations) to use with
     * this PaymentIntent.
     */
    public val paymentMethodConfiguration: String? = null,
    /**
     * If provided, this hash will be used to create a PaymentMethod. The new PaymentMethod will appear
     * in the [payment_method](https://docs.stripe.com/api/payment_intents/object#payment_intent_object-payment_method)
     * property on the PaymentIntent.
     */
    public val paymentMethodData: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataX1234bded? = null,
    /**
     * Payment-method-specific configuration for this PaymentIntent.
     */
    public val paymentMethodOptions: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsX1e08fc5e? = null,
    /**
     * The list of payment method types (for example, card) that this PaymentIntent can use. Use
     * `automatic_payment_methods` to manage payment methods from the [Stripe
     * Dashboard](https://dashboard.stripe.com/settings/payment_methods). A list of valid payment method types can be
     * found [here](https://docs.stripe.com/api/payment_methods/object#payment_method_object-type).
     */
    public val paymentMethodTypes: List<String>? = null,
    /**
     * Email address that the receipt for the resulting payment will be sent to. If `receipt_email` is specified for a
     * payment in live mode, a receipt will be sent regardless of your [email
     * settings](https://dashboard.stripe.com/account/emails).
     */
    public val receiptEmail: InlineV1PaymentIntentsPostRequestFormReceiptEmailXc593d772? = null,
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
     *
     * If you've already set `setup_future_usage` and you're performing a request using a publishable key, you can only
     * update the value from `on_session` to `off_session`.
     */
    public val setupFutureUsage: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXc1a060ec? = null,
    /**
     * Shipping information for this PaymentIntent.
     */
    public val shipping: InlineV1PaymentIntentsPostRequestFormShippingX781149ab? = null,
    /**
     * Text that appears on the customer's statement as the statement descriptor for a non-card charge. This value
     * overrides the account's default statement descriptor. For information about requirements, including the
     * 22-character limit, see [the Statement Descriptor
     * docs](https://docs.stripe.com/get-started/account/statement-descriptors).
     *
     * Setting this value for a card charge returns an error. For card charges, set the
     * [statement_descriptor_suffix](https://docs.stripe.com/get-started/account/statement-descriptors#dynamic) instead.
     */
    public val statementDescriptor: String? = null,
    /**
     * Provides information about a card charge. Concatenated to the account's [statement descriptor
     * prefix](https://docs.stripe.com/get-started/account/statement-descriptors#static) to form the complete statement
     * descriptor that appears on the customer's statement.
     */
    public val statementDescriptorSuffix: String? = null,
    /**
     * Use this parameter to automatically create a Transfer when the payment succeeds. Learn more about the [use case for
     * connected accounts](https://docs.stripe.com/payments/connected-accounts).
     */
    public val transferData: InlineV1PaymentIntentsPostRequestFormTransferDataX43a27ce8? = null,
    /**
     * A string that identifies the resulting payment as part of a group. You can only provide `transfer_group` if it
     * hasn't been set. Learn more about the [use case for connected
     * accounts](https://docs.stripe.com/payments/connected-accounts).
     */
    public val transferGroup: String? = null,
) {
    public class Builder {
        /**
         * Amount intended to be collected by this PaymentIntent. A positive integer representing how much to charge in the
         * [smallest currency unit](https://docs.stripe.com/currencies#zero-decimal) (e.g., 100 cents to charge $1.00 or 100
         * to charge ¥100, a zero-decimal currency). The minimum amount is $0.50 US or [equivalent in charge
         * currency](https://docs.stripe.com/currencies#minimum-and-maximum-charge-amounts). The amount value supports up to
         * eight digits (e.g., a value of 99999999 for a USD charge of $999,999.99).
         */
        public var amount: Int? = null

        /**
         * Provides industry-specific information about the amount.
         */
        public var amountDetails: InlineV1PaymentIntentsPostRequestFormAmountDetailsX93d20156? = null

        /**
         * The amount of the application fee (if any) that will be requested to be applied to the payment and transferred to
         * the application owner's Stripe account. The amount of the application fee collected will be capped at the total
         * amount captured. For more information, see the PaymentIntents [use case for connected
         * accounts](https://docs.stripe.com/payments/connected-accounts).
         */
        public var applicationFeeAmount:
            InlineV1PaymentIntentsPostRequestFormApplicationFeeAmountX29b5acea? = null

        /**
         * Controls when the funds will be captured from the customer's account.
         */
        public var captureMethod: InlineV1PaymentIntentsPostRequestFormCaptureMethodXcc0e3e94? = null

        /**
         * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
         * [supported currency](https://stripe.com/docs/currencies).
         */
        public var currency: String? = null

        /**
         * ID of the Customer this PaymentIntent belongs to, if one exists.
         *
         * Payment methods attached to other Customers cannot be used with this PaymentIntent.
         *
         * If [setup_future_usage](https://api.stripe.com#payment_intent_object-setup_future_usage) is set and this
         * PaymentIntent's payment method is not `card_present`, then the payment method attaches to the Customer after the
         * PaymentIntent has been confirmed and any required actions from the user are complete. If the payment method is
         * `card_present` and isn't a digital wallet, then a
         * [generated_card](https://docs.stripe.com/api/charges/object#charge_object-payment_method_details-card_present-gen
         * erated_card) payment method representing the card is created and attached to the Customer instead.
         */
        public var customer: String? = null

        /**
         * ID of the Account representing the customer that this PaymentIntent belongs to, if one exists.
         *
         * Payment methods attached to other Accounts cannot be used with this PaymentIntent.
         *
         * If [setup_future_usage](https://api.stripe.com#payment_intent_object-setup_future_usage) is set and this
         * PaymentIntent's payment method is not `card_present`, then the payment method attaches to the Account after the
         * PaymentIntent has been confirmed and any required actions from the user are complete. If the payment method is
         * `card_present` and isn't a digital wallet, then a
         * [generated_card](https://docs.stripe.com/api/charges/object#charge_object-payment_method_details-card_present-gen
         * erated_card) payment method representing the card is created and attached to the Account instead.
         */
        public var customerAccount: String? = null

        /**
         * An arbitrary string attached to the object. Often useful for displaying to users.
         */
        public var description: String? = null

        /**
         * The list of payment method types to exclude from use with this payment.
         */
        public var excludedPaymentMethodTypes:
            InlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesX74fbaaa9? = null

        /**
         * Specifies which fields in the response should be expanded.
         */
        public var expand: List<String>? = null

        /**
         * Automations to be run during the PaymentIntent lifecycle
         */
        public var hooks: InlineV1PaymentIntentsPostRequestFormHooksX33240745? = null

        /**
         * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
         * useful for storing additional information about the object in a structured format. Individual keys can be unset
         * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
         */
        public var metadata: InlineV1PaymentIntentsPostRequestFormMetadataXa66ba526? = null

        /**
         * Provides industry-specific information about the charge.
         */
        public var paymentDetails: InlineV1PaymentIntentsPostRequestFormPaymentDetailsX5d054eea? = null

        /**
         * ID of the payment method (a PaymentMethod, Card, or [compatible
         * Source](https://docs.stripe.com/payments/payment-methods/transitioning#compatibility) object) to attach to this
         * PaymentIntent. To unset this field to null, pass in an empty string.
         */
        public var paymentMethod: String? = null

        /**
         * The ID of the [payment method configuration](https://docs.stripe.com/api/payment_method_configurations) to use
         * with this PaymentIntent.
         */
        public var paymentMethodConfiguration: String? = null

        /**
         * If provided, this hash will be used to create a PaymentMethod. The new PaymentMethod will appear
         * in the [payment_method](https://docs.stripe.com/api/payment_intents/object#payment_intent_object-payment_method)
         * property on the PaymentIntent.
         */
        public var paymentMethodData: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataX1234bded? =
            null

        /**
         * Payment-method-specific configuration for this PaymentIntent.
         */
        public var paymentMethodOptions:
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsX1e08fc5e? = null

        /**
         * The list of payment method types (for example, card) that this PaymentIntent can use. Use
         * `automatic_payment_methods` to manage payment methods from the [Stripe
         * Dashboard](https://dashboard.stripe.com/settings/payment_methods). A list of valid payment method types can be
         * found [here](https://docs.stripe.com/api/payment_methods/object#payment_method_object-type).
         */
        public var paymentMethodTypes: List<String>? = null

        /**
         * Email address that the receipt for the resulting payment will be sent to. If `receipt_email` is specified for a
         * payment in live mode, a receipt will be sent regardless of your [email
         * settings](https://dashboard.stripe.com/account/emails).
         */
        public var receiptEmail: InlineV1PaymentIntentsPostRequestFormReceiptEmailXc593d772? = null

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
         *
         * If you've already set `setup_future_usage` and you're performing a request using a publishable key, you can only
         * update the value from `on_session` to `off_session`.
         */
        public var setupFutureUsage: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXc1a060ec? =
            null

        /**
         * Shipping information for this PaymentIntent.
         */
        public var shipping: InlineV1PaymentIntentsPostRequestFormShippingX781149ab? = null

        /**
         * Text that appears on the customer's statement as the statement descriptor for a non-card charge. This value
         * overrides the account's default statement descriptor. For information about requirements, including the
         * 22-character limit, see [the Statement Descriptor
         * docs](https://docs.stripe.com/get-started/account/statement-descriptors).
         *
         * Setting this value for a card charge returns an error. For card charges, set the
         * [statement_descriptor_suffix](https://docs.stripe.com/get-started/account/statement-descriptors#dynamic) instead.
         */
        public var statementDescriptor: String? = null

        /**
         * Provides information about a card charge. Concatenated to the account's [statement descriptor
         * prefix](https://docs.stripe.com/get-started/account/statement-descriptors#static) to form the complete statement
         * descriptor that appears on the customer's statement.
         */
        public var statementDescriptorSuffix: String? = null

        /**
         * Use this parameter to automatically create a Transfer when the payment succeeds. Learn more about the [use case
         * for connected accounts](https://docs.stripe.com/payments/connected-accounts).
         */
        public var transferData: InlineV1PaymentIntentsPostRequestFormTransferDataX43a27ce8? = null

        /**
         * A string that identifies the resulting payment as part of a group. You can only provide `transfer_group` if it
         * hasn't been set. Learn more about the [use case for connected
         * accounts](https://docs.stripe.com/payments/connected-accounts).
         */
        public var transferGroup: String? = null

        public fun build(): InlineV1PaymentIntentsPostRequestFormX1b3ed724 =
            InlineV1PaymentIntentsPostRequestFormX1b3ed724(
                amount = amount,
                amountDetails = amountDetails,
                applicationFeeAmount = applicationFeeAmount,
                captureMethod = captureMethod,
                currency = currency,
                customer = customer,
                customerAccount = customerAccount,
                description = description,
                excludedPaymentMethodTypes = excludedPaymentMethodTypes,
                expand = expand,
                hooks = hooks,
                metadata = metadata,
                paymentDetails = paymentDetails,
                paymentMethod = paymentMethod,
                paymentMethodConfiguration = paymentMethodConfiguration,
                paymentMethodData = paymentMethodData,
                paymentMethodOptions = paymentMethodOptions,
                paymentMethodTypes = paymentMethodTypes,
                receiptEmail = receiptEmail,
                setupFutureUsage = setupFutureUsage,
                shipping = shipping,
                statementDescriptor = statementDescriptor,
                statementDescriptorSuffix = statementDescriptorSuffix,
                transferData = transferData,
                transferGroup = transferGroup,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormX1b3ed724 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormX1b3ed724> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormX1b3ed724 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormX1b3ed724")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsPostRequestFormX1b3ed724 must be a JSON object",
                    )
            return InlineV1PaymentIntentsPostRequestFormX1b3ed724(
                amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
                amountDetails =
                    rawObject["amount_details"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAmountDetailsX93d20156>(it)
                    },
                applicationFeeAmount =
                    rawObject["application_fee_amount"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormApplicationFeeAmountX29b5acea>(
                            it,
                        )
                    },
                captureMethod =
                    rawObject["capture_method"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormCaptureMethodXcc0e3e94>(it)
                    },
                currency = rawObject["currency"]?.let { json.decodeFromJsonElement<String>(it) },
                customer = rawObject["customer"]?.let { json.decodeFromJsonElement<String>(it) },
                customerAccount = rawObject["customer_account"]?.let { json.decodeFromJsonElement<String>(it) },
                description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
                excludedPaymentMethodTypes =
                    rawObject["excluded_payment_method_types"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesX74fbaaa9>(
                                it,
                            )
                    },
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
                hooks =
                    rawObject["hooks"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormHooksX33240745>(
                                it,
                            )
                    },
                metadata =
                    rawObject["metadata"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormMetadataXa66ba526>(it)
                    },
                paymentDetails =
                    rawObject["payment_details"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentDetailsX5d054eea>(it)
                    },
                paymentMethod = rawObject["payment_method"]?.let { json.decodeFromJsonElement<String>(it) },
                paymentMethodConfiguration =
                    rawObject["payment_method_configuration"]?.let {
                        json
                            .decodeFromJsonElement<String>(
                                it,
                            )
                    },
                paymentMethodData =
                    rawObject["payment_method_data"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataX1234bded>(it)
                    },
                paymentMethodOptions =
                    rawObject["payment_method_options"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsX1e08fc5e>(
                            it,
                        )
                    },
                paymentMethodTypes =
                    rawObject["payment_method_types"]?.let {
                        json
                            .decodeFromJsonElement<List<String>>(
                                it,
                            )
                    },
                receiptEmail =
                    rawObject["receipt_email"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormReceiptEmailXc593d772>(it)
                    },
                setupFutureUsage =
                    rawObject["setup_future_usage"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXc1a060ec>(it)
                    },
                shipping =
                    rawObject["shipping"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormShippingX781149ab>(it)
                    },
                statementDescriptor =
                    rawObject["statement_descriptor"]?.let {
                        json
                            .decodeFromJsonElement<String>(
                                it,
                            )
                    },
                statementDescriptorSuffix =
                    rawObject["statement_descriptor_suffix"]?.let {
                        json.decodeFromJsonElement<String>(
                            it,
                        )
                    },
                transferData =
                    rawObject["transfer_data"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormTransferDataX43a27ce8>(it)
                    },
                transferGroup = rawObject["transfer_group"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormX1b3ed724,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormX1b3ed724")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
                    value.amountDetails?.let { put("amount_details", json.encodeToJsonElement(it)) }
                    value.applicationFeeAmount?.let { put("application_fee_amount", json.encodeToJsonElement(it)) }
                    value.captureMethod?.let { put("capture_method", json.encodeToJsonElement(it)) }
                    value.currency?.let { put("currency", it) }
                    value.customer?.let { put("customer", it) }
                    value.customerAccount?.let { put("customer_account", it) }
                    value.description?.let { put("description", it) }
                    value.excludedPaymentMethodTypes?.let {
                        put(
                            "excluded_payment_method_types",
                            json.encodeToJsonElement(it),
                        )
                    }
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                    value.hooks?.let { put("hooks", json.encodeToJsonElement(it)) }
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                    value.paymentDetails?.let { put("payment_details", json.encodeToJsonElement(it)) }
                    value.paymentMethod?.let { put("payment_method", it) }
                    value.paymentMethodConfiguration?.let { put("payment_method_configuration", it) }
                    value.paymentMethodData?.let { put("payment_method_data", json.encodeToJsonElement(it)) }
                    value.paymentMethodOptions?.let { put("payment_method_options", json.encodeToJsonElement(it)) }
                    value.paymentMethodTypes?.let { put("payment_method_types", json.encodeToJsonElement(it)) }
                    value.receiptEmail?.let { put("receipt_email", json.encodeToJsonElement(it)) }
                    value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
                    value.shipping?.let { put("shipping", json.encodeToJsonElement(it)) }
                    value.statementDescriptor?.let { put("statement_descriptor", it) }
                    value.statementDescriptorSuffix?.let { put("statement_descriptor_suffix", it) }
                    value.transferData?.let { put("transfer_data", json.encodeToJsonElement(it)) }
                    value.transferGroup?.let { put("transfer_group", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentIntentsPostRequestFormX1b3ed724(
    block: InlineV1PaymentIntentsPostRequestFormX1b3ed724.Builder.() -> Unit,
): InlineV1PaymentIntentsPostRequestFormX1b3ed724 = InlineV1PaymentIntentsPostRequestFormX1b3ed724.build(block)
