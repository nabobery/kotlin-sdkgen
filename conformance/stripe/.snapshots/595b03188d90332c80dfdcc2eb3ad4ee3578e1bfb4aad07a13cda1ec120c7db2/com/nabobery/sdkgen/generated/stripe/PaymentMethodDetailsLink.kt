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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_link
 */
@Serializable(with = PaymentMethodDetailsLink.Serializer::class)
public class PaymentMethodDetailsLink(
    /**
     * Two-letter ISO code representing the funding source country beneath the Link payment.
     * You could use this attribute to get a sense of international fees.
     */
    public val country: String? = null,
) {
    public class Builder {
        /**
         * Two-letter ISO code representing the funding source country beneath the Link payment.
         * You could use this attribute to get a sense of international fees.
         */
        public var country: String? = null

        public fun build(): PaymentMethodDetailsLink =
            PaymentMethodDetailsLink(
                country = country,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentMethodDetailsLink = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentMethodDetailsLink> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentMethodDetailsLink {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsLink")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentMethodDetailsLink must be a JSON object")
            return PaymentMethodDetailsLink(
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
            `value`: PaymentMethodDetailsLink,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsLink")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.country?.let { put("country", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentMethodDetailsLink(block: PaymentMethodDetailsLink.Builder.() -> Unit): PaymentMethodDetailsLink =
    PaymentMethodDetailsLink.build(block)
