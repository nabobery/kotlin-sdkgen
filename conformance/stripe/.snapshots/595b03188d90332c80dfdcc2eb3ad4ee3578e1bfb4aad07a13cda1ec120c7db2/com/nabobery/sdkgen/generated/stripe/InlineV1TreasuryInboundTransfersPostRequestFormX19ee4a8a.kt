package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
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
import kotlin.collections.Map

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1inbound_transfers/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1inbound_transfers/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema
 */
@Serializable(with = InlineV1TreasuryInboundTransfersPostRequestFormX19ee4a8a.Serializer::class)
public class InlineV1TreasuryInboundTransfersPostRequestFormX19ee4a8a(
    /**
     * Amount (in cents) to be transferred.
     */
    public val amount: Int,
    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
     * [supported currency](https://stripe.com/docs/currencies).
     */
    public val currency: String,
    /**
     * The FinancialAccount to send funds to.
     */
    public val financialAccount: String,
    /**
     * The origin payment method to be debited for the InboundTransfer.
     */
    public val originPaymentMethod: String,
    /**
     * An arbitrary string attached to the object. Often useful for displaying to users.
     */
    public val description: String? = null,
    /**
     * Specifies which fields in the response should be expanded.
     */
    public val expand: List<String>? = null,
    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
     * for storing additional information about the object in a structured format. Individual keys can be unset by posting
     * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public val metadata: Map<String, String>? = null,
    /**
     * The complete description that appears on your customers' statements. Maximum 10 characters. Can only include
     * -#.$&*, spaces, and alphanumeric characters.
     */
    public val statementDescriptor: String? = null,
) {
    public class Builder {
        private var amountValue: Int? = null

        public var amount: Int
            get() = requireNotNull(amountValue) { "amount is required" }
            set(`value`) {
                amountValue = value
            }

        private var currencyValue: String? = null

        public var currency: String
            get() = requireNotNull(currencyValue) { "currency is required" }
            set(`value`) {
                currencyValue = value
            }

        private var financialAccountValue: String? = null

        public var financialAccount: String
            get() = requireNotNull(financialAccountValue) { "financialAccount is required" }
            set(`value`) {
                financialAccountValue = value
            }

        private var originPaymentMethodValue: String? = null

        public var originPaymentMethod: String
            get() = requireNotNull(originPaymentMethodValue) { "originPaymentMethod is required" }
            set(`value`) {
                originPaymentMethodValue = value
            }

        /**
         * An arbitrary string attached to the object. Often useful for displaying to users.
         */
        public var description: String? = null

        /**
         * Specifies which fields in the response should be expanded.
         */
        public var expand: List<String>? = null

        /**
         * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
         * useful for storing additional information about the object in a structured format. Individual keys can be unset
         * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
         */
        public var metadata: Map<String, String>? = null

        /**
         * The complete description that appears on your customers' statements. Maximum 10 characters. Can only include
         * -#.$&*, spaces, and alphanumeric characters.
         */
        public var statementDescriptor: String? = null

        public fun build(): InlineV1TreasuryInboundTransfersPostRequestFormX19ee4a8a {
            check(amountValue != null) { "amount is required" }
            check(currencyValue != null) { "currency is required" }
            check(financialAccountValue != null) { "financialAccount is required" }
            check(originPaymentMethodValue != null) { "originPaymentMethod is required" }
            return InlineV1TreasuryInboundTransfersPostRequestFormX19ee4a8a(
                amount = amount,
                currency = currency,
                financialAccount = financialAccount,
                originPaymentMethod = originPaymentMethod,
                description = description,
                expand = expand,
                metadata = metadata,
                statementDescriptor = statementDescriptor,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1TreasuryInboundTransfersPostRequestFormX19ee4a8a =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TreasuryInboundTransfersPostRequestFormX19ee4a8a> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1TreasuryInboundTransfersPostRequestFormX19ee4a8a {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1TreasuryInboundTransfersPostRequestFormX19ee4a8a")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TreasuryInboundTransfersPostRequestFormX19ee4a8a must be a JSON object",
                    )
            val amount = json.decodeRequired<Int>(rawObject, "amount")
            val currency = json.decodeRequired<String>(rawObject, "currency")
            val financialAccount = json.decodeRequired<String>(rawObject, "financial_account")
            val originPaymentMethod = json.decodeRequired<String>(rawObject, "origin_payment_method")
            return InlineV1TreasuryInboundTransfersPostRequestFormX19ee4a8a(
                amount = amount,
                currency = currency,
                financialAccount = financialAccount,
                originPaymentMethod = originPaymentMethod,
                description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
                metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
                statementDescriptor = rawObject["statement_descriptor"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TreasuryInboundTransfersPostRequestFormX19ee4a8a,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1TreasuryInboundTransfersPostRequestFormX19ee4a8a")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("amount", json.encodeToJsonElement(value.amount))
                    put("currency", value.currency)
                    put("financial_account", value.financialAccount)
                    put("origin_payment_method", value.originPaymentMethod)
                    value.description?.let { put("description", it) }
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                    value.statementDescriptor?.let { put("statement_descriptor", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TreasuryInboundTransfersPostRequestFormX19ee4a8a(
    block: InlineV1TreasuryInboundTransfersPostRequestFormX19ee4a8a.Builder.() -> Unit,
): InlineV1TreasuryInboundTransfersPostRequestFormX19ee4a8a =
    InlineV1TreasuryInboundTransfersPostRequestFormX19ee4a8a.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1TreasuryInboundTransfersPostRequestFormX19ee4a8a is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
