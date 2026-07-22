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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_cashapp
 */
@Serializable(with = PaymentMethodCashapp.Serializer::class)
public class PaymentMethodCashapp(
    /**
     * A unique and immutable identifier assigned by Cash App to every buyer.
     */
    public val buyerId: String? = null,
    /**
     * A public identifier for buyers using Cash App.
     */
    public val cashtag: String? = null,
) {
    public class Builder {
        /**
         * A unique and immutable identifier assigned by Cash App to every buyer.
         */
        public var buyerId: String? = null

        /**
         * A public identifier for buyers using Cash App.
         */
        public var cashtag: String? = null

        public fun build(): PaymentMethodCashapp =
            PaymentMethodCashapp(
                buyerId = buyerId,
                cashtag = cashtag,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentMethodCashapp = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentMethodCashapp> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentMethodCashapp {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodCashapp")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentMethodCashapp must be a JSON object")
            return PaymentMethodCashapp(
                buyerId =
                    rawObject["buyer_id"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                cashtag =
                    rawObject["cashtag"]?.let { element ->
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
            `value`: PaymentMethodCashapp,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodCashapp")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.buyerId?.let { put("buyer_id", it) }
                    value.cashtag?.let { put("cashtag", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentMethodCashapp(block: PaymentMethodCashapp.Builder.() -> Unit): PaymentMethodCashapp =
    PaymentMethodCashapp.build(block)
