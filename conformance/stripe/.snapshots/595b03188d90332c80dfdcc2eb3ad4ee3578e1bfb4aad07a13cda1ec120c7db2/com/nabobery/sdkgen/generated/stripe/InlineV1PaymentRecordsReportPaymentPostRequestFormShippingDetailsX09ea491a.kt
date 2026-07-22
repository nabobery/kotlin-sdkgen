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
 * Shipping information for this payment.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1report_payment/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema/properties/shipping_details
 */
@Serializable(with = InlineV1PaymentRecordsReportPaymentPostRequestFormShippingDetailsX09ea491a.Serializer::class)
public class InlineV1PaymentRecordsReportPaymentPostRequestFormShippingDetailsX09ea491a(
    public val address: InlineV1PaymentRecordsRepo134dPostRequestFormShippingDetailsAddressXd5bdb5c8? = null,
    public val name: String? = null,
    public val phone: String? = null,
) {
    public class Builder {
        public var address:
            InlineV1PaymentRecordsRepo134dPostRequestFormShippingDetailsAddressXd5bdb5c8? = null

        public var name: String? = null

        public var phone: String? = null

        public fun build(): InlineV1PaymentRecordsReportPaymentPostRequestFormShippingDetailsX09ea491a =
            InlineV1PaymentRecordsReportPaymentPostRequestFormShippingDetailsX09ea491a(
                address = address,
                name = name,
                phone = phone,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentRecordsReportPaymentPostRequestFormShippingDetailsX09ea491a = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentRecordsReportPaymentPostRequestFormShippingDetailsX09ea491a> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentRecordsReportPaymentPostRequestFormShippingDetailsX09ea491a {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentRecordsReportPaymentPostRequestFormShippingDetailsX09ea491a",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentRecordsReportPaymentPostRequestFormShippingDetailsX09ea491a must be a JSON object",
                    )
            return InlineV1PaymentRecordsReportPaymentPostRequestFormShippingDetailsX09ea491a(
                address =
                    rawObject["address"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentRecordsRepo134dPostRequestFormShippingDetailsAddressXd5bdb5c8>(
                                it,
                            )
                    },
                name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
                phone = rawObject["phone"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentRecordsReportPaymentPostRequestFormShippingDetailsX09ea491a,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentRecordsReportPaymentPostRequestFormShippingDetailsX09ea491a",
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

public fun inlineV1PaymentRecordsReportPaymentPostRequestFormShippingDetailsX09ea491a(
    block: InlineV1PaymentRecordsReportPaymentPostRequestFormShippingDetailsX09ea491a.Builder.() -> Unit,
): InlineV1PaymentRecordsReportPaymentPostRequestFormShippingDetailsX09ea491a =
    InlineV1PaymentRecordsReportPaymentPostRequestFormShippingDetailsX09ea491a.build(block)
