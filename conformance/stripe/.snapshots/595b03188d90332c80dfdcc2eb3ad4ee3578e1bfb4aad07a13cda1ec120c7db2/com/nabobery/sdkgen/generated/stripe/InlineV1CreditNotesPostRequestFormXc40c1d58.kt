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
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes/post/requestBody/content/application~1x-www-form-urlencoded/sc
 * hema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes/post/requestBody/content/application~1x-www-form-urlencoded/sc
 * hema
 */
@Serializable(with = InlineV1CreditNotesPostRequestFormXc40c1d58.Serializer::class)
public class InlineV1CreditNotesPostRequestFormXc40c1d58(
    /**
     * ID of the invoice.
     */
    public val invoice: String,
    /**
     * The integer amount in cents (or local equivalent) representing the total amount of the credit note. One of
     * `amount`, `lines`, or `shipping_cost` must be provided.
     */
    public val amount: Int? = null,
    /**
     * The integer amount in cents (or local equivalent) representing the amount to credit the customer's balance, which
     * will be automatically applied to their next invoice.
     */
    public val creditAmount: Int? = null,
    /**
     * The date when this credit note is in effect. Same as `created` unless overwritten. When defined, this value
     * replaces the system-generated 'Date of issue' printed on the credit note PDF.
     */
    public val effectiveAt: Int? = null,
    /**
     * Type of email to send to the customer, one of `credit_note` or `none` and the default is `credit_note`.
     */
    public val emailType: InlineV1CreditNotesPostRequestFormEmailTypeX85727b78? = null,
    /**
     * Specifies which fields in the response should be expanded.
     */
    public val expand: List<String>? = null,
    /**
     * Line items that make up the credit note. One of `amount`, `lines`, or `shipping_cost` must be provided.
     */
    public val lines: List<InlineV1CreditNotesPostRequestFormLinesItemX77ab601b>? = null,
    /**
     * The credit note's memo appears on the credit note PDF.
     */
    public val memo: String? = null,
    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
     * for storing additional information about the object in a structured format. Individual keys can be unset by posting
     * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public val metadata: Map<String, String>? = null,
    /**
     * The integer amount in cents (or local equivalent) representing the amount that is credited outside of Stripe.
     */
    public val outOfBandAmount: Int? = null,
    /**
     * Reason for issuing this credit note, one of `duplicate`, `fraudulent`, `order_change`, or `product_unsatisfactory`
     */
    public val reason: InlineV1CreditNotesPostRequestFormReasonX90841925? = null,
    /**
     * The integer amount in cents (or local equivalent) representing the amount to refund. If set, a refund will be
     * created for the charge associated with the invoice.
     */
    public val refundAmount: Int? = null,
    /**
     * Refunds to link to this credit note.
     */
    public val refunds: List<InlineV1CreditNotesPostRequestFormRefundsItemX1217bf2d>? = null,
    /**
     * When shipping_cost contains the shipping_rate from the invoice, the shipping_cost is included in the credit note.
     * One of `amount`, `lines`, or `shipping_cost` must be provided.
     */
    public val shippingCost: InlineV1CreditNotesPostRequestFormShippingCostX8cdba8f5? = null,
) {
    public class Builder {
        private var invoiceValue: String? = null

        public var invoice: String
            get() = requireNotNull(invoiceValue) { "invoice is required" }
            set(`value`) {
                invoiceValue = value
            }

        /**
         * The integer amount in cents (or local equivalent) representing the total amount of the credit note. One of
         * `amount`, `lines`, or `shipping_cost` must be provided.
         */
        public var amount: Int? = null

        /**
         * The integer amount in cents (or local equivalent) representing the amount to credit the customer's balance, which
         * will be automatically applied to their next invoice.
         */
        public var creditAmount: Int? = null

        /**
         * The date when this credit note is in effect. Same as `created` unless overwritten. When defined, this value
         * replaces the system-generated 'Date of issue' printed on the credit note PDF.
         */
        public var effectiveAt: Int? = null

        /**
         * Type of email to send to the customer, one of `credit_note` or `none` and the default is `credit_note`.
         */
        public var emailType: InlineV1CreditNotesPostRequestFormEmailTypeX85727b78? = null

        /**
         * Specifies which fields in the response should be expanded.
         */
        public var expand: List<String>? = null

        /**
         * Line items that make up the credit note. One of `amount`, `lines`, or `shipping_cost` must be provided.
         */
        public var lines: List<InlineV1CreditNotesPostRequestFormLinesItemX77ab601b>? = null

        /**
         * The credit note's memo appears on the credit note PDF.
         */
        public var memo: String? = null

        /**
         * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
         * useful for storing additional information about the object in a structured format. Individual keys can be unset
         * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
         */
        public var metadata: Map<String, String>? = null

        /**
         * The integer amount in cents (or local equivalent) representing the amount that is credited outside of Stripe.
         */
        public var outOfBandAmount: Int? = null

        /**
         * Reason for issuing this credit note, one of `duplicate`, `fraudulent`, `order_change`, or
         * `product_unsatisfactory`
         */
        public var reason: InlineV1CreditNotesPostRequestFormReasonX90841925? = null

        /**
         * The integer amount in cents (or local equivalent) representing the amount to refund. If set, a refund will be
         * created for the charge associated with the invoice.
         */
        public var refundAmount: Int? = null

        /**
         * Refunds to link to this credit note.
         */
        public var refunds: List<InlineV1CreditNotesPostRequestFormRefundsItemX1217bf2d>? = null

        /**
         * When shipping_cost contains the shipping_rate from the invoice, the shipping_cost is included in the credit note.
         * One of `amount`, `lines`, or `shipping_cost` must be provided.
         */
        public var shippingCost: InlineV1CreditNotesPostRequestFormShippingCostX8cdba8f5? = null

        public fun build(): InlineV1CreditNotesPostRequestFormXc40c1d58 {
            check(invoiceValue != null) { "invoice is required" }
            return InlineV1CreditNotesPostRequestFormXc40c1d58(
                invoice = invoice,
                amount = amount,
                creditAmount = creditAmount,
                effectiveAt = effectiveAt,
                emailType = emailType,
                expand = expand,
                lines = lines,
                memo = memo,
                metadata = metadata,
                outOfBandAmount = outOfBandAmount,
                reason = reason,
                refundAmount = refundAmount,
                refunds = refunds,
                shippingCost = shippingCost,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1CreditNotesPostRequestFormXc40c1d58 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CreditNotesPostRequestFormXc40c1d58> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1CreditNotesPostRequestFormXc40c1d58 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1CreditNotesPostRequestFormXc40c1d58")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("InlineV1CreditNotesPostRequestFormXc40c1d58 must be a JSON object")
            val invoice = json.decodeRequired<String>(rawObject, "invoice")
            return InlineV1CreditNotesPostRequestFormXc40c1d58(
                invoice = invoice,
                amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
                creditAmount = rawObject["credit_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
                effectiveAt = rawObject["effective_at"]?.let { json.decodeFromJsonElement<Int>(it) },
                emailType =
                    rawObject["email_type"]?.let {
                        json.decodeFromJsonElement<InlineV1CreditNotesPostRequestFormEmailTypeX85727b78>(it)
                    },
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
                lines =
                    rawObject["lines"]?.let {
                        json.decodeFromJsonElement<List<InlineV1CreditNotesPostRequestFormLinesItemX77ab601b>>(it)
                    },
                memo = rawObject["memo"]?.let { json.decodeFromJsonElement<String>(it) },
                metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
                outOfBandAmount = rawObject["out_of_band_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
                reason =
                    rawObject["reason"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CreditNotesPostRequestFormReasonX90841925>(
                                it,
                            )
                    },
                refundAmount = rawObject["refund_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
                refunds =
                    rawObject["refunds"]?.let {
                        json.decodeFromJsonElement<List<InlineV1CreditNotesPostRequestFormRefundsItemX1217bf2d>>(it)
                    },
                shippingCost =
                    rawObject["shipping_cost"]?.let {
                        json.decodeFromJsonElement<InlineV1CreditNotesPostRequestFormShippingCostX8cdba8f5>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CreditNotesPostRequestFormXc40c1d58,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1CreditNotesPostRequestFormXc40c1d58")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("invoice", value.invoice)
                    value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
                    value.creditAmount?.let { put("credit_amount", json.encodeToJsonElement(it)) }
                    value.effectiveAt?.let { put("effective_at", json.encodeToJsonElement(it)) }
                    value.emailType?.let { put("email_type", json.encodeToJsonElement(it)) }
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                    value.lines?.let { put("lines", json.encodeToJsonElement(it)) }
                    value.memo?.let { put("memo", it) }
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                    value.outOfBandAmount?.let { put("out_of_band_amount", json.encodeToJsonElement(it)) }
                    value.reason?.let { put("reason", json.encodeToJsonElement(it)) }
                    value.refundAmount?.let { put("refund_amount", json.encodeToJsonElement(it)) }
                    value.refunds?.let { put("refunds", json.encodeToJsonElement(it)) }
                    value.shippingCost?.let { put("shipping_cost", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1CreditNotesPostRequestFormXc40c1d58(
    block: InlineV1CreditNotesPostRequestFormXc40c1d58.Builder.() -> Unit,
): InlineV1CreditNotesPostRequestFormXc40c1d58 = InlineV1CreditNotesPostRequestFormXc40c1d58.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1CreditNotesPostRequestFormXc40c1d58 is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
