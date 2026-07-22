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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_link
 */
@Serializable(with = PaymentMethodLink.Serializer::class)
public class PaymentMethodLink(
    /**
     * Account owner's email address.
     */
    public val email: String? = null,
) {
    public class Builder {
        /**
         * Account owner's email address.
         */
        public var email: String? = null

        public fun build(): PaymentMethodLink =
            PaymentMethodLink(
                email = email,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentMethodLink = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentMethodLink> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentMethodLink {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodLink")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentMethodLink must be a JSON object")
            return PaymentMethodLink(
                email =
                    rawObject["email"]?.let { element ->
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
            `value`: PaymentMethodLink,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodLink")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.email?.let { put("email", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentMethodLink(block: PaymentMethodLink.Builder.() -> Unit): PaymentMethodLink =
    PaymentMethodLink.build(block)
