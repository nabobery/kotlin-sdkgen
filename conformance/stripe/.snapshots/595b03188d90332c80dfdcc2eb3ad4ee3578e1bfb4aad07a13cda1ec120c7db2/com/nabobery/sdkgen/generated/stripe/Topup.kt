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
public data class TopupView(
    public val amount: Int,
    @SerialName("balance_transaction")
    public val balanceTransaction: InlineTopupBalanceTransactionX090a295d? = null,
    public val created: Int,
    public val currency: String,
    public val description: String? = null,
    @SerialName("expected_availability_date")
    public val expectedAvailabilityDate: Int? = null,
    @SerialName("failure_code")
    public val failureCode: String? = null,
    @SerialName("failure_message")
    public val failureMessage: String? = null,
    public val id: String,
    public val livemode: Boolean,
    public val metadata: Map<String, String>,
    @SerialName("object")
    public val objectValue: InlineTopupObjectValueXef89b750,
    public val source: InlineTopupSourceX47d406a9? = null,
    @SerialName("statement_descriptor")
    public val statementDescriptor: String? = null,
    public val status: InlineTopupStatusXd45c2890,
    @SerialName("transfer_group")
    public val transferGroup: String? = null,
)

/**
 * To top up your Stripe balance, you create a top-up object. You can retrieve
 * individual top-ups, as well as list all top-ups. Top-ups are identified by a
 * unique, random ID.
 *
 * Related guide: [Topping up your platform account](https://docs.stripe.com/connect/top-ups)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/topup
 */
