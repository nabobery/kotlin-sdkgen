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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_multibanco
 */
@Serializable(with = PaymentMethodDetailsMultibanco.Serializer::class)
public class PaymentMethodDetailsMultibanco(
    /**
     * Entity number associated with this Multibanco payment.
     */
    public val entity: String? = null,
    /**
     * Reference number associated with this Multibanco payment.
     */
    public val reference: String? = null,
) {
    public class Builder {
        /**
         * Entity number associated with this Multibanco payment.
         */
        public var entity: String? = null

        /**
         * Reference number associated with this Multibanco payment.
         */
        public var reference: String? = null

        public fun build(): PaymentMethodDetailsMultibanco =
            PaymentMethodDetailsMultibanco(
                entity = entity,
                reference = reference,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentMethodDetailsMultibanco = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentMethodDetailsMultibanco> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentMethodDetailsMultibanco {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsMultibanco")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentMethodDetailsMultibanco must be a JSON object")
            return PaymentMethodDetailsMultibanco(
                entity =
                    rawObject["entity"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                reference =
                    rawObject["reference"]?.let { element ->
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
            `value`: PaymentMethodDetailsMultibanco,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsMultibanco")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.entity?.let { put("entity", it) }
                    value.reference?.let { put("reference", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentMethodDetailsMultibanco(
    block: PaymentMethodDetailsMultibanco.Builder.() -> Unit,
): PaymentMethodDetailsMultibanco = PaymentMethodDetailsMultibanco.build(block)
