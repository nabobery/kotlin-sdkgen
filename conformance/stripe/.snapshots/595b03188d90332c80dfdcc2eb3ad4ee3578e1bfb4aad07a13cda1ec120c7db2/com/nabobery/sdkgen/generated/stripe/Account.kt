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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

@Serializable
public data class AccountView(
    @SerialName("business_profile")
    public val businessProfile: InlineAccountBusinessProfileX8962a2f6? = null,
    @SerialName("business_type")
    public val businessType: InlineAccountBusinessTypeX0dd32b67? = null,
    public val capabilities: AccountCapabilities? = null,
    @SerialName("charges_enabled")
    public val chargesEnabled: Boolean? = null,
    public val company: LegalEntityCompany? = null,
    public val controller: AccountUnificationAccountController? = null,
    public val country: String? = null,
    public val created: Int? = null,
    @SerialName("default_currency")
    public val defaultCurrency: String? = null,
    @SerialName("details_submitted")
    public val detailsSubmitted: Boolean? = null,
    public val email: String? = null,
    @SerialName("external_accounts")
    public val externalAccounts: InlineAccountExternalAccountsXace51fb0? = null,
    @SerialName("future_requirements")
    public val futureRequirements: AccountFutureRequirements? = null,
    public val groups: InlineAccountGroupsXb65c8b1c? = null,
    public val id: String,
    public val individual: Person? = null,
    public val metadata: Map<String, String>? = null,
    @SerialName("object")
    public val objectValue: InlineAccountObjectValueX7a2c1f55,
    @SerialName("payouts_enabled")
    public val payoutsEnabled: Boolean? = null,
    public val requirements: AccountRequirements? = null,
    public val settings: InlineAccountSettingsX8aa98c30? = null,
    @SerialName("tos_acceptance")
    public val tosAcceptance: AccountTosAcceptance? = null,
    public val type: InlineAccountTypeXb5cee925? = null,
)

/**
 * For new integrations, we recommend using the [Accounts v2 API](/api/v2/core/accounts), in place of /v1/accounts and
 * /v1/customers to represent a user.
 *
 * This is an object representing a Stripe account. You can retrieve it to see
 * properties on the account like its current requirements or if the account is
 * enabled to make live charges or receive payouts.
 *
 * For accounts where
 * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection)
 * is `application`, which includes Custom accounts, the properties below are always
 * returned.
 *
 * For accounts where
 * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection)
 * is `stripe`, which includes Standard and Express accounts, some properties are only returned
 * until you create an [Account Link](/api/account_links) or [Account Session](/api/account_sessions)
 * to start Connect Onboarding. Learn about the [differences between accounts](/connect/accounts).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account
 */
