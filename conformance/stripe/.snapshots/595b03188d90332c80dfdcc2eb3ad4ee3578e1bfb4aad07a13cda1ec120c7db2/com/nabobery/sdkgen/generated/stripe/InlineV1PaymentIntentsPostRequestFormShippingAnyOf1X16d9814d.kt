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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/shipping/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/shipping/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormShippingAnyOf1X16d9814d.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormShippingAnyOf1X16d9814d(
    public val address: InlineV1PaymentIntentsPostRequestFormShippingAnyOf1AddressX2e26039e,
    public val name: String,
    public val carrier: String? = null,
    public val phone: String? = null,
    public val trackingNumber: String? = null,
) {
    public class Builder {
        private var addressValue: InlineV1PaymentIntentsPostRequestFormShippingAnyOf1AddressX2e26039e? =
            null

        public var address: InlineV1PaymentIntentsPostRequestFormShippingAnyOf1AddressX2e26039e
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

        public fun build(): InlineV1PaymentIntentsPostRequestFormShippingAnyOf1X16d9814d {
            check(addressValue != null) { "address is required" }
            check(nameValue != null) { "name is required" }
            return InlineV1PaymentIntentsPostRequestFormShippingAnyOf1X16d9814d(
                address = address,
                name = name,
                carrier = carrier,
                phone = phone,
                trackingNumber = trackingNumber,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormShippingAnyOf1X16d9814d =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormShippingAnyOf1X16d9814d> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormShippingAnyOf1X16d9814d {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormShippingAnyOf1X16d9814d")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsPostRequestFormShippingAnyOf1X16d9814d must be a JSON object",
                    )
            val address =
                json.decodeRequired<InlineV1PaymentIntentsPostRequestFormShippingAnyOf1AddressX2e26039e>(
                    rawObject,
                    "address",
                )
            val name = json.decodeRequired<String>(rawObject, "name")
            return InlineV1PaymentIntentsPostRequestFormShippingAnyOf1X16d9814d(
                address = address,
                name = name,
                carrier = rawObject["carrier"]?.let { json.decodeFromJsonElement<String>(it) },
                phone = rawObject["phone"]?.let { json.decodeFromJsonElement<String>(it) },
                trackingNumber = rawObject["tracking_number"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormShippingAnyOf1X16d9814d,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormShippingAnyOf1X16d9814d")
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

public fun inlineV1PaymentIntentsPostRequestFormShippingAnyOf1X16d9814d(
    block: InlineV1PaymentIntentsPostRequestFormShippingAnyOf1X16d9814d.Builder.() -> Unit,
): InlineV1PaymentIntentsPostRequestFormShippingAnyOf1X16d9814d =
    InlineV1PaymentIntentsPostRequestFormShippingAnyOf1X16d9814d.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1PaymentIntentsPostRequestFormShippingAnyOf1X16d9814d is missing required property '" + name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
