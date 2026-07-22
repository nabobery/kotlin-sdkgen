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
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 * Customer information for this payment.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1{id}~1report_payment_attempt_informational/post/requestBod
 * y/content/application~1x-www-form-urlencoded/schema/properties/customer_details
 */
@Serializable(with = InlineV1PaymentRecordsRepo6844PostRequestFormCustomerDetailsX66a62ee5.Serializer::class)
public class InlineV1PaymentRecordsRepo6844PostRequestFormCustomerDetailsX66a62ee5(
    public val customer: String? = null,
    public val email: String? = null,
    public val name: String? = null,
    public val phone: String? = null,
) {
    public class Builder {
        public var customer: String? = null

        public var email: String? = null

        public var name: String? = null

        public var phone: String? = null

        public fun build(): InlineV1PaymentRecordsRepo6844PostRequestFormCustomerDetailsX66a62ee5 =
            InlineV1PaymentRecordsRepo6844PostRequestFormCustomerDetailsX66a62ee5(
                customer = customer,
                email = email,
                name = name,
                phone = phone,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentRecordsRepo6844PostRequestFormCustomerDetailsX66a62ee5 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentRecordsRepo6844PostRequestFormCustomerDetailsX66a62ee5> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentRecordsRepo6844PostRequestFormCustomerDetailsX66a62ee5 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentRecordsRepo6844PostRequestFormCustomerDetailsX66a62ee5",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentRecordsRepo6844PostRequestFormCustomerDetailsX66a62ee5 must be a JSON object",
                    )
            return InlineV1PaymentRecordsRepo6844PostRequestFormCustomerDetailsX66a62ee5(
                customer = rawObject["customer"]?.let { json.decodeFromJsonElement<String>(it) },
                email = rawObject["email"]?.let { json.decodeFromJsonElement<String>(it) },
                name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
                phone = rawObject["phone"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentRecordsRepo6844PostRequestFormCustomerDetailsX66a62ee5,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentRecordsRepo6844PostRequestFormCustomerDetailsX66a62ee5",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.customer?.let { put("customer", it) }
                    value.email?.let { put("email", it) }
                    value.name?.let { put("name", it) }
                    value.phone?.let { put("phone", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentRecordsRepo6844PostRequestFormCustomerDetailsX66a62ee5(
    block: InlineV1PaymentRecordsRepo6844PostRequestFormCustomerDetailsX66a62ee5.Builder.() -> Unit,
): InlineV1PaymentRecordsRepo6844PostRequestFormCustomerDetailsX66a62ee5 =
    InlineV1PaymentRecordsRepo6844PostRequestFormCustomerDetailsX66a62ee5.build(block)