@Serializable(with = Account.Serializer::class)
public class Account(
    /**
     * Unique identifier for the object.
     */
    public val id: String,
    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    public val objectValue: InlineAccountObjectValueX7a2c1f55,
    /**
     * Business information about the account.
     */
    public val businessProfile: InlineAccountBusinessProfileX8962a2f6? = null,
    /**
     * The business type.
     */
    public val businessType: InlineAccountBusinessTypeX0dd32b67? = null,
    public val capabilities: AccountCapabilities? = null,
    /**
     * Whether the account can process charges.
     */
    public val chargesEnabled: Boolean? = null,
    public val company: LegalEntityCompany? = null,
    public val controller: AccountUnificationAccountController? = null,
    /**
     * The account's country.
     */
    public val country: String? = null,
    /**
     * Time at which the account was connected. Measured in seconds since the Unix epoch.
     */
    public val created: Int? = null,
    /**
     * Three-letter ISO currency code representing the default currency for the account. This must be a currency that
     * [Stripe supports in the account's country](https://stripe.com/docs/payouts).
     */
    public val defaultCurrency: String? = null,
    /**
     * Whether account details have been submitted. Accounts with Stripe Dashboard access, which includes Standard
     * accounts, cannot receive payouts before this is true. Accounts where this is false should be directed to [an
     * onboarding flow](/connect/onboarding) to finish submitting account details.
     */
    public val detailsSubmitted: Boolean? = null,
    /**
     * An email address associated with the account. It's not used for authentication and Stripe doesn't market to this
     * field without explicit approval from the platform.
     */
    public val email: String? = null,
    /**
     * External accounts (bank accounts and debit cards) currently attached to this account. External accounts are only
     * returned for requests where `controller[is_controller]` is true.
     */
    public val externalAccounts: InlineAccountExternalAccountsXace51fb0? = null,
    public val futureRequirements: AccountFutureRequirements? = null,
    /**
     * The groups associated with the account.
     */
    public val groups: InlineAccountGroupsXb65c8b1c? = null,
    public val individual: Person? = null,
    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
     * for storing additional information about the object in a structured format.
     */
    public val metadata: Map<String, String>? = null,
    /**
     * Whether the funds in this account can be paid out.
     */
    public val payoutsEnabled: Boolean? = null,
    public val requirements: AccountRequirements? = null,
    /**
     * Options for customizing how the account functions within Stripe.
     */
    public val settings: InlineAccountSettingsX8aa98c30? = null,
    public val tosAcceptance: AccountTosAcceptance? = null,
    /**
     * The Stripe account type. Can be `standard`, `express`, `custom`, or `none`.
     */
    public val type: InlineAccountTypeXb5cee925? = null,
) {
    public class Builder {
        private var idValue: String? = null

        public var id: String
            get() = requireNotNull(idValue) { "id is required" }
            set(`value`) {
                idValue = value
            }

        private var objectValueValue: InlineAccountObjectValueX7a2c1f55? = null

        public var objectValue: InlineAccountObjectValueX7a2c1f55
            get() = requireNotNull(objectValueValue) { "objectValue is required" }
            set(`value`) {
                objectValueValue = value
            }

        /**
         * Business information about the account.
         */
        public var businessProfile: InlineAccountBusinessProfileX8962a2f6? = null

        /**
         * The business type.
         */
        public var businessType: InlineAccountBusinessTypeX0dd32b67? = null

        public var capabilities: AccountCapabilities? = null

        /**
         * Whether the account can process charges.
         */
        public var chargesEnabled: Boolean? = null

        public var company: LegalEntityCompany? = null

        public var controller: AccountUnificationAccountController? = null

        /**
         * The account's country.
         */
        public var country: String? = null

        /**
         * Time at which the account was connected. Measured in seconds since the Unix epoch.
         */
        public var created: Int? = null

        /**
         * Three-letter ISO currency code representing the default currency for the account. This must be a currency that
         * [Stripe supports in the account's country](https://stripe.com/docs/payouts).
         */
        public var defaultCurrency: String? = null

        /**
         * Whether account details have been submitted. Accounts with Stripe Dashboard access, which includes Standard
         * accounts, cannot receive payouts before this is true. Accounts where this is false should be directed to [an
         * onboarding flow](/connect/onboarding) to finish submitting account details.
         */
        public var detailsSubmitted: Boolean? = null

        /**
         * An email address associated with the account. It's not used for authentication and Stripe doesn't market to this
         * field without explicit approval from the platform.
         */
        public var email: String? = null

        /**
         * External accounts (bank accounts and debit cards) currently attached to this account. External accounts are only
         * returned for requests where `controller[is_controller]` is true.
         */
        public var externalAccounts: InlineAccountExternalAccountsXace51fb0? = null

        public var futureRequirements: AccountFutureRequirements? = null

        /**
         * The groups associated with the account.
         */
        public var groups: InlineAccountGroupsXb65c8b1c? = null

        public var individual: Person? = null

        /**
         * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
         * useful for storing additional information about the object in a structured format.
         */
        public var metadata: Map<String, String>? = null

        /**
         * Whether the funds in this account can be paid out.
         */
        public var payoutsEnabled: Boolean? = null

        public var requirements: AccountRequirements? = null

        /**
         * Options for customizing how the account functions within Stripe.
         */
        public var settings: InlineAccountSettingsX8aa98c30? = null

        public var tosAcceptance: AccountTosAcceptance? = null

        /**
         * The Stripe account type. Can be `standard`, `express`, `custom`, or `none`.
         */
        public var type: InlineAccountTypeXb5cee925? = null

        public fun build(): Account {
            check(idValue != null) { "id is required" }
            check(objectValueValue != null) { "objectValue is required" }
            return Account(
                id = id,
                objectValue = objectValue,
                businessProfile = businessProfile,
                businessType = businessType,
                capabilities = capabilities,
                chargesEnabled = chargesEnabled,
                company = company,
                controller = controller,
                country = country,
                created = created,
                defaultCurrency = defaultCurrency,
                detailsSubmitted = detailsSubmitted,
                email = email,
                externalAccounts = externalAccounts,
                futureRequirements = futureRequirements,
                groups = groups,
                individual = individual,
                metadata = metadata,
                payoutsEnabled = payoutsEnabled,
                requirements = requirements,
                settings = settings,
                tosAcceptance = tosAcceptance,
                type = type,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): Account = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<Account> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): Account {
            val jsonDecoder = decoder.requireJsonDecoder("Account")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("Account must be a JSON object")
            val id = json.decodeRequired<String>(rawObject, "id")
            val objectValue = json.decodeRequired<InlineAccountObjectValueX7a2c1f55>(rawObject, "object")
            return Account(
                id = id,
                objectValue = objectValue,
                businessProfile =
                    rawObject["business_profile"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineAccountBusinessProfileX8962a2f6?>(element)
                        }
                    },
                businessType =
                    rawObject["business_type"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineAccountBusinessTypeX0dd32b67?>(element)
                        }
                    },
                capabilities = rawObject["capabilities"]?.let { json.decodeFromJsonElement<AccountCapabilities>(it) },
                chargesEnabled = rawObject["charges_enabled"]?.let { json.decodeFromJsonElement<Boolean>(it) },
                company = rawObject["company"]?.let { json.decodeFromJsonElement<LegalEntityCompany>(it) },
                controller =
                    rawObject["controller"]?.let {
                        json.decodeFromJsonElement<AccountUnificationAccountController>(
                            it,
                        )
                    },
                country = rawObject["country"]?.let { json.decodeFromJsonElement<String>(it) },
                created = rawObject["created"]?.let { json.decodeFromJsonElement<Int>(it) },
                defaultCurrency = rawObject["default_currency"]?.let { json.decodeFromJsonElement<String>(it) },
                detailsSubmitted = rawObject["details_submitted"]?.let { json.decodeFromJsonElement<Boolean>(it) },
                email =
                    rawObject["email"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                externalAccounts =
                    rawObject["external_accounts"]?.let {
                        json.decodeFromJsonElement<InlineAccountExternalAccountsXace51fb0>(it)
                    },
                futureRequirements =
                    rawObject["future_requirements"]?.let {
                        json.decodeFromJsonElement<AccountFutureRequirements>(it)
                    },
                groups =
                    rawObject["groups"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineAccountGroupsXb65c8b1c?>(element)
                        }
                    },
                individual = rawObject["individual"]?.let { json.decodeFromJsonElement<Person>(it) },
                metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
                payoutsEnabled = rawObject["payouts_enabled"]?.let { json.decodeFromJsonElement<Boolean>(it) },
                requirements = rawObject["requirements"]?.let { json.decodeFromJsonElement<AccountRequirements>(it) },
                settings =
                    rawObject["settings"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineAccountSettingsX8aa98c30?>(element)
                        }
                    },
                tosAcceptance =
                    rawObject["tos_acceptance"]?.let {
                        json.decodeFromJsonElement<AccountTosAcceptance>(
                            it,
                        )
                    },
                type = rawObject["type"]?.let { json.decodeFromJsonElement<InlineAccountTypeXb5cee925>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: Account,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("Account")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("id", value.id)
                    put("object", json.encodeToJsonElement(value.objectValue))
                    value.businessProfile?.let { put("business_profile", json.encodeToJsonElement(it)) }
                    value.businessType?.let { put("business_type", json.encodeToJsonElement(it)) }
                    value.capabilities?.let { put("capabilities", json.encodeToJsonElement(it)) }
                    value.chargesEnabled?.let { put("charges_enabled", json.encodeToJsonElement(it)) }
                    value.company?.let { put("company", json.encodeToJsonElement(it)) }
                    value.controller?.let { put("controller", json.encodeToJsonElement(it)) }
                    value.country?.let { put("country", it) }
                    value.created?.let { put("created", json.encodeToJsonElement(it)) }
                    value.defaultCurrency?.let { put("default_currency", it) }
                    value.detailsSubmitted?.let { put("details_submitted", json.encodeToJsonElement(it)) }
                    value.email?.let { put("email", it) }
                    value.externalAccounts?.let { put("external_accounts", json.encodeToJsonElement(it)) }
                    value.futureRequirements?.let { put("future_requirements", json.encodeToJsonElement(it)) }
                    value.groups?.let { put("groups", json.encodeToJsonElement(it)) }
                    value.individual?.let { put("individual", json.encodeToJsonElement(it)) }
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                    value.payoutsEnabled?.let { put("payouts_enabled", json.encodeToJsonElement(it)) }
                    value.requirements?.let { put("requirements", json.encodeToJsonElement(it)) }
                    value.settings?.let { put("settings", json.encodeToJsonElement(it)) }
                    value.tosAcceptance?.let { put("tos_acceptance", json.encodeToJsonElement(it)) }
                    value.type?.let { put("type", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun account(block: Account.Builder.() -> Unit): Account = Account.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element = raw[name] ?: throw SerializationException("Account is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
