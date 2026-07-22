package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1{id}~1report_payment_attempt_informational/post/requestBod
 * y/content/application~1x-www-form-urlencoded/schema/properties/shipping_details/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1{id}~1report_payment_attempt_informational/post/requestBod
 * y/content/application~1x-www-form-urlencoded/schema/properties/shipping_details/anyOf/0
 */
@Serializable(with = InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf1X1d075e21.Serializer::class)
public class InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf1X1d075e21(
    public val address: InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAddressX3f16f349? = null,
    public val name: String? = null,
    public val phone: String? = null,
) {
    public class Builder {
        public var address:
            InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAddressX3f16f349? = null

        public var name: String? = null

        public var phone: String? = null

        public fun build(): InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf1X1d075e21 =
            InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf1X1d075e21(
                address = address,
                name = name,
                phone = phone,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf1X1d075e21 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf1X1d075e21> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf1X1d075e21 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf1X1d075e21",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf1X1d075e21 must be a JSON object",
                    )
            return InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf1X1d075e21(
                address =
                    rawObject["address"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAddressX3f16f349>(
                                it,
                            )
                    },
                name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
                phone = rawObject["phone"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf1X1d075e21,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf1X1d075e21",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.address?.let { put("address", json.encodeToJsonElement(it)) }
                    value.name?.let { put("name", it) }
                    value.phone?.let { put("phone", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf1X1d075e21(
    block: InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf1X1d075e21.Builder.() -> Unit,
): InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf1X1d075e21 =
    InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf1X1d075e21.build(block)
