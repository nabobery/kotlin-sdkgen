package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_naver_pay
 */
@Serializable(with = PaymentMethodNaverPay.Serializer::class)
public class PaymentMethodNaverPay(
    /**
     * Whether to fund this transaction with Naver Pay points or a card.
     */
    public val funding: InlinePaymentMethodNaverPayFundingX4eb0b779,
    /**
     * Uniquely identifies this particular Naver Pay account. You can use this attribute to check whether two Naver Pay
     * accounts are the same.
     */
    public val buyerId: String? = null,
) {
    public class Builder {
        private var fundingValue: InlinePaymentMethodNaverPayFundingX4eb0b779? = null

        public var funding: InlinePaymentMethodNaverPayFundingX4eb0b779
            get() = requireNotNull(fundingValue) { "funding is required" }
            set(`value`) {
                fundingValue = value
            }

        /**
         * Uniquely identifies this particular Naver Pay account. You can use this attribute to check whether two Naver Pay
         * accounts are the same.
         */
        public var buyerId: String? = null

        public fun build(): PaymentMethodNaverPay {
            check(fundingValue != null) { "funding is required" }
            return PaymentMethodNaverPay(
                funding = funding,
                buyerId = buyerId,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentMethodNaverPay = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentMethodNaverPay> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentMethodNaverPay {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodNaverPay")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentMethodNaverPay must be a JSON object")
            val funding = json.decodeRequired<InlinePaymentMethodNaverPayFundingX4eb0b779>(rawObject, "funding")
            return PaymentMethodNaverPay(
                funding = funding,
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
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentMethodNaverPay,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodNaverPay")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("funding", json.encodeToJsonElement(value.funding))
                    value.buyerId?.let { put("buyer_id", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentMethodNaverPay(block: PaymentMethodNaverPay.Builder.() -> Unit): PaymentMethodNaverPay =
    PaymentMethodNaverPay.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name] ?: throw SerializationException("PaymentMethodNaverPay is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
