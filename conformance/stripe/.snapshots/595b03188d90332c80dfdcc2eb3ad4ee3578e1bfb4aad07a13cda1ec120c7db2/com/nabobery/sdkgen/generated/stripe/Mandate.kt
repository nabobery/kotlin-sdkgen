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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

@Serializable
public data class MandateView(
    @SerialName("customer_acceptance")
    public val customerAcceptance: CustomerAcceptance,
    public val id: String,
    public val livemode: Boolean,
    @SerialName("multi_use")
    public val multiUse: MandateMultiUse? = null,
    @SerialName("object")
    public val objectValue: InlineMandateObjectValueXe9650d7d,
    @SerialName("on_behalf_of")
    public val onBehalfOf: String? = null,
    @SerialName("payment_method")
    public val paymentMethod: InlineMandatePaymentMethodX5006e80b,
    @SerialName("payment_method_details")
    public val paymentMethodDetails: MandatePaymentMethodDetails,
    @SerialName("single_use")
    public val singleUse: MandateSingleUse? = null,
    public val status: InlineMandateStatusX77cf439c,
    public val type: InlineMandateTypeX0a63be5f,
)

/**
 * A Mandate is a record of the permission that your customer gives you to debit their payment method.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/mandate
 */
@Serializable(with = Mandate.Serializer::class)
public class Mandate(
    public val customerAcceptance: CustomerAcceptance,
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
    public val objectValue: InlineMandateObjectValueXe9650d7d,
    /**
     * ID of the payment method associated with this mandate.
     */
    public val paymentMethod: InlineMandatePaymentMethodX5006e80b,
    public val paymentMethodDetails: MandatePaymentMethodDetails,
    /**
     * The mandate status indicates whether or not you can use it to initiate a payment.
     */
    public val status: InlineMandateStatusX77cf439c,
    /**
     * The type of the mandate.
     */
    public val type: InlineMandateTypeX0a63be5f,
    public val multiUse: MandateMultiUse? = null,
    /**
     * The account (if any) that the mandate is intended for.
     */
    public val onBehalfOf: String? = null,
    public val singleUse: MandateSingleUse? = null,
) {
    public class Builder {
        private var customerAcceptanceValue: CustomerAcceptance? = null

        public var customerAcceptance: CustomerAcceptance
            get() = requireNotNull(customerAcceptanceValue) { "customerAcceptance is required" }
            set(`value`) {
                customerAcceptanceValue = value
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

        private var objectValueValue: InlineMandateObjectValueXe9650d7d? = null

        public var objectValue: InlineMandateObjectValueXe9650d7d
            get() = requireNotNull(objectValueValue) { "objectValue is required" }
            set(`value`) {
                objectValueValue = value
            }

        private var paymentMethodValue: InlineMandatePaymentMethodX5006e80b? = null

        public var paymentMethod: InlineMandatePaymentMethodX5006e80b
            get() = requireNotNull(paymentMethodValue) { "paymentMethod is required" }
            set(`value`) {
                paymentMethodValue = value
            }

        private var paymentMethodDetailsValue: MandatePaymentMethodDetails? = null

        public var paymentMethodDetails: MandatePaymentMethodDetails
            get() = requireNotNull(paymentMethodDetailsValue) { "paymentMethodDetails is required" }
            set(`value`) {
                paymentMethodDetailsValue = value
            }

        private var statusValue: InlineMandateStatusX77cf439c? = null

        public var status: InlineMandateStatusX77cf439c
            get() = requireNotNull(statusValue) { "status is required" }
            set(`value`) {
                statusValue = value
            }

        private var typeValue: InlineMandateTypeX0a63be5f? = null

        public var type: InlineMandateTypeX0a63be5f
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        public var multiUse: MandateMultiUse? = null

        /**
         * The account (if any) that the mandate is intended for.
         */
        public var onBehalfOf: String? = null

        public var singleUse: MandateSingleUse? = null

        public fun build(): Mandate {
            check(customerAcceptanceValue != null) { "customerAcceptance is required" }
            check(idValue != null) { "id is required" }
            check(livemodeValue != null) { "livemode is required" }
            check(objectValueValue != null) { "objectValue is required" }
            check(paymentMethodValue != null) { "paymentMethod is required" }
            check(paymentMethodDetailsValue != null) { "paymentMethodDetails is required" }
            check(statusValue != null) { "status is required" }
            check(typeValue != null) { "type is required" }
            return Mandate(
                customerAcceptance = customerAcceptance,
                id = id,
                livemode = livemode,
                objectValue = objectValue,
                paymentMethod = paymentMethod,
                paymentMethodDetails = paymentMethodDetails,
                status = status,
                type = type,
                multiUse = multiUse,
                onBehalfOf = onBehalfOf,
                singleUse = singleUse,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): Mandate = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<Mandate> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): Mandate {
            val jsonDecoder = decoder.requireJsonDecoder("Mandate")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("Mandate must be a JSON object")
            val customerAcceptance = json.decodeRequired<CustomerAcceptance>(rawObject, "customer_acceptance")
            val id = json.decodeRequired<String>(rawObject, "id")
            val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
            val objectValue = json.decodeRequired<InlineMandateObjectValueXe9650d7d>(rawObject, "object")
            val paymentMethod = json.decodeRequired<InlineMandatePaymentMethodX5006e80b>(rawObject, "payment_method")
            val paymentMethodDetails =
                json.decodeRequired<MandatePaymentMethodDetails>(
                    rawObject,
                    "payment_method_details",
                )
            val status = json.decodeRequired<InlineMandateStatusX77cf439c>(rawObject, "status")
            val type = json.decodeRequired<InlineMandateTypeX0a63be5f>(rawObject, "type")
            return Mandate(
                customerAcceptance = customerAcceptance,
                id = id,
                livemode = livemode,
                objectValue = objectValue,
                paymentMethod = paymentMethod,
                paymentMethodDetails = paymentMethodDetails,
                status = status,
                type = type,
                multiUse = rawObject["multi_use"]?.let { json.decodeFromJsonElement<MandateMultiUse>(it) },
                onBehalfOf = rawObject["on_behalf_of"]?.let { json.decodeFromJsonElement<String>(it) },
                singleUse = rawObject["single_use"]?.let { json.decodeFromJsonElement<MandateSingleUse>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: Mandate,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("Mandate")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("customer_acceptance", json.encodeToJsonElement(value.customerAcceptance))
                    put("id", value.id)
                    put("livemode", json.encodeToJsonElement(value.livemode))
                    put("object", json.encodeToJsonElement(value.objectValue))
                    put("payment_method", json.encodeToJsonElement(value.paymentMethod))
                    put("payment_method_details", json.encodeToJsonElement(value.paymentMethodDetails))
                    put("status", json.encodeToJsonElement(value.status))
                    put("type", json.encodeToJsonElement(value.type))
                    value.multiUse?.let { put("multi_use", json.encodeToJsonElement(it)) }
                    value.onBehalfOf?.let { put("on_behalf_of", it) }
                    value.singleUse?.let { put("single_use", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun mandate(block: Mandate.Builder.() -> Unit): Mandate = Mandate.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element = raw[name] ?: throw SerializationException("Mandate is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
