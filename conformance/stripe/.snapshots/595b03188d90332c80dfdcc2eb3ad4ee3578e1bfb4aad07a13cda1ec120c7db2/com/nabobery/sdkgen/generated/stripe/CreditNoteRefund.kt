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
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/credit_note_refund
 */
@Serializable(with = CreditNoteRefund.Serializer::class)
public class CreditNoteRefund(
    /**
     * Amount of the refund that applies to this credit note, in cents (or local equivalent).
     */
    public val amountRefunded: Int,
    /**
     * ID of the refund.
     */
    public val refund: InlineCreditNoteRefundRefundXba063e78,
    /**
     * The PaymentRecord refund details associated with this credit note refund.
     */
    public val paymentRecordRefund: InlineCreditNoteRefundPaymentRecordRefundX09797674? = null,
    /**
     * Type of the refund, one of `refund` or `payment_record_refund`.
     */
    public val type: InlineCreditNoteRefundTypeXc2c9b186? = null,
) {
    public class Builder {
        private var amountRefundedValue: Int? = null

        public var amountRefunded: Int
            get() = requireNotNull(amountRefundedValue) { "amountRefunded is required" }
            set(`value`) {
                amountRefundedValue = value
            }

        private var refundValue: InlineCreditNoteRefundRefundXba063e78? = null

        public var refund: InlineCreditNoteRefundRefundXba063e78
            get() = requireNotNull(refundValue) { "refund is required" }
            set(`value`) {
                refundValue = value
            }

        /**
         * The PaymentRecord refund details associated with this credit note refund.
         */
        public var paymentRecordRefund: InlineCreditNoteRefundPaymentRecordRefundX09797674? = null

        /**
         * Type of the refund, one of `refund` or `payment_record_refund`.
         */
        public var type: InlineCreditNoteRefundTypeXc2c9b186? = null

        public fun build(): CreditNoteRefund {
            check(amountRefundedValue != null) { "amountRefunded is required" }
            check(refundValue != null) { "refund is required" }
            return CreditNoteRefund(
                amountRefunded = amountRefunded,
                refund = refund,
                paymentRecordRefund = paymentRecordRefund,
                type = type,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): CreditNoteRefund = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<CreditNoteRefund> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): CreditNoteRefund {
            val jsonDecoder = decoder.requireJsonDecoder("CreditNoteRefund")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("CreditNoteRefund must be a JSON object")
            val amountRefunded = json.decodeRequired<Int>(rawObject, "amount_refunded")
            val refund = json.decodeRequired<InlineCreditNoteRefundRefundXba063e78>(rawObject, "refund")
            return CreditNoteRefund(
                amountRefunded = amountRefunded,
                refund = refund,
                paymentRecordRefund =
                    rawObject["payment_record_refund"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineCreditNoteRefundPaymentRecordRefundX09797674?>(element)
                        }
                    },
                type =
                    rawObject["type"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineCreditNoteRefundTypeXc2c9b186?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: CreditNoteRefund,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("CreditNoteRefund")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("amount_refunded", json.encodeToJsonElement(value.amountRefunded))
                    put("refund", json.encodeToJsonElement(value.refund))
                    value.paymentRecordRefund?.let { put("payment_record_refund", json.encodeToJsonElement(it)) }
                    value.type?.let { put("type", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun creditNoteRefund(block: CreditNoteRefund.Builder.() -> Unit): CreditNoteRefund =
    CreditNoteRefund.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name] ?: throw SerializationException("CreditNoteRefund is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
