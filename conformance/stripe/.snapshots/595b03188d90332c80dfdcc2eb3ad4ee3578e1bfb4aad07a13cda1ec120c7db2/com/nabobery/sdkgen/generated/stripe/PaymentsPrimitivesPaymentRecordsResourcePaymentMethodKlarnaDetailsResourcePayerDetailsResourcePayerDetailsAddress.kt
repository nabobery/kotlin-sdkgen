package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

@Serializable
public data class PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetailsResourcePayerDetailsAddressView(
    public val country: String? = null,
)

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payments_primitives_payment_records_resource_payment_method_klarna_d
 * etails_resource_payer_details_resource_payer_details_address
 */
@Serializable(
    with = PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetailsResourcePayerDetailsAddress.Serializer::class,
)
public class PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetailsResourcePayerDetailsAddress(
    /**
     * The payer address country
     */
    public val country: String? = null,
) {
    public class Builder {
        /**
         * The payer address country
         */
        public var country: String? = null

        public fun build(): PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetailsResourcePayerDetailsAddress =
            PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetailsResourcePayerDetailsAddress(
                country = country,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetailsResourcePayerDetailsAddress =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetailsResourcePayerDetailsAddress> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetailsResourcePayerDetailsAddress {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetailsResourcePayerDetailsAddress",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetailsResourcePayerDetailsAddress must be a JSON object",
                    )
            return PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetailsResourcePayerDetailsAddress(
                country =
                    rawObject["country"]?.let { element ->
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
            `value`:
                PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetailsResourcePayerDetailsAddress,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetailsResourcePayerDetailsAddress",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.country?.let { put("country", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetailsResourcePayerDetailsAddress(
    block:
        PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetailsResourcePayerDetailsAddress.Builder.() -> Unit,
): PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetailsResourcePayerDetailsAddress =
    PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetailsResourcePayerDetailsAddress
        .build(
            block,
        )
