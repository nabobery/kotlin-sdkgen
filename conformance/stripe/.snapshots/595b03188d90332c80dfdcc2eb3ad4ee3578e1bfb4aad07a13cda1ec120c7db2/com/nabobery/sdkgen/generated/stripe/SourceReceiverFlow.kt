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
 * Source: sdkgen://source/openapi.json#/components/schemas/source_receiver_flow
 */
@Serializable(with = SourceReceiverFlow.Serializer::class)
public class SourceReceiverFlow(
    /**
     * The total amount that was moved to your balance. This is almost always equal to the amount charged. In rare cases
     * when customers deposit excess funds and we are unable to refund those, those funds get moved to your balance and
     * show up in amount_charged as well. The amount charged is expressed in the source's currency.
     */
    public val amountCharged: Int,
    /**
     * The total amount received by the receiver source. `amount_received = amount_returned + amount_charged` should be
     * true for consumed sources unless customers deposit excess funds. The amount received is expressed in the source's
     * currency.
     */
    public val amountReceived: Int,
    /**
     * The total amount that was returned to the customer. The amount returned is expressed in the source's currency.
     */
    public val amountReturned: Int,
    /**
     * Type of refund attribute method, one of `email`, `manual`, or `none`.
     */
    public val refundAttributesMethod: String,
    /**
     * Type of refund attribute status, one of `missing`, `requested`, or `available`.
     */
    public val refundAttributesStatus: String,
    /**
     * The address of the receiver source. This is the value that should be communicated to the customer to send their
     * funds to.
     */
    public val address: String? = null,
) {
    public class Builder {
        private var amountChargedValue: Int? = null

        public var amountCharged: Int
            get() = requireNotNull(amountChargedValue) { "amountCharged is required" }
            set(`value`) {
                amountChargedValue = value
            }

        private var amountReceivedValue: Int? = null

        public var amountReceived: Int
            get() = requireNotNull(amountReceivedValue) { "amountReceived is required" }
            set(`value`) {
                amountReceivedValue = value
            }

        private var amountReturnedValue: Int? = null

        public var amountReturned: Int
            get() = requireNotNull(amountReturnedValue) { "amountReturned is required" }
            set(`value`) {
                amountReturnedValue = value
            }

        private var refundAttributesMethodValue: String? = null

        public var refundAttributesMethod: String
            get() = requireNotNull(refundAttributesMethodValue) { "refundAttributesMethod is required" }
            set(`value`) {
                refundAttributesMethodValue = value
            }

        private var refundAttributesStatusValue: String? = null

        public var refundAttributesStatus: String
            get() = requireNotNull(refundAttributesStatusValue) { "refundAttributesStatus is required" }
            set(`value`) {
                refundAttributesStatusValue = value
            }

        /**
         * The address of the receiver source. This is the value that should be communicated to the customer to send their
         * funds to.
         */
        public var address: String? = null

        public fun build(): SourceReceiverFlow {
            check(amountChargedValue != null) { "amountCharged is required" }
            check(amountReceivedValue != null) { "amountReceived is required" }
            check(amountReturnedValue != null) { "amountReturned is required" }
            check(refundAttributesMethodValue != null) { "refundAttributesMethod is required" }
            check(refundAttributesStatusValue != null) { "refundAttributesStatus is required" }
            return SourceReceiverFlow(
                amountCharged = amountCharged,
                amountReceived = amountReceived,
                amountReturned = amountReturned,
                refundAttributesMethod = refundAttributesMethod,
                refundAttributesStatus = refundAttributesStatus,
                address = address,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): SourceReceiverFlow = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<SourceReceiverFlow> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): SourceReceiverFlow {
            val jsonDecoder = decoder.requireJsonDecoder("SourceReceiverFlow")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("SourceReceiverFlow must be a JSON object")
            val amountCharged = json.decodeRequired<Int>(rawObject, "amount_charged")
            val amountReceived = json.decodeRequired<Int>(rawObject, "amount_received")
            val amountReturned = json.decodeRequired<Int>(rawObject, "amount_returned")
            val refundAttributesMethod = json.decodeRequired<String>(rawObject, "refund_attributes_method")
            val refundAttributesStatus = json.decodeRequired<String>(rawObject, "refund_attributes_status")
            return SourceReceiverFlow(
                amountCharged = amountCharged,
                amountReceived = amountReceived,
                amountReturned = amountReturned,
                refundAttributesMethod = refundAttributesMethod,
                refundAttributesStatus = refundAttributesStatus,
                address =
                    rawObject["address"]?.let { element ->
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
            `value`: SourceReceiverFlow,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("SourceReceiverFlow")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("amount_charged", json.encodeToJsonElement(value.amountCharged))
                    put("amount_received", json.encodeToJsonElement(value.amountReceived))
                    put("amount_returned", json.encodeToJsonElement(value.amountReturned))
                    put("refund_attributes_method", value.refundAttributesMethod)
                    put("refund_attributes_status", value.refundAttributesStatus)
                    value.address?.let { put("address", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun sourceReceiverFlow(block: SourceReceiverFlow.Builder.() -> Unit): SourceReceiverFlow =
    SourceReceiverFlow.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name] ?: throw SerializationException("SourceReceiverFlow is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
