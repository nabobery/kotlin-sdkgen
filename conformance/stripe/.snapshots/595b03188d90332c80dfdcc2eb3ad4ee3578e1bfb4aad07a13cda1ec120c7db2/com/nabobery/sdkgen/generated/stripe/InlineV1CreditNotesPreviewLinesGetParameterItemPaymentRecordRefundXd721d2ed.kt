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
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes~1preview~1lines/get/parameters/14/schema/items/properties/paym
 * ent_record_refund.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes~1preview~1lines/get/parameters/14/schema/items/properties/paym
 * ent_record_refund
 */
@Serializable(with = InlineV1CreditNotesPreviewLinesGetParameterItemPaymentRecordRefundXd721d2ed.Serializer::class)
public class InlineV1CreditNotesPreviewLinesGetParameterItemPaymentRecordRefundXd721d2ed(
    public val paymentRecord: String,
    public val refundGroup: String,
) {
    public class Builder {
        private var paymentRecordValue: String? = null

        public var paymentRecord: String
            get() = requireNotNull(paymentRecordValue) { "paymentRecord is required" }
            set(`value`) {
                paymentRecordValue = value
            }

        private var refundGroupValue: String? = null

        public var refundGroup: String
            get() = requireNotNull(refundGroupValue) { "refundGroup is required" }
            set(`value`) {
                refundGroupValue = value
            }

        public fun build(): InlineV1CreditNotesPreviewLinesGetParameterItemPaymentRecordRefundXd721d2ed {
            check(paymentRecordValue != null) { "paymentRecord is required" }
            check(refundGroupValue != null) { "refundGroup is required" }
            return InlineV1CreditNotesPreviewLinesGetParameterItemPaymentRecordRefundXd721d2ed(
                paymentRecord = paymentRecord,
                refundGroup = refundGroup,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1CreditNotesPreviewLinesGetParameterItemPaymentRecordRefundXd721d2ed = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CreditNotesPreviewLinesGetParameterItemPaymentRecordRefundXd721d2ed> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CreditNotesPreviewLinesGetParameterItemPaymentRecordRefundXd721d2ed {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CreditNotesPreviewLinesGetParameterItemPaymentRecordRefundXd721d2ed",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CreditNotesPreviewLinesGetParameterItemPaymentRecordRefundXd721d2ed must be a JSON object",
                    )
            val paymentRecord = json.decodeRequired<String>(rawObject, "payment_record")
            val refundGroup = json.decodeRequired<String>(rawObject, "refund_group")
            return InlineV1CreditNotesPreviewLinesGetParameterItemPaymentRecordRefundXd721d2ed(
                paymentRecord = paymentRecord,
                refundGroup = refundGroup,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CreditNotesPreviewLinesGetParameterItemPaymentRecordRefundXd721d2ed,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1CreditNotesPreviewLinesGetParameterItemPaymentRecordRefundXd721d2ed",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("payment_record", value.paymentRecord)
                    put("refund_group", value.refundGroup)
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1CreditNotesPreviewLinesGetParameterItemPaymentRecordRefundXd721d2ed(
    block: InlineV1CreditNotesPreviewLinesGetParameterItemPaymentRecordRefundXd721d2ed.Builder.() -> Unit,
): InlineV1CreditNotesPreviewLinesGetParameterItemPaymentRecordRefundXd721d2ed =
    InlineV1CreditNotesPreviewLinesGetParameterItemPaymentRecordRefundXd721d2ed.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1CreditNotesPreviewLinesGetParameterItemPaymentRecordRefundXd721d2ed is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
