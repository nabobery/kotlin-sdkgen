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
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_data/properties/payto.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_data/properties/payto
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPaytoXf7bd4599.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPaytoXf7bd4599(
    public val accountNumber: String? = null,
    public val bsbNumber: String? = null,
    public val payId: String? = null,
) {
    public class Builder {
        public var accountNumber: String? = null

        public var bsbNumber: String? = null

        public var payId: String? = null

        public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPaytoXf7bd4599 =
            InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPaytoXf7bd4599(
                accountNumber = accountNumber,
                bsbNumber = bsbNumber,
                payId = payId,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPaytoXf7bd4599 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPaytoXf7bd4599> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPaytoXf7bd4599 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPaytoXf7bd4599",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPaytoXf7bd4599 must be a JSON object",
                    )
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPaytoXf7bd4599(
                accountNumber = rawObject["account_number"]?.let { json.decodeFromJsonElement<String>(it) },
                bsbNumber = rawObject["bsb_number"]?.let { json.decodeFromJsonElement<String>(it) },
                payId = rawObject["pay_id"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPaytoXf7bd4599,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPaytoXf7bd4599",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.accountNumber?.let { put("account_number", it) }
                    value.bsbNumber?.let { put("bsb_number", it) }
                    value.payId?.let { put("pay_id", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodDataPaytoXf7bd4599(
    block: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPaytoXf7bd4599.Builder.() -> Unit,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPaytoXf7bd4599 =
    InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPaytoXf7bd4599.build(block)
