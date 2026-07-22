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

@Serializable
public data class BillingCreditBalanceTransactionView(
    public val created: Int,
    public val credit: InlineBillingCreditBalanceTransactionCreditXc0e9748b? = null,
    @SerialName("credit_grant")
    public val creditGrant: InlineBillingCreditBalanceTransactionCreditGrantX6e0e6c5e,
    public val debit: InlineBillingCreditBalanceTransactionDebitX74175306? = null,
    @SerialName("effective_at")
    public val effectiveAt: Int,
    public val id: String,
    public val livemode: Boolean,
    @SerialName("object")
    public val objectValue: InlineBillingCreditBalanceTransactionObjectValueX33e7fb04,
    @SerialName("test_clock")
    public val testClock: InlineBillingCreditBalanceTransactionTestClockX0ed6ef06? = null,
    public val type: InlineBillingCreditBalanceTransactionTypeX43796971? = null,
)

/**
 * A credit balance transaction is a resource representing a transaction (either a credit or a debit) against an
 * existing credit grant.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing.credit_balance_transaction
 */
@Serializable(with = BillingCreditBalanceTransaction.Serializer::class)
public class BillingCreditBalanceTransaction(
    /**
     * Time at which the object was created. Measured in seconds since the Unix epoch.
     */
    public val created: Int,
    /**
     * The credit grant associated with this credit balance transaction.
     */
    public val creditGrant: InlineBillingCreditBalanceTransactionCreditGrantX6e0e6c5e,
    /**
     * The effective time of this credit balance transaction.
     */
    public val effectiveAt: Int,
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
    public val objectValue: InlineBillingCreditBalanceTransactionObjectValueX33e7fb04,
    /**
     * Credit details for this credit balance transaction. Only present if type is `credit`.
     */
    public val credit: InlineBillingCreditBalanceTransactionCreditXc0e9748b? = null,
    /**
     * Debit details for this credit balance transaction. Only present if type is `debit`.
     */
    public val debit: InlineBillingCreditBalanceTransactionDebitX74175306? = null,
    /**
     * ID of the test clock this credit balance transaction belongs to.
     */
    public val testClock: InlineBillingCreditBalanceTransactionTestClockX0ed6ef06? = null,
    /**
     * The type of credit balance transaction (credit or debit).
     */
    public val type: InlineBillingCreditBalanceTransactionTypeX43796971? = null,
) {
    public class Builder {
        private var createdValue: Int? = null

        public var created: Int
            get() = requireNotNull(createdValue) { "created is required" }
            set(`value`) {
                createdValue = value
            }

        private var creditGrantValue: InlineBillingCreditBalanceTransactionCreditGrantX6e0e6c5e? = null

        public var creditGrant: InlineBillingCreditBalanceTransactionCreditGrantX6e0e6c5e
            get() = requireNotNull(creditGrantValue) { "creditGrant is required" }
            set(`value`) {
                creditGrantValue = value
            }

        private var effectiveAtValue: Int? = null

        public var effectiveAt: Int
            get() = requireNotNull(effectiveAtValue) { "effectiveAt is required" }
            set(`value`) {
                effectiveAtValue = value
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

        private var objectValueValue: InlineBillingCreditBalanceTransactionObjectValueX33e7fb04? = null

        public var objectValue: InlineBillingCreditBalanceTransactionObjectValueX33e7fb04
            get() = requireNotNull(objectValueValue) { "objectValue is required" }
            set(`value`) {
                objectValueValue = value
            }

        /**
         * Credit details for this credit balance transaction. Only present if type is `credit`.
         */
        public var credit: InlineBillingCreditBalanceTransactionCreditXc0e9748b? = null

        /**
         * Debit details for this credit balance transaction. Only present if type is `debit`.
         */
        public var debit: InlineBillingCreditBalanceTransactionDebitX74175306? = null

        /**
         * ID of the test clock this credit balance transaction belongs to.
         */
        public var testClock: InlineBillingCreditBalanceTransactionTestClockX0ed6ef06? = null

        /**
         * The type of credit balance transaction (credit or debit).
         */
        public var type: InlineBillingCreditBalanceTransactionTypeX43796971? = null

        public fun build(): BillingCreditBalanceTransaction {
            check(createdValue != null) { "created is required" }
            check(creditGrantValue != null) { "creditGrant is required" }
            check(effectiveAtValue != null) { "effectiveAt is required" }
            check(idValue != null) { "id is required" }
            check(livemodeValue != null) { "livemode is required" }
            check(objectValueValue != null) { "objectValue is required" }
            return BillingCreditBalanceTransaction(
                created = created,
                creditGrant = creditGrant,
                effectiveAt = effectiveAt,
                id = id,
                livemode = livemode,
                objectValue = objectValue,
                credit = credit,
                debit = debit,
                testClock = testClock,
                type = type,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): BillingCreditBalanceTransaction = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<BillingCreditBalanceTransaction> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): BillingCreditBalanceTransaction {
            val jsonDecoder = decoder.requireJsonDecoder("BillingCreditBalanceTransaction")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("BillingCreditBalanceTransaction must be a JSON object")
            val created = json.decodeRequired<Int>(rawObject, "created")
            val creditGrant =
                json.decodeRequired<InlineBillingCreditBalanceTransactionCreditGrantX6e0e6c5e>(
                    rawObject,
                    "credit_grant",
                )
            val effectiveAt = json.decodeRequired<Int>(rawObject, "effective_at")
            val id = json.decodeRequired<String>(rawObject, "id")
            val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
            val objectValue =
                json.decodeRequired<InlineBillingCreditBalanceTransactionObjectValueX33e7fb04>(
                    rawObject,
                    "object",
                )
            return BillingCreditBalanceTransaction(
                created = created,
                creditGrant = creditGrant,
                effectiveAt = effectiveAt,
                id = id,
                livemode = livemode,
                objectValue = objectValue,
                credit =
                    rawObject["credit"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineBillingCreditBalanceTransactionCreditXc0e9748b?>(element)
                        }
                    },
                debit =
                    rawObject["debit"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineBillingCreditBalanceTransactionDebitX74175306?>(element)
                        }
                    },
                testClock =
                    rawObject["test_clock"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineBillingCreditBalanceTransactionTestClockX0ed6ef06?>(
                                element,
                            )
                        }
                    },
                type =
                    rawObject["type"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineBillingCreditBalanceTransactionTypeX43796971?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: BillingCreditBalanceTransaction,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("BillingCreditBalanceTransaction")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("created", json.encodeToJsonElement(value.created))
                    put("credit_grant", json.encodeToJsonElement(value.creditGrant))
                    put("effective_at", json.encodeToJsonElement(value.effectiveAt))
                    put("id", value.id)
                    put("livemode", json.encodeToJsonElement(value.livemode))
                    put("object", json.encodeToJsonElement(value.objectValue))
                    value.credit?.let { put("credit", json.encodeToJsonElement(it)) }
                    value.debit?.let { put("debit", json.encodeToJsonElement(it)) }
                    value.testClock?.let { put("test_clock", json.encodeToJsonElement(it)) }
                    value.type?.let { put("type", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun billingCreditBalanceTransaction(
    block: BillingCreditBalanceTransaction.Builder.() -> Unit,
): BillingCreditBalanceTransaction = BillingCreditBalanceTransaction.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "BillingCreditBalanceTransaction is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
