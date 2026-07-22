package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
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

/**
 * The Billing customer portal is a Stripe-hosted UI for subscription and
 * billing management.
 *
 * A portal configuration describes the functionality and features that you
 * want to provide to your customers through the portal.
 *
 * A portal session describes the instantiation of the customer portal for
 * a particular customer. By visiting the session's URL, the customer
 * can manage their subscriptions and billing details. For security reasons,
 * sessions are short-lived and will expire if the customer does not visit the URL.
 * Create sessions on-demand when customers intend to manage their subscriptions
 * and billing details.
 *
 * Related guide: [Customer management](/customer-management)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing_portal.session
 */
@Serializable(with = BillingPortalSession.Serializer::class)
public class BillingPortalSession(
    /**
     * The configuration used by this session, describing the features available.
     */
    public val configuration: InlineBillingPortalSessionConfigurationX04be7630,
    /**
     * Time at which the object was created. Measured in seconds since the Unix epoch.
     */
    public val created: Int,
    /**
     * The ID of the customer for this session.
     */
    public val customer: String,
    /**
     * Unique identifier for the object.
     */
    public val id: String,
    /**
     * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
     */
    public val livemode: Boolean,
    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    public val objectValue: InlineBillingPortalSessionObjectValueX21dda222,
    /**
     * The short-lived URL of the session that gives customers access to the customer portal.
     */
    public val url: String,
    /**
     * The ID of the account for this session.
     */
    public val customerAccount: String? = null,
    /**
     * Information about a specific flow for the customer to go through. See the
     * [docs](https://docs.stripe.com/customer-management/portal-deep-links) to learn more about using customer portal
     * deep links and flows.
     */
    public val flow: InlineBillingPortalSessionFlowX96cb984f? = null,
    /**
     * The IETF language tag of the locale Customer Portal is displayed in. If blank or auto, the customer’s
     * `preferred_locales` or browser’s locale is used.
     */
    public val locale: InlineBillingPortalSessionLocaleXe8a0c699? = null,
    /**
     * The account for which the session was created on behalf of. When specified, only subscriptions and invoices with
     * this `on_behalf_of` account appear in the portal. For more information, see the
     * [docs](https://docs.stripe.com/connect/separate-charges-and-transfers#settlement-merchant). Use the [Accounts
     * API](https://docs.stripe.com/api/accounts/object#account_object-settings-branding) to modify the `on_behalf_of`
     * account's branding settings, which the portal displays.
     */
    public val onBehalfOf: String? = null,
    /**
     * The URL to redirect customers to when they click on the portal's link to return to your website.
     */
    public val returnUrl: String? = null,
) {
    public class Builder {
        private var configurationValue: InlineBillingPortalSessionConfigurationX04be7630? = null

        public var configuration: InlineBillingPortalSessionConfigurationX04be7630
            get() = requireNotNull(configurationValue) { "configuration is required" }
            set(`value`) {
                configurationValue = value
            }

        private var createdValue: Int? = null

        public var created: Int
            get() = requireNotNull(createdValue) { "created is required" }
            set(`value`) {
                createdValue = value
            }

        private var customerValue: String? = null

        public var customer: String
            get() = requireNotNull(customerValue) { "customer is required" }
            set(`value`) {
                customerValue = value
            }

        private var idValue: String? = null

        public var id: String
            get() = requireNotNull(idValue) { "id is required" }
            set(`value`) {
                idValue = value
            }

        private var livemodeValue: Boolean? = null

        public var livemode: Boolean
            get() = requireNotNull(livemodeValue) { "livemode is required" }
            set(`value`) {
                livemodeValue = value
            }

        private var objectValueValue: InlineBillingPortalSessionObjectValueX21dda222? = null

        public var objectValue: InlineBillingPortalSessionObjectValueX21dda222
            get() = requireNotNull(objectValueValue) { "objectValue is required" }
            set(`value`) {
                objectValueValue = value
            }

        private var urlValue: String? = null

        public var url: String
            get() = requireNotNull(urlValue) { "url is required" }
            set(`value`) {
                urlValue = value
            }

        /**
         * The ID of the account for this session.
         */
        public var customerAccount: String? = null

        /**
         * Information about a specific flow for the customer to go through. See the
         * [docs](https://docs.stripe.com/customer-management/portal-deep-links) to learn more about using customer portal
         * deep links and flows.
         */
        public var flow: InlineBillingPortalSessionFlowX96cb984f? = null

        /**
         * The IETF language tag of the locale Customer Portal is displayed in. If blank or auto, the customer’s
         * `preferred_locales` or browser’s locale is used.
         */
        public var locale: InlineBillingPortalSessionLocaleXe8a0c699? = null

        /**
         * The account for which the session was created on behalf of. When specified, only subscriptions and invoices with
         * this `on_behalf_of` account appear in the portal. For more information, see the
         * [docs](https://docs.stripe.com/connect/separate-charges-and-transfers#settlement-merchant). Use the [Accounts
         * API](https://docs.stripe.com/api/accounts/object#account_object-settings-branding) to modify the `on_behalf_of`
         * account's branding settings, which the portal displays.
         */
        public var onBehalfOf: String? = null

        /**
         * The URL to redirect customers to when they click on the portal's link to return to your website.
         */
        public var returnUrl: String? = null

        public fun build(): BillingPortalSession {
            check(configurationValue != null) { "configuration is required" }
            check(createdValue != null) { "created is required" }
            check(customerValue != null) { "customer is required" }
            check(idValue != null) { "id is required" }
            check(livemodeValue != null) { "livemode is required" }
            check(objectValueValue != null) { "objectValue is required" }
            check(urlValue != null) { "url is required" }
            return BillingPortalSession(
                configuration = configuration,
                created = created,
                customer = customer,
                id = id,
                livemode = livemode,
                objectValue = objectValue,
                url = url,
                customerAccount = customerAccount,
                flow = flow,
                locale = locale,
                onBehalfOf = onBehalfOf,
                returnUrl = returnUrl,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): BillingPortalSession = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<BillingPortalSession> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): BillingPortalSession {
            val jsonDecoder = decoder.requireJsonDecoder("BillingPortalSession")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("BillingPortalSession must be a JSON object")
            val configuration =
                json.decodeRequired<InlineBillingPortalSessionConfigurationX04be7630>(
                    rawObject,
                    "configuration",
                )
            val created = json.decodeRequired<Int>(rawObject, "created")
            val customer = json.decodeRequired<String>(rawObject, "customer")
            val id = json.decodeRequired<String>(rawObject, "id")
            val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
            val objectValue = json.decodeRequired<InlineBillingPortalSessionObjectValueX21dda222>(rawObject, "object")
            val url = json.decodeRequired<String>(rawObject, "url")
            return BillingPortalSession(
                configuration = configuration,
                created = created,
                customer = customer,
                id = id,
                livemode = livemode,
                objectValue = objectValue,
                url = url,
                customerAccount =
                    rawObject["customer_account"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                flow =
                    rawObject["flow"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineBillingPortalSessionFlowX96cb984f?>(element)
                        }
                    },
                locale =
                    rawObject["locale"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineBillingPortalSessionLocaleXe8a0c699?>(element)
                        }
                    },
                onBehalfOf =
                    rawObject["on_behalf_of"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                returnUrl =
                    rawObject["return_url"]?.let { element ->
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
            `value`: BillingPortalSession,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("BillingPortalSession")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("configuration", json.encodeToJsonElement(value.configuration))
                    put("created", json.encodeToJsonElement(value.created))
                    put("customer", value.customer)
                    put("id", value.id)
                    put("livemode", json.encodeToJsonElement(value.livemode))
                    put("object", json.encodeToJsonElement(value.objectValue))
                    put("url", value.url)
                    value.customerAccount?.let { put("customer_account", it) }
                    value.flow?.let { put("flow", json.encodeToJsonElement(it)) }
                    value.locale?.let { put("locale", json.encodeToJsonElement(it)) }
                    value.onBehalfOf?.let { put("on_behalf_of", it) }
                    value.returnUrl?.let { put("return_url", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun billingPortalSession(block: BillingPortalSession.Builder.() -> Unit): BillingPortalSession =
    BillingPortalSession.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name] ?: throw SerializationException("BillingPortalSession is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
