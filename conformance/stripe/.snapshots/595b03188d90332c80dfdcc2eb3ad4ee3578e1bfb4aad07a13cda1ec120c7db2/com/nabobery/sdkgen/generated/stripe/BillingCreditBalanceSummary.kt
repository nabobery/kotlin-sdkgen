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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Indicates the billing credit balance for billing credits granted to a customer.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing.credit_balance_summary
 */
@Serializable(with = BillingCreditBalanceSummary.Serializer::class)
public class BillingCreditBalanceSummary(
    balances: List<CreditBalance>,
    /**
     * The customer the balance is for.
     */
    public val customer: InlineBillingCreditBalanceSummaryCustomerXd7a27b43,
    /**
     * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
     */
    public val livemode: Boolean,
    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    public val objectValue: InlineBillingCreditBalanceSummaryObjectValueX8dbd6d20,
    /**
     * The account the balance is for.
     */
    public val customerAccount: String? = null,
) {
    /**
     * The billing credit balances. One entry per credit grant currency. If a customer only has credit grants in a single
     * currency, then this will have a single balance entry.
     */
    public val balances: List<CreditBalance> = balances.toList()

    public class Builder {
        private var balancesValue: List<CreditBalance>? = null

        public var balances: List<CreditBalance>
            get() = requireNotNull(balancesValue) { "balances is required" }
            set(`value`) {
                balancesValue = value
            }

        private var customerValue: InlineBillingCreditBalanceSummaryCustomerXd7a27b43? = null

        public var customer: InlineBillingCreditBalanceSummaryCustomerXd7a27b43
            get() = requireNotNull(customerValue) { "customer is required" }
            set(`value`) {
                customerValue = value
            }

        private var livemodeValue: Boolean? = null

        public var livemode: Boolean
            get() = requireNotNull(livemodeValue) { "livemode is required" }
            set(`value`) {
                livemodeValue = value
            }

        private var objectValueValue: InlineBillingCreditBalanceSummaryObjectValueX8dbd6d20? = null

        public var objectValue: InlineBillingCreditBalanceSummaryObjectValueX8dbd6d20
            get() = requireNotNull(objectValueValue) { "objectValue is required" }
            set(`value`) {
                objectValueValue = value
            }

        /**
         * The account the balance is for.
         */
        public var customerAccount: String? = null

        public fun build(): BillingCreditBalanceSummary {
            check(balancesValue != null) { "balances is required" }
            check(customerValue != null) { "customer is required" }
            check(livemodeValue != null) { "livemode is required" }
            check(objectValueValue != null) { "objectValue is required" }
            return BillingCreditBalanceSummary(
                balances = balances,
                customer = customer,
                livemode = livemode,
                objectValue = objectValue,
                customerAccount = customerAccount,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): BillingCreditBalanceSummary = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<BillingCreditBalanceSummary> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): BillingCreditBalanceSummary {
            val jsonDecoder = decoder.requireJsonDecoder("BillingCreditBalanceSummary")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("BillingCreditBalanceSummary must be a JSON object")
            val balances = json.decodeRequired<List<CreditBalance>>(rawObject, "balances")
            val customer =
                json.decodeRequired<InlineBillingCreditBalanceSummaryCustomerXd7a27b43>(
                    rawObject,
                    "customer",
                )
            val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
            val objectValue =
                json.decodeRequired<InlineBillingCreditBalanceSummaryObjectValueX8dbd6d20>(
                    rawObject,
                    "object",
                )
            return BillingCreditBalanceSummary(
                balances = balances,
                customer = customer,
                livemode = livemode,
                objectValue = objectValue,
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
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: BillingCreditBalanceSummary,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("BillingCreditBalanceSummary")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("balances", json.encodeToJsonElement(value.balances))
                    put("customer", json.encodeToJsonElement(value.customer))
                    put("livemode", json.encodeToJsonElement(value.livemode))
                    put("object", json.encodeToJsonElement(value.objectValue))
                    value.customerAccount?.let { put("customer_account", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun billingCreditBalanceSummary(
    block: BillingCreditBalanceSummary.Builder.() -> Unit,
): BillingCreditBalanceSummary = BillingCreditBalanceSummary.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException("BillingCreditBalanceSummary is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
