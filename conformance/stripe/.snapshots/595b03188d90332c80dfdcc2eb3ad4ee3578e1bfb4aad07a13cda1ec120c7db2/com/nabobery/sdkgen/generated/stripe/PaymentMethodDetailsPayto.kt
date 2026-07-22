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

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_payto
 */
@Serializable(with = PaymentMethodDetailsPayto.Serializer::class)
public class PaymentMethodDetailsPayto(
    /**
     * Bank-State-Branch number of the bank account.
     */
    public val bsbNumber: String? = null,
    /**
     * Last four digits of the bank account number.
     */
    public val last4: String? = null,
    /**
     * ID of the mandate used to make this payment.
     */
    public val mandate: String? = null,
    /**
     * The PayID alias for the bank account.
     */
    public val payId: String? = null,
) {
    public class Builder {
        /**
         * Bank-State-Branch number of the bank account.
         */
        public var bsbNumber: String? = null

        /**
         * Last four digits of the bank account number.
         */
        public var last4: String? = null

        /**
         * ID of the mandate used to make this payment.
         */
        public var mandate: String? = null

        /**
         * The PayID alias for the bank account.
         */
        public var payId: String? = null

        public fun build(): PaymentMethodDetailsPayto =
            PaymentMethodDetailsPayto(
                bsbNumber = bsbNumber,
                last4 = last4,
                mandate = mandate,
                payId = payId,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentMethodDetailsPayto = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentMethodDetailsPayto> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentMethodDetailsPayto {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsPayto")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentMethodDetailsPayto must be a JSON object")
            return PaymentMethodDetailsPayto(
                bsbNumber =
                    rawObject["bsb_number"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                last4 =
                    rawObject["last4"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                mandate = rawObject["mandate"]?.let { json.decodeFromJsonElement<String>(it) },
                payId =
                    rawObject["pay_id"]?.let { element ->
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
            `value`: PaymentMethodDetailsPayto,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsPayto")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.bsbNumber?.let { put("bsb_number", it) }
                    value.last4?.let { put("last4", it) }
                    value.mandate?.let { put("mandate", it) }
                    value.payId?.let { put("pay_id", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentMethodDetailsPayto(block: PaymentMethodDetailsPayto.Builder.() -> Unit): PaymentMethodDetailsPayto =
    PaymentMethodDetailsPayto.build(block)
