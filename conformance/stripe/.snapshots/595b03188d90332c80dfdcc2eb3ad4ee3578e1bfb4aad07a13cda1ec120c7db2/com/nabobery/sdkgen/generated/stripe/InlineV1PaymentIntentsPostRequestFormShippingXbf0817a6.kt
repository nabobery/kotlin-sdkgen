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
import kotlin.String
import kotlin.Unit

/**
 * Shipping information for this PaymentIntent.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/shipping
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormShippingXbf0817a6.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormShippingXbf0817a6(
    public val address: InlineV1PaymentIntentsPostRequestFormShippingAddressX1edc3736,
    public val name: String,
    public val carrier: String? = null,
    public val phone: String? = null,
    public val trackingNumber: String? = null,
) {
    public class Builder {
        private var addressValue: InlineV1PaymentIntentsPostRequestFormShippingAddressX1edc3736? = null

        public var address: InlineV1PaymentIntentsPostRequestFormShippingAddressX1edc3736
            get() = requireNotNull(addressValue) { "address is required" }
            set(`value`) {
                addressValue = value
            }

        private var nameValue: String? = null

        public var name: String
            get() = requireNotNull(nameValue) { "name is required" }
            set(`value`) {
                nameValue = value
            }

        public var carrier: String? = null

        public var phone: String? = null

        public var trackingNumber: String? = null

        public fun build(): InlineV1PaymentIntentsPostRequestFormShippingXbf0817a6 {
            check(addressValue != null) { "address is required" }
            check(nameValue != null) { "name is required" }
            return InlineV1PaymentIntentsPostRequestFormShippingXbf0817a6(
                address = address,
                name = name,
                carrier = carrier,
                phone = phone,
                trackingNumber = trackingNumber,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormShippingXbf0817a6 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormShippingXbf0817a6> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormShippingXbf0817a6 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormShippingXbf0817a6")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsPostRequestFormShippingXbf0817a6 must be a JSON object",
                    )
            val address =
                json.decodeRequired<InlineV1PaymentIntentsPostRequestFormShippingAddressX1edc3736>(
                    rawObject,
                    "address",
                )
            val name = json.decodeRequired<String>(rawObject, "name")
            return InlineV1PaymentIntentsPostRequestFormShippingXbf0817a6(
                address = address,
                name = name,
                carrier = rawObject["carrier"]?.let { json.decodeFromJsonElement<String>(it) },
                phone = rawObject["phone"]?.let { json.decodeFromJsonElement<String>(it) },
                trackingNumber = rawObject["tracking_number"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormShippingXbf0817a6,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormShippingXbf0817a6")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("address", json.encodeToJsonElement(value.address))
                    put("name", value.name)
                    value.carrier?.let { put("carrier", it) }
                    value.phone?.let { put("phone", it) }
                    value.trackingNumber?.let { put("tracking_number", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentIntentsPostRequestFormShippingXbf0817a6(
    block: InlineV1PaymentIntentsPostRequestFormShippingXbf0817a6.Builder.() -> Unit,
): InlineV1PaymentIntentsPostRequestFormShippingXbf0817a6 =
    InlineV1PaymentIntentsPostRequestFormShippingXbf0817a6.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1PaymentIntentsPostRequestFormShippingXbf0817a6 is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
