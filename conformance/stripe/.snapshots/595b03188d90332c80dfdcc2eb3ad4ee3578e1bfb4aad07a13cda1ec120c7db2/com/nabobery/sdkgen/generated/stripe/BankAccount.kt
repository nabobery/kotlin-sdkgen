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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

@Serializable
public data class BankAccountView(
    public val account: InlineBankAccountAccountX2cf2b751? = null,
    @SerialName("account_holder_name")
    public val accountHolderName: String? = null,
    @SerialName("account_holder_type")
    public val accountHolderType: String? = null,
    @SerialName("account_type")
    public val accountType: String? = null,
    @SerialName("available_payout_methods")
    public val availablePayoutMethods: List<InlineBankAccountAvailablePayoutMethodsItemXe26a523b>? = null,
    @SerialName("bank_name")
    public val bankName: String? = null,
    public val country: String,
    public val currency: String,
    public val customer: InlineBankAccountCustomerX196a61c7? = null,
    @SerialName("default_for_currency")
    public val defaultForCurrency: Boolean? = null,
    public val fingerprint: String? = null,
    @SerialName("future_requirements")
    public val futureRequirements: InlineBankAccountFutureRequirementsX2d2814a2? = null,
    public val id: String,
    public val last4: String,
    public val metadata: Map<String, String>? = null,
    @SerialName("object")
    public val objectValue: InlineBankAccountObjectValueX96d77174,
    public val requirements: InlineBankAccountRequirementsXf84df6b2? = null,
    @SerialName("routing_number")
    public val routingNumber: String? = null,
    public val status: String,
)

/**
 * These bank accounts are payment methods on `Customer` objects.
 *
 * On the other hand [External Accounts](/api#external_accounts) are transfer
 * destinations on `Account` objects for connected accounts.
 * They can be bank accounts or debit cards as well, and are documented in the links above.
 *
 * Related guide: [Bank debits and transfers](/payments/bank-debits-transfers)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/bank_account
 */
