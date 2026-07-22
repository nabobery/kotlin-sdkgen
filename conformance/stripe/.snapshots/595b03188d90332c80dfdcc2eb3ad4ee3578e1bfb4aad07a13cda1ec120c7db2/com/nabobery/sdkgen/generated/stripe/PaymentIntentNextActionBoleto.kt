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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_next_action_boleto
 */
@Serializable(with = PaymentIntentNextActionBoleto.Serializer::class)
public class PaymentIntentNextActionBoleto(
    /**
     * The timestamp after which the boleto expires.
     */
    public val expiresAt: Int? = null,
    /**
     * The URL to the hosted boleto voucher page, which allows customers to view the boleto voucher.
     */
    public val hostedVoucherUrl: String? = null,
    /**
     * The boleto number.
     */
    public val number: String? = null,
    /**
     * The URL to the downloadable boleto voucher PDF.
     */
    public val pdf: String? = null,
) {
    public class Builder {
        /**
         * The timestamp after which the boleto expires.
         */
        public var expiresAt: Int? = null

        /**
         * The URL to the hosted boleto voucher page, which allows customers to view the boleto voucher.
         */
        public var hostedVoucherUrl: String? = null

        /**
         * The boleto number.
         */
        public var number: String? = null

        /**
         * The URL to the downloadable boleto voucher PDF.
         */
        public var pdf: String? = null

        public fun build(): PaymentIntentNextActionBoleto =
            PaymentIntentNextActionBoleto(
                expiresAt = expiresAt,
                hostedVoucherUrl = hostedVoucherUrl,
                number = number,
                pdf = pdf,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentIntentNextActionBoleto = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentIntentNextActionBoleto> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentIntentNextActionBoleto {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentIntentNextActionBoleto")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentIntentNextActionBoleto must be a JSON object")
            return PaymentIntentNextActionBoleto(
                expiresAt =
                    rawObject["expires_at"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
                hostedVoucherUrl =
                    rawObject["hosted_voucher_url"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                number =
                    rawObject["number"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                pdf =
                    rawObject["pdf"]?.let { element ->
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
            `value`: PaymentIntentNextActionBoleto,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentIntentNextActionBoleto")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.expiresAt?.let { put("expires_at", json.encodeToJsonElement(it)) }
                    value.hostedVoucherUrl?.let { put("hosted_voucher_url", it) }
                    value.number?.let { put("number", it) }
                    value.pdf?.let { put("pdf", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentIntentNextActionBoleto(
    block: PaymentIntentNextActionBoleto.Builder.() -> Unit,
): PaymentIntentNextActionBoleto = PaymentIntentNextActionBoleto.build(block)
