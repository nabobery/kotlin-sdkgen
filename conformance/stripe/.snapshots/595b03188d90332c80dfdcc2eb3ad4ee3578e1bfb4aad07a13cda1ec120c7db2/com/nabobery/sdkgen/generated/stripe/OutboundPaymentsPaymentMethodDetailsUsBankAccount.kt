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
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/outbound_payments_payment_method_details_us_bank_account
 */
@Serializable(with = OutboundPaymentsPaymentMethodDetailsUsBankAccount.Serializer::class)
public class OutboundPaymentsPaymentMethodDetailsUsBankAccount(
    /**
     * The network rails used. See the [docs](https://docs.stripe.com/treasury/money-movement/timelines) to learn more
     * about money movement timelines for each network type.
     */
    public val network: InlineOutboundPaymentsPaymentMethodDetailsUsBankAccountNetworkXe07bc35c,
    /**
     * Account holder type: individual or company.
     */
    public val accountHolderType: InlineOutboundPaymentsPaym8585AccountHolderTypeXfbf2fd38? = null,
    /**
     * Account type: checkings or savings. Defaults to checking if omitted.
     */
    public val accountType: InlineOutboundPaymentsPaymentMethodDetailsUsBankAccountAccountTypeX04590928? = null,
    /**
     * Name of the bank associated with the bank account.
     */
    public val bankName: String? = null,
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
    public val mandate: InlineOutboundPaymentsPaymentMethodDetailsUsBankAccountMandateX78d61086? = null,
    /**
     * Routing number of the bank account.
     */
    public val routingNumber: String? = null,
) {
    public class Builder {
        private var networkValue:
            InlineOutboundPaymentsPaymentMethodDetailsUsBankAccountNetworkXe07bc35c? = null

        public var network: InlineOutboundPaymentsPaymentMethodDetailsUsBankAccountNetworkXe07bc35c
            get() = requireNotNull(networkValue) { "network is required" }
            set(`value`) {
                networkValue = value
            }

        /**
         * Account holder type: individual or company.
         */
        public var accountHolderType: InlineOutboundPaymentsPaym8585AccountHolderTypeXfbf2fd38? = null

        /**
         * Account type: checkings or savings. Defaults to checking if omitted.
         */
        public var accountType:
            InlineOutboundPaymentsPaymentMethodDetailsUsBankAccountAccountTypeX04590928? = null

        /**
         * Name of the bank associated with the bank account.
         */
        public var bankName: String? = null

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
        public var mandate: InlineOutboundPaymentsPaymentMethodDetailsUsBankAccountMandateX78d61086? =
            null

        /**
         * Routing number of the bank account.
         */
        public var routingNumber: String? = null

        public fun build(): OutboundPaymentsPaymentMethodDetailsUsBankAccount {
            check(networkValue != null) { "network is required" }
            return OutboundPaymentsPaymentMethodDetailsUsBankAccount(
                network = network,
                accountHolderType = accountHolderType,
                accountType = accountType,
                bankName = bankName,
                fingerprint = fingerprint,
                last4 = last4,
                mandate = mandate,
                routingNumber = routingNumber,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): OutboundPaymentsPaymentMethodDetailsUsBankAccount =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<OutboundPaymentsPaymentMethodDetailsUsBankAccount> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): OutboundPaymentsPaymentMethodDetailsUsBankAccount {
            val jsonDecoder = decoder.requireJsonDecoder("OutboundPaymentsPaymentMethodDetailsUsBankAccount")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "OutboundPaymentsPaymentMethodDetailsUsBankAccount must be a JSON object",
                    )
            val network =
                json.decodeRequired<InlineOutboundPaymentsPaymentMethodDetailsUsBankAccountNetworkXe07bc35c>(
                    rawObject,
                    "network",
                )
            return OutboundPaymentsPaymentMethodDetailsUsBankAccount(
                network = network,
                accountHolderType =
                    rawObject["account_holder_type"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineOutboundPaymentsPaym8585AccountHolderTypeXfbf2fd38?>(
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
                            json
                                .decodeFromJsonElement<InlineOutboundPaymentsPaymentMethodDetailsUsBankAccountAccountTypeX04590928?>(
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
                        json
                            .decodeFromJsonElement<InlineOutboundPaymentsPaymentMethodDetailsUsBankAccountMandateX78d61086>(
                                it,
                            )
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
            `value`: OutboundPaymentsPaymentMethodDetailsUsBankAccount,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("OutboundPaymentsPaymentMethodDetailsUsBankAccount")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("network", json.encodeToJsonElement(value.network))
                    value.accountHolderType?.let { put("account_holder_type", json.encodeToJsonElement(it)) }
                    value.accountType?.let { put("account_type", json.encodeToJsonElement(it)) }
                    value.bankName?.let { put("bank_name", it) }
                    value.fingerprint?.let { put("fingerprint", it) }
                    value.last4?.let { put("last4", it) }
                    value.mandate?.let { put("mandate", json.encodeToJsonElement(it)) }
                    value.routingNumber?.let { put("routing_number", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun outboundPaymentsPaymentMethodDetailsUsBankAccount(
    block: OutboundPaymentsPaymentMethodDetailsUsBankAccount.Builder.() -> Unit,
): OutboundPaymentsPaymentMethodDetailsUsBankAccount = OutboundPaymentsPaymentMethodDetailsUsBankAccount.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "OutboundPaymentsPaymentMethodDetailsUsBankAccount is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