@Serializable(with = BankAccount.Serializer::class)
public class BankAccount(
    /**
     * Two-letter ISO code representing the country the bank account is located in.
     */
    public val country: String,
    /**
     * Three-letter [ISO code for the currency](https://stripe.com/docs/payouts) paid out to the bank account.
     */
    public val currency: String,
    /**
     * Unique identifier for the object.
     */
    public val id: String,
    /**
     * The last four digits of the bank account number.
     */
    public val last4: String,
    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    public val objectValue: InlineBankAccountObjectValueX96d77174,
    /**
     * For bank accounts, possible values are `new`, `validated`, `verified`, `verification_failed`,
     * `tokenized_account_number_deactivated` or `errored`. A bank account that hasn't had any activity or validation
     * performed is `new`. If Stripe can determine that the bank account exists, its status will be `validated`. Note that
     * there often isn’t enough information to know (e.g., for smaller credit unions), and the validation is not always
     * run. If customer bank account verification has succeeded, the bank account status will be `verified`. If the
     * verification failed for any reason, such as microdeposit failure, the status will be `verification_failed`. If the
     * status is `tokenized_account_number_deactivated`, the account utilizes a tokenized account number which has been
     * deactivated due to expiration or revocation. This account will need to be reverified to continue using it for money
     * movement. If a payout sent to this bank account fails, we'll set the status to `errored` and will not continue to
     * send [scheduled payouts](https://stripe.com/docs/payouts#payout-schedule) until the bank details are updated.
     *
     * For external accounts, possible values are `new`, `errored`, `verification_failed`, and
     * `tokenized_account_number_deactivated`. If a payout fails, the status is set to `errored` and scheduled payouts are
     * stopped until account details are updated. In the US and India, if we can't [verify the owner of the bank
     * account](https://support.stripe.com/questions/bank-account-ownership-verification), we'll set the status to
     * `verification_failed`. Other validations aren't run against external accounts because they're only used for
     * payouts. This means the other statuses don't apply.
     */
    public val status: String,
    /**
     * The account this bank account belongs to. Only applicable on Accounts (not customers or recipients) This property
     * is only available when returned as an [External Account](/api/external_account_bank_accounts/object) where
     * [controller.is_controller](/api/accounts/object#account_object-controller-is_controller) is `true`.
     */
    public val account: InlineBankAccountAccountX2cf2b751? = null,
    /**
     * The name of the person or business that owns the bank account.
     */
    public val accountHolderName: String? = null,
    /**
     * The type of entity that holds the account. This can be either `individual` or `company`.
     */
    public val accountHolderType: String? = null,
    /**
     * The bank account type. This can only be `checking` or `savings` in most countries. In Japan, this can only be
     * `futsu` or `toza`.
     */
    public val accountType: String? = null,
    /**
     * A set of available payout methods for this bank account. Only values from this set should be passed as the `method`
     * when creating a payout.
     */
    public val availablePayoutMethods: List<InlineBankAccountAvailablePayoutMethodsItemXe26a523b>? = null,
    /**
     * Name of the bank associated with the routing number (e.g., `WELLS FARGO`).
     */
    public val bankName: String? = null,
    /**
     * The ID of the customer that the bank account is associated with.
     */
    public val customer: InlineBankAccountCustomerX196a61c7? = null,
    /**
     * Whether this bank account is the default external account for its currency.
     */
    public val defaultForCurrency: Boolean? = null,
    /**
     * Uniquely identifies this particular bank account. You can use this attribute to check whether two bank accounts are
     * the same.
     */
    public val fingerprint: String? = null,
    /**
     * Information about the [upcoming new requirements for the bank
     * account](https://docs.stripe.com/connect/custom-accounts/future-requirements), including what information needs to
     * be collected, and by when.
     */
    public val futureRequirements: InlineBankAccountFutureRequirementsX2d2814a2? = null,
    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
     * for storing additional information about the object in a structured format.
     */
    public val metadata: Map<String, String>? = null,
    /**
     * Information about the requirements for the bank account, including what information needs to be collected.
     */
    public val requirements: InlineBankAccountRequirementsXf84df6b2? = null,
    /**
     * The routing transit number for the bank account.
     */
    public val routingNumber: String? = null,
) {
    public class Builder {
        private var countryValue: String? = null

        public var country: String
            get() = requireNotNull(countryValue) { "country is required" }
            set(`value`) {
                countryValue = value
            }

        private var currencyValue: String? = null

        public var currency: String
            get() = requireNotNull(currencyValue) { "currency is required" }
            set(`value`) {
                currencyValue = value
            }

        private var idValue: String? = null

        public var id: String
            get() = requireNotNull(idValue) { "id is required" }
            set(`value`) {
                idValue = value
            }

        private var last4Value: String? = null

        public var last4: String
            get() = requireNotNull(last4Value) { "last4 is required" }
            set(`value`) {
                last4Value = value
            }

        private var objectValueValue: InlineBankAccountObjectValueX96d77174? = null

        public var objectValue: InlineBankAccountObjectValueX96d77174
            get() = requireNotNull(objectValueValue) { "objectValue is required" }
            set(`value`) {
                objectValueValue = value
            }

        private var statusValue: String? = null

        public var status: String
            get() = requireNotNull(statusValue) { "status is required" }
            set(`value`) {
                statusValue = value
            }

        /**
         * The account this bank account belongs to. Only applicable on Accounts (not customers or recipients) This property
         * is only available when returned as an [External Account](/api/external_account_bank_accounts/object) where
         * [controller.is_controller](/api/accounts/object#account_object-controller-is_controller) is `true`.
         */
        public var account: InlineBankAccountAccountX2cf2b751? = null

        /**
         * The name of the person or business that owns the bank account.
         */
        public var accountHolderName: String? = null

        /**
         * The type of entity that holds the account. This can be either `individual` or `company`.
         */
        public var accountHolderType: String? = null

        /**
         * The bank account type. This can only be `checking` or `savings` in most countries. In Japan, this can only be
         * `futsu` or `toza`.
         */
        public var accountType: String? = null

        /**
         * A set of available payout methods for this bank account. Only values from this set should be passed as the
         * `method` when creating a payout.
         */
        public var availablePayoutMethods: List<InlineBankAccountAvailablePayoutMethodsItemXe26a523b>? =
            null

        /**
         * Name of the bank associated with the routing number (e.g., `WELLS FARGO`).
         */
        public var bankName: String? = null

        /**
         * The ID of the customer that the bank account is associated with.
         */
        public var customer: InlineBankAccountCustomerX196a61c7? = null

        /**
         * Whether this bank account is the default external account for its currency.
         */
        public var defaultForCurrency: Boolean? = null

        /**
         * Uniquely identifies this particular bank account. You can use this attribute to check whether two bank accounts
         * are the same.
         */
        public var fingerprint: String? = null

        /**
         * Information about the [upcoming new requirements for the bank
         * account](https://docs.stripe.com/connect/custom-accounts/future-requirements), including what information needs
         * to be collected, and by when.
         */
        public var futureRequirements: InlineBankAccountFutureRequirementsX2d2814a2? = null

        /**
         * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
         * useful for storing additional information about the object in a structured format.
         */
        public var metadata: Map<String, String>? = null

        /**
         * Information about the requirements for the bank account, including what information needs to be collected.
         */
        public var requirements: InlineBankAccountRequirementsXf84df6b2? = null

        /**
         * The routing transit number for the bank account.
         */
        public var routingNumber: String? = null

        public fun build(): BankAccount {
            check(countryValue != null) { "country is required" }
            check(currencyValue != null) { "currency is required" }
            check(idValue != null) { "id is required" }
            check(last4Value != null) { "last4 is required" }
            check(objectValueValue != null) { "objectValue is required" }
            check(statusValue != null) { "status is required" }
            return BankAccount(
                country = country,
                currency = currency,
                id = id,
                last4 = last4,
                objectValue = objectValue,
                status = status,
                account = account,
                accountHolderName = accountHolderName,
                accountHolderType = accountHolderType,
                accountType = accountType,
                availablePayoutMethods = availablePayoutMethods,
                bankName = bankName,
                customer = customer,
                defaultForCurrency = defaultForCurrency,
                fingerprint = fingerprint,
                futureRequirements = futureRequirements,
                metadata = metadata,
                requirements = requirements,
                routingNumber = routingNumber,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): BankAccount = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<BankAccount> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): BankAccount {
            val jsonDecoder = decoder.requireJsonDecoder("BankAccount")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("BankAccount must be a JSON object")
            val country = json.decodeRequired<String>(rawObject, "country")
            val currency = json.decodeRequired<String>(rawObject, "currency")
            val id = json.decodeRequired<String>(rawObject, "id")
            val last4 = json.decodeRequired<String>(rawObject, "last4")
            val objectValue = json.decodeRequired<InlineBankAccountObjectValueX96d77174>(rawObject, "object")
            val status = json.decodeRequired<String>(rawObject, "status")
            return BankAccount(
                country = country,
                currency = currency,
                id = id,
                last4 = last4,
                objectValue = objectValue,
                status = status,
                account =
                    rawObject["account"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineBankAccountAccountX2cf2b751?>(element)
                        }
                    },
                accountHolderName =
                    rawObject["account_holder_name"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                accountHolderType =
                    rawObject["account_holder_type"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                accountType =
                    rawObject["account_type"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                availablePayoutMethods =
                    rawObject["available_payout_methods"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<List<InlineBankAccountAvailablePayoutMethodsItemXe26a523b>?>(
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
                customer =
                    rawObject["customer"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineBankAccountCustomerX196a61c7?>(element)
                        }
                    },
                defaultForCurrency =
                    rawObject["default_for_currency"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Boolean?>(element)
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
                futureRequirements =
                    rawObject["future_requirements"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineBankAccountFutureRequirementsX2d2814a2?>(element)
                        }
                    },
                metadata =
                    rawObject["metadata"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Map<String, String>?>(element)
                        }
                    },
                requirements =
                    rawObject["requirements"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineBankAccountRequirementsXf84df6b2?>(element)
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
            `value`: BankAccount,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("BankAccount")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("country", value.country)
                    put("currency", value.currency)
                    put("id", value.id)
                    put("last4", value.last4)
                    put("object", json.encodeToJsonElement(value.objectValue))
                    put("status", value.status)
                    value.account?.let { put("account", json.encodeToJsonElement(it)) }
                    value.accountHolderName?.let { put("account_holder_name", it) }
                    value.accountHolderType?.let { put("account_holder_type", it) }
                    value.accountType?.let { put("account_type", it) }
                    value.availablePayoutMethods?.let { put("available_payout_methods", json.encodeToJsonElement(it)) }
                    value.bankName?.let { put("bank_name", it) }
                    value.customer?.let { put("customer", json.encodeToJsonElement(it)) }
                    value.defaultForCurrency?.let { put("default_for_currency", json.encodeToJsonElement(it)) }
                    value.fingerprint?.let { put("fingerprint", it) }
                    value.futureRequirements?.let { put("future_requirements", json.encodeToJsonElement(it)) }
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                    value.requirements?.let { put("requirements", json.encodeToJsonElement(it)) }
                    value.routingNumber?.let { put("routing_number", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun bankAccount(block: BankAccount.Builder.() -> Unit): BankAccount = BankAccount.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element = raw[name] ?: throw SerializationException("BankAccount is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
