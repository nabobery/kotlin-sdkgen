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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_upi
 */
@Serializable(with = PaymentMethodDetailsUpi.Serializer::class)
public class PaymentMethodDetailsUpi(
    /**
     * Customer's unique Virtual Payment Address.
     */
    public val vpa: String? = null,
) {
    public class Builder {
        /**
         * Customer's unique Virtual Payment Address.
         */
        public var vpa: String? = null

        public fun build(): PaymentMethodDetailsUpi =
            PaymentMethodDetailsUpi(
                vpa = vpa,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentMethodDetailsUpi = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentMethodDetailsUpi> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentMethodDetailsUpi {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsUpi")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentMethodDetailsUpi must be a JSON object")
            return PaymentMethodDetailsUpi(
                vpa =
                    rawObject["vpa"]?.let { element ->
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
            `value`: PaymentMethodDetailsUpi,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsUpi")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.vpa?.let { put("vpa", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentMethodDetailsUpi(block: PaymentMethodDetailsUpi.Builder.() -> Unit): PaymentMethodDetailsUpi =
    PaymentMethodDetailsUpi.build(block)