@Serializable(with = Topup.Serializer::class)
public class Topup(
    /**
     * Amount transferred.
     */
    public val amount: Int,
    /**
     * Time at which the object was created. Measured in seconds since the Unix epoch.
     */
    public val created: Int,
    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
     * [supported currency](https://stripe.com/docs/currencies).
     */
    public val currency: String,
    /**
     * Unique identifier for the object.
     */
    public val id: String,
    /**
     * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
     */
    public val livemode: Boolean,
    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
     * for storing additional information about the object in a structured format.
     */
    public val metadata: Map<String, String>,
    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    public val objectValue: InlineTopupObjectValueXef89b750,
    /**
     * The status of the top-up is either `canceled`, `failed`, `pending`, `reversed`, or `succeeded`.
     */
    public val status: InlineTopupStatusXd45c2890,
    /**
     * ID of the balance transaction that describes the impact of this top-up on your account balance. May not be
     * specified depending on status of top-up.
     */
    public val balanceTransaction: InlineTopupBalanceTransactionX090a295d? = null,
    /**
     * An arbitrary string attached to the object. Often useful for displaying to users.
     */
    public val description: String? = null,
    /**
     * Date the funds are expected to arrive in your Stripe account for payouts. This factors in delays like weekends or
     * bank holidays. May not be specified depending on status of top-up.
     */
    public val expectedAvailabilityDate: Int? = null,
    /**
     * Error code explaining reason for top-up failure if available (see [the errors section](/api/errors) for a list of
     * codes).
     */
    public val failureCode: String? = null,
    /**
     * Message to user further explaining reason for top-up failure if available.
     */
    public val failureMessage: String? = null,
    /**
     * The source field is deprecated. It might not always be present in the API response.
     */
    public val source: InlineTopupSourceX47d406a9? = null,
    /**
     * Extra information about a top-up. This will appear on your source's bank statement. It must contain at least one
     * letter.
     */
    public val statementDescriptor: String? = null,
    /**
     * A string that identifies this top-up as part of a group.
     */
    public val transferGroup: String? = null,
) {
    public class Builder {
        private var amountValue: Int? = null

        public var amount: Int
            get() = requireNotNull(amountValue) { "amount is required" }
            set(`value`) {
                amountValue = value
            }

        private var createdValue: Int? = null

        public var created: Int
            get() = requireNotNull(createdValue) { "created is required" }
            set(`value`) {
                createdValue = value
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

        private var livemodeValue: Boolean? = null

        public var livemode: Boolean
            get() = requireNotNull(livemodeValue) { "livemode is required" }
            set(`value`) {
                livemodeValue = value
            }

        private var metadataValue: Map<String, String>? = null

        public var metadata: Map<String, String>
            get() = requireNotNull(metadataValue) { "metadata is required" }
            set(`value`) {
                metadataValue = value
            }

        private var objectValueValue: InlineTopupObjectValueXef89b750? = null

        public var objectValue: InlineTopupObjectValueXef89b750
            get() = requireNotNull(objectValueValue) { "objectValue is required" }
            set(`value`) {
                objectValueValue = value
            }

        private var statusValue: InlineTopupStatusXd45c2890? = null

        public var status: InlineTopupStatusXd45c2890
            get() = requireNotNull(statusValue) { "status is required" }
            set(`value`) {
                statusValue = value
            }

        /**
         * ID of the balance transaction that describes the impact of this top-up on your account balance. May not be
         * specified depending on status of top-up.
         */
        public var balanceTransaction: InlineTopupBalanceTransactionX090a295d? = null

        /**
         * An arbitrary string attached to the object. Often useful for displaying to users.
         */
        public var description: String? = null

        /**
         * Date the funds are expected to arrive in your Stripe account for payouts. This factors in delays like weekends or
         * bank holidays. May not be specified depending on status of top-up.
         */
        public var expectedAvailabilityDate: Int? = null

        /**
         * Error code explaining reason for top-up failure if available (see [the errors section](/api/errors) for a list of
         * codes).
         */
        public var failureCode: String? = null

        /**
         * Message to user further explaining reason for top-up failure if available.
         */
        public var failureMessage: String? = null

        /**
         * The source field is deprecated. It might not always be present in the API response.
         */
        public var source: InlineTopupSourceX47d406a9? = null

        /**
         * Extra information about a top-up. This will appear on your source's bank statement. It must contain at least one
         * letter.
         */
        public var statementDescriptor: String? = null

        /**
         * A string that identifies this top-up as part of a group.
         */
        public var transferGroup: String? = null

        public fun build(): Topup {
            check(amountValue != null) { "amount is required" }
            check(createdValue != null) { "created is required" }
            check(currencyValue != null) { "currency is required" }
            check(idValue != null) { "id is required" }
            check(livemodeValue != null) { "livemode is required" }
            check(metadataValue != null) { "metadata is required" }
            check(objectValueValue != null) { "objectValue is required" }
            check(statusValue != null) { "status is required" }
            return Topup(
                amount = amount,
                created = created,
                currency = currency,
                id = id,
                livemode = livemode,
                metadata = metadata,
                objectValue = objectValue,
                status = status,
                balanceTransaction = balanceTransaction,
                description = description,
                expectedAvailabilityDate = expectedAvailabilityDate,
                failureCode = failureCode,
                failureMessage = failureMessage,
                source = source,
                statementDescriptor = statementDescriptor,
                transferGroup = transferGroup,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): Topup = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<Topup> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): Topup {
            val jsonDecoder = decoder.requireJsonDecoder("Topup")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("Topup must be a JSON object")
            val amount = json.decodeRequired<Int>(rawObject, "amount")
            val created = json.decodeRequired<Int>(rawObject, "created")
            val currency = json.decodeRequired<String>(rawObject, "currency")
            val id = json.decodeRequired<String>(rawObject, "id")
            val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
            val metadata = json.decodeRequired<Map<String, String>>(rawObject, "metadata")
            val objectValue = json.decodeRequired<InlineTopupObjectValueXef89b750>(rawObject, "object")
            val status = json.decodeRequired<InlineTopupStatusXd45c2890>(rawObject, "status")
            return Topup(
                amount = amount,
                created = created,
                currency = currency,
                id = id,
                livemode = livemode,
                metadata = metadata,
                objectValue = objectValue,
                status = status,
                balanceTransaction =
                    rawObject["balance_transaction"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineTopupBalanceTransactionX090a295d?>(element)
                        }
                    },
                description =
                    rawObject["description"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                expectedAvailabilityDate =
                    rawObject["expected_availability_date"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
                failureCode =
                    rawObject["failure_code"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                failureMessage =
                    rawObject["failure_message"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                source =
                    rawObject["source"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineTopupSourceX47d406a9?>(element)
                        }
                    },
                statementDescriptor =
                    rawObject["statement_descriptor"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                transferGroup =
                    rawObject["transfer_group"]?.let { element ->
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
            `value`: Topup,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("Topup")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("amount", json.encodeToJsonElement(value.amount))
                    put("created", json.encodeToJsonElement(value.created))
                    put("currency", value.currency)
                    put("id", value.id)
                    put("livemode", json.encodeToJsonElement(value.livemode))
                    put("metadata", json.encodeToJsonElement(value.metadata))
                    put("object", json.encodeToJsonElement(value.objectValue))
                    put("status", json.encodeToJsonElement(value.status))
                    value.balanceTransaction?.let { put("balance_transaction", json.encodeToJsonElement(it)) }
                    value.description?.let { put("description", it) }
                    value.expectedAvailabilityDate?.let {
                        put(
                            "expected_availability_date",
                            json.encodeToJsonElement(it),
                        )
                    }
                    value.failureCode?.let { put("failure_code", it) }
                    value.failureMessage?.let { put("failure_message", it) }
                    value.source?.let { put("source", json.encodeToJsonElement(it)) }
                    value.statementDescriptor?.let { put("statement_descriptor", it) }
                    value.transferGroup?.let { put("transfer_group", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun topup(block: Topup.Builder.() -> Unit): Topup = Topup.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element = raw[name] ?: throw SerializationException("Topup is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
